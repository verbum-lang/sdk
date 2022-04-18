
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

  virtual void enterBlockCode(TParser::BlockCodeContext * /*ctx*/) override { }
  virtual void exitBlockCode(TParser::BlockCodeContext * /*ctx*/) override { }

  virtual void enterBlockUse(TParser::BlockUseContext * /*ctx*/) override { }
  virtual void exitBlockUse(TParser::BlockUseContext * /*ctx*/) override { }

  virtual void enterUseValue(TParser::UseValueContext * /*ctx*/) override { }
  virtual void exitUseValue(TParser::UseValueContext * /*ctx*/) override { }

  virtual void enterUseString(TParser::UseStringContext * /*ctx*/) override { }
  virtual void exitUseString(TParser::UseStringContext * /*ctx*/) override { }

  virtual void enterBlockVariable(TParser::BlockVariableContext * /*ctx*/) override { }
  virtual void exitBlockVariable(TParser::BlockVariableContext * /*ctx*/) override { }

  virtual void enterVariableItem(TParser::VariableItemContext * /*ctx*/) override { }
  virtual void exitVariableItem(TParser::VariableItemContext * /*ctx*/) override { }

  virtual void enterVariablePrefixModes(TParser::VariablePrefixModesContext * /*ctx*/) override { }
  virtual void exitVariablePrefixModes(TParser::VariablePrefixModesContext * /*ctx*/) override { }

  virtual void enterFunctionCall(TParser::FunctionCallContext * /*ctx*/) override { }
  virtual void exitFunctionCall(TParser::FunctionCallContext * /*ctx*/) override { }

  virtual void enterFunctionCallPrefix(TParser::FunctionCallPrefixContext * /*ctx*/) override { }
  virtual void exitFunctionCallPrefix(TParser::FunctionCallPrefixContext * /*ctx*/) override { }

  virtual void enterFunctionCallParam(TParser::FunctionCallParamContext * /*ctx*/) override { }
  virtual void exitFunctionCallParam(TParser::FunctionCallParamContext * /*ctx*/) override { }

  virtual void enterFunctionCallParamElements(TParser::FunctionCallParamElementsContext * /*ctx*/) override { }
  virtual void exitFunctionCallParamElements(TParser::FunctionCallParamElementsContext * /*ctx*/) override { }

  virtual void enterBlockRet(TParser::BlockRetContext * /*ctx*/) override { }
  virtual void exitBlockRet(TParser::BlockRetContext * /*ctx*/) override { }

  virtual void enterBlockConditional(TParser::BlockConditionalContext * /*ctx*/) override { }
  virtual void exitBlockConditional(TParser::BlockConditionalContext * /*ctx*/) override { }

  virtual void enterIfElementUnique(TParser::IfElementUniqueContext * /*ctx*/) override { }
  virtual void exitIfElementUnique(TParser::IfElementUniqueContext * /*ctx*/) override { }

  virtual void enterElifElements(TParser::ElifElementsContext * /*ctx*/) override { }
  virtual void exitElifElements(TParser::ElifElementsContext * /*ctx*/) override { }

  virtual void enterElifElementUnique(TParser::ElifElementUniqueContext * /*ctx*/) override { }
  virtual void exitElifElementUnique(TParser::ElifElementUniqueContext * /*ctx*/) override { }

  virtual void enterElseElementUnique(TParser::ElseElementUniqueContext * /*ctx*/) override { }
  virtual void exitElseElementUnique(TParser::ElseElementUniqueContext * /*ctx*/) override { }

  virtual void enterConditionalBlockExpression(TParser::ConditionalBlockExpressionContext * /*ctx*/) override { }
  virtual void exitConditionalBlockExpression(TParser::ConditionalBlockExpressionContext * /*ctx*/) override { }

  virtual void enterConditionalBlockElements(TParser::ConditionalBlockElementsContext * /*ctx*/) override { }
  virtual void exitConditionalBlockElements(TParser::ConditionalBlockElementsContext * /*ctx*/) override { }

  virtual void enterBlockLoop(TParser::BlockLoopContext * /*ctx*/) override { }
  virtual void exitBlockLoop(TParser::BlockLoopContext * /*ctx*/) override { }

  virtual void enterLoopBlockElements(TParser::LoopBlockElementsContext * /*ctx*/) override { }
  virtual void exitLoopBlockElements(TParser::LoopBlockElementsContext * /*ctx*/) override { }

  virtual void enterLoopComplete(TParser::LoopCompleteContext * /*ctx*/) override { }
  virtual void exitLoopComplete(TParser::LoopCompleteContext * /*ctx*/) override { }

  virtual void enterLoopConditional(TParser::LoopConditionalContext * /*ctx*/) override { }
  virtual void exitLoopConditional(TParser::LoopConditionalContext * /*ctx*/) override { }

  virtual void enterLoopInfinite(TParser::LoopInfiniteContext * /*ctx*/) override { }
  virtual void exitLoopInfinite(TParser::LoopInfiniteContext * /*ctx*/) override { }

  virtual void enterEndOne(TParser::EndOneContext * /*ctx*/) override { }
  virtual void exitEndOne(TParser::EndOneContext * /*ctx*/) override { }

  virtual void enterEndTwo(TParser::EndTwoContext * /*ctx*/) override { }
  virtual void exitEndTwo(TParser::EndTwoContext * /*ctx*/) override { }

  virtual void enterLoopOneMembers(TParser::LoopOneMembersContext * /*ctx*/) override { }
  virtual void exitLoopOneMembers(TParser::LoopOneMembersContext * /*ctx*/) override { }

  virtual void enterLoopTwoMembers(TParser::LoopTwoMembersContext * /*ctx*/) override { }
  virtual void exitLoopTwoMembers(TParser::LoopTwoMembersContext * /*ctx*/) override { }

  virtual void enterLoopThreeMembers(TParser::LoopThreeMembersContext * /*ctx*/) override { }
  virtual void exitLoopThreeMembers(TParser::LoopThreeMembersContext * /*ctx*/) override { }

  virtual void enterLoopThreeMembersValues(TParser::LoopThreeMembersValuesContext * /*ctx*/) override { }
  virtual void exitLoopThreeMembersValues(TParser::LoopThreeMembersValuesContext * /*ctx*/) override { }

  virtual void enterBlockBreak(TParser::BlockBreakContext * /*ctx*/) override { }
  virtual void exitBlockBreak(TParser::BlockBreakContext * /*ctx*/) override { }

  virtual void enterBlockNext(TParser::BlockNextContext * /*ctx*/) override { }
  virtual void exitBlockNext(TParser::BlockNextContext * /*ctx*/) override { }

  virtual void enterBlockTryCatch(TParser::BlockTryCatchContext * /*ctx*/) override { }
  virtual void exitBlockTryCatch(TParser::BlockTryCatchContext * /*ctx*/) override { }

  virtual void enterTryUniqueElement(TParser::TryUniqueElementContext * /*ctx*/) override { }
  virtual void exitTryUniqueElement(TParser::TryUniqueElementContext * /*ctx*/) override { }

  virtual void enterCatchUniqueElement(TParser::CatchUniqueElementContext * /*ctx*/) override { }
  virtual void exitCatchUniqueElement(TParser::CatchUniqueElementContext * /*ctx*/) override { }

  virtual void enterTryCatchElements(TParser::TryCatchElementsContext * /*ctx*/) override { }
  virtual void exitTryCatchElements(TParser::TryCatchElementsContext * /*ctx*/) override { }

  virtual void enterBlockFunction(TParser::BlockFunctionContext * /*ctx*/) override { }
  virtual void exitBlockFunction(TParser::BlockFunctionContext * /*ctx*/) override { }

  virtual void enterBlockFunctionDeclarationAttr(TParser::BlockFunctionDeclarationAttrContext * /*ctx*/) override { }
  virtual void exitBlockFunctionDeclarationAttr(TParser::BlockFunctionDeclarationAttrContext * /*ctx*/) override { }

  virtual void enterFunctionParam(TParser::FunctionParamContext * /*ctx*/) override { }
  virtual void exitFunctionParam(TParser::FunctionParamContext * /*ctx*/) override { }

  virtual void enterFunctionAnonymousParam(TParser::FunctionAnonymousParamContext * /*ctx*/) override { }
  virtual void exitFunctionAnonymousParam(TParser::FunctionAnonymousParamContext * /*ctx*/) override { }

  virtual void enterFunctionCodeBlock(TParser::FunctionCodeBlockContext * /*ctx*/) override { }
  virtual void exitFunctionCodeBlock(TParser::FunctionCodeBlockContext * /*ctx*/) override { }

  virtual void enterBlockInterface(TParser::BlockInterfaceContext * /*ctx*/) override { }
  virtual void exitBlockInterface(TParser::BlockInterfaceContext * /*ctx*/) override { }

  virtual void enterInterfaceCodeBlock(TParser::InterfaceCodeBlockContext * /*ctx*/) override { }
  virtual void exitInterfaceCodeBlock(TParser::InterfaceCodeBlockContext * /*ctx*/) override { }

  virtual void enterBlockAbstraction(TParser::BlockAbstractionContext * /*ctx*/) override { }
  virtual void exitBlockAbstraction(TParser::BlockAbstractionContext * /*ctx*/) override { }

  virtual void enterAbstractionCodeBlock(TParser::AbstractionCodeBlockContext * /*ctx*/) override { }
  virtual void exitAbstractionCodeBlock(TParser::AbstractionCodeBlockContext * /*ctx*/) override { }

  virtual void enterBlockClass(TParser::BlockClassContext * /*ctx*/) override { }
  virtual void exitBlockClass(TParser::BlockClassContext * /*ctx*/) override { }

  virtual void enterBlockClassDeclarationAttr(TParser::BlockClassDeclarationAttrContext * /*ctx*/) override { }
  virtual void exitBlockClassDeclarationAttr(TParser::BlockClassDeclarationAttrContext * /*ctx*/) override { }

  virtual void enterClassAnonymousParam(TParser::ClassAnonymousParamContext * /*ctx*/) override { }
  virtual void exitClassAnonymousParam(TParser::ClassAnonymousParamContext * /*ctx*/) override { }

  virtual void enterClassCodeBlock(TParser::ClassCodeBlockContext * /*ctx*/) override { }
  virtual void exitClassCodeBlock(TParser::ClassCodeBlockContext * /*ctx*/) override { }

  virtual void enterBlockArray(TParser::BlockArrayContext * /*ctx*/) override { }
  virtual void exitBlockArray(TParser::BlockArrayContext * /*ctx*/) override { }

  virtual void enterIndexArray(TParser::IndexArrayContext * /*ctx*/) override { }
  virtual void exitIndexArray(TParser::IndexArrayContext * /*ctx*/) override { }

  virtual void enterIndexArrayElements(TParser::IndexArrayElementsContext * /*ctx*/) override { }
  virtual void exitIndexArrayElements(TParser::IndexArrayElementsContext * /*ctx*/) override { }

  virtual void enterAssociativeArray(TParser::AssociativeArrayContext * /*ctx*/) override { }
  virtual void exitAssociativeArray(TParser::AssociativeArrayContext * /*ctx*/) override { }

  virtual void enterAssociativeArrayElements(TParser::AssociativeArrayElementsContext * /*ctx*/) override { }
  virtual void exitAssociativeArrayElements(TParser::AssociativeArrayElementsContext * /*ctx*/) override { }

  virtual void enterBlockLambdaFunctions(TParser::BlockLambdaFunctionsContext * /*ctx*/) override { }
  virtual void exitBlockLambdaFunctions(TParser::BlockLambdaFunctionsContext * /*ctx*/) override { }

  virtual void enterLambdaFnParams(TParser::LambdaFnParamsContext * /*ctx*/) override { }
  virtual void exitLambdaFnParams(TParser::LambdaFnParamsContext * /*ctx*/) override { }

  virtual void enterLambdaFnCodeBlock(TParser::LambdaFnCodeBlockContext * /*ctx*/) override { }
  virtual void exitLambdaFnCodeBlock(TParser::LambdaFnCodeBlockContext * /*ctx*/) override { }

  virtual void enterBlockClassConstructor(TParser::BlockClassConstructorContext * /*ctx*/) override { }
  virtual void exitBlockClassConstructor(TParser::BlockClassConstructorContext * /*ctx*/) override { }

  virtual void enterBlockFunctionCall(TParser::BlockFunctionCallContext * /*ctx*/) override { }
  virtual void exitBlockFunctionCall(TParser::BlockFunctionCallContext * /*ctx*/) override { }

  virtual void enterFunctionCallElements(TParser::FunctionCallElementsContext * /*ctx*/) override { }
  virtual void exitFunctionCallElements(TParser::FunctionCallElementsContext * /*ctx*/) override { }

  virtual void enterBlockAttribution(TParser::BlockAttributionContext * /*ctx*/) override { }
  virtual void exitBlockAttribution(TParser::BlockAttributionContext * /*ctx*/) override { }

  virtual void enterAttributionElements(TParser::AttributionElementsContext * /*ctx*/) override { }
  virtual void exitAttributionElements(TParser::AttributionElementsContext * /*ctx*/) override { }

  virtual void enterBlockPermissionTokens(TParser::BlockPermissionTokensContext * /*ctx*/) override { }
  virtual void exitBlockPermissionTokens(TParser::BlockPermissionTokensContext * /*ctx*/) override { }

  virtual void enterCodeBlockFlowControl(TParser::CodeBlockFlowControlContext * /*ctx*/) override { }
  virtual void exitCodeBlockFlowControl(TParser::CodeBlockFlowControlContext * /*ctx*/) override { }

  virtual void enterCodeBlockFlowControlElements(TParser::CodeBlockFlowControlElementsContext * /*ctx*/) override { }
  virtual void exitCodeBlockFlowControlElements(TParser::CodeBlockFlowControlElementsContext * /*ctx*/) override { }

  virtual void enterCodeBlockControl(TParser::CodeBlockControlContext * /*ctx*/) override { }
  virtual void exitCodeBlockControl(TParser::CodeBlockControlContext * /*ctx*/) override { }

  virtual void enterGeneralValue(TParser::GeneralValueContext * /*ctx*/) override { }
  virtual void exitGeneralValue(TParser::GeneralValueContext * /*ctx*/) override { }

  virtual void enterGeneralValueBlock(TParser::GeneralValueBlockContext * /*ctx*/) override { }
  virtual void exitGeneralValueBlock(TParser::GeneralValueBlockContext * /*ctx*/) override { }

  virtual void enterGeneralValueItems(TParser::GeneralValueItemsContext * /*ctx*/) override { }
  virtual void exitGeneralValueItems(TParser::GeneralValueItemsContext * /*ctx*/) override { }

  virtual void enterGeneralValueElements(TParser::GeneralValueElementsContext * /*ctx*/) override { }
  virtual void exitGeneralValueElements(TParser::GeneralValueElementsContext * /*ctx*/) override { }

  virtual void enterIdentifier(TParser::IdentifierContext * /*ctx*/) override { }
  virtual void exitIdentifier(TParser::IdentifierContext * /*ctx*/) override { }

  virtual void enterIdentifierB(TParser::IdentifierBContext * /*ctx*/) override { }
  virtual void exitIdentifierB(TParser::IdentifierBContext * /*ctx*/) override { }

  virtual void enterIdentifierC(TParser::IdentifierCContext * /*ctx*/) override { }
  virtual void exitIdentifierC(TParser::IdentifierCContext * /*ctx*/) override { }

  virtual void enterIdentifierD(TParser::IdentifierDContext * /*ctx*/) override { }
  virtual void exitIdentifierD(TParser::IdentifierDContext * /*ctx*/) override { }

  virtual void enterIncDecOperatorsA(TParser::IncDecOperatorsAContext * /*ctx*/) override { }
  virtual void exitIncDecOperatorsA(TParser::IncDecOperatorsAContext * /*ctx*/) override { }

  virtual void enterIncDecOperatorsB(TParser::IncDecOperatorsBContext * /*ctx*/) override { }
  virtual void exitIncDecOperatorsB(TParser::IncDecOperatorsBContext * /*ctx*/) override { }

  virtual void enterOpenOpA(TParser::OpenOpAContext * /*ctx*/) override { }
  virtual void exitOpenOpA(TParser::OpenOpAContext * /*ctx*/) override { }

  virtual void enterCloseOpA(TParser::CloseOpAContext * /*ctx*/) override { }
  virtual void exitCloseOpA(TParser::CloseOpAContext * /*ctx*/) override { }


  virtual void enterEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void exitEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void visitTerminal(antlr4::tree::TerminalNode * /*node*/) override { }
  virtual void visitErrorNode(antlr4::tree::ErrorNode * /*node*/) override { }

};

}  // namespace verbum
