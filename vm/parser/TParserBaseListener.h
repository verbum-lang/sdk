
// Generated from ./TParser.g4 by ANTLR 4.9.2

#pragma once


#include "antlr4-runtime.h"
#include "TParserListener.h"


namespace verbum {

/**
 * This class provides an empty implementation of TParserListener,
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
class  TParserBaseListener : public TParserListener {
public:

  virtual void enterMain(TParser::MainContext * /*ctx*/) override { }
  virtual void exitMain(TParser::MainContext * /*ctx*/) override { }

  virtual void enterSentences(TParser::SentencesContext * /*ctx*/) override { }
  virtual void exitSentences(TParser::SentencesContext * /*ctx*/) override { }

  virtual void enterStatements(TParser::StatementsContext * /*ctx*/) override { }
  virtual void exitStatements(TParser::StatementsContext * /*ctx*/) override { }

  virtual void enterBlockComments(TParser::BlockCommentsContext * /*ctx*/) override { }
  virtual void exitBlockComments(TParser::BlockCommentsContext * /*ctx*/) override { }

  virtual void enterBlockUse(TParser::BlockUseContext * /*ctx*/) override { }
  virtual void exitBlockUse(TParser::BlockUseContext * /*ctx*/) override { }

  virtual void enterUseValue(TParser::UseValueContext * /*ctx*/) override { }
  virtual void exitUseValue(TParser::UseValueContext * /*ctx*/) override { }

  virtual void enterUseString(TParser::UseStringContext * /*ctx*/) override { }
  virtual void exitUseString(TParser::UseStringContext * /*ctx*/) override { }

  virtual void enterBlockOop(TParser::BlockOopContext * /*ctx*/) override { }
  virtual void exitBlockOop(TParser::BlockOopContext * /*ctx*/) override { }

  virtual void enterInterfaceClass(TParser::InterfaceClassContext * /*ctx*/) override { }
  virtual void exitInterfaceClass(TParser::InterfaceClassContext * /*ctx*/) override { }

  virtual void enterInterfaceClassDefinition(TParser::InterfaceClassDefinitionContext * /*ctx*/) override { }
  virtual void exitInterfaceClassDefinition(TParser::InterfaceClassDefinitionContext * /*ctx*/) override { }

  virtual void enterInterfaceCodeBlock(TParser::InterfaceCodeBlockContext * /*ctx*/) override { }
  virtual void exitInterfaceCodeBlock(TParser::InterfaceCodeBlockContext * /*ctx*/) override { }

  virtual void enterFunctionCodeBlockElements(TParser::FunctionCodeBlockElementsContext * /*ctx*/) override { }
  virtual void exitFunctionCodeBlockElements(TParser::FunctionCodeBlockElementsContext * /*ctx*/) override { }

  virtual void enterIdentifierB(TParser::IdentifierBContext * /*ctx*/) override { }
  virtual void exitIdentifierB(TParser::IdentifierBContext * /*ctx*/) override { }

  virtual void enterBlockLiveTokens(TParser::BlockLiveTokensContext * /*ctx*/) override { }
  virtual void exitBlockLiveTokens(TParser::BlockLiveTokensContext * /*ctx*/) override { }


  virtual void enterEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void exitEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void visitTerminal(antlr4::tree::TerminalNode * /*node*/) override { }
  virtual void visitErrorNode(antlr4::tree::ErrorNode * /*node*/) override { }

};

}  // namespace verbum
