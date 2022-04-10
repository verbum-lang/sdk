
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

  virtual void enterFileContent(TParser::FileContentContext * /*ctx*/) override { }
  virtual void exitFileContent(TParser::FileContentContext * /*ctx*/) override { }

  virtual void enterSentence(TParser::SentenceContext * /*ctx*/) override { }
  virtual void exitSentence(TParser::SentenceContext * /*ctx*/) override { }

  virtual void enterLiveToken(TParser::LiveTokenContext * /*ctx*/) override { }
  virtual void exitLiveToken(TParser::LiveTokenContext * /*ctx*/) override { }

  virtual void enterUse(TParser::UseContext * /*ctx*/) override { }
  virtual void exitUse(TParser::UseContext * /*ctx*/) override { }

  virtual void enterUseValue(TParser::UseValueContext * /*ctx*/) override { }
  virtual void exitUseValue(TParser::UseValueContext * /*ctx*/) override { }

  virtual void enterUseString(TParser::UseStringContext * /*ctx*/) override { }
  virtual void exitUseString(TParser::UseStringContext * /*ctx*/) override { }

  virtual void enterVariable(TParser::VariableContext * /*ctx*/) override { }
  virtual void exitVariable(TParser::VariableContext * /*ctx*/) override { }

  virtual void enterVariableModes(TParser::VariableModesContext * /*ctx*/) override { }
  virtual void exitVariableModes(TParser::VariableModesContext * /*ctx*/) override { }

  virtual void enterVariableMembers(TParser::VariableMembersContext * /*ctx*/) override { }
  virtual void exitVariableMembers(TParser::VariableMembersContext * /*ctx*/) override { }

  virtual void enterVariableDefinition(TParser::VariableDefinitionContext * /*ctx*/) override { }
  virtual void exitVariableDefinition(TParser::VariableDefinitionContext * /*ctx*/) override { }

  virtual void enterVariableDefinitionGeneral(TParser::VariableDefinitionGeneralContext * /*ctx*/) override { }
  virtual void exitVariableDefinitionGeneral(TParser::VariableDefinitionGeneralContext * /*ctx*/) override { }

  virtual void enterIndexArray(TParser::IndexArrayContext * /*ctx*/) override { }
  virtual void exitIndexArray(TParser::IndexArrayContext * /*ctx*/) override { }

  virtual void enterIndexArrayElements(TParser::IndexArrayElementsContext * /*ctx*/) override { }
  virtual void exitIndexArrayElements(TParser::IndexArrayElementsContext * /*ctx*/) override { }

  virtual void enterAssociativeArray(TParser::AssociativeArrayContext * /*ctx*/) override { }
  virtual void exitAssociativeArray(TParser::AssociativeArrayContext * /*ctx*/) override { }

  virtual void enterAssociativeArrayElements(TParser::AssociativeArrayElementsContext * /*ctx*/) override { }
  virtual void exitAssociativeArrayElements(TParser::AssociativeArrayElementsContext * /*ctx*/) override { }

  virtual void enterOperationBlock(TParser::OperationBlockContext * /*ctx*/) override { }
  virtual void exitOperationBlock(TParser::OperationBlockContext * /*ctx*/) override { }

  virtual void enterOperationElements(TParser::OperationElementsContext * /*ctx*/) override { }
  virtual void exitOperationElements(TParser::OperationElementsContext * /*ctx*/) override { }

  virtual void enterOperationValue(TParser::OperationValueContext * /*ctx*/) override { }
  virtual void exitOperationValue(TParser::OperationValueContext * /*ctx*/) override { }

  virtual void enterFirstIncDec(TParser::FirstIncDecContext * /*ctx*/) override { }
  virtual void exitFirstIncDec(TParser::FirstIncDecContext * /*ctx*/) override { }

  virtual void enterLastIncDec(TParser::LastIncDecContext * /*ctx*/) override { }
  virtual void exitLastIncDec(TParser::LastIncDecContext * /*ctx*/) override { }

  virtual void enterCallingFunction(TParser::CallingFunctionContext * /*ctx*/) override { }
  virtual void exitCallingFunction(TParser::CallingFunctionContext * /*ctx*/) override { }

  virtual void enterFunctionCall(TParser::FunctionCallContext * /*ctx*/) override { }
  virtual void exitFunctionCall(TParser::FunctionCallContext * /*ctx*/) override { }

  virtual void enterIdentifierB(TParser::IdentifierBContext * /*ctx*/) override { }
  virtual void exitIdentifierB(TParser::IdentifierBContext * /*ctx*/) override { }

  virtual void enterPointSeparator(TParser::PointSeparatorContext * /*ctx*/) override { }
  virtual void exitPointSeparator(TParser::PointSeparatorContext * /*ctx*/) override { }

  virtual void enterFunctionCallParam(TParser::FunctionCallParamContext * /*ctx*/) override { }
  virtual void exitFunctionCallParam(TParser::FunctionCallParamContext * /*ctx*/) override { }

  virtual void enterFunctionCallParamElements(TParser::FunctionCallParamElementsContext * /*ctx*/) override { }
  virtual void exitFunctionCallParamElements(TParser::FunctionCallParamElementsContext * /*ctx*/) override { }

  virtual void enterConditionalExpression(TParser::ConditionalExpressionContext * /*ctx*/) override { }
  virtual void exitConditionalExpression(TParser::ConditionalExpressionContext * /*ctx*/) override { }

  virtual void enterConditionalExpressionStructBlock(TParser::ConditionalExpressionStructBlockContext * /*ctx*/) override { }
  virtual void exitConditionalExpressionStructBlock(TParser::ConditionalExpressionStructBlockContext * /*ctx*/) override { }

  virtual void enterIfElementUnique(TParser::IfElementUniqueContext * /*ctx*/) override { }
  virtual void exitIfElementUnique(TParser::IfElementUniqueContext * /*ctx*/) override { }

  virtual void enterElifElements(TParser::ElifElementsContext * /*ctx*/) override { }
  virtual void exitElifElements(TParser::ElifElementsContext * /*ctx*/) override { }

  virtual void enterElifElementUnique(TParser::ElifElementUniqueContext * /*ctx*/) override { }
  virtual void exitElifElementUnique(TParser::ElifElementUniqueContext * /*ctx*/) override { }

  virtual void enterElseElementUnique(TParser::ElseElementUniqueContext * /*ctx*/) override { }
  virtual void exitElseElementUnique(TParser::ElseElementUniqueContext * /*ctx*/) override { }

  virtual void enterConditionalExpressionItems(TParser::ConditionalExpressionItemsContext * /*ctx*/) override { }
  virtual void exitConditionalExpressionItems(TParser::ConditionalExpressionItemsContext * /*ctx*/) override { }

  virtual void enterConditionalBlockElements(TParser::ConditionalBlockElementsContext * /*ctx*/) override { }
  virtual void exitConditionalBlockElements(TParser::ConditionalBlockElementsContext * /*ctx*/) override { }

  virtual void enterConditionalBlockElsItems(TParser::ConditionalBlockElsItemsContext * /*ctx*/) override { }
  virtual void exitConditionalBlockElsItems(TParser::ConditionalBlockElsItemsContext * /*ctx*/) override { }

  virtual void enterConditionalExpressionElements2(TParser::ConditionalExpressionElements2Context * /*ctx*/) override { }
  virtual void exitConditionalExpressionElements2(TParser::ConditionalExpressionElements2Context * /*ctx*/) override { }

  virtual void enterDefaultExpValues(TParser::DefaultExpValuesContext * /*ctx*/) override { }
  virtual void exitDefaultExpValues(TParser::DefaultExpValuesContext * /*ctx*/) override { }

  virtual void enterDefaultExpValuesUnique(TParser::DefaultExpValuesUniqueContext * /*ctx*/) override { }
  virtual void exitDefaultExpValuesUnique(TParser::DefaultExpValuesUniqueContext * /*ctx*/) override { }

  virtual void enterConditionalExpressionElements(TParser::ConditionalExpressionElementsContext * /*ctx*/) override { }
  virtual void exitConditionalExpressionElements(TParser::ConditionalExpressionElementsContext * /*ctx*/) override { }

  virtual void enterConditionExpBlock(TParser::ConditionExpBlockContext * /*ctx*/) override { }
  virtual void exitConditionExpBlock(TParser::ConditionExpBlockContext * /*ctx*/) override { }

  virtual void enterConditionalExpValue(TParser::ConditionalExpValueContext * /*ctx*/) override { }
  virtual void exitConditionalExpValue(TParser::ConditionalExpValueContext * /*ctx*/) override { }

  virtual void enterIdentifierAttrFn(TParser::IdentifierAttrFnContext * /*ctx*/) override { }
  virtual void exitIdentifierAttrFn(TParser::IdentifierAttrFnContext * /*ctx*/) override { }

  virtual void enterLoop(TParser::LoopContext * /*ctx*/) override { }
  virtual void exitLoop(TParser::LoopContext * /*ctx*/) override { }

  virtual void enterLoopExpression(TParser::LoopExpressionContext * /*ctx*/) override { }
  virtual void exitLoopExpression(TParser::LoopExpressionContext * /*ctx*/) override { }

  virtual void enterLoopOneMembers(TParser::LoopOneMembersContext * /*ctx*/) override { }
  virtual void exitLoopOneMembers(TParser::LoopOneMembersContext * /*ctx*/) override { }

  virtual void enterLoopTwoMembers(TParser::LoopTwoMembersContext * /*ctx*/) override { }
  virtual void exitLoopTwoMembers(TParser::LoopTwoMembersContext * /*ctx*/) override { }

  virtual void enterLoopThreeMembers(TParser::LoopThreeMembersContext * /*ctx*/) override { }
  virtual void exitLoopThreeMembers(TParser::LoopThreeMembersContext * /*ctx*/) override { }

  virtual void enterLoopThreeMembersValues(TParser::LoopThreeMembersValuesContext * /*ctx*/) override { }
  virtual void exitLoopThreeMembersValues(TParser::LoopThreeMembersValuesContext * /*ctx*/) override { }

  virtual void enterLoopBlockElements(TParser::LoopBlockElementsContext * /*ctx*/) override { }
  virtual void exitLoopBlockElements(TParser::LoopBlockElementsContext * /*ctx*/) override { }

  virtual void enterLoopBlockElementsLimited(TParser::LoopBlockElementsLimitedContext * /*ctx*/) override { }
  virtual void exitLoopBlockElementsLimited(TParser::LoopBlockElementsLimitedContext * /*ctx*/) override { }

  virtual void enterRet(TParser::RetContext * /*ctx*/) override { }
  virtual void exitRet(TParser::RetContext * /*ctx*/) override { }

  virtual void enterRetValues(TParser::RetValuesContext * /*ctx*/) override { }
  virtual void exitRetValues(TParser::RetValuesContext * /*ctx*/) override { }

  virtual void enterFunctions(TParser::FunctionsContext * /*ctx*/) override { }
  virtual void exitFunctions(TParser::FunctionsContext * /*ctx*/) override { }

  virtual void enterFunctionGeneralModes(TParser::FunctionGeneralModesContext * /*ctx*/) override { }
  virtual void exitFunctionGeneralModes(TParser::FunctionGeneralModesContext * /*ctx*/) override { }

  virtual void enterFunctionsModes(TParser::FunctionsModesContext * /*ctx*/) override { }
  virtual void exitFunctionsModes(TParser::FunctionsModesContext * /*ctx*/) override { }

  virtual void enterFunctionMethodsModes(TParser::FunctionMethodsModesContext * /*ctx*/) override { }
  virtual void exitFunctionMethodsModes(TParser::FunctionMethodsModesContext * /*ctx*/) override { }

  virtual void enterMethodPerm(TParser::MethodPermContext * /*ctx*/) override { }
  virtual void exitMethodPerm(TParser::MethodPermContext * /*ctx*/) override { }

  virtual void enterConstructClassMethod(TParser::ConstructClassMethodContext * /*ctx*/) override { }
  virtual void exitConstructClassMethod(TParser::ConstructClassMethodContext * /*ctx*/) override { }

  virtual void enterInterfaceMethod(TParser::InterfaceMethodContext * /*ctx*/) override { }
  virtual void exitInterfaceMethod(TParser::InterfaceMethodContext * /*ctx*/) override { }

  virtual void enterFunctionCodeBlock(TParser::FunctionCodeBlockContext * /*ctx*/) override { }
  virtual void exitFunctionCodeBlock(TParser::FunctionCodeBlockContext * /*ctx*/) override { }

  virtual void enterFunctionParams(TParser::FunctionParamsContext * /*ctx*/) override { }
  virtual void exitFunctionParams(TParser::FunctionParamsContext * /*ctx*/) override { }

  virtual void enterFunctionParamElements(TParser::FunctionParamElementsContext * /*ctx*/) override { }
  virtual void exitFunctionParamElements(TParser::FunctionParamElementsContext * /*ctx*/) override { }

  virtual void enterOopGeneral(TParser::OopGeneralContext * /*ctx*/) override { }
  virtual void exitOopGeneral(TParser::OopGeneralContext * /*ctx*/) override { }

  virtual void enterInterfaceClass(TParser::InterfaceClassContext * /*ctx*/) override { }
  virtual void exitInterfaceClass(TParser::InterfaceClassContext * /*ctx*/) override { }

  virtual void enterInterfaceClassDefinition(TParser::InterfaceClassDefinitionContext * /*ctx*/) override { }
  virtual void exitInterfaceClassDefinition(TParser::InterfaceClassDefinitionContext * /*ctx*/) override { }

  virtual void enterAbstractClass(TParser::AbstractClassContext * /*ctx*/) override { }
  virtual void exitAbstractClass(TParser::AbstractClassContext * /*ctx*/) override { }

  virtual void enterAbstractClassDefinition(TParser::AbstractClassDefinitionContext * /*ctx*/) override { }
  virtual void exitAbstractClassDefinition(TParser::AbstractClassDefinitionContext * /*ctx*/) override { }

  virtual void enterClassDefination(TParser::ClassDefinationContext * /*ctx*/) override { }
  virtual void exitClassDefination(TParser::ClassDefinationContext * /*ctx*/) override { }

  virtual void enterClassModesGeneral(TParser::ClassModesGeneralContext * /*ctx*/) override { }
  virtual void exitClassModesGeneral(TParser::ClassModesGeneralContext * /*ctx*/) override { }

  virtual void enterClassModes(TParser::ClassModesContext * /*ctx*/) override { }
  virtual void exitClassModes(TParser::ClassModesContext * /*ctx*/) override { }

  virtual void enterArrayAccessElements(TParser::ArrayAccessElementsContext * /*ctx*/) override { }
  virtual void exitArrayAccessElements(TParser::ArrayAccessElementsContext * /*ctx*/) override { }

  virtual void enterArrayAccessElementsItems(TParser::ArrayAccessElementsItemsContext * /*ctx*/) override { }
  virtual void exitArrayAccessElementsItems(TParser::ArrayAccessElementsItemsContext * /*ctx*/) override { }

  virtual void enterAccessBlockAr(TParser::AccessBlockArContext * /*ctx*/) override { }
  virtual void exitAccessBlockAr(TParser::AccessBlockArContext * /*ctx*/) override { }

  virtual void enterArrayIndexAccess(TParser::ArrayIndexAccessContext * /*ctx*/) override { }
  virtual void exitArrayIndexAccess(TParser::ArrayIndexAccessContext * /*ctx*/) override { }

  virtual void enterGeneralValue(TParser::GeneralValueContext * /*ctx*/) override { }
  virtual void exitGeneralValue(TParser::GeneralValueContext * /*ctx*/) override { }

  virtual void enterObjIdentifierA(TParser::ObjIdentifierAContext * /*ctx*/) override { }
  virtual void exitObjIdentifierA(TParser::ObjIdentifierAContext * /*ctx*/) override { }

  virtual void enterObjIdentifierB(TParser::ObjIdentifierBContext * /*ctx*/) override { }
  virtual void exitObjIdentifierB(TParser::ObjIdentifierBContext * /*ctx*/) override { }


  virtual void enterEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void exitEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void visitTerminal(antlr4::tree::TerminalNode * /*node*/) override { }
  virtual void visitErrorNode(antlr4::tree::ErrorNode * /*node*/) override { }

};

}  // namespace verbum
