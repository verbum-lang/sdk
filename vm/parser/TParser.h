
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
    Break = 20, Next = 21, Async = 22, Await = 23, ArrowRight = 24, ARightLB = 25, 
    End = 26, Attr = 27, Point = 28, TwoPoint = 29, TwoTwoPoint = 30, Separator = 31, 
    OpenArIndex = 32, CloseArIndex = 33, OpenBlock = 34, CloseBlock = 35, 
    OpenOp = 36, CloseOp = 37, ArithmeticOperator = 38, AssignmentOperator = 39, 
    Not = 40, IncDecOperators = 41, Identifier = 42, IDPrefix = 43, TypeSpec = 44, 
    String = 45, Integer = 46, Float = 47, Whitespace = 48, Newline = 49, 
    Words = 50, BlockComment = 51, LineComment = 52
  };

  enum {
    RuleMain = 0, RuleFileContent = 1, RuleSentence = 2, RuleLiveToken = 3, 
    RuleBreakFor = 4, RuleNextFor = 5, RuleUse = 6, RuleUseValue = 7, RuleUseString = 8, 
    RuleVariable = 9, RuleVariableModes = 10, RuleVariableModesBkp = 11, 
    RuleVariableMembers = 12, RuleVariableDefinition = 13, RuleVariableDefinitionGeneral = 14, 
    RuleIndexArray = 15, RuleIndexArrayElements = 16, RuleAssociativeArray = 17, 
    RuleAssociativeArrayElements = 18, RuleOperationBlock = 19, RuleOperationElements = 20, 
    RuleOperationValue = 21, RuleFirstIncDec = 22, RuleLastIncDec = 23, 
    RuleCallingFunction = 24, RuleFunctionCall = 25, RuleFunctionCallParamAC = 26, 
    RuleMethodCascadingModes = 27, RuleFunctionCallCascading = 28, RuleFunctionCallCascadingItem = 29, 
    RuleIdentifierB = 30, RulePointSeparator = 31, RuleFunctionCallParam = 32, 
    RuleFunctionCallParamElements = 33, RuleConditionalExpression = 34, 
    RuleConditionalExpressionStructBlock = 35, RuleIfElementUnique = 36, 
    RuleElifElements = 37, RuleElifElementUnique = 38, RuleElseElementUnique = 39, 
    RuleConditionalExpressionItems = 40, RuleConditionalBlockElements = 41, 
    RuleConditionalBlockElsItems = 42, RuleConditionalExpressionElements = 43, 
    RuleConditionExpValue = 44, RuleConditionExpBlock = 45, RuleConditionExpBlockItemValue = 46, 
    RuleConditionExpBlockItem = 47, RuleConditionalExpValue = 48, RuleFunctionCallAndAttr = 49, 
    RuleIdentifierAttrFn = 50, RuleFunctionCallAttrFn = 51, RuleFunctionCallAttrFnItem = 52, 
    RuleLoop = 53, RuleLoopExpressionItems = 54, RuleLoopExpression = 55, 
    RuleLoopInfinite = 56, RuleLoopComplete = 57, RuleLoopConditional = 58, 
    RuleEndOne = 59, RuleEndTwo = 60, RuleLoopOneMembers = 61, RuleLoopTwoMembers = 62, 
    RuleLoopThreeMembers = 63, RuleLoopThreeMembersValues = 64, RuleLoopBlockElements = 65, 
    RuleLoopBlockElementsLimited = 66, RuleRet = 67, RuleRetValues = 68, 
    RuleFunctions = 69, RuleFunctionsModes = 70, RuleFunctionGeneralModes = 71, 
    RuleIdentifierRet = 72, RuleFunctionMethodsModes = 73, RuleFunctionMethodsModesBkp = 74, 
    RuleMethodPerm = 75, RuleVisibilityItems = 76, RuleMethodVisibility = 77, 
    RuleConstructClassMethod = 78, RuleInterfaceMethod = 79, RuleFunctionCodeBlock = 80, 
    RuleFunctionCodeBlockElements = 81, RuleFunctionParams = 82, RuleFunctionParamsControl = 83, 
    RuleFunctionParamElements = 84, RuleOopGeneral = 85, RuleInterfaceClass = 86, 
    RuleInterfaceClassDefinition = 87, RuleInterfaceCodeBlock = 88, RuleAbstractClass = 89, 
    RuleAbstractClassDefinition = 90, RuleAbstractCodeBlock = 91, RuleClassDefination = 92, 
    RuleClassCodeBlock = 93, RuleClassModes = 94, RuleIdentifierC = 95, 
    RuleAnonymousClassCall = 96, RuleAnonymousClassCallExpr = 97, RuleAnonymousClass = 98, 
    RuleAnonymousClassElements = 99, RuleArrayAccessElements = 100, RuleArrayAccessElementsItems = 101, 
    RuleAccessBlockAr = 102, RuleArrayIndexAccess = 103, RuleAnonymousFunction = 104, 
    RuleAnFnItems = 105, RuleFunctionsModesFn = 106, RuleAnonymousObjectCall = 107, 
    RuleAnonymousObjectCallExpr = 108, RuleAnonymousObject = 109, RuleVariableMultipleAssignments = 110, 
    RuleVariableMultipleAssignmentsModes = 111, RuleVariableMultipleAItems = 112, 
    RuleLambdaFunctions = 113, RuleLambdaFnParams = 114, RuleLambdaFnRet = 115, 
    RuleLambdaFnCodeBlock = 116, RuleLambdaFnCodeBlockSimple = 117, RuleLambdaFnCodeBlockKey = 118, 
    RuleLambdaFnCodeBlockItemsControl = 119, RuleLambdaFnCodeBlockItems = 120, 
    RuleLambdaFnParamsItems = 121, RuleLambdaFnParamsControl = 122, RuleLambdaFnParamsElements = 123, 
    RuleGeneralValue = 124, RuleObjIdentifierA = 125, RuleObjIdentifierB = 126
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
  class BreakForContext;
  class NextForContext;
  class UseContext;
  class UseValueContext;
  class UseStringContext;
  class VariableContext;
  class VariableModesContext;
  class VariableModesBkpContext;
  class VariableMembersContext;
  class VariableDefinitionContext;
  class VariableDefinitionGeneralContext;
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
  class FunctionCallParamACContext;
  class MethodCascadingModesContext;
  class FunctionCallCascadingContext;
  class FunctionCallCascadingItemContext;
  class IdentifierBContext;
  class PointSeparatorContext;
  class FunctionCallParamContext;
  class FunctionCallParamElementsContext;
  class ConditionalExpressionContext;
  class ConditionalExpressionStructBlockContext;
  class IfElementUniqueContext;
  class ElifElementsContext;
  class ElifElementUniqueContext;
  class ElseElementUniqueContext;
  class ConditionalExpressionItemsContext;
  class ConditionalBlockElementsContext;
  class ConditionalBlockElsItemsContext;
  class ConditionalExpressionElementsContext;
  class ConditionExpValueContext;
  class ConditionExpBlockContext;
  class ConditionExpBlockItemValueContext;
  class ConditionExpBlockItemContext;
  class ConditionalExpValueContext;
  class FunctionCallAndAttrContext;
  class IdentifierAttrFnContext;
  class FunctionCallAttrFnContext;
  class FunctionCallAttrFnItemContext;
  class LoopContext;
  class LoopExpressionItemsContext;
  class LoopExpressionContext;
  class LoopInfiniteContext;
  class LoopCompleteContext;
  class LoopConditionalContext;
  class EndOneContext;
  class EndTwoContext;
  class LoopOneMembersContext;
  class LoopTwoMembersContext;
  class LoopThreeMembersContext;
  class LoopThreeMembersValuesContext;
  class LoopBlockElementsContext;
  class LoopBlockElementsLimitedContext;
  class RetContext;
  class RetValuesContext;
  class FunctionsContext;
  class FunctionsModesContext;
  class FunctionGeneralModesContext;
  class IdentifierRetContext;
  class FunctionMethodsModesContext;
  class FunctionMethodsModesBkpContext;
  class MethodPermContext;
  class VisibilityItemsContext;
  class MethodVisibilityContext;
  class ConstructClassMethodContext;
  class InterfaceMethodContext;
  class FunctionCodeBlockContext;
  class FunctionCodeBlockElementsContext;
  class FunctionParamsContext;
  class FunctionParamsControlContext;
  class FunctionParamElementsContext;
  class OopGeneralContext;
  class InterfaceClassContext;
  class InterfaceClassDefinitionContext;
  class InterfaceCodeBlockContext;
  class AbstractClassContext;
  class AbstractClassDefinitionContext;
  class AbstractCodeBlockContext;
  class ClassDefinationContext;
  class ClassCodeBlockContext;
  class ClassModesContext;
  class IdentifierCContext;
  class AnonymousClassCallContext;
  class AnonymousClassCallExprContext;
  class AnonymousClassContext;
  class AnonymousClassElementsContext;
  class ArrayAccessElementsContext;
  class ArrayAccessElementsItemsContext;
  class AccessBlockArContext;
  class ArrayIndexAccessContext;
  class AnonymousFunctionContext;
  class AnFnItemsContext;
  class FunctionsModesFnContext;
  class AnonymousObjectCallContext;
  class AnonymousObjectCallExprContext;
  class AnonymousObjectContext;
  class VariableMultipleAssignmentsContext;
  class VariableMultipleAssignmentsModesContext;
  class VariableMultipleAItemsContext;
  class LambdaFunctionsContext;
  class LambdaFnParamsContext;
  class LambdaFnRetContext;
  class LambdaFnCodeBlockContext;
  class LambdaFnCodeBlockSimpleContext;
  class LambdaFnCodeBlockKeyContext;
  class LambdaFnCodeBlockItemsControlContext;
  class LambdaFnCodeBlockItemsContext;
  class LambdaFnParamsItemsContext;
  class LambdaFnParamsControlContext;
  class LambdaFnParamsElementsContext;
  class GeneralValueContext;
  class ObjIdentifierAContext;
  class ObjIdentifierBContext; 

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
    SentenceContext *sentence();
    FileContentContext *fileContent();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FileContentContext* fileContent();

  class  SentenceContext : public antlr4::ParserRuleContext {
  public:
    SentenceContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    LiveTokenContext *liveToken();
    UseContext *use();
    VariableContext *variable();
    CallingFunctionContext *callingFunction();
    ConditionalExpressionContext *conditionalExpression();
    LoopContext *loop();
    FunctionsContext *functions();
    RetContext *ret();
    OopGeneralContext *oopGeneral();
    AnonymousClassCallContext *anonymousClassCall();
    AnonymousObjectCallContext *anonymousObjectCall();
    VariableMultipleAssignmentsContext *variableMultipleAssignments();

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
    BreakForContext *breakFor();
    NextForContext *nextFor();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LiveTokenContext* liveToken();

  class  BreakForContext : public antlr4::ParserRuleContext {
  public:
    BreakForContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Break();
    antlr4::tree::TerminalNode *End();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BreakForContext* breakFor();

  class  NextForContext : public antlr4::ParserRuleContext {
  public:
    NextForContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Next();
    antlr4::tree::TerminalNode *End();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  NextForContext* nextFor();

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
    VariableModesContext *variableModes();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableContext* variable();

  class  VariableModesContext : public antlr4::ParserRuleContext {
  public:
    VariableModesContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Var();
    VariableMembersContext *variableMembers();
    antlr4::tree::TerminalNode *End();
    MethodVisibilityContext *methodVisibility();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableModesContext* variableModes();

  class  VariableModesBkpContext : public antlr4::ParserRuleContext {
  public:
    VariableModesBkpContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Var();
    VariableMembersContext *variableMembers();
    antlr4::tree::TerminalNode *End();
    MethodPermContext *methodPerm();
    antlr4::tree::TerminalNode *Static();
    antlr4::tree::TerminalNode *Final();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableModesBkpContext* variableModesBkp();

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
    VariableDefinitionGeneralContext *variableDefinitionGeneral();
    ObjIdentifierAContext *objIdentifierA();
    antlr4::tree::TerminalNode *Point();
    ObjIdentifierBContext *objIdentifierB();
    antlr4::tree::TerminalNode *TwoTwoPoint();
    ArrayAccessElementsContext *arrayAccessElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableDefinitionContext* variableDefinition();

  class  VariableDefinitionGeneralContext : public antlr4::ParserRuleContext {
  public:
    VariableDefinitionGeneralContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    GeneralValueContext *generalValue();
    antlr4::tree::TerminalNode *Attr();
    antlr4::tree::TerminalNode *AssignmentOperator();
    antlr4::tree::TerminalNode *TypeSpec();
    antlr4::tree::TerminalNode *New();
    antlr4::tree::TerminalNode *Await();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableDefinitionGeneralContext* variableDefinitionGeneral();

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
    FunctionCallContext *functionCall();
    antlr4::tree::TerminalNode *ArithmeticOperator();
    antlr4::tree::TerminalNode *TypeSpec();
    antlr4::tree::TerminalNode *Identifier();
    FirstIncDecContext *firstIncDec();
    LastIncDecContext *lastIncDec();
    antlr4::tree::TerminalNode *Integer();
    antlr4::tree::TerminalNode *Float();
    OperationBlockContext *operationBlock();
    ArrayAccessElementsContext *arrayAccessElements();

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
    MethodCascadingModesContext *methodCascadingModes();
    ArrayAccessElementsContext *arrayAccessElements();
    FunctionCallParamACContext *functionCallParamAC();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionCallContext* functionCall();

  class  FunctionCallParamACContext : public antlr4::ParserRuleContext {
  public:
    FunctionCallParamACContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FunctionCallParamContext *functionCallParam();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionCallParamACContext* functionCallParamAC();

  class  MethodCascadingModesContext : public antlr4::ParserRuleContext {
  public:
    MethodCascadingModesContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    FunctionCallCascadingContext *functionCallCascading();
    antlr4::tree::TerminalNode *Point();
    antlr4::tree::TerminalNode *TwoTwoPoint();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  MethodCascadingModesContext* methodCascadingModes();

  class  FunctionCallCascadingContext : public antlr4::ParserRuleContext {
  public:
    FunctionCallCascadingContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FunctionCallCascadingItemContext *functionCallCascadingItem();
    FunctionCallCascadingContext *functionCallCascading();
    antlr4::tree::TerminalNode *Point();
    antlr4::tree::TerminalNode *TwoTwoPoint();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionCallCascadingContext* functionCallCascading();

  class  FunctionCallCascadingItemContext : public antlr4::ParserRuleContext {
  public:
    FunctionCallCascadingItemContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IdentifierBContext *identifierB();
    FunctionCallParamContext *functionCallParam();
    ArrayAccessElementsContext *arrayAccessElements();
    FunctionCallParamACContext *functionCallParamAC();
    antlr4::tree::TerminalNode *Identifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionCallCascadingItemContext* functionCallCascadingItem();

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

  class  PointSeparatorContext : public antlr4::ParserRuleContext {
  public:
    PointSeparatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Point();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PointSeparatorContext* pointSeparator();

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
    ConditionalExpressionStructBlockContext *conditionalExpressionStructBlock();
    ConditionalExpressionContext *conditionalExpression();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConditionalExpressionContext* conditionalExpression();

  class  ConditionalExpressionStructBlockContext : public antlr4::ParserRuleContext {
  public:
    ConditionalExpressionStructBlockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IfElementUniqueContext *ifElementUnique();
    ElifElementsContext *elifElements();
    ElseElementUniqueContext *elseElementUnique();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConditionalExpressionStructBlockContext* conditionalExpressionStructBlock();

  class  IfElementUniqueContext : public antlr4::ParserRuleContext {
  public:
    IfElementUniqueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *If();
    ConditionalExpressionItemsContext *conditionalExpressionItems();
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
    ElifElementsContext *elifElements();

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
    ConditionalExpressionItemsContext *conditionalExpressionItems();
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

  class  ConditionalExpressionItemsContext : public antlr4::ParserRuleContext {
  public:
    ConditionalExpressionItemsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ConditionalExpressionElementsContext *conditionalExpressionElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConditionalExpressionItemsContext* conditionalExpressionItems();

  class  ConditionalBlockElementsContext : public antlr4::ParserRuleContext {
  public:
    ConditionalBlockElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *OpenBlock();
    antlr4::tree::TerminalNode *CloseBlock();
    ConditionalBlockElsItemsContext *conditionalBlockElsItems();
    ConditionalExpressionContext *conditionalExpression();
    CallingFunctionContext *callingFunction();
    LoopContext *loop();
    RetContext *ret();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConditionalBlockElementsContext* conditionalBlockElements();

  class  ConditionalBlockElsItemsContext : public antlr4::ParserRuleContext {
  public:
    ConditionalBlockElsItemsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    SentenceContext *sentence();
    ConditionalBlockElsItemsContext *conditionalBlockElsItems();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConditionalBlockElsItemsContext* conditionalBlockElsItems();

  class  ConditionalExpressionElementsContext : public antlr4::ParserRuleContext {
  public:
    ConditionalExpressionElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ConditionExpValueContext *conditionExpValue();
    ConditionalExpressionElementsContext *conditionalExpressionElements();
    ConditionExpBlockContext *conditionExpBlock();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConditionalExpressionElementsContext* conditionalExpressionElements();

  class  ConditionExpValueContext : public antlr4::ParserRuleContext {
  public:
    ConditionExpValueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Not();
    ConditionalExpValueContext *conditionalExpValue();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConditionExpValueContext* conditionExpValue();

  class  ConditionExpBlockContext : public antlr4::ParserRuleContext {
  public:
    ConditionExpBlockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ConditionExpBlockItemValueContext *conditionExpBlockItemValue();
    antlr4::tree::TerminalNode *Not();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConditionExpBlockContext* conditionExpBlock();

  class  ConditionExpBlockItemValueContext : public antlr4::ParserRuleContext {
  public:
    ConditionExpBlockItemValueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ConditionExpBlockItemContext *conditionExpBlockItem();
    antlr4::tree::TerminalNode *ArithmeticOperator();
    antlr4::tree::TerminalNode *AssignmentOperator();
    antlr4::tree::TerminalNode *TypeSpec();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConditionExpBlockItemValueContext* conditionExpBlockItemValue();

  class  ConditionExpBlockItemContext : public antlr4::ParserRuleContext {
  public:
    ConditionExpBlockItemContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *OpenOp();
    ConditionalExpressionElementsContext *conditionalExpressionElements();
    antlr4::tree::TerminalNode *CloseOp();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConditionExpBlockItemContext* conditionExpBlockItem();

  class  ConditionalExpValueContext : public antlr4::ParserRuleContext {
  public:
    ConditionalExpValueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FirstIncDecContext *firstIncDec();
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *ArithmeticOperator();
    antlr4::tree::TerminalNode *AssignmentOperator();
    antlr4::tree::TerminalNode *TypeSpec();
    LastIncDecContext *lastIncDec();
    antlr4::tree::TerminalNode *Integer();
    antlr4::tree::TerminalNode *Float();
    FunctionCallAndAttrContext *functionCallAndAttr();
    FunctionCallContext *functionCall();
    OperationBlockContext *operationBlock();
    ArrayAccessElementsContext *arrayAccessElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConditionalExpValueContext* conditionalExpValue();

  class  FunctionCallAndAttrContext : public antlr4::ParserRuleContext {
  public:
    FunctionCallAndAttrContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IdentifierAttrFnContext *identifierAttrFn();
    antlr4::tree::TerminalNode *Attr();
    FunctionCallAttrFnContext *functionCallAttrFn();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionCallAndAttrContext* functionCallAndAttr();

  class  IdentifierAttrFnContext : public antlr4::ParserRuleContext {
  public:
    IdentifierAttrFnContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ArrayAccessElementsContext *arrayAccessElements();
    antlr4::tree::TerminalNode *Identifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IdentifierAttrFnContext* identifierAttrFn();

  class  FunctionCallAttrFnContext : public antlr4::ParserRuleContext {
  public:
    FunctionCallAttrFnContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FunctionCallAttrFnItemContext *functionCallAttrFnItem();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionCallAttrFnContext* functionCallAttrFn();

  class  FunctionCallAttrFnItemContext : public antlr4::ParserRuleContext {
  public:
    FunctionCallAttrFnItemContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FunctionCallContext *functionCall();
    antlr4::tree::TerminalNode *ArithmeticOperator();
    antlr4::tree::TerminalNode *AssignmentOperator();
    antlr4::tree::TerminalNode *TypeSpec();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionCallAttrFnItemContext* functionCallAttrFnItem();

  class  LoopContext : public antlr4::ParserRuleContext {
  public:
    LoopContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    LoopExpressionItemsContext *loopExpressionItems();
    LoopContext *loop();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LoopContext* loop();

  class  LoopExpressionItemsContext : public antlr4::ParserRuleContext {
  public:
    LoopExpressionItemsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *For();
    LoopExpressionContext *loopExpression();
    LoopBlockElementsLimitedContext *loopBlockElementsLimited();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LoopExpressionItemsContext* loopExpressionItems();

  class  LoopExpressionContext : public antlr4::ParserRuleContext {
  public:
    LoopExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    LoopInfiniteContext *loopInfinite();
    LoopCompleteContext *loopComplete();
    LoopConditionalContext *loopConditional();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LoopExpressionContext* loopExpression();

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

  class  LoopCompleteContext : public antlr4::ParserRuleContext {
  public:
    LoopCompleteContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *OpenOp();
    LoopOneMembersContext *loopOneMembers();
    EndOneContext *endOne();
    LoopTwoMembersContext *loopTwoMembers();
    EndTwoContext *endTwo();
    LoopThreeMembersContext *loopThreeMembers();
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
    VariableMembersContext *variableMembers();
    antlr4::tree::TerminalNode *Var();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LoopOneMembersContext* loopOneMembers();

  class  LoopTwoMembersContext : public antlr4::ParserRuleContext {
  public:
    LoopTwoMembersContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ConditionalExpressionElementsContext *conditionalExpressionElements();

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
    OperationElementsContext *operationElements();
    antlr4::tree::TerminalNode *Separator();
    LoopThreeMembersValuesContext *loopThreeMembersValues();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LoopThreeMembersValuesContext* loopThreeMembersValues();

  class  LoopBlockElementsContext : public antlr4::ParserRuleContext {
  public:
    LoopBlockElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    SentenceContext *sentence();
    LoopBlockElementsContext *loopBlockElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LoopBlockElementsContext* loopBlockElements();

  class  LoopBlockElementsLimitedContext : public antlr4::ParserRuleContext {
  public:
    LoopBlockElementsLimitedContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *OpenBlock();
    antlr4::tree::TerminalNode *CloseBlock();
    LoopBlockElementsContext *loopBlockElements();
    ConditionalExpressionContext *conditionalExpression();
    CallingFunctionContext *callingFunction();
    LoopContext *loop();
    RetContext *ret();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LoopBlockElementsLimitedContext* loopBlockElementsLimited();

  class  RetContext : public antlr4::ParserRuleContext {
  public:
    RetContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Ret();
    RetValuesContext *retValues();
    antlr4::tree::TerminalNode *End();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  RetContext* ret();

  class  RetValuesContext : public antlr4::ParserRuleContext {
  public:
    RetValuesContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    GeneralValueContext *generalValue();
    OperationElementsContext *operationElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  RetValuesContext* retValues();

  class  FunctionsContext : public antlr4::ParserRuleContext {
  public:
    FunctionsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FunctionsModesContext *functionsModes();
    antlr4::tree::TerminalNode *OpenBlock();
    antlr4::tree::TerminalNode *CloseBlock();
    FunctionCodeBlockContext *functionCodeBlock();
    FunctionMethodsModesContext *functionMethodsModes();
    ConstructClassMethodContext *constructClassMethod();
    InterfaceMethodContext *interfaceMethod();
    antlr4::tree::TerminalNode *End();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionsContext* functions();

  class  FunctionsModesContext : public antlr4::ParserRuleContext {
  public:
    FunctionsModesContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FunctionGeneralModesContext *functionGeneralModes();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionsModesContext* functionsModes();

  class  FunctionGeneralModesContext : public antlr4::ParserRuleContext {
  public:
    FunctionGeneralModesContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Function();
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *OpenOp();
    antlr4::tree::TerminalNode *CloseOp();
    antlr4::tree::TerminalNode *ArrowRight();
    IdentifierRetContext *identifierRet();
    antlr4::tree::TerminalNode *TypeSpec();
    FunctionParamsContext *functionParams();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionGeneralModesContext* functionGeneralModes();

  class  IdentifierRetContext : public antlr4::ParserRuleContext {
  public:
    IdentifierRetContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IdentifierRetContext* identifierRet();

  class  FunctionMethodsModesContext : public antlr4::ParserRuleContext {
  public:
    FunctionMethodsModesContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    MethodVisibilityContext *methodVisibility();
    FunctionGeneralModesContext *functionGeneralModes();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionMethodsModesContext* functionMethodsModes();

  class  FunctionMethodsModesBkpContext : public antlr4::ParserRuleContext {
  public:
    FunctionMethodsModesBkpContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    MethodPermContext *methodPerm();
    FunctionGeneralModesContext *functionGeneralModes();
    antlr4::tree::TerminalNode *Static();
    antlr4::tree::TerminalNode *Final();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionMethodsModesBkpContext* functionMethodsModesBkp();

  class  MethodPermContext : public antlr4::ParserRuleContext {
  public:
    MethodPermContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Pub();
    antlr4::tree::TerminalNode *Pro();
    antlr4::tree::TerminalNode *Priv();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  MethodPermContext* methodPerm();

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
    MethodVisibilityContext *methodVisibility();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  MethodVisibilityContext* methodVisibility();

  class  ConstructClassMethodContext : public antlr4::ParserRuleContext {
  public:
    ConstructClassMethodContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *OpenOp();
    antlr4::tree::TerminalNode *CloseOp();
    FunctionParamsContext *functionParams();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConstructClassMethodContext* constructClassMethod();

  class  InterfaceMethodContext : public antlr4::ParserRuleContext {
  public:
    InterfaceMethodContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FunctionsModesContext *functionsModes();
    FunctionMethodsModesContext *functionMethodsModes();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  InterfaceMethodContext* interfaceMethod();

  class  FunctionCodeBlockContext : public antlr4::ParserRuleContext {
  public:
    FunctionCodeBlockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FunctionCodeBlockElementsContext *functionCodeBlockElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionCodeBlockContext* functionCodeBlock();

  class  FunctionCodeBlockElementsContext : public antlr4::ParserRuleContext {
  public:
    FunctionCodeBlockElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    SentenceContext *sentence();
    FunctionCodeBlockElementsContext *functionCodeBlockElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionCodeBlockElementsContext* functionCodeBlockElements();

  class  FunctionParamsContext : public antlr4::ParserRuleContext {
  public:
    FunctionParamsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FunctionParamsControlContext *functionParamsControl();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionParamsContext* functionParams();

  class  FunctionParamsControlContext : public antlr4::ParserRuleContext {
  public:
    FunctionParamsControlContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FunctionParamElementsContext *functionParamElements();
    antlr4::tree::TerminalNode *Separator();
    FunctionParamsControlContext *functionParamsControl();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionParamsControlContext* functionParamsControl();

  class  FunctionParamElementsContext : public antlr4::ParserRuleContext {
  public:
    FunctionParamElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *TypeSpec();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionParamElementsContext* functionParamElements();

  class  OopGeneralContext : public antlr4::ParserRuleContext {
  public:
    OopGeneralContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    InterfaceClassContext *interfaceClass();
    AbstractClassContext *abstractClass();
    ClassDefinationContext *classDefination();
    AnonymousClassContext *anonymousClass();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  OopGeneralContext* oopGeneral();

  class  InterfaceClassContext : public antlr4::ParserRuleContext {
  public:
    InterfaceClassContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    InterfaceClassDefinitionContext *interfaceClassDefinition();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  InterfaceClassContext* interfaceClass();

  class  InterfaceClassDefinitionContext : public antlr4::ParserRuleContext {
  public:
    InterfaceClassDefinitionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Interface();
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *OpenBlock();
    antlr4::tree::TerminalNode *CloseBlock();
    InterfaceCodeBlockContext *interfaceCodeBlock();
    antlr4::tree::TerminalNode *Extends();
    IdentifierBContext *identifierB();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  InterfaceClassDefinitionContext* interfaceClassDefinition();

  class  InterfaceCodeBlockContext : public antlr4::ParserRuleContext {
  public:
    InterfaceCodeBlockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FunctionCodeBlockElementsContext *functionCodeBlockElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  InterfaceCodeBlockContext* interfaceCodeBlock();

  class  AbstractClassContext : public antlr4::ParserRuleContext {
  public:
    AbstractClassContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    AbstractClassDefinitionContext *abstractClassDefinition();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AbstractClassContext* abstractClass();

  class  AbstractClassDefinitionContext : public antlr4::ParserRuleContext {
  public:
    AbstractClassDefinitionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Abstract();
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *OpenBlock();
    antlr4::tree::TerminalNode *CloseBlock();
    AbstractCodeBlockContext *abstractCodeBlock();
    antlr4::tree::TerminalNode *Extends();
    IdentifierBContext *identifierB();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AbstractClassDefinitionContext* abstractClassDefinition();

  class  AbstractCodeBlockContext : public antlr4::ParserRuleContext {
  public:
    AbstractCodeBlockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FunctionCodeBlockElementsContext *functionCodeBlockElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AbstractCodeBlockContext* abstractCodeBlock();

  class  ClassDefinationContext : public antlr4::ParserRuleContext {
  public:
    ClassDefinationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ClassModesContext *classModes();
    antlr4::tree::TerminalNode *OpenBlock();
    antlr4::tree::TerminalNode *CloseBlock();
    ClassCodeBlockContext *classCodeBlock();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ClassDefinationContext* classDefination();

  class  ClassCodeBlockContext : public antlr4::ParserRuleContext {
  public:
    ClassCodeBlockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FunctionCodeBlockElementsContext *functionCodeBlockElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ClassCodeBlockContext* classCodeBlock();

  class  ClassModesContext : public antlr4::ParserRuleContext {
  public:
    ClassModesContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Class();
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *Extends();
    IdentifierBContext *identifierB();
    antlr4::tree::TerminalNode *Implements();
    IdentifierCContext *identifierC();
    antlr4::tree::TerminalNode *Final();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ClassModesContext* classModes();

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

  class  AnonymousClassCallContext : public antlr4::ParserRuleContext {
  public:
    AnonymousClassCallContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    AnonymousClassCallExprContext *anonymousClassCallExpr();
    antlr4::tree::TerminalNode *End();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AnonymousClassCallContext* anonymousClassCall();

  class  AnonymousClassCallExprContext : public antlr4::ParserRuleContext {
  public:
    AnonymousClassCallExprContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *OpenOp();
    AnonymousClassContext *anonymousClass();
    antlr4::tree::TerminalNode *CloseOp();
    FunctionCallCascadingContext *functionCallCascading();
    antlr4::tree::TerminalNode *Point();
    antlr4::tree::TerminalNode *TwoTwoPoint();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AnonymousClassCallExprContext* anonymousClassCallExpr();

  class  AnonymousClassContext : public antlr4::ParserRuleContext {
  public:
    AnonymousClassContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *New();
    antlr4::tree::TerminalNode *Class();
    antlr4::tree::TerminalNode *OpenBlock();
    antlr4::tree::TerminalNode *CloseBlock();
    AnonymousClassElementsContext *anonymousClassElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AnonymousClassContext* anonymousClass();

  class  AnonymousClassElementsContext : public antlr4::ParserRuleContext {
  public:
    AnonymousClassElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    SentenceContext *sentence();
    AnonymousClassElementsContext *anonymousClassElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AnonymousClassElementsContext* anonymousClassElements();

  class  ArrayAccessElementsContext : public antlr4::ParserRuleContext {
  public:
    ArrayAccessElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ArrayAccessElementsItemsContext *arrayAccessElementsItems();
    ArrayAccessElementsContext *arrayAccessElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ArrayAccessElementsContext* arrayAccessElements();

  class  ArrayAccessElementsItemsContext : public antlr4::ParserRuleContext {
  public:
    ArrayAccessElementsItemsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *Point();
    AccessBlockArContext *accessBlockAr();
    FirstIncDecContext *firstIncDec();
    LastIncDecContext *lastIncDec();

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
    AccessBlockArContext *accessBlockAr();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AccessBlockArContext* accessBlockAr();

  class  ArrayIndexAccessContext : public antlr4::ParserRuleContext {
  public:
    ArrayIndexAccessContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    OperationElementsContext *operationElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ArrayIndexAccessContext* arrayIndexAccess();

  class  AnonymousFunctionContext : public antlr4::ParserRuleContext {
  public:
    AnonymousFunctionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<antlr4::tree::TerminalNode *> OpenOp();
    antlr4::tree::TerminalNode* OpenOp(size_t i);
    AnFnItemsContext *anFnItems();
    std::vector<antlr4::tree::TerminalNode *> CloseOp();
    antlr4::tree::TerminalNode* CloseOp(size_t i);
    OperationElementsContext *operationElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AnonymousFunctionContext* anonymousFunction();

  class  AnFnItemsContext : public antlr4::ParserRuleContext {
  public:
    AnFnItemsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FunctionsModesFnContext *functionsModesFn();
    antlr4::tree::TerminalNode *OpenBlock();
    antlr4::tree::TerminalNode *CloseBlock();
    FunctionCodeBlockContext *functionCodeBlock();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AnFnItemsContext* anFnItems();

  class  FunctionsModesFnContext : public antlr4::ParserRuleContext {
  public:
    FunctionsModesFnContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Function();
    antlr4::tree::TerminalNode *OpenOp();
    antlr4::tree::TerminalNode *CloseOp();
    antlr4::tree::TerminalNode *ArrowRight();
    IdentifierRetContext *identifierRet();
    antlr4::tree::TerminalNode *TypeSpec();
    FunctionParamsContext *functionParams();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionsModesFnContext* functionsModesFn();

  class  AnonymousObjectCallContext : public antlr4::ParserRuleContext {
  public:
    AnonymousObjectCallContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    AnonymousObjectCallExprContext *anonymousObjectCallExpr();
    antlr4::tree::TerminalNode *End();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AnonymousObjectCallContext* anonymousObjectCall();

  class  AnonymousObjectCallExprContext : public antlr4::ParserRuleContext {
  public:
    AnonymousObjectCallExprContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *OpenOp();
    AnonymousObjectContext *anonymousObject();
    antlr4::tree::TerminalNode *CloseOp();
    FunctionCallCascadingContext *functionCallCascading();
    antlr4::tree::TerminalNode *Point();
    antlr4::tree::TerminalNode *TwoTwoPoint();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AnonymousObjectCallExprContext* anonymousObjectCallExpr();

  class  AnonymousObjectContext : public antlr4::ParserRuleContext {
  public:
    AnonymousObjectContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *New();
    antlr4::tree::TerminalNode *Identifier();
    FunctionCallParamContext *functionCallParam();
    FunctionCallCascadingContext *functionCallCascading();
    antlr4::tree::TerminalNode *Point();
    antlr4::tree::TerminalNode *TwoTwoPoint();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AnonymousObjectContext* anonymousObject();

  class  VariableMultipleAssignmentsContext : public antlr4::ParserRuleContext {
  public:
    VariableMultipleAssignmentsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    VariableMultipleAssignmentsModesContext *variableMultipleAssignmentsModes();
    antlr4::tree::TerminalNode *Attr();
    GeneralValueContext *generalValue();
    antlr4::tree::TerminalNode *End();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableMultipleAssignmentsContext* variableMultipleAssignments();

  class  VariableMultipleAssignmentsModesContext : public antlr4::ParserRuleContext {
  public:
    VariableMultipleAssignmentsModesContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    VariableMultipleAItemsContext *variableMultipleAItems();
    antlr4::tree::TerminalNode *Attr();
    VariableMultipleAssignmentsModesContext *variableMultipleAssignmentsModes();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableMultipleAssignmentsModesContext* variableMultipleAssignmentsModes();

  class  VariableMultipleAItemsContext : public antlr4::ParserRuleContext {
  public:
    VariableMultipleAItemsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *TypeSpec();
    FunctionCallContext *functionCall();
    ArrayAccessElementsContext *arrayAccessElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableMultipleAItemsContext* variableMultipleAItems();

  class  LambdaFunctionsContext : public antlr4::ParserRuleContext {
  public:
    LambdaFunctionsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *OpenOp();
    LambdaFnParamsContext *lambdaFnParams();
    antlr4::tree::TerminalNode *CloseOp();
    LambdaFnRetContext *lambdaFnRet();
    LambdaFnCodeBlockContext *lambdaFnCodeBlock();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LambdaFunctionsContext* lambdaFunctions();

  class  LambdaFnParamsContext : public antlr4::ParserRuleContext {
  public:
    LambdaFnParamsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    LambdaFnParamsItemsContext *lambdaFnParamsItems();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LambdaFnParamsContext* lambdaFnParams();

  class  LambdaFnRetContext : public antlr4::ParserRuleContext {
  public:
    LambdaFnRetContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ArrowRight();
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *TypeSpec();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LambdaFnRetContext* lambdaFnRet();

  class  LambdaFnCodeBlockContext : public antlr4::ParserRuleContext {
  public:
    LambdaFnCodeBlockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ARightLB();
    LambdaFnCodeBlockSimpleContext *lambdaFnCodeBlockSimple();
    LambdaFnCodeBlockKeyContext *lambdaFnCodeBlockKey();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LambdaFnCodeBlockContext* lambdaFnCodeBlock();

  class  LambdaFnCodeBlockSimpleContext : public antlr4::ParserRuleContext {
  public:
    LambdaFnCodeBlockSimpleContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    OperationElementsContext *operationElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LambdaFnCodeBlockSimpleContext* lambdaFnCodeBlockSimple();

  class  LambdaFnCodeBlockKeyContext : public antlr4::ParserRuleContext {
  public:
    LambdaFnCodeBlockKeyContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *OpenBlock();
    antlr4::tree::TerminalNode *CloseBlock();
    LambdaFnCodeBlockItemsControlContext *lambdaFnCodeBlockItemsControl();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LambdaFnCodeBlockKeyContext* lambdaFnCodeBlockKey();

  class  LambdaFnCodeBlockItemsControlContext : public antlr4::ParserRuleContext {
  public:
    LambdaFnCodeBlockItemsControlContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    LambdaFnCodeBlockItemsContext *lambdaFnCodeBlockItems();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LambdaFnCodeBlockItemsControlContext* lambdaFnCodeBlockItemsControl();

  class  LambdaFnCodeBlockItemsContext : public antlr4::ParserRuleContext {
  public:
    LambdaFnCodeBlockItemsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    SentenceContext *sentence();
    LambdaFnCodeBlockItemsContext *lambdaFnCodeBlockItems();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LambdaFnCodeBlockItemsContext* lambdaFnCodeBlockItems();

  class  LambdaFnParamsItemsContext : public antlr4::ParserRuleContext {
  public:
    LambdaFnParamsItemsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    LambdaFnParamsControlContext *lambdaFnParamsControl();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LambdaFnParamsItemsContext* lambdaFnParamsItems();

  class  LambdaFnParamsControlContext : public antlr4::ParserRuleContext {
  public:
    LambdaFnParamsControlContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    LambdaFnParamsElementsContext *lambdaFnParamsElements();
    antlr4::tree::TerminalNode *Separator();
    LambdaFnParamsControlContext *lambdaFnParamsControl();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LambdaFnParamsControlContext* lambdaFnParamsControl();

  class  LambdaFnParamsElementsContext : public antlr4::ParserRuleContext {
  public:
    LambdaFnParamsElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *TypeSpec();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LambdaFnParamsElementsContext* lambdaFnParamsElements();

  class  GeneralValueContext : public antlr4::ParserRuleContext {
  public:
    GeneralValueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *TypeSpec();
    antlr4::tree::TerminalNode *Integer();
    antlr4::tree::TerminalNode *Float();
    antlr4::tree::TerminalNode *String();
    IndexArrayContext *indexArray();
    AssociativeArrayContext *associativeArray();
    FunctionCallContext *functionCall();
    ObjIdentifierAContext *objIdentifierA();
    antlr4::tree::TerminalNode *Point();
    ObjIdentifierBContext *objIdentifierB();
    antlr4::tree::TerminalNode *TwoTwoPoint();
    ArrayAccessElementsContext *arrayAccessElements();
    AnonymousFunctionContext *anonymousFunction();
    AnonymousClassCallExprContext *anonymousClassCallExpr();
    AnonymousClassContext *anonymousClass();
    AnonymousObjectCallExprContext *anonymousObjectCallExpr();
    OperationElementsContext *operationElements();
    LambdaFunctionsContext *lambdaFunctions();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  GeneralValueContext* generalValue();

  class  ObjIdentifierAContext : public antlr4::ParserRuleContext {
  public:
    ObjIdentifierAContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ObjIdentifierAContext* objIdentifierA();

  class  ObjIdentifierBContext : public antlr4::ParserRuleContext {
  public:
    ObjIdentifierBContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ObjIdentifierBContext* objIdentifierB();


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
