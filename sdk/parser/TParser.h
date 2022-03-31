
// Generated from ./TParser.g4 by ANTLR 4.9.2

#pragma once


#include "antlr4-runtime.h"


  #ifndef _WIN32
  #pragma GCC diagnostic ignored "-Wunused-parameter"
  #endif


namespace verbum {


class  TParser : public antlr4::Parser {
public:
  enum {
    Use = 1, Var = 2, If = 3, Elif = 4, Else = 5, Bool = 6, End = 7, Attr = 8, 
    Point = 9, TwoPoint = 10, TwoTwoPoint = 11, Separator = 12, OpenArIndex = 13, 
    CloseArIndex = 14, OpenBlock = 15, CloseBlock = 16, OpenOp = 17, CloseOp = 18, 
    ArithmeticOperator = 19, AssignmentOperator = 20, Not = 21, IncDecOperators = 22, 
    Identifier = 23, IDPrefix = 24, TypeSpec = 25, String = 26, Integer = 27, 
    Float = 28, Whitespace = 29, Newline = 30, Words = 31, BlockComment = 32, 
    LineComment = 33
  };

  enum {
    RuleMain = 0, RuleFileContent = 1, RuleSentence = 2, RuleLiveToken = 3, 
    RuleUse = 4, RuleUseValue = 5, RuleUseString = 6, RuleVariable = 7, 
    RuleVariableMembers = 8, RuleVariableDefinition = 9, RuleIndexArray = 10, 
    RuleIndexArrayElements = 11, RuleAssociativeArray = 12, RuleAssociativeArrayElements = 13, 
    RuleOperationBlock = 14, RuleOperationElements = 15, RuleOperationValue = 16, 
    RuleFirstIncDec = 17, RuleLastIncDec = 18, RuleCallingFunction = 19, 
    RuleFunctionCall = 20, RuleIdentifierB = 21, RuleFunctionCallParam = 22, 
    RuleFunctionCallParamElements = 23, RuleConditionalExpression = 24, 
    RuleConditionalExpressionElements = 25, RuleBlockElements = 26, RuleGeneralValue = 27
  };

  explicit TParser(antlr4::TokenStream *input);
  ~TParser();

  virtual std::string getGrammarFileName() const override;
  virtual const antlr4::atn::ATN& getATN() const override { return _atn; };
  virtual const std::vector<std::string>& getTokenNames() const override { return _tokenNames; }; // deprecated: use vocabulary instead.
  virtual const std::vector<std::string>& getRuleNames() const override;
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;


  class MainContext;
  class FileContentContext;
  class SentenceContext;
  class LiveTokenContext;
  class UseContext;
  class UseValueContext;
  class UseStringContext;
  class VariableContext;
  class VariableMembersContext;
  class VariableDefinitionContext;
  class IndexArrayContext;
  class IndexArrayElementsContext;
  class AssociativeArrayContext;
  class AssociativeArrayElementsContext;
  class OperationBlockContext;
  class OperationElementsContext;
  class OperationValueContext;
  class FirstIncDecContext;
  class LastIncDecContext;
  class CallingFunctionContext;
  class FunctionCallContext;
  class IdentifierBContext;
  class FunctionCallParamContext;
  class FunctionCallParamElementsContext;
  class ConditionalExpressionContext;
  class ConditionalExpressionElementsContext;
  class BlockElementsContext;
  class GeneralValueContext; 

  class  MainContext : public antlr4::ParserRuleContext {
  public:
    MainContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FileContentContext *fileContent();
    antlr4::tree::TerminalNode *EOF();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  MainContext* main();

  class  FileContentContext : public antlr4::ParserRuleContext {
  public:
    FileContentContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FileContentContext *fileContent();
    SentenceContext *sentence();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FileContentContext* fileContent();
  FileContentContext* fileContent(int precedence);
  class  SentenceContext : public antlr4::ParserRuleContext {
  public:
    SentenceContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    LiveTokenContext *liveToken();
    UseContext *use();
    VariableContext *variable();
    CallingFunctionContext *callingFunction();
    ConditionalExpressionContext *conditionalExpression();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  SentenceContext* sentence();

  class  LiveTokenContext : public antlr4::ParserRuleContext {
  public:
    LiveTokenContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Newline();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LiveTokenContext* liveToken();

  class  UseContext : public antlr4::ParserRuleContext {
  public:
    UseContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Use();
    UseValueContext *useValue();
    antlr4::tree::TerminalNode *End();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UseContext* use();

  class  UseValueContext : public antlr4::ParserRuleContext {
  public:
    UseValueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UseStringContext *useString();
    antlr4::tree::TerminalNode *Separator();
    UseValueContext *useValue();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UseValueContext* useValue();

  class  UseStringContext : public antlr4::ParserRuleContext {
  public:
    UseStringContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *String();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UseStringContext* useString();

  class  VariableContext : public antlr4::ParserRuleContext {
  public:
    VariableContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Var();
    VariableMembersContext *variableMembers();
    antlr4::tree::TerminalNode *End();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableContext* variable();

  class  VariableMembersContext : public antlr4::ParserRuleContext {
  public:
    VariableMembersContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    VariableDefinitionContext *variableDefinition();
    antlr4::tree::TerminalNode *Separator();
    VariableMembersContext *variableMembers();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableMembersContext* variableMembers();

  class  VariableDefinitionContext : public antlr4::ParserRuleContext {
  public:
    VariableDefinitionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *Attr();
    GeneralValueContext *generalValue();
    antlr4::tree::TerminalNode *TypeSpec();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableDefinitionContext* variableDefinition();

  class  IndexArrayContext : public antlr4::ParserRuleContext {
  public:
    IndexArrayContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *OpenArIndex();
    antlr4::tree::TerminalNode *CloseArIndex();
    IndexArrayElementsContext *indexArrayElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IndexArrayContext* indexArray();

  class  IndexArrayElementsContext : public antlr4::ParserRuleContext {
  public:
    IndexArrayElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    GeneralValueContext *generalValue();
    antlr4::tree::TerminalNode *Separator();
    IndexArrayElementsContext *indexArrayElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IndexArrayElementsContext* indexArrayElements();

  class  AssociativeArrayContext : public antlr4::ParserRuleContext {
  public:
    AssociativeArrayContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *OpenBlock();
    antlr4::tree::TerminalNode *CloseBlock();
    AssociativeArrayElementsContext *associativeArrayElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AssociativeArrayContext* associativeArray();

  class  AssociativeArrayElementsContext : public antlr4::ParserRuleContext {
  public:
    AssociativeArrayElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *TwoPoint();
    GeneralValueContext *generalValue();
    antlr4::tree::TerminalNode *Separator();
    AssociativeArrayElementsContext *associativeArrayElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AssociativeArrayElementsContext* associativeArrayElements();

  class  OperationBlockContext : public antlr4::ParserRuleContext {
  public:
    OperationBlockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *OpenOp();
    OperationElementsContext *operationElements();
    antlr4::tree::TerminalNode *CloseOp();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  OperationBlockContext* operationBlock();

  class  OperationElementsContext : public antlr4::ParserRuleContext {
  public:
    OperationElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    OperationValueContext *operationValue();
    OperationElementsContext *operationElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  OperationElementsContext* operationElements();

  class  OperationValueContext : public antlr4::ParserRuleContext {
  public:
    OperationValueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *ArithmeticOperator();
    antlr4::tree::TerminalNode *TypeSpec();
    FirstIncDecContext *firstIncDec();
    LastIncDecContext *lastIncDec();
    antlr4::tree::TerminalNode *Integer();
    antlr4::tree::TerminalNode *Float();
    FunctionCallContext *functionCall();
    OperationBlockContext *operationBlock();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  OperationValueContext* operationValue();

  class  FirstIncDecContext : public antlr4::ParserRuleContext {
  public:
    FirstIncDecContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *IncDecOperators();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FirstIncDecContext* firstIncDec();

  class  LastIncDecContext : public antlr4::ParserRuleContext {
  public:
    LastIncDecContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *IncDecOperators();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LastIncDecContext* lastIncDec();

  class  CallingFunctionContext : public antlr4::ParserRuleContext {
  public:
    CallingFunctionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FunctionCallContext *functionCall();
    antlr4::tree::TerminalNode *End();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  CallingFunctionContext* callingFunction();

  class  FunctionCallContext : public antlr4::ParserRuleContext {
  public:
    FunctionCallContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    FunctionCallParamContext *functionCallParam();
    antlr4::tree::TerminalNode *Point();
    IdentifierBContext *identifierB();
    antlr4::tree::TerminalNode *TwoTwoPoint();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionCallContext* functionCall();

  class  IdentifierBContext : public antlr4::ParserRuleContext {
  public:
    IdentifierBContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IdentifierBContext* identifierB();

  class  FunctionCallParamContext : public antlr4::ParserRuleContext {
  public:
    FunctionCallParamContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *OpenOp();
    antlr4::tree::TerminalNode *CloseOp();
    FunctionCallParamElementsContext *functionCallParamElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionCallParamContext* functionCallParam();

  class  FunctionCallParamElementsContext : public antlr4::ParserRuleContext {
  public:
    FunctionCallParamElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    GeneralValueContext *generalValue();
    antlr4::tree::TerminalNode *Separator();
    FunctionCallParamElementsContext *functionCallParamElements();
    OperationElementsContext *operationElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionCallParamElementsContext* functionCallParamElements();

  class  ConditionalExpressionContext : public antlr4::ParserRuleContext {
  public:
    ConditionalExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *If();
    ConditionalExpressionElementsContext *conditionalExpressionElements();
    CallingFunctionContext *callingFunction();
    antlr4::tree::TerminalNode *OpenBlock();
    BlockElementsContext *blockElements();
    antlr4::tree::TerminalNode *CloseBlock();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConditionalExpressionContext* conditionalExpression();

  class  ConditionalExpressionElementsContext : public antlr4::ParserRuleContext {
  public:
    ConditionalExpressionElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    OperationElementsContext *operationElements();
    antlr4::tree::TerminalNode *AssignmentOperator();
    std::vector<ConditionalExpressionElementsContext *> conditionalExpressionElements();
    ConditionalExpressionElementsContext* conditionalExpressionElements(size_t i);
    antlr4::tree::TerminalNode *OpenOp();
    antlr4::tree::TerminalNode *CloseOp();
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *Attr();
    FunctionCallContext *functionCall();
    antlr4::tree::TerminalNode *Not();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConditionalExpressionElementsContext* conditionalExpressionElements();

  class  BlockElementsContext : public antlr4::ParserRuleContext {
  public:
    BlockElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ConditionalExpressionContext *conditionalExpression();
    BlockElementsContext *blockElements();
    SentenceContext *sentence();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockElementsContext* blockElements();

  class  GeneralValueContext : public antlr4::ParserRuleContext {
  public:
    GeneralValueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *TypeSpec();
    antlr4::tree::TerminalNode *Integer();
    antlr4::tree::TerminalNode *Float();
    antlr4::tree::TerminalNode *Bool();
    antlr4::tree::TerminalNode *String();
    IndexArrayContext *indexArray();
    AssociativeArrayContext *associativeArray();
    OperationBlockContext *operationBlock();
    FunctionCallContext *functionCall();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  GeneralValueContext* generalValue();


  virtual bool sempred(antlr4::RuleContext *_localctx, size_t ruleIndex, size_t predicateIndex) override;
  bool fileContentSempred(FileContentContext *_localctx, size_t predicateIndex);

private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

}  // namespace verbum
