
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

    virtual antlrcpp::Any visitLiveTokens(TParser::LiveTokensContext *context) = 0;

    virtual antlrcpp::Any visitComment(TParser::CommentContext *context) = 0;

    virtual antlrcpp::Any visitUse(TParser::UseContext *context) = 0;

    virtual antlrcpp::Any visitUseValue(TParser::UseValueContext *context) = 0;

    virtual antlrcpp::Any visitUseString(TParser::UseStringContext *context) = 0;

    virtual antlrcpp::Any visitVariable(TParser::VariableContext *context) = 0;

    virtual antlrcpp::Any visitVariableMembers(TParser::VariableMembersContext *context) = 0;

    virtual antlrcpp::Any visitVariableDefinition(TParser::VariableDefinitionContext *context) = 0;

    virtual antlrcpp::Any visitVariableValue(TParser::VariableValueContext *context) = 0;

    virtual antlrcpp::Any visitGeneralValue(TParser::GeneralValueContext *context) = 0;


};

}  // namespace verbum
