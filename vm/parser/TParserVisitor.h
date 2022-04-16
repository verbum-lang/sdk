
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

    virtual antlrcpp::Any visitBlockOop(TParser::BlockOopContext *context) = 0;

    virtual antlrcpp::Any visitInterfaceClass(TParser::InterfaceClassContext *context) = 0;

    virtual antlrcpp::Any visitInterfaceClassDefinition(TParser::InterfaceClassDefinitionContext *context) = 0;

    virtual antlrcpp::Any visitInterfaceCodeBlock(TParser::InterfaceCodeBlockContext *context) = 0;

    virtual antlrcpp::Any visitFunctionCodeBlockElements(TParser::FunctionCodeBlockElementsContext *context) = 0;

    virtual antlrcpp::Any visitIdentifierB(TParser::IdentifierBContext *context) = 0;

    virtual antlrcpp::Any visitBlockLiveTokens(TParser::BlockLiveTokensContext *context) = 0;


};

}  // namespace verbum
