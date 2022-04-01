
// Generated from ./TParser.g4 by ANTLR 4.9.2


#include "TParserListener.h"
#include "TParserVisitor.h"

#include "TParser.h"


  #ifndef _WIN32
  #pragma GCC diagnostic ignored "-Wunused-parameter"
  #endif


using namespace antlrcpp;
using namespace verbum;
using namespace antlr4;

TParser::TParser(TokenStream *input) : Parser(input) {
  _interpreter = new atn::ParserATNSimulator(this, _atn, _decisionToDFA, _sharedContextCache);
}

TParser::~TParser() {
  delete _interpreter;
}

std::string TParser::getGrammarFileName() const {
  return "TParser.g4";
}

const std::vector<std::string>& TParser::getRuleNames() const {
  return _ruleNames;
}

dfa::Vocabulary& TParser::getVocabulary() const {
  return _vocabulary;
}


//----------------- MainContext ------------------------------------------------------------------

TParser::MainContext::MainContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FileContentContext* TParser::MainContext::fileContent() {
  return getRuleContext<TParser::FileContentContext>(0);
}

tree::TerminalNode* TParser::MainContext::EOF() {
  return getToken(TParser::EOF, 0);
}


size_t TParser::MainContext::getRuleIndex() const {
  return TParser::RuleMain;
}

void TParser::MainContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterMain(this);
}

void TParser::MainContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitMain(this);
}


antlrcpp::Any TParser::MainContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitMain(this);
  else
    return visitor->visitChildren(this);
}

TParser::MainContext* TParser::main() {
  MainContext *_localctx = _tracker.createInstance<MainContext>(_ctx, getState());
  enterRule(_localctx, 0, TParser::RuleMain);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(70);
    fileContent(0);
    setState(71);
    match(TParser::EOF);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FileContentContext ------------------------------------------------------------------

TParser::FileContentContext::FileContentContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FileContentContext* TParser::FileContentContext::fileContent() {
  return getRuleContext<TParser::FileContentContext>(0);
}

TParser::SentenceContext* TParser::FileContentContext::sentence() {
  return getRuleContext<TParser::SentenceContext>(0);
}


size_t TParser::FileContentContext::getRuleIndex() const {
  return TParser::RuleFileContent;
}

void TParser::FileContentContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFileContent(this);
}

void TParser::FileContentContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFileContent(this);
}


antlrcpp::Any TParser::FileContentContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFileContent(this);
  else
    return visitor->visitChildren(this);
}


TParser::FileContentContext* TParser::fileContent() {
   return fileContent(0);
}

TParser::FileContentContext* TParser::fileContent(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  TParser::FileContentContext *_localctx = _tracker.createInstance<FileContentContext>(_ctx, parentState);
  TParser::FileContentContext *previousContext = _localctx;
  (void)previousContext; // Silence compiler, in case the context is not used by generated code.
  size_t startState = 2;
  enterRecursionRule(_localctx, 2, TParser::RuleFileContent, precedence);

    

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    _ctx->stop = _input->LT(-1);
    setState(78);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 0, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        _localctx = _tracker.createInstance<FileContentContext>(parentContext, parentState);
        pushNewRecursionContext(_localctx, startState, RuleFileContent);
        setState(74);

        if (!(precpred(_ctx, 2))) throw FailedPredicateException(this, "precpred(_ctx, 2)");
        setState(75);
        sentence(); 
      }
      setState(80);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 0, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- SentenceContext ------------------------------------------------------------------

TParser::SentenceContext::SentenceContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::LiveTokenContext* TParser::SentenceContext::liveToken() {
  return getRuleContext<TParser::LiveTokenContext>(0);
}

TParser::UseContext* TParser::SentenceContext::use() {
  return getRuleContext<TParser::UseContext>(0);
}

TParser::VariableContext* TParser::SentenceContext::variable() {
  return getRuleContext<TParser::VariableContext>(0);
}

TParser::CallingFunctionContext* TParser::SentenceContext::callingFunction() {
  return getRuleContext<TParser::CallingFunctionContext>(0);
}

TParser::ConditionalExpressionContext* TParser::SentenceContext::conditionalExpression() {
  return getRuleContext<TParser::ConditionalExpressionContext>(0);
}


size_t TParser::SentenceContext::getRuleIndex() const {
  return TParser::RuleSentence;
}

void TParser::SentenceContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterSentence(this);
}

void TParser::SentenceContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitSentence(this);
}


antlrcpp::Any TParser::SentenceContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitSentence(this);
  else
    return visitor->visitChildren(this);
}

TParser::SentenceContext* TParser::sentence() {
  SentenceContext *_localctx = _tracker.createInstance<SentenceContext>(_ctx, getState());
  enterRule(_localctx, 4, TParser::RuleSentence);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(86);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Newline: {
        enterOuterAlt(_localctx, 1);
        setState(81);
        liveToken();
        break;
      }

      case TParser::Use: {
        enterOuterAlt(_localctx, 2);
        setState(82);
        use();
        break;
      }

      case TParser::Var: {
        enterOuterAlt(_localctx, 3);
        setState(83);
        variable();
        break;
      }

      case TParser::Identifier: {
        enterOuterAlt(_localctx, 4);
        setState(84);
        callingFunction();
        break;
      }

      case TParser::If:
      case TParser::Elif:
      case TParser::Else: {
        enterOuterAlt(_localctx, 5);
        setState(85);
        conditionalExpression();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LiveTokenContext ------------------------------------------------------------------

TParser::LiveTokenContext::LiveTokenContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::LiveTokenContext::Newline() {
  return getToken(TParser::Newline, 0);
}


size_t TParser::LiveTokenContext::getRuleIndex() const {
  return TParser::RuleLiveToken;
}

void TParser::LiveTokenContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLiveToken(this);
}

void TParser::LiveTokenContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLiveToken(this);
}


antlrcpp::Any TParser::LiveTokenContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLiveToken(this);
  else
    return visitor->visitChildren(this);
}

TParser::LiveTokenContext* TParser::liveToken() {
  LiveTokenContext *_localctx = _tracker.createInstance<LiveTokenContext>(_ctx, getState());
  enterRule(_localctx, 6, TParser::RuleLiveToken);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(88);
    match(TParser::Newline);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- UseContext ------------------------------------------------------------------

TParser::UseContext::UseContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::UseContext::Use() {
  return getToken(TParser::Use, 0);
}

TParser::UseValueContext* TParser::UseContext::useValue() {
  return getRuleContext<TParser::UseValueContext>(0);
}

tree::TerminalNode* TParser::UseContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::UseContext::getRuleIndex() const {
  return TParser::RuleUse;
}

void TParser::UseContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterUse(this);
}

void TParser::UseContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitUse(this);
}


antlrcpp::Any TParser::UseContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitUse(this);
  else
    return visitor->visitChildren(this);
}

TParser::UseContext* TParser::use() {
  UseContext *_localctx = _tracker.createInstance<UseContext>(_ctx, getState());
  enterRule(_localctx, 8, TParser::RuleUse);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(90);
    match(TParser::Use);
    setState(91);
    useValue();
    setState(92);
    match(TParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- UseValueContext ------------------------------------------------------------------

TParser::UseValueContext::UseValueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::UseStringContext* TParser::UseValueContext::useString() {
  return getRuleContext<TParser::UseStringContext>(0);
}

tree::TerminalNode* TParser::UseValueContext::Separator() {
  return getToken(TParser::Separator, 0);
}

TParser::UseValueContext* TParser::UseValueContext::useValue() {
  return getRuleContext<TParser::UseValueContext>(0);
}


size_t TParser::UseValueContext::getRuleIndex() const {
  return TParser::RuleUseValue;
}

void TParser::UseValueContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterUseValue(this);
}

void TParser::UseValueContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitUseValue(this);
}


antlrcpp::Any TParser::UseValueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitUseValue(this);
  else
    return visitor->visitChildren(this);
}

TParser::UseValueContext* TParser::useValue() {
  UseValueContext *_localctx = _tracker.createInstance<UseValueContext>(_ctx, getState());
  enterRule(_localctx, 10, TParser::RuleUseValue);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(99);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 2, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(94);
      useString();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(95);
      useString();
      setState(96);
      match(TParser::Separator);
      setState(97);
      useValue();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- UseStringContext ------------------------------------------------------------------

TParser::UseStringContext::UseStringContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::UseStringContext::String() {
  return getToken(TParser::String, 0);
}


size_t TParser::UseStringContext::getRuleIndex() const {
  return TParser::RuleUseString;
}

void TParser::UseStringContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterUseString(this);
}

void TParser::UseStringContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitUseString(this);
}


antlrcpp::Any TParser::UseStringContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitUseString(this);
  else
    return visitor->visitChildren(this);
}

TParser::UseStringContext* TParser::useString() {
  UseStringContext *_localctx = _tracker.createInstance<UseStringContext>(_ctx, getState());
  enterRule(_localctx, 12, TParser::RuleUseString);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(101);
    match(TParser::String);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariableContext ------------------------------------------------------------------

TParser::VariableContext::VariableContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::VariableContext::Var() {
  return getToken(TParser::Var, 0);
}

TParser::VariableMembersContext* TParser::VariableContext::variableMembers() {
  return getRuleContext<TParser::VariableMembersContext>(0);
}

tree::TerminalNode* TParser::VariableContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::VariableContext::getRuleIndex() const {
  return TParser::RuleVariable;
}

void TParser::VariableContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVariable(this);
}

void TParser::VariableContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVariable(this);
}


antlrcpp::Any TParser::VariableContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitVariable(this);
  else
    return visitor->visitChildren(this);
}

TParser::VariableContext* TParser::variable() {
  VariableContext *_localctx = _tracker.createInstance<VariableContext>(_ctx, getState());
  enterRule(_localctx, 14, TParser::RuleVariable);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(103);
    match(TParser::Var);
    setState(104);
    variableMembers();
    setState(105);
    match(TParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariableMembersContext ------------------------------------------------------------------

TParser::VariableMembersContext::VariableMembersContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::VariableDefinitionContext* TParser::VariableMembersContext::variableDefinition() {
  return getRuleContext<TParser::VariableDefinitionContext>(0);
}

tree::TerminalNode* TParser::VariableMembersContext::Separator() {
  return getToken(TParser::Separator, 0);
}

TParser::VariableMembersContext* TParser::VariableMembersContext::variableMembers() {
  return getRuleContext<TParser::VariableMembersContext>(0);
}


size_t TParser::VariableMembersContext::getRuleIndex() const {
  return TParser::RuleVariableMembers;
}

void TParser::VariableMembersContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVariableMembers(this);
}

void TParser::VariableMembersContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVariableMembers(this);
}


antlrcpp::Any TParser::VariableMembersContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitVariableMembers(this);
  else
    return visitor->visitChildren(this);
}

TParser::VariableMembersContext* TParser::variableMembers() {
  VariableMembersContext *_localctx = _tracker.createInstance<VariableMembersContext>(_ctx, getState());
  enterRule(_localctx, 16, TParser::RuleVariableMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(112);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 3, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(107);
      variableDefinition();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(108);
      variableDefinition();
      setState(109);
      match(TParser::Separator);
      setState(110);
      variableMembers();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariableDefinitionContext ------------------------------------------------------------------

TParser::VariableDefinitionContext::VariableDefinitionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::VariableDefinitionContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::VariableDefinitionContext::Attr() {
  return getToken(TParser::Attr, 0);
}

TParser::GeneralValueContext* TParser::VariableDefinitionContext::generalValue() {
  return getRuleContext<TParser::GeneralValueContext>(0);
}

tree::TerminalNode* TParser::VariableDefinitionContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}


size_t TParser::VariableDefinitionContext::getRuleIndex() const {
  return TParser::RuleVariableDefinition;
}

void TParser::VariableDefinitionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVariableDefinition(this);
}

void TParser::VariableDefinitionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVariableDefinition(this);
}


antlrcpp::Any TParser::VariableDefinitionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitVariableDefinition(this);
  else
    return visitor->visitChildren(this);
}

TParser::VariableDefinitionContext* TParser::variableDefinition() {
  VariableDefinitionContext *_localctx = _tracker.createInstance<VariableDefinitionContext>(_ctx, getState());
  enterRule(_localctx, 18, TParser::RuleVariableDefinition);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(121);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 4, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(114);
      match(TParser::Identifier);
      setState(115);
      match(TParser::Attr);
      setState(116);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(117);
      match(TParser::Identifier);
      setState(118);
      match(TParser::TypeSpec);
      setState(119);
      match(TParser::Attr);
      setState(120);
      generalValue();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IndexArrayContext ------------------------------------------------------------------

TParser::IndexArrayContext::IndexArrayContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::IndexArrayContext::OpenArIndex() {
  return getToken(TParser::OpenArIndex, 0);
}

tree::TerminalNode* TParser::IndexArrayContext::CloseArIndex() {
  return getToken(TParser::CloseArIndex, 0);
}

TParser::IndexArrayElementsContext* TParser::IndexArrayContext::indexArrayElements() {
  return getRuleContext<TParser::IndexArrayElementsContext>(0);
}


size_t TParser::IndexArrayContext::getRuleIndex() const {
  return TParser::RuleIndexArray;
}

void TParser::IndexArrayContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIndexArray(this);
}

void TParser::IndexArrayContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIndexArray(this);
}


antlrcpp::Any TParser::IndexArrayContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitIndexArray(this);
  else
    return visitor->visitChildren(this);
}

TParser::IndexArrayContext* TParser::indexArray() {
  IndexArrayContext *_localctx = _tracker.createInstance<IndexArrayContext>(_ctx, getState());
  enterRule(_localctx, 20, TParser::RuleIndexArray);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(129);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 5, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(123);
      match(TParser::OpenArIndex);
      setState(124);
      match(TParser::CloseArIndex);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(125);
      match(TParser::OpenArIndex);
      setState(126);
      indexArrayElements();
      setState(127);
      match(TParser::CloseArIndex);
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IndexArrayElementsContext ------------------------------------------------------------------

TParser::IndexArrayElementsContext::IndexArrayElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::GeneralValueContext* TParser::IndexArrayElementsContext::generalValue() {
  return getRuleContext<TParser::GeneralValueContext>(0);
}

tree::TerminalNode* TParser::IndexArrayElementsContext::Separator() {
  return getToken(TParser::Separator, 0);
}

TParser::IndexArrayElementsContext* TParser::IndexArrayElementsContext::indexArrayElements() {
  return getRuleContext<TParser::IndexArrayElementsContext>(0);
}


size_t TParser::IndexArrayElementsContext::getRuleIndex() const {
  return TParser::RuleIndexArrayElements;
}

void TParser::IndexArrayElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIndexArrayElements(this);
}

void TParser::IndexArrayElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIndexArrayElements(this);
}


antlrcpp::Any TParser::IndexArrayElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitIndexArrayElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::IndexArrayElementsContext* TParser::indexArrayElements() {
  IndexArrayElementsContext *_localctx = _tracker.createInstance<IndexArrayElementsContext>(_ctx, getState());
  enterRule(_localctx, 22, TParser::RuleIndexArrayElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(136);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 6, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(131);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(132);
      generalValue();
      setState(133);
      match(TParser::Separator);
      setState(134);
      indexArrayElements();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AssociativeArrayContext ------------------------------------------------------------------

TParser::AssociativeArrayContext::AssociativeArrayContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::AssociativeArrayContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::AssociativeArrayContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::AssociativeArrayElementsContext* TParser::AssociativeArrayContext::associativeArrayElements() {
  return getRuleContext<TParser::AssociativeArrayElementsContext>(0);
}


size_t TParser::AssociativeArrayContext::getRuleIndex() const {
  return TParser::RuleAssociativeArray;
}

void TParser::AssociativeArrayContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAssociativeArray(this);
}

void TParser::AssociativeArrayContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAssociativeArray(this);
}


antlrcpp::Any TParser::AssociativeArrayContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitAssociativeArray(this);
  else
    return visitor->visitChildren(this);
}

TParser::AssociativeArrayContext* TParser::associativeArray() {
  AssociativeArrayContext *_localctx = _tracker.createInstance<AssociativeArrayContext>(_ctx, getState());
  enterRule(_localctx, 24, TParser::RuleAssociativeArray);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(144);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 7, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(138);
      match(TParser::OpenBlock);
      setState(139);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(140);
      match(TParser::OpenBlock);
      setState(141);
      associativeArrayElements();
      setState(142);
      match(TParser::CloseBlock);
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AssociativeArrayElementsContext ------------------------------------------------------------------

TParser::AssociativeArrayElementsContext::AssociativeArrayElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::AssociativeArrayElementsContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::AssociativeArrayElementsContext::TwoPoint() {
  return getToken(TParser::TwoPoint, 0);
}

TParser::GeneralValueContext* TParser::AssociativeArrayElementsContext::generalValue() {
  return getRuleContext<TParser::GeneralValueContext>(0);
}

tree::TerminalNode* TParser::AssociativeArrayElementsContext::Separator() {
  return getToken(TParser::Separator, 0);
}

TParser::AssociativeArrayElementsContext* TParser::AssociativeArrayElementsContext::associativeArrayElements() {
  return getRuleContext<TParser::AssociativeArrayElementsContext>(0);
}


size_t TParser::AssociativeArrayElementsContext::getRuleIndex() const {
  return TParser::RuleAssociativeArrayElements;
}

void TParser::AssociativeArrayElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAssociativeArrayElements(this);
}

void TParser::AssociativeArrayElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAssociativeArrayElements(this);
}


antlrcpp::Any TParser::AssociativeArrayElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitAssociativeArrayElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::AssociativeArrayElementsContext* TParser::associativeArrayElements() {
  AssociativeArrayElementsContext *_localctx = _tracker.createInstance<AssociativeArrayElementsContext>(_ctx, getState());
  enterRule(_localctx, 26, TParser::RuleAssociativeArrayElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(155);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 8, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(146);
      match(TParser::Identifier);
      setState(147);
      match(TParser::TwoPoint);
      setState(148);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(149);
      match(TParser::Identifier);
      setState(150);
      match(TParser::TwoPoint);
      setState(151);
      generalValue();
      setState(152);
      match(TParser::Separator);
      setState(153);
      associativeArrayElements();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- OperationBlockContext ------------------------------------------------------------------

TParser::OperationBlockContext::OperationBlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::OperationBlockContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

TParser::OperationElementsContext* TParser::OperationBlockContext::operationElements() {
  return getRuleContext<TParser::OperationElementsContext>(0);
}

tree::TerminalNode* TParser::OperationBlockContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}


size_t TParser::OperationBlockContext::getRuleIndex() const {
  return TParser::RuleOperationBlock;
}

void TParser::OperationBlockContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterOperationBlock(this);
}

void TParser::OperationBlockContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitOperationBlock(this);
}


antlrcpp::Any TParser::OperationBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitOperationBlock(this);
  else
    return visitor->visitChildren(this);
}

TParser::OperationBlockContext* TParser::operationBlock() {
  OperationBlockContext *_localctx = _tracker.createInstance<OperationBlockContext>(_ctx, getState());
  enterRule(_localctx, 28, TParser::RuleOperationBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(157);
    match(TParser::OpenOp);
    setState(158);
    operationElements();
    setState(159);
    match(TParser::CloseOp);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- OperationElementsContext ------------------------------------------------------------------

TParser::OperationElementsContext::OperationElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::OperationValueContext* TParser::OperationElementsContext::operationValue() {
  return getRuleContext<TParser::OperationValueContext>(0);
}

TParser::OperationElementsContext* TParser::OperationElementsContext::operationElements() {
  return getRuleContext<TParser::OperationElementsContext>(0);
}


size_t TParser::OperationElementsContext::getRuleIndex() const {
  return TParser::RuleOperationElements;
}

void TParser::OperationElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterOperationElements(this);
}

void TParser::OperationElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitOperationElements(this);
}


antlrcpp::Any TParser::OperationElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitOperationElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::OperationElementsContext* TParser::operationElements() {
  OperationElementsContext *_localctx = _tracker.createInstance<OperationElementsContext>(_ctx, getState());
  enterRule(_localctx, 30, TParser::RuleOperationElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(165);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 9, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(161);
      operationValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(162);
      operationValue();
      setState(163);
      operationElements();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- OperationValueContext ------------------------------------------------------------------

TParser::OperationValueContext::OperationValueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::OperationValueContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::OperationValueContext::ArithmeticOperator() {
  return getToken(TParser::ArithmeticOperator, 0);
}

tree::TerminalNode* TParser::OperationValueContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}

TParser::FirstIncDecContext* TParser::OperationValueContext::firstIncDec() {
  return getRuleContext<TParser::FirstIncDecContext>(0);
}

TParser::LastIncDecContext* TParser::OperationValueContext::lastIncDec() {
  return getRuleContext<TParser::LastIncDecContext>(0);
}

tree::TerminalNode* TParser::OperationValueContext::Integer() {
  return getToken(TParser::Integer, 0);
}

tree::TerminalNode* TParser::OperationValueContext::Float() {
  return getToken(TParser::Float, 0);
}

TParser::FunctionCallContext* TParser::OperationValueContext::functionCall() {
  return getRuleContext<TParser::FunctionCallContext>(0);
}

TParser::OperationBlockContext* TParser::OperationValueContext::operationBlock() {
  return getRuleContext<TParser::OperationBlockContext>(0);
}


size_t TParser::OperationValueContext::getRuleIndex() const {
  return TParser::RuleOperationValue;
}

void TParser::OperationValueContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterOperationValue(this);
}

void TParser::OperationValueContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitOperationValue(this);
}


antlrcpp::Any TParser::OperationValueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitOperationValue(this);
  else
    return visitor->visitChildren(this);
}

TParser::OperationValueContext* TParser::operationValue() {
  OperationValueContext *_localctx = _tracker.createInstance<OperationValueContext>(_ctx, getState());
  enterRule(_localctx, 32, TParser::RuleOperationValue);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(244);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 10, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(167);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(168);
      match(TParser::Identifier);
      setState(169);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(170);
      match(TParser::Identifier);
      setState(171);
      match(TParser::TypeSpec);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(172);
      match(TParser::Identifier);
      setState(173);
      match(TParser::TypeSpec);
      setState(174);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(175);
      firstIncDec();
      setState(176);
      match(TParser::Identifier);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(178);
      firstIncDec();
      setState(179);
      match(TParser::Identifier);
      setState(180);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(182);
      firstIncDec();
      setState(183);
      match(TParser::Identifier);
      setState(184);
      match(TParser::TypeSpec);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(186);
      firstIncDec();
      setState(187);
      match(TParser::Identifier);
      setState(188);
      match(TParser::TypeSpec);
      setState(189);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(191);
      match(TParser::Identifier);
      setState(192);
      lastIncDec();
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(193);
      match(TParser::Identifier);
      setState(194);
      lastIncDec();
      setState(195);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(197);
      match(TParser::Identifier);
      setState(198);
      lastIncDec();
      setState(199);
      match(TParser::TypeSpec);
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(201);
      match(TParser::Identifier);
      setState(202);
      lastIncDec();
      setState(203);
      match(TParser::TypeSpec);
      setState(204);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 13: {
      enterOuterAlt(_localctx, 13);
      setState(206);
      match(TParser::Integer);
      break;
    }

    case 14: {
      enterOuterAlt(_localctx, 14);
      setState(207);
      match(TParser::Integer);
      setState(208);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 15: {
      enterOuterAlt(_localctx, 15);
      setState(209);
      match(TParser::Integer);
      setState(210);
      match(TParser::TypeSpec);
      break;
    }

    case 16: {
      enterOuterAlt(_localctx, 16);
      setState(211);
      match(TParser::Integer);
      setState(212);
      match(TParser::TypeSpec);
      setState(213);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 17: {
      enterOuterAlt(_localctx, 17);
      setState(214);
      match(TParser::Float);
      break;
    }

    case 18: {
      enterOuterAlt(_localctx, 18);
      setState(215);
      match(TParser::Float);
      setState(216);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 19: {
      enterOuterAlt(_localctx, 19);
      setState(217);
      match(TParser::Float);
      setState(218);
      match(TParser::TypeSpec);
      break;
    }

    case 20: {
      enterOuterAlt(_localctx, 20);
      setState(219);
      match(TParser::Float);
      setState(220);
      match(TParser::TypeSpec);
      setState(221);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 21: {
      enterOuterAlt(_localctx, 21);
      setState(222);
      functionCall();
      break;
    }

    case 22: {
      enterOuterAlt(_localctx, 22);
      setState(223);
      functionCall();
      setState(224);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 23: {
      enterOuterAlt(_localctx, 23);
      setState(226);
      functionCall();
      setState(227);
      match(TParser::TypeSpec);
      break;
    }

    case 24: {
      enterOuterAlt(_localctx, 24);
      setState(229);
      functionCall();
      setState(230);
      match(TParser::TypeSpec);
      setState(231);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 25: {
      enterOuterAlt(_localctx, 25);
      setState(233);
      operationBlock();
      break;
    }

    case 26: {
      enterOuterAlt(_localctx, 26);
      setState(234);
      operationBlock();
      setState(235);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 27: {
      enterOuterAlt(_localctx, 27);
      setState(237);
      operationBlock();
      setState(238);
      match(TParser::TypeSpec);
      break;
    }

    case 28: {
      enterOuterAlt(_localctx, 28);
      setState(240);
      operationBlock();
      setState(241);
      match(TParser::TypeSpec);
      setState(242);
      match(TParser::ArithmeticOperator);
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FirstIncDecContext ------------------------------------------------------------------

TParser::FirstIncDecContext::FirstIncDecContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::FirstIncDecContext::IncDecOperators() {
  return getToken(TParser::IncDecOperators, 0);
}


size_t TParser::FirstIncDecContext::getRuleIndex() const {
  return TParser::RuleFirstIncDec;
}

void TParser::FirstIncDecContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFirstIncDec(this);
}

void TParser::FirstIncDecContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFirstIncDec(this);
}


antlrcpp::Any TParser::FirstIncDecContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFirstIncDec(this);
  else
    return visitor->visitChildren(this);
}

TParser::FirstIncDecContext* TParser::firstIncDec() {
  FirstIncDecContext *_localctx = _tracker.createInstance<FirstIncDecContext>(_ctx, getState());
  enterRule(_localctx, 34, TParser::RuleFirstIncDec);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(246);
    match(TParser::IncDecOperators);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LastIncDecContext ------------------------------------------------------------------

TParser::LastIncDecContext::LastIncDecContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::LastIncDecContext::IncDecOperators() {
  return getToken(TParser::IncDecOperators, 0);
}


size_t TParser::LastIncDecContext::getRuleIndex() const {
  return TParser::RuleLastIncDec;
}

void TParser::LastIncDecContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLastIncDec(this);
}

void TParser::LastIncDecContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLastIncDec(this);
}


antlrcpp::Any TParser::LastIncDecContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLastIncDec(this);
  else
    return visitor->visitChildren(this);
}

TParser::LastIncDecContext* TParser::lastIncDec() {
  LastIncDecContext *_localctx = _tracker.createInstance<LastIncDecContext>(_ctx, getState());
  enterRule(_localctx, 36, TParser::RuleLastIncDec);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(248);
    match(TParser::IncDecOperators);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- CallingFunctionContext ------------------------------------------------------------------

TParser::CallingFunctionContext::CallingFunctionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionCallContext* TParser::CallingFunctionContext::functionCall() {
  return getRuleContext<TParser::FunctionCallContext>(0);
}

tree::TerminalNode* TParser::CallingFunctionContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::CallingFunctionContext::getRuleIndex() const {
  return TParser::RuleCallingFunction;
}

void TParser::CallingFunctionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterCallingFunction(this);
}

void TParser::CallingFunctionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitCallingFunction(this);
}


antlrcpp::Any TParser::CallingFunctionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitCallingFunction(this);
  else
    return visitor->visitChildren(this);
}

TParser::CallingFunctionContext* TParser::callingFunction() {
  CallingFunctionContext *_localctx = _tracker.createInstance<CallingFunctionContext>(_ctx, getState());
  enterRule(_localctx, 38, TParser::RuleCallingFunction);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(250);
    functionCall();
    setState(251);
    match(TParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionCallContext ------------------------------------------------------------------

TParser::FunctionCallContext::FunctionCallContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::FunctionCallContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

TParser::FunctionCallParamContext* TParser::FunctionCallContext::functionCallParam() {
  return getRuleContext<TParser::FunctionCallParamContext>(0);
}

tree::TerminalNode* TParser::FunctionCallContext::Point() {
  return getToken(TParser::Point, 0);
}

TParser::IdentifierBContext* TParser::FunctionCallContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}

tree::TerminalNode* TParser::FunctionCallContext::TwoTwoPoint() {
  return getToken(TParser::TwoTwoPoint, 0);
}


size_t TParser::FunctionCallContext::getRuleIndex() const {
  return TParser::RuleFunctionCall;
}

void TParser::FunctionCallContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionCall(this);
}

void TParser::FunctionCallContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionCall(this);
}


antlrcpp::Any TParser::FunctionCallContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionCall(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionCallContext* TParser::functionCall() {
  FunctionCallContext *_localctx = _tracker.createInstance<FunctionCallContext>(_ctx, getState());
  enterRule(_localctx, 40, TParser::RuleFunctionCall);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(265);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 11, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(253);
      match(TParser::Identifier);
      setState(254);
      functionCallParam();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(255);
      match(TParser::Identifier);
      setState(256);
      match(TParser::Point);
      setState(257);
      identifierB();
      setState(258);
      functionCallParam();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(260);
      match(TParser::Identifier);
      setState(261);
      match(TParser::TwoTwoPoint);
      setState(262);
      identifierB();
      setState(263);
      functionCallParam();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IdentifierBContext ------------------------------------------------------------------

TParser::IdentifierBContext::IdentifierBContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::IdentifierBContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}


size_t TParser::IdentifierBContext::getRuleIndex() const {
  return TParser::RuleIdentifierB;
}

void TParser::IdentifierBContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIdentifierB(this);
}

void TParser::IdentifierBContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIdentifierB(this);
}


antlrcpp::Any TParser::IdentifierBContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitIdentifierB(this);
  else
    return visitor->visitChildren(this);
}

TParser::IdentifierBContext* TParser::identifierB() {
  IdentifierBContext *_localctx = _tracker.createInstance<IdentifierBContext>(_ctx, getState());
  enterRule(_localctx, 42, TParser::RuleIdentifierB);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(267);
    match(TParser::Identifier);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionCallParamContext ------------------------------------------------------------------

TParser::FunctionCallParamContext::FunctionCallParamContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::FunctionCallParamContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

tree::TerminalNode* TParser::FunctionCallParamContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}

TParser::FunctionCallParamElementsContext* TParser::FunctionCallParamContext::functionCallParamElements() {
  return getRuleContext<TParser::FunctionCallParamElementsContext>(0);
}


size_t TParser::FunctionCallParamContext::getRuleIndex() const {
  return TParser::RuleFunctionCallParam;
}

void TParser::FunctionCallParamContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionCallParam(this);
}

void TParser::FunctionCallParamContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionCallParam(this);
}


antlrcpp::Any TParser::FunctionCallParamContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionCallParam(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionCallParamContext* TParser::functionCallParam() {
  FunctionCallParamContext *_localctx = _tracker.createInstance<FunctionCallParamContext>(_ctx, getState());
  enterRule(_localctx, 44, TParser::RuleFunctionCallParam);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(275);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 12, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(269);
      match(TParser::OpenOp);
      setState(270);
      match(TParser::CloseOp);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(271);
      match(TParser::OpenOp);
      setState(272);
      functionCallParamElements();
      setState(273);
      match(TParser::CloseOp);
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionCallParamElementsContext ------------------------------------------------------------------

TParser::FunctionCallParamElementsContext::FunctionCallParamElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::GeneralValueContext* TParser::FunctionCallParamElementsContext::generalValue() {
  return getRuleContext<TParser::GeneralValueContext>(0);
}

tree::TerminalNode* TParser::FunctionCallParamElementsContext::Separator() {
  return getToken(TParser::Separator, 0);
}

TParser::FunctionCallParamElementsContext* TParser::FunctionCallParamElementsContext::functionCallParamElements() {
  return getRuleContext<TParser::FunctionCallParamElementsContext>(0);
}

TParser::OperationElementsContext* TParser::FunctionCallParamElementsContext::operationElements() {
  return getRuleContext<TParser::OperationElementsContext>(0);
}


size_t TParser::FunctionCallParamElementsContext::getRuleIndex() const {
  return TParser::RuleFunctionCallParamElements;
}

void TParser::FunctionCallParamElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionCallParamElements(this);
}

void TParser::FunctionCallParamElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionCallParamElements(this);
}


antlrcpp::Any TParser::FunctionCallParamElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionCallParamElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionCallParamElementsContext* TParser::functionCallParamElements() {
  FunctionCallParamElementsContext *_localctx = _tracker.createInstance<FunctionCallParamElementsContext>(_ctx, getState());
  enterRule(_localctx, 46, TParser::RuleFunctionCallParamElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(287);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 13, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(277);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(278);
      generalValue();
      setState(279);
      match(TParser::Separator);
      setState(280);
      functionCallParamElements();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(282);
      operationElements();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(283);
      operationElements();
      setState(284);
      match(TParser::Separator);
      setState(285);
      functionCallParamElements();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConditionalExpressionContext ------------------------------------------------------------------

TParser::ConditionalExpressionContext::ConditionalExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::IfConditionsContext* TParser::ConditionalExpressionContext::ifConditions() {
  return getRuleContext<TParser::IfConditionsContext>(0);
}

TParser::ElifConditionsContext* TParser::ConditionalExpressionContext::elifConditions() {
  return getRuleContext<TParser::ElifConditionsContext>(0);
}

TParser::ElseConditionsContext* TParser::ConditionalExpressionContext::elseConditions() {
  return getRuleContext<TParser::ElseConditionsContext>(0);
}


size_t TParser::ConditionalExpressionContext::getRuleIndex() const {
  return TParser::RuleConditionalExpression;
}

void TParser::ConditionalExpressionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConditionalExpression(this);
}

void TParser::ConditionalExpressionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConditionalExpression(this);
}


antlrcpp::Any TParser::ConditionalExpressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConditionalExpression(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConditionalExpressionContext* TParser::conditionalExpression() {
  ConditionalExpressionContext *_localctx = _tracker.createInstance<ConditionalExpressionContext>(_ctx, getState());
  enterRule(_localctx, 48, TParser::RuleConditionalExpression);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(292);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::If: {
        enterOuterAlt(_localctx, 1);
        setState(289);
        ifConditions();
        break;
      }

      case TParser::Elif: {
        enterOuterAlt(_localctx, 2);
        setState(290);
        elifConditions();
        break;
      }

      case TParser::Else: {
        enterOuterAlt(_localctx, 3);
        setState(291);
        elseConditions();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockElementsContext ------------------------------------------------------------------

TParser::BlockElementsContext::BlockElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ConditionalExpressionContext* TParser::BlockElementsContext::conditionalExpression() {
  return getRuleContext<TParser::ConditionalExpressionContext>(0);
}

TParser::BlockElementsContext* TParser::BlockElementsContext::blockElements() {
  return getRuleContext<TParser::BlockElementsContext>(0);
}

TParser::SentenceContext* TParser::BlockElementsContext::sentence() {
  return getRuleContext<TParser::SentenceContext>(0);
}


size_t TParser::BlockElementsContext::getRuleIndex() const {
  return TParser::RuleBlockElements;
}

void TParser::BlockElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockElements(this);
}

void TParser::BlockElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockElements(this);
}


antlrcpp::Any TParser::BlockElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockElementsContext* TParser::blockElements() {
  BlockElementsContext *_localctx = _tracker.createInstance<BlockElementsContext>(_ctx, getState());
  enterRule(_localctx, 50, TParser::RuleBlockElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(302);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 15, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(294);
      conditionalExpression();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(295);
      conditionalExpression();
      setState(296);
      blockElements();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(298);
      sentence();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(299);
      sentence();
      setState(300);
      blockElements();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IfConditionsContext ------------------------------------------------------------------

TParser::IfConditionsContext::IfConditionsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::IfConditionsContext::If() {
  return getToken(TParser::If, 0);
}

TParser::ConditionalExpressionElementsContext* TParser::IfConditionsContext::conditionalExpressionElements() {
  return getRuleContext<TParser::ConditionalExpressionElementsContext>(0);
}

TParser::CallingFunctionContext* TParser::IfConditionsContext::callingFunction() {
  return getRuleContext<TParser::CallingFunctionContext>(0);
}

tree::TerminalNode* TParser::IfConditionsContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::IfConditionsContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::BlockElementsContext* TParser::IfConditionsContext::blockElements() {
  return getRuleContext<TParser::BlockElementsContext>(0);
}

TParser::BlockElementsLimitedContext* TParser::IfConditionsContext::blockElementsLimited() {
  return getRuleContext<TParser::BlockElementsLimitedContext>(0);
}


size_t TParser::IfConditionsContext::getRuleIndex() const {
  return TParser::RuleIfConditions;
}

void TParser::IfConditionsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIfConditions(this);
}

void TParser::IfConditionsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIfConditions(this);
}


antlrcpp::Any TParser::IfConditionsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitIfConditions(this);
  else
    return visitor->visitChildren(this);
}

TParser::IfConditionsContext* TParser::ifConditions() {
  IfConditionsContext *_localctx = _tracker.createInstance<IfConditionsContext>(_ctx, getState());
  enterRule(_localctx, 52, TParser::RuleIfConditions);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(323);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 16, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(304);
      match(TParser::If);
      setState(305);
      conditionalExpressionElements();
      setState(306);
      callingFunction();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(308);
      match(TParser::If);
      setState(309);
      conditionalExpressionElements();
      setState(310);
      match(TParser::OpenBlock);
      setState(311);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(313);
      match(TParser::If);
      setState(314);
      conditionalExpressionElements();
      setState(315);
      match(TParser::OpenBlock);
      setState(316);
      blockElements();
      setState(317);
      match(TParser::CloseBlock);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(319);
      match(TParser::If);
      setState(320);
      conditionalExpressionElements();
      setState(321);
      blockElementsLimited();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ElifConditionsContext ------------------------------------------------------------------

TParser::ElifConditionsContext::ElifConditionsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ElifConditionsContext::Elif() {
  return getToken(TParser::Elif, 0);
}

TParser::ConditionalExpressionElementsContext* TParser::ElifConditionsContext::conditionalExpressionElements() {
  return getRuleContext<TParser::ConditionalExpressionElementsContext>(0);
}

TParser::CallingFunctionContext* TParser::ElifConditionsContext::callingFunction() {
  return getRuleContext<TParser::CallingFunctionContext>(0);
}

tree::TerminalNode* TParser::ElifConditionsContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::ElifConditionsContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::BlockElementsContext* TParser::ElifConditionsContext::blockElements() {
  return getRuleContext<TParser::BlockElementsContext>(0);
}

TParser::BlockElementsLimitedContext* TParser::ElifConditionsContext::blockElementsLimited() {
  return getRuleContext<TParser::BlockElementsLimitedContext>(0);
}


size_t TParser::ElifConditionsContext::getRuleIndex() const {
  return TParser::RuleElifConditions;
}

void TParser::ElifConditionsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterElifConditions(this);
}

void TParser::ElifConditionsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitElifConditions(this);
}


antlrcpp::Any TParser::ElifConditionsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitElifConditions(this);
  else
    return visitor->visitChildren(this);
}

TParser::ElifConditionsContext* TParser::elifConditions() {
  ElifConditionsContext *_localctx = _tracker.createInstance<ElifConditionsContext>(_ctx, getState());
  enterRule(_localctx, 54, TParser::RuleElifConditions);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(344);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 17, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(325);
      match(TParser::Elif);
      setState(326);
      conditionalExpressionElements();
      setState(327);
      callingFunction();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(329);
      match(TParser::Elif);
      setState(330);
      conditionalExpressionElements();
      setState(331);
      match(TParser::OpenBlock);
      setState(332);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(334);
      match(TParser::Elif);
      setState(335);
      conditionalExpressionElements();
      setState(336);
      match(TParser::OpenBlock);
      setState(337);
      blockElements();
      setState(338);
      match(TParser::CloseBlock);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(340);
      match(TParser::Elif);
      setState(341);
      conditionalExpressionElements();
      setState(342);
      blockElementsLimited();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ElseConditionsContext ------------------------------------------------------------------

TParser::ElseConditionsContext::ElseConditionsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ElseConditionsContext::Else() {
  return getToken(TParser::Else, 0);
}

TParser::CallingFunctionContext* TParser::ElseConditionsContext::callingFunction() {
  return getRuleContext<TParser::CallingFunctionContext>(0);
}

tree::TerminalNode* TParser::ElseConditionsContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::ElseConditionsContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::BlockElementsContext* TParser::ElseConditionsContext::blockElements() {
  return getRuleContext<TParser::BlockElementsContext>(0);
}

TParser::BlockElementsLimitedContext* TParser::ElseConditionsContext::blockElementsLimited() {
  return getRuleContext<TParser::BlockElementsLimitedContext>(0);
}


size_t TParser::ElseConditionsContext::getRuleIndex() const {
  return TParser::RuleElseConditions;
}

void TParser::ElseConditionsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterElseConditions(this);
}

void TParser::ElseConditionsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitElseConditions(this);
}


antlrcpp::Any TParser::ElseConditionsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitElseConditions(this);
  else
    return visitor->visitChildren(this);
}

TParser::ElseConditionsContext* TParser::elseConditions() {
  ElseConditionsContext *_localctx = _tracker.createInstance<ElseConditionsContext>(_ctx, getState());
  enterRule(_localctx, 56, TParser::RuleElseConditions);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(358);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 18, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(346);
      match(TParser::Else);
      setState(347);
      callingFunction();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(348);
      match(TParser::Else);
      setState(349);
      match(TParser::OpenBlock);
      setState(350);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(351);
      match(TParser::Else);
      setState(352);
      match(TParser::OpenBlock);
      setState(353);
      blockElements();
      setState(354);
      match(TParser::CloseBlock);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(356);
      match(TParser::Else);
      setState(357);
      blockElementsLimited();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockElementsLimitedContext ------------------------------------------------------------------

TParser::BlockElementsLimitedContext::BlockElementsLimitedContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::IfConditionsContext* TParser::BlockElementsLimitedContext::ifConditions() {
  return getRuleContext<TParser::IfConditionsContext>(0);
}

TParser::BlockElementsContext* TParser::BlockElementsLimitedContext::blockElements() {
  return getRuleContext<TParser::BlockElementsContext>(0);
}


size_t TParser::BlockElementsLimitedContext::getRuleIndex() const {
  return TParser::RuleBlockElementsLimited;
}

void TParser::BlockElementsLimitedContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockElementsLimited(this);
}

void TParser::BlockElementsLimitedContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockElementsLimited(this);
}


antlrcpp::Any TParser::BlockElementsLimitedContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockElementsLimited(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockElementsLimitedContext* TParser::blockElementsLimited() {
  BlockElementsLimitedContext *_localctx = _tracker.createInstance<BlockElementsLimitedContext>(_ctx, getState());
  enterRule(_localctx, 58, TParser::RuleBlockElementsLimited);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(364);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 19, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(360);
      ifConditions();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(361);
      ifConditions();
      setState(362);
      blockElements();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConditionalExpressionElementsContext ------------------------------------------------------------------

TParser::ConditionalExpressionElementsContext::ConditionalExpressionElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ConditionalExpElementsValueContext* TParser::ConditionalExpressionElementsContext::conditionalExpElementsValue() {
  return getRuleContext<TParser::ConditionalExpElementsValueContext>(0);
}

TParser::ConditionalExpressionElementsContext* TParser::ConditionalExpressionElementsContext::conditionalExpressionElements() {
  return getRuleContext<TParser::ConditionalExpressionElementsContext>(0);
}

TParser::ConditionExpBlockContext* TParser::ConditionalExpressionElementsContext::conditionExpBlock() {
  return getRuleContext<TParser::ConditionExpBlockContext>(0);
}

tree::TerminalNode* TParser::ConditionalExpressionElementsContext::Not() {
  return getToken(TParser::Not, 0);
}


size_t TParser::ConditionalExpressionElementsContext::getRuleIndex() const {
  return TParser::RuleConditionalExpressionElements;
}

void TParser::ConditionalExpressionElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConditionalExpressionElements(this);
}

void TParser::ConditionalExpressionElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConditionalExpressionElements(this);
}


antlrcpp::Any TParser::ConditionalExpressionElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConditionalExpressionElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConditionalExpressionElementsContext* TParser::conditionalExpressionElements() {
  ConditionalExpressionElementsContext *_localctx = _tracker.createInstance<ConditionalExpressionElementsContext>(_ctx, getState());
  enterRule(_localctx, 60, TParser::RuleConditionalExpressionElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(376);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 20, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(366);
      conditionalExpElementsValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(367);
      conditionalExpElementsValue();
      setState(368);
      conditionalExpressionElements();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(370);
      conditionExpBlock(0);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(371);
      conditionExpBlock(0);
      setState(372);
      conditionalExpressionElements();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(374);
      match(TParser::Not);
      setState(375);
      conditionalExpressionElements();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConditionalExpElementsValueContext ------------------------------------------------------------------

TParser::ConditionalExpElementsValueContext::ConditionalExpElementsValueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ConditionalExpValueContext* TParser::ConditionalExpElementsValueContext::conditionalExpValue() {
  return getRuleContext<TParser::ConditionalExpValueContext>(0);
}

TParser::ConditionalExpElementsValueContext* TParser::ConditionalExpElementsValueContext::conditionalExpElementsValue() {
  return getRuleContext<TParser::ConditionalExpElementsValueContext>(0);
}


size_t TParser::ConditionalExpElementsValueContext::getRuleIndex() const {
  return TParser::RuleConditionalExpElementsValue;
}

void TParser::ConditionalExpElementsValueContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConditionalExpElementsValue(this);
}

void TParser::ConditionalExpElementsValueContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConditionalExpElementsValue(this);
}


antlrcpp::Any TParser::ConditionalExpElementsValueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConditionalExpElementsValue(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConditionalExpElementsValueContext* TParser::conditionalExpElementsValue() {
  ConditionalExpElementsValueContext *_localctx = _tracker.createInstance<ConditionalExpElementsValueContext>(_ctx, getState());
  enterRule(_localctx, 62, TParser::RuleConditionalExpElementsValue);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(382);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 21, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(378);
      conditionalExpValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(379);
      conditionalExpValue();
      setState(380);
      conditionalExpElementsValue();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConditionExpBlockContext ------------------------------------------------------------------

TParser::ConditionExpBlockContext::ConditionExpBlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ConditionExpBlockContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

TParser::ConditionalExpressionElementsContext* TParser::ConditionExpBlockContext::conditionalExpressionElements() {
  return getRuleContext<TParser::ConditionalExpressionElementsContext>(0);
}

tree::TerminalNode* TParser::ConditionExpBlockContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}

TParser::ConditionExpBlockContext* TParser::ConditionExpBlockContext::conditionExpBlock() {
  return getRuleContext<TParser::ConditionExpBlockContext>(0);
}

tree::TerminalNode* TParser::ConditionExpBlockContext::AssignmentOperator() {
  return getToken(TParser::AssignmentOperator, 0);
}


size_t TParser::ConditionExpBlockContext::getRuleIndex() const {
  return TParser::RuleConditionExpBlock;
}

void TParser::ConditionExpBlockContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConditionExpBlock(this);
}

void TParser::ConditionExpBlockContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConditionExpBlock(this);
}


antlrcpp::Any TParser::ConditionExpBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConditionExpBlock(this);
  else
    return visitor->visitChildren(this);
}


TParser::ConditionExpBlockContext* TParser::conditionExpBlock() {
   return conditionExpBlock(0);
}

TParser::ConditionExpBlockContext* TParser::conditionExpBlock(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  TParser::ConditionExpBlockContext *_localctx = _tracker.createInstance<ConditionExpBlockContext>(_ctx, parentState);
  TParser::ConditionExpBlockContext *previousContext = _localctx;
  (void)previousContext; // Silence compiler, in case the context is not used by generated code.
  size_t startState = 64;
  enterRecursionRule(_localctx, 64, TParser::RuleConditionExpBlock, precedence);

    

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(385);
    match(TParser::OpenOp);
    setState(386);
    conditionalExpressionElements();
    setState(387);
    match(TParser::CloseOp);
    _ctx->stop = _input->LT(-1);
    setState(393);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 22, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        _localctx = _tracker.createInstance<ConditionExpBlockContext>(parentContext, parentState);
        pushNewRecursionContext(_localctx, startState, RuleConditionExpBlock);
        setState(389);

        if (!(precpred(_ctx, 1))) throw FailedPredicateException(this, "precpred(_ctx, 1)");
        setState(390);
        match(TParser::AssignmentOperator); 
      }
      setState(395);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 22, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- ConditionalExpValueContext ------------------------------------------------------------------

TParser::ConditionalExpValueContext::ConditionalExpValueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ConditionalExpValueContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::ConditionalExpValueContext::ArithmeticOperator() {
  return getToken(TParser::ArithmeticOperator, 0);
}

tree::TerminalNode* TParser::ConditionalExpValueContext::AssignmentOperator() {
  return getToken(TParser::AssignmentOperator, 0);
}

tree::TerminalNode* TParser::ConditionalExpValueContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}

TParser::FirstIncDecContext* TParser::ConditionalExpValueContext::firstIncDec() {
  return getRuleContext<TParser::FirstIncDecContext>(0);
}

TParser::LastIncDecContext* TParser::ConditionalExpValueContext::lastIncDec() {
  return getRuleContext<TParser::LastIncDecContext>(0);
}

tree::TerminalNode* TParser::ConditionalExpValueContext::Integer() {
  return getToken(TParser::Integer, 0);
}

tree::TerminalNode* TParser::ConditionalExpValueContext::Float() {
  return getToken(TParser::Float, 0);
}

TParser::FunctionCallContext* TParser::ConditionalExpValueContext::functionCall() {
  return getRuleContext<TParser::FunctionCallContext>(0);
}

tree::TerminalNode* TParser::ConditionalExpValueContext::Attr() {
  return getToken(TParser::Attr, 0);
}

TParser::OperationBlockContext* TParser::ConditionalExpValueContext::operationBlock() {
  return getRuleContext<TParser::OperationBlockContext>(0);
}


size_t TParser::ConditionalExpValueContext::getRuleIndex() const {
  return TParser::RuleConditionalExpValue;
}

void TParser::ConditionalExpValueContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConditionalExpValue(this);
}

void TParser::ConditionalExpValueContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConditionalExpValue(this);
}


antlrcpp::Any TParser::ConditionalExpValueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConditionalExpValue(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConditionalExpValueContext* TParser::conditionalExpValue() {
  ConditionalExpValueContext *_localctx = _tracker.createInstance<ConditionalExpValueContext>(_ctx, getState());
  enterRule(_localctx, 66, TParser::RuleConditionalExpValue);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(492);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 23, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(396);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(397);
      match(TParser::Identifier);
      setState(398);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(399);
      match(TParser::Identifier);
      setState(400);
      match(TParser::TypeSpec);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(401);
      match(TParser::Identifier);
      setState(402);
      match(TParser::TypeSpec);
      setState(403);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(404);
      firstIncDec();
      setState(405);
      match(TParser::Identifier);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(407);
      firstIncDec();
      setState(408);
      match(TParser::Identifier);
      setState(409);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(411);
      firstIncDec();
      setState(412);
      match(TParser::Identifier);
      setState(413);
      match(TParser::TypeSpec);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(415);
      firstIncDec();
      setState(416);
      match(TParser::Identifier);
      setState(417);
      match(TParser::TypeSpec);
      setState(418);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(420);
      match(TParser::Identifier);
      setState(421);
      lastIncDec();
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(422);
      match(TParser::Identifier);
      setState(423);
      lastIncDec();
      setState(424);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(426);
      match(TParser::Identifier);
      setState(427);
      lastIncDec();
      setState(428);
      match(TParser::TypeSpec);
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(430);
      match(TParser::Identifier);
      setState(431);
      lastIncDec();
      setState(432);
      match(TParser::TypeSpec);
      setState(433);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 13: {
      enterOuterAlt(_localctx, 13);
      setState(435);
      match(TParser::Integer);
      break;
    }

    case 14: {
      enterOuterAlt(_localctx, 14);
      setState(436);
      match(TParser::Integer);
      setState(437);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 15: {
      enterOuterAlt(_localctx, 15);
      setState(438);
      match(TParser::Integer);
      setState(439);
      match(TParser::TypeSpec);
      break;
    }

    case 16: {
      enterOuterAlt(_localctx, 16);
      setState(440);
      match(TParser::Integer);
      setState(441);
      match(TParser::TypeSpec);
      setState(442);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 17: {
      enterOuterAlt(_localctx, 17);
      setState(443);
      match(TParser::Float);
      break;
    }

    case 18: {
      enterOuterAlt(_localctx, 18);
      setState(444);
      match(TParser::Float);
      setState(445);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 19: {
      enterOuterAlt(_localctx, 19);
      setState(446);
      match(TParser::Float);
      setState(447);
      match(TParser::TypeSpec);
      break;
    }

    case 20: {
      enterOuterAlt(_localctx, 20);
      setState(448);
      match(TParser::Float);
      setState(449);
      match(TParser::TypeSpec);
      setState(450);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 21: {
      enterOuterAlt(_localctx, 21);
      setState(451);
      functionCall();
      break;
    }

    case 22: {
      enterOuterAlt(_localctx, 22);
      setState(452);
      functionCall();
      setState(453);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 23: {
      enterOuterAlt(_localctx, 23);
      setState(455);
      functionCall();
      setState(456);
      match(TParser::TypeSpec);
      break;
    }

    case 24: {
      enterOuterAlt(_localctx, 24);
      setState(458);
      functionCall();
      setState(459);
      match(TParser::TypeSpec);
      setState(460);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 25: {
      enterOuterAlt(_localctx, 25);
      setState(462);
      match(TParser::Identifier);
      setState(463);
      match(TParser::Attr);
      setState(464);
      functionCall();
      break;
    }

    case 26: {
      enterOuterAlt(_localctx, 26);
      setState(465);
      match(TParser::Identifier);
      setState(466);
      match(TParser::Attr);
      setState(467);
      functionCall();
      setState(468);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 27: {
      enterOuterAlt(_localctx, 27);
      setState(470);
      match(TParser::Identifier);
      setState(471);
      match(TParser::Attr);
      setState(472);
      functionCall();
      setState(473);
      match(TParser::TypeSpec);
      break;
    }

    case 28: {
      enterOuterAlt(_localctx, 28);
      setState(475);
      match(TParser::Identifier);
      setState(476);
      match(TParser::Attr);
      setState(477);
      functionCall();
      setState(478);
      match(TParser::TypeSpec);
      setState(479);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 29: {
      enterOuterAlt(_localctx, 29);
      setState(481);
      operationBlock();
      break;
    }

    case 30: {
      enterOuterAlt(_localctx, 30);
      setState(482);
      operationBlock();
      setState(483);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 31: {
      enterOuterAlt(_localctx, 31);
      setState(485);
      operationBlock();
      setState(486);
      match(TParser::TypeSpec);
      break;
    }

    case 32: {
      enterOuterAlt(_localctx, 32);
      setState(488);
      operationBlock();
      setState(489);
      match(TParser::TypeSpec);
      setState(490);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- GeneralValueContext ------------------------------------------------------------------

TParser::GeneralValueContext::GeneralValueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::GeneralValueContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::Integer() {
  return getToken(TParser::Integer, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::Float() {
  return getToken(TParser::Float, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::Bool() {
  return getToken(TParser::Bool, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::String() {
  return getToken(TParser::String, 0);
}

TParser::IndexArrayContext* TParser::GeneralValueContext::indexArray() {
  return getRuleContext<TParser::IndexArrayContext>(0);
}

TParser::AssociativeArrayContext* TParser::GeneralValueContext::associativeArray() {
  return getRuleContext<TParser::AssociativeArrayContext>(0);
}

TParser::OperationBlockContext* TParser::GeneralValueContext::operationBlock() {
  return getRuleContext<TParser::OperationBlockContext>(0);
}

TParser::FunctionCallContext* TParser::GeneralValueContext::functionCall() {
  return getRuleContext<TParser::FunctionCallContext>(0);
}


size_t TParser::GeneralValueContext::getRuleIndex() const {
  return TParser::RuleGeneralValue;
}

void TParser::GeneralValueContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterGeneralValue(this);
}

void TParser::GeneralValueContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitGeneralValue(this);
}


antlrcpp::Any TParser::GeneralValueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitGeneralValue(this);
  else
    return visitor->visitChildren(this);
}

TParser::GeneralValueContext* TParser::generalValue() {
  GeneralValueContext *_localctx = _tracker.createInstance<GeneralValueContext>(_ctx, getState());
  enterRule(_localctx, 68, TParser::RuleGeneralValue);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(509);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 24, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(494);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(495);
      match(TParser::Identifier);
      setState(496);
      match(TParser::TypeSpec);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(497);
      match(TParser::Integer);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(498);
      match(TParser::Integer);
      setState(499);
      match(TParser::TypeSpec);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(500);
      match(TParser::Float);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(501);
      match(TParser::Float);
      setState(502);
      match(TParser::TypeSpec);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(503);
      match(TParser::Bool);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(504);
      match(TParser::String);
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(505);
      indexArray();
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(506);
      associativeArray();
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(507);
      operationBlock();
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(508);
      functionCall();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

bool TParser::sempred(RuleContext *context, size_t ruleIndex, size_t predicateIndex) {
  switch (ruleIndex) {
    case 1: return fileContentSempred(dynamic_cast<FileContentContext *>(context), predicateIndex);
    case 32: return conditionExpBlockSempred(dynamic_cast<ConditionExpBlockContext *>(context), predicateIndex);

  default:
    break;
  }
  return true;
}

bool TParser::fileContentSempred(FileContentContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 0: return precpred(_ctx, 2);

  default:
    break;
  }
  return true;
}

bool TParser::conditionExpBlockSempred(ConditionExpBlockContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 1: return precpred(_ctx, 1);

  default:
    break;
  }
  return true;
}

// Static vars and initialization.
std::vector<dfa::DFA> TParser::_decisionToDFA;
atn::PredictionContextCache TParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN TParser::_atn;
std::vector<uint16_t> TParser::_serializedATN;

std::vector<std::string> TParser::_ruleNames = {
  "main", "fileContent", "sentence", "liveToken", "use", "useValue", "useString", 
  "variable", "variableMembers", "variableDefinition", "indexArray", "indexArrayElements", 
  "associativeArray", "associativeArrayElements", "operationBlock", "operationElements", 
  "operationValue", "firstIncDec", "lastIncDec", "callingFunction", "functionCall", 
  "identifierB", "functionCallParam", "functionCallParamElements", "conditionalExpression", 
  "blockElements", "ifConditions", "elifConditions", "elseConditions", "blockElementsLimited", 
  "conditionalExpressionElements", "conditionalExpElementsValue", "conditionExpBlock", 
  "conditionalExpValue", "generalValue"
};

std::vector<std::string> TParser::_literalNames = {
  "", "'use'", "'var'", "'if'", "'elif'", "'else'", "", "';'", "'='", "'.'", 
  "':'", "'::'", "','", "'['", "']'", "'{'", "'}'", "'('", "')'", "", "", 
  "'!'"
};

std::vector<std::string> TParser::_symbolicNames = {
  "", "Use", "Var", "If", "Elif", "Else", "Bool", "End", "Attr", "Point", 
  "TwoPoint", "TwoTwoPoint", "Separator", "OpenArIndex", "CloseArIndex", 
  "OpenBlock", "CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", 
  "AssignmentOperator", "Not", "IncDecOperators", "Identifier", "IDPrefix", 
  "TypeSpec", "String", "Integer", "Float", "Whitespace", "Newline", "Words", 
  "BlockComment", "LineComment"
};

dfa::Vocabulary TParser::_vocabulary(_literalNames, _symbolicNames);

std::vector<std::string> TParser::_tokenNames;

TParser::Initializer::Initializer() {
	for (size_t i = 0; i < _symbolicNames.size(); ++i) {
		std::string name = _vocabulary.getLiteralName(i);
		if (name.empty()) {
			name = _vocabulary.getSymbolicName(i);
		}

		if (name.empty()) {
			_tokenNames.push_back("<INVALID>");
		} else {
      _tokenNames.push_back(name);
    }
	}

  static const uint16_t serializedATNSegment0[] = {
    0x3, 0x608b, 0xa72a, 0x8133, 0xb9ed, 0x417c, 0x3be7, 0x7786, 0x5964, 
       0x3, 0x23, 0x202, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 
       0x9, 0x4, 0x4, 0x5, 0x9, 0x5, 0x4, 0x6, 0x9, 0x6, 0x4, 0x7, 0x9, 
       0x7, 0x4, 0x8, 0x9, 0x8, 0x4, 0x9, 0x9, 0x9, 0x4, 0xa, 0x9, 0xa, 
       0x4, 0xb, 0x9, 0xb, 0x4, 0xc, 0x9, 0xc, 0x4, 0xd, 0x9, 0xd, 0x4, 
       0xe, 0x9, 0xe, 0x4, 0xf, 0x9, 0xf, 0x4, 0x10, 0x9, 0x10, 0x4, 0x11, 
       0x9, 0x11, 0x4, 0x12, 0x9, 0x12, 0x4, 0x13, 0x9, 0x13, 0x4, 0x14, 
       0x9, 0x14, 0x4, 0x15, 0x9, 0x15, 0x4, 0x16, 0x9, 0x16, 0x4, 0x17, 
       0x9, 0x17, 0x4, 0x18, 0x9, 0x18, 0x4, 0x19, 0x9, 0x19, 0x4, 0x1a, 
       0x9, 0x1a, 0x4, 0x1b, 0x9, 0x1b, 0x4, 0x1c, 0x9, 0x1c, 0x4, 0x1d, 
       0x9, 0x1d, 0x4, 0x1e, 0x9, 0x1e, 0x4, 0x1f, 0x9, 0x1f, 0x4, 0x20, 
       0x9, 0x20, 0x4, 0x21, 0x9, 0x21, 0x4, 0x22, 0x9, 0x22, 0x4, 0x23, 
       0x9, 0x23, 0x4, 0x24, 0x9, 0x24, 0x3, 0x2, 0x3, 0x2, 0x3, 0x2, 0x3, 
       0x3, 0x3, 0x3, 0x3, 0x3, 0x7, 0x3, 0x4f, 0xa, 0x3, 0xc, 0x3, 0xe, 
       0x3, 0x52, 0xb, 0x3, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 
       0x4, 0x5, 0x4, 0x59, 0xa, 0x4, 0x3, 0x5, 0x3, 0x5, 0x3, 0x6, 0x3, 
       0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 
       0x3, 0x7, 0x5, 0x7, 0x66, 0xa, 0x7, 0x3, 0x8, 0x3, 0x8, 0x3, 0x9, 
       0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 
       0xa, 0x3, 0xa, 0x5, 0xa, 0x73, 0xa, 0xa, 0x3, 0xb, 0x3, 0xb, 0x3, 
       0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x5, 0xb, 0x7c, 0xa, 
       0xb, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 
       0x5, 0xc, 0x84, 0xa, 0xc, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 
       0x3, 0xd, 0x5, 0xd, 0x8b, 0xa, 0xd, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 
       0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x5, 0xe, 0x93, 0xa, 0xe, 0x3, 0xf, 
       0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 
       0xf, 0x3, 0xf, 0x5, 0xf, 0x9e, 0xa, 0xf, 0x3, 0x10, 0x3, 0x10, 0x3, 
       0x10, 0x3, 0x10, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x5, 
       0x11, 0xa8, 0xa, 0x11, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 
       0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 
       0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 
       0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 
       0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 
       0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 
       0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 
       0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 
       0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 
       0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 
       0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 
       0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 
       0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 
       0x3, 0x12, 0x5, 0x12, 0xf7, 0xa, 0x12, 0x3, 0x13, 0x3, 0x13, 0x3, 
       0x14, 0x3, 0x14, 0x3, 0x15, 0x3, 0x15, 0x3, 0x15, 0x3, 0x16, 0x3, 
       0x16, 0x3, 0x16, 0x3, 0x16, 0x3, 0x16, 0x3, 0x16, 0x3, 0x16, 0x3, 
       0x16, 0x3, 0x16, 0x3, 0x16, 0x3, 0x16, 0x3, 0x16, 0x5, 0x16, 0x10c, 
       0xa, 0x16, 0x3, 0x17, 0x3, 0x17, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 
       0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x5, 0x18, 0x116, 0xa, 0x18, 0x3, 
       0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 
       0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x5, 0x19, 0x122, 0xa, 0x19, 
       0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x5, 0x1a, 0x127, 0xa, 0x1a, 0x3, 
       0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 
       0x1b, 0x3, 0x1b, 0x5, 0x1b, 0x131, 0xa, 0x1b, 0x3, 0x1c, 0x3, 0x1c, 
       0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 
       0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 
       0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x5, 0x1c, 
       0x146, 0xa, 0x1c, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 
       0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 
       0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 
       0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x5, 0x1d, 0x15b, 0xa, 0x1d, 0x3, 0x1e, 
       0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 
       0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x5, 0x1e, 
       0x169, 0xa, 0x1e, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x5, 
       0x1f, 0x16f, 0xa, 0x1f, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 
       0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 
       0x5, 0x20, 0x17b, 0xa, 0x20, 0x3, 0x21, 0x3, 0x21, 0x3, 0x21, 0x3, 
       0x21, 0x5, 0x21, 0x181, 0xa, 0x21, 0x3, 0x22, 0x3, 0x22, 0x3, 0x22, 
       0x3, 0x22, 0x3, 0x22, 0x3, 0x22, 0x3, 0x22, 0x7, 0x22, 0x18a, 0xa, 
       0x22, 0xc, 0x22, 0xe, 0x22, 0x18d, 0xb, 0x22, 0x3, 0x23, 0x3, 0x23, 
       0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 
       0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 
       0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 
       0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 
       0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 
       0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 
       0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 
       0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 
       0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 
       0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 
       0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 
       0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 
       0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 
       0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 
       0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 
       0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x5, 0x23, 0x1ef, 0xa, 
       0x23, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 
       0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 
       0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x5, 0x24, 0x200, 0xa, 0x24, 
       0x3, 0x24, 0x2, 0x4, 0x4, 0x42, 0x25, 0x2, 0x4, 0x6, 0x8, 0xa, 0xc, 
       0xe, 0x10, 0x12, 0x14, 0x16, 0x18, 0x1a, 0x1c, 0x1e, 0x20, 0x22, 
       0x24, 0x26, 0x28, 0x2a, 0x2c, 0x2e, 0x30, 0x32, 0x34, 0x36, 0x38, 
       0x3a, 0x3c, 0x3e, 0x40, 0x42, 0x44, 0x46, 0x2, 0x3, 0x3, 0x2, 0x15, 
       0x16, 0x2, 0x24b, 0x2, 0x48, 0x3, 0x2, 0x2, 0x2, 0x4, 0x4b, 0x3, 
       0x2, 0x2, 0x2, 0x6, 0x58, 0x3, 0x2, 0x2, 0x2, 0x8, 0x5a, 0x3, 0x2, 
       0x2, 0x2, 0xa, 0x5c, 0x3, 0x2, 0x2, 0x2, 0xc, 0x65, 0x3, 0x2, 0x2, 
       0x2, 0xe, 0x67, 0x3, 0x2, 0x2, 0x2, 0x10, 0x69, 0x3, 0x2, 0x2, 0x2, 
       0x12, 0x72, 0x3, 0x2, 0x2, 0x2, 0x14, 0x7b, 0x3, 0x2, 0x2, 0x2, 0x16, 
       0x83, 0x3, 0x2, 0x2, 0x2, 0x18, 0x8a, 0x3, 0x2, 0x2, 0x2, 0x1a, 0x92, 
       0x3, 0x2, 0x2, 0x2, 0x1c, 0x9d, 0x3, 0x2, 0x2, 0x2, 0x1e, 0x9f, 0x3, 
       0x2, 0x2, 0x2, 0x20, 0xa7, 0x3, 0x2, 0x2, 0x2, 0x22, 0xf6, 0x3, 0x2, 
       0x2, 0x2, 0x24, 0xf8, 0x3, 0x2, 0x2, 0x2, 0x26, 0xfa, 0x3, 0x2, 0x2, 
       0x2, 0x28, 0xfc, 0x3, 0x2, 0x2, 0x2, 0x2a, 0x10b, 0x3, 0x2, 0x2, 
       0x2, 0x2c, 0x10d, 0x3, 0x2, 0x2, 0x2, 0x2e, 0x115, 0x3, 0x2, 0x2, 
       0x2, 0x30, 0x121, 0x3, 0x2, 0x2, 0x2, 0x32, 0x126, 0x3, 0x2, 0x2, 
       0x2, 0x34, 0x130, 0x3, 0x2, 0x2, 0x2, 0x36, 0x145, 0x3, 0x2, 0x2, 
       0x2, 0x38, 0x15a, 0x3, 0x2, 0x2, 0x2, 0x3a, 0x168, 0x3, 0x2, 0x2, 
       0x2, 0x3c, 0x16e, 0x3, 0x2, 0x2, 0x2, 0x3e, 0x17a, 0x3, 0x2, 0x2, 
       0x2, 0x40, 0x180, 0x3, 0x2, 0x2, 0x2, 0x42, 0x182, 0x3, 0x2, 0x2, 
       0x2, 0x44, 0x1ee, 0x3, 0x2, 0x2, 0x2, 0x46, 0x1ff, 0x3, 0x2, 0x2, 
       0x2, 0x48, 0x49, 0x5, 0x4, 0x3, 0x2, 0x49, 0x4a, 0x7, 0x2, 0x2, 0x3, 
       0x4a, 0x3, 0x3, 0x2, 0x2, 0x2, 0x4b, 0x50, 0x8, 0x3, 0x1, 0x2, 0x4c, 
       0x4d, 0xc, 0x4, 0x2, 0x2, 0x4d, 0x4f, 0x5, 0x6, 0x4, 0x2, 0x4e, 0x4c, 
       0x3, 0x2, 0x2, 0x2, 0x4f, 0x52, 0x3, 0x2, 0x2, 0x2, 0x50, 0x4e, 0x3, 
       0x2, 0x2, 0x2, 0x50, 0x51, 0x3, 0x2, 0x2, 0x2, 0x51, 0x5, 0x3, 0x2, 
       0x2, 0x2, 0x52, 0x50, 0x3, 0x2, 0x2, 0x2, 0x53, 0x59, 0x5, 0x8, 0x5, 
       0x2, 0x54, 0x59, 0x5, 0xa, 0x6, 0x2, 0x55, 0x59, 0x5, 0x10, 0x9, 
       0x2, 0x56, 0x59, 0x5, 0x28, 0x15, 0x2, 0x57, 0x59, 0x5, 0x32, 0x1a, 
       0x2, 0x58, 0x53, 0x3, 0x2, 0x2, 0x2, 0x58, 0x54, 0x3, 0x2, 0x2, 0x2, 
       0x58, 0x55, 0x3, 0x2, 0x2, 0x2, 0x58, 0x56, 0x3, 0x2, 0x2, 0x2, 0x58, 
       0x57, 0x3, 0x2, 0x2, 0x2, 0x59, 0x7, 0x3, 0x2, 0x2, 0x2, 0x5a, 0x5b, 
       0x7, 0x20, 0x2, 0x2, 0x5b, 0x9, 0x3, 0x2, 0x2, 0x2, 0x5c, 0x5d, 0x7, 
       0x3, 0x2, 0x2, 0x5d, 0x5e, 0x5, 0xc, 0x7, 0x2, 0x5e, 0x5f, 0x7, 0x9, 
       0x2, 0x2, 0x5f, 0xb, 0x3, 0x2, 0x2, 0x2, 0x60, 0x66, 0x5, 0xe, 0x8, 
       0x2, 0x61, 0x62, 0x5, 0xe, 0x8, 0x2, 0x62, 0x63, 0x7, 0xe, 0x2, 0x2, 
       0x63, 0x64, 0x5, 0xc, 0x7, 0x2, 0x64, 0x66, 0x3, 0x2, 0x2, 0x2, 0x65, 
       0x60, 0x3, 0x2, 0x2, 0x2, 0x65, 0x61, 0x3, 0x2, 0x2, 0x2, 0x66, 0xd, 
       0x3, 0x2, 0x2, 0x2, 0x67, 0x68, 0x7, 0x1c, 0x2, 0x2, 0x68, 0xf, 0x3, 
       0x2, 0x2, 0x2, 0x69, 0x6a, 0x7, 0x4, 0x2, 0x2, 0x6a, 0x6b, 0x5, 0x12, 
       0xa, 0x2, 0x6b, 0x6c, 0x7, 0x9, 0x2, 0x2, 0x6c, 0x11, 0x3, 0x2, 0x2, 
       0x2, 0x6d, 0x73, 0x5, 0x14, 0xb, 0x2, 0x6e, 0x6f, 0x5, 0x14, 0xb, 
       0x2, 0x6f, 0x70, 0x7, 0xe, 0x2, 0x2, 0x70, 0x71, 0x5, 0x12, 0xa, 
       0x2, 0x71, 0x73, 0x3, 0x2, 0x2, 0x2, 0x72, 0x6d, 0x3, 0x2, 0x2, 0x2, 
       0x72, 0x6e, 0x3, 0x2, 0x2, 0x2, 0x73, 0x13, 0x3, 0x2, 0x2, 0x2, 0x74, 
       0x75, 0x7, 0x19, 0x2, 0x2, 0x75, 0x76, 0x7, 0xa, 0x2, 0x2, 0x76, 
       0x7c, 0x5, 0x46, 0x24, 0x2, 0x77, 0x78, 0x7, 0x19, 0x2, 0x2, 0x78, 
       0x79, 0x7, 0x1b, 0x2, 0x2, 0x79, 0x7a, 0x7, 0xa, 0x2, 0x2, 0x7a, 
       0x7c, 0x5, 0x46, 0x24, 0x2, 0x7b, 0x74, 0x3, 0x2, 0x2, 0x2, 0x7b, 
       0x77, 0x3, 0x2, 0x2, 0x2, 0x7c, 0x15, 0x3, 0x2, 0x2, 0x2, 0x7d, 0x7e, 
       0x7, 0xf, 0x2, 0x2, 0x7e, 0x84, 0x7, 0x10, 0x2, 0x2, 0x7f, 0x80, 
       0x7, 0xf, 0x2, 0x2, 0x80, 0x81, 0x5, 0x18, 0xd, 0x2, 0x81, 0x82, 
       0x7, 0x10, 0x2, 0x2, 0x82, 0x84, 0x3, 0x2, 0x2, 0x2, 0x83, 0x7d, 
       0x3, 0x2, 0x2, 0x2, 0x83, 0x7f, 0x3, 0x2, 0x2, 0x2, 0x84, 0x17, 0x3, 
       0x2, 0x2, 0x2, 0x85, 0x8b, 0x5, 0x46, 0x24, 0x2, 0x86, 0x87, 0x5, 
       0x46, 0x24, 0x2, 0x87, 0x88, 0x7, 0xe, 0x2, 0x2, 0x88, 0x89, 0x5, 
       0x18, 0xd, 0x2, 0x89, 0x8b, 0x3, 0x2, 0x2, 0x2, 0x8a, 0x85, 0x3, 
       0x2, 0x2, 0x2, 0x8a, 0x86, 0x3, 0x2, 0x2, 0x2, 0x8b, 0x19, 0x3, 0x2, 
       0x2, 0x2, 0x8c, 0x8d, 0x7, 0x11, 0x2, 0x2, 0x8d, 0x93, 0x7, 0x12, 
       0x2, 0x2, 0x8e, 0x8f, 0x7, 0x11, 0x2, 0x2, 0x8f, 0x90, 0x5, 0x1c, 
       0xf, 0x2, 0x90, 0x91, 0x7, 0x12, 0x2, 0x2, 0x91, 0x93, 0x3, 0x2, 
       0x2, 0x2, 0x92, 0x8c, 0x3, 0x2, 0x2, 0x2, 0x92, 0x8e, 0x3, 0x2, 0x2, 
       0x2, 0x93, 0x1b, 0x3, 0x2, 0x2, 0x2, 0x94, 0x95, 0x7, 0x19, 0x2, 
       0x2, 0x95, 0x96, 0x7, 0xc, 0x2, 0x2, 0x96, 0x9e, 0x5, 0x46, 0x24, 
       0x2, 0x97, 0x98, 0x7, 0x19, 0x2, 0x2, 0x98, 0x99, 0x7, 0xc, 0x2, 
       0x2, 0x99, 0x9a, 0x5, 0x46, 0x24, 0x2, 0x9a, 0x9b, 0x7, 0xe, 0x2, 
       0x2, 0x9b, 0x9c, 0x5, 0x1c, 0xf, 0x2, 0x9c, 0x9e, 0x3, 0x2, 0x2, 
       0x2, 0x9d, 0x94, 0x3, 0x2, 0x2, 0x2, 0x9d, 0x97, 0x3, 0x2, 0x2, 0x2, 
       0x9e, 0x1d, 0x3, 0x2, 0x2, 0x2, 0x9f, 0xa0, 0x7, 0x13, 0x2, 0x2, 
       0xa0, 0xa1, 0x5, 0x20, 0x11, 0x2, 0xa1, 0xa2, 0x7, 0x14, 0x2, 0x2, 
       0xa2, 0x1f, 0x3, 0x2, 0x2, 0x2, 0xa3, 0xa8, 0x5, 0x22, 0x12, 0x2, 
       0xa4, 0xa5, 0x5, 0x22, 0x12, 0x2, 0xa5, 0xa6, 0x5, 0x20, 0x11, 0x2, 
       0xa6, 0xa8, 0x3, 0x2, 0x2, 0x2, 0xa7, 0xa3, 0x3, 0x2, 0x2, 0x2, 0xa7, 
       0xa4, 0x3, 0x2, 0x2, 0x2, 0xa8, 0x21, 0x3, 0x2, 0x2, 0x2, 0xa9, 0xf7, 
       0x7, 0x19, 0x2, 0x2, 0xaa, 0xab, 0x7, 0x19, 0x2, 0x2, 0xab, 0xf7, 
       0x7, 0x15, 0x2, 0x2, 0xac, 0xad, 0x7, 0x19, 0x2, 0x2, 0xad, 0xf7, 
       0x7, 0x1b, 0x2, 0x2, 0xae, 0xaf, 0x7, 0x19, 0x2, 0x2, 0xaf, 0xb0, 
       0x7, 0x1b, 0x2, 0x2, 0xb0, 0xf7, 0x7, 0x15, 0x2, 0x2, 0xb1, 0xb2, 
       0x5, 0x24, 0x13, 0x2, 0xb2, 0xb3, 0x7, 0x19, 0x2, 0x2, 0xb3, 0xf7, 
       0x3, 0x2, 0x2, 0x2, 0xb4, 0xb5, 0x5, 0x24, 0x13, 0x2, 0xb5, 0xb6, 
       0x7, 0x19, 0x2, 0x2, 0xb6, 0xb7, 0x7, 0x15, 0x2, 0x2, 0xb7, 0xf7, 
       0x3, 0x2, 0x2, 0x2, 0xb8, 0xb9, 0x5, 0x24, 0x13, 0x2, 0xb9, 0xba, 
       0x7, 0x19, 0x2, 0x2, 0xba, 0xbb, 0x7, 0x1b, 0x2, 0x2, 0xbb, 0xf7, 
       0x3, 0x2, 0x2, 0x2, 0xbc, 0xbd, 0x5, 0x24, 0x13, 0x2, 0xbd, 0xbe, 
       0x7, 0x19, 0x2, 0x2, 0xbe, 0xbf, 0x7, 0x1b, 0x2, 0x2, 0xbf, 0xc0, 
       0x7, 0x15, 0x2, 0x2, 0xc0, 0xf7, 0x3, 0x2, 0x2, 0x2, 0xc1, 0xc2, 
       0x7, 0x19, 0x2, 0x2, 0xc2, 0xf7, 0x5, 0x26, 0x14, 0x2, 0xc3, 0xc4, 
       0x7, 0x19, 0x2, 0x2, 0xc4, 0xc5, 0x5, 0x26, 0x14, 0x2, 0xc5, 0xc6, 
       0x7, 0x15, 0x2, 0x2, 0xc6, 0xf7, 0x3, 0x2, 0x2, 0x2, 0xc7, 0xc8, 
       0x7, 0x19, 0x2, 0x2, 0xc8, 0xc9, 0x5, 0x26, 0x14, 0x2, 0xc9, 0xca, 
       0x7, 0x1b, 0x2, 0x2, 0xca, 0xf7, 0x3, 0x2, 0x2, 0x2, 0xcb, 0xcc, 
       0x7, 0x19, 0x2, 0x2, 0xcc, 0xcd, 0x5, 0x26, 0x14, 0x2, 0xcd, 0xce, 
       0x7, 0x1b, 0x2, 0x2, 0xce, 0xcf, 0x7, 0x15, 0x2, 0x2, 0xcf, 0xf7, 
       0x3, 0x2, 0x2, 0x2, 0xd0, 0xf7, 0x7, 0x1d, 0x2, 0x2, 0xd1, 0xd2, 
       0x7, 0x1d, 0x2, 0x2, 0xd2, 0xf7, 0x7, 0x15, 0x2, 0x2, 0xd3, 0xd4, 
       0x7, 0x1d, 0x2, 0x2, 0xd4, 0xf7, 0x7, 0x1b, 0x2, 0x2, 0xd5, 0xd6, 
       0x7, 0x1d, 0x2, 0x2, 0xd6, 0xd7, 0x7, 0x1b, 0x2, 0x2, 0xd7, 0xf7, 
       0x7, 0x15, 0x2, 0x2, 0xd8, 0xf7, 0x7, 0x1e, 0x2, 0x2, 0xd9, 0xda, 
       0x7, 0x1e, 0x2, 0x2, 0xda, 0xf7, 0x7, 0x15, 0x2, 0x2, 0xdb, 0xdc, 
       0x7, 0x1e, 0x2, 0x2, 0xdc, 0xf7, 0x7, 0x1b, 0x2, 0x2, 0xdd, 0xde, 
       0x7, 0x1e, 0x2, 0x2, 0xde, 0xdf, 0x7, 0x1b, 0x2, 0x2, 0xdf, 0xf7, 
       0x7, 0x15, 0x2, 0x2, 0xe0, 0xf7, 0x5, 0x2a, 0x16, 0x2, 0xe1, 0xe2, 
       0x5, 0x2a, 0x16, 0x2, 0xe2, 0xe3, 0x7, 0x15, 0x2, 0x2, 0xe3, 0xf7, 
       0x3, 0x2, 0x2, 0x2, 0xe4, 0xe5, 0x5, 0x2a, 0x16, 0x2, 0xe5, 0xe6, 
       0x7, 0x1b, 0x2, 0x2, 0xe6, 0xf7, 0x3, 0x2, 0x2, 0x2, 0xe7, 0xe8, 
       0x5, 0x2a, 0x16, 0x2, 0xe8, 0xe9, 0x7, 0x1b, 0x2, 0x2, 0xe9, 0xea, 
       0x7, 0x15, 0x2, 0x2, 0xea, 0xf7, 0x3, 0x2, 0x2, 0x2, 0xeb, 0xf7, 
       0x5, 0x1e, 0x10, 0x2, 0xec, 0xed, 0x5, 0x1e, 0x10, 0x2, 0xed, 0xee, 
       0x7, 0x15, 0x2, 0x2, 0xee, 0xf7, 0x3, 0x2, 0x2, 0x2, 0xef, 0xf0, 
       0x5, 0x1e, 0x10, 0x2, 0xf0, 0xf1, 0x7, 0x1b, 0x2, 0x2, 0xf1, 0xf7, 
       0x3, 0x2, 0x2, 0x2, 0xf2, 0xf3, 0x5, 0x1e, 0x10, 0x2, 0xf3, 0xf4, 
       0x7, 0x1b, 0x2, 0x2, 0xf4, 0xf5, 0x7, 0x15, 0x2, 0x2, 0xf5, 0xf7, 
       0x3, 0x2, 0x2, 0x2, 0xf6, 0xa9, 0x3, 0x2, 0x2, 0x2, 0xf6, 0xaa, 0x3, 
       0x2, 0x2, 0x2, 0xf6, 0xac, 0x3, 0x2, 0x2, 0x2, 0xf6, 0xae, 0x3, 0x2, 
       0x2, 0x2, 0xf6, 0xb1, 0x3, 0x2, 0x2, 0x2, 0xf6, 0xb4, 0x3, 0x2, 0x2, 
       0x2, 0xf6, 0xb8, 0x3, 0x2, 0x2, 0x2, 0xf6, 0xbc, 0x3, 0x2, 0x2, 0x2, 
       0xf6, 0xc1, 0x3, 0x2, 0x2, 0x2, 0xf6, 0xc3, 0x3, 0x2, 0x2, 0x2, 0xf6, 
       0xc7, 0x3, 0x2, 0x2, 0x2, 0xf6, 0xcb, 0x3, 0x2, 0x2, 0x2, 0xf6, 0xd0, 
       0x3, 0x2, 0x2, 0x2, 0xf6, 0xd1, 0x3, 0x2, 0x2, 0x2, 0xf6, 0xd3, 0x3, 
       0x2, 0x2, 0x2, 0xf6, 0xd5, 0x3, 0x2, 0x2, 0x2, 0xf6, 0xd8, 0x3, 0x2, 
       0x2, 0x2, 0xf6, 0xd9, 0x3, 0x2, 0x2, 0x2, 0xf6, 0xdb, 0x3, 0x2, 0x2, 
       0x2, 0xf6, 0xdd, 0x3, 0x2, 0x2, 0x2, 0xf6, 0xe0, 0x3, 0x2, 0x2, 0x2, 
       0xf6, 0xe1, 0x3, 0x2, 0x2, 0x2, 0xf6, 0xe4, 0x3, 0x2, 0x2, 0x2, 0xf6, 
       0xe7, 0x3, 0x2, 0x2, 0x2, 0xf6, 0xeb, 0x3, 0x2, 0x2, 0x2, 0xf6, 0xec, 
       0x3, 0x2, 0x2, 0x2, 0xf6, 0xef, 0x3, 0x2, 0x2, 0x2, 0xf6, 0xf2, 0x3, 
       0x2, 0x2, 0x2, 0xf7, 0x23, 0x3, 0x2, 0x2, 0x2, 0xf8, 0xf9, 0x7, 0x18, 
       0x2, 0x2, 0xf9, 0x25, 0x3, 0x2, 0x2, 0x2, 0xfa, 0xfb, 0x7, 0x18, 
       0x2, 0x2, 0xfb, 0x27, 0x3, 0x2, 0x2, 0x2, 0xfc, 0xfd, 0x5, 0x2a, 
       0x16, 0x2, 0xfd, 0xfe, 0x7, 0x9, 0x2, 0x2, 0xfe, 0x29, 0x3, 0x2, 
       0x2, 0x2, 0xff, 0x100, 0x7, 0x19, 0x2, 0x2, 0x100, 0x10c, 0x5, 0x2e, 
       0x18, 0x2, 0x101, 0x102, 0x7, 0x19, 0x2, 0x2, 0x102, 0x103, 0x7, 
       0xb, 0x2, 0x2, 0x103, 0x104, 0x5, 0x2c, 0x17, 0x2, 0x104, 0x105, 
       0x5, 0x2e, 0x18, 0x2, 0x105, 0x10c, 0x3, 0x2, 0x2, 0x2, 0x106, 0x107, 
       0x7, 0x19, 0x2, 0x2, 0x107, 0x108, 0x7, 0xd, 0x2, 0x2, 0x108, 0x109, 
       0x5, 0x2c, 0x17, 0x2, 0x109, 0x10a, 0x5, 0x2e, 0x18, 0x2, 0x10a, 
       0x10c, 0x3, 0x2, 0x2, 0x2, 0x10b, 0xff, 0x3, 0x2, 0x2, 0x2, 0x10b, 
       0x101, 0x3, 0x2, 0x2, 0x2, 0x10b, 0x106, 0x3, 0x2, 0x2, 0x2, 0x10c, 
       0x2b, 0x3, 0x2, 0x2, 0x2, 0x10d, 0x10e, 0x7, 0x19, 0x2, 0x2, 0x10e, 
       0x2d, 0x3, 0x2, 0x2, 0x2, 0x10f, 0x110, 0x7, 0x13, 0x2, 0x2, 0x110, 
       0x116, 0x7, 0x14, 0x2, 0x2, 0x111, 0x112, 0x7, 0x13, 0x2, 0x2, 0x112, 
       0x113, 0x5, 0x30, 0x19, 0x2, 0x113, 0x114, 0x7, 0x14, 0x2, 0x2, 0x114, 
       0x116, 0x3, 0x2, 0x2, 0x2, 0x115, 0x10f, 0x3, 0x2, 0x2, 0x2, 0x115, 
       0x111, 0x3, 0x2, 0x2, 0x2, 0x116, 0x2f, 0x3, 0x2, 0x2, 0x2, 0x117, 
       0x122, 0x5, 0x46, 0x24, 0x2, 0x118, 0x119, 0x5, 0x46, 0x24, 0x2, 
       0x119, 0x11a, 0x7, 0xe, 0x2, 0x2, 0x11a, 0x11b, 0x5, 0x30, 0x19, 
       0x2, 0x11b, 0x122, 0x3, 0x2, 0x2, 0x2, 0x11c, 0x122, 0x5, 0x20, 0x11, 
       0x2, 0x11d, 0x11e, 0x5, 0x20, 0x11, 0x2, 0x11e, 0x11f, 0x7, 0xe, 
       0x2, 0x2, 0x11f, 0x120, 0x5, 0x30, 0x19, 0x2, 0x120, 0x122, 0x3, 
       0x2, 0x2, 0x2, 0x121, 0x117, 0x3, 0x2, 0x2, 0x2, 0x121, 0x118, 0x3, 
       0x2, 0x2, 0x2, 0x121, 0x11c, 0x3, 0x2, 0x2, 0x2, 0x121, 0x11d, 0x3, 
       0x2, 0x2, 0x2, 0x122, 0x31, 0x3, 0x2, 0x2, 0x2, 0x123, 0x127, 0x5, 
       0x36, 0x1c, 0x2, 0x124, 0x127, 0x5, 0x38, 0x1d, 0x2, 0x125, 0x127, 
       0x5, 0x3a, 0x1e, 0x2, 0x126, 0x123, 0x3, 0x2, 0x2, 0x2, 0x126, 0x124, 
       0x3, 0x2, 0x2, 0x2, 0x126, 0x125, 0x3, 0x2, 0x2, 0x2, 0x127, 0x33, 
       0x3, 0x2, 0x2, 0x2, 0x128, 0x131, 0x5, 0x32, 0x1a, 0x2, 0x129, 0x12a, 
       0x5, 0x32, 0x1a, 0x2, 0x12a, 0x12b, 0x5, 0x34, 0x1b, 0x2, 0x12b, 
       0x131, 0x3, 0x2, 0x2, 0x2, 0x12c, 0x131, 0x5, 0x6, 0x4, 0x2, 0x12d, 
       0x12e, 0x5, 0x6, 0x4, 0x2, 0x12e, 0x12f, 0x5, 0x34, 0x1b, 0x2, 0x12f, 
       0x131, 0x3, 0x2, 0x2, 0x2, 0x130, 0x128, 0x3, 0x2, 0x2, 0x2, 0x130, 
       0x129, 0x3, 0x2, 0x2, 0x2, 0x130, 0x12c, 0x3, 0x2, 0x2, 0x2, 0x130, 
       0x12d, 0x3, 0x2, 0x2, 0x2, 0x131, 0x35, 0x3, 0x2, 0x2, 0x2, 0x132, 
       0x133, 0x7, 0x5, 0x2, 0x2, 0x133, 0x134, 0x5, 0x3e, 0x20, 0x2, 0x134, 
       0x135, 0x5, 0x28, 0x15, 0x2, 0x135, 0x146, 0x3, 0x2, 0x2, 0x2, 0x136, 
       0x137, 0x7, 0x5, 0x2, 0x2, 0x137, 0x138, 0x5, 0x3e, 0x20, 0x2, 0x138, 
       0x139, 0x7, 0x11, 0x2, 0x2, 0x139, 0x13a, 0x7, 0x12, 0x2, 0x2, 0x13a, 
       0x146, 0x3, 0x2, 0x2, 0x2, 0x13b, 0x13c, 0x7, 0x5, 0x2, 0x2, 0x13c, 
       0x13d, 0x5, 0x3e, 0x20, 0x2, 0x13d, 0x13e, 0x7, 0x11, 0x2, 0x2, 0x13e, 
       0x13f, 0x5, 0x34, 0x1b, 0x2, 0x13f, 0x140, 0x7, 0x12, 0x2, 0x2, 0x140, 
       0x146, 0x3, 0x2, 0x2, 0x2, 0x141, 0x142, 0x7, 0x5, 0x2, 0x2, 0x142, 
       0x143, 0x5, 0x3e, 0x20, 0x2, 0x143, 0x144, 0x5, 0x3c, 0x1f, 0x2, 
       0x144, 0x146, 0x3, 0x2, 0x2, 0x2, 0x145, 0x132, 0x3, 0x2, 0x2, 0x2, 
       0x145, 0x136, 0x3, 0x2, 0x2, 0x2, 0x145, 0x13b, 0x3, 0x2, 0x2, 0x2, 
       0x145, 0x141, 0x3, 0x2, 0x2, 0x2, 0x146, 0x37, 0x3, 0x2, 0x2, 0x2, 
       0x147, 0x148, 0x7, 0x6, 0x2, 0x2, 0x148, 0x149, 0x5, 0x3e, 0x20, 
       0x2, 0x149, 0x14a, 0x5, 0x28, 0x15, 0x2, 0x14a, 0x15b, 0x3, 0x2, 
       0x2, 0x2, 0x14b, 0x14c, 0x7, 0x6, 0x2, 0x2, 0x14c, 0x14d, 0x5, 0x3e, 
       0x20, 0x2, 0x14d, 0x14e, 0x7, 0x11, 0x2, 0x2, 0x14e, 0x14f, 0x7, 
       0x12, 0x2, 0x2, 0x14f, 0x15b, 0x3, 0x2, 0x2, 0x2, 0x150, 0x151, 0x7, 
       0x6, 0x2, 0x2, 0x151, 0x152, 0x5, 0x3e, 0x20, 0x2, 0x152, 0x153, 
       0x7, 0x11, 0x2, 0x2, 0x153, 0x154, 0x5, 0x34, 0x1b, 0x2, 0x154, 0x155, 
       0x7, 0x12, 0x2, 0x2, 0x155, 0x15b, 0x3, 0x2, 0x2, 0x2, 0x156, 0x157, 
       0x7, 0x6, 0x2, 0x2, 0x157, 0x158, 0x5, 0x3e, 0x20, 0x2, 0x158, 0x159, 
       0x5, 0x3c, 0x1f, 0x2, 0x159, 0x15b, 0x3, 0x2, 0x2, 0x2, 0x15a, 0x147, 
       0x3, 0x2, 0x2, 0x2, 0x15a, 0x14b, 0x3, 0x2, 0x2, 0x2, 0x15a, 0x150, 
       0x3, 0x2, 0x2, 0x2, 0x15a, 0x156, 0x3, 0x2, 0x2, 0x2, 0x15b, 0x39, 
       0x3, 0x2, 0x2, 0x2, 0x15c, 0x15d, 0x7, 0x7, 0x2, 0x2, 0x15d, 0x169, 
       0x5, 0x28, 0x15, 0x2, 0x15e, 0x15f, 0x7, 0x7, 0x2, 0x2, 0x15f, 0x160, 
       0x7, 0x11, 0x2, 0x2, 0x160, 0x169, 0x7, 0x12, 0x2, 0x2, 0x161, 0x162, 
       0x7, 0x7, 0x2, 0x2, 0x162, 0x163, 0x7, 0x11, 0x2, 0x2, 0x163, 0x164, 
       0x5, 0x34, 0x1b, 0x2, 0x164, 0x165, 0x7, 0x12, 0x2, 0x2, 0x165, 0x169, 
       0x3, 0x2, 0x2, 0x2, 0x166, 0x167, 0x7, 0x7, 0x2, 0x2, 0x167, 0x169, 
       0x5, 0x3c, 0x1f, 0x2, 0x168, 0x15c, 0x3, 0x2, 0x2, 0x2, 0x168, 0x15e, 
       0x3, 0x2, 0x2, 0x2, 0x168, 0x161, 0x3, 0x2, 0x2, 0x2, 0x168, 0x166, 
       0x3, 0x2, 0x2, 0x2, 0x169, 0x3b, 0x3, 0x2, 0x2, 0x2, 0x16a, 0x16f, 
       0x5, 0x36, 0x1c, 0x2, 0x16b, 0x16c, 0x5, 0x36, 0x1c, 0x2, 0x16c, 
       0x16d, 0x5, 0x34, 0x1b, 0x2, 0x16d, 0x16f, 0x3, 0x2, 0x2, 0x2, 0x16e, 
       0x16a, 0x3, 0x2, 0x2, 0x2, 0x16e, 0x16b, 0x3, 0x2, 0x2, 0x2, 0x16f, 
       0x3d, 0x3, 0x2, 0x2, 0x2, 0x170, 0x17b, 0x5, 0x40, 0x21, 0x2, 0x171, 
       0x172, 0x5, 0x40, 0x21, 0x2, 0x172, 0x173, 0x5, 0x3e, 0x20, 0x2, 
       0x173, 0x17b, 0x3, 0x2, 0x2, 0x2, 0x174, 0x17b, 0x5, 0x42, 0x22, 
       0x2, 0x175, 0x176, 0x5, 0x42, 0x22, 0x2, 0x176, 0x177, 0x5, 0x3e, 
       0x20, 0x2, 0x177, 0x17b, 0x3, 0x2, 0x2, 0x2, 0x178, 0x179, 0x7, 0x17, 
       0x2, 0x2, 0x179, 0x17b, 0x5, 0x3e, 0x20, 0x2, 0x17a, 0x170, 0x3, 
       0x2, 0x2, 0x2, 0x17a, 0x171, 0x3, 0x2, 0x2, 0x2, 0x17a, 0x174, 0x3, 
       0x2, 0x2, 0x2, 0x17a, 0x175, 0x3, 0x2, 0x2, 0x2, 0x17a, 0x178, 0x3, 
       0x2, 0x2, 0x2, 0x17b, 0x3f, 0x3, 0x2, 0x2, 0x2, 0x17c, 0x181, 0x5, 
       0x44, 0x23, 0x2, 0x17d, 0x17e, 0x5, 0x44, 0x23, 0x2, 0x17e, 0x17f, 
       0x5, 0x40, 0x21, 0x2, 0x17f, 0x181, 0x3, 0x2, 0x2, 0x2, 0x180, 0x17c, 
       0x3, 0x2, 0x2, 0x2, 0x180, 0x17d, 0x3, 0x2, 0x2, 0x2, 0x181, 0x41, 
       0x3, 0x2, 0x2, 0x2, 0x182, 0x183, 0x8, 0x22, 0x1, 0x2, 0x183, 0x184, 
       0x7, 0x13, 0x2, 0x2, 0x184, 0x185, 0x5, 0x3e, 0x20, 0x2, 0x185, 0x186, 
       0x7, 0x14, 0x2, 0x2, 0x186, 0x18b, 0x3, 0x2, 0x2, 0x2, 0x187, 0x188, 
       0xc, 0x3, 0x2, 0x2, 0x188, 0x18a, 0x7, 0x16, 0x2, 0x2, 0x189, 0x187, 
       0x3, 0x2, 0x2, 0x2, 0x18a, 0x18d, 0x3, 0x2, 0x2, 0x2, 0x18b, 0x189, 
       0x3, 0x2, 0x2, 0x2, 0x18b, 0x18c, 0x3, 0x2, 0x2, 0x2, 0x18c, 0x43, 
       0x3, 0x2, 0x2, 0x2, 0x18d, 0x18b, 0x3, 0x2, 0x2, 0x2, 0x18e, 0x1ef, 
       0x7, 0x19, 0x2, 0x2, 0x18f, 0x190, 0x7, 0x19, 0x2, 0x2, 0x190, 0x1ef, 
       0x9, 0x2, 0x2, 0x2, 0x191, 0x192, 0x7, 0x19, 0x2, 0x2, 0x192, 0x1ef, 
       0x7, 0x1b, 0x2, 0x2, 0x193, 0x194, 0x7, 0x19, 0x2, 0x2, 0x194, 0x195, 
       0x7, 0x1b, 0x2, 0x2, 0x195, 0x1ef, 0x9, 0x2, 0x2, 0x2, 0x196, 0x197, 
       0x5, 0x24, 0x13, 0x2, 0x197, 0x198, 0x7, 0x19, 0x2, 0x2, 0x198, 0x1ef, 
       0x3, 0x2, 0x2, 0x2, 0x199, 0x19a, 0x5, 0x24, 0x13, 0x2, 0x19a, 0x19b, 
       0x7, 0x19, 0x2, 0x2, 0x19b, 0x19c, 0x9, 0x2, 0x2, 0x2, 0x19c, 0x1ef, 
       0x3, 0x2, 0x2, 0x2, 0x19d, 0x19e, 0x5, 0x24, 0x13, 0x2, 0x19e, 0x19f, 
       0x7, 0x19, 0x2, 0x2, 0x19f, 0x1a0, 0x7, 0x1b, 0x2, 0x2, 0x1a0, 0x1ef, 
       0x3, 0x2, 0x2, 0x2, 0x1a1, 0x1a2, 0x5, 0x24, 0x13, 0x2, 0x1a2, 0x1a3, 
       0x7, 0x19, 0x2, 0x2, 0x1a3, 0x1a4, 0x7, 0x1b, 0x2, 0x2, 0x1a4, 0x1a5, 
       0x9, 0x2, 0x2, 0x2, 0x1a5, 0x1ef, 0x3, 0x2, 0x2, 0x2, 0x1a6, 0x1a7, 
       0x7, 0x19, 0x2, 0x2, 0x1a7, 0x1ef, 0x5, 0x26, 0x14, 0x2, 0x1a8, 0x1a9, 
       0x7, 0x19, 0x2, 0x2, 0x1a9, 0x1aa, 0x5, 0x26, 0x14, 0x2, 0x1aa, 0x1ab, 
       0x9, 0x2, 0x2, 0x2, 0x1ab, 0x1ef, 0x3, 0x2, 0x2, 0x2, 0x1ac, 0x1ad, 
       0x7, 0x19, 0x2, 0x2, 0x1ad, 0x1ae, 0x5, 0x26, 0x14, 0x2, 0x1ae, 0x1af, 
       0x7, 0x1b, 0x2, 0x2, 0x1af, 0x1ef, 0x3, 0x2, 0x2, 0x2, 0x1b0, 0x1b1, 
       0x7, 0x19, 0x2, 0x2, 0x1b1, 0x1b2, 0x5, 0x26, 0x14, 0x2, 0x1b2, 0x1b3, 
       0x7, 0x1b, 0x2, 0x2, 0x1b3, 0x1b4, 0x9, 0x2, 0x2, 0x2, 0x1b4, 0x1ef, 
       0x3, 0x2, 0x2, 0x2, 0x1b5, 0x1ef, 0x7, 0x1d, 0x2, 0x2, 0x1b6, 0x1b7, 
       0x7, 0x1d, 0x2, 0x2, 0x1b7, 0x1ef, 0x9, 0x2, 0x2, 0x2, 0x1b8, 0x1b9, 
       0x7, 0x1d, 0x2, 0x2, 0x1b9, 0x1ef, 0x7, 0x1b, 0x2, 0x2, 0x1ba, 0x1bb, 
       0x7, 0x1d, 0x2, 0x2, 0x1bb, 0x1bc, 0x7, 0x1b, 0x2, 0x2, 0x1bc, 0x1ef, 
       0x9, 0x2, 0x2, 0x2, 0x1bd, 0x1ef, 0x7, 0x1e, 0x2, 0x2, 0x1be, 0x1bf, 
       0x7, 0x1e, 0x2, 0x2, 0x1bf, 0x1ef, 0x9, 0x2, 0x2, 0x2, 0x1c0, 0x1c1, 
       0x7, 0x1e, 0x2, 0x2, 0x1c1, 0x1ef, 0x7, 0x1b, 0x2, 0x2, 0x1c2, 0x1c3, 
       0x7, 0x1e, 0x2, 0x2, 0x1c3, 0x1c4, 0x7, 0x1b, 0x2, 0x2, 0x1c4, 0x1ef, 
       0x9, 0x2, 0x2, 0x2, 0x1c5, 0x1ef, 0x5, 0x2a, 0x16, 0x2, 0x1c6, 0x1c7, 
       0x5, 0x2a, 0x16, 0x2, 0x1c7, 0x1c8, 0x9, 0x2, 0x2, 0x2, 0x1c8, 0x1ef, 
       0x3, 0x2, 0x2, 0x2, 0x1c9, 0x1ca, 0x5, 0x2a, 0x16, 0x2, 0x1ca, 0x1cb, 
       0x7, 0x1b, 0x2, 0x2, 0x1cb, 0x1ef, 0x3, 0x2, 0x2, 0x2, 0x1cc, 0x1cd, 
       0x5, 0x2a, 0x16, 0x2, 0x1cd, 0x1ce, 0x7, 0x1b, 0x2, 0x2, 0x1ce, 0x1cf, 
       0x9, 0x2, 0x2, 0x2, 0x1cf, 0x1ef, 0x3, 0x2, 0x2, 0x2, 0x1d0, 0x1d1, 
       0x7, 0x19, 0x2, 0x2, 0x1d1, 0x1d2, 0x7, 0xa, 0x2, 0x2, 0x1d2, 0x1ef, 
       0x5, 0x2a, 0x16, 0x2, 0x1d3, 0x1d4, 0x7, 0x19, 0x2, 0x2, 0x1d4, 0x1d5, 
       0x7, 0xa, 0x2, 0x2, 0x1d5, 0x1d6, 0x5, 0x2a, 0x16, 0x2, 0x1d6, 0x1d7, 
       0x9, 0x2, 0x2, 0x2, 0x1d7, 0x1ef, 0x3, 0x2, 0x2, 0x2, 0x1d8, 0x1d9, 
       0x7, 0x19, 0x2, 0x2, 0x1d9, 0x1da, 0x7, 0xa, 0x2, 0x2, 0x1da, 0x1db, 
       0x5, 0x2a, 0x16, 0x2, 0x1db, 0x1dc, 0x7, 0x1b, 0x2, 0x2, 0x1dc, 0x1ef, 
       0x3, 0x2, 0x2, 0x2, 0x1dd, 0x1de, 0x7, 0x19, 0x2, 0x2, 0x1de, 0x1df, 
       0x7, 0xa, 0x2, 0x2, 0x1df, 0x1e0, 0x5, 0x2a, 0x16, 0x2, 0x1e0, 0x1e1, 
       0x7, 0x1b, 0x2, 0x2, 0x1e1, 0x1e2, 0x9, 0x2, 0x2, 0x2, 0x1e2, 0x1ef, 
       0x3, 0x2, 0x2, 0x2, 0x1e3, 0x1ef, 0x5, 0x1e, 0x10, 0x2, 0x1e4, 0x1e5, 
       0x5, 0x1e, 0x10, 0x2, 0x1e5, 0x1e6, 0x9, 0x2, 0x2, 0x2, 0x1e6, 0x1ef, 
       0x3, 0x2, 0x2, 0x2, 0x1e7, 0x1e8, 0x5, 0x1e, 0x10, 0x2, 0x1e8, 0x1e9, 
       0x7, 0x1b, 0x2, 0x2, 0x1e9, 0x1ef, 0x3, 0x2, 0x2, 0x2, 0x1ea, 0x1eb, 
       0x5, 0x1e, 0x10, 0x2, 0x1eb, 0x1ec, 0x7, 0x1b, 0x2, 0x2, 0x1ec, 0x1ed, 
       0x9, 0x2, 0x2, 0x2, 0x1ed, 0x1ef, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x18e, 
       0x3, 0x2, 0x2, 0x2, 0x1ee, 0x18f, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x191, 
       0x3, 0x2, 0x2, 0x2, 0x1ee, 0x193, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x196, 
       0x3, 0x2, 0x2, 0x2, 0x1ee, 0x199, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x19d, 
       0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1a1, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1a6, 
       0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1a8, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1ac, 
       0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1b0, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1b5, 
       0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1b6, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1b8, 
       0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1ba, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1bd, 
       0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1be, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1c0, 
       0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1c2, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1c5, 
       0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1c6, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1c9, 
       0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1cc, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1d0, 
       0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1d3, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1d8, 
       0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1dd, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1e3, 
       0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1e4, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1e7, 
       0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1ea, 0x3, 0x2, 0x2, 0x2, 0x1ef, 0x45, 
       0x3, 0x2, 0x2, 0x2, 0x1f0, 0x200, 0x7, 0x19, 0x2, 0x2, 0x1f1, 0x1f2, 
       0x7, 0x19, 0x2, 0x2, 0x1f2, 0x200, 0x7, 0x1b, 0x2, 0x2, 0x1f3, 0x200, 
       0x7, 0x1d, 0x2, 0x2, 0x1f4, 0x1f5, 0x7, 0x1d, 0x2, 0x2, 0x1f5, 0x200, 
       0x7, 0x1b, 0x2, 0x2, 0x1f6, 0x200, 0x7, 0x1e, 0x2, 0x2, 0x1f7, 0x1f8, 
       0x7, 0x1e, 0x2, 0x2, 0x1f8, 0x200, 0x7, 0x1b, 0x2, 0x2, 0x1f9, 0x200, 
       0x7, 0x8, 0x2, 0x2, 0x1fa, 0x200, 0x7, 0x1c, 0x2, 0x2, 0x1fb, 0x200, 
       0x5, 0x16, 0xc, 0x2, 0x1fc, 0x200, 0x5, 0x1a, 0xe, 0x2, 0x1fd, 0x200, 
       0x5, 0x1e, 0x10, 0x2, 0x1fe, 0x200, 0x5, 0x2a, 0x16, 0x2, 0x1ff, 
       0x1f0, 0x3, 0x2, 0x2, 0x2, 0x1ff, 0x1f1, 0x3, 0x2, 0x2, 0x2, 0x1ff, 
       0x1f3, 0x3, 0x2, 0x2, 0x2, 0x1ff, 0x1f4, 0x3, 0x2, 0x2, 0x2, 0x1ff, 
       0x1f6, 0x3, 0x2, 0x2, 0x2, 0x1ff, 0x1f7, 0x3, 0x2, 0x2, 0x2, 0x1ff, 
       0x1f9, 0x3, 0x2, 0x2, 0x2, 0x1ff, 0x1fa, 0x3, 0x2, 0x2, 0x2, 0x1ff, 
       0x1fb, 0x3, 0x2, 0x2, 0x2, 0x1ff, 0x1fc, 0x3, 0x2, 0x2, 0x2, 0x1ff, 
       0x1fd, 0x3, 0x2, 0x2, 0x2, 0x1ff, 0x1fe, 0x3, 0x2, 0x2, 0x2, 0x200, 
       0x47, 0x3, 0x2, 0x2, 0x2, 0x1b, 0x50, 0x58, 0x65, 0x72, 0x7b, 0x83, 
       0x8a, 0x92, 0x9d, 0xa7, 0xf6, 0x10b, 0x115, 0x121, 0x126, 0x130, 
       0x145, 0x15a, 0x168, 0x16e, 0x17a, 0x180, 0x18b, 0x1ee, 0x1ff, 
  };

  _serializedATN.insert(_serializedATN.end(), serializedATNSegment0,
    serializedATNSegment0 + sizeof(serializedATNSegment0) / sizeof(serializedATNSegment0[0]));


  atn::ATNDeserializer deserializer;
  _atn = deserializer.deserialize(_serializedATN);

  size_t count = _atn.getNumberOfDecisions();
  _decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    _decisionToDFA.emplace_back(_atn.getDecisionState(i), i);
  }
}

TParser::Initializer TParser::_init;
