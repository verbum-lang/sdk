
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
    TwoTwoPoint = 32, PointPoint = 33, Separator = 34, OpenArIndex = 35, 
    CloseArIndex = 36, OpenBlock = 37, CloseBlock = 38, OpenOp = 39, CloseOp = 40, 
    ArithmeticOperator = 41, AssignmentOperator = 42, Not = 43, IncDecOperators = 44, 
    Identifier = 45, IDPrefix = 46, TypeSpec = 47, Words = 48, Integer = 49, 
    Float = 50, String = 51, BlockComment = 52, LineComment = 53, Whitespace = 54, 
    Newline = 55
  };

  enum {
    RuleMain = 0, RuleSentences = 1, RuleStatements = 2, RuleBlockCode = 3, 
    RuleBlockUse = 4, RuleUseValue = 5, RuleUseString = 6, RuleBlockVariable = 7, 
    RuleVariableItem = 8, RuleVariablePrefixModes = 9, RuleBlockAttribution = 10, 
    RuleAttributionElements = 11, RuleBlockMultipleAssignments = 12, RuleVariableMultipleAssignmentsModes = 13, 
    RuleFunctionCall = 14, RuleFunctionCallFlowControl = 15, RuleFunctionCallParam = 16, 
    RuleFunctionCallParamElements = 17, RuleBlockRet = 18, RuleBlockConditional = 19, 
    RuleIfElementUnique = 20, RuleElifElements = 21, RuleElifElementUnique = 22, 
    RuleElseElementUnique = 23, RuleConditionalBlockExpression = 24, RuleConditionalBlockElements = 25, 
    RuleBlockLoop = 26, RuleLoopBlockElements = 27, RuleLoopComplete = 28, 
    RuleLoopConditional = 29, RuleLoopInfinite = 30, RuleEndOne = 31, RuleEndTwo = 32, 
    RuleLoopOneMembers = 33, RuleLoopTwoMembers = 34, RuleLoopThreeMembers = 35, 
    RuleLoopThreeMembersValues = 36, RuleBlockBreak = 37, RuleBlockNext = 38, 
    RuleBlockTryCatch = 39, RuleTryUniqueElement = 40, RuleCatchUniqueElement = 41, 
    RuleTryCatchElements = 42, RuleBlockFunction = 43, RuleBlockFunctionDeclarationAttr = 44, 
    RuleFunctionParam = 45, RuleFunctionAnonymousParamElements = 46, RuleFunctionAnonymousParam = 47, 
    RuleFunctionCodeBlock = 48, RuleBlockInterface = 49, RuleInterfaceCodeBlock = 50, 
    RuleBlockAbstraction = 51, RuleAbstractionCodeBlock = 52, RuleBlockClass = 53, 
    RuleBlockClassDeclarationAttr = 54, RuleClassAnonymousParam = 55, RuleClassCodeBlock = 56, 
    RuleBlockArray = 57, RuleIndexArray = 58, RuleIndexArrayElements = 59, 
    RuleAssociativeArray = 60, RuleAssociativeArrayElements = 61, RuleBlockLambdaFunctions = 62, 
    RuleLambdaFnParams = 63, RuleLambdaFnCodeBlock = 64, RuleBlockClassConstructor = 65, 
    RuleBlockFunctionCall = 66, RuleFunctionCallElements = 67, RuleBlockCascadingMethod = 68, 
    RuleBlockCascadingMethodAttr = 69, RuleBlockAnonymousObject = 70, RuleBlockAnonymousObjectAttr = 71, 
    RuleBlockAccessArrayElements = 72, RuleArrayAccessElements = 73, RuleArrayAccessElementsItems = 74, 
    RuleAccessBlockAr = 75, RuleArrayIndexAccess = 76, RuleFirstIncDec = 77, 
    RuleLastIncDec = 78, RuleBlockPermissionTokens = 79, RuleCodeBlockFlowControl = 80, 
    RuleCodeBlockFlowControlElements = 81, RuleCodeBlockControl = 82, RuleGeneralValue = 83, 
    RuleGeneralValueBlock = 84, RuleGeneralValueItems = 85, RuleGeneralValueElements = 86, 
    RuleIdentifier = 87, RuleIdentifierB = 88, RuleIdentifierC = 89, RuleIdentifierD = 90, 
    RuleIncDecOperatorsA = 91, RuleIncDecOperatorsB = 92, RuleOpenOpA = 93, 
    RuleCloseOpA = 94
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
  class BlockUseContext;
  class UseValueContext;
  class UseStringContext;
  class BlockVariableContext;
  class VariableItemContext;
  class VariablePrefixModesContext;
  class BlockAttributionContext;
  class AttributionElementsContext;
  class BlockMultipleAssignmentsContext;
  class VariableMultipleAssignmentsModesContext;
  class FunctionCallContext;
  class FunctionCallFlowControlContext;
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
  class BlockBreakContext;
  class BlockNextContext;
  class BlockTryCatchContext;
  class TryUniqueElementContext;
  class CatchUniqueElementContext;
  class TryCatchElementsContext;
  class BlockFunctionContext;
  class BlockFunctionDeclarationAttrContext;
  class FunctionParamContext;
  class FunctionAnonymousParamElementsContext;
  class FunctionAnonymousParamContext;
  class FunctionCodeBlockContext;
  class BlockInterfaceContext;
  class InterfaceCodeBlockContext;
  class BlockAbstractionContext;
  class AbstractionCodeBlockContext;
  class BlockClassContext;
  class BlockClassDeclarationAttrContext;
  class ClassAnonymousParamContext;
  class ClassCodeBlockContext;
  class BlockArrayContext;
  class IndexArrayContext;
  class IndexArrayElementsContext;
  class AssociativeArrayContext;
  class AssociativeArrayElementsContext;
  class BlockLambdaFunctionsContext;
  class LambdaFnParamsContext;
  class LambdaFnCodeBlockContext;
  class BlockClassConstructorContext;
  class BlockFunctionCallContext;
  class FunctionCallElementsContext;
  class BlockCascadingMethodContext;
  class BlockCascadingMethodAttrContext;
  class BlockAnonymousObjectContext;
  class BlockAnonymousObjectAttrContext;
  class BlockAccessArrayElementsContext;
  class ArrayAccessElementsContext;
  class ArrayAccessElementsItemsContext;
  class AccessBlockArContext;
  class ArrayIndexAccessContext;
  class FirstIncDecContext;
  class LastIncDecContext;
  class BlockPermissionTokensContext;
  class CodeBlockFlowControlContext;
  class CodeBlockFlowControlElementsContext;
  class CodeBlockControlContext;
  class GeneralValueContext;
  class GeneralValueBlockContext;
  class GeneralValueItemsContext;
  class GeneralValueElementsContext;
  class IdentifierContext;
  class IdentifierBContext;
  class IdentifierCContext;
  class IdentifierDContext;
  class IncDecOperatorsAContext;
  class IncDecOperatorsBContext;
  class OpenOpAContext;
  class CloseOpAContext; 

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
    BlockUseContext *blockUse();
    BlockVariableContext *blockVariable();
    BlockRetContext *blockRet();
    BlockConditionalContext *blockConditional();
    BlockLoopContext *blockLoop();
    BlockBreakContext *blockBreak();
    BlockNextContext *blockNext();
    BlockTryCatchContext *blockTryCatch();
    BlockFunctionContext *blockFunction();
    BlockInterfaceContext *blockInterface();
    BlockAbstractionContext *blockAbstraction();
    BlockClassContext *blockClass();
    BlockFunctionCallContext *blockFunctionCall();
    BlockClassConstructorContext *blockClassConstructor();
    BlockAttributionContext *blockAttribution();
    BlockMultipleAssignmentsContext *blockMultipleAssignments();
    BlockPermissionTokensContext *blockPermissionTokens();
    BlockAnonymousObjectContext *blockAnonymousObject();

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

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariablePrefixModesContext* variablePrefixModes();

  class  BlockAttributionContext : public antlr4::ParserRuleContext {
  public:
    BlockAttributionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    AttributionElementsContext *attributionElements();
    antlr4::tree::TerminalNode *End();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockAttributionContext* blockAttribution();

  class  AttributionElementsContext : public antlr4::ParserRuleContext {
  public:
    AttributionElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IdentifierContext *identifier();
    GeneralValueElementsContext *generalValueElements();
    antlr4::tree::TerminalNode *Attr();
    antlr4::tree::TerminalNode *AssignmentOperator();
    IdentifierBContext *identifierB();
    antlr4::tree::TerminalNode *TypeSpec();
    std::vector<antlr4::tree::TerminalNode *> Separator();
    antlr4::tree::TerminalNode* Separator(size_t i);
    std::vector<AttributionElementsContext *> attributionElements();
    AttributionElementsContext* attributionElements(size_t i);
    antlr4::tree::TerminalNode *Point();
    antlr4::tree::TerminalNode *TwoTwoPoint();
    antlr4::tree::TerminalNode *New();
    antlr4::tree::TerminalNode *Await();
    GeneralValueContext *generalValue();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AttributionElementsContext* attributionElements();

  class  BlockMultipleAssignmentsContext : public antlr4::ParserRuleContext {
  public:
    BlockMultipleAssignmentsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    VariableMultipleAssignmentsModesContext *variableMultipleAssignmentsModes();
    antlr4::tree::TerminalNode *Attr();
    GeneralValueElementsContext *generalValueElements();
    antlr4::tree::TerminalNode *End();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockMultipleAssignmentsContext* blockMultipleAssignments();

  class  VariableMultipleAssignmentsModesContext : public antlr4::ParserRuleContext {
  public:
    VariableMultipleAssignmentsModesContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    GeneralValueContext *generalValue();
    std::vector<antlr4::tree::TerminalNode *> Attr();
    antlr4::tree::TerminalNode* Attr(size_t i);
    std::vector<VariableMultipleAssignmentsModesContext *> variableMultipleAssignmentsModes();
    VariableMultipleAssignmentsModesContext* variableMultipleAssignmentsModes(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableMultipleAssignmentsModesContext* variableMultipleAssignmentsModes();

  class  FunctionCallContext : public antlr4::ParserRuleContext {
  public:
    FunctionCallContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IdentifierContext *identifier();
    FunctionCallParamContext *functionCallParam();
    IdentifierBContext *identifierB();
    antlr4::tree::TerminalNode *Point();
    antlr4::tree::TerminalNode *TwoTwoPoint();
    BlockAccessArrayElementsContext *blockAccessArrayElements();
    antlr4::tree::TerminalNode *OpenOp();
    antlr4::tree::TerminalNode *CloseOp();
    FunctionCallElementsContext *functionCallElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionCallContext* functionCall();

  class  FunctionCallFlowControlContext : public antlr4::ParserRuleContext {
  public:
    FunctionCallFlowControlContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IdentifierContext *identifier();
    FunctionCallParamContext *functionCallParam();
    IdentifierBContext *identifierB();
    antlr4::tree::TerminalNode *Point();
    antlr4::tree::TerminalNode *TwoTwoPoint();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionCallFlowControlContext* functionCallFlowControl();

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
    GeneralValueElementsContext *generalValueElements();
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

  class  BlockBreakContext : public antlr4::ParserRuleContext {
  public:
    BlockBreakContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Break();
    antlr4::tree::TerminalNode *End();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockBreakContext* blockBreak();

  class  BlockNextContext : public antlr4::ParserRuleContext {
  public:
    BlockNextContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Next();
    antlr4::tree::TerminalNode *End();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockNextContext* blockNext();

  class  BlockTryCatchContext : public antlr4::ParserRuleContext {
  public:
    BlockTryCatchContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    TryUniqueElementContext *tryUniqueElement();
    CatchUniqueElementContext *catchUniqueElement();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockTryCatchContext* blockTryCatch();

  class  TryUniqueElementContext : public antlr4::ParserRuleContext {
  public:
    TryUniqueElementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Try();
    TryCatchElementsContext *tryCatchElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TryUniqueElementContext* tryUniqueElement();

  class  CatchUniqueElementContext : public antlr4::ParserRuleContext {
  public:
    CatchUniqueElementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Catch();
    IdentifierContext *identifier();
    TryCatchElementsContext *tryCatchElements();
    antlr4::tree::TerminalNode *OpenOp();
    antlr4::tree::TerminalNode *CloseOp();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  CatchUniqueElementContext* catchUniqueElement();

  class  TryCatchElementsContext : public antlr4::ParserRuleContext {
  public:
    TryCatchElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    CodeBlockFlowControlContext *codeBlockFlowControl();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TryCatchElementsContext* tryCatchElements();

  class  BlockFunctionContext : public antlr4::ParserRuleContext {
  public:
    BlockFunctionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<antlr4::tree::TerminalNode *> OpenOp();
    antlr4::tree::TerminalNode* OpenOp(size_t i);
    antlr4::tree::TerminalNode *Function();
    std::vector<antlr4::tree::TerminalNode *> CloseOp();
    antlr4::tree::TerminalNode* CloseOp(size_t i);
    FunctionCodeBlockContext *functionCodeBlock();
    OpenOpAContext *openOpA();
    CloseOpAContext *closeOpA();
    antlr4::tree::TerminalNode *End();
    IdentifierContext *identifier();
    FunctionParamContext *functionParam();
    antlr4::tree::TerminalNode *ArrowRight();
    FunctionAnonymousParamElementsContext *functionAnonymousParamElements();
    IdentifierBContext *identifierB();
    antlr4::tree::TerminalNode *TypeSpec();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockFunctionContext* blockFunction();

  class  BlockFunctionDeclarationAttrContext : public antlr4::ParserRuleContext {
  public:
    BlockFunctionDeclarationAttrContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<antlr4::tree::TerminalNode *> OpenOp();
    antlr4::tree::TerminalNode* OpenOp(size_t i);
    antlr4::tree::TerminalNode *Function();
    std::vector<antlr4::tree::TerminalNode *> CloseOp();
    antlr4::tree::TerminalNode* CloseOp(size_t i);
    FunctionCodeBlockContext *functionCodeBlock();
    OpenOpAContext *openOpA();
    CloseOpAContext *closeOpA();
    IdentifierContext *identifier();
    FunctionParamContext *functionParam();
    antlr4::tree::TerminalNode *ArrowRight();
    FunctionAnonymousParamElementsContext *functionAnonymousParamElements();
    IdentifierBContext *identifierB();
    antlr4::tree::TerminalNode *TypeSpec();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockFunctionDeclarationAttrContext* blockFunctionDeclarationAttr();

  class  FunctionParamContext : public antlr4::ParserRuleContext {
  public:
    FunctionParamContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *TypeSpec();
    antlr4::tree::TerminalNode *Separator();
    FunctionParamContext *functionParam();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionParamContext* functionParam();

  class  FunctionAnonymousParamElementsContext : public antlr4::ParserRuleContext {
  public:
    FunctionAnonymousParamElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<FunctionAnonymousParamContext *> functionAnonymousParam();
    FunctionAnonymousParamContext* functionAnonymousParam(size_t i);
    std::vector<antlr4::tree::TerminalNode *> Separator();
    antlr4::tree::TerminalNode* Separator(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionAnonymousParamElementsContext* functionAnonymousParamElements();

  class  FunctionAnonymousParamContext : public antlr4::ParserRuleContext {
  public:
    FunctionAnonymousParamContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    GeneralValueElementsContext *generalValueElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionAnonymousParamContext* functionAnonymousParam();

  class  FunctionCodeBlockContext : public antlr4::ParserRuleContext {
  public:
    FunctionCodeBlockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    CodeBlockControlContext *codeBlockControl();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionCodeBlockContext* functionCodeBlock();

  class  BlockInterfaceContext : public antlr4::ParserRuleContext {
  public:
    BlockInterfaceContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Interface();
    IdentifierContext *identifier();
    InterfaceCodeBlockContext *interfaceCodeBlock();
    antlr4::tree::TerminalNode *Extends();
    IdentifierBContext *identifierB();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockInterfaceContext* blockInterface();

  class  InterfaceCodeBlockContext : public antlr4::ParserRuleContext {
  public:
    InterfaceCodeBlockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    CodeBlockControlContext *codeBlockControl();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  InterfaceCodeBlockContext* interfaceCodeBlock();

  class  BlockAbstractionContext : public antlr4::ParserRuleContext {
  public:
    BlockAbstractionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Abstract();
    IdentifierContext *identifier();
    AbstractionCodeBlockContext *abstractionCodeBlock();
    antlr4::tree::TerminalNode *Extends();
    IdentifierBContext *identifierB();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockAbstractionContext* blockAbstraction();

  class  AbstractionCodeBlockContext : public antlr4::ParserRuleContext {
  public:
    AbstractionCodeBlockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    CodeBlockControlContext *codeBlockControl();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AbstractionCodeBlockContext* abstractionCodeBlock();

  class  BlockClassContext : public antlr4::ParserRuleContext {
  public:
    BlockClassContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    OpenOpAContext *openOpA();
    antlr4::tree::TerminalNode *New();
    antlr4::tree::TerminalNode *Class();
    ClassCodeBlockContext *classCodeBlock();
    CloseOpAContext *closeOpA();
    IdentifierContext *identifier();
    antlr4::tree::TerminalNode *Extends();
    IdentifierBContext *identifierB();
    antlr4::tree::TerminalNode *Implements();
    IdentifierCContext *identifierC();
    IdentifierDContext *identifierD();
    antlr4::tree::TerminalNode *OpenOp();
    antlr4::tree::TerminalNode *CloseOp();
    antlr4::tree::TerminalNode *End();
    antlr4::tree::TerminalNode *Point();
    antlr4::tree::TerminalNode *TwoTwoPoint();
    GeneralValueElementsContext *generalValueElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockClassContext* blockClass();

  class  BlockClassDeclarationAttrContext : public antlr4::ParserRuleContext {
  public:
    BlockClassDeclarationAttrContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    OpenOpAContext *openOpA();
    antlr4::tree::TerminalNode *New();
    antlr4::tree::TerminalNode *Class();
    ClassCodeBlockContext *classCodeBlock();
    CloseOpAContext *closeOpA();
    IdentifierContext *identifier();
    antlr4::tree::TerminalNode *Extends();
    IdentifierBContext *identifierB();
    antlr4::tree::TerminalNode *Implements();
    IdentifierCContext *identifierC();
    IdentifierDContext *identifierD();
    antlr4::tree::TerminalNode *OpenOp();
    antlr4::tree::TerminalNode *CloseOp();
    antlr4::tree::TerminalNode *Point();
    antlr4::tree::TerminalNode *TwoTwoPoint();
    GeneralValueElementsContext *generalValueElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockClassDeclarationAttrContext* blockClassDeclarationAttr();

  class  ClassAnonymousParamContext : public antlr4::ParserRuleContext {
  public:
    ClassAnonymousParamContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    GeneralValueElementsContext *generalValueElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ClassAnonymousParamContext* classAnonymousParam();

  class  ClassCodeBlockContext : public antlr4::ParserRuleContext {
  public:
    ClassCodeBlockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    CodeBlockControlContext *codeBlockControl();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ClassCodeBlockContext* classCodeBlock();

  class  BlockArrayContext : public antlr4::ParserRuleContext {
  public:
    BlockArrayContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IndexArrayContext *indexArray();
    AssociativeArrayContext *associativeArray();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockArrayContext* blockArray();

  class  IndexArrayContext : public antlr4::ParserRuleContext {
  public:
    IndexArrayContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *OpenArIndex();
    IndexArrayElementsContext *indexArrayElements();
    antlr4::tree::TerminalNode *CloseArIndex();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IndexArrayContext* indexArray();

  class  IndexArrayElementsContext : public antlr4::ParserRuleContext {
  public:
    IndexArrayElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    GeneralValueElementsContext *generalValueElements();
    std::vector<antlr4::tree::TerminalNode *> Separator();
    antlr4::tree::TerminalNode* Separator(size_t i);
    std::vector<IndexArrayElementsContext *> indexArrayElements();
    IndexArrayElementsContext* indexArrayElements(size_t i);

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
    AssociativeArrayElementsContext *associativeArrayElements();
    antlr4::tree::TerminalNode *CloseBlock();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AssociativeArrayContext* associativeArray();

  class  AssociativeArrayElementsContext : public antlr4::ParserRuleContext {
  public:
    AssociativeArrayElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IdentifierContext *identifier();
    antlr4::tree::TerminalNode *TwoPoint();
    GeneralValueElementsContext *generalValueElements();
    std::vector<antlr4::tree::TerminalNode *> Separator();
    antlr4::tree::TerminalNode* Separator(size_t i);
    std::vector<AssociativeArrayElementsContext *> associativeArrayElements();
    AssociativeArrayElementsContext* associativeArrayElements(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AssociativeArrayElementsContext* associativeArrayElements();

  class  BlockLambdaFunctionsContext : public antlr4::ParserRuleContext {
  public:
    BlockLambdaFunctionsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *OpenOp();
    antlr4::tree::TerminalNode *CloseOp();
    antlr4::tree::TerminalNode *ARightLB();
    LambdaFnCodeBlockContext *lambdaFnCodeBlock();
    LambdaFnParamsContext *lambdaFnParams();
    antlr4::tree::TerminalNode *ArrowRight();
    IdentifierContext *identifier();
    antlr4::tree::TerminalNode *TypeSpec();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockLambdaFunctionsContext* blockLambdaFunctions();

  class  LambdaFnParamsContext : public antlr4::ParserRuleContext {
  public:
    LambdaFnParamsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IdentifierContext *identifier();
    antlr4::tree::TerminalNode *TypeSpec();
    std::vector<antlr4::tree::TerminalNode *> Separator();
    antlr4::tree::TerminalNode* Separator(size_t i);
    std::vector<LambdaFnParamsContext *> lambdaFnParams();
    LambdaFnParamsContext* lambdaFnParams(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LambdaFnParamsContext* lambdaFnParams();

  class  LambdaFnCodeBlockContext : public antlr4::ParserRuleContext {
  public:
    LambdaFnCodeBlockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    CodeBlockControlContext *codeBlockControl();
    GeneralValueElementsContext *generalValueElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LambdaFnCodeBlockContext* lambdaFnCodeBlock();

  class  BlockClassConstructorContext : public antlr4::ParserRuleContext {
  public:
    BlockClassConstructorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IdentifierContext *identifier();
    antlr4::tree::TerminalNode *OpenOp();
    antlr4::tree::TerminalNode *CloseOp();
    CodeBlockControlContext *codeBlockControl();
    FunctionParamContext *functionParam();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockClassConstructorContext* blockClassConstructor();

  class  BlockFunctionCallContext : public antlr4::ParserRuleContext {
  public:
    BlockFunctionCallContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IdentifierContext *identifier();
    antlr4::tree::TerminalNode *OpenOp();
    antlr4::tree::TerminalNode *CloseOp();
    antlr4::tree::TerminalNode *End();
    IdentifierBContext *identifierB();
    FunctionCallElementsContext *functionCallElements();
    antlr4::tree::TerminalNode *Point();
    antlr4::tree::TerminalNode *TwoTwoPoint();
    BlockAccessArrayElementsContext *blockAccessArrayElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockFunctionCallContext* blockFunctionCall();

  class  FunctionCallElementsContext : public antlr4::ParserRuleContext {
  public:
    FunctionCallElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    GeneralValueElementsContext *generalValueElements();
    std::vector<antlr4::tree::TerminalNode *> Separator();
    antlr4::tree::TerminalNode* Separator(size_t i);
    std::vector<FunctionCallElementsContext *> functionCallElements();
    FunctionCallElementsContext* functionCallElements(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionCallElementsContext* functionCallElements();

  class  BlockCascadingMethodContext : public antlr4::ParserRuleContext {
  public:
    BlockCascadingMethodContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    BlockCascadingMethodAttrContext *blockCascadingMethodAttr();
    antlr4::tree::TerminalNode *End();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockCascadingMethodContext* blockCascadingMethod();

  class  BlockCascadingMethodAttrContext : public antlr4::ParserRuleContext {
  public:
    BlockCascadingMethodAttrContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    BlockAccessArrayElementsContext *blockAccessArrayElements();
    antlr4::tree::TerminalNode *OpenOp();
    antlr4::tree::TerminalNode *CloseOp();
    std::vector<antlr4::tree::TerminalNode *> PointPoint();
    antlr4::tree::TerminalNode* PointPoint(size_t i);
    std::vector<BlockCascadingMethodAttrContext *> blockCascadingMethodAttr();
    BlockCascadingMethodAttrContext* blockCascadingMethodAttr(size_t i);
    FunctionCallElementsContext *functionCallElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockCascadingMethodAttrContext* blockCascadingMethodAttr();

  class  BlockAnonymousObjectContext : public antlr4::ParserRuleContext {
  public:
    BlockAnonymousObjectContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *New();
    IdentifierContext *identifier();
    std::vector<antlr4::tree::TerminalNode *> OpenOp();
    antlr4::tree::TerminalNode* OpenOp(size_t i);
    std::vector<antlr4::tree::TerminalNode *> CloseOp();
    antlr4::tree::TerminalNode* CloseOp(size_t i);
    antlr4::tree::TerminalNode *End();
    std::vector<GeneralValueElementsContext *> generalValueElements();
    GeneralValueElementsContext* generalValueElements(size_t i);
    IdentifierBContext *identifierB();
    antlr4::tree::TerminalNode *Point();
    antlr4::tree::TerminalNode *TwoTwoPoint();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockAnonymousObjectContext* blockAnonymousObject();

  class  BlockAnonymousObjectAttrContext : public antlr4::ParserRuleContext {
  public:
    BlockAnonymousObjectAttrContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<antlr4::tree::TerminalNode *> OpenOp();
    antlr4::tree::TerminalNode* OpenOp(size_t i);
    antlr4::tree::TerminalNode *New();
    IdentifierContext *identifier();
    std::vector<antlr4::tree::TerminalNode *> CloseOp();
    antlr4::tree::TerminalNode* CloseOp(size_t i);
    std::vector<GeneralValueElementsContext *> generalValueElements();
    GeneralValueElementsContext* generalValueElements(size_t i);
    IdentifierBContext *identifierB();
    antlr4::tree::TerminalNode *Point();
    antlr4::tree::TerminalNode *TwoTwoPoint();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockAnonymousObjectAttrContext* blockAnonymousObjectAttr();

  class  BlockAccessArrayElementsContext : public antlr4::ParserRuleContext {
  public:
    BlockAccessArrayElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ArrayAccessElementsContext *arrayAccessElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockAccessArrayElementsContext* blockAccessArrayElements();

  class  ArrayAccessElementsContext : public antlr4::ParserRuleContext {
  public:
    ArrayAccessElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ArrayAccessElementsItemsContext *arrayAccessElementsItems();
    std::vector<ArrayAccessElementsContext *> arrayAccessElements();
    ArrayAccessElementsContext* arrayAccessElements(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ArrayAccessElementsContext* arrayAccessElements();

  class  ArrayAccessElementsItemsContext : public antlr4::ParserRuleContext {
  public:
    ArrayAccessElementsItemsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IdentifierContext *identifier();
    FirstIncDecContext *firstIncDec();
    AccessBlockArContext *accessBlockAr();
    LastIncDecContext *lastIncDec();
    antlr4::tree::TerminalNode *Point();
    antlr4::tree::TerminalNode *TwoTwoPoint();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ArrayAccessElementsItemsContext* arrayAccessElementsItems();

  class  AccessBlockArContext : public antlr4::ParserRuleContext {
  public:
    AccessBlockArContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *OpenArIndex();
    ArrayIndexAccessContext *arrayIndexAccess();
    antlr4::tree::TerminalNode *CloseArIndex();
    std::vector<AccessBlockArContext *> accessBlockAr();
    AccessBlockArContext* accessBlockAr(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AccessBlockArContext* accessBlockAr();

  class  ArrayIndexAccessContext : public antlr4::ParserRuleContext {
  public:
    ArrayIndexAccessContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    GeneralValueElementsContext *generalValueElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ArrayIndexAccessContext* arrayIndexAccess();

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

  class  BlockPermissionTokensContext : public antlr4::ParserRuleContext {
  public:
    BlockPermissionTokensContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Pub();
    antlr4::tree::TerminalNode *Pro();
    antlr4::tree::TerminalNode *Priv();
    antlr4::tree::TerminalNode *Static();
    antlr4::tree::TerminalNode *Final();
    antlr4::tree::TerminalNode *Async();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockPermissionTokensContext* blockPermissionTokens();

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
    FunctionCallFlowControlContext *functionCallFlowControl();
    antlr4::tree::TerminalNode *End();
    BlockRetContext *blockRet();
    BlockConditionalContext *blockConditional();
    BlockLoopContext *blockLoop();
    BlockTryCatchContext *blockTryCatch();
    BlockBreakContext *blockBreak();
    BlockNextContext *blockNext();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  CodeBlockFlowControlElementsContext* codeBlockFlowControlElements();

  class  CodeBlockControlContext : public antlr4::ParserRuleContext {
  public:
    CodeBlockControlContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *OpenBlock();
    antlr4::tree::TerminalNode *CloseBlock();
    SentencesContext *sentences();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  CodeBlockControlContext* codeBlockControl();

  class  GeneralValueContext : public antlr4::ParserRuleContext {
  public:
    GeneralValueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FunctionCallContext *functionCall();
    antlr4::tree::TerminalNode *Not();
    antlr4::tree::TerminalNode *TypeSpec();
    antlr4::tree::TerminalNode *ArithmeticOperator();
    antlr4::tree::TerminalNode *AssignmentOperator();
    IdentifierContext *identifier();
    IdentifierBContext *identifierB();
    antlr4::tree::TerminalNode *Point();
    antlr4::tree::TerminalNode *TwoTwoPoint();
    antlr4::tree::TerminalNode *Attr();
    antlr4::tree::TerminalNode *Integer();
    antlr4::tree::TerminalNode *Float();
    antlr4::tree::TerminalNode *String();
    IncDecOperatorsAContext *incDecOperatorsA();
    IncDecOperatorsBContext *incDecOperatorsB();
    BlockArrayContext *blockArray();
    BlockFunctionDeclarationAttrContext *blockFunctionDeclarationAttr();
    BlockClassDeclarationAttrContext *blockClassDeclarationAttr();
    BlockLambdaFunctionsContext *blockLambdaFunctions();
    BlockAccessArrayElementsContext *blockAccessArrayElements();
    BlockAnonymousObjectAttrContext *blockAnonymousObjectAttr();
    antlr4::tree::TerminalNode *OpenBlock();
    antlr4::tree::TerminalNode *CloseBlock();
    antlr4::tree::TerminalNode *OpenArIndex();
    antlr4::tree::TerminalNode *CloseArIndex();
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

  class  IdentifierCContext : public antlr4::ParserRuleContext {
  public:
    IdentifierCContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IdentifierCContext* identifierC();

  class  IdentifierDContext : public antlr4::ParserRuleContext {
  public:
    IdentifierDContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IdentifierDContext* identifierD();

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

  class  OpenOpAContext : public antlr4::ParserRuleContext {
  public:
    OpenOpAContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *OpenOp();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  OpenOpAContext* openOpA();

  class  CloseOpAContext : public antlr4::ParserRuleContext {
  public:
    CloseOpAContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *CloseOp();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  CloseOpAContext* closeOpA();


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
