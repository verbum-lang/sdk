
#include <iostream>
#include <stdlib.h>

#include "antlr4-runtime.h"
#include "TLexer.h"
#include "TParser.h"
#include "TParserBaseVisitor.h"

using namespace verbum;
using namespace antlr4;

std::vector<char> buffer;
std::string currentFileName;

//
// Controle dos erros.
//
class MyParserErrorListener: public BaseErrorListener {
  void syntaxError(
      Recognizer *recognizer,
      Token *offendingSymbol,
      size_t line,
      size_t charPositionInLine,
      const std::string &msg,
      std::exception_ptr e)
  {
    // Verifica se é erro do ANTLR4 ou se é de origem da gramática.
    std::string message = msg;
    std::string search  = "internal:";
    std::size_t found   = message.find(search);

    if (found != std::string::npos) {
      message = "Custom error message.";
    }

    // Informações gerais.
    std::cout << " " << std::endl << std::endl;
    std::cout << " Filename: " << currentFileName << std::endl;
    std::cout << " Syntax error [" << line << "," << 
      charPositionInLine << "] -> " << message << std::endl << std::endl;
    
    // Imprime linhas do erro.
    size_t errorLineLimit = 10;
    size_t startErrorLines = 1;

    if (line > errorLineLimit)
      startErrorLines = line - errorLineLimit;

    std::string lineSize = std::to_string((int) startErrorLines);

    for (size_t a=startErrorLines; a<=line; a++)
      printSourceLine(a, lineSize.length());

    // Imprime apontador para caractere onde está o erro.
    std::string lnSz = std::to_string((int) line);
    size_t lastLineSize = ((lineSize.length() == lnSz.length()) ? 2 : 1) + lnSz.length() + 4;
    size_t size = charPositionInLine + lastLineSize;

    for (size_t a=0; a<size; a++)
      std::cout << ' ';
    std::cout << '^' << std::endl;

    for (size_t a=0; a<size; a++)
      std::cout << ' ';
    std::cout << '|' << std::endl;

    for (size_t a=0; a<size; a++)
      std::cout << ' ';
    std::cout << "`--> Syntax error: " << message << std::endl << std::endl;

    exit(0);
  }

  // Imprime linha do erro.
  void printSourceLine (size_t line, size_t sizeCh) {
    size_t counter = 1;
    std::string lineSize = std::to_string((int) line);

    std::cout << ((sizeCh == lineSize.length()) ? "  " : " ") << line << "  | ";

    for (auto i: buffer) {
      if (counter != line && i == '\n')
        counter++;
      else if (counter == line && i == '\n')
        break;
      else {
        if (counter == line) {
          if (i == '\v' || i == '\t')
            std::cout << ' ';
          else
            std::cout << i;
        }
      }
    }

    std::cout << std::endl;
  }
};

//
// Realiza acesso aos nodes da árvore sintática.
//
class  MyTParserBaseVisitor : public TParserBaseVisitor {
public:
  int tabCounter = 0;

  void ptab () {
    for (int a=0; a<tabCounter; a++)
      std::cout << "    ";
  }

  /*
  ** Importações: use.
  */
  antlrcpp::Any visitUseString(TParser::UseStringContext *ctx) {
    ptab();
    std::cout << "import [use]: " << ctx->getText() << std::endl;
    
    return visitChildren(ctx);
  }

  /*
  ** Variáveis e questões relacionadas aos valores de atribuição.
  */
  antlrcpp::Any visitVariableDefinition(TParser::VariableDefinitionContext *ctx) {
    std::string variableDataType = "";

    if (ctx->TypeSpec()) 
      variableDataType = ctx->TypeSpec()->getText();

    std::cout << "variable [" << ctx->Identifier()->getText() << "] ";
    std::cout << "[" << variableDataType << "] " << std::endl;
    
    tabCounter++;
    antlrcpp::Any result = visitChildren(ctx);
    tabCounter--;

    return result;
  }

  antlrcpp::Any visitGeneralValue(TParser::GeneralValueContext *ctx) {
    antlrcpp::Any result;
    bool nextNivel = false;
    std::string valueDataType = "";

    if (ctx->TypeSpec())
      valueDataType = ctx->TypeSpec()->getText();

    if (ctx->Identifier()) {
      ptab();
      std::cout << "[identifier] ";
      std::cout << "["<< valueDataType << "] ";
      std::cout << "- value: " << ctx->Identifier()->getText() << std::endl;
    } else if (ctx->String()) {
      ptab();
      std::cout << "[string] ";
      std::cout << "["<< valueDataType << "] ";
      std::cout << "- value: " << ctx->String()->getText() << std::endl;
    } else if (ctx->Integer()) {
      ptab();
      std::cout << "[integer] ";
      std::cout << "["<< valueDataType << "] ";
      std::cout << "- value: " << ctx->Integer()->getText() << std::endl;
    } else if (ctx->Float()) {
      ptab();
      std::cout << "[float/double] ";
      std::cout << "["<< valueDataType << "] ";
      std::cout << "- value: " << ctx->Float()->getText() << std::endl;
    } else if (ctx->Bool()) {
      ptab();
      std::cout << "[bool] ";
      std::cout << "["<< valueDataType << "] ";
      std::cout << "- value: " << ctx->Bool()->getText() << std::endl;
    } else if (ctx->indexArray()) {
      ptab();
      std::cout << "-> [index-array] " << std::endl;
      ptab();
      std::cout << "-> array elements:" << std::endl;
      nextNivel = true;
    } else if (ctx->associativeArray()) {
      ptab();
      std::cout << "[associative-array] " << std::endl;
      ptab();
      std::cout << "-> array elements:" << std::endl;
      nextNivel = true;
    } else if (ctx->operationBlock()) {
      ptab();
      std::cout << "-> [operation-block] " << std::endl;
      ptab();
      std::cout << "-> operation elements:" << std::endl;
      nextNivel = true;
    } else if (ctx->functionCall()) {
      ptab();

      // Método de objeto instanciado.
      if (ctx->functionCall()->Point()) {
        std::cout << "-> [obj-instance method-call] " << 
          ctx->functionCall()->Identifier()->getText() << 
          " -> " <<
          ctx->functionCall()->identifierB()->getText() << 
          std::endl;
      }

      // Método static.
      else if (ctx->functionCall()->TwoTwoPoint()) {
        std::cout << "-> [obj-static method-call] " << 
          ctx->functionCall()->Identifier()->getText() << 
          " -> " <<
          ctx->functionCall()->identifierB()->getText() << 
          std::endl;
      }

      // Função comum.
      else
        std::cout << "-> [function-call] " << ctx->functionCall()->Identifier()->getText() << std::endl;
      
      ptab();
      std::cout << "-> function params:" << std::endl;
      nextNivel = true;
    }

    if (nextNivel) {
      tabCounter++;
      result = visitChildren(ctx);
      tabCounter--;
    } else
      result = visitChildren(ctx);

    return result;
  }

  /*
  ** Controles relacionados ao array associativo.
  */
  antlrcpp::Any visitAssociativeArrayElements(TParser::AssociativeArrayElementsContext *ctx) {

    ptab();
    std::cout << "-> Associative array - member: " << 
      ctx
        ->Identifier()
        ->getText() << std::endl;

    return visitChildren(ctx);
  }

  /*
  ** Controla conjunto de operações delimitadas por parênteses.
  */
  antlrcpp::Any visitOperationValue(TParser::OperationValueContext *ctx) {
    std::string valueDataType = "";
    antlrcpp::Any result;
    bool block = false;
    
    if (ctx->TypeSpec())
      valueDataType = ctx->TypeSpec()->getText();

    if (ctx->operationBlock()) {
      block = true;

      ptab();
      std::cout << " ( " << std::endl;
      tabCounter++;

      result = visitChildren(ctx);

      tabCounter--;
      ptab();
      std::cout << " ) [" << valueDataType << "] " << std::endl;

      if (ctx->ArithmeticOperator()) {
        ptab();
        std::cout << " " << ctx->ArithmeticOperator()->getText() << " " << std::endl; 
      }

    } else {
      ptab();
      std::cout << " ";

      if (ctx->Identifier()) 
      {
        // Processa pré-incremento/decremento.
        if (ctx->firstIncDec())
          std::cout << " [pre -> "<< ctx->firstIncDec()->getText() <<"] ";

        // Processa pós-incremento/decremento.
        if (ctx->lastIncDec())
          std::cout << " [pos -> "<< ctx->lastIncDec()->getText() <<"] ";

        std::cout << ctx->Identifier()->getText() << std::endl;
      }
      
      else if (ctx->Integer()) {
        std::cout << ctx->Integer()->getText();
        std::cout << " [" << valueDataType << "] " << std::endl;
      }
      else if (ctx->Float()) {
        std::cout << ctx->Float()->getText();
        std::cout << " [" << valueDataType << "] " << std::endl;
      }
 
      else if (ctx->functionCall()) {
        // Método de objeto instanciado.
        if (ctx->functionCall()->Point()) {
          std::cout << "-> [obj-instance method-call] " << 
            ctx->functionCall()->Identifier()->getText() << 
            " -> " <<
            ctx->functionCall()->identifierB()->getText() << 
            std::endl;
        }

        // Método static.
        else if (ctx->functionCall()->TwoTwoPoint()) {
          std::cout << "-> [obj-static method-call] " << 
            ctx->functionCall()->Identifier()->getText() << 
            " -> " <<
            ctx->functionCall()->identifierB()->getText() << 
            std::endl;
        }

        // Função comum.
        else {
          std::cout << "-> [function-call] " << 
            ctx->functionCall()->Identifier()->getText() << std::endl;
        }

        ptab();
        std::cout << " function params: " << std::endl;
      }

      if (ctx->ArithmeticOperator()) {
        ptab();
        std::cout << " " << ctx->ArithmeticOperator()->getText() << " " << std::endl;
      }
    }

    if (!block)
      result = visitChildren(ctx);

    return result;
  }

  /*
  ** Controles relacionados as chamadas de funções pelo código.
  */

  antlrcpp::Any visitCallingFunction(TParser::CallingFunctionContext *ctx) {
    ptab();

    // Método de objeto instanciado.
    if (ctx->functionCall()->Point()) {
      std::cout << "-> [obj-instance method-call] " << 
        ctx->functionCall()->Identifier()->getText() << 
        " -> " <<
        ctx->functionCall()->identifierB()->getText() << 
        std::endl;
    }

    // Método static.
    else if (ctx->functionCall()->TwoTwoPoint()) {
      std::cout << "-> [obj-static method-call] " << 
        ctx->functionCall()->Identifier()->getText() << 
        " -> " <<
        ctx->functionCall()->identifierB()->getText() << 
        std::endl;
    }

    // Função comum.
    else {
      std::cout << "-> [function-call] " << 
        ctx->functionCall()->Identifier()->getText() << std::endl;
    }

    ptab();
    std::cout << "-> function-params: "<< std::endl;

    return visitChildren(ctx);
  }

  /*
  ** Condicionais.
  **
  ** Utilizar controles: 
  **    callingFunction - para detectar abertura com chamada de função.
  **    OpenBlock CloseBlock - para detectar bloco de código.
  **    blockElementsLimited - para detectar if concatenado.
  **
  ** Fazer sistema com flags para ir incrementando e decrementando de acordo com a abertura
  ** de bloco de código (modos acima), para assim identificar a hierarquia dos condicionais.
  */

  antlrcpp::Any visitIfConditions(TParser::IfConditionsContext *ctx) {
    ptab();
    std::cout << "-> [conditional-block : if]: " << 
      ctx->conditionalExpressionElements()->getText() << std::endl;
    ptab();
    std::cout << "-> conditional-elements:" << std::endl;

    //tabCounter++;
    antlrcpp::Any result = visitChildren(ctx);
    //tabCounter--;

    return result;
  }
  
  antlrcpp::Any visitElifConditions(TParser::ElifConditionsContext *ctx) {
    ptab();
    std::cout << "-> [conditional-block : elif]: " << 
      ctx->conditionalExpressionElements()->getText() << std::endl;
    ptab();
    std::cout << "-> conditional-elements:" << std::endl;

    //tabCounter++;
    antlrcpp::Any result = visitChildren(ctx);
    //tabCounter--;

    return result;
  }
  
  antlrcpp::Any visitElseConditions(TParser::ElseConditionsContext *ctx) {
    ptab();
    std::cout << "-> [conditional-block : else]: " << std::endl;
    ptab();
    std::cout << "-> conditional-elements:" << std::endl;
  
    //tabCounter++;
    antlrcpp::Any result = visitChildren(ctx);
    //tabCounter--;

    return result;
  }

  antlrcpp::Any visitConditionalExpressionElements(TParser::ConditionalExpressionElementsContext *ctx) {
    antlrcpp::Any result;

    if (ctx->Not()) {
      ptab();
      std::cout << " !" << std::endl;
    }

    return visitChildren(ctx);
  }

  antlrcpp::Any visitConditionExpBlock(TParser::ConditionExpBlockContext *ctx) {
    antlrcpp::Any result;

    if (ctx->OpenOp() && ctx->CloseOp()) {
      ptab();
      std::cout << " (" << std::endl;
      tabCounter++;

      result = visitChildren(ctx);

      tabCounter--;
      ptab();
      std::cout << " )" << std::endl;
    }
    
    else {
      result = visitChildren(ctx);

      if (ctx->AssignmentOperator()) {
        ptab();
        std::cout << " " <<
          ctx->AssignmentOperator()->getText() << std::endl;
      }
    }

    return result;
  }

  antlrcpp::Any visitConditionalExpValue(TParser::ConditionalExpValueContext *ctx) {
    std::string valueDataType = "";
    antlrcpp::Any result;
    bool block = false;
    
    if (ctx->TypeSpec())
      valueDataType = ctx->TypeSpec()->getText();

    if (ctx->operationBlock()) {
      block = true;

      ptab();
      std::cout << " ( " << std::endl;
      tabCounter++;

      result = visitChildren(ctx);

      tabCounter--;
      ptab();
      std::cout << " ) [" << valueDataType << "] " << std::endl;

      if (ctx->ArithmeticOperator()) {
        ptab();
        std::cout << " " << ctx->ArithmeticOperator()->getText() << " " << std::endl; 
      } else if (ctx->AssignmentOperator()) {
        ptab();
        std::cout << " " << ctx->AssignmentOperator()->getText() << " " << std::endl; 
      }

    } else {
      ptab();
      std::cout << " ";

      if (ctx->Identifier() && !ctx->functionCall()) 
      {
        // Processa pré-incremento/decremento.
        if (ctx->firstIncDec())
          std::cout << " [pre -> "<< ctx->firstIncDec()->getText() <<"] ";

        // Processa pós-incremento/decremento.
        if (ctx->lastIncDec())
          std::cout << " [pos -> "<< ctx->lastIncDec()->getText() <<"] ";

        std::cout << ctx->Identifier()->getText() << std::endl;
      }
      
      else if (ctx->Integer()) {
        std::cout << ctx->Integer()->getText();
        std::cout << " [" << valueDataType << "] " << std::endl;
      }
      else if (ctx->Float()) {
        std::cout << ctx->Float()->getText();
        std::cout << " [" << valueDataType << "] " << std::endl;
      }
 
      else if (ctx->functionCall()) {

        // Atribuição na operação.
        if (ctx->Identifier() && ctx->Attr()) {
          std::cout << ctx->Identifier()->getText() << std::endl;
          ptab();
          std::cout << " "<< ctx->Attr()->getText() << std::endl;
          ptab();
        }

        // Método de objeto instanciado.
        if (ctx->functionCall()->Point()) {
          std::cout << "-> [obj-instance method-call] " << 
            ctx->functionCall()->Identifier()->getText() << 
            " -> " <<
            ctx->functionCall()->identifierB()->getText();
        }

        // Método static.
        else if (ctx->functionCall()->TwoTwoPoint()) {
          std::cout << "-> [obj-static method-call] " << 
            ctx->functionCall()->Identifier()->getText() << 
            " -> " <<
            ctx->functionCall()->identifierB()->getText();
        }

        // Função comum.
        else {
          std::cout << "-> [function-call] " << 
            ctx->functionCall()->Identifier()->getText();
        }

        // Verifica especificação de tipo.
        if (ctx->TypeSpec())
          std::cout << " - typespec: " << ctx->TypeSpec()->getText();
        std::cout << std::endl;

        ptab();
        std::cout << " function params: " << std::endl;
      }

      if (ctx->ArithmeticOperator()) {
        ptab();
        std::cout << " " << ctx->ArithmeticOperator()->getText() << " " << std::endl;
      } else if (ctx->AssignmentOperator()) {
        ptab();
        std::cout << " " << ctx->AssignmentOperator()->getText() << " " << std::endl;
      }
    }

    if (!block)
      result = visitChildren(ctx);

    return result;
  }

};

int main(int argc, const char **argv) {

  // Verificações iniciais.
  char *filename = (char *) malloc(strlen(argv[1]) + 1);

  if (!filename) {
    std::cout << "Error alloc memory." << std::endl;
    exit(0);
  }

  memset(filename, 0x00, strlen(argv[1]) + 1);
  memcpy(filename, argv[1], strlen(argv[1]));

  std::ifstream f(filename);
  if (!f.good()) {
    std::cout << "Error open file" << std::endl;
    exit(0);
  }

  // Carrega path completo do arquivo. 
  char actualpath [PATH_MAX+1];
  realpath(filename, actualpath);
  currentFileName = std::string(actualpath);

  // Processa arquivo da syntax.
  std::cout << "\n+++++++++++++++++++++++++++" << std::endl;
  std::ifstream infile(filename);

  infile.seekg(0, infile.end);
  size_t length = infile.tellg();
  infile.seekg(0, infile.beg);

  if (length > 0) {
    buffer.resize(length);    
    infile.read(&buffer[0], length);
  }

  for (auto i: buffer)
    std::cout << i;
  std::cout << std::endl;

  // Processa tokens.
  std::cout << "\n+++++++++++++++++++++++++++" << std::endl;
  std::ifstream stream;
  stream.open(filename);
  
  MyParserErrorListener errorListner;
  ANTLRInputStream input(stream);
  TLexer lexer(&input);

  // Configura controle dos erros.
  lexer.removeErrorListeners();
  lexer.addErrorListener(&errorListner);
  
  CommonTokenStream tokens(&lexer);

  tokens.fill();
  for (auto token : tokens.getTokens()) {
    std::cout << token->toString() << std::endl;
  }

  TParser parser(&tokens);

  // Configura controle dos erros.
  parser.removeErrorListeners();
  parser.addErrorListener(&errorListner);

  // Acessa árvore sintática através de visitor.
  std::cout << "\n+++++++++++++++++++++++++++" << std::endl;

  MyTParserBaseVisitor visitor;
  TParser::MainContext* treeVisit = parser.main();
  visitor.visitMain(treeVisit);

  free(filename);
  return 0;
}


