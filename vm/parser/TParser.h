
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
    ArrowRight = 20, End = 21, Attr = 22, Point = 23, TwoPoint = 24, TwoTwoPoint = 25, 
    Separator = 26, OpenArIndex = 27, CloseArIndex = 28, OpenBlock = 29, 
    CloseBlock = 30, OpenOp = 31, CloseOp = 32, ArithmeticOperator = 33, 
    AssignmentOperator = 34, Not = 35, IncDecOperators = 36, Identifier = 37, 
    IDPrefix = 38, TypeSpec = 39, String = 40, Integer = 41, Float = 42, 
    Whitespace = 43, Newline = 44, Words = 45, BlockComment = 46, LineComment = 47
  };

  enum {
    RuleMain = 0, RuleFileContent = 1, RuleSentence = 2, RuleLiveToken = 3, 
    RuleUse = 4, RuleUseValue = 5, RuleUseString = 6, RuleVariable = 7, 
    RuleVariableModes = 8, RuleVariableMembers = 9, RuleVariableDefinition = 10, 
    RuleVariableDefinitionGeneral = 11, RuleIndexArray = 12, RuleIndexArrayElements = 13, 
    RuleAssociativeArray = 14, RuleAssociativeArrayElements = 15, RuleOperationBlock = 16, 
    RuleOperationElements = 17, RuleOperationValue = 18, RuleFirstIncDec = 19, 
    RuleLastIncDec = 20, RuleCallingFunction = 21, RuleFunctionCall = 22, 
    RuleIdentifierB = 23, RulePointSeparator = 24, RuleFunctionCallParam = 25, 
    RuleFunctionCallParamElements = 26, RuleConditionalExpression = 27, 
    RuleConditionalExpressionStructBlock = 28, RuleIfElementUnique = 29, 
    RuleElifElements = 30, RuleElifElementUnique = 31, RuleElseElementUnique = 32, 
    RuleConditionalExpressionItems = 33, RuleConditionalBlockElements = 34, 
    RuleConditionalBlockElsItems = 35, RuleConditionalExpressionElements = 36, 
    RuleConditionExpValue = 37, RuleConditionExpBlock = 38, RuleConditionExpBlockItemValue = 39, 
    RuleConditionExpBlockItem = 40, RuleConditionalExpValue = 41, RuleFunctionCallAndAttr = 42, 
    RuleIdentifierAttrFn = 43, RuleFunctionCallAttrFn = 44, RuleFunctionCallAttrFnItem = 45, 
    RuleLoop = 46, RuleLoopExpressionItems = 47, RuleLoopExpression = 48, 
    RuleLoopInfinite = 49, RuleLoopComplete = 50, RuleLoopConditional = 51, 
    RuleEndOne = 52, RuleEndTwo = 53, RuleLoopOneMembers = 54, RuleLoopTwoMembers = 55, 
    RuleLoopThreeMembers = 56, RuleLoopThreeMembersValues = 57, RuleLoopBlockElements = 58, 
    RuleLoopBlockElementsLimited = 59, RuleRet = 60, RuleRetValues = 61, 
    RuleFunctions = 62, RuleFunctionsModes = 63, RuleFunctionGeneralModes = 64, 
    RuleIdentifierRet = 65, RuleFunctionMethodsModes = 66, RuleMethodPerm = 67, 
    RuleConstructClassMethod = 68, RuleInterfaceMethod = 69, RuleFunctionCodeBlock = 70, 
    RuleFunctionCodeBlockElements = 71, RuleFunctionParams = 72, RuleFunctionParamsControl = 73, 
    RuleFunctionParamElements = 74, RuleOopGeneral = 75, RuleInterfaceClass = 76, 
    RuleInterfaceClassDefinition = 77, RuleInterfaceCodeBlock = 78, RuleAbstractClass = 79, 
    RuleAbstractClassDefinition = 80, RuleAbstractCodeBlock = 81, RuleClassDefination = 82, 
    RuleClassCodeBlock = 83, RuleClassModes = 84, RuleIdentifierC = 85, 
    RuleArrayAccessElements = 86, RuleArrayAccessElementsItems = 87, RuleAccessBlockAr = 88, 
    RuleArrayIndexAccess = 89, RuleGeneralValue = 90, RuleObjIdentifierA = 91, 
    RuleObjIdentifierB = 92
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
  class VariableModesContext;
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
  class MethodPermContext;
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
  class ArrayAccessElementsContext;
  class ArrayAccessElementsItemsContext;
  class AccessBlockArContext;
  class ArrayIndexAccessContext;
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
    MethodPermContext *methodPerm();
    antlr4::tree::TerminalNode *Static();
    antlr4::tree::TerminalNode *Final();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableModesContext* variableModes();

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
    PointSeparatorContext *pointSeparator();
    FunctionCallContext *functionCall();

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
    MethodPermContext *methodPerm();
    FunctionGeneralModesContext *functionGeneralModes();
    antlr4::tree::TerminalNode *Static();
    antlr4::tree::TerminalNode *Final();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionMethodsModesContext* functionMethodsModes();

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
    OperationElementsContext *operationElements();
    FunctionCallContext *functionCall();
    ObjIdentifierAContext *objIdentifierA();
    antlr4::tree::TerminalNode *Point();
    ObjIdentifierBContext *objIdentifierB();
    antlr4::tree::TerminalNode *TwoTwoPoint();
    ArrayAccessElementsContext *arrayAccessElements();

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
