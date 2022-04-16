
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

    virtual antlrcpp::Any visitSentences(TParser::SentencesContext *context) = 0;

    virtual antlrcpp::Any visitStatements(TParser::StatementsContext *context) = 0;

    virtual antlrcpp::Any visitBlockComments(TParser::BlockCommentsContext *context) = 0;

    virtual antlrcpp::Any visitBlockUse(TParser::BlockUseContext *context) = 0;

    virtual antlrcpp::Any visitUseValue(TParser::UseValueContext *context) = 0;

    virtual antlrcpp::Any visitUseString(TParser::UseStringContext *context) = 0;

    virtual antlrcpp::Any visitBlockVariable(TParser::BlockVariableContext *context) = 0;

    virtual antlrcpp::Any visitVariableItem(TParser::VariableItemContext *context) = 0;

    virtual antlrcpp::Any visitVariablePrefixModes(TParser::VariablePrefixModesContext *context) = 0;

    virtual antlrcpp::Any visitVisibilityItems(TParser::VisibilityItemsContext *context) = 0;

    virtual antlrcpp::Any visitMethodVisibility(TParser::MethodVisibilityContext *context) = 0;

    virtual antlrcpp::Any visitVariableValue(TParser::VariableValueContext *context) = 0;

    virtual antlrcpp::Any visitFunctionCall(TParser::FunctionCallContext *context) = 0;

    virtual antlrcpp::Any visitFunctionCallPrefix(TParser::FunctionCallPrefixContext *context) = 0;

    virtual antlrcpp::Any visitFunctionCallParam(TParser::FunctionCallParamContext *context) = 0;

    virtual antlrcpp::Any visitFunctionCallParamElements(TParser::FunctionCallParamElementsContext *context) = 0;

    virtual antlrcpp::Any visitGeneralValue(TParser::GeneralValueContext *context) = 0;

    virtual antlrcpp::Any visitGeneralValueBlock(TParser::GeneralValueBlockContext *context) = 0;

    virtual antlrcpp::Any visitGeneralValueItems(TParser::GeneralValueItemsContext *context) = 0;

    virtual antlrcpp::Any visitIdentifier(TParser::IdentifierContext *context) = 0;

    virtual antlrcpp::Any visitIncDecOperatorsA(TParser::IncDecOperatorsAContext *context) = 0;

    virtual antlrcpp::Any visitIncDecOperatorsB(TParser::IncDecOperatorsBContext *context) = 0;

    virtual antlrcpp::Any visitBlockLiveTokens(TParser::BlockLiveTokensContext *context) = 0;


};

}  // namespace verbum
