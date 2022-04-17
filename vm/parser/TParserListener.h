
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

  virtual void enterSentences(TParser::SentencesContext *ctx) = 0;
  virtual void exitSentences(TParser::SentencesContext *ctx) = 0;

  virtual void enterStatements(TParser::StatementsContext *ctx) = 0;
  virtual void exitStatements(TParser::StatementsContext *ctx) = 0;

  virtual void enterBlockCode(TParser::BlockCodeContext *ctx) = 0;
  virtual void exitBlockCode(TParser::BlockCodeContext *ctx) = 0;

  virtual void enterBlockComments(TParser::BlockCommentsContext *ctx) = 0;
  virtual void exitBlockComments(TParser::BlockCommentsContext *ctx) = 0;

  virtual void enterBlockUse(TParser::BlockUseContext *ctx) = 0;
  virtual void exitBlockUse(TParser::BlockUseContext *ctx) = 0;

  virtual void enterUseValue(TParser::UseValueContext *ctx) = 0;
  virtual void exitUseValue(TParser::UseValueContext *ctx) = 0;

  virtual void enterUseString(TParser::UseStringContext *ctx) = 0;
  virtual void exitUseString(TParser::UseStringContext *ctx) = 0;

  virtual void enterBlockVariable(TParser::BlockVariableContext *ctx) = 0;
  virtual void exitBlockVariable(TParser::BlockVariableContext *ctx) = 0;

  virtual void enterVariableItem(TParser::VariableItemContext *ctx) = 0;
  virtual void exitVariableItem(TParser::VariableItemContext *ctx) = 0;

  virtual void enterVariablePrefixModes(TParser::VariablePrefixModesContext *ctx) = 0;
  virtual void exitVariablePrefixModes(TParser::VariablePrefixModesContext *ctx) = 0;

  virtual void enterFunctionCall(TParser::FunctionCallContext *ctx) = 0;
  virtual void exitFunctionCall(TParser::FunctionCallContext *ctx) = 0;

  virtual void enterFunctionCallPrefix(TParser::FunctionCallPrefixContext *ctx) = 0;
  virtual void exitFunctionCallPrefix(TParser::FunctionCallPrefixContext *ctx) = 0;

  virtual void enterFunctionCallParam(TParser::FunctionCallParamContext *ctx) = 0;
  virtual void exitFunctionCallParam(TParser::FunctionCallParamContext *ctx) = 0;

  virtual void enterFunctionCallParamElements(TParser::FunctionCallParamElementsContext *ctx) = 0;
  virtual void exitFunctionCallParamElements(TParser::FunctionCallParamElementsContext *ctx) = 0;

  virtual void enterBlockRet(TParser::BlockRetContext *ctx) = 0;
  virtual void exitBlockRet(TParser::BlockRetContext *ctx) = 0;

  virtual void enterBlockConditional(TParser::BlockConditionalContext *ctx) = 0;
  virtual void exitBlockConditional(TParser::BlockConditionalContext *ctx) = 0;

  virtual void enterIfElementUnique(TParser::IfElementUniqueContext *ctx) = 0;
  virtual void exitIfElementUnique(TParser::IfElementUniqueContext *ctx) = 0;

  virtual void enterElifElements(TParser::ElifElementsContext *ctx) = 0;
  virtual void exitElifElements(TParser::ElifElementsContext *ctx) = 0;

  virtual void enterElifElementUnique(TParser::ElifElementUniqueContext *ctx) = 0;
  virtual void exitElifElementUnique(TParser::ElifElementUniqueContext *ctx) = 0;

  virtual void enterElseElementUnique(TParser::ElseElementUniqueContext *ctx) = 0;
  virtual void exitElseElementUnique(TParser::ElseElementUniqueContext *ctx) = 0;

  virtual void enterConditionalBlockExpression(TParser::ConditionalBlockExpressionContext *ctx) = 0;
  virtual void exitConditionalBlockExpression(TParser::ConditionalBlockExpressionContext *ctx) = 0;

  virtual void enterConditionalBlockElements(TParser::ConditionalBlockElementsContext *ctx) = 0;
  virtual void exitConditionalBlockElements(TParser::ConditionalBlockElementsContext *ctx) = 0;

  virtual void enterBlockLoop(TParser::BlockLoopContext *ctx) = 0;
  virtual void exitBlockLoop(TParser::BlockLoopContext *ctx) = 0;

  virtual void enterLoopBlockElements(TParser::LoopBlockElementsContext *ctx) = 0;
  virtual void exitLoopBlockElements(TParser::LoopBlockElementsContext *ctx) = 0;

  virtual void enterLoopComplete(TParser::LoopCompleteContext *ctx) = 0;
  virtual void exitLoopComplete(TParser::LoopCompleteContext *ctx) = 0;

  virtual void enterLoopConditional(TParser::LoopConditionalContext *ctx) = 0;
  virtual void exitLoopConditional(TParser::LoopConditionalContext *ctx) = 0;

  virtual void enterLoopInfinite(TParser::LoopInfiniteContext *ctx) = 0;
  virtual void exitLoopInfinite(TParser::LoopInfiniteContext *ctx) = 0;

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

  virtual void enterBlockTryCatch(TParser::BlockTryCatchContext *ctx) = 0;
  virtual void exitBlockTryCatch(TParser::BlockTryCatchContext *ctx) = 0;

  virtual void enterTryUniqueElement(TParser::TryUniqueElementContext *ctx) = 0;
  virtual void exitTryUniqueElement(TParser::TryUniqueElementContext *ctx) = 0;

  virtual void enterCatchUniqueElement(TParser::CatchUniqueElementContext *ctx) = 0;
  virtual void exitCatchUniqueElement(TParser::CatchUniqueElementContext *ctx) = 0;

  virtual void enterTryCatchElements(TParser::TryCatchElementsContext *ctx) = 0;
  virtual void exitTryCatchElements(TParser::TryCatchElementsContext *ctx) = 0;

  virtual void enterBlockFunction(TParser::BlockFunctionContext *ctx) = 0;
  virtual void exitBlockFunction(TParser::BlockFunctionContext *ctx) = 0;

  virtual void enterFunctionParam(TParser::FunctionParamContext *ctx) = 0;
  virtual void exitFunctionParam(TParser::FunctionParamContext *ctx) = 0;

  virtual void enterFunctionCodeBlock(TParser::FunctionCodeBlockContext *ctx) = 0;
  virtual void exitFunctionCodeBlock(TParser::FunctionCodeBlockContext *ctx) = 0;

  virtual void enterBlockInterface(TParser::BlockInterfaceContext *ctx) = 0;
  virtual void exitBlockInterface(TParser::BlockInterfaceContext *ctx) = 0;

  virtual void enterInterfaceCodeBlock(TParser::InterfaceCodeBlockContext *ctx) = 0;
  virtual void exitInterfaceCodeBlock(TParser::InterfaceCodeBlockContext *ctx) = 0;

  virtual void enterBlockAbstraction(TParser::BlockAbstractionContext *ctx) = 0;
  virtual void exitBlockAbstraction(TParser::BlockAbstractionContext *ctx) = 0;

  virtual void enterAbstractionCodeBlock(TParser::AbstractionCodeBlockContext *ctx) = 0;
  virtual void exitAbstractionCodeBlock(TParser::AbstractionCodeBlockContext *ctx) = 0;

  virtual void enterCodeBlockFlowControl(TParser::CodeBlockFlowControlContext *ctx) = 0;
  virtual void exitCodeBlockFlowControl(TParser::CodeBlockFlowControlContext *ctx) = 0;

  virtual void enterCodeBlockFlowControlElements(TParser::CodeBlockFlowControlElementsContext *ctx) = 0;
  virtual void exitCodeBlockFlowControlElements(TParser::CodeBlockFlowControlElementsContext *ctx) = 0;

  virtual void enterCodeBlockControl(TParser::CodeBlockControlContext *ctx) = 0;
  virtual void exitCodeBlockControl(TParser::CodeBlockControlContext *ctx) = 0;

  virtual void enterGeneralValue(TParser::GeneralValueContext *ctx) = 0;
  virtual void exitGeneralValue(TParser::GeneralValueContext *ctx) = 0;

  virtual void enterGeneralValueBlock(TParser::GeneralValueBlockContext *ctx) = 0;
  virtual void exitGeneralValueBlock(TParser::GeneralValueBlockContext *ctx) = 0;

  virtual void enterGeneralValueItems(TParser::GeneralValueItemsContext *ctx) = 0;
  virtual void exitGeneralValueItems(TParser::GeneralValueItemsContext *ctx) = 0;

  virtual void enterGeneralValueElements(TParser::GeneralValueElementsContext *ctx) = 0;
  virtual void exitGeneralValueElements(TParser::GeneralValueElementsContext *ctx) = 0;

  virtual void enterIdentifier(TParser::IdentifierContext *ctx) = 0;
  virtual void exitIdentifier(TParser::IdentifierContext *ctx) = 0;

  virtual void enterIdentifierB(TParser::IdentifierBContext *ctx) = 0;
  virtual void exitIdentifierB(TParser::IdentifierBContext *ctx) = 0;

  virtual void enterIncDecOperatorsA(TParser::IncDecOperatorsAContext *ctx) = 0;
  virtual void exitIncDecOperatorsA(TParser::IncDecOperatorsAContext *ctx) = 0;

  virtual void enterIncDecOperatorsB(TParser::IncDecOperatorsBContext *ctx) = 0;
  virtual void exitIncDecOperatorsB(TParser::IncDecOperatorsBContext *ctx) = 0;

  virtual void enterBlockLiveTokens(TParser::BlockLiveTokensContext *ctx) = 0;
  virtual void exitBlockLiveTokens(TParser::BlockLiveTokensContext *ctx) = 0;


};

}  // namespace verbum
