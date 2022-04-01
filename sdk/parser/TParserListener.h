
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

  virtual void enterVariableMembers(TParser::VariableMembersContext *ctx) = 0;
  virtual void exitVariableMembers(TParser::VariableMembersContext *ctx) = 0;

  virtual void enterVariableDefinition(TParser::VariableDefinitionContext *ctx) = 0;
  virtual void exitVariableDefinition(TParser::VariableDefinitionContext *ctx) = 0;

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

  virtual void enterBlockElements(TParser::BlockElementsContext *ctx) = 0;
  virtual void exitBlockElements(TParser::BlockElementsContext *ctx) = 0;

  virtual void enterIfConditions(TParser::IfConditionsContext *ctx) = 0;
  virtual void exitIfConditions(TParser::IfConditionsContext *ctx) = 0;

  virtual void enterElifConditions(TParser::ElifConditionsContext *ctx) = 0;
  virtual void exitElifConditions(TParser::ElifConditionsContext *ctx) = 0;

  virtual void enterElseConditions(TParser::ElseConditionsContext *ctx) = 0;
  virtual void exitElseConditions(TParser::ElseConditionsContext *ctx) = 0;

  virtual void enterBlockElementsLimited(TParser::BlockElementsLimitedContext *ctx) = 0;
  virtual void exitBlockElementsLimited(TParser::BlockElementsLimitedContext *ctx) = 0;

  virtual void enterConditionalExpressionElements(TParser::ConditionalExpressionElementsContext *ctx) = 0;
  virtual void exitConditionalExpressionElements(TParser::ConditionalExpressionElementsContext *ctx) = 0;

  virtual void enterConditionalExpElementsValue(TParser::ConditionalExpElementsValueContext *ctx) = 0;
  virtual void exitConditionalExpElementsValue(TParser::ConditionalExpElementsValueContext *ctx) = 0;

  virtual void enterConditionExpBlock(TParser::ConditionExpBlockContext *ctx) = 0;
  virtual void exitConditionExpBlock(TParser::ConditionExpBlockContext *ctx) = 0;

  virtual void enterConditionalExpValue(TParser::ConditionalExpValueContext *ctx) = 0;
  virtual void exitConditionalExpValue(TParser::ConditionalExpValueContext *ctx) = 0;

  virtual void enterGeneralValue(TParser::GeneralValueContext *ctx) = 0;
  virtual void exitGeneralValue(TParser::GeneralValueContext *ctx) = 0;


};

}  // namespace verbum
