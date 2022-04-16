
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
    Use = 1, Var = 2, If = 3, Elif = 4, Else = 5, For = 6, Ret = 7, Function = 8, 
    Pub = 9, Pro = 10, Priv = 11, Static = 12, Final = 13, Interface = 14, 
    Abstract = 15, Extends = 16, Class = 17, Implements = 18, New = 19, 
    Break = 20, Next = 21, Async = 22, Await = 23, Try = 24, Catch = 25, 
    ArrowRight = 26, ARightLB = 27, End = 28, Attr = 29, Point = 30, TwoPoint = 31, 
    TwoTwoPoint = 32, Separator = 33, OpenArIndex = 34, CloseArIndex = 35, 
    OpenBlock = 36, CloseBlock = 37, OpenOp = 38, CloseOp = 39, ArithmeticOperator = 40, 
    AssignmentOperator = 41, Not = 42, IncDecOperators = 43, Identifier = 44, 
    IDPrefix = 45, TypeSpec = 46, Words = 47, Integer = 48, Float = 49, 
    String = 50, BlockComment = 51, LineComment = 52, Whitespace = 53, Newline = 54
  };

  enum {
    RuleMain = 0, RuleSentences = 1, RuleStatements = 2, RuleBlockComments = 3, 
    RuleBlockUse = 4, RuleUseValue = 5, RuleUseString = 6, RuleBlockVariable = 7, 
    RuleVariableItem = 8, RuleVariablePrefixModes = 9, RuleVisibilityItems = 10, 
    RuleMethodVisibility = 11, RuleVariableValue = 12, RuleFunctionCall = 13, 
    RuleFunctionCallPrefix = 14, RuleFunctionCallParam = 15, RuleFunctionCallParamElements = 16, 
    RuleGeneralValue = 17, RuleGeneralValueBlock = 18, RuleGeneralValueItems = 19, 
    RuleIdentifier = 20, RuleIncDecOperatorsA = 21, RuleIncDecOperatorsB = 22, 
    RuleBlockLiveTokens = 23
  };

  explicit TParser(antlr4::TokenStream *input);
  ~TParser();

  virtual std::string getGrammarFileName() const override;
  virtual const antlr4::atn::ATN& getATN() const override { return _atn; };
  virtual const std::vector<std::string>& getTokenNames() const override { return _tokenNames; }; // deprecated: use vocabulary instead.
  virtual const std::vector<std::string>& getRuleNames() const override;
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;


  class MainContext;
  class SentencesContext;
  class StatementsContext;
  class BlockCommentsContext;
  class BlockUseContext;
  class UseValueContext;
  class UseStringContext;
  class BlockVariableContext;
  class VariableItemContext;
  class VariablePrefixModesContext;
  class VisibilityItemsContext;
  class MethodVisibilityContext;
  class VariableValueContext;
  class FunctionCallContext;
  class FunctionCallPrefixContext;
  class FunctionCallParamContext;
  class FunctionCallParamElementsContext;
  class GeneralValueContext;
  class GeneralValueBlockContext;
  class GeneralValueItemsContext;
  class IdentifierContext;
  class IncDecOperatorsAContext;
  class IncDecOperatorsBContext;
  class BlockLiveTokensContext; 

  class  MainContext : public antlr4::ParserRuleContext {
  public:
    MainContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    SentencesContext *sentences();
    antlr4::tree::TerminalNode *EOF();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  MainContext* main();

  class  SentencesContext : public antlr4::ParserRuleContext {
  public:
    SentencesContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    StatementsContext *statements();
    SentencesContext *sentences();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  SentencesContext* sentences();

  class  StatementsContext : public antlr4::ParserRuleContext {
  public:
    StatementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    BlockCommentsContext *blockComments();
    BlockUseContext *blockUse();
    BlockVariableContext *blockVariable();
    BlockLiveTokensContext *blockLiveTokens();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  StatementsContext* statements();

  class  BlockCommentsContext : public antlr4::ParserRuleContext {
  public:
    BlockCommentsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *BlockComment();
    antlr4::tree::TerminalNode *LineComment();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockCommentsContext* blockComments();

  class  BlockUseContext : public antlr4::ParserRuleContext {
  public:
    BlockUseContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Use();
    UseValueContext *useValue();
    antlr4::tree::TerminalNode *End();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockUseContext* blockUse();

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

  class  BlockVariableContext : public antlr4::ParserRuleContext {
  public:
    BlockVariableContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Var();
    VariableItemContext *variableItem();
    antlr4::tree::TerminalNode *End();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockVariableContext* blockVariable();

  class  VariableItemContext : public antlr4::ParserRuleContext {
  public:
    VariableItemContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    VariablePrefixModesContext *variablePrefixModes();
    VariableValueContext *variableValue();
    std::vector<antlr4::tree::TerminalNode *> Separator();
    antlr4::tree::TerminalNode* Separator(size_t i);
    std::vector<VariableItemContext *> variableItem();
    VariableItemContext* variableItem(size_t i);
    antlr4::tree::TerminalNode *New();
    antlr4::tree::TerminalNode *Await();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableItemContext* variableItem();

  class  VariablePrefixModesContext : public antlr4::ParserRuleContext {
  public:
    VariablePrefixModesContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Attr();
    antlr4::tree::TerminalNode *AssignmentOperator();
    IdentifierContext *identifier();
    antlr4::tree::TerminalNode *TypeSpec();
    MethodVisibilityContext *methodVisibility();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariablePrefixModesContext* variablePrefixModes();

  class  VisibilityItemsContext : public antlr4::ParserRuleContext {
  public:
    VisibilityItemsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Pub();
    antlr4::tree::TerminalNode *Pro();
    antlr4::tree::TerminalNode *Priv();
    antlr4::tree::TerminalNode *Final();
    antlr4::tree::TerminalNode *Static();
    antlr4::tree::TerminalNode *Async();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VisibilityItemsContext* visibilityItems();

  class  MethodVisibilityContext : public antlr4::ParserRuleContext {
  public:
    MethodVisibilityContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    VisibilityItemsContext *visibilityItems();
    std::vector<MethodVisibilityContext *> methodVisibility();
    MethodVisibilityContext* methodVisibility(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  MethodVisibilityContext* methodVisibility();

  class  VariableValueContext : public antlr4::ParserRuleContext {
  public:
    VariableValueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    GeneralValueContext *generalValue();
    std::vector<VariableValueContext *> variableValue();
    VariableValueContext* variableValue(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableValueContext* variableValue();

  class  FunctionCallContext : public antlr4::ParserRuleContext {
  public:
    FunctionCallContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FunctionCallPrefixContext *functionCallPrefix();
    FunctionCallParamContext *functionCallParam();
    IdentifierContext *identifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionCallContext* functionCall();

  class  FunctionCallPrefixContext : public antlr4::ParserRuleContext {
  public:
    FunctionCallPrefixContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IdentifierContext *identifier();
    antlr4::tree::TerminalNode *Point();
    antlr4::tree::TerminalNode *TwoTwoPoint();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionCallPrefixContext* functionCallPrefix();

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
    std::vector<antlr4::tree::TerminalNode *> Separator();
    antlr4::tree::TerminalNode* Separator(size_t i);
    std::vector<FunctionCallParamElementsContext *> functionCallParamElements();
    FunctionCallParamElementsContext* functionCallParamElements(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionCallParamElementsContext* functionCallParamElements();

  class  GeneralValueContext : public antlr4::ParserRuleContext {
  public:
    GeneralValueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IdentifierContext *identifier();
    antlr4::tree::TerminalNode *Integer();
    antlr4::tree::TerminalNode *Float();
    antlr4::tree::TerminalNode *String();
    IncDecOperatorsAContext *incDecOperatorsA();
    IncDecOperatorsBContext *incDecOperatorsB();
    antlr4::tree::TerminalNode *TypeSpec();
    antlr4::tree::TerminalNode *ArithmeticOperator();
    FunctionCallContext *functionCall();
    GeneralValueBlockContext *generalValueBlock();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  GeneralValueContext* generalValue();

  class  GeneralValueBlockContext : public antlr4::ParserRuleContext {
  public:
    GeneralValueBlockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *OpenOp();
    GeneralValueItemsContext *generalValueItems();
    antlr4::tree::TerminalNode *CloseOp();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  GeneralValueBlockContext* generalValueBlock();

  class  GeneralValueItemsContext : public antlr4::ParserRuleContext {
  public:
    GeneralValueItemsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    GeneralValueContext *generalValue();
    std::vector<GeneralValueItemsContext *> generalValueItems();
    GeneralValueItemsContext* generalValueItems(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  GeneralValueItemsContext* generalValueItems();

  class  IdentifierContext : public antlr4::ParserRuleContext {
  public:
    IdentifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IdentifierContext* identifier();

  class  IncDecOperatorsAContext : public antlr4::ParserRuleContext {
  public:
    IncDecOperatorsAContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *IncDecOperators();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IncDecOperatorsAContext* incDecOperatorsA();

  class  IncDecOperatorsBContext : public antlr4::ParserRuleContext {
  public:
    IncDecOperatorsBContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *IncDecOperators();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IncDecOperatorsBContext* incDecOperatorsB();

  class  BlockLiveTokensContext : public antlr4::ParserRuleContext {
  public:
    BlockLiveTokensContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *If();
    antlr4::tree::TerminalNode *Elif();
    antlr4::tree::TerminalNode *Else();
    antlr4::tree::TerminalNode *For();
    antlr4::tree::TerminalNode *Ret();
    antlr4::tree::TerminalNode *Function();
    antlr4::tree::TerminalNode *Pub();
    antlr4::tree::TerminalNode *Pro();
    antlr4::tree::TerminalNode *Priv();
    antlr4::tree::TerminalNode *Static();
    antlr4::tree::TerminalNode *Final();
    antlr4::tree::TerminalNode *Interface();
    antlr4::tree::TerminalNode *Abstract();
    antlr4::tree::TerminalNode *Extends();
    antlr4::tree::TerminalNode *Class();
    antlr4::tree::TerminalNode *Implements();
    antlr4::tree::TerminalNode *New();
    antlr4::tree::TerminalNode *Break();
    antlr4::tree::TerminalNode *Next();
    antlr4::tree::TerminalNode *Async();
    antlr4::tree::TerminalNode *Await();
    antlr4::tree::TerminalNode *Try();
    antlr4::tree::TerminalNode *Catch();
    antlr4::tree::TerminalNode *ArrowRight();
    antlr4::tree::TerminalNode *ARightLB();
    antlr4::tree::TerminalNode *End();
    antlr4::tree::TerminalNode *Attr();
    antlr4::tree::TerminalNode *Point();
    antlr4::tree::TerminalNode *TwoPoint();
    antlr4::tree::TerminalNode *TwoTwoPoint();
    antlr4::tree::TerminalNode *Separator();
    antlr4::tree::TerminalNode *OpenArIndex();
    antlr4::tree::TerminalNode *CloseArIndex();
    antlr4::tree::TerminalNode *OpenBlock();
    antlr4::tree::TerminalNode *CloseBlock();
    antlr4::tree::TerminalNode *OpenOp();
    antlr4::tree::TerminalNode *CloseOp();
    antlr4::tree::TerminalNode *ArithmeticOperator();
    antlr4::tree::TerminalNode *AssignmentOperator();
    antlr4::tree::TerminalNode *Not();
    antlr4::tree::TerminalNode *IncDecOperators();
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *IDPrefix();
    antlr4::tree::TerminalNode *TypeSpec();
    antlr4::tree::TerminalNode *Words();
    antlr4::tree::TerminalNode *Integer();
    antlr4::tree::TerminalNode *Float();
    antlr4::tree::TerminalNode *String();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockLiveTokensContext* blockLiveTokens();


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
