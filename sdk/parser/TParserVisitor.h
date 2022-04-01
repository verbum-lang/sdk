
// Generated from ./TParser.g4 by ANTLR 4.9.2

#pragma once


#include "antlr4-runtime.h"
#include "TParser.h"


namespace verbum {

/**
 * This class defines an abstract visitor for a parse tree
 * produced by TParser.
 */
class  TParserVisitor : public antlr4::tree::AbstractParseTreeVisitor {
public:

  /**
   * Visit parse trees produced by TParser.
   */
    virtual antlrcpp::Any visitMain(TParser::MainContext *context) = 0;

    virtual antlrcpp::Any visitFileContent(TParser::FileContentContext *context) = 0;

    virtual antlrcpp::Any visitSentence(TParser::SentenceContext *context) = 0;

    virtual antlrcpp::Any visitLiveToken(TParser::LiveTokenContext *context) = 0;

    virtual antlrcpp::Any visitUse(TParser::UseContext *context) = 0;

    virtual antlrcpp::Any visitUseValue(TParser::UseValueContext *context) = 0;

    virtual antlrcpp::Any visitUseString(TParser::UseStringContext *context) = 0;

    virtual antlrcpp::Any visitVariable(TParser::VariableContext *context) = 0;

    virtual antlrcpp::Any visitVariableMembers(TParser::VariableMembersContext *context) = 0;

    virtual antlrcpp::Any visitVariableDefinition(TParser::VariableDefinitionContext *context) = 0;

    virtual antlrcpp::Any visitIndexArray(TParser::IndexArrayContext *context) = 0;

    virtual antlrcpp::Any visitIndexArrayElements(TParser::IndexArrayElementsContext *context) = 0;

    virtual antlrcpp::Any visitAssociativeArray(TParser::AssociativeArrayContext *context) = 0;

    virtual antlrcpp::Any visitAssociativeArrayElements(TParser::AssociativeArrayElementsContext *context) = 0;

    virtual antlrcpp::Any visitOperationBlock(TParser::OperationBlockContext *context) = 0;

    virtual antlrcpp::Any visitOperationElements(TParser::OperationElementsContext *context) = 0;

    virtual antlrcpp::Any visitOperationValue(TParser::OperationValueContext *context) = 0;

    virtual antlrcpp::Any visitFirstIncDec(TParser::FirstIncDecContext *context) = 0;

    virtual antlrcpp::Any visitLastIncDec(TParser::LastIncDecContext *context) = 0;

    virtual antlrcpp::Any visitCallingFunction(TParser::CallingFunctionContext *context) = 0;

    virtual antlrcpp::Any visitFunctionCall(TParser::FunctionCallContext *context) = 0;

    virtual antlrcpp::Any visitIdentifierB(TParser::IdentifierBContext *context) = 0;

    virtual antlrcpp::Any visitFunctionCallParam(TParser::FunctionCallParamContext *context) = 0;

    virtual antlrcpp::Any visitFunctionCallParamElements(TParser::FunctionCallParamElementsContext *context) = 0;

    virtual antlrcpp::Any visitConditionalExpression(TParser::ConditionalExpressionContext *context) = 0;

    virtual antlrcpp::Any visitConditionalBlockElements(TParser::ConditionalBlockElementsContext *context) = 0;

    virtual antlrcpp::Any visitIfConditions(TParser::IfConditionsContext *context) = 0;

    virtual antlrcpp::Any visitElifConditions(TParser::ElifConditionsContext *context) = 0;

    virtual antlrcpp::Any visitElseConditions(TParser::ElseConditionsContext *context) = 0;

    virtual antlrcpp::Any visitCondBlockElementsLimited(TParser::CondBlockElementsLimitedContext *context) = 0;

    virtual antlrcpp::Any visitConditionalExpressionElements(TParser::ConditionalExpressionElementsContext *context) = 0;

    virtual antlrcpp::Any visitConditionalExpElementsValue(TParser::ConditionalExpElementsValueContext *context) = 0;

    virtual antlrcpp::Any visitConditionExpBlock(TParser::ConditionExpBlockContext *context) = 0;

    virtual antlrcpp::Any visitConditionalExpValue(TParser::ConditionalExpValueContext *context) = 0;

    virtual antlrcpp::Any visitLoop(TParser::LoopContext *context) = 0;

    virtual antlrcpp::Any visitLoopExpression(TParser::LoopExpressionContext *context) = 0;

    virtual antlrcpp::Any visitLoopOneMembers(TParser::LoopOneMembersContext *context) = 0;

    virtual antlrcpp::Any visitLoopTwoMembers(TParser::LoopTwoMembersContext *context) = 0;

    virtual antlrcpp::Any visitLoopThreeMembers(TParser::LoopThreeMembersContext *context) = 0;

    virtual antlrcpp::Any visitLoopThreeMembersValues(TParser::LoopThreeMembersValuesContext *context) = 0;

    virtual antlrcpp::Any visitLoopBlockElements(TParser::LoopBlockElementsContext *context) = 0;

    virtual antlrcpp::Any visitLoopBlockElementsLimited(TParser::LoopBlockElementsLimitedContext *context) = 0;

    virtual antlrcpp::Any visitRet(TParser::RetContext *context) = 0;

    virtual antlrcpp::Any visitRetValues(TParser::RetValuesContext *context) = 0;

    virtual antlrcpp::Any visitFunctions(TParser::FunctionsContext *context) = 0;

    virtual antlrcpp::Any visitFunctionGeneralModes(TParser::FunctionGeneralModesContext *context) = 0;

    virtual antlrcpp::Any visitFunctionsModes(TParser::FunctionsModesContext *context) = 0;

    virtual antlrcpp::Any visitFunctionMethodsModes(TParser::FunctionMethodsModesContext *context) = 0;

    virtual antlrcpp::Any visitMethodPerm(TParser::MethodPermContext *context) = 0;

    virtual antlrcpp::Any visitConstructClassMethod(TParser::ConstructClassMethodContext *context) = 0;

    virtual antlrcpp::Any visitInterfaceMethod(TParser::InterfaceMethodContext *context) = 0;

    virtual antlrcpp::Any visitFunctionCodeBlock(TParser::FunctionCodeBlockContext *context) = 0;

    virtual antlrcpp::Any visitFunctionParams(TParser::FunctionParamsContext *context) = 0;

    virtual antlrcpp::Any visitFunctionParamElements(TParser::FunctionParamElementsContext *context) = 0;

    virtual antlrcpp::Any visitGeneralValue(TParser::GeneralValueContext *context) = 0;


};

}  // namespace verbum
