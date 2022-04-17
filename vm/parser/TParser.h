
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
    RuleMain = 0, RuleSentences = 1, RuleStatements = 2, RuleBlockCode = 3, 
    RuleBlockComments = 4, RuleBlockUse = 5, RuleUseValue = 6, RuleUseString = 7, 
    RuleBlockVariable = 8, RuleVariableItem = 9, RuleVariablePrefixModes = 10, 
    RuleVisibilityItems = 11, RuleMethodVisibility = 12, RuleFunctionCall = 13, 
    RuleFunctionCallPrefix = 14, RuleFunctionCallParam = 15, RuleFunctionCallParamElements = 16, 
    RuleBlockRet = 17, RuleBlockConditional = 18, RuleIfElementUnique = 19, 
    RuleElifElements = 20, RuleElifElementUnique = 21, RuleElseElementUnique = 22, 
    RuleConditionalBlockExpression = 23, RuleConditionalBlockElements = 24, 
    RuleBlockLoop = 25, RuleLoopBlockElements = 26, RuleLoopComplete = 27, 
    RuleLoopConditional = 28, RuleLoopInfinite = 29, RuleEndOne = 30, RuleEndTwo = 31, 
    RuleLoopOneMembers = 32, RuleLoopTwoMembers = 33, RuleLoopThreeMembers = 34, 
    RuleLoopThreeMembersValues = 35, RuleCodeBlockFlowControl = 36, RuleCodeBlockFlowControlElements = 37, 
    RuleGeneralValue = 38, RuleGeneralValueBlock = 39, RuleGeneralValueItems = 40, 
    RuleGeneralValueElements = 41, RuleIdentifier = 42, RuleIncDecOperatorsA = 43, 
    RuleIncDecOperatorsB = 44, RuleBlockLiveTokens = 45
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
  class BlockCodeContext;
  class BlockCommentsContext;
  class BlockUseContext;
  class UseValueContext;
  class UseStringContext;
  class BlockVariableContext;
  class VariableItemContext;
  class VariablePrefixModesContext;
  class VisibilityItemsContext;
  class MethodVisibilityContext;
  class FunctionCallContext;
  class FunctionCallPrefixContext;
  class FunctionCallParamContext;
  class FunctionCallParamElementsContext;
  class BlockRetContext;
  class BlockConditionalContext;
  class IfElementUniqueContext;
  class ElifElementsContext;
  class ElifElementUniqueContext;
  class ElseElementUniqueContext;
  class ConditionalBlockExpressionContext;
  class ConditionalBlockElementsContext;
  class BlockLoopContext;
  class LoopBlockElementsContext;
  class LoopCompleteContext;
  class LoopConditionalContext;
  class LoopInfiniteContext;
  class EndOneContext;
  class EndTwoContext;
  class LoopOneMembersContext;
  class LoopTwoMembersContext;
  class LoopThreeMembersContext;
  class LoopThreeMembersValuesContext;
  class CodeBlockFlowControlContext;
  class CodeBlockFlowControlElementsContext;
  class GeneralValueContext;
  class GeneralValueBlockContext;
  class GeneralValueItemsContext;
  class GeneralValueElementsContext;
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
    BlockRetContext *blockRet();
    BlockConditionalContext *blockConditional();
    BlockLoopContext *blockLoop();
    BlockCodeContext *blockCode();
    BlockLiveTokensContext *blockLiveTokens();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  StatementsContext* statements();

  class  BlockCodeContext : public antlr4::ParserRuleContext {
  public:
    BlockCodeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *OpenBlock();
    antlr4::tree::TerminalNode *CloseBlock();
    SentencesContext *sentences();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockCodeContext* blockCode();

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
    GeneralValueElementsContext *generalValueElements();
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

  class  BlockRetContext : public antlr4::ParserRuleContext {
  public:
    BlockRetContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Ret();
    GeneralValueElementsContext *generalValueElements();
    antlr4::tree::TerminalNode *End();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockRetContext* blockRet();

  class  BlockConditionalContext : public antlr4::ParserRuleContext {
  public:
    BlockConditionalContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IfElementUniqueContext *ifElementUnique();
    ElifElementsContext *elifElements();
    ElseElementUniqueContext *elseElementUnique();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockConditionalContext* blockConditional();

  class  IfElementUniqueContext : public antlr4::ParserRuleContext {
  public:
    IfElementUniqueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *If();
    ConditionalBlockExpressionContext *conditionalBlockExpression();
    ConditionalBlockElementsContext *conditionalBlockElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IfElementUniqueContext* ifElementUnique();

  class  ElifElementsContext : public antlr4::ParserRuleContext {
  public:
    ElifElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ElifElementUniqueContext *elifElementUnique();
    std::vector<ElifElementsContext *> elifElements();
    ElifElementsContext* elifElements(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ElifElementsContext* elifElements();

  class  ElifElementUniqueContext : public antlr4::ParserRuleContext {
  public:
    ElifElementUniqueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Elif();
    ConditionalBlockExpressionContext *conditionalBlockExpression();
    ConditionalBlockElementsContext *conditionalBlockElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ElifElementUniqueContext* elifElementUnique();

  class  ElseElementUniqueContext : public antlr4::ParserRuleContext {
  public:
    ElseElementUniqueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Else();
    ConditionalBlockElementsContext *conditionalBlockElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ElseElementUniqueContext* elseElementUnique();

  class  ConditionalBlockExpressionContext : public antlr4::ParserRuleContext {
  public:
    ConditionalBlockExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    GeneralValueElementsContext *generalValueElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConditionalBlockExpressionContext* conditionalBlockExpression();

  class  ConditionalBlockElementsContext : public antlr4::ParserRuleContext {
  public:
    ConditionalBlockElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    CodeBlockFlowControlContext *codeBlockFlowControl();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConditionalBlockElementsContext* conditionalBlockElements();

  class  BlockLoopContext : public antlr4::ParserRuleContext {
  public:
    BlockLoopContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *For();
    LoopBlockElementsContext *loopBlockElements();
    LoopInfiniteContext *loopInfinite();
    LoopConditionalContext *loopConditional();
    LoopCompleteContext *loopComplete();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockLoopContext* blockLoop();

  class  LoopBlockElementsContext : public antlr4::ParserRuleContext {
  public:
    LoopBlockElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    CodeBlockFlowControlContext *codeBlockFlowControl();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LoopBlockElementsContext* loopBlockElements();

  class  LoopCompleteContext : public antlr4::ParserRuleContext {
  public:
    LoopCompleteContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    LoopOneMembersContext *loopOneMembers();
    EndOneContext *endOne();
    LoopTwoMembersContext *loopTwoMembers();
    EndTwoContext *endTwo();
    LoopThreeMembersContext *loopThreeMembers();
    antlr4::tree::TerminalNode *OpenOp();
    antlr4::tree::TerminalNode *CloseOp();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LoopCompleteContext* loopComplete();

  class  LoopConditionalContext : public antlr4::ParserRuleContext {
  public:
    LoopConditionalContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    LoopTwoMembersContext *loopTwoMembers();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LoopConditionalContext* loopConditional();

  class  LoopInfiniteContext : public antlr4::ParserRuleContext {
  public:
    LoopInfiniteContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *OpenOp();
    antlr4::tree::TerminalNode *CloseOp();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LoopInfiniteContext* loopInfinite();

  class  EndOneContext : public antlr4::ParserRuleContext {
  public:
    EndOneContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *End();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  EndOneContext* endOne();

  class  EndTwoContext : public antlr4::ParserRuleContext {
  public:
    EndTwoContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *End();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  EndTwoContext* endTwo();

  class  LoopOneMembersContext : public antlr4::ParserRuleContext {
  public:
    LoopOneMembersContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Var();
    VariableItemContext *variableItem();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LoopOneMembersContext* loopOneMembers();

  class  LoopTwoMembersContext : public antlr4::ParserRuleContext {
  public:
    LoopTwoMembersContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    GeneralValueElementsContext *generalValueElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LoopTwoMembersContext* loopTwoMembers();

  class  LoopThreeMembersContext : public antlr4::ParserRuleContext {
  public:
    LoopThreeMembersContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    LoopThreeMembersValuesContext *loopThreeMembersValues();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LoopThreeMembersContext* loopThreeMembers();

  class  LoopThreeMembersValuesContext : public antlr4::ParserRuleContext {
  public:
    LoopThreeMembersValuesContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<GeneralValueElementsContext *> generalValueElements();
    GeneralValueElementsContext* generalValueElements(size_t i);
    std::vector<antlr4::tree::TerminalNode *> Separator();
    antlr4::tree::TerminalNode* Separator(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LoopThreeMembersValuesContext* loopThreeMembersValues();

  class  CodeBlockFlowControlContext : public antlr4::ParserRuleContext {
  public:
    CodeBlockFlowControlContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *OpenBlock();
    antlr4::tree::TerminalNode *CloseBlock();
    SentencesContext *sentences();
    CodeBlockFlowControlElementsContext *codeBlockFlowControlElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  CodeBlockFlowControlContext* codeBlockFlowControl();

  class  CodeBlockFlowControlElementsContext : public antlr4::ParserRuleContext {
  public:
    CodeBlockFlowControlElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FunctionCallContext *functionCall();
    antlr4::tree::TerminalNode *End();
    BlockRetContext *blockRet();
    BlockConditionalContext *blockConditional();
    BlockLoopContext *blockLoop();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  CodeBlockFlowControlElementsContext* codeBlockFlowControlElements();

  class  GeneralValueContext : public antlr4::ParserRuleContext {
  public:
    GeneralValueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IdentifierContext *identifier();
    antlr4::tree::TerminalNode *Integer();
    antlr4::tree::TerminalNode *Float();
    antlr4::tree::TerminalNode *String();
    antlr4::tree::TerminalNode *Not();
    IncDecOperatorsAContext *incDecOperatorsA();
    IncDecOperatorsBContext *incDecOperatorsB();
    antlr4::tree::TerminalNode *TypeSpec();
    antlr4::tree::TerminalNode *ArithmeticOperator();
    antlr4::tree::TerminalNode *AssignmentOperator();
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

  class  GeneralValueElementsContext : public antlr4::ParserRuleContext {
  public:
    GeneralValueElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    GeneralValueContext *generalValue();
    std::vector<GeneralValueElementsContext *> generalValueElements();
    GeneralValueElementsContext* generalValueElements(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  GeneralValueElementsContext* generalValueElements();

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
