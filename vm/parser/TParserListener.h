
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

  virtual void enterVariableModesBkp(TParser::VariableModesBkpContext *ctx) = 0;
  virtual void exitVariableModesBkp(TParser::VariableModesBkpContext *ctx) = 0;

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

  virtual void enterMethodCascadingModes(TParser::MethodCascadingModesContext *ctx) = 0;
  virtual void exitMethodCascadingModes(TParser::MethodCascadingModesContext *ctx) = 0;

  virtual void enterFunctionCallCascading(TParser::FunctionCallCascadingContext *ctx) = 0;
  virtual void exitFunctionCallCascading(TParser::FunctionCallCascadingContext *ctx) = 0;

  virtual void enterFunctionCallCascadingItem(TParser::FunctionCallCascadingItemContext *ctx) = 0;
  virtual void exitFunctionCallCascadingItem(TParser::FunctionCallCascadingItemContext *ctx) = 0;

  virtual void enterIdentifierB(TParser::IdentifierBContext *ctx) = 0;
  virtual void exitIdentifierB(TParser::IdentifierBContext *ctx) = 0;

  virtual void enterPointSeparator(TParser::PointSeparatorContext *ctx) = 0;
  virtual void exitPointSeparator(TParser::PointSeparatorContext *ctx) = 0;

  virtual void enterFunctionCallParam(TParser::FunctionCallParamContext *ctx) = 0;
  virtual void exitFunctionCallParam(TParser::FunctionCallParamContext *ctx) = 0;

  virtual void enterFunctionCallParamElements(TParser::FunctionCallParamElementsContext *ctx) = 0;
  virtual void exitFunctionCallParamElements(TParser::FunctionCallParamElementsContext *ctx) = 0;

  virtual void enterConditionalExpression(TParser::ConditionalExpressionContext *ctx) = 0;
  virtual void exitConditionalExpression(TParser::ConditionalExpressionContext *ctx) = 0;

  virtual void enterConditionalExpressionStructBlock(TParser::ConditionalExpressionStructBlockContext *ctx) = 0;
  virtual void exitConditionalExpressionStructBlock(TParser::ConditionalExpressionStructBlockContext *ctx) = 0;

  virtual void enterIfElementUnique(TParser::IfElementUniqueContext *ctx) = 0;
  virtual void exitIfElementUnique(TParser::IfElementUniqueContext *ctx) = 0;

  virtual void enterElifElements(TParser::ElifElementsContext *ctx) = 0;
  virtual void exitElifElements(TParser::ElifElementsContext *ctx) = 0;

  virtual void enterElifElementUnique(TParser::ElifElementUniqueContext *ctx) = 0;
  virtual void exitElifElementUnique(TParser::ElifElementUniqueContext *ctx) = 0;

  virtual void enterElseElementUnique(TParser::ElseElementUniqueContext *ctx) = 0;
  virtual void exitElseElementUnique(TParser::ElseElementUniqueContext *ctx) = 0;

  virtual void enterConditionalExpressionItems(TParser::ConditionalExpressionItemsContext *ctx) = 0;
  virtual void exitConditionalExpressionItems(TParser::ConditionalExpressionItemsContext *ctx) = 0;

  virtual void enterConditionalBlockElements(TParser::ConditionalBlockElementsContext *ctx) = 0;
  virtual void exitConditionalBlockElements(TParser::ConditionalBlockElementsContext *ctx) = 0;

  virtual void enterConditionalBlockElsItems(TParser::ConditionalBlockElsItemsContext *ctx) = 0;
  virtual void exitConditionalBlockElsItems(TParser::ConditionalBlockElsItemsContext *ctx) = 0;

  virtual void enterConditionalExpressionElements(TParser::ConditionalExpressionElementsContext *ctx) = 0;
  virtual void exitConditionalExpressionElements(TParser::ConditionalExpressionElementsContext *ctx) = 0;

  virtual void enterConditionExpValue(TParser::ConditionExpValueContext *ctx) = 0;
  virtual void exitConditionExpValue(TParser::ConditionExpValueContext *ctx) = 0;

  virtual void enterConditionExpBlock(TParser::ConditionExpBlockContext *ctx) = 0;
  virtual void exitConditionExpBlock(TParser::ConditionExpBlockContext *ctx) = 0;

  virtual void enterConditionExpBlockItemValue(TParser::ConditionExpBlockItemValueContext *ctx) = 0;
  virtual void exitConditionExpBlockItemValue(TParser::ConditionExpBlockItemValueContext *ctx) = 0;

  virtual void enterConditionExpBlockItem(TParser::ConditionExpBlockItemContext *ctx) = 0;
  virtual void exitConditionExpBlockItem(TParser::ConditionExpBlockItemContext *ctx) = 0;

  virtual void enterConditionalExpValue(TParser::ConditionalExpValueContext *ctx) = 0;
  virtual void exitConditionalExpValue(TParser::ConditionalExpValueContext *ctx) = 0;

  virtual void enterFunctionCallAndAttr(TParser::FunctionCallAndAttrContext *ctx) = 0;
  virtual void exitFunctionCallAndAttr(TParser::FunctionCallAndAttrContext *ctx) = 0;

  virtual void enterIdentifierAttrFn(TParser::IdentifierAttrFnContext *ctx) = 0;
  virtual void exitIdentifierAttrFn(TParser::IdentifierAttrFnContext *ctx) = 0;

  virtual void enterFunctionCallAttrFn(TParser::FunctionCallAttrFnContext *ctx) = 0;
  virtual void exitFunctionCallAttrFn(TParser::FunctionCallAttrFnContext *ctx) = 0;

  virtual void enterFunctionCallAttrFnItem(TParser::FunctionCallAttrFnItemContext *ctx) = 0;
  virtual void exitFunctionCallAttrFnItem(TParser::FunctionCallAttrFnItemContext *ctx) = 0;

  virtual void enterLoop(TParser::LoopContext *ctx) = 0;
  virtual void exitLoop(TParser::LoopContext *ctx) = 0;

  virtual void enterLoopExpressionItems(TParser::LoopExpressionItemsContext *ctx) = 0;
  virtual void exitLoopExpressionItems(TParser::LoopExpressionItemsContext *ctx) = 0;

  virtual void enterLoopExpression(TParser::LoopExpressionContext *ctx) = 0;
  virtual void exitLoopExpression(TParser::LoopExpressionContext *ctx) = 0;

  virtual void enterLoopInfinite(TParser::LoopInfiniteContext *ctx) = 0;
  virtual void exitLoopInfinite(TParser::LoopInfiniteContext *ctx) = 0;

  virtual void enterLoopComplete(TParser::LoopCompleteContext *ctx) = 0;
  virtual void exitLoopComplete(TParser::LoopCompleteContext *ctx) = 0;

  virtual void enterLoopConditional(TParser::LoopConditionalContext *ctx) = 0;
  virtual void exitLoopConditional(TParser::LoopConditionalContext *ctx) = 0;

  virtual void enterEndOne(TParser::EndOneContext *ctx) = 0;
  virtual void exitEndOne(TParser::EndOneContext *ctx) = 0;

  virtual void enterEndTwo(TParser::EndTwoContext *ctx) = 0;
  virtual void exitEndTwo(TParser::EndTwoContext *ctx) = 0;

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

  virtual void enterFunctionsModes(TParser::FunctionsModesContext *ctx) = 0;
  virtual void exitFunctionsModes(TParser::FunctionsModesContext *ctx) = 0;

  virtual void enterFunctionGeneralModes(TParser::FunctionGeneralModesContext *ctx) = 0;
  virtual void exitFunctionGeneralModes(TParser::FunctionGeneralModesContext *ctx) = 0;

  virtual void enterIdentifierRet(TParser::IdentifierRetContext *ctx) = 0;
  virtual void exitIdentifierRet(TParser::IdentifierRetContext *ctx) = 0;

  virtual void enterFunctionMethodsModes(TParser::FunctionMethodsModesContext *ctx) = 0;
  virtual void exitFunctionMethodsModes(TParser::FunctionMethodsModesContext *ctx) = 0;

  virtual void enterFunctionMethodsModesBkp(TParser::FunctionMethodsModesBkpContext *ctx) = 0;
  virtual void exitFunctionMethodsModesBkp(TParser::FunctionMethodsModesBkpContext *ctx) = 0;

  virtual void enterMethodPerm(TParser::MethodPermContext *ctx) = 0;
  virtual void exitMethodPerm(TParser::MethodPermContext *ctx) = 0;

  virtual void enterVisibilityItems(TParser::VisibilityItemsContext *ctx) = 0;
  virtual void exitVisibilityItems(TParser::VisibilityItemsContext *ctx) = 0;

  virtual void enterMethodVisibility(TParser::MethodVisibilityContext *ctx) = 0;
  virtual void exitMethodVisibility(TParser::MethodVisibilityContext *ctx) = 0;

  virtual void enterConstructClassMethod(TParser::ConstructClassMethodContext *ctx) = 0;
  virtual void exitConstructClassMethod(TParser::ConstructClassMethodContext *ctx) = 0;

  virtual void enterInterfaceMethod(TParser::InterfaceMethodContext *ctx) = 0;
  virtual void exitInterfaceMethod(TParser::InterfaceMethodContext *ctx) = 0;

  virtual void enterFunctionCodeBlock(TParser::FunctionCodeBlockContext *ctx) = 0;
  virtual void exitFunctionCodeBlock(TParser::FunctionCodeBlockContext *ctx) = 0;

  virtual void enterFunctionCodeBlockElements(TParser::FunctionCodeBlockElementsContext *ctx) = 0;
  virtual void exitFunctionCodeBlockElements(TParser::FunctionCodeBlockElementsContext *ctx) = 0;

  virtual void enterFunctionParams(TParser::FunctionParamsContext *ctx) = 0;
  virtual void exitFunctionParams(TParser::FunctionParamsContext *ctx) = 0;

  virtual void enterFunctionParamsControl(TParser::FunctionParamsControlContext *ctx) = 0;
  virtual void exitFunctionParamsControl(TParser::FunctionParamsControlContext *ctx) = 0;

  virtual void enterFunctionParamElements(TParser::FunctionParamElementsContext *ctx) = 0;
  virtual void exitFunctionParamElements(TParser::FunctionParamElementsContext *ctx) = 0;

  virtual void enterOopGeneral(TParser::OopGeneralContext *ctx) = 0;
  virtual void exitOopGeneral(TParser::OopGeneralContext *ctx) = 0;

  virtual void enterInterfaceClass(TParser::InterfaceClassContext *ctx) = 0;
  virtual void exitInterfaceClass(TParser::InterfaceClassContext *ctx) = 0;

  virtual void enterInterfaceClassDefinition(TParser::InterfaceClassDefinitionContext *ctx) = 0;
  virtual void exitInterfaceClassDefinition(TParser::InterfaceClassDefinitionContext *ctx) = 0;

  virtual void enterInterfaceCodeBlock(TParser::InterfaceCodeBlockContext *ctx) = 0;
  virtual void exitInterfaceCodeBlock(TParser::InterfaceCodeBlockContext *ctx) = 0;

  virtual void enterAbstractClass(TParser::AbstractClassContext *ctx) = 0;
  virtual void exitAbstractClass(TParser::AbstractClassContext *ctx) = 0;

  virtual void enterAbstractClassDefinition(TParser::AbstractClassDefinitionContext *ctx) = 0;
  virtual void exitAbstractClassDefinition(TParser::AbstractClassDefinitionContext *ctx) = 0;

  virtual void enterAbstractCodeBlock(TParser::AbstractCodeBlockContext *ctx) = 0;
  virtual void exitAbstractCodeBlock(TParser::AbstractCodeBlockContext *ctx) = 0;

  virtual void enterClassDefination(TParser::ClassDefinationContext *ctx) = 0;
  virtual void exitClassDefination(TParser::ClassDefinationContext *ctx) = 0;

  virtual void enterClassCodeBlock(TParser::ClassCodeBlockContext *ctx) = 0;
  virtual void exitClassCodeBlock(TParser::ClassCodeBlockContext *ctx) = 0;

  virtual void enterClassModes(TParser::ClassModesContext *ctx) = 0;
  virtual void exitClassModes(TParser::ClassModesContext *ctx) = 0;

  virtual void enterIdentifierC(TParser::IdentifierCContext *ctx) = 0;
  virtual void exitIdentifierC(TParser::IdentifierCContext *ctx) = 0;

  virtual void enterArrayAccessElements(TParser::ArrayAccessElementsContext *ctx) = 0;
  virtual void exitArrayAccessElements(TParser::ArrayAccessElementsContext *ctx) = 0;

  virtual void enterArrayAccessElementsItems(TParser::ArrayAccessElementsItemsContext *ctx) = 0;
  virtual void exitArrayAccessElementsItems(TParser::ArrayAccessElementsItemsContext *ctx) = 0;

  virtual void enterAccessBlockAr(TParser::AccessBlockArContext *ctx) = 0;
  virtual void exitAccessBlockAr(TParser::AccessBlockArContext *ctx) = 0;

  virtual void enterArrayIndexAccess(TParser::ArrayIndexAccessContext *ctx) = 0;
  virtual void exitArrayIndexAccess(TParser::ArrayIndexAccessContext *ctx) = 0;

  virtual void enterGeneralValue(TParser::GeneralValueContext *ctx) = 0;
  virtual void exitGeneralValue(TParser::GeneralValueContext *ctx) = 0;

  virtual void enterObjIdentifierA(TParser::ObjIdentifierAContext *ctx) = 0;
  virtual void exitObjIdentifierA(TParser::ObjIdentifierAContext *ctx) = 0;

  virtual void enterObjIdentifierB(TParser::ObjIdentifierBContext *ctx) = 0;
  virtual void exitObjIdentifierB(TParser::ObjIdentifierBContext *ctx) = 0;


};

}  // namespace verbum
