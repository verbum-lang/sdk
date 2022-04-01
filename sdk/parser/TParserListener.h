
// Generated from ./TParser.g4 by ANTLR 4.9.2

#pragma once


#include "antlr4-runtime.h"
#include "TParser.h"


namespace verbum {

/**
 * This interface defines an abstract listener for a parse tree produced by TParser.
 */
class  TParserListener : public antlr4::tree::ParseTreeListener {
public:

  virtual void enterMain(TParser::MainContext *ctx) = 0;
  virtual void exitMain(TParser::MainContext *ctx) = 0;

  virtual void enterFileContent(TParser::FileContentContext *ctx) = 0;
  virtual void exitFileContent(TParser::FileContentContext *ctx) = 0;

  virtual void enterSentence(TParser::SentenceContext *ctx) = 0;
  virtual void exitSentence(TParser::SentenceContext *ctx) = 0;

  virtual void enterLiveToken(TParser::LiveTokenContext *ctx) = 0;
  virtual void exitLiveToken(TParser::LiveTokenContext *ctx) = 0;

  virtual void enterUse(TParser::UseContext *ctx) = 0;
  virtual void exitUse(TParser::UseContext *ctx) = 0;

  virtual void enterUseValue(TParser::UseValueContext *ctx) = 0;
  virtual void exitUseValue(TParser::UseValueContext *ctx) = 0;

  virtual void enterUseString(TParser::UseStringContext *ctx) = 0;
  virtual void exitUseString(TParser::UseStringContext *ctx) = 0;

  virtual void enterVariable(TParser::VariableContext *ctx) = 0;
  virtual void exitVariable(TParser::VariableContext *ctx) = 0;

  virtual void enterVariableModes(TParser::VariableModesContext *ctx) = 0;
  virtual void exitVariableModes(TParser::VariableModesContext *ctx) = 0;

  virtual void enterVariableMembers(TParser::VariableMembersContext *ctx) = 0;
  virtual void exitVariableMembers(TParser::VariableMembersContext *ctx) = 0;

  virtual void enterVariableDefinition(TParser::VariableDefinitionContext *ctx) = 0;
  virtual void exitVariableDefinition(TParser::VariableDefinitionContext *ctx) = 0;

  virtual void enterVariableDefinitionGeneral(TParser::VariableDefinitionGeneralContext *ctx) = 0;
  virtual void exitVariableDefinitionGeneral(TParser::VariableDefinitionGeneralContext *ctx) = 0;

  virtual void enterIndexArray(TParser::IndexArrayContext *ctx) = 0;
  virtual void exitIndexArray(TParser::IndexArrayContext *ctx) = 0;

  virtual void enterIndexArrayElements(TParser::IndexArrayElementsContext *ctx) = 0;
  virtual void exitIndexArrayElements(TParser::IndexArrayElementsContext *ctx) = 0;

  virtual void enterAssociativeArray(TParser::AssociativeArrayContext *ctx) = 0;
  virtual void exitAssociativeArray(TParser::AssociativeArrayContext *ctx) = 0;

  virtual void enterAssociativeArrayElements(TParser::AssociativeArrayElementsContext *ctx) = 0;
  virtual void exitAssociativeArrayElements(TParser::AssociativeArrayElementsContext *ctx) = 0;

  virtual void enterOperationBlock(TParser::OperationBlockContext *ctx) = 0;
  virtual void exitOperationBlock(TParser::OperationBlockContext *ctx) = 0;

  virtual void enterOperationElements(TParser::OperationElementsContext *ctx) = 0;
  virtual void exitOperationElements(TParser::OperationElementsContext *ctx) = 0;

  virtual void enterOperationValue(TParser::OperationValueContext *ctx) = 0;
  virtual void exitOperationValue(TParser::OperationValueContext *ctx) = 0;

  virtual void enterFirstIncDec(TParser::FirstIncDecContext *ctx) = 0;
  virtual void exitFirstIncDec(TParser::FirstIncDecContext *ctx) = 0;

  virtual void enterLastIncDec(TParser::LastIncDecContext *ctx) = 0;
  virtual void exitLastIncDec(TParser::LastIncDecContext *ctx) = 0;

  virtual void enterCallingFunction(TParser::CallingFunctionContext *ctx) = 0;
  virtual void exitCallingFunction(TParser::CallingFunctionContext *ctx) = 0;

  virtual void enterFunctionCall(TParser::FunctionCallContext *ctx) = 0;
  virtual void exitFunctionCall(TParser::FunctionCallContext *ctx) = 0;

  virtual void enterIdentifierB(TParser::IdentifierBContext *ctx) = 0;
  virtual void exitIdentifierB(TParser::IdentifierBContext *ctx) = 0;

  virtual void enterFunctionCallParam(TParser::FunctionCallParamContext *ctx) = 0;
  virtual void exitFunctionCallParam(TParser::FunctionCallParamContext *ctx) = 0;

  virtual void enterFunctionCallParamElements(TParser::FunctionCallParamElementsContext *ctx) = 0;
  virtual void exitFunctionCallParamElements(TParser::FunctionCallParamElementsContext *ctx) = 0;

  virtual void enterConditionalExpression(TParser::ConditionalExpressionContext *ctx) = 0;
  virtual void exitConditionalExpression(TParser::ConditionalExpressionContext *ctx) = 0;

  virtual void enterConditionalBlockElements(TParser::ConditionalBlockElementsContext *ctx) = 0;
  virtual void exitConditionalBlockElements(TParser::ConditionalBlockElementsContext *ctx) = 0;

  virtual void enterIfConditions(TParser::IfConditionsContext *ctx) = 0;
  virtual void exitIfConditions(TParser::IfConditionsContext *ctx) = 0;

  virtual void enterElifConditions(TParser::ElifConditionsContext *ctx) = 0;
  virtual void exitElifConditions(TParser::ElifConditionsContext *ctx) = 0;

  virtual void enterElseConditions(TParser::ElseConditionsContext *ctx) = 0;
  virtual void exitElseConditions(TParser::ElseConditionsContext *ctx) = 0;

  virtual void enterCondBlockElementsLimited(TParser::CondBlockElementsLimitedContext *ctx) = 0;
  virtual void exitCondBlockElementsLimited(TParser::CondBlockElementsLimitedContext *ctx) = 0;

  virtual void enterConditionalExpressionElements(TParser::ConditionalExpressionElementsContext *ctx) = 0;
  virtual void exitConditionalExpressionElements(TParser::ConditionalExpressionElementsContext *ctx) = 0;

  virtual void enterConditionalExpElementsValue(TParser::ConditionalExpElementsValueContext *ctx) = 0;
  virtual void exitConditionalExpElementsValue(TParser::ConditionalExpElementsValueContext *ctx) = 0;

  virtual void enterConditionExpBlock(TParser::ConditionExpBlockContext *ctx) = 0;
  virtual void exitConditionExpBlock(TParser::ConditionExpBlockContext *ctx) = 0;

  virtual void enterConditionalExpValue(TParser::ConditionalExpValueContext *ctx) = 0;
  virtual void exitConditionalExpValue(TParser::ConditionalExpValueContext *ctx) = 0;

  virtual void enterLoop(TParser::LoopContext *ctx) = 0;
  virtual void exitLoop(TParser::LoopContext *ctx) = 0;

  virtual void enterLoopExpression(TParser::LoopExpressionContext *ctx) = 0;
  virtual void exitLoopExpression(TParser::LoopExpressionContext *ctx) = 0;

  virtual void enterLoopOneMembers(TParser::LoopOneMembersContext *ctx) = 0;
  virtual void exitLoopOneMembers(TParser::LoopOneMembersContext *ctx) = 0;

  virtual void enterLoopTwoMembers(TParser::LoopTwoMembersContext *ctx) = 0;
  virtual void exitLoopTwoMembers(TParser::LoopTwoMembersContext *ctx) = 0;

  virtual void enterLoopThreeMembers(TParser::LoopThreeMembersContext *ctx) = 0;
  virtual void exitLoopThreeMembers(TParser::LoopThreeMembersContext *ctx) = 0;

  virtual void enterLoopThreeMembersValues(TParser::LoopThreeMembersValuesContext *ctx) = 0;
  virtual void exitLoopThreeMembersValues(TParser::LoopThreeMembersValuesContext *ctx) = 0;

  virtual void enterLoopBlockElements(TParser::LoopBlockElementsContext *ctx) = 0;
  virtual void exitLoopBlockElements(TParser::LoopBlockElementsContext *ctx) = 0;

  virtual void enterLoopBlockElementsLimited(TParser::LoopBlockElementsLimitedContext *ctx) = 0;
  virtual void exitLoopBlockElementsLimited(TParser::LoopBlockElementsLimitedContext *ctx) = 0;

  virtual void enterRet(TParser::RetContext *ctx) = 0;
  virtual void exitRet(TParser::RetContext *ctx) = 0;

  virtual void enterRetValues(TParser::RetValuesContext *ctx) = 0;
  virtual void exitRetValues(TParser::RetValuesContext *ctx) = 0;

  virtual void enterFunctions(TParser::FunctionsContext *ctx) = 0;
  virtual void exitFunctions(TParser::FunctionsContext *ctx) = 0;

  virtual void enterFunctionGeneralModes(TParser::FunctionGeneralModesContext *ctx) = 0;
  virtual void exitFunctionGeneralModes(TParser::FunctionGeneralModesContext *ctx) = 0;

  virtual void enterFunctionsModes(TParser::FunctionsModesContext *ctx) = 0;
  virtual void exitFunctionsModes(TParser::FunctionsModesContext *ctx) = 0;

  virtual void enterFunctionMethodsModes(TParser::FunctionMethodsModesContext *ctx) = 0;
  virtual void exitFunctionMethodsModes(TParser::FunctionMethodsModesContext *ctx) = 0;

  virtual void enterMethodPerm(TParser::MethodPermContext *ctx) = 0;
  virtual void exitMethodPerm(TParser::MethodPermContext *ctx) = 0;

  virtual void enterConstructClassMethod(TParser::ConstructClassMethodContext *ctx) = 0;
  virtual void exitConstructClassMethod(TParser::ConstructClassMethodContext *ctx) = 0;

  virtual void enterInterfaceMethod(TParser::InterfaceMethodContext *ctx) = 0;
  virtual void exitInterfaceMethod(TParser::InterfaceMethodContext *ctx) = 0;

  virtual void enterFunctionCodeBlock(TParser::FunctionCodeBlockContext *ctx) = 0;
  virtual void exitFunctionCodeBlock(TParser::FunctionCodeBlockContext *ctx) = 0;

  virtual void enterFunctionParams(TParser::FunctionParamsContext *ctx) = 0;
  virtual void exitFunctionParams(TParser::FunctionParamsContext *ctx) = 0;

  virtual void enterFunctionParamElements(TParser::FunctionParamElementsContext *ctx) = 0;
  virtual void exitFunctionParamElements(TParser::FunctionParamElementsContext *ctx) = 0;

  virtual void enterOopGeneral(TParser::OopGeneralContext *ctx) = 0;
  virtual void exitOopGeneral(TParser::OopGeneralContext *ctx) = 0;

  virtual void enterInterfaceClass(TParser::InterfaceClassContext *ctx) = 0;
  virtual void exitInterfaceClass(TParser::InterfaceClassContext *ctx) = 0;

  virtual void enterInterfaceClassDefinition(TParser::InterfaceClassDefinitionContext *ctx) = 0;
  virtual void exitInterfaceClassDefinition(TParser::InterfaceClassDefinitionContext *ctx) = 0;

  virtual void enterAbstractClass(TParser::AbstractClassContext *ctx) = 0;
  virtual void exitAbstractClass(TParser::AbstractClassContext *ctx) = 0;

  virtual void enterAbstractClassDefinition(TParser::AbstractClassDefinitionContext *ctx) = 0;
  virtual void exitAbstractClassDefinition(TParser::AbstractClassDefinitionContext *ctx) = 0;

  virtual void enterClassDefination(TParser::ClassDefinationContext *ctx) = 0;
  virtual void exitClassDefination(TParser::ClassDefinationContext *ctx) = 0;

  virtual void enterClassModesGeneral(TParser::ClassModesGeneralContext *ctx) = 0;
  virtual void exitClassModesGeneral(TParser::ClassModesGeneralContext *ctx) = 0;

  virtual void enterClassModes(TParser::ClassModesContext *ctx) = 0;
  virtual void exitClassModes(TParser::ClassModesContext *ctx) = 0;

  virtual void enterGeneralValue(TParser::GeneralValueContext *ctx) = 0;
  virtual void exitGeneralValue(TParser::GeneralValueContext *ctx) = 0;

  virtual void enterObjIdentifierA(TParser::ObjIdentifierAContext *ctx) = 0;
  virtual void exitObjIdentifierA(TParser::ObjIdentifierAContext *ctx) = 0;

  virtual void enterObjIdentifierB(TParser::ObjIdentifierBContext *ctx) = 0;
  virtual void exitObjIdentifierB(TParser::ObjIdentifierBContext *ctx) = 0;


};

}  // namespace verbum
