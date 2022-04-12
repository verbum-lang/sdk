
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
    setState(212);
    fileContent();
    setState(213);
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

TParser::SentenceContext* TParser::FileContentContext::sentence() {
  return getRuleContext<TParser::SentenceContext>(0);
}

TParser::FileContentContext* TParser::FileContentContext::fileContent() {
  return getRuleContext<TParser::FileContentContext>(0);
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
  FileContentContext *_localctx = _tracker.createInstance<FileContentContext>(_ctx, getState());
  enterRule(_localctx, 2, TParser::RuleFileContent);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(220);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 0, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(215);
      sentence();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(216);
      sentence();
      setState(217);
      fileContent();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);

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

TParser::LoopContext* TParser::SentenceContext::loop() {
  return getRuleContext<TParser::LoopContext>(0);
}

TParser::FunctionsContext* TParser::SentenceContext::functions() {
  return getRuleContext<TParser::FunctionsContext>(0);
}

TParser::RetContext* TParser::SentenceContext::ret() {
  return getRuleContext<TParser::RetContext>(0);
}

TParser::OopGeneralContext* TParser::SentenceContext::oopGeneral() {
  return getRuleContext<TParser::OopGeneralContext>(0);
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
    setState(231);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 1, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(222);
      liveToken();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(223);
      use();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(224);
      variable();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(225);
      callingFunction();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(226);
      conditionalExpression();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(227);
      loop();
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(228);
      functions();
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(229);
      ret();
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(230);
      oopGeneral();
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

//----------------- LiveTokenContext ------------------------------------------------------------------

TParser::LiveTokenContext::LiveTokenContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::LiveTokenContext::Newline() {
  return getToken(TParser::Newline, 0);
}

TParser::BreakForContext* TParser::LiveTokenContext::breakFor() {
  return getRuleContext<TParser::BreakForContext>(0);
}

TParser::NextForContext* TParser::LiveTokenContext::nextFor() {
  return getRuleContext<TParser::NextForContext>(0);
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
    setState(236);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Newline: {
        enterOuterAlt(_localctx, 1);
        setState(233);
        match(TParser::Newline);
        break;
      }

      case TParser::Break: {
        enterOuterAlt(_localctx, 2);
        setState(234);
        breakFor();
        break;
      }

      case TParser::Next: {
        enterOuterAlt(_localctx, 3);
        setState(235);
        nextFor();
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

//----------------- BreakForContext ------------------------------------------------------------------

TParser::BreakForContext::BreakForContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BreakForContext::Break() {
  return getToken(TParser::Break, 0);
}

tree::TerminalNode* TParser::BreakForContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::BreakForContext::getRuleIndex() const {
  return TParser::RuleBreakFor;
}

void TParser::BreakForContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBreakFor(this);
}

void TParser::BreakForContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBreakFor(this);
}


antlrcpp::Any TParser::BreakForContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBreakFor(this);
  else
    return visitor->visitChildren(this);
}

TParser::BreakForContext* TParser::breakFor() {
  BreakForContext *_localctx = _tracker.createInstance<BreakForContext>(_ctx, getState());
  enterRule(_localctx, 8, TParser::RuleBreakFor);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(238);
    match(TParser::Break);
    setState(239);
    match(TParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- NextForContext ------------------------------------------------------------------

TParser::NextForContext::NextForContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::NextForContext::Next() {
  return getToken(TParser::Next, 0);
}

tree::TerminalNode* TParser::NextForContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::NextForContext::getRuleIndex() const {
  return TParser::RuleNextFor;
}

void TParser::NextForContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterNextFor(this);
}

void TParser::NextForContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitNextFor(this);
}


antlrcpp::Any TParser::NextForContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitNextFor(this);
  else
    return visitor->visitChildren(this);
}

TParser::NextForContext* TParser::nextFor() {
  NextForContext *_localctx = _tracker.createInstance<NextForContext>(_ctx, getState());
  enterRule(_localctx, 10, TParser::RuleNextFor);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(241);
    match(TParser::Next);
    setState(242);
    match(TParser::End);
   
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
  enterRule(_localctx, 12, TParser::RuleUse);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(244);
    match(TParser::Use);
    setState(245);
    useValue();
    setState(246);
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
  enterRule(_localctx, 14, TParser::RuleUseValue);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(253);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 3, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(248);
      useString();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(249);
      useString();
      setState(250);
      match(TParser::Separator);
      setState(251);
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
  enterRule(_localctx, 16, TParser::RuleUseString);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(255);
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

TParser::VariableModesContext* TParser::VariableContext::variableModes() {
  return getRuleContext<TParser::VariableModesContext>(0);
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
  enterRule(_localctx, 18, TParser::RuleVariable);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(257);
    variableModes();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariableModesContext ------------------------------------------------------------------

TParser::VariableModesContext::VariableModesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::VariableModesContext::Var() {
  return getToken(TParser::Var, 0);
}

TParser::VariableMembersContext* TParser::VariableModesContext::variableMembers() {
  return getRuleContext<TParser::VariableMembersContext>(0);
}

tree::TerminalNode* TParser::VariableModesContext::End() {
  return getToken(TParser::End, 0);
}

TParser::MethodVisibilityContext* TParser::VariableModesContext::methodVisibility() {
  return getRuleContext<TParser::MethodVisibilityContext>(0);
}


size_t TParser::VariableModesContext::getRuleIndex() const {
  return TParser::RuleVariableModes;
}

void TParser::VariableModesContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVariableModes(this);
}

void TParser::VariableModesContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVariableModes(this);
}


antlrcpp::Any TParser::VariableModesContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitVariableModes(this);
  else
    return visitor->visitChildren(this);
}

TParser::VariableModesContext* TParser::variableModes() {
  VariableModesContext *_localctx = _tracker.createInstance<VariableModesContext>(_ctx, getState());
  enterRule(_localctx, 20, TParser::RuleVariableModes);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(271);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Var: {
        enterOuterAlt(_localctx, 1);
        setState(259);
        match(TParser::Var);
        setState(260);
        variableMembers();
        setState(261);
        match(TParser::End);
        break;
      }

      case TParser::Pub:
      case TParser::Pro:
      case TParser::Priv:
      case TParser::Static:
      case TParser::Final: {
        enterOuterAlt(_localctx, 2);
        setState(263);
        methodVisibility();
        setState(264);
        match(TParser::Var);
        setState(265);
        variableMembers();
        setState(266);
        match(TParser::End);
        break;
      }

      case TParser::IncDecOperators:
      case TParser::Identifier: {
        enterOuterAlt(_localctx, 3);
        setState(268);
        variableMembers();
        setState(269);
        match(TParser::End);
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

//----------------- VariableModesBkpContext ------------------------------------------------------------------

TParser::VariableModesBkpContext::VariableModesBkpContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::VariableModesBkpContext::Var() {
  return getToken(TParser::Var, 0);
}

TParser::VariableMembersContext* TParser::VariableModesBkpContext::variableMembers() {
  return getRuleContext<TParser::VariableMembersContext>(0);
}

tree::TerminalNode* TParser::VariableModesBkpContext::End() {
  return getToken(TParser::End, 0);
}

TParser::MethodPermContext* TParser::VariableModesBkpContext::methodPerm() {
  return getRuleContext<TParser::MethodPermContext>(0);
}

tree::TerminalNode* TParser::VariableModesBkpContext::Static() {
  return getToken(TParser::Static, 0);
}

tree::TerminalNode* TParser::VariableModesBkpContext::Final() {
  return getToken(TParser::Final, 0);
}


size_t TParser::VariableModesBkpContext::getRuleIndex() const {
  return TParser::RuleVariableModesBkp;
}

void TParser::VariableModesBkpContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVariableModesBkp(this);
}

void TParser::VariableModesBkpContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVariableModesBkp(this);
}


antlrcpp::Any TParser::VariableModesBkpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitVariableModesBkp(this);
  else
    return visitor->visitChildren(this);
}

TParser::VariableModesBkpContext* TParser::variableModesBkp() {
  VariableModesBkpContext *_localctx = _tracker.createInstance<VariableModesBkpContext>(_ctx, getState());
  enterRule(_localctx, 22, TParser::RuleVariableModesBkp);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(320);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 5, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(273);
      match(TParser::Var);
      setState(274);
      variableMembers();
      setState(275);
      match(TParser::End);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(277);
      methodPerm();
      setState(278);
      match(TParser::Var);
      setState(279);
      variableMembers();
      setState(280);
      match(TParser::End);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(282);
      match(TParser::Static);
      setState(283);
      match(TParser::Var);
      setState(284);
      variableMembers();
      setState(285);
      match(TParser::End);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(287);
      methodPerm();
      setState(288);
      match(TParser::Static);
      setState(289);
      match(TParser::Var);
      setState(290);
      variableMembers();
      setState(291);
      match(TParser::End);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(293);
      match(TParser::Final);
      setState(294);
      methodPerm();
      setState(295);
      match(TParser::Static);
      setState(296);
      match(TParser::Var);
      setState(297);
      variableMembers();
      setState(298);
      match(TParser::End);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(300);
      match(TParser::Final);
      setState(301);
      methodPerm();
      setState(302);
      match(TParser::Var);
      setState(303);
      variableMembers();
      setState(304);
      match(TParser::End);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(306);
      match(TParser::Final);
      setState(307);
      match(TParser::Var);
      setState(308);
      variableMembers();
      setState(309);
      match(TParser::End);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(311);
      match(TParser::Final);
      setState(312);
      match(TParser::Static);
      setState(313);
      match(TParser::Var);
      setState(314);
      variableMembers();
      setState(315);
      match(TParser::End);
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(317);
      variableMembers();
      setState(318);
      match(TParser::End);
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
  enterRule(_localctx, 24, TParser::RuleVariableMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(327);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 6, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(322);
      variableDefinition();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(323);
      variableDefinition();
      setState(324);
      match(TParser::Separator);
      setState(325);
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

TParser::VariableDefinitionGeneralContext* TParser::VariableDefinitionContext::variableDefinitionGeneral() {
  return getRuleContext<TParser::VariableDefinitionGeneralContext>(0);
}

TParser::ObjIdentifierAContext* TParser::VariableDefinitionContext::objIdentifierA() {
  return getRuleContext<TParser::ObjIdentifierAContext>(0);
}

tree::TerminalNode* TParser::VariableDefinitionContext::Point() {
  return getToken(TParser::Point, 0);
}

TParser::ObjIdentifierBContext* TParser::VariableDefinitionContext::objIdentifierB() {
  return getRuleContext<TParser::ObjIdentifierBContext>(0);
}

tree::TerminalNode* TParser::VariableDefinitionContext::TwoTwoPoint() {
  return getToken(TParser::TwoTwoPoint, 0);
}

TParser::ArrayAccessElementsContext* TParser::VariableDefinitionContext::arrayAccessElements() {
  return getRuleContext<TParser::ArrayAccessElementsContext>(0);
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
  enterRule(_localctx, 26, TParser::RuleVariableDefinition);

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
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 7, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(329);
      match(TParser::Identifier);
      setState(330);
      variableDefinitionGeneral();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(331);
      objIdentifierA();
      setState(332);
      match(TParser::Point);
      setState(333);
      objIdentifierB();
      setState(334);
      variableDefinitionGeneral();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(336);
      objIdentifierA();
      setState(337);
      match(TParser::TwoTwoPoint);
      setState(338);
      objIdentifierB();
      setState(339);
      variableDefinitionGeneral();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(341);
      arrayAccessElements();
      setState(342);
      variableDefinitionGeneral();
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

//----------------- VariableDefinitionGeneralContext ------------------------------------------------------------------

TParser::VariableDefinitionGeneralContext::VariableDefinitionGeneralContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::GeneralValueContext* TParser::VariableDefinitionGeneralContext::generalValue() {
  return getRuleContext<TParser::GeneralValueContext>(0);
}

tree::TerminalNode* TParser::VariableDefinitionGeneralContext::Attr() {
  return getToken(TParser::Attr, 0);
}

tree::TerminalNode* TParser::VariableDefinitionGeneralContext::AssignmentOperator() {
  return getToken(TParser::AssignmentOperator, 0);
}

tree::TerminalNode* TParser::VariableDefinitionGeneralContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}

tree::TerminalNode* TParser::VariableDefinitionGeneralContext::New() {
  return getToken(TParser::New, 0);
}


size_t TParser::VariableDefinitionGeneralContext::getRuleIndex() const {
  return TParser::RuleVariableDefinitionGeneral;
}

void TParser::VariableDefinitionGeneralContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVariableDefinitionGeneral(this);
}

void TParser::VariableDefinitionGeneralContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVariableDefinitionGeneral(this);
}


antlrcpp::Any TParser::VariableDefinitionGeneralContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitVariableDefinitionGeneral(this);
  else
    return visitor->visitChildren(this);
}

TParser::VariableDefinitionGeneralContext* TParser::variableDefinitionGeneral() {
  VariableDefinitionGeneralContext *_localctx = _tracker.createInstance<VariableDefinitionGeneralContext>(_ctx, getState());
  enterRule(_localctx, 28, TParser::RuleVariableDefinitionGeneral);
  size_t _la = 0;

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
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 8, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(346);
      _la = _input->LA(1);
      if (!(_la == TParser::Attr

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(347);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(348);
      match(TParser::TypeSpec);
      setState(349);
      _la = _input->LA(1);
      if (!(_la == TParser::Attr

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(350);
      generalValue();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(351);
      _la = _input->LA(1);
      if (!(_la == TParser::Attr

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(352);
      match(TParser::New);
      setState(353);
      generalValue();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(354);
      match(TParser::TypeSpec);
      setState(355);
      _la = _input->LA(1);
      if (!(_la == TParser::Attr

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(356);
      match(TParser::New);
      setState(357);
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
  enterRule(_localctx, 30, TParser::RuleIndexArray);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(366);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 9, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(360);
      match(TParser::OpenArIndex);
      setState(361);
      match(TParser::CloseArIndex);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(362);
      match(TParser::OpenArIndex);
      setState(363);
      indexArrayElements();
      setState(364);
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
  enterRule(_localctx, 32, TParser::RuleIndexArrayElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(373);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 10, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(368);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(369);
      generalValue();
      setState(370);
      match(TParser::Separator);
      setState(371);
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
  enterRule(_localctx, 34, TParser::RuleAssociativeArray);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(381);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 11, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(375);
      match(TParser::OpenBlock);
      setState(376);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(377);
      match(TParser::OpenBlock);
      setState(378);
      associativeArrayElements();
      setState(379);
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
  enterRule(_localctx, 36, TParser::RuleAssociativeArrayElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(392);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 12, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(383);
      match(TParser::Identifier);
      setState(384);
      match(TParser::TwoPoint);
      setState(385);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(386);
      match(TParser::Identifier);
      setState(387);
      match(TParser::TwoPoint);
      setState(388);
      generalValue();
      setState(389);
      match(TParser::Separator);
      setState(390);
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
  enterRule(_localctx, 38, TParser::RuleOperationBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(394);
    match(TParser::OpenOp);
    setState(395);
    operationElements();
    setState(396);
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
  enterRule(_localctx, 40, TParser::RuleOperationElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(402);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 13, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(398);
      operationValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(399);
      operationValue();
      setState(400);
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

TParser::FunctionCallContext* TParser::OperationValueContext::functionCall() {
  return getRuleContext<TParser::FunctionCallContext>(0);
}

tree::TerminalNode* TParser::OperationValueContext::ArithmeticOperator() {
  return getToken(TParser::ArithmeticOperator, 0);
}

tree::TerminalNode* TParser::OperationValueContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}

tree::TerminalNode* TParser::OperationValueContext::Identifier() {
  return getToken(TParser::Identifier, 0);
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

TParser::OperationBlockContext* TParser::OperationValueContext::operationBlock() {
  return getRuleContext<TParser::OperationBlockContext>(0);
}

TParser::ArrayAccessElementsContext* TParser::OperationValueContext::arrayAccessElements() {
  return getRuleContext<TParser::ArrayAccessElementsContext>(0);
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
  enterRule(_localctx, 42, TParser::RuleOperationValue);

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
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 14, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(404);
      functionCall();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(405);
      functionCall();
      setState(406);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(408);
      functionCall();
      setState(409);
      match(TParser::TypeSpec);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(411);
      functionCall();
      setState(412);
      match(TParser::TypeSpec);
      setState(413);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(415);
      match(TParser::Identifier);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(416);
      match(TParser::Identifier);
      setState(417);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(418);
      match(TParser::Identifier);
      setState(419);
      match(TParser::TypeSpec);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(420);
      match(TParser::Identifier);
      setState(421);
      match(TParser::TypeSpec);
      setState(422);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(423);
      firstIncDec();
      setState(424);
      match(TParser::Identifier);
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(426);
      firstIncDec();
      setState(427);
      match(TParser::Identifier);
      setState(428);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(430);
      firstIncDec();
      setState(431);
      match(TParser::Identifier);
      setState(432);
      match(TParser::TypeSpec);
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(434);
      firstIncDec();
      setState(435);
      match(TParser::Identifier);
      setState(436);
      match(TParser::TypeSpec);
      setState(437);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 13: {
      enterOuterAlt(_localctx, 13);
      setState(439);
      match(TParser::Identifier);
      setState(440);
      lastIncDec();
      break;
    }

    case 14: {
      enterOuterAlt(_localctx, 14);
      setState(441);
      match(TParser::Identifier);
      setState(442);
      lastIncDec();
      setState(443);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 15: {
      enterOuterAlt(_localctx, 15);
      setState(445);
      match(TParser::Identifier);
      setState(446);
      lastIncDec();
      setState(447);
      match(TParser::TypeSpec);
      break;
    }

    case 16: {
      enterOuterAlt(_localctx, 16);
      setState(449);
      match(TParser::Identifier);
      setState(450);
      lastIncDec();
      setState(451);
      match(TParser::TypeSpec);
      setState(452);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 17: {
      enterOuterAlt(_localctx, 17);
      setState(454);
      match(TParser::Integer);
      break;
    }

    case 18: {
      enterOuterAlt(_localctx, 18);
      setState(455);
      match(TParser::Integer);
      setState(456);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 19: {
      enterOuterAlt(_localctx, 19);
      setState(457);
      match(TParser::Integer);
      setState(458);
      match(TParser::TypeSpec);
      break;
    }

    case 20: {
      enterOuterAlt(_localctx, 20);
      setState(459);
      match(TParser::Integer);
      setState(460);
      match(TParser::TypeSpec);
      setState(461);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 21: {
      enterOuterAlt(_localctx, 21);
      setState(462);
      match(TParser::Float);
      break;
    }

    case 22: {
      enterOuterAlt(_localctx, 22);
      setState(463);
      match(TParser::Float);
      setState(464);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 23: {
      enterOuterAlt(_localctx, 23);
      setState(465);
      match(TParser::Float);
      setState(466);
      match(TParser::TypeSpec);
      break;
    }

    case 24: {
      enterOuterAlt(_localctx, 24);
      setState(467);
      match(TParser::Float);
      setState(468);
      match(TParser::TypeSpec);
      setState(469);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 25: {
      enterOuterAlt(_localctx, 25);
      setState(470);
      operationBlock();
      break;
    }

    case 26: {
      enterOuterAlt(_localctx, 26);
      setState(471);
      operationBlock();
      setState(472);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 27: {
      enterOuterAlt(_localctx, 27);
      setState(474);
      operationBlock();
      setState(475);
      match(TParser::TypeSpec);
      break;
    }

    case 28: {
      enterOuterAlt(_localctx, 28);
      setState(477);
      operationBlock();
      setState(478);
      match(TParser::TypeSpec);
      setState(479);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 29: {
      enterOuterAlt(_localctx, 29);
      setState(481);
      arrayAccessElements();
      break;
    }

    case 30: {
      enterOuterAlt(_localctx, 30);
      setState(482);
      arrayAccessElements();
      setState(483);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 31: {
      enterOuterAlt(_localctx, 31);
      setState(485);
      arrayAccessElements();
      setState(486);
      match(TParser::TypeSpec);
      break;
    }

    case 32: {
      enterOuterAlt(_localctx, 32);
      setState(488);
      arrayAccessElements();
      setState(489);
      match(TParser::TypeSpec);
      setState(490);
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
  enterRule(_localctx, 44, TParser::RuleFirstIncDec);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(494);
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
  enterRule(_localctx, 46, TParser::RuleLastIncDec);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(496);
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
  enterRule(_localctx, 48, TParser::RuleCallingFunction);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(498);
    functionCall();
    setState(499);
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

TParser::MethodCascadingModesContext* TParser::FunctionCallContext::methodCascadingModes() {
  return getRuleContext<TParser::MethodCascadingModesContext>(0);
}

TParser::ArrayAccessElementsContext* TParser::FunctionCallContext::arrayAccessElements() {
  return getRuleContext<TParser::ArrayAccessElementsContext>(0);
}

TParser::FunctionCallParamACContext* TParser::FunctionCallContext::functionCallParamAC() {
  return getRuleContext<TParser::FunctionCallParamACContext>(0);
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
  enterRule(_localctx, 50, TParser::RuleFunctionCall);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(517);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 15, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(501);
      match(TParser::Identifier);
      setState(502);
      functionCallParam();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(503);
      match(TParser::Identifier);
      setState(504);
      match(TParser::Point);
      setState(505);
      identifierB();
      setState(506);
      functionCallParam();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(508);
      match(TParser::Identifier);
      setState(509);
      match(TParser::TwoTwoPoint);
      setState(510);
      identifierB();
      setState(511);
      functionCallParam();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(513);
      methodCascadingModes();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(514);
      arrayAccessElements();
      setState(515);
      functionCallParamAC();
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

//----------------- FunctionCallParamACContext ------------------------------------------------------------------

TParser::FunctionCallParamACContext::FunctionCallParamACContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionCallParamContext* TParser::FunctionCallParamACContext::functionCallParam() {
  return getRuleContext<TParser::FunctionCallParamContext>(0);
}


size_t TParser::FunctionCallParamACContext::getRuleIndex() const {
  return TParser::RuleFunctionCallParamAC;
}

void TParser::FunctionCallParamACContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionCallParamAC(this);
}

void TParser::FunctionCallParamACContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionCallParamAC(this);
}


antlrcpp::Any TParser::FunctionCallParamACContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionCallParamAC(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionCallParamACContext* TParser::functionCallParamAC() {
  FunctionCallParamACContext *_localctx = _tracker.createInstance<FunctionCallParamACContext>(_ctx, getState());
  enterRule(_localctx, 52, TParser::RuleFunctionCallParamAC);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(519);
    functionCallParam();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- MethodCascadingModesContext ------------------------------------------------------------------

TParser::MethodCascadingModesContext::MethodCascadingModesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::MethodCascadingModesContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::MethodCascadingModesContext::Point() {
  return getToken(TParser::Point, 0);
}

TParser::FunctionCallCascadingContext* TParser::MethodCascadingModesContext::functionCallCascading() {
  return getRuleContext<TParser::FunctionCallCascadingContext>(0);
}


size_t TParser::MethodCascadingModesContext::getRuleIndex() const {
  return TParser::RuleMethodCascadingModes;
}

void TParser::MethodCascadingModesContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterMethodCascadingModes(this);
}

void TParser::MethodCascadingModesContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitMethodCascadingModes(this);
}


antlrcpp::Any TParser::MethodCascadingModesContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitMethodCascadingModes(this);
  else
    return visitor->visitChildren(this);
}

TParser::MethodCascadingModesContext* TParser::methodCascadingModes() {
  MethodCascadingModesContext *_localctx = _tracker.createInstance<MethodCascadingModesContext>(_ctx, getState());
  enterRule(_localctx, 54, TParser::RuleMethodCascadingModes);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(521);
    match(TParser::Identifier);
    setState(522);
    match(TParser::Point);
    setState(523);
    functionCallCascading();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionCallCascadingContext ------------------------------------------------------------------

TParser::FunctionCallCascadingContext::FunctionCallCascadingContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionCallCascadingItemContext* TParser::FunctionCallCascadingContext::functionCallCascadingItem() {
  return getRuleContext<TParser::FunctionCallCascadingItemContext>(0);
}

tree::TerminalNode* TParser::FunctionCallCascadingContext::Point() {
  return getToken(TParser::Point, 0);
}

TParser::FunctionCallCascadingContext* TParser::FunctionCallCascadingContext::functionCallCascading() {
  return getRuleContext<TParser::FunctionCallCascadingContext>(0);
}


size_t TParser::FunctionCallCascadingContext::getRuleIndex() const {
  return TParser::RuleFunctionCallCascading;
}

void TParser::FunctionCallCascadingContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionCallCascading(this);
}

void TParser::FunctionCallCascadingContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionCallCascading(this);
}


antlrcpp::Any TParser::FunctionCallCascadingContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionCallCascading(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionCallCascadingContext* TParser::functionCallCascading() {
  FunctionCallCascadingContext *_localctx = _tracker.createInstance<FunctionCallCascadingContext>(_ctx, getState());
  enterRule(_localctx, 56, TParser::RuleFunctionCallCascading);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(530);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 16, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(525);
      functionCallCascadingItem();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(526);
      functionCallCascadingItem();
      setState(527);
      match(TParser::Point);
      setState(528);
      functionCallCascading();
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

//----------------- FunctionCallCascadingItemContext ------------------------------------------------------------------

TParser::FunctionCallCascadingItemContext::FunctionCallCascadingItemContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::FunctionCallCascadingItemContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

TParser::FunctionCallParamContext* TParser::FunctionCallCascadingItemContext::functionCallParam() {
  return getRuleContext<TParser::FunctionCallParamContext>(0);
}


size_t TParser::FunctionCallCascadingItemContext::getRuleIndex() const {
  return TParser::RuleFunctionCallCascadingItem;
}

void TParser::FunctionCallCascadingItemContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionCallCascadingItem(this);
}

void TParser::FunctionCallCascadingItemContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionCallCascadingItem(this);
}


antlrcpp::Any TParser::FunctionCallCascadingItemContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionCallCascadingItem(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionCallCascadingItemContext* TParser::functionCallCascadingItem() {
  FunctionCallCascadingItemContext *_localctx = _tracker.createInstance<FunctionCallCascadingItemContext>(_ctx, getState());
  enterRule(_localctx, 58, TParser::RuleFunctionCallCascadingItem);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(532);
    match(TParser::Identifier);
    setState(533);
    functionCallParam();
   
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
  enterRule(_localctx, 60, TParser::RuleIdentifierB);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(535);
    match(TParser::Identifier);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- PointSeparatorContext ------------------------------------------------------------------

TParser::PointSeparatorContext::PointSeparatorContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::PointSeparatorContext::Point() {
  return getToken(TParser::Point, 0);
}


size_t TParser::PointSeparatorContext::getRuleIndex() const {
  return TParser::RulePointSeparator;
}

void TParser::PointSeparatorContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterPointSeparator(this);
}

void TParser::PointSeparatorContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitPointSeparator(this);
}


antlrcpp::Any TParser::PointSeparatorContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitPointSeparator(this);
  else
    return visitor->visitChildren(this);
}

TParser::PointSeparatorContext* TParser::pointSeparator() {
  PointSeparatorContext *_localctx = _tracker.createInstance<PointSeparatorContext>(_ctx, getState());
  enterRule(_localctx, 62, TParser::RulePointSeparator);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(537);
    match(TParser::Point);
   
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
  enterRule(_localctx, 64, TParser::RuleFunctionCallParam);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(545);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 17, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(539);
      match(TParser::OpenOp);
      setState(540);
      match(TParser::CloseOp);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(541);
      match(TParser::OpenOp);
      setState(542);
      functionCallParamElements();
      setState(543);
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
  enterRule(_localctx, 66, TParser::RuleFunctionCallParamElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(557);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 18, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(547);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(548);
      generalValue();
      setState(549);
      match(TParser::Separator);
      setState(550);
      functionCallParamElements();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(552);
      operationElements();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(553);
      operationElements();
      setState(554);
      match(TParser::Separator);
      setState(555);
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

TParser::ConditionalExpressionStructBlockContext* TParser::ConditionalExpressionContext::conditionalExpressionStructBlock() {
  return getRuleContext<TParser::ConditionalExpressionStructBlockContext>(0);
}

TParser::ConditionalExpressionContext* TParser::ConditionalExpressionContext::conditionalExpression() {
  return getRuleContext<TParser::ConditionalExpressionContext>(0);
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
  enterRule(_localctx, 68, TParser::RuleConditionalExpression);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(563);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 19, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(559);
      conditionalExpressionStructBlock();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(560);
      conditionalExpressionStructBlock();
      setState(561);
      conditionalExpression();
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

//----------------- ConditionalExpressionStructBlockContext ------------------------------------------------------------------

TParser::ConditionalExpressionStructBlockContext::ConditionalExpressionStructBlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::IfElementUniqueContext* TParser::ConditionalExpressionStructBlockContext::ifElementUnique() {
  return getRuleContext<TParser::IfElementUniqueContext>(0);
}

TParser::ElifElementsContext* TParser::ConditionalExpressionStructBlockContext::elifElements() {
  return getRuleContext<TParser::ElifElementsContext>(0);
}

TParser::ElseElementUniqueContext* TParser::ConditionalExpressionStructBlockContext::elseElementUnique() {
  return getRuleContext<TParser::ElseElementUniqueContext>(0);
}


size_t TParser::ConditionalExpressionStructBlockContext::getRuleIndex() const {
  return TParser::RuleConditionalExpressionStructBlock;
}

void TParser::ConditionalExpressionStructBlockContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConditionalExpressionStructBlock(this);
}

void TParser::ConditionalExpressionStructBlockContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConditionalExpressionStructBlock(this);
}


antlrcpp::Any TParser::ConditionalExpressionStructBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConditionalExpressionStructBlock(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConditionalExpressionStructBlockContext* TParser::conditionalExpressionStructBlock() {
  ConditionalExpressionStructBlockContext *_localctx = _tracker.createInstance<ConditionalExpressionStructBlockContext>(_ctx, getState());
  enterRule(_localctx, 70, TParser::RuleConditionalExpressionStructBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(576);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 20, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(565);
      ifElementUnique();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(566);
      ifElementUnique();
      setState(567);
      elifElements();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(569);
      ifElementUnique();
      setState(570);
      elseElementUnique();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(572);
      ifElementUnique();
      setState(573);
      elifElements();
      setState(574);
      elseElementUnique();
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

//----------------- IfElementUniqueContext ------------------------------------------------------------------

TParser::IfElementUniqueContext::IfElementUniqueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::IfElementUniqueContext::If() {
  return getToken(TParser::If, 0);
}

TParser::ConditionalExpressionItemsContext* TParser::IfElementUniqueContext::conditionalExpressionItems() {
  return getRuleContext<TParser::ConditionalExpressionItemsContext>(0);
}

TParser::ConditionalBlockElementsContext* TParser::IfElementUniqueContext::conditionalBlockElements() {
  return getRuleContext<TParser::ConditionalBlockElementsContext>(0);
}


size_t TParser::IfElementUniqueContext::getRuleIndex() const {
  return TParser::RuleIfElementUnique;
}

void TParser::IfElementUniqueContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIfElementUnique(this);
}

void TParser::IfElementUniqueContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIfElementUnique(this);
}


antlrcpp::Any TParser::IfElementUniqueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitIfElementUnique(this);
  else
    return visitor->visitChildren(this);
}

TParser::IfElementUniqueContext* TParser::ifElementUnique() {
  IfElementUniqueContext *_localctx = _tracker.createInstance<IfElementUniqueContext>(_ctx, getState());
  enterRule(_localctx, 72, TParser::RuleIfElementUnique);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(578);
    match(TParser::If);
    setState(579);
    conditionalExpressionItems();
    setState(580);
    conditionalBlockElements();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ElifElementsContext ------------------------------------------------------------------

TParser::ElifElementsContext::ElifElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ElifElementUniqueContext* TParser::ElifElementsContext::elifElementUnique() {
  return getRuleContext<TParser::ElifElementUniqueContext>(0);
}

TParser::ElifElementsContext* TParser::ElifElementsContext::elifElements() {
  return getRuleContext<TParser::ElifElementsContext>(0);
}


size_t TParser::ElifElementsContext::getRuleIndex() const {
  return TParser::RuleElifElements;
}

void TParser::ElifElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterElifElements(this);
}

void TParser::ElifElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitElifElements(this);
}


antlrcpp::Any TParser::ElifElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitElifElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::ElifElementsContext* TParser::elifElements() {
  ElifElementsContext *_localctx = _tracker.createInstance<ElifElementsContext>(_ctx, getState());
  enterRule(_localctx, 74, TParser::RuleElifElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(586);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 21, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(582);
      elifElementUnique();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(583);
      elifElementUnique();
      setState(584);
      elifElements();
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

//----------------- ElifElementUniqueContext ------------------------------------------------------------------

TParser::ElifElementUniqueContext::ElifElementUniqueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ElifElementUniqueContext::Elif() {
  return getToken(TParser::Elif, 0);
}

TParser::ConditionalExpressionItemsContext* TParser::ElifElementUniqueContext::conditionalExpressionItems() {
  return getRuleContext<TParser::ConditionalExpressionItemsContext>(0);
}

TParser::ConditionalBlockElementsContext* TParser::ElifElementUniqueContext::conditionalBlockElements() {
  return getRuleContext<TParser::ConditionalBlockElementsContext>(0);
}


size_t TParser::ElifElementUniqueContext::getRuleIndex() const {
  return TParser::RuleElifElementUnique;
}

void TParser::ElifElementUniqueContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterElifElementUnique(this);
}

void TParser::ElifElementUniqueContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitElifElementUnique(this);
}


antlrcpp::Any TParser::ElifElementUniqueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitElifElementUnique(this);
  else
    return visitor->visitChildren(this);
}

TParser::ElifElementUniqueContext* TParser::elifElementUnique() {
  ElifElementUniqueContext *_localctx = _tracker.createInstance<ElifElementUniqueContext>(_ctx, getState());
  enterRule(_localctx, 76, TParser::RuleElifElementUnique);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(588);
    match(TParser::Elif);
    setState(589);
    conditionalExpressionItems();
    setState(590);
    conditionalBlockElements();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ElseElementUniqueContext ------------------------------------------------------------------

TParser::ElseElementUniqueContext::ElseElementUniqueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ElseElementUniqueContext::Else() {
  return getToken(TParser::Else, 0);
}

TParser::ConditionalBlockElementsContext* TParser::ElseElementUniqueContext::conditionalBlockElements() {
  return getRuleContext<TParser::ConditionalBlockElementsContext>(0);
}


size_t TParser::ElseElementUniqueContext::getRuleIndex() const {
  return TParser::RuleElseElementUnique;
}

void TParser::ElseElementUniqueContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterElseElementUnique(this);
}

void TParser::ElseElementUniqueContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitElseElementUnique(this);
}


antlrcpp::Any TParser::ElseElementUniqueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitElseElementUnique(this);
  else
    return visitor->visitChildren(this);
}

TParser::ElseElementUniqueContext* TParser::elseElementUnique() {
  ElseElementUniqueContext *_localctx = _tracker.createInstance<ElseElementUniqueContext>(_ctx, getState());
  enterRule(_localctx, 78, TParser::RuleElseElementUnique);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(592);
    match(TParser::Else);
    setState(593);
    conditionalBlockElements();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConditionalExpressionItemsContext ------------------------------------------------------------------

TParser::ConditionalExpressionItemsContext::ConditionalExpressionItemsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ConditionalExpressionElementsContext* TParser::ConditionalExpressionItemsContext::conditionalExpressionElements() {
  return getRuleContext<TParser::ConditionalExpressionElementsContext>(0);
}


size_t TParser::ConditionalExpressionItemsContext::getRuleIndex() const {
  return TParser::RuleConditionalExpressionItems;
}

void TParser::ConditionalExpressionItemsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConditionalExpressionItems(this);
}

void TParser::ConditionalExpressionItemsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConditionalExpressionItems(this);
}


antlrcpp::Any TParser::ConditionalExpressionItemsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConditionalExpressionItems(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConditionalExpressionItemsContext* TParser::conditionalExpressionItems() {
  ConditionalExpressionItemsContext *_localctx = _tracker.createInstance<ConditionalExpressionItemsContext>(_ctx, getState());
  enterRule(_localctx, 80, TParser::RuleConditionalExpressionItems);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(595);
    conditionalExpressionElements();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConditionalBlockElementsContext ------------------------------------------------------------------

TParser::ConditionalBlockElementsContext::ConditionalBlockElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ConditionalBlockElementsContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::ConditionalBlockElementsContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::ConditionalBlockElsItemsContext* TParser::ConditionalBlockElementsContext::conditionalBlockElsItems() {
  return getRuleContext<TParser::ConditionalBlockElsItemsContext>(0);
}

TParser::ConditionalExpressionContext* TParser::ConditionalBlockElementsContext::conditionalExpression() {
  return getRuleContext<TParser::ConditionalExpressionContext>(0);
}

TParser::CallingFunctionContext* TParser::ConditionalBlockElementsContext::callingFunction() {
  return getRuleContext<TParser::CallingFunctionContext>(0);
}

TParser::LoopContext* TParser::ConditionalBlockElementsContext::loop() {
  return getRuleContext<TParser::LoopContext>(0);
}

TParser::RetContext* TParser::ConditionalBlockElementsContext::ret() {
  return getRuleContext<TParser::RetContext>(0);
}


size_t TParser::ConditionalBlockElementsContext::getRuleIndex() const {
  return TParser::RuleConditionalBlockElements;
}

void TParser::ConditionalBlockElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConditionalBlockElements(this);
}

void TParser::ConditionalBlockElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConditionalBlockElements(this);
}


antlrcpp::Any TParser::ConditionalBlockElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConditionalBlockElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConditionalBlockElementsContext* TParser::conditionalBlockElements() {
  ConditionalBlockElementsContext *_localctx = _tracker.createInstance<ConditionalBlockElementsContext>(_ctx, getState());
  enterRule(_localctx, 82, TParser::RuleConditionalBlockElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(607);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 22, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(597);
      match(TParser::OpenBlock);
      setState(598);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(599);
      match(TParser::OpenBlock);
      setState(600);
      conditionalBlockElsItems();
      setState(601);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(603);
      conditionalExpression();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(604);
      callingFunction();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(605);
      loop();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(606);
      ret();
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

//----------------- ConditionalBlockElsItemsContext ------------------------------------------------------------------

TParser::ConditionalBlockElsItemsContext::ConditionalBlockElsItemsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::SentenceContext* TParser::ConditionalBlockElsItemsContext::sentence() {
  return getRuleContext<TParser::SentenceContext>(0);
}

TParser::ConditionalBlockElsItemsContext* TParser::ConditionalBlockElsItemsContext::conditionalBlockElsItems() {
  return getRuleContext<TParser::ConditionalBlockElsItemsContext>(0);
}


size_t TParser::ConditionalBlockElsItemsContext::getRuleIndex() const {
  return TParser::RuleConditionalBlockElsItems;
}

void TParser::ConditionalBlockElsItemsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConditionalBlockElsItems(this);
}

void TParser::ConditionalBlockElsItemsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConditionalBlockElsItems(this);
}


antlrcpp::Any TParser::ConditionalBlockElsItemsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConditionalBlockElsItems(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConditionalBlockElsItemsContext* TParser::conditionalBlockElsItems() {
  ConditionalBlockElsItemsContext *_localctx = _tracker.createInstance<ConditionalBlockElsItemsContext>(_ctx, getState());
  enterRule(_localctx, 84, TParser::RuleConditionalBlockElsItems);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(613);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 23, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(609);
      sentence();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(610);
      sentence();
      setState(611);
      conditionalBlockElsItems();
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

TParser::ConditionExpValueContext* TParser::ConditionalExpressionElementsContext::conditionExpValue() {
  return getRuleContext<TParser::ConditionExpValueContext>(0);
}

TParser::ConditionalExpressionElementsContext* TParser::ConditionalExpressionElementsContext::conditionalExpressionElements() {
  return getRuleContext<TParser::ConditionalExpressionElementsContext>(0);
}

TParser::ConditionExpBlockContext* TParser::ConditionalExpressionElementsContext::conditionExpBlock() {
  return getRuleContext<TParser::ConditionExpBlockContext>(0);
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
  enterRule(_localctx, 86, TParser::RuleConditionalExpressionElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(623);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 24, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(615);
      conditionExpValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(616);
      conditionExpValue();
      setState(617);
      conditionalExpressionElements();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(619);
      conditionExpBlock();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(620);
      conditionExpBlock();
      setState(621);
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

//----------------- ConditionExpValueContext ------------------------------------------------------------------

TParser::ConditionExpValueContext::ConditionExpValueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ConditionExpValueContext::Not() {
  return getToken(TParser::Not, 0);
}

TParser::ConditionalExpValueContext* TParser::ConditionExpValueContext::conditionalExpValue() {
  return getRuleContext<TParser::ConditionalExpValueContext>(0);
}


size_t TParser::ConditionExpValueContext::getRuleIndex() const {
  return TParser::RuleConditionExpValue;
}

void TParser::ConditionExpValueContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConditionExpValue(this);
}

void TParser::ConditionExpValueContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConditionExpValue(this);
}


antlrcpp::Any TParser::ConditionExpValueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConditionExpValue(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConditionExpValueContext* TParser::conditionExpValue() {
  ConditionExpValueContext *_localctx = _tracker.createInstance<ConditionExpValueContext>(_ctx, getState());
  enterRule(_localctx, 88, TParser::RuleConditionExpValue);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(628);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Not: {
        enterOuterAlt(_localctx, 1);
        setState(625);
        match(TParser::Not);
        setState(626);
        conditionalExpValue();
        break;
      }

      case TParser::OpenOp:
      case TParser::IncDecOperators:
      case TParser::Identifier:
      case TParser::Integer:
      case TParser::Float: {
        enterOuterAlt(_localctx, 2);
        setState(627);
        conditionalExpValue();
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

//----------------- ConditionExpBlockContext ------------------------------------------------------------------

TParser::ConditionExpBlockContext::ConditionExpBlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ConditionExpBlockItemValueContext* TParser::ConditionExpBlockContext::conditionExpBlockItemValue() {
  return getRuleContext<TParser::ConditionExpBlockItemValueContext>(0);
}

tree::TerminalNode* TParser::ConditionExpBlockContext::Not() {
  return getToken(TParser::Not, 0);
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
  ConditionExpBlockContext *_localctx = _tracker.createInstance<ConditionExpBlockContext>(_ctx, getState());
  enterRule(_localctx, 90, TParser::RuleConditionExpBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(633);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::OpenOp: {
        enterOuterAlt(_localctx, 1);
        setState(630);
        conditionExpBlockItemValue();
        break;
      }

      case TParser::Not: {
        enterOuterAlt(_localctx, 2);
        setState(631);
        match(TParser::Not);
        setState(632);
        conditionExpBlockItemValue();
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

//----------------- ConditionExpBlockItemValueContext ------------------------------------------------------------------

TParser::ConditionExpBlockItemValueContext::ConditionExpBlockItemValueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ConditionExpBlockItemContext* TParser::ConditionExpBlockItemValueContext::conditionExpBlockItem() {
  return getRuleContext<TParser::ConditionExpBlockItemContext>(0);
}

tree::TerminalNode* TParser::ConditionExpBlockItemValueContext::ArithmeticOperator() {
  return getToken(TParser::ArithmeticOperator, 0);
}

tree::TerminalNode* TParser::ConditionExpBlockItemValueContext::AssignmentOperator() {
  return getToken(TParser::AssignmentOperator, 0);
}

tree::TerminalNode* TParser::ConditionExpBlockItemValueContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}


size_t TParser::ConditionExpBlockItemValueContext::getRuleIndex() const {
  return TParser::RuleConditionExpBlockItemValue;
}

void TParser::ConditionExpBlockItemValueContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConditionExpBlockItemValue(this);
}

void TParser::ConditionExpBlockItemValueContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConditionExpBlockItemValue(this);
}


antlrcpp::Any TParser::ConditionExpBlockItemValueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConditionExpBlockItemValue(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConditionExpBlockItemValueContext* TParser::conditionExpBlockItemValue() {
  ConditionExpBlockItemValueContext *_localctx = _tracker.createInstance<ConditionExpBlockItemValueContext>(_ctx, getState());
  enterRule(_localctx, 92, TParser::RuleConditionExpBlockItemValue);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(643);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 27, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(635);
      conditionExpBlockItem();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(636);
      conditionExpBlockItem();
      setState(637);
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
      setState(639);
      conditionExpBlockItem();
      setState(640);
      match(TParser::TypeSpec);
      setState(641);
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

//----------------- ConditionExpBlockItemContext ------------------------------------------------------------------

TParser::ConditionExpBlockItemContext::ConditionExpBlockItemContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ConditionExpBlockItemContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

TParser::ConditionalExpressionElementsContext* TParser::ConditionExpBlockItemContext::conditionalExpressionElements() {
  return getRuleContext<TParser::ConditionalExpressionElementsContext>(0);
}

tree::TerminalNode* TParser::ConditionExpBlockItemContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}


size_t TParser::ConditionExpBlockItemContext::getRuleIndex() const {
  return TParser::RuleConditionExpBlockItem;
}

void TParser::ConditionExpBlockItemContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConditionExpBlockItem(this);
}

void TParser::ConditionExpBlockItemContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConditionExpBlockItem(this);
}


antlrcpp::Any TParser::ConditionExpBlockItemContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConditionExpBlockItem(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConditionExpBlockItemContext* TParser::conditionExpBlockItem() {
  ConditionExpBlockItemContext *_localctx = _tracker.createInstance<ConditionExpBlockItemContext>(_ctx, getState());
  enterRule(_localctx, 94, TParser::RuleConditionExpBlockItem);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(645);
    match(TParser::OpenOp);
    setState(646);
    conditionalExpressionElements();
    setState(647);
    match(TParser::CloseOp);
   
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

TParser::FirstIncDecContext* TParser::ConditionalExpValueContext::firstIncDec() {
  return getRuleContext<TParser::FirstIncDecContext>(0);
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

TParser::LastIncDecContext* TParser::ConditionalExpValueContext::lastIncDec() {
  return getRuleContext<TParser::LastIncDecContext>(0);
}

tree::TerminalNode* TParser::ConditionalExpValueContext::Integer() {
  return getToken(TParser::Integer, 0);
}

tree::TerminalNode* TParser::ConditionalExpValueContext::Float() {
  return getToken(TParser::Float, 0);
}

TParser::FunctionCallAndAttrContext* TParser::ConditionalExpValueContext::functionCallAndAttr() {
  return getRuleContext<TParser::FunctionCallAndAttrContext>(0);
}

TParser::FunctionCallContext* TParser::ConditionalExpValueContext::functionCall() {
  return getRuleContext<TParser::FunctionCallContext>(0);
}

TParser::OperationBlockContext* TParser::ConditionalExpValueContext::operationBlock() {
  return getRuleContext<TParser::OperationBlockContext>(0);
}

TParser::ArrayAccessElementsContext* TParser::ConditionalExpValueContext::arrayAccessElements() {
  return getRuleContext<TParser::ArrayAccessElementsContext>(0);
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
  enterRule(_localctx, 96, TParser::RuleConditionalExpValue);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(738);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 28, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(649);
      firstIncDec();
      setState(650);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(652);
      firstIncDec();
      setState(653);
      match(TParser::Identifier);
      setState(654);
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
      setState(656);
      firstIncDec();
      setState(657);
      match(TParser::Identifier);
      setState(658);
      match(TParser::TypeSpec);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(660);
      firstIncDec();
      setState(661);
      match(TParser::Identifier);
      setState(662);
      match(TParser::TypeSpec);
      setState(663);
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
      setState(665);
      match(TParser::Identifier);
      setState(666);
      lastIncDec();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(667);
      match(TParser::Identifier);
      setState(668);
      lastIncDec();
      setState(669);
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
      setState(671);
      match(TParser::Identifier);
      setState(672);
      lastIncDec();
      setState(673);
      match(TParser::TypeSpec);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(675);
      match(TParser::Identifier);
      setState(676);
      lastIncDec();
      setState(677);
      match(TParser::TypeSpec);
      setState(678);
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
      setState(680);
      match(TParser::Integer);
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(681);
      match(TParser::Integer);
      setState(682);
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
      setState(683);
      match(TParser::Integer);
      setState(684);
      match(TParser::TypeSpec);
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(685);
      match(TParser::Integer);
      setState(686);
      match(TParser::TypeSpec);
      setState(687);
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
      setState(688);
      match(TParser::Float);
      break;
    }

    case 14: {
      enterOuterAlt(_localctx, 14);
      setState(689);
      match(TParser::Float);
      setState(690);
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
      setState(691);
      match(TParser::Float);
      setState(692);
      match(TParser::TypeSpec);
      break;
    }

    case 16: {
      enterOuterAlt(_localctx, 16);
      setState(693);
      match(TParser::Float);
      setState(694);
      match(TParser::TypeSpec);
      setState(695);
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
      setState(696);
      functionCallAndAttr();
      break;
    }

    case 18: {
      enterOuterAlt(_localctx, 18);
      setState(697);
      functionCall();
      break;
    }

    case 19: {
      enterOuterAlt(_localctx, 19);
      setState(698);
      functionCall();
      setState(699);
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

    case 20: {
      enterOuterAlt(_localctx, 20);
      setState(701);
      functionCall();
      setState(702);
      match(TParser::TypeSpec);
      break;
    }

    case 21: {
      enterOuterAlt(_localctx, 21);
      setState(704);
      functionCall();
      setState(705);
      match(TParser::TypeSpec);
      setState(706);
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

    case 22: {
      enterOuterAlt(_localctx, 22);
      setState(708);
      operationBlock();
      break;
    }

    case 23: {
      enterOuterAlt(_localctx, 23);
      setState(709);
      operationBlock();
      setState(710);
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

    case 24: {
      enterOuterAlt(_localctx, 24);
      setState(712);
      operationBlock();
      setState(713);
      match(TParser::TypeSpec);
      break;
    }

    case 25: {
      enterOuterAlt(_localctx, 25);
      setState(715);
      operationBlock();
      setState(716);
      match(TParser::TypeSpec);
      setState(717);
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

    case 26: {
      enterOuterAlt(_localctx, 26);
      setState(719);
      match(TParser::Identifier);
      break;
    }

    case 27: {
      enterOuterAlt(_localctx, 27);
      setState(720);
      match(TParser::Identifier);
      setState(721);
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

    case 28: {
      enterOuterAlt(_localctx, 28);
      setState(722);
      match(TParser::Identifier);
      setState(723);
      match(TParser::TypeSpec);
      break;
    }

    case 29: {
      enterOuterAlt(_localctx, 29);
      setState(724);
      match(TParser::Identifier);
      setState(725);
      match(TParser::TypeSpec);
      setState(726);
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

    case 30: {
      enterOuterAlt(_localctx, 30);
      setState(727);
      arrayAccessElements();
      break;
    }

    case 31: {
      enterOuterAlt(_localctx, 31);
      setState(728);
      arrayAccessElements();
      setState(729);
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

    case 32: {
      enterOuterAlt(_localctx, 32);
      setState(731);
      arrayAccessElements();
      setState(732);
      match(TParser::TypeSpec);
      break;
    }

    case 33: {
      enterOuterAlt(_localctx, 33);
      setState(734);
      arrayAccessElements();
      setState(735);
      match(TParser::TypeSpec);
      setState(736);
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

//----------------- FunctionCallAndAttrContext ------------------------------------------------------------------

TParser::FunctionCallAndAttrContext::FunctionCallAndAttrContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::IdentifierAttrFnContext* TParser::FunctionCallAndAttrContext::identifierAttrFn() {
  return getRuleContext<TParser::IdentifierAttrFnContext>(0);
}

tree::TerminalNode* TParser::FunctionCallAndAttrContext::Attr() {
  return getToken(TParser::Attr, 0);
}

TParser::FunctionCallAttrFnContext* TParser::FunctionCallAndAttrContext::functionCallAttrFn() {
  return getRuleContext<TParser::FunctionCallAttrFnContext>(0);
}


size_t TParser::FunctionCallAndAttrContext::getRuleIndex() const {
  return TParser::RuleFunctionCallAndAttr;
}

void TParser::FunctionCallAndAttrContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionCallAndAttr(this);
}

void TParser::FunctionCallAndAttrContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionCallAndAttr(this);
}


antlrcpp::Any TParser::FunctionCallAndAttrContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionCallAndAttr(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionCallAndAttrContext* TParser::functionCallAndAttr() {
  FunctionCallAndAttrContext *_localctx = _tracker.createInstance<FunctionCallAndAttrContext>(_ctx, getState());
  enterRule(_localctx, 98, TParser::RuleFunctionCallAndAttr);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(740);
    identifierAttrFn();
    setState(741);
    match(TParser::Attr);
    setState(742);
    functionCallAttrFn();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IdentifierAttrFnContext ------------------------------------------------------------------

TParser::IdentifierAttrFnContext::IdentifierAttrFnContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ArrayAccessElementsContext* TParser::IdentifierAttrFnContext::arrayAccessElements() {
  return getRuleContext<TParser::ArrayAccessElementsContext>(0);
}

tree::TerminalNode* TParser::IdentifierAttrFnContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}


size_t TParser::IdentifierAttrFnContext::getRuleIndex() const {
  return TParser::RuleIdentifierAttrFn;
}

void TParser::IdentifierAttrFnContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIdentifierAttrFn(this);
}

void TParser::IdentifierAttrFnContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIdentifierAttrFn(this);
}


antlrcpp::Any TParser::IdentifierAttrFnContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitIdentifierAttrFn(this);
  else
    return visitor->visitChildren(this);
}

TParser::IdentifierAttrFnContext* TParser::identifierAttrFn() {
  IdentifierAttrFnContext *_localctx = _tracker.createInstance<IdentifierAttrFnContext>(_ctx, getState());
  enterRule(_localctx, 100, TParser::RuleIdentifierAttrFn);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(746);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 29, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(744);
      arrayAccessElements();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(745);
      match(TParser::Identifier);
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

//----------------- FunctionCallAttrFnContext ------------------------------------------------------------------

TParser::FunctionCallAttrFnContext::FunctionCallAttrFnContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionCallAttrFnItemContext* TParser::FunctionCallAttrFnContext::functionCallAttrFnItem() {
  return getRuleContext<TParser::FunctionCallAttrFnItemContext>(0);
}


size_t TParser::FunctionCallAttrFnContext::getRuleIndex() const {
  return TParser::RuleFunctionCallAttrFn;
}

void TParser::FunctionCallAttrFnContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionCallAttrFn(this);
}

void TParser::FunctionCallAttrFnContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionCallAttrFn(this);
}


antlrcpp::Any TParser::FunctionCallAttrFnContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionCallAttrFn(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionCallAttrFnContext* TParser::functionCallAttrFn() {
  FunctionCallAttrFnContext *_localctx = _tracker.createInstance<FunctionCallAttrFnContext>(_ctx, getState());
  enterRule(_localctx, 102, TParser::RuleFunctionCallAttrFn);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(748);
    functionCallAttrFnItem();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionCallAttrFnItemContext ------------------------------------------------------------------

TParser::FunctionCallAttrFnItemContext::FunctionCallAttrFnItemContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionCallContext* TParser::FunctionCallAttrFnItemContext::functionCall() {
  return getRuleContext<TParser::FunctionCallContext>(0);
}

tree::TerminalNode* TParser::FunctionCallAttrFnItemContext::ArithmeticOperator() {
  return getToken(TParser::ArithmeticOperator, 0);
}

tree::TerminalNode* TParser::FunctionCallAttrFnItemContext::AssignmentOperator() {
  return getToken(TParser::AssignmentOperator, 0);
}

tree::TerminalNode* TParser::FunctionCallAttrFnItemContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}


size_t TParser::FunctionCallAttrFnItemContext::getRuleIndex() const {
  return TParser::RuleFunctionCallAttrFnItem;
}

void TParser::FunctionCallAttrFnItemContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionCallAttrFnItem(this);
}

void TParser::FunctionCallAttrFnItemContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionCallAttrFnItem(this);
}


antlrcpp::Any TParser::FunctionCallAttrFnItemContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionCallAttrFnItem(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionCallAttrFnItemContext* TParser::functionCallAttrFnItem() {
  FunctionCallAttrFnItemContext *_localctx = _tracker.createInstance<FunctionCallAttrFnItemContext>(_ctx, getState());
  enterRule(_localctx, 104, TParser::RuleFunctionCallAttrFnItem);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(761);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 30, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(750);
      functionCall();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(751);
      functionCall();
      setState(752);
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
      setState(754);
      functionCall();
      setState(755);
      match(TParser::TypeSpec);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(757);
      functionCall();
      setState(758);
      match(TParser::TypeSpec);
      setState(759);
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

//----------------- LoopContext ------------------------------------------------------------------

TParser::LoopContext::LoopContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::LoopExpressionItemsContext* TParser::LoopContext::loopExpressionItems() {
  return getRuleContext<TParser::LoopExpressionItemsContext>(0);
}

TParser::LoopContext* TParser::LoopContext::loop() {
  return getRuleContext<TParser::LoopContext>(0);
}


size_t TParser::LoopContext::getRuleIndex() const {
  return TParser::RuleLoop;
}

void TParser::LoopContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLoop(this);
}

void TParser::LoopContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLoop(this);
}


antlrcpp::Any TParser::LoopContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLoop(this);
  else
    return visitor->visitChildren(this);
}

TParser::LoopContext* TParser::loop() {
  LoopContext *_localctx = _tracker.createInstance<LoopContext>(_ctx, getState());
  enterRule(_localctx, 106, TParser::RuleLoop);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(767);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 31, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(763);
      loopExpressionItems();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(764);
      loopExpressionItems();
      setState(765);
      loop();
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

//----------------- LoopExpressionItemsContext ------------------------------------------------------------------

TParser::LoopExpressionItemsContext::LoopExpressionItemsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::LoopExpressionItemsContext::For() {
  return getToken(TParser::For, 0);
}

TParser::LoopExpressionContext* TParser::LoopExpressionItemsContext::loopExpression() {
  return getRuleContext<TParser::LoopExpressionContext>(0);
}

TParser::LoopBlockElementsLimitedContext* TParser::LoopExpressionItemsContext::loopBlockElementsLimited() {
  return getRuleContext<TParser::LoopBlockElementsLimitedContext>(0);
}


size_t TParser::LoopExpressionItemsContext::getRuleIndex() const {
  return TParser::RuleLoopExpressionItems;
}

void TParser::LoopExpressionItemsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLoopExpressionItems(this);
}

void TParser::LoopExpressionItemsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLoopExpressionItems(this);
}


antlrcpp::Any TParser::LoopExpressionItemsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLoopExpressionItems(this);
  else
    return visitor->visitChildren(this);
}

TParser::LoopExpressionItemsContext* TParser::loopExpressionItems() {
  LoopExpressionItemsContext *_localctx = _tracker.createInstance<LoopExpressionItemsContext>(_ctx, getState());
  enterRule(_localctx, 108, TParser::RuleLoopExpressionItems);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(769);
    match(TParser::For);
    setState(770);
    loopExpression();
    setState(771);
    loopBlockElementsLimited();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LoopExpressionContext ------------------------------------------------------------------

TParser::LoopExpressionContext::LoopExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::LoopInfiniteContext* TParser::LoopExpressionContext::loopInfinite() {
  return getRuleContext<TParser::LoopInfiniteContext>(0);
}

TParser::LoopCompleteContext* TParser::LoopExpressionContext::loopComplete() {
  return getRuleContext<TParser::LoopCompleteContext>(0);
}

TParser::LoopConditionalContext* TParser::LoopExpressionContext::loopConditional() {
  return getRuleContext<TParser::LoopConditionalContext>(0);
}


size_t TParser::LoopExpressionContext::getRuleIndex() const {
  return TParser::RuleLoopExpression;
}

void TParser::LoopExpressionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLoopExpression(this);
}

void TParser::LoopExpressionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLoopExpression(this);
}


antlrcpp::Any TParser::LoopExpressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLoopExpression(this);
  else
    return visitor->visitChildren(this);
}

TParser::LoopExpressionContext* TParser::loopExpression() {
  LoopExpressionContext *_localctx = _tracker.createInstance<LoopExpressionContext>(_ctx, getState());
  enterRule(_localctx, 110, TParser::RuleLoopExpression);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(776);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 32, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(773);
      loopInfinite();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(774);
      loopComplete();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(775);
      loopConditional();
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

//----------------- LoopInfiniteContext ------------------------------------------------------------------

TParser::LoopInfiniteContext::LoopInfiniteContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::LoopInfiniteContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

tree::TerminalNode* TParser::LoopInfiniteContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}


size_t TParser::LoopInfiniteContext::getRuleIndex() const {
  return TParser::RuleLoopInfinite;
}

void TParser::LoopInfiniteContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLoopInfinite(this);
}

void TParser::LoopInfiniteContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLoopInfinite(this);
}


antlrcpp::Any TParser::LoopInfiniteContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLoopInfinite(this);
  else
    return visitor->visitChildren(this);
}

TParser::LoopInfiniteContext* TParser::loopInfinite() {
  LoopInfiniteContext *_localctx = _tracker.createInstance<LoopInfiniteContext>(_ctx, getState());
  enterRule(_localctx, 112, TParser::RuleLoopInfinite);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(781);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::OpenOp: {
        enterOuterAlt(_localctx, 1);
        setState(778);
        match(TParser::OpenOp);
        setState(779);
        match(TParser::CloseOp);
        break;
      }

      case TParser::If:
      case TParser::For:
      case TParser::Ret:
      case TParser::OpenBlock:
      case TParser::IncDecOperators:
      case TParser::Identifier: {
        enterOuterAlt(_localctx, 2);

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

//----------------- LoopCompleteContext ------------------------------------------------------------------

TParser::LoopCompleteContext::LoopCompleteContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::LoopCompleteContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

TParser::LoopOneMembersContext* TParser::LoopCompleteContext::loopOneMembers() {
  return getRuleContext<TParser::LoopOneMembersContext>(0);
}

TParser::EndOneContext* TParser::LoopCompleteContext::endOne() {
  return getRuleContext<TParser::EndOneContext>(0);
}

TParser::LoopTwoMembersContext* TParser::LoopCompleteContext::loopTwoMembers() {
  return getRuleContext<TParser::LoopTwoMembersContext>(0);
}

TParser::EndTwoContext* TParser::LoopCompleteContext::endTwo() {
  return getRuleContext<TParser::EndTwoContext>(0);
}

TParser::LoopThreeMembersContext* TParser::LoopCompleteContext::loopThreeMembers() {
  return getRuleContext<TParser::LoopThreeMembersContext>(0);
}

tree::TerminalNode* TParser::LoopCompleteContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}


size_t TParser::LoopCompleteContext::getRuleIndex() const {
  return TParser::RuleLoopComplete;
}

void TParser::LoopCompleteContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLoopComplete(this);
}

void TParser::LoopCompleteContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLoopComplete(this);
}


antlrcpp::Any TParser::LoopCompleteContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLoopComplete(this);
  else
    return visitor->visitChildren(this);
}

TParser::LoopCompleteContext* TParser::loopComplete() {
  LoopCompleteContext *_localctx = _tracker.createInstance<LoopCompleteContext>(_ctx, getState());
  enterRule(_localctx, 114, TParser::RuleLoopComplete);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(797);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::OpenOp: {
        enterOuterAlt(_localctx, 1);
        setState(783);
        match(TParser::OpenOp);
        setState(784);
        loopOneMembers();
        setState(785);
        endOne();
        setState(786);
        loopTwoMembers();
        setState(787);
        endTwo();
        setState(788);
        loopThreeMembers();
        setState(789);
        match(TParser::CloseOp);
        break;
      }

      case TParser::Var:
      case TParser::End:
      case TParser::IncDecOperators:
      case TParser::Identifier: {
        enterOuterAlt(_localctx, 2);
        setState(791);
        loopOneMembers();
        setState(792);
        endOne();
        setState(793);
        loopTwoMembers();
        setState(794);
        endTwo();
        setState(795);
        loopThreeMembers();
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

//----------------- LoopConditionalContext ------------------------------------------------------------------

TParser::LoopConditionalContext::LoopConditionalContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::LoopTwoMembersContext* TParser::LoopConditionalContext::loopTwoMembers() {
  return getRuleContext<TParser::LoopTwoMembersContext>(0);
}


size_t TParser::LoopConditionalContext::getRuleIndex() const {
  return TParser::RuleLoopConditional;
}

void TParser::LoopConditionalContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLoopConditional(this);
}

void TParser::LoopConditionalContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLoopConditional(this);
}


antlrcpp::Any TParser::LoopConditionalContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLoopConditional(this);
  else
    return visitor->visitChildren(this);
}

TParser::LoopConditionalContext* TParser::loopConditional() {
  LoopConditionalContext *_localctx = _tracker.createInstance<LoopConditionalContext>(_ctx, getState());
  enterRule(_localctx, 116, TParser::RuleLoopConditional);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(799);
    loopTwoMembers();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- EndOneContext ------------------------------------------------------------------

TParser::EndOneContext::EndOneContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::EndOneContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::EndOneContext::getRuleIndex() const {
  return TParser::RuleEndOne;
}

void TParser::EndOneContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterEndOne(this);
}

void TParser::EndOneContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitEndOne(this);
}


antlrcpp::Any TParser::EndOneContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitEndOne(this);
  else
    return visitor->visitChildren(this);
}

TParser::EndOneContext* TParser::endOne() {
  EndOneContext *_localctx = _tracker.createInstance<EndOneContext>(_ctx, getState());
  enterRule(_localctx, 118, TParser::RuleEndOne);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(801);
    match(TParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- EndTwoContext ------------------------------------------------------------------

TParser::EndTwoContext::EndTwoContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::EndTwoContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::EndTwoContext::getRuleIndex() const {
  return TParser::RuleEndTwo;
}

void TParser::EndTwoContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterEndTwo(this);
}

void TParser::EndTwoContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitEndTwo(this);
}


antlrcpp::Any TParser::EndTwoContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitEndTwo(this);
  else
    return visitor->visitChildren(this);
}

TParser::EndTwoContext* TParser::endTwo() {
  EndTwoContext *_localctx = _tracker.createInstance<EndTwoContext>(_ctx, getState());
  enterRule(_localctx, 120, TParser::RuleEndTwo);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(803);
    match(TParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LoopOneMembersContext ------------------------------------------------------------------

TParser::LoopOneMembersContext::LoopOneMembersContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::VariableMembersContext* TParser::LoopOneMembersContext::variableMembers() {
  return getRuleContext<TParser::VariableMembersContext>(0);
}

tree::TerminalNode* TParser::LoopOneMembersContext::Var() {
  return getToken(TParser::Var, 0);
}


size_t TParser::LoopOneMembersContext::getRuleIndex() const {
  return TParser::RuleLoopOneMembers;
}

void TParser::LoopOneMembersContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLoopOneMembers(this);
}

void TParser::LoopOneMembersContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLoopOneMembers(this);
}


antlrcpp::Any TParser::LoopOneMembersContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLoopOneMembers(this);
  else
    return visitor->visitChildren(this);
}

TParser::LoopOneMembersContext* TParser::loopOneMembers() {
  LoopOneMembersContext *_localctx = _tracker.createInstance<LoopOneMembersContext>(_ctx, getState());
  enterRule(_localctx, 122, TParser::RuleLoopOneMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(809);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::IncDecOperators:
      case TParser::Identifier: {
        enterOuterAlt(_localctx, 1);
        setState(805);
        variableMembers();
        break;
      }

      case TParser::Var: {
        enterOuterAlt(_localctx, 2);
        setState(806);
        match(TParser::Var);
        setState(807);
        variableMembers();
        break;
      }

      case TParser::End: {
        enterOuterAlt(_localctx, 3);

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

//----------------- LoopTwoMembersContext ------------------------------------------------------------------

TParser::LoopTwoMembersContext::LoopTwoMembersContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ConditionalExpressionElementsContext* TParser::LoopTwoMembersContext::conditionalExpressionElements() {
  return getRuleContext<TParser::ConditionalExpressionElementsContext>(0);
}


size_t TParser::LoopTwoMembersContext::getRuleIndex() const {
  return TParser::RuleLoopTwoMembers;
}

void TParser::LoopTwoMembersContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLoopTwoMembers(this);
}

void TParser::LoopTwoMembersContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLoopTwoMembers(this);
}


antlrcpp::Any TParser::LoopTwoMembersContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLoopTwoMembers(this);
  else
    return visitor->visitChildren(this);
}

TParser::LoopTwoMembersContext* TParser::loopTwoMembers() {
  LoopTwoMembersContext *_localctx = _tracker.createInstance<LoopTwoMembersContext>(_ctx, getState());
  enterRule(_localctx, 124, TParser::RuleLoopTwoMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(813);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 36, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(811);
      conditionalExpressionElements();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);

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

//----------------- LoopThreeMembersContext ------------------------------------------------------------------

TParser::LoopThreeMembersContext::LoopThreeMembersContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::LoopThreeMembersValuesContext* TParser::LoopThreeMembersContext::loopThreeMembersValues() {
  return getRuleContext<TParser::LoopThreeMembersValuesContext>(0);
}


size_t TParser::LoopThreeMembersContext::getRuleIndex() const {
  return TParser::RuleLoopThreeMembers;
}

void TParser::LoopThreeMembersContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLoopThreeMembers(this);
}

void TParser::LoopThreeMembersContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLoopThreeMembers(this);
}


antlrcpp::Any TParser::LoopThreeMembersContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLoopThreeMembers(this);
  else
    return visitor->visitChildren(this);
}

TParser::LoopThreeMembersContext* TParser::loopThreeMembers() {
  LoopThreeMembersContext *_localctx = _tracker.createInstance<LoopThreeMembersContext>(_ctx, getState());
  enterRule(_localctx, 126, TParser::RuleLoopThreeMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(817);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 37, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(815);
      loopThreeMembersValues();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);

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

//----------------- LoopThreeMembersValuesContext ------------------------------------------------------------------

TParser::LoopThreeMembersValuesContext::LoopThreeMembersValuesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::OperationElementsContext* TParser::LoopThreeMembersValuesContext::operationElements() {
  return getRuleContext<TParser::OperationElementsContext>(0);
}

tree::TerminalNode* TParser::LoopThreeMembersValuesContext::Separator() {
  return getToken(TParser::Separator, 0);
}

TParser::LoopThreeMembersValuesContext* TParser::LoopThreeMembersValuesContext::loopThreeMembersValues() {
  return getRuleContext<TParser::LoopThreeMembersValuesContext>(0);
}


size_t TParser::LoopThreeMembersValuesContext::getRuleIndex() const {
  return TParser::RuleLoopThreeMembersValues;
}

void TParser::LoopThreeMembersValuesContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLoopThreeMembersValues(this);
}

void TParser::LoopThreeMembersValuesContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLoopThreeMembersValues(this);
}


antlrcpp::Any TParser::LoopThreeMembersValuesContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLoopThreeMembersValues(this);
  else
    return visitor->visitChildren(this);
}

TParser::LoopThreeMembersValuesContext* TParser::loopThreeMembersValues() {
  LoopThreeMembersValuesContext *_localctx = _tracker.createInstance<LoopThreeMembersValuesContext>(_ctx, getState());
  enterRule(_localctx, 128, TParser::RuleLoopThreeMembersValues);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(824);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 38, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(819);
      operationElements();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(820);
      operationElements();
      setState(821);
      match(TParser::Separator);
      setState(822);
      loopThreeMembersValues();
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

//----------------- LoopBlockElementsContext ------------------------------------------------------------------

TParser::LoopBlockElementsContext::LoopBlockElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::SentenceContext* TParser::LoopBlockElementsContext::sentence() {
  return getRuleContext<TParser::SentenceContext>(0);
}

TParser::LoopBlockElementsContext* TParser::LoopBlockElementsContext::loopBlockElements() {
  return getRuleContext<TParser::LoopBlockElementsContext>(0);
}


size_t TParser::LoopBlockElementsContext::getRuleIndex() const {
  return TParser::RuleLoopBlockElements;
}

void TParser::LoopBlockElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLoopBlockElements(this);
}

void TParser::LoopBlockElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLoopBlockElements(this);
}


antlrcpp::Any TParser::LoopBlockElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLoopBlockElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::LoopBlockElementsContext* TParser::loopBlockElements() {
  LoopBlockElementsContext *_localctx = _tracker.createInstance<LoopBlockElementsContext>(_ctx, getState());
  enterRule(_localctx, 130, TParser::RuleLoopBlockElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(830);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 39, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(826);
      sentence();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(827);
      sentence();
      setState(828);
      loopBlockElements();
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

//----------------- LoopBlockElementsLimitedContext ------------------------------------------------------------------

TParser::LoopBlockElementsLimitedContext::LoopBlockElementsLimitedContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::LoopBlockElementsLimitedContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::LoopBlockElementsLimitedContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::LoopBlockElementsContext* TParser::LoopBlockElementsLimitedContext::loopBlockElements() {
  return getRuleContext<TParser::LoopBlockElementsContext>(0);
}

TParser::ConditionalExpressionContext* TParser::LoopBlockElementsLimitedContext::conditionalExpression() {
  return getRuleContext<TParser::ConditionalExpressionContext>(0);
}

TParser::CallingFunctionContext* TParser::LoopBlockElementsLimitedContext::callingFunction() {
  return getRuleContext<TParser::CallingFunctionContext>(0);
}

TParser::LoopContext* TParser::LoopBlockElementsLimitedContext::loop() {
  return getRuleContext<TParser::LoopContext>(0);
}

TParser::RetContext* TParser::LoopBlockElementsLimitedContext::ret() {
  return getRuleContext<TParser::RetContext>(0);
}


size_t TParser::LoopBlockElementsLimitedContext::getRuleIndex() const {
  return TParser::RuleLoopBlockElementsLimited;
}

void TParser::LoopBlockElementsLimitedContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLoopBlockElementsLimited(this);
}

void TParser::LoopBlockElementsLimitedContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLoopBlockElementsLimited(this);
}


antlrcpp::Any TParser::LoopBlockElementsLimitedContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLoopBlockElementsLimited(this);
  else
    return visitor->visitChildren(this);
}

TParser::LoopBlockElementsLimitedContext* TParser::loopBlockElementsLimited() {
  LoopBlockElementsLimitedContext *_localctx = _tracker.createInstance<LoopBlockElementsLimitedContext>(_ctx, getState());
  enterRule(_localctx, 132, TParser::RuleLoopBlockElementsLimited);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(842);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 40, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(832);
      match(TParser::OpenBlock);
      setState(833);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(834);
      match(TParser::OpenBlock);
      setState(835);
      loopBlockElements();
      setState(836);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(838);
      conditionalExpression();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(839);
      callingFunction();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(840);
      loop();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(841);
      ret();
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

//----------------- RetContext ------------------------------------------------------------------

TParser::RetContext::RetContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::RetContext::Ret() {
  return getToken(TParser::Ret, 0);
}

TParser::RetValuesContext* TParser::RetContext::retValues() {
  return getRuleContext<TParser::RetValuesContext>(0);
}

tree::TerminalNode* TParser::RetContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::RetContext::getRuleIndex() const {
  return TParser::RuleRet;
}

void TParser::RetContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterRet(this);
}

void TParser::RetContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitRet(this);
}


antlrcpp::Any TParser::RetContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitRet(this);
  else
    return visitor->visitChildren(this);
}

TParser::RetContext* TParser::ret() {
  RetContext *_localctx = _tracker.createInstance<RetContext>(_ctx, getState());
  enterRule(_localctx, 134, TParser::RuleRet);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(844);
    match(TParser::Ret);
    setState(845);
    retValues();
    setState(846);
    match(TParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- RetValuesContext ------------------------------------------------------------------

TParser::RetValuesContext::RetValuesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::GeneralValueContext* TParser::RetValuesContext::generalValue() {
  return getRuleContext<TParser::GeneralValueContext>(0);
}

TParser::OperationElementsContext* TParser::RetValuesContext::operationElements() {
  return getRuleContext<TParser::OperationElementsContext>(0);
}


size_t TParser::RetValuesContext::getRuleIndex() const {
  return TParser::RuleRetValues;
}

void TParser::RetValuesContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterRetValues(this);
}

void TParser::RetValuesContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitRetValues(this);
}


antlrcpp::Any TParser::RetValuesContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitRetValues(this);
  else
    return visitor->visitChildren(this);
}

TParser::RetValuesContext* TParser::retValues() {
  RetValuesContext *_localctx = _tracker.createInstance<RetValuesContext>(_ctx, getState());
  enterRule(_localctx, 136, TParser::RuleRetValues);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(850);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 41, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(848);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(849);
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

//----------------- FunctionsContext ------------------------------------------------------------------

TParser::FunctionsContext::FunctionsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionsModesContext* TParser::FunctionsContext::functionsModes() {
  return getRuleContext<TParser::FunctionsModesContext>(0);
}

tree::TerminalNode* TParser::FunctionsContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::FunctionsContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::FunctionCodeBlockContext* TParser::FunctionsContext::functionCodeBlock() {
  return getRuleContext<TParser::FunctionCodeBlockContext>(0);
}

TParser::FunctionMethodsModesContext* TParser::FunctionsContext::functionMethodsModes() {
  return getRuleContext<TParser::FunctionMethodsModesContext>(0);
}

TParser::ConstructClassMethodContext* TParser::FunctionsContext::constructClassMethod() {
  return getRuleContext<TParser::ConstructClassMethodContext>(0);
}

TParser::InterfaceMethodContext* TParser::FunctionsContext::interfaceMethod() {
  return getRuleContext<TParser::InterfaceMethodContext>(0);
}

tree::TerminalNode* TParser::FunctionsContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::FunctionsContext::getRuleIndex() const {
  return TParser::RuleFunctions;
}

void TParser::FunctionsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctions(this);
}

void TParser::FunctionsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctions(this);
}


antlrcpp::Any TParser::FunctionsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctions(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionsContext* TParser::functions() {
  FunctionsContext *_localctx = _tracker.createInstance<FunctionsContext>(_ctx, getState());
  enterRule(_localctx, 138, TParser::RuleFunctions);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(882);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 42, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(852);
      functionsModes();
      setState(853);
      match(TParser::OpenBlock);
      setState(854);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(856);
      functionsModes();
      setState(857);
      match(TParser::OpenBlock);
      setState(858);
      functionCodeBlock();
      setState(859);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(861);
      functionMethodsModes();
      setState(862);
      match(TParser::OpenBlock);
      setState(863);
      match(TParser::CloseBlock);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(865);
      functionMethodsModes();
      setState(866);
      match(TParser::OpenBlock);
      setState(867);
      functionCodeBlock();
      setState(868);
      match(TParser::CloseBlock);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(870);
      constructClassMethod();
      setState(871);
      match(TParser::OpenBlock);
      setState(872);
      match(TParser::CloseBlock);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(874);
      constructClassMethod();
      setState(875);
      match(TParser::OpenBlock);
      setState(876);
      functionCodeBlock();
      setState(877);
      match(TParser::CloseBlock);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(879);
      interfaceMethod();
      setState(880);
      match(TParser::End);
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

//----------------- FunctionsModesContext ------------------------------------------------------------------

TParser::FunctionsModesContext::FunctionsModesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionGeneralModesContext* TParser::FunctionsModesContext::functionGeneralModes() {
  return getRuleContext<TParser::FunctionGeneralModesContext>(0);
}


size_t TParser::FunctionsModesContext::getRuleIndex() const {
  return TParser::RuleFunctionsModes;
}

void TParser::FunctionsModesContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionsModes(this);
}

void TParser::FunctionsModesContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionsModes(this);
}


antlrcpp::Any TParser::FunctionsModesContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionsModes(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionsModesContext* TParser::functionsModes() {
  FunctionsModesContext *_localctx = _tracker.createInstance<FunctionsModesContext>(_ctx, getState());
  enterRule(_localctx, 140, TParser::RuleFunctionsModes);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(884);
    functionGeneralModes();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionGeneralModesContext ------------------------------------------------------------------

TParser::FunctionGeneralModesContext::FunctionGeneralModesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::FunctionGeneralModesContext::Function() {
  return getToken(TParser::Function, 0);
}

tree::TerminalNode* TParser::FunctionGeneralModesContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::FunctionGeneralModesContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

tree::TerminalNode* TParser::FunctionGeneralModesContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}

tree::TerminalNode* TParser::FunctionGeneralModesContext::ArrowRight() {
  return getToken(TParser::ArrowRight, 0);
}

TParser::IdentifierRetContext* TParser::FunctionGeneralModesContext::identifierRet() {
  return getRuleContext<TParser::IdentifierRetContext>(0);
}

tree::TerminalNode* TParser::FunctionGeneralModesContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}

TParser::FunctionParamsContext* TParser::FunctionGeneralModesContext::functionParams() {
  return getRuleContext<TParser::FunctionParamsContext>(0);
}


size_t TParser::FunctionGeneralModesContext::getRuleIndex() const {
  return TParser::RuleFunctionGeneralModes;
}

void TParser::FunctionGeneralModesContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionGeneralModes(this);
}

void TParser::FunctionGeneralModesContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionGeneralModes(this);
}


antlrcpp::Any TParser::FunctionGeneralModesContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionGeneralModes(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionGeneralModesContext* TParser::functionGeneralModes() {
  FunctionGeneralModesContext *_localctx = _tracker.createInstance<FunctionGeneralModesContext>(_ctx, getState());
  enterRule(_localctx, 142, TParser::RuleFunctionGeneralModes);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(915);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 45, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(886);
      match(TParser::Function);
      setState(887);
      match(TParser::Identifier);
      setState(888);
      match(TParser::OpenOp);
      setState(889);
      match(TParser::CloseOp);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(890);
      match(TParser::Function);
      setState(891);
      match(TParser::Identifier);
      setState(892);
      match(TParser::OpenOp);
      setState(893);
      match(TParser::CloseOp);
      setState(894);
      match(TParser::ArrowRight);
      setState(897);
      _errHandler->sync(this);
      switch (_input->LA(1)) {
        case TParser::Identifier: {
          setState(895);
          identifierRet();
          break;
        }

        case TParser::TypeSpec: {
          setState(896);
          match(TParser::TypeSpec);
          break;
        }

      default:
        throw NoViableAltException(this);
      }
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(899);
      match(TParser::Function);
      setState(900);
      match(TParser::Identifier);
      setState(901);
      match(TParser::OpenOp);
      setState(902);
      functionParams();
      setState(903);
      match(TParser::CloseOp);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(905);
      match(TParser::Function);
      setState(906);
      match(TParser::Identifier);
      setState(907);
      match(TParser::OpenOp);
      setState(908);
      functionParams();
      setState(909);
      match(TParser::CloseOp);
      setState(910);
      match(TParser::ArrowRight);
      setState(913);
      _errHandler->sync(this);
      switch (_input->LA(1)) {
        case TParser::Identifier: {
          setState(911);
          identifierRet();
          break;
        }

        case TParser::TypeSpec: {
          setState(912);
          match(TParser::TypeSpec);
          break;
        }

      default:
        throw NoViableAltException(this);
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

//----------------- IdentifierRetContext ------------------------------------------------------------------

TParser::IdentifierRetContext::IdentifierRetContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::IdentifierRetContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}


size_t TParser::IdentifierRetContext::getRuleIndex() const {
  return TParser::RuleIdentifierRet;
}

void TParser::IdentifierRetContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIdentifierRet(this);
}

void TParser::IdentifierRetContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIdentifierRet(this);
}


antlrcpp::Any TParser::IdentifierRetContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitIdentifierRet(this);
  else
    return visitor->visitChildren(this);
}

TParser::IdentifierRetContext* TParser::identifierRet() {
  IdentifierRetContext *_localctx = _tracker.createInstance<IdentifierRetContext>(_ctx, getState());
  enterRule(_localctx, 144, TParser::RuleIdentifierRet);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(917);
    match(TParser::Identifier);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionMethodsModesContext ------------------------------------------------------------------

TParser::FunctionMethodsModesContext::FunctionMethodsModesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::MethodVisibilityContext* TParser::FunctionMethodsModesContext::methodVisibility() {
  return getRuleContext<TParser::MethodVisibilityContext>(0);
}

TParser::FunctionGeneralModesContext* TParser::FunctionMethodsModesContext::functionGeneralModes() {
  return getRuleContext<TParser::FunctionGeneralModesContext>(0);
}


size_t TParser::FunctionMethodsModesContext::getRuleIndex() const {
  return TParser::RuleFunctionMethodsModes;
}

void TParser::FunctionMethodsModesContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionMethodsModes(this);
}

void TParser::FunctionMethodsModesContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionMethodsModes(this);
}


antlrcpp::Any TParser::FunctionMethodsModesContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionMethodsModes(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionMethodsModesContext* TParser::functionMethodsModes() {
  FunctionMethodsModesContext *_localctx = _tracker.createInstance<FunctionMethodsModesContext>(_ctx, getState());
  enterRule(_localctx, 146, TParser::RuleFunctionMethodsModes);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(919);
    methodVisibility();
    setState(920);
    functionGeneralModes();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionMethodsModesBkpContext ------------------------------------------------------------------

TParser::FunctionMethodsModesBkpContext::FunctionMethodsModesBkpContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::MethodPermContext* TParser::FunctionMethodsModesBkpContext::methodPerm() {
  return getRuleContext<TParser::MethodPermContext>(0);
}

TParser::FunctionGeneralModesContext* TParser::FunctionMethodsModesBkpContext::functionGeneralModes() {
  return getRuleContext<TParser::FunctionGeneralModesContext>(0);
}

tree::TerminalNode* TParser::FunctionMethodsModesBkpContext::Static() {
  return getToken(TParser::Static, 0);
}

tree::TerminalNode* TParser::FunctionMethodsModesBkpContext::Final() {
  return getToken(TParser::Final, 0);
}


size_t TParser::FunctionMethodsModesBkpContext::getRuleIndex() const {
  return TParser::RuleFunctionMethodsModesBkp;
}

void TParser::FunctionMethodsModesBkpContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionMethodsModesBkp(this);
}

void TParser::FunctionMethodsModesBkpContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionMethodsModesBkp(this);
}


antlrcpp::Any TParser::FunctionMethodsModesBkpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionMethodsModesBkp(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionMethodsModesBkpContext* TParser::functionMethodsModesBkp() {
  FunctionMethodsModesBkpContext *_localctx = _tracker.createInstance<FunctionMethodsModesBkpContext>(_ctx, getState());
  enterRule(_localctx, 148, TParser::RuleFunctionMethodsModesBkp);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(945);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 46, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(922);
      methodPerm();
      setState(923);
      functionGeneralModes();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(925);
      match(TParser::Static);
      setState(926);
      functionGeneralModes();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(927);
      methodPerm();
      setState(928);
      match(TParser::Static);
      setState(929);
      functionGeneralModes();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(931);
      match(TParser::Final);
      setState(932);
      methodPerm();
      setState(933);
      match(TParser::Static);
      setState(934);
      functionGeneralModes();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(936);
      match(TParser::Final);
      setState(937);
      methodPerm();
      setState(938);
      functionGeneralModes();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(940);
      match(TParser::Final);
      setState(941);
      functionGeneralModes();
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(942);
      match(TParser::Final);
      setState(943);
      match(TParser::Static);
      setState(944);
      functionGeneralModes();
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

//----------------- MethodPermContext ------------------------------------------------------------------

TParser::MethodPermContext::MethodPermContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::MethodPermContext::Pub() {
  return getToken(TParser::Pub, 0);
}

tree::TerminalNode* TParser::MethodPermContext::Pro() {
  return getToken(TParser::Pro, 0);
}

tree::TerminalNode* TParser::MethodPermContext::Priv() {
  return getToken(TParser::Priv, 0);
}


size_t TParser::MethodPermContext::getRuleIndex() const {
  return TParser::RuleMethodPerm;
}

void TParser::MethodPermContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterMethodPerm(this);
}

void TParser::MethodPermContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitMethodPerm(this);
}


antlrcpp::Any TParser::MethodPermContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitMethodPerm(this);
  else
    return visitor->visitChildren(this);
}

TParser::MethodPermContext* TParser::methodPerm() {
  MethodPermContext *_localctx = _tracker.createInstance<MethodPermContext>(_ctx, getState());
  enterRule(_localctx, 150, TParser::RuleMethodPerm);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(947);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << TParser::Pub)
      | (1ULL << TParser::Pro)
      | (1ULL << TParser::Priv))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VisibilityItemsContext ------------------------------------------------------------------

TParser::VisibilityItemsContext::VisibilityItemsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::VisibilityItemsContext::Pub() {
  return getToken(TParser::Pub, 0);
}

tree::TerminalNode* TParser::VisibilityItemsContext::Pro() {
  return getToken(TParser::Pro, 0);
}

tree::TerminalNode* TParser::VisibilityItemsContext::Priv() {
  return getToken(TParser::Priv, 0);
}

tree::TerminalNode* TParser::VisibilityItemsContext::Final() {
  return getToken(TParser::Final, 0);
}

tree::TerminalNode* TParser::VisibilityItemsContext::Static() {
  return getToken(TParser::Static, 0);
}


size_t TParser::VisibilityItemsContext::getRuleIndex() const {
  return TParser::RuleVisibilityItems;
}

void TParser::VisibilityItemsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVisibilityItems(this);
}

void TParser::VisibilityItemsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVisibilityItems(this);
}


antlrcpp::Any TParser::VisibilityItemsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitVisibilityItems(this);
  else
    return visitor->visitChildren(this);
}

TParser::VisibilityItemsContext* TParser::visibilityItems() {
  VisibilityItemsContext *_localctx = _tracker.createInstance<VisibilityItemsContext>(_ctx, getState());
  enterRule(_localctx, 152, TParser::RuleVisibilityItems);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(949);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << TParser::Pub)
      | (1ULL << TParser::Pro)
      | (1ULL << TParser::Priv)
      | (1ULL << TParser::Static)
      | (1ULL << TParser::Final))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- MethodVisibilityContext ------------------------------------------------------------------

TParser::MethodVisibilityContext::MethodVisibilityContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::VisibilityItemsContext* TParser::MethodVisibilityContext::visibilityItems() {
  return getRuleContext<TParser::VisibilityItemsContext>(0);
}

TParser::MethodVisibilityContext* TParser::MethodVisibilityContext::methodVisibility() {
  return getRuleContext<TParser::MethodVisibilityContext>(0);
}


size_t TParser::MethodVisibilityContext::getRuleIndex() const {
  return TParser::RuleMethodVisibility;
}

void TParser::MethodVisibilityContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterMethodVisibility(this);
}

void TParser::MethodVisibilityContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitMethodVisibility(this);
}


antlrcpp::Any TParser::MethodVisibilityContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitMethodVisibility(this);
  else
    return visitor->visitChildren(this);
}

TParser::MethodVisibilityContext* TParser::methodVisibility() {
  MethodVisibilityContext *_localctx = _tracker.createInstance<MethodVisibilityContext>(_ctx, getState());
  enterRule(_localctx, 154, TParser::RuleMethodVisibility);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(955);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 47, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(951);
      visibilityItems();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(952);
      visibilityItems();
      setState(953);
      methodVisibility();
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

//----------------- ConstructClassMethodContext ------------------------------------------------------------------

TParser::ConstructClassMethodContext::ConstructClassMethodContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ConstructClassMethodContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::ConstructClassMethodContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

tree::TerminalNode* TParser::ConstructClassMethodContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}

TParser::FunctionParamsContext* TParser::ConstructClassMethodContext::functionParams() {
  return getRuleContext<TParser::FunctionParamsContext>(0);
}


size_t TParser::ConstructClassMethodContext::getRuleIndex() const {
  return TParser::RuleConstructClassMethod;
}

void TParser::ConstructClassMethodContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConstructClassMethod(this);
}

void TParser::ConstructClassMethodContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConstructClassMethod(this);
}


antlrcpp::Any TParser::ConstructClassMethodContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConstructClassMethod(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConstructClassMethodContext* TParser::constructClassMethod() {
  ConstructClassMethodContext *_localctx = _tracker.createInstance<ConstructClassMethodContext>(_ctx, getState());
  enterRule(_localctx, 156, TParser::RuleConstructClassMethod);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(965);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 48, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(957);
      match(TParser::Identifier);
      setState(958);
      match(TParser::OpenOp);
      setState(959);
      match(TParser::CloseOp);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(960);
      match(TParser::Identifier);
      setState(961);
      match(TParser::OpenOp);
      setState(962);
      functionParams();
      setState(963);
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

//----------------- InterfaceMethodContext ------------------------------------------------------------------

TParser::InterfaceMethodContext::InterfaceMethodContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionsModesContext* TParser::InterfaceMethodContext::functionsModes() {
  return getRuleContext<TParser::FunctionsModesContext>(0);
}

TParser::FunctionMethodsModesContext* TParser::InterfaceMethodContext::functionMethodsModes() {
  return getRuleContext<TParser::FunctionMethodsModesContext>(0);
}


size_t TParser::InterfaceMethodContext::getRuleIndex() const {
  return TParser::RuleInterfaceMethod;
}

void TParser::InterfaceMethodContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterInterfaceMethod(this);
}

void TParser::InterfaceMethodContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitInterfaceMethod(this);
}


antlrcpp::Any TParser::InterfaceMethodContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitInterfaceMethod(this);
  else
    return visitor->visitChildren(this);
}

TParser::InterfaceMethodContext* TParser::interfaceMethod() {
  InterfaceMethodContext *_localctx = _tracker.createInstance<InterfaceMethodContext>(_ctx, getState());
  enterRule(_localctx, 158, TParser::RuleInterfaceMethod);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(969);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Function: {
        enterOuterAlt(_localctx, 1);
        setState(967);
        functionsModes();
        break;
      }

      case TParser::Pub:
      case TParser::Pro:
      case TParser::Priv:
      case TParser::Static:
      case TParser::Final: {
        enterOuterAlt(_localctx, 2);
        setState(968);
        functionMethodsModes();
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

//----------------- FunctionCodeBlockContext ------------------------------------------------------------------

TParser::FunctionCodeBlockContext::FunctionCodeBlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionCodeBlockElementsContext* TParser::FunctionCodeBlockContext::functionCodeBlockElements() {
  return getRuleContext<TParser::FunctionCodeBlockElementsContext>(0);
}


size_t TParser::FunctionCodeBlockContext::getRuleIndex() const {
  return TParser::RuleFunctionCodeBlock;
}

void TParser::FunctionCodeBlockContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionCodeBlock(this);
}

void TParser::FunctionCodeBlockContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionCodeBlock(this);
}


antlrcpp::Any TParser::FunctionCodeBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionCodeBlock(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionCodeBlockContext* TParser::functionCodeBlock() {
  FunctionCodeBlockContext *_localctx = _tracker.createInstance<FunctionCodeBlockContext>(_ctx, getState());
  enterRule(_localctx, 160, TParser::RuleFunctionCodeBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(971);
    functionCodeBlockElements();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionCodeBlockElementsContext ------------------------------------------------------------------

TParser::FunctionCodeBlockElementsContext::FunctionCodeBlockElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::SentenceContext* TParser::FunctionCodeBlockElementsContext::sentence() {
  return getRuleContext<TParser::SentenceContext>(0);
}

TParser::FunctionCodeBlockElementsContext* TParser::FunctionCodeBlockElementsContext::functionCodeBlockElements() {
  return getRuleContext<TParser::FunctionCodeBlockElementsContext>(0);
}


size_t TParser::FunctionCodeBlockElementsContext::getRuleIndex() const {
  return TParser::RuleFunctionCodeBlockElements;
}

void TParser::FunctionCodeBlockElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionCodeBlockElements(this);
}

void TParser::FunctionCodeBlockElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionCodeBlockElements(this);
}


antlrcpp::Any TParser::FunctionCodeBlockElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionCodeBlockElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionCodeBlockElementsContext* TParser::functionCodeBlockElements() {
  FunctionCodeBlockElementsContext *_localctx = _tracker.createInstance<FunctionCodeBlockElementsContext>(_ctx, getState());
  enterRule(_localctx, 162, TParser::RuleFunctionCodeBlockElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(977);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 50, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(973);
      sentence();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(974);
      sentence();
      setState(975);
      functionCodeBlockElements();
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

//----------------- FunctionParamsContext ------------------------------------------------------------------

TParser::FunctionParamsContext::FunctionParamsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionParamsControlContext* TParser::FunctionParamsContext::functionParamsControl() {
  return getRuleContext<TParser::FunctionParamsControlContext>(0);
}


size_t TParser::FunctionParamsContext::getRuleIndex() const {
  return TParser::RuleFunctionParams;
}

void TParser::FunctionParamsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionParams(this);
}

void TParser::FunctionParamsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionParams(this);
}


antlrcpp::Any TParser::FunctionParamsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionParams(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionParamsContext* TParser::functionParams() {
  FunctionParamsContext *_localctx = _tracker.createInstance<FunctionParamsContext>(_ctx, getState());
  enterRule(_localctx, 164, TParser::RuleFunctionParams);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(979);
    functionParamsControl();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionParamsControlContext ------------------------------------------------------------------

TParser::FunctionParamsControlContext::FunctionParamsControlContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionParamElementsContext* TParser::FunctionParamsControlContext::functionParamElements() {
  return getRuleContext<TParser::FunctionParamElementsContext>(0);
}

tree::TerminalNode* TParser::FunctionParamsControlContext::Separator() {
  return getToken(TParser::Separator, 0);
}

TParser::FunctionParamsControlContext* TParser::FunctionParamsControlContext::functionParamsControl() {
  return getRuleContext<TParser::FunctionParamsControlContext>(0);
}


size_t TParser::FunctionParamsControlContext::getRuleIndex() const {
  return TParser::RuleFunctionParamsControl;
}

void TParser::FunctionParamsControlContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionParamsControl(this);
}

void TParser::FunctionParamsControlContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionParamsControl(this);
}


antlrcpp::Any TParser::FunctionParamsControlContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionParamsControl(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionParamsControlContext* TParser::functionParamsControl() {
  FunctionParamsControlContext *_localctx = _tracker.createInstance<FunctionParamsControlContext>(_ctx, getState());
  enterRule(_localctx, 166, TParser::RuleFunctionParamsControl);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(986);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 51, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(981);
      functionParamElements();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(982);
      functionParamElements();
      setState(983);
      match(TParser::Separator);
      setState(984);
      functionParamsControl();
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

//----------------- FunctionParamElementsContext ------------------------------------------------------------------

TParser::FunctionParamElementsContext::FunctionParamElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::FunctionParamElementsContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::FunctionParamElementsContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}


size_t TParser::FunctionParamElementsContext::getRuleIndex() const {
  return TParser::RuleFunctionParamElements;
}

void TParser::FunctionParamElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionParamElements(this);
}

void TParser::FunctionParamElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionParamElements(this);
}


antlrcpp::Any TParser::FunctionParamElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionParamElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionParamElementsContext* TParser::functionParamElements() {
  FunctionParamElementsContext *_localctx = _tracker.createInstance<FunctionParamElementsContext>(_ctx, getState());
  enterRule(_localctx, 168, TParser::RuleFunctionParamElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(988);
    match(TParser::Identifier);
    setState(989);
    match(TParser::TypeSpec);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- OopGeneralContext ------------------------------------------------------------------

TParser::OopGeneralContext::OopGeneralContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::InterfaceClassContext* TParser::OopGeneralContext::interfaceClass() {
  return getRuleContext<TParser::InterfaceClassContext>(0);
}

TParser::AbstractClassContext* TParser::OopGeneralContext::abstractClass() {
  return getRuleContext<TParser::AbstractClassContext>(0);
}

TParser::ClassDefinationContext* TParser::OopGeneralContext::classDefination() {
  return getRuleContext<TParser::ClassDefinationContext>(0);
}


size_t TParser::OopGeneralContext::getRuleIndex() const {
  return TParser::RuleOopGeneral;
}

void TParser::OopGeneralContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterOopGeneral(this);
}

void TParser::OopGeneralContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitOopGeneral(this);
}


antlrcpp::Any TParser::OopGeneralContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitOopGeneral(this);
  else
    return visitor->visitChildren(this);
}

TParser::OopGeneralContext* TParser::oopGeneral() {
  OopGeneralContext *_localctx = _tracker.createInstance<OopGeneralContext>(_ctx, getState());
  enterRule(_localctx, 170, TParser::RuleOopGeneral);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(994);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Interface: {
        enterOuterAlt(_localctx, 1);
        setState(991);
        interfaceClass();
        break;
      }

      case TParser::Abstract: {
        enterOuterAlt(_localctx, 2);
        setState(992);
        abstractClass();
        break;
      }

      case TParser::Final:
      case TParser::Class: {
        enterOuterAlt(_localctx, 3);
        setState(993);
        classDefination();
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

//----------------- InterfaceClassContext ------------------------------------------------------------------

TParser::InterfaceClassContext::InterfaceClassContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::InterfaceClassDefinitionContext* TParser::InterfaceClassContext::interfaceClassDefinition() {
  return getRuleContext<TParser::InterfaceClassDefinitionContext>(0);
}


size_t TParser::InterfaceClassContext::getRuleIndex() const {
  return TParser::RuleInterfaceClass;
}

void TParser::InterfaceClassContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterInterfaceClass(this);
}

void TParser::InterfaceClassContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitInterfaceClass(this);
}


antlrcpp::Any TParser::InterfaceClassContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitInterfaceClass(this);
  else
    return visitor->visitChildren(this);
}

TParser::InterfaceClassContext* TParser::interfaceClass() {
  InterfaceClassContext *_localctx = _tracker.createInstance<InterfaceClassContext>(_ctx, getState());
  enterRule(_localctx, 172, TParser::RuleInterfaceClass);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(996);
    interfaceClassDefinition();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- InterfaceClassDefinitionContext ------------------------------------------------------------------

TParser::InterfaceClassDefinitionContext::InterfaceClassDefinitionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::InterfaceClassDefinitionContext::Interface() {
  return getToken(TParser::Interface, 0);
}

tree::TerminalNode* TParser::InterfaceClassDefinitionContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::InterfaceClassDefinitionContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::InterfaceClassDefinitionContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::InterfaceCodeBlockContext* TParser::InterfaceClassDefinitionContext::interfaceCodeBlock() {
  return getRuleContext<TParser::InterfaceCodeBlockContext>(0);
}

tree::TerminalNode* TParser::InterfaceClassDefinitionContext::Extends() {
  return getToken(TParser::Extends, 0);
}

TParser::IdentifierBContext* TParser::InterfaceClassDefinitionContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}


size_t TParser::InterfaceClassDefinitionContext::getRuleIndex() const {
  return TParser::RuleInterfaceClassDefinition;
}

void TParser::InterfaceClassDefinitionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterInterfaceClassDefinition(this);
}

void TParser::InterfaceClassDefinitionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitInterfaceClassDefinition(this);
}


antlrcpp::Any TParser::InterfaceClassDefinitionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitInterfaceClassDefinition(this);
  else
    return visitor->visitChildren(this);
}

TParser::InterfaceClassDefinitionContext* TParser::interfaceClassDefinition() {
  InterfaceClassDefinitionContext *_localctx = _tracker.createInstance<InterfaceClassDefinitionContext>(_ctx, getState());
  enterRule(_localctx, 174, TParser::RuleInterfaceClassDefinition);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(1023);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 53, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(998);
      match(TParser::Interface);
      setState(999);
      match(TParser::Identifier);
      setState(1000);
      match(TParser::OpenBlock);
      setState(1001);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(1002);
      match(TParser::Interface);
      setState(1003);
      match(TParser::Identifier);
      setState(1004);
      match(TParser::OpenBlock);
      setState(1005);
      interfaceCodeBlock();
      setState(1006);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(1008);
      match(TParser::Interface);
      setState(1009);
      match(TParser::Identifier);
      setState(1010);
      match(TParser::Extends);
      setState(1011);
      identifierB();
      setState(1012);
      match(TParser::OpenBlock);
      setState(1013);
      match(TParser::CloseBlock);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(1015);
      match(TParser::Interface);
      setState(1016);
      match(TParser::Identifier);
      setState(1017);
      match(TParser::Extends);
      setState(1018);
      identifierB();
      setState(1019);
      match(TParser::OpenBlock);
      setState(1020);
      interfaceCodeBlock();
      setState(1021);
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

//----------------- InterfaceCodeBlockContext ------------------------------------------------------------------

TParser::InterfaceCodeBlockContext::InterfaceCodeBlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionCodeBlockElementsContext* TParser::InterfaceCodeBlockContext::functionCodeBlockElements() {
  return getRuleContext<TParser::FunctionCodeBlockElementsContext>(0);
}


size_t TParser::InterfaceCodeBlockContext::getRuleIndex() const {
  return TParser::RuleInterfaceCodeBlock;
}

void TParser::InterfaceCodeBlockContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterInterfaceCodeBlock(this);
}

void TParser::InterfaceCodeBlockContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitInterfaceCodeBlock(this);
}


antlrcpp::Any TParser::InterfaceCodeBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitInterfaceCodeBlock(this);
  else
    return visitor->visitChildren(this);
}

TParser::InterfaceCodeBlockContext* TParser::interfaceCodeBlock() {
  InterfaceCodeBlockContext *_localctx = _tracker.createInstance<InterfaceCodeBlockContext>(_ctx, getState());
  enterRule(_localctx, 176, TParser::RuleInterfaceCodeBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1025);
    functionCodeBlockElements();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AbstractClassContext ------------------------------------------------------------------

TParser::AbstractClassContext::AbstractClassContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::AbstractClassDefinitionContext* TParser::AbstractClassContext::abstractClassDefinition() {
  return getRuleContext<TParser::AbstractClassDefinitionContext>(0);
}


size_t TParser::AbstractClassContext::getRuleIndex() const {
  return TParser::RuleAbstractClass;
}

void TParser::AbstractClassContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAbstractClass(this);
}

void TParser::AbstractClassContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAbstractClass(this);
}


antlrcpp::Any TParser::AbstractClassContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitAbstractClass(this);
  else
    return visitor->visitChildren(this);
}

TParser::AbstractClassContext* TParser::abstractClass() {
  AbstractClassContext *_localctx = _tracker.createInstance<AbstractClassContext>(_ctx, getState());
  enterRule(_localctx, 178, TParser::RuleAbstractClass);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1027);
    abstractClassDefinition();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AbstractClassDefinitionContext ------------------------------------------------------------------

TParser::AbstractClassDefinitionContext::AbstractClassDefinitionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::AbstractClassDefinitionContext::Abstract() {
  return getToken(TParser::Abstract, 0);
}

tree::TerminalNode* TParser::AbstractClassDefinitionContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::AbstractClassDefinitionContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::AbstractClassDefinitionContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::AbstractCodeBlockContext* TParser::AbstractClassDefinitionContext::abstractCodeBlock() {
  return getRuleContext<TParser::AbstractCodeBlockContext>(0);
}

tree::TerminalNode* TParser::AbstractClassDefinitionContext::Extends() {
  return getToken(TParser::Extends, 0);
}

TParser::IdentifierBContext* TParser::AbstractClassDefinitionContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}


size_t TParser::AbstractClassDefinitionContext::getRuleIndex() const {
  return TParser::RuleAbstractClassDefinition;
}

void TParser::AbstractClassDefinitionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAbstractClassDefinition(this);
}

void TParser::AbstractClassDefinitionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAbstractClassDefinition(this);
}


antlrcpp::Any TParser::AbstractClassDefinitionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitAbstractClassDefinition(this);
  else
    return visitor->visitChildren(this);
}

TParser::AbstractClassDefinitionContext* TParser::abstractClassDefinition() {
  AbstractClassDefinitionContext *_localctx = _tracker.createInstance<AbstractClassDefinitionContext>(_ctx, getState());
  enterRule(_localctx, 180, TParser::RuleAbstractClassDefinition);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(1054);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 54, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(1029);
      match(TParser::Abstract);
      setState(1030);
      match(TParser::Identifier);
      setState(1031);
      match(TParser::OpenBlock);
      setState(1032);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(1033);
      match(TParser::Abstract);
      setState(1034);
      match(TParser::Identifier);
      setState(1035);
      match(TParser::OpenBlock);
      setState(1036);
      abstractCodeBlock();
      setState(1037);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(1039);
      match(TParser::Abstract);
      setState(1040);
      match(TParser::Identifier);
      setState(1041);
      match(TParser::Extends);
      setState(1042);
      identifierB();
      setState(1043);
      match(TParser::OpenBlock);
      setState(1044);
      match(TParser::CloseBlock);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(1046);
      match(TParser::Abstract);
      setState(1047);
      match(TParser::Identifier);
      setState(1048);
      match(TParser::Extends);
      setState(1049);
      identifierB();
      setState(1050);
      match(TParser::OpenBlock);
      setState(1051);
      abstractCodeBlock();
      setState(1052);
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

//----------------- AbstractCodeBlockContext ------------------------------------------------------------------

TParser::AbstractCodeBlockContext::AbstractCodeBlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionCodeBlockElementsContext* TParser::AbstractCodeBlockContext::functionCodeBlockElements() {
  return getRuleContext<TParser::FunctionCodeBlockElementsContext>(0);
}


size_t TParser::AbstractCodeBlockContext::getRuleIndex() const {
  return TParser::RuleAbstractCodeBlock;
}

void TParser::AbstractCodeBlockContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAbstractCodeBlock(this);
}

void TParser::AbstractCodeBlockContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAbstractCodeBlock(this);
}


antlrcpp::Any TParser::AbstractCodeBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitAbstractCodeBlock(this);
  else
    return visitor->visitChildren(this);
}

TParser::AbstractCodeBlockContext* TParser::abstractCodeBlock() {
  AbstractCodeBlockContext *_localctx = _tracker.createInstance<AbstractCodeBlockContext>(_ctx, getState());
  enterRule(_localctx, 182, TParser::RuleAbstractCodeBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1056);
    functionCodeBlockElements();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ClassDefinationContext ------------------------------------------------------------------

TParser::ClassDefinationContext::ClassDefinationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ClassModesContext* TParser::ClassDefinationContext::classModes() {
  return getRuleContext<TParser::ClassModesContext>(0);
}

tree::TerminalNode* TParser::ClassDefinationContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::ClassDefinationContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::ClassCodeBlockContext* TParser::ClassDefinationContext::classCodeBlock() {
  return getRuleContext<TParser::ClassCodeBlockContext>(0);
}


size_t TParser::ClassDefinationContext::getRuleIndex() const {
  return TParser::RuleClassDefination;
}

void TParser::ClassDefinationContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterClassDefination(this);
}

void TParser::ClassDefinationContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitClassDefination(this);
}


antlrcpp::Any TParser::ClassDefinationContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitClassDefination(this);
  else
    return visitor->visitChildren(this);
}

TParser::ClassDefinationContext* TParser::classDefination() {
  ClassDefinationContext *_localctx = _tracker.createInstance<ClassDefinationContext>(_ctx, getState());
  enterRule(_localctx, 184, TParser::RuleClassDefination);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(1067);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 55, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(1058);
      classModes();
      setState(1059);
      match(TParser::OpenBlock);
      setState(1060);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(1062);
      classModes();
      setState(1063);
      match(TParser::OpenBlock);
      setState(1064);
      classCodeBlock();
      setState(1065);
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

//----------------- ClassCodeBlockContext ------------------------------------------------------------------

TParser::ClassCodeBlockContext::ClassCodeBlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionCodeBlockElementsContext* TParser::ClassCodeBlockContext::functionCodeBlockElements() {
  return getRuleContext<TParser::FunctionCodeBlockElementsContext>(0);
}


size_t TParser::ClassCodeBlockContext::getRuleIndex() const {
  return TParser::RuleClassCodeBlock;
}

void TParser::ClassCodeBlockContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterClassCodeBlock(this);
}

void TParser::ClassCodeBlockContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitClassCodeBlock(this);
}


antlrcpp::Any TParser::ClassCodeBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitClassCodeBlock(this);
  else
    return visitor->visitChildren(this);
}

TParser::ClassCodeBlockContext* TParser::classCodeBlock() {
  ClassCodeBlockContext *_localctx = _tracker.createInstance<ClassCodeBlockContext>(_ctx, getState());
  enterRule(_localctx, 186, TParser::RuleClassCodeBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1069);
    functionCodeBlockElements();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ClassModesContext ------------------------------------------------------------------

TParser::ClassModesContext::ClassModesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ClassModesContext::Class() {
  return getToken(TParser::Class, 0);
}

tree::TerminalNode* TParser::ClassModesContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::ClassModesContext::Extends() {
  return getToken(TParser::Extends, 0);
}

TParser::IdentifierBContext* TParser::ClassModesContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}

tree::TerminalNode* TParser::ClassModesContext::Implements() {
  return getToken(TParser::Implements, 0);
}

TParser::IdentifierCContext* TParser::ClassModesContext::identifierC() {
  return getRuleContext<TParser::IdentifierCContext>(0);
}

tree::TerminalNode* TParser::ClassModesContext::Final() {
  return getToken(TParser::Final, 0);
}


size_t TParser::ClassModesContext::getRuleIndex() const {
  return TParser::RuleClassModes;
}

void TParser::ClassModesContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterClassModes(this);
}

void TParser::ClassModesContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitClassModes(this);
}


antlrcpp::Any TParser::ClassModesContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitClassModes(this);
  else
    return visitor->visitChildren(this);
}

TParser::ClassModesContext* TParser::classModes() {
  ClassModesContext *_localctx = _tracker.createInstance<ClassModesContext>(_ctx, getState());
  enterRule(_localctx, 188, TParser::RuleClassModes);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(1109);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 56, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(1071);
      match(TParser::Class);
      setState(1072);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(1073);
      match(TParser::Class);
      setState(1074);
      match(TParser::Identifier);
      setState(1075);
      match(TParser::Extends);
      setState(1076);
      identifierB();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(1077);
      match(TParser::Class);
      setState(1078);
      match(TParser::Identifier);
      setState(1079);
      match(TParser::Implements);
      setState(1080);
      identifierB();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(1081);
      match(TParser::Class);
      setState(1082);
      match(TParser::Identifier);
      setState(1083);
      match(TParser::Extends);
      setState(1084);
      identifierB();
      setState(1085);
      match(TParser::Implements);
      setState(1086);
      identifierC();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(1088);
      match(TParser::Final);
      setState(1089);
      match(TParser::Class);
      setState(1090);
      match(TParser::Identifier);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(1091);
      match(TParser::Final);
      setState(1092);
      match(TParser::Class);
      setState(1093);
      match(TParser::Identifier);
      setState(1094);
      match(TParser::Extends);
      setState(1095);
      identifierB();
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(1096);
      match(TParser::Final);
      setState(1097);
      match(TParser::Class);
      setState(1098);
      match(TParser::Identifier);
      setState(1099);
      match(TParser::Implements);
      setState(1100);
      identifierB();
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(1101);
      match(TParser::Final);
      setState(1102);
      match(TParser::Class);
      setState(1103);
      match(TParser::Identifier);
      setState(1104);
      match(TParser::Extends);
      setState(1105);
      identifierB();
      setState(1106);
      match(TParser::Implements);
      setState(1107);
      identifierC();
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

//----------------- IdentifierCContext ------------------------------------------------------------------

TParser::IdentifierCContext::IdentifierCContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::IdentifierCContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}


size_t TParser::IdentifierCContext::getRuleIndex() const {
  return TParser::RuleIdentifierC;
}

void TParser::IdentifierCContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIdentifierC(this);
}

void TParser::IdentifierCContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIdentifierC(this);
}


antlrcpp::Any TParser::IdentifierCContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitIdentifierC(this);
  else
    return visitor->visitChildren(this);
}

TParser::IdentifierCContext* TParser::identifierC() {
  IdentifierCContext *_localctx = _tracker.createInstance<IdentifierCContext>(_ctx, getState());
  enterRule(_localctx, 190, TParser::RuleIdentifierC);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1111);
    match(TParser::Identifier);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ArrayAccessElementsContext ------------------------------------------------------------------

TParser::ArrayAccessElementsContext::ArrayAccessElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ArrayAccessElementsItemsContext* TParser::ArrayAccessElementsContext::arrayAccessElementsItems() {
  return getRuleContext<TParser::ArrayAccessElementsItemsContext>(0);
}

TParser::ArrayAccessElementsContext* TParser::ArrayAccessElementsContext::arrayAccessElements() {
  return getRuleContext<TParser::ArrayAccessElementsContext>(0);
}


size_t TParser::ArrayAccessElementsContext::getRuleIndex() const {
  return TParser::RuleArrayAccessElements;
}

void TParser::ArrayAccessElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterArrayAccessElements(this);
}

void TParser::ArrayAccessElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitArrayAccessElements(this);
}


antlrcpp::Any TParser::ArrayAccessElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitArrayAccessElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::ArrayAccessElementsContext* TParser::arrayAccessElements() {
  ArrayAccessElementsContext *_localctx = _tracker.createInstance<ArrayAccessElementsContext>(_ctx, getState());
  enterRule(_localctx, 192, TParser::RuleArrayAccessElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(1117);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 57, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(1113);
      arrayAccessElementsItems();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(1114);
      arrayAccessElementsItems();
      setState(1115);
      arrayAccessElements();
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

//----------------- ArrayAccessElementsItemsContext ------------------------------------------------------------------

TParser::ArrayAccessElementsItemsContext::ArrayAccessElementsItemsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ArrayAccessElementsItemsContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::ArrayAccessElementsItemsContext::Point() {
  return getToken(TParser::Point, 0);
}

TParser::AccessBlockArContext* TParser::ArrayAccessElementsItemsContext::accessBlockAr() {
  return getRuleContext<TParser::AccessBlockArContext>(0);
}

TParser::FirstIncDecContext* TParser::ArrayAccessElementsItemsContext::firstIncDec() {
  return getRuleContext<TParser::FirstIncDecContext>(0);
}

TParser::LastIncDecContext* TParser::ArrayAccessElementsItemsContext::lastIncDec() {
  return getRuleContext<TParser::LastIncDecContext>(0);
}


size_t TParser::ArrayAccessElementsItemsContext::getRuleIndex() const {
  return TParser::RuleArrayAccessElementsItems;
}

void TParser::ArrayAccessElementsItemsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterArrayAccessElementsItems(this);
}

void TParser::ArrayAccessElementsItemsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitArrayAccessElementsItems(this);
}


antlrcpp::Any TParser::ArrayAccessElementsItemsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitArrayAccessElementsItems(this);
  else
    return visitor->visitChildren(this);
}

TParser::ArrayAccessElementsItemsContext* TParser::arrayAccessElementsItems() {
  ArrayAccessElementsItemsContext *_localctx = _tracker.createInstance<ArrayAccessElementsItemsContext>(_ctx, getState());
  enterRule(_localctx, 194, TParser::RuleArrayAccessElementsItems);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(1153);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 58, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(1119);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(1120);
      match(TParser::Identifier);
      setState(1121);
      match(TParser::Point);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(1122);
      match(TParser::Identifier);
      setState(1123);
      accessBlockAr();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(1124);
      match(TParser::Identifier);
      setState(1125);
      accessBlockAr();
      setState(1126);
      match(TParser::Point);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(1128);
      firstIncDec();
      setState(1129);
      match(TParser::Identifier);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(1131);
      match(TParser::Identifier);
      setState(1132);
      match(TParser::Point);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(1133);
      firstIncDec();
      setState(1134);
      match(TParser::Identifier);
      setState(1135);
      accessBlockAr();
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(1137);
      match(TParser::Identifier);
      setState(1138);
      accessBlockAr();
      setState(1139);
      match(TParser::Point);
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(1141);
      match(TParser::Identifier);
      setState(1142);
      lastIncDec();
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(1143);
      match(TParser::Identifier);
      setState(1144);
      match(TParser::Point);
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(1145);
      match(TParser::Identifier);
      setState(1146);
      accessBlockAr();
      setState(1147);
      lastIncDec();
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(1149);
      match(TParser::Identifier);
      setState(1150);
      accessBlockAr();
      setState(1151);
      match(TParser::Point);
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

//----------------- AccessBlockArContext ------------------------------------------------------------------

TParser::AccessBlockArContext::AccessBlockArContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::AccessBlockArContext::OpenArIndex() {
  return getToken(TParser::OpenArIndex, 0);
}

TParser::ArrayIndexAccessContext* TParser::AccessBlockArContext::arrayIndexAccess() {
  return getRuleContext<TParser::ArrayIndexAccessContext>(0);
}

tree::TerminalNode* TParser::AccessBlockArContext::CloseArIndex() {
  return getToken(TParser::CloseArIndex, 0);
}

TParser::AccessBlockArContext* TParser::AccessBlockArContext::accessBlockAr() {
  return getRuleContext<TParser::AccessBlockArContext>(0);
}


size_t TParser::AccessBlockArContext::getRuleIndex() const {
  return TParser::RuleAccessBlockAr;
}

void TParser::AccessBlockArContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAccessBlockAr(this);
}

void TParser::AccessBlockArContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAccessBlockAr(this);
}


antlrcpp::Any TParser::AccessBlockArContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitAccessBlockAr(this);
  else
    return visitor->visitChildren(this);
}

TParser::AccessBlockArContext* TParser::accessBlockAr() {
  AccessBlockArContext *_localctx = _tracker.createInstance<AccessBlockArContext>(_ctx, getState());
  enterRule(_localctx, 196, TParser::RuleAccessBlockAr);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(1164);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 59, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(1155);
      match(TParser::OpenArIndex);
      setState(1156);
      arrayIndexAccess();
      setState(1157);
      match(TParser::CloseArIndex);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(1159);
      match(TParser::OpenArIndex);
      setState(1160);
      arrayIndexAccess();
      setState(1161);
      match(TParser::CloseArIndex);
      setState(1162);
      accessBlockAr();
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

//----------------- ArrayIndexAccessContext ------------------------------------------------------------------

TParser::ArrayIndexAccessContext::ArrayIndexAccessContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::OperationElementsContext* TParser::ArrayIndexAccessContext::operationElements() {
  return getRuleContext<TParser::OperationElementsContext>(0);
}


size_t TParser::ArrayIndexAccessContext::getRuleIndex() const {
  return TParser::RuleArrayIndexAccess;
}

void TParser::ArrayIndexAccessContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterArrayIndexAccess(this);
}

void TParser::ArrayIndexAccessContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitArrayIndexAccess(this);
}


antlrcpp::Any TParser::ArrayIndexAccessContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitArrayIndexAccess(this);
  else
    return visitor->visitChildren(this);
}

TParser::ArrayIndexAccessContext* TParser::arrayIndexAccess() {
  ArrayIndexAccessContext *_localctx = _tracker.createInstance<ArrayIndexAccessContext>(_ctx, getState());
  enterRule(_localctx, 198, TParser::RuleArrayIndexAccess);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1166);
    operationElements();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AnonymousFunctionContext ------------------------------------------------------------------

TParser::AnonymousFunctionContext::AnonymousFunctionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> TParser::AnonymousFunctionContext::OpenOp() {
  return getTokens(TParser::OpenOp);
}

tree::TerminalNode* TParser::AnonymousFunctionContext::OpenOp(size_t i) {
  return getToken(TParser::OpenOp, i);
}

TParser::AnFnItemsContext* TParser::AnonymousFunctionContext::anFnItems() {
  return getRuleContext<TParser::AnFnItemsContext>(0);
}

std::vector<tree::TerminalNode *> TParser::AnonymousFunctionContext::CloseOp() {
  return getTokens(TParser::CloseOp);
}

tree::TerminalNode* TParser::AnonymousFunctionContext::CloseOp(size_t i) {
  return getToken(TParser::CloseOp, i);
}

TParser::OperationElementsContext* TParser::AnonymousFunctionContext::operationElements() {
  return getRuleContext<TParser::OperationElementsContext>(0);
}


size_t TParser::AnonymousFunctionContext::getRuleIndex() const {
  return TParser::RuleAnonymousFunction;
}

void TParser::AnonymousFunctionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAnonymousFunction(this);
}

void TParser::AnonymousFunctionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAnonymousFunction(this);
}


antlrcpp::Any TParser::AnonymousFunctionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitAnonymousFunction(this);
  else
    return visitor->visitChildren(this);
}

TParser::AnonymousFunctionContext* TParser::anonymousFunction() {
  AnonymousFunctionContext *_localctx = _tracker.createInstance<AnonymousFunctionContext>(_ctx, getState());
  enterRule(_localctx, 200, TParser::RuleAnonymousFunction);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(1185);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 60, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(1168);
      match(TParser::OpenOp);
      setState(1169);
      anFnItems();
      setState(1170);
      match(TParser::CloseOp);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(1172);
      match(TParser::OpenOp);
      setState(1173);
      anFnItems();
      setState(1174);
      match(TParser::CloseOp);
      setState(1175);
      match(TParser::OpenOp);
      setState(1176);
      match(TParser::CloseOp);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(1178);
      match(TParser::OpenOp);
      setState(1179);
      anFnItems();
      setState(1180);
      match(TParser::CloseOp);
      setState(1181);
      match(TParser::OpenOp);
      setState(1182);
      operationElements();
      setState(1183);
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

//----------------- AnFnItemsContext ------------------------------------------------------------------

TParser::AnFnItemsContext::AnFnItemsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionsModesFnContext* TParser::AnFnItemsContext::functionsModesFn() {
  return getRuleContext<TParser::FunctionsModesFnContext>(0);
}

tree::TerminalNode* TParser::AnFnItemsContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::AnFnItemsContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::FunctionCodeBlockContext* TParser::AnFnItemsContext::functionCodeBlock() {
  return getRuleContext<TParser::FunctionCodeBlockContext>(0);
}


size_t TParser::AnFnItemsContext::getRuleIndex() const {
  return TParser::RuleAnFnItems;
}

void TParser::AnFnItemsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAnFnItems(this);
}

void TParser::AnFnItemsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAnFnItems(this);
}


antlrcpp::Any TParser::AnFnItemsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitAnFnItems(this);
  else
    return visitor->visitChildren(this);
}

TParser::AnFnItemsContext* TParser::anFnItems() {
  AnFnItemsContext *_localctx = _tracker.createInstance<AnFnItemsContext>(_ctx, getState());
  enterRule(_localctx, 202, TParser::RuleAnFnItems);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(1196);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 61, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(1187);
      functionsModesFn();
      setState(1188);
      match(TParser::OpenBlock);
      setState(1189);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(1191);
      functionsModesFn();
      setState(1192);
      match(TParser::OpenBlock);
      setState(1193);
      functionCodeBlock();
      setState(1194);
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

//----------------- FunctionsModesFnContext ------------------------------------------------------------------

TParser::FunctionsModesFnContext::FunctionsModesFnContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::FunctionsModesFnContext::Function() {
  return getToken(TParser::Function, 0);
}

tree::TerminalNode* TParser::FunctionsModesFnContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

tree::TerminalNode* TParser::FunctionsModesFnContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}

tree::TerminalNode* TParser::FunctionsModesFnContext::ArrowRight() {
  return getToken(TParser::ArrowRight, 0);
}

TParser::IdentifierRetContext* TParser::FunctionsModesFnContext::identifierRet() {
  return getRuleContext<TParser::IdentifierRetContext>(0);
}

tree::TerminalNode* TParser::FunctionsModesFnContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}

TParser::FunctionParamsContext* TParser::FunctionsModesFnContext::functionParams() {
  return getRuleContext<TParser::FunctionParamsContext>(0);
}


size_t TParser::FunctionsModesFnContext::getRuleIndex() const {
  return TParser::RuleFunctionsModesFn;
}

void TParser::FunctionsModesFnContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionsModesFn(this);
}

void TParser::FunctionsModesFnContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionsModesFn(this);
}


antlrcpp::Any TParser::FunctionsModesFnContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionsModesFn(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionsModesFnContext* TParser::functionsModesFn() {
  FunctionsModesFnContext *_localctx = _tracker.createInstance<FunctionsModesFnContext>(_ctx, getState());
  enterRule(_localctx, 204, TParser::RuleFunctionsModesFn);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(1223);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 64, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(1198);
      match(TParser::Function);
      setState(1199);
      match(TParser::OpenOp);
      setState(1200);
      match(TParser::CloseOp);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(1201);
      match(TParser::Function);
      setState(1202);
      match(TParser::OpenOp);
      setState(1203);
      match(TParser::CloseOp);
      setState(1204);
      match(TParser::ArrowRight);
      setState(1207);
      _errHandler->sync(this);
      switch (_input->LA(1)) {
        case TParser::Identifier: {
          setState(1205);
          identifierRet();
          break;
        }

        case TParser::TypeSpec: {
          setState(1206);
          match(TParser::TypeSpec);
          break;
        }

      default:
        throw NoViableAltException(this);
      }
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(1209);
      match(TParser::Function);
      setState(1210);
      match(TParser::OpenOp);
      setState(1211);
      functionParams();
      setState(1212);
      match(TParser::CloseOp);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(1214);
      match(TParser::Function);
      setState(1215);
      match(TParser::OpenOp);
      setState(1216);
      functionParams();
      setState(1217);
      match(TParser::CloseOp);
      setState(1218);
      match(TParser::ArrowRight);
      setState(1221);
      _errHandler->sync(this);
      switch (_input->LA(1)) {
        case TParser::Identifier: {
          setState(1219);
          identifierRet();
          break;
        }

        case TParser::TypeSpec: {
          setState(1220);
          match(TParser::TypeSpec);
          break;
        }

      default:
        throw NoViableAltException(this);
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

tree::TerminalNode* TParser::GeneralValueContext::String() {
  return getToken(TParser::String, 0);
}

TParser::IndexArrayContext* TParser::GeneralValueContext::indexArray() {
  return getRuleContext<TParser::IndexArrayContext>(0);
}

TParser::AssociativeArrayContext* TParser::GeneralValueContext::associativeArray() {
  return getRuleContext<TParser::AssociativeArrayContext>(0);
}

TParser::OperationElementsContext* TParser::GeneralValueContext::operationElements() {
  return getRuleContext<TParser::OperationElementsContext>(0);
}

TParser::FunctionCallContext* TParser::GeneralValueContext::functionCall() {
  return getRuleContext<TParser::FunctionCallContext>(0);
}

TParser::ObjIdentifierAContext* TParser::GeneralValueContext::objIdentifierA() {
  return getRuleContext<TParser::ObjIdentifierAContext>(0);
}

tree::TerminalNode* TParser::GeneralValueContext::Point() {
  return getToken(TParser::Point, 0);
}

TParser::ObjIdentifierBContext* TParser::GeneralValueContext::objIdentifierB() {
  return getRuleContext<TParser::ObjIdentifierBContext>(0);
}

tree::TerminalNode* TParser::GeneralValueContext::TwoTwoPoint() {
  return getToken(TParser::TwoTwoPoint, 0);
}

TParser::AnonymousFunctionContext* TParser::GeneralValueContext::anonymousFunction() {
  return getRuleContext<TParser::AnonymousFunctionContext>(0);
}

TParser::ArrayAccessElementsContext* TParser::GeneralValueContext::arrayAccessElements() {
  return getRuleContext<TParser::ArrayAccessElementsContext>(0);
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
  enterRule(_localctx, 206, TParser::RuleGeneralValue);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(1249);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 65, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(1225);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(1226);
      match(TParser::Identifier);
      setState(1227);
      match(TParser::TypeSpec);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(1228);
      match(TParser::Integer);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(1229);
      match(TParser::Integer);
      setState(1230);
      match(TParser::TypeSpec);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(1231);
      match(TParser::Float);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(1232);
      match(TParser::Float);
      setState(1233);
      match(TParser::TypeSpec);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(1234);
      match(TParser::String);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(1235);
      indexArray();
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(1236);
      associativeArray();
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(1237);
      operationElements();
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(1238);
      functionCall();
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(1239);
      objIdentifierA();
      setState(1240);
      match(TParser::Point);
      setState(1241);
      objIdentifierB();
      break;
    }

    case 13: {
      enterOuterAlt(_localctx, 13);
      setState(1243);
      objIdentifierA();
      setState(1244);
      match(TParser::TwoTwoPoint);
      setState(1245);
      objIdentifierB();
      break;
    }

    case 14: {
      enterOuterAlt(_localctx, 14);
      setState(1247);
      anonymousFunction();
      break;
    }

    case 15: {
      enterOuterAlt(_localctx, 15);
      setState(1248);
      arrayAccessElements();
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

//----------------- ObjIdentifierAContext ------------------------------------------------------------------

TParser::ObjIdentifierAContext::ObjIdentifierAContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ObjIdentifierAContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}


size_t TParser::ObjIdentifierAContext::getRuleIndex() const {
  return TParser::RuleObjIdentifierA;
}

void TParser::ObjIdentifierAContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterObjIdentifierA(this);
}

void TParser::ObjIdentifierAContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitObjIdentifierA(this);
}


antlrcpp::Any TParser::ObjIdentifierAContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitObjIdentifierA(this);
  else
    return visitor->visitChildren(this);
}

TParser::ObjIdentifierAContext* TParser::objIdentifierA() {
  ObjIdentifierAContext *_localctx = _tracker.createInstance<ObjIdentifierAContext>(_ctx, getState());
  enterRule(_localctx, 208, TParser::RuleObjIdentifierA);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1251);
    match(TParser::Identifier);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ObjIdentifierBContext ------------------------------------------------------------------

TParser::ObjIdentifierBContext::ObjIdentifierBContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ObjIdentifierBContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}


size_t TParser::ObjIdentifierBContext::getRuleIndex() const {
  return TParser::RuleObjIdentifierB;
}

void TParser::ObjIdentifierBContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterObjIdentifierB(this);
}

void TParser::ObjIdentifierBContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitObjIdentifierB(this);
}


antlrcpp::Any TParser::ObjIdentifierBContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitObjIdentifierB(this);
  else
    return visitor->visitChildren(this);
}

TParser::ObjIdentifierBContext* TParser::objIdentifierB() {
  ObjIdentifierBContext *_localctx = _tracker.createInstance<ObjIdentifierBContext>(_ctx, getState());
  enterRule(_localctx, 210, TParser::RuleObjIdentifierB);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1253);
    match(TParser::Identifier);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

// Static vars and initialization.
std::vector<dfa::DFA> TParser::_decisionToDFA;
atn::PredictionContextCache TParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN TParser::_atn;
std::vector<uint16_t> TParser::_serializedATN;

std::vector<std::string> TParser::_ruleNames = {
  "main", "fileContent", "sentence", "liveToken", "breakFor", "nextFor", 
  "use", "useValue", "useString", "variable", "variableModes", "variableModesBkp", 
  "variableMembers", "variableDefinition", "variableDefinitionGeneral", 
  "indexArray", "indexArrayElements", "associativeArray", "associativeArrayElements", 
  "operationBlock", "operationElements", "operationValue", "firstIncDec", 
  "lastIncDec", "callingFunction", "functionCall", "functionCallParamAC", 
  "methodCascadingModes", "functionCallCascading", "functionCallCascadingItem", 
  "identifierB", "pointSeparator", "functionCallParam", "functionCallParamElements", 
  "conditionalExpression", "conditionalExpressionStructBlock", "ifElementUnique", 
  "elifElements", "elifElementUnique", "elseElementUnique", "conditionalExpressionItems", 
  "conditionalBlockElements", "conditionalBlockElsItems", "conditionalExpressionElements", 
  "conditionExpValue", "conditionExpBlock", "conditionExpBlockItemValue", 
  "conditionExpBlockItem", "conditionalExpValue", "functionCallAndAttr", 
  "identifierAttrFn", "functionCallAttrFn", "functionCallAttrFnItem", "loop", 
  "loopExpressionItems", "loopExpression", "loopInfinite", "loopComplete", 
  "loopConditional", "endOne", "endTwo", "loopOneMembers", "loopTwoMembers", 
  "loopThreeMembers", "loopThreeMembersValues", "loopBlockElements", "loopBlockElementsLimited", 
  "ret", "retValues", "functions", "functionsModes", "functionGeneralModes", 
  "identifierRet", "functionMethodsModes", "functionMethodsModesBkp", "methodPerm", 
  "visibilityItems", "methodVisibility", "constructClassMethod", "interfaceMethod", 
  "functionCodeBlock", "functionCodeBlockElements", "functionParams", "functionParamsControl", 
  "functionParamElements", "oopGeneral", "interfaceClass", "interfaceClassDefinition", 
  "interfaceCodeBlock", "abstractClass", "abstractClassDefinition", "abstractCodeBlock", 
  "classDefination", "classCodeBlock", "classModes", "identifierC", "arrayAccessElements", 
  "arrayAccessElementsItems", "accessBlockAr", "arrayIndexAccess", "anonymousFunction", 
  "anFnItems", "functionsModesFn", "generalValue", "objIdentifierA", "objIdentifierB"
};

std::vector<std::string> TParser::_literalNames = {
  "", "'use'", "'var'", "'if'", "'elif'", "'else'", "'for'", "'ret'", "'fn'", 
  "'pub'", "'pro'", "'priv'", "'static'", "'final'", "'interface'", "'abstract'", 
  "'extends'", "'class'", "'implements'", "'new'", "'break'", "'next'", 
  "'->'", "';'", "'='", "'.'", "':'", "'::'", "','", "'['", "']'", "'{'", 
  "'}'", "'('", "')'", "", "", "'!'"
};

std::vector<std::string> TParser::_symbolicNames = {
  "", "Use", "Var", "If", "Elif", "Else", "For", "Ret", "Function", "Pub", 
  "Pro", "Priv", "Static", "Final", "Interface", "Abstract", "Extends", 
  "Class", "Implements", "New", "Break", "Next", "ArrowRight", "End", "Attr", 
  "Point", "TwoPoint", "TwoTwoPoint", "Separator", "OpenArIndex", "CloseArIndex", 
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
       0x3, 0x33, 0x4ea, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 
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
       0x9, 0x23, 0x4, 0x24, 0x9, 0x24, 0x4, 0x25, 0x9, 0x25, 0x4, 0x26, 
       0x9, 0x26, 0x4, 0x27, 0x9, 0x27, 0x4, 0x28, 0x9, 0x28, 0x4, 0x29, 
       0x9, 0x29, 0x4, 0x2a, 0x9, 0x2a, 0x4, 0x2b, 0x9, 0x2b, 0x4, 0x2c, 
       0x9, 0x2c, 0x4, 0x2d, 0x9, 0x2d, 0x4, 0x2e, 0x9, 0x2e, 0x4, 0x2f, 
       0x9, 0x2f, 0x4, 0x30, 0x9, 0x30, 0x4, 0x31, 0x9, 0x31, 0x4, 0x32, 
       0x9, 0x32, 0x4, 0x33, 0x9, 0x33, 0x4, 0x34, 0x9, 0x34, 0x4, 0x35, 
       0x9, 0x35, 0x4, 0x36, 0x9, 0x36, 0x4, 0x37, 0x9, 0x37, 0x4, 0x38, 
       0x9, 0x38, 0x4, 0x39, 0x9, 0x39, 0x4, 0x3a, 0x9, 0x3a, 0x4, 0x3b, 
       0x9, 0x3b, 0x4, 0x3c, 0x9, 0x3c, 0x4, 0x3d, 0x9, 0x3d, 0x4, 0x3e, 
       0x9, 0x3e, 0x4, 0x3f, 0x9, 0x3f, 0x4, 0x40, 0x9, 0x40, 0x4, 0x41, 
       0x9, 0x41, 0x4, 0x42, 0x9, 0x42, 0x4, 0x43, 0x9, 0x43, 0x4, 0x44, 
       0x9, 0x44, 0x4, 0x45, 0x9, 0x45, 0x4, 0x46, 0x9, 0x46, 0x4, 0x47, 
       0x9, 0x47, 0x4, 0x48, 0x9, 0x48, 0x4, 0x49, 0x9, 0x49, 0x4, 0x4a, 
       0x9, 0x4a, 0x4, 0x4b, 0x9, 0x4b, 0x4, 0x4c, 0x9, 0x4c, 0x4, 0x4d, 
       0x9, 0x4d, 0x4, 0x4e, 0x9, 0x4e, 0x4, 0x4f, 0x9, 0x4f, 0x4, 0x50, 
       0x9, 0x50, 0x4, 0x51, 0x9, 0x51, 0x4, 0x52, 0x9, 0x52, 0x4, 0x53, 
       0x9, 0x53, 0x4, 0x54, 0x9, 0x54, 0x4, 0x55, 0x9, 0x55, 0x4, 0x56, 
       0x9, 0x56, 0x4, 0x57, 0x9, 0x57, 0x4, 0x58, 0x9, 0x58, 0x4, 0x59, 
       0x9, 0x59, 0x4, 0x5a, 0x9, 0x5a, 0x4, 0x5b, 0x9, 0x5b, 0x4, 0x5c, 
       0x9, 0x5c, 0x4, 0x5d, 0x9, 0x5d, 0x4, 0x5e, 0x9, 0x5e, 0x4, 0x5f, 
       0x9, 0x5f, 0x4, 0x60, 0x9, 0x60, 0x4, 0x61, 0x9, 0x61, 0x4, 0x62, 
       0x9, 0x62, 0x4, 0x63, 0x9, 0x63, 0x4, 0x64, 0x9, 0x64, 0x4, 0x65, 
       0x9, 0x65, 0x4, 0x66, 0x9, 0x66, 0x4, 0x67, 0x9, 0x67, 0x4, 0x68, 
       0x9, 0x68, 0x4, 0x69, 0x9, 0x69, 0x4, 0x6a, 0x9, 0x6a, 0x4, 0x6b, 
       0x9, 0x6b, 0x3, 0x2, 0x3, 0x2, 0x3, 0x2, 0x3, 0x3, 0x3, 0x3, 0x3, 
       0x3, 0x3, 0x3, 0x3, 0x3, 0x5, 0x3, 0xdf, 0xa, 0x3, 0x3, 0x4, 0x3, 
       0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 
       0x3, 0x4, 0x5, 0x4, 0xea, 0xa, 0x4, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 
       0x5, 0x5, 0xef, 0xa, 0x5, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x7, 
       0x3, 0x7, 0x3, 0x7, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 
       0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x5, 0x9, 0x100, 0xa, 
       0x9, 0x3, 0xa, 0x3, 0xa, 0x3, 0xb, 0x3, 0xb, 0x3, 0xc, 0x3, 0xc, 
       0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 
       0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x5, 0xc, 0x112, 0xa, 0xc, 0x3, 
       0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 
       0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 
       0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 
       0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 
       0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 
       0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 
       0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 
       0x3, 0xd, 0x5, 0xd, 0x143, 0xa, 0xd, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 
       0x3, 0xe, 0x3, 0xe, 0x5, 0xe, 0x14a, 0xa, 0xe, 0x3, 0xf, 0x3, 0xf, 
       0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 
       0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 
       0x5, 0xf, 0x15b, 0xa, 0xf, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 
       0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 
       0x10, 0x3, 0x10, 0x3, 0x10, 0x5, 0x10, 0x169, 0xa, 0x10, 0x3, 0x11, 
       0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x5, 0x11, 
       0x171, 0xa, 0x11, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 
       0x12, 0x5, 0x12, 0x178, 0xa, 0x12, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 
       0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x5, 0x13, 0x180, 0xa, 0x13, 0x3, 
       0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 
       0x14, 0x3, 0x14, 0x3, 0x14, 0x5, 0x14, 0x18b, 0xa, 0x14, 0x3, 0x15, 
       0x3, 0x15, 0x3, 0x15, 0x3, 0x15, 0x3, 0x16, 0x3, 0x16, 0x3, 0x16, 
       0x3, 0x16, 0x5, 0x16, 0x195, 0xa, 0x16, 0x3, 0x17, 0x3, 0x17, 0x3, 
       0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 
       0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 
       0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 
       0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 
       0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 
       0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 
       0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 
       0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 
       0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 
       0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 
       0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 
       0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 
       0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 
       0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 
       0x17, 0x3, 0x17, 0x5, 0x17, 0x1ef, 0xa, 0x17, 0x3, 0x18, 0x3, 0x18, 
       0x3, 0x19, 0x3, 0x19, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1b, 
       0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 
       0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 
       0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x5, 0x1b, 0x208, 0xa, 0x1b, 0x3, 
       0x1c, 0x3, 0x1c, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 
       0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x5, 0x1e, 0x215, 
       0xa, 0x1e, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x20, 0x3, 0x20, 
       0x3, 0x21, 0x3, 0x21, 0x3, 0x22, 0x3, 0x22, 0x3, 0x22, 0x3, 0x22, 
       0x3, 0x22, 0x3, 0x22, 0x5, 0x22, 0x224, 0xa, 0x22, 0x3, 0x23, 0x3, 
       0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 
       0x23, 0x3, 0x23, 0x3, 0x23, 0x5, 0x23, 0x230, 0xa, 0x23, 0x3, 0x24, 
       0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x5, 0x24, 0x236, 0xa, 0x24, 0x3, 
       0x25, 0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 0x3, 
       0x25, 0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 0x5, 0x25, 0x243, 
       0xa, 0x25, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x27, 
       0x3, 0x27, 0x3, 0x27, 0x3, 0x27, 0x5, 0x27, 0x24d, 0xa, 0x27, 0x3, 
       0x28, 0x3, 0x28, 0x3, 0x28, 0x3, 0x28, 0x3, 0x29, 0x3, 0x29, 0x3, 
       0x29, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 
       0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 
       0x2b, 0x5, 0x2b, 0x262, 0xa, 0x2b, 0x3, 0x2c, 0x3, 0x2c, 0x3, 0x2c, 
       0x3, 0x2c, 0x5, 0x2c, 0x268, 0xa, 0x2c, 0x3, 0x2d, 0x3, 0x2d, 0x3, 
       0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x5, 
       0x2d, 0x272, 0xa, 0x2d, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x5, 0x2e, 
       0x277, 0xa, 0x2e, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x5, 0x2f, 0x27c, 
       0xa, 0x2f, 0x3, 0x30, 0x3, 0x30, 0x3, 0x30, 0x3, 0x30, 0x3, 0x30, 
       0x3, 0x30, 0x3, 0x30, 0x3, 0x30, 0x5, 0x30, 0x286, 0xa, 0x30, 0x3, 
       0x31, 0x3, 0x31, 0x3, 0x31, 0x3, 0x31, 0x3, 0x32, 0x3, 0x32, 0x3, 
       0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 
       0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 
       0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 
       0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 
       0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 
       0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 
       0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 
       0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 
       0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 
       0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 
       0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 
       0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 
       0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 
       0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 
       0x32, 0x3, 0x32, 0x3, 0x32, 0x5, 0x32, 0x2e5, 0xa, 0x32, 0x3, 0x33, 
       0x3, 0x33, 0x3, 0x33, 0x3, 0x33, 0x3, 0x34, 0x3, 0x34, 0x5, 0x34, 
       0x2ed, 0xa, 0x34, 0x3, 0x35, 0x3, 0x35, 0x3, 0x36, 0x3, 0x36, 0x3, 
       0x36, 0x3, 0x36, 0x3, 0x36, 0x3, 0x36, 0x3, 0x36, 0x3, 0x36, 0x3, 
       0x36, 0x3, 0x36, 0x3, 0x36, 0x5, 0x36, 0x2fc, 0xa, 0x36, 0x3, 0x37, 
       0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x5, 0x37, 0x302, 0xa, 0x37, 0x3, 
       0x38, 0x3, 0x38, 0x3, 0x38, 0x3, 0x38, 0x3, 0x39, 0x3, 0x39, 0x3, 
       0x39, 0x5, 0x39, 0x30b, 0xa, 0x39, 0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3a, 
       0x5, 0x3a, 0x310, 0xa, 0x3a, 0x3, 0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x3, 
       0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x3, 
       0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x5, 0x3b, 0x320, 
       0xa, 0x3b, 0x3, 0x3c, 0x3, 0x3c, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3e, 
       0x3, 0x3e, 0x3, 0x3f, 0x3, 0x3f, 0x3, 0x3f, 0x3, 0x3f, 0x5, 0x3f, 
       0x32c, 0xa, 0x3f, 0x3, 0x40, 0x3, 0x40, 0x5, 0x40, 0x330, 0xa, 0x40, 
       0x3, 0x41, 0x3, 0x41, 0x5, 0x41, 0x334, 0xa, 0x41, 0x3, 0x42, 0x3, 
       0x42, 0x3, 0x42, 0x3, 0x42, 0x3, 0x42, 0x5, 0x42, 0x33b, 0xa, 0x42, 
       0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x5, 0x43, 0x341, 0xa, 
       0x43, 0x3, 0x44, 0x3, 0x44, 0x3, 0x44, 0x3, 0x44, 0x3, 0x44, 0x3, 
       0x44, 0x3, 0x44, 0x3, 0x44, 0x3, 0x44, 0x3, 0x44, 0x5, 0x44, 0x34d, 
       0xa, 0x44, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 0x46, 
       0x3, 0x46, 0x5, 0x46, 0x355, 0xa, 0x46, 0x3, 0x47, 0x3, 0x47, 0x3, 
       0x47, 0x3, 0x47, 0x3, 0x47, 0x3, 0x47, 0x3, 0x47, 0x3, 0x47, 0x3, 
       0x47, 0x3, 0x47, 0x3, 0x47, 0x3, 0x47, 0x3, 0x47, 0x3, 0x47, 0x3, 
       0x47, 0x3, 0x47, 0x3, 0x47, 0x3, 0x47, 0x3, 0x47, 0x3, 0x47, 0x3, 
       0x47, 0x3, 0x47, 0x3, 0x47, 0x3, 0x47, 0x3, 0x47, 0x3, 0x47, 0x3, 
       0x47, 0x3, 0x47, 0x3, 0x47, 0x3, 0x47, 0x5, 0x47, 0x375, 0xa, 0x47, 
       0x3, 0x48, 0x3, 0x48, 0x3, 0x49, 0x3, 0x49, 0x3, 0x49, 0x3, 0x49, 
       0x3, 0x49, 0x3, 0x49, 0x3, 0x49, 0x3, 0x49, 0x3, 0x49, 0x3, 0x49, 
       0x3, 0x49, 0x5, 0x49, 0x384, 0xa, 0x49, 0x3, 0x49, 0x3, 0x49, 0x3, 
       0x49, 0x3, 0x49, 0x3, 0x49, 0x3, 0x49, 0x3, 0x49, 0x3, 0x49, 0x3, 
       0x49, 0x3, 0x49, 0x3, 0x49, 0x3, 0x49, 0x3, 0x49, 0x3, 0x49, 0x5, 
       0x49, 0x394, 0xa, 0x49, 0x5, 0x49, 0x396, 0xa, 0x49, 0x3, 0x4a, 0x3, 
       0x4a, 0x3, 0x4b, 0x3, 0x4b, 0x3, 0x4b, 0x3, 0x4c, 0x3, 0x4c, 0x3, 
       0x4c, 0x3, 0x4c, 0x3, 0x4c, 0x3, 0x4c, 0x3, 0x4c, 0x3, 0x4c, 0x3, 
       0x4c, 0x3, 0x4c, 0x3, 0x4c, 0x3, 0x4c, 0x3, 0x4c, 0x3, 0x4c, 0x3, 
       0x4c, 0x3, 0x4c, 0x3, 0x4c, 0x3, 0x4c, 0x3, 0x4c, 0x3, 0x4c, 0x3, 
       0x4c, 0x3, 0x4c, 0x3, 0x4c, 0x5, 0x4c, 0x3b4, 0xa, 0x4c, 0x3, 0x4d, 
       0x3, 0x4d, 0x3, 0x4e, 0x3, 0x4e, 0x3, 0x4f, 0x3, 0x4f, 0x3, 0x4f, 
       0x3, 0x4f, 0x5, 0x4f, 0x3be, 0xa, 0x4f, 0x3, 0x50, 0x3, 0x50, 0x3, 
       0x50, 0x3, 0x50, 0x3, 0x50, 0x3, 0x50, 0x3, 0x50, 0x3, 0x50, 0x5, 
       0x50, 0x3c8, 0xa, 0x50, 0x3, 0x51, 0x3, 0x51, 0x5, 0x51, 0x3cc, 0xa, 
       0x51, 0x3, 0x52, 0x3, 0x52, 0x3, 0x53, 0x3, 0x53, 0x3, 0x53, 0x3, 
       0x53, 0x5, 0x53, 0x3d4, 0xa, 0x53, 0x3, 0x54, 0x3, 0x54, 0x3, 0x55, 
       0x3, 0x55, 0x3, 0x55, 0x3, 0x55, 0x3, 0x55, 0x5, 0x55, 0x3dd, 0xa, 
       0x55, 0x3, 0x56, 0x3, 0x56, 0x3, 0x56, 0x3, 0x57, 0x3, 0x57, 0x3, 
       0x57, 0x5, 0x57, 0x3e5, 0xa, 0x57, 0x3, 0x58, 0x3, 0x58, 0x3, 0x59, 
       0x3, 0x59, 0x3, 0x59, 0x3, 0x59, 0x3, 0x59, 0x3, 0x59, 0x3, 0x59, 
       0x3, 0x59, 0x3, 0x59, 0x3, 0x59, 0x3, 0x59, 0x3, 0x59, 0x3, 0x59, 
       0x3, 0x59, 0x3, 0x59, 0x3, 0x59, 0x3, 0x59, 0x3, 0x59, 0x3, 0x59, 
       0x3, 0x59, 0x3, 0x59, 0x3, 0x59, 0x3, 0x59, 0x3, 0x59, 0x3, 0x59, 
       0x5, 0x59, 0x402, 0xa, 0x59, 0x3, 0x5a, 0x3, 0x5a, 0x3, 0x5b, 0x3, 
       0x5b, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 
       0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 
       0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 
       0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 
       0x5c, 0x3, 0x5c, 0x5, 0x5c, 0x421, 0xa, 0x5c, 0x3, 0x5d, 0x3, 0x5d, 
       0x3, 0x5e, 0x3, 0x5e, 0x3, 0x5e, 0x3, 0x5e, 0x3, 0x5e, 0x3, 0x5e, 
       0x3, 0x5e, 0x3, 0x5e, 0x3, 0x5e, 0x5, 0x5e, 0x42e, 0xa, 0x5e, 0x3, 
       0x5f, 0x3, 0x5f, 0x3, 0x60, 0x3, 0x60, 0x3, 0x60, 0x3, 0x60, 0x3, 
       0x60, 0x3, 0x60, 0x3, 0x60, 0x3, 0x60, 0x3, 0x60, 0x3, 0x60, 0x3, 
       0x60, 0x3, 0x60, 0x3, 0x60, 0x3, 0x60, 0x3, 0x60, 0x3, 0x60, 0x3, 
       0x60, 0x3, 0x60, 0x3, 0x60, 0x3, 0x60, 0x3, 0x60, 0x3, 0x60, 0x3, 
       0x60, 0x3, 0x60, 0x3, 0x60, 0x3, 0x60, 0x3, 0x60, 0x3, 0x60, 0x3, 
       0x60, 0x3, 0x60, 0x3, 0x60, 0x3, 0x60, 0x3, 0x60, 0x3, 0x60, 0x3, 
       0x60, 0x3, 0x60, 0x3, 0x60, 0x3, 0x60, 0x5, 0x60, 0x458, 0xa, 0x60, 
       0x3, 0x61, 0x3, 0x61, 0x3, 0x62, 0x3, 0x62, 0x3, 0x62, 0x3, 0x62, 
       0x5, 0x62, 0x460, 0xa, 0x62, 0x3, 0x63, 0x3, 0x63, 0x3, 0x63, 0x3, 
       0x63, 0x3, 0x63, 0x3, 0x63, 0x3, 0x63, 0x3, 0x63, 0x3, 0x63, 0x3, 
       0x63, 0x3, 0x63, 0x3, 0x63, 0x3, 0x63, 0x3, 0x63, 0x3, 0x63, 0x3, 
       0x63, 0x3, 0x63, 0x3, 0x63, 0x3, 0x63, 0x3, 0x63, 0x3, 0x63, 0x3, 
       0x63, 0x3, 0x63, 0x3, 0x63, 0x3, 0x63, 0x3, 0x63, 0x3, 0x63, 0x3, 
       0x63, 0x3, 0x63, 0x3, 0x63, 0x3, 0x63, 0x3, 0x63, 0x3, 0x63, 0x3, 
       0x63, 0x5, 0x63, 0x484, 0xa, 0x63, 0x3, 0x64, 0x3, 0x64, 0x3, 0x64, 
       0x3, 0x64, 0x3, 0x64, 0x3, 0x64, 0x3, 0x64, 0x3, 0x64, 0x3, 0x64, 
       0x5, 0x64, 0x48f, 0xa, 0x64, 0x3, 0x65, 0x3, 0x65, 0x3, 0x66, 0x3, 
       0x66, 0x3, 0x66, 0x3, 0x66, 0x3, 0x66, 0x3, 0x66, 0x3, 0x66, 0x3, 
       0x66, 0x3, 0x66, 0x3, 0x66, 0x3, 0x66, 0x3, 0x66, 0x3, 0x66, 0x3, 
       0x66, 0x3, 0x66, 0x3, 0x66, 0x3, 0x66, 0x5, 0x66, 0x4a4, 0xa, 0x66, 
       0x3, 0x67, 0x3, 0x67, 0x3, 0x67, 0x3, 0x67, 0x3, 0x67, 0x3, 0x67, 
       0x3, 0x67, 0x3, 0x67, 0x3, 0x67, 0x5, 0x67, 0x4af, 0xa, 0x67, 0x3, 
       0x68, 0x3, 0x68, 0x3, 0x68, 0x3, 0x68, 0x3, 0x68, 0x3, 0x68, 0x3, 
       0x68, 0x3, 0x68, 0x3, 0x68, 0x5, 0x68, 0x4ba, 0xa, 0x68, 0x3, 0x68, 
       0x3, 0x68, 0x3, 0x68, 0x3, 0x68, 0x3, 0x68, 0x3, 0x68, 0x3, 0x68, 
       0x3, 0x68, 0x3, 0x68, 0x3, 0x68, 0x3, 0x68, 0x3, 0x68, 0x5, 0x68, 
       0x4c8, 0xa, 0x68, 0x5, 0x68, 0x4ca, 0xa, 0x68, 0x3, 0x69, 0x3, 0x69, 
       0x3, 0x69, 0x3, 0x69, 0x3, 0x69, 0x3, 0x69, 0x3, 0x69, 0x3, 0x69, 
       0x3, 0x69, 0x3, 0x69, 0x3, 0x69, 0x3, 0x69, 0x3, 0x69, 0x3, 0x69, 
       0x3, 0x69, 0x3, 0x69, 0x3, 0x69, 0x3, 0x69, 0x3, 0x69, 0x3, 0x69, 
       0x3, 0x69, 0x3, 0x69, 0x3, 0x69, 0x3, 0x69, 0x5, 0x69, 0x4e4, 0xa, 
       0x69, 0x3, 0x6a, 0x3, 0x6a, 0x3, 0x6b, 0x3, 0x6b, 0x3, 0x6b, 0x2, 
       0x2, 0x6c, 0x2, 0x4, 0x6, 0x8, 0xa, 0xc, 0xe, 0x10, 0x12, 0x14, 0x16, 
       0x18, 0x1a, 0x1c, 0x1e, 0x20, 0x22, 0x24, 0x26, 0x28, 0x2a, 0x2c, 
       0x2e, 0x30, 0x32, 0x34, 0x36, 0x38, 0x3a, 0x3c, 0x3e, 0x40, 0x42, 
       0x44, 0x46, 0x48, 0x4a, 0x4c, 0x4e, 0x50, 0x52, 0x54, 0x56, 0x58, 
       0x5a, 0x5c, 0x5e, 0x60, 0x62, 0x64, 0x66, 0x68, 0x6a, 0x6c, 0x6e, 
       0x70, 0x72, 0x74, 0x76, 0x78, 0x7a, 0x7c, 0x7e, 0x80, 0x82, 0x84, 
       0x86, 0x88, 0x8a, 0x8c, 0x8e, 0x90, 0x92, 0x94, 0x96, 0x98, 0x9a, 
       0x9c, 0x9e, 0xa0, 0xa2, 0xa4, 0xa6, 0xa8, 0xaa, 0xac, 0xae, 0xb0, 
       0xb2, 0xb4, 0xb6, 0xb8, 0xba, 0xbc, 0xbe, 0xc0, 0xc2, 0xc4, 0xc6, 
       0xc8, 0xca, 0xcc, 0xce, 0xd0, 0xd2, 0xd4, 0x2, 0x6, 0x4, 0x2, 0x1a, 
       0x1a, 0x26, 0x26, 0x3, 0x2, 0x25, 0x26, 0x3, 0x2, 0xb, 0xd, 0x3, 
       0x2, 0xb, 0xf, 0x2, 0x55a, 0x2, 0xd6, 0x3, 0x2, 0x2, 0x2, 0x4, 0xde, 
       0x3, 0x2, 0x2, 0x2, 0x6, 0xe9, 0x3, 0x2, 0x2, 0x2, 0x8, 0xee, 0x3, 
       0x2, 0x2, 0x2, 0xa, 0xf0, 0x3, 0x2, 0x2, 0x2, 0xc, 0xf3, 0x3, 0x2, 
       0x2, 0x2, 0xe, 0xf6, 0x3, 0x2, 0x2, 0x2, 0x10, 0xff, 0x3, 0x2, 0x2, 
       0x2, 0x12, 0x101, 0x3, 0x2, 0x2, 0x2, 0x14, 0x103, 0x3, 0x2, 0x2, 
       0x2, 0x16, 0x111, 0x3, 0x2, 0x2, 0x2, 0x18, 0x142, 0x3, 0x2, 0x2, 
       0x2, 0x1a, 0x149, 0x3, 0x2, 0x2, 0x2, 0x1c, 0x15a, 0x3, 0x2, 0x2, 
       0x2, 0x1e, 0x168, 0x3, 0x2, 0x2, 0x2, 0x20, 0x170, 0x3, 0x2, 0x2, 
       0x2, 0x22, 0x177, 0x3, 0x2, 0x2, 0x2, 0x24, 0x17f, 0x3, 0x2, 0x2, 
       0x2, 0x26, 0x18a, 0x3, 0x2, 0x2, 0x2, 0x28, 0x18c, 0x3, 0x2, 0x2, 
       0x2, 0x2a, 0x194, 0x3, 0x2, 0x2, 0x2, 0x2c, 0x1ee, 0x3, 0x2, 0x2, 
       0x2, 0x2e, 0x1f0, 0x3, 0x2, 0x2, 0x2, 0x30, 0x1f2, 0x3, 0x2, 0x2, 
       0x2, 0x32, 0x1f4, 0x3, 0x2, 0x2, 0x2, 0x34, 0x207, 0x3, 0x2, 0x2, 
       0x2, 0x36, 0x209, 0x3, 0x2, 0x2, 0x2, 0x38, 0x20b, 0x3, 0x2, 0x2, 
       0x2, 0x3a, 0x214, 0x3, 0x2, 0x2, 0x2, 0x3c, 0x216, 0x3, 0x2, 0x2, 
       0x2, 0x3e, 0x219, 0x3, 0x2, 0x2, 0x2, 0x40, 0x21b, 0x3, 0x2, 0x2, 
       0x2, 0x42, 0x223, 0x3, 0x2, 0x2, 0x2, 0x44, 0x22f, 0x3, 0x2, 0x2, 
       0x2, 0x46, 0x235, 0x3, 0x2, 0x2, 0x2, 0x48, 0x242, 0x3, 0x2, 0x2, 
       0x2, 0x4a, 0x244, 0x3, 0x2, 0x2, 0x2, 0x4c, 0x24c, 0x3, 0x2, 0x2, 
       0x2, 0x4e, 0x24e, 0x3, 0x2, 0x2, 0x2, 0x50, 0x252, 0x3, 0x2, 0x2, 
       0x2, 0x52, 0x255, 0x3, 0x2, 0x2, 0x2, 0x54, 0x261, 0x3, 0x2, 0x2, 
       0x2, 0x56, 0x267, 0x3, 0x2, 0x2, 0x2, 0x58, 0x271, 0x3, 0x2, 0x2, 
       0x2, 0x5a, 0x276, 0x3, 0x2, 0x2, 0x2, 0x5c, 0x27b, 0x3, 0x2, 0x2, 
       0x2, 0x5e, 0x285, 0x3, 0x2, 0x2, 0x2, 0x60, 0x287, 0x3, 0x2, 0x2, 
       0x2, 0x62, 0x2e4, 0x3, 0x2, 0x2, 0x2, 0x64, 0x2e6, 0x3, 0x2, 0x2, 
       0x2, 0x66, 0x2ec, 0x3, 0x2, 0x2, 0x2, 0x68, 0x2ee, 0x3, 0x2, 0x2, 
       0x2, 0x6a, 0x2fb, 0x3, 0x2, 0x2, 0x2, 0x6c, 0x301, 0x3, 0x2, 0x2, 
       0x2, 0x6e, 0x303, 0x3, 0x2, 0x2, 0x2, 0x70, 0x30a, 0x3, 0x2, 0x2, 
       0x2, 0x72, 0x30f, 0x3, 0x2, 0x2, 0x2, 0x74, 0x31f, 0x3, 0x2, 0x2, 
       0x2, 0x76, 0x321, 0x3, 0x2, 0x2, 0x2, 0x78, 0x323, 0x3, 0x2, 0x2, 
       0x2, 0x7a, 0x325, 0x3, 0x2, 0x2, 0x2, 0x7c, 0x32b, 0x3, 0x2, 0x2, 
       0x2, 0x7e, 0x32f, 0x3, 0x2, 0x2, 0x2, 0x80, 0x333, 0x3, 0x2, 0x2, 
       0x2, 0x82, 0x33a, 0x3, 0x2, 0x2, 0x2, 0x84, 0x340, 0x3, 0x2, 0x2, 
       0x2, 0x86, 0x34c, 0x3, 0x2, 0x2, 0x2, 0x88, 0x34e, 0x3, 0x2, 0x2, 
       0x2, 0x8a, 0x354, 0x3, 0x2, 0x2, 0x2, 0x8c, 0x374, 0x3, 0x2, 0x2, 
       0x2, 0x8e, 0x376, 0x3, 0x2, 0x2, 0x2, 0x90, 0x395, 0x3, 0x2, 0x2, 
       0x2, 0x92, 0x397, 0x3, 0x2, 0x2, 0x2, 0x94, 0x399, 0x3, 0x2, 0x2, 
       0x2, 0x96, 0x3b3, 0x3, 0x2, 0x2, 0x2, 0x98, 0x3b5, 0x3, 0x2, 0x2, 
       0x2, 0x9a, 0x3b7, 0x3, 0x2, 0x2, 0x2, 0x9c, 0x3bd, 0x3, 0x2, 0x2, 
       0x2, 0x9e, 0x3c7, 0x3, 0x2, 0x2, 0x2, 0xa0, 0x3cb, 0x3, 0x2, 0x2, 
       0x2, 0xa2, 0x3cd, 0x3, 0x2, 0x2, 0x2, 0xa4, 0x3d3, 0x3, 0x2, 0x2, 
       0x2, 0xa6, 0x3d5, 0x3, 0x2, 0x2, 0x2, 0xa8, 0x3dc, 0x3, 0x2, 0x2, 
       0x2, 0xaa, 0x3de, 0x3, 0x2, 0x2, 0x2, 0xac, 0x3e4, 0x3, 0x2, 0x2, 
       0x2, 0xae, 0x3e6, 0x3, 0x2, 0x2, 0x2, 0xb0, 0x401, 0x3, 0x2, 0x2, 
       0x2, 0xb2, 0x403, 0x3, 0x2, 0x2, 0x2, 0xb4, 0x405, 0x3, 0x2, 0x2, 
       0x2, 0xb6, 0x420, 0x3, 0x2, 0x2, 0x2, 0xb8, 0x422, 0x3, 0x2, 0x2, 
       0x2, 0xba, 0x42d, 0x3, 0x2, 0x2, 0x2, 0xbc, 0x42f, 0x3, 0x2, 0x2, 
       0x2, 0xbe, 0x457, 0x3, 0x2, 0x2, 0x2, 0xc0, 0x459, 0x3, 0x2, 0x2, 
       0x2, 0xc2, 0x45f, 0x3, 0x2, 0x2, 0x2, 0xc4, 0x483, 0x3, 0x2, 0x2, 
       0x2, 0xc6, 0x48e, 0x3, 0x2, 0x2, 0x2, 0xc8, 0x490, 0x3, 0x2, 0x2, 
       0x2, 0xca, 0x4a3, 0x3, 0x2, 0x2, 0x2, 0xcc, 0x4ae, 0x3, 0x2, 0x2, 
       0x2, 0xce, 0x4c9, 0x3, 0x2, 0x2, 0x2, 0xd0, 0x4e3, 0x3, 0x2, 0x2, 
       0x2, 0xd2, 0x4e5, 0x3, 0x2, 0x2, 0x2, 0xd4, 0x4e7, 0x3, 0x2, 0x2, 
       0x2, 0xd6, 0xd7, 0x5, 0x4, 0x3, 0x2, 0xd7, 0xd8, 0x7, 0x2, 0x2, 0x3, 
       0xd8, 0x3, 0x3, 0x2, 0x2, 0x2, 0xd9, 0xdf, 0x5, 0x6, 0x4, 0x2, 0xda, 
       0xdb, 0x5, 0x6, 0x4, 0x2, 0xdb, 0xdc, 0x5, 0x4, 0x3, 0x2, 0xdc, 0xdf, 
       0x3, 0x2, 0x2, 0x2, 0xdd, 0xdf, 0x3, 0x2, 0x2, 0x2, 0xde, 0xd9, 0x3, 
       0x2, 0x2, 0x2, 0xde, 0xda, 0x3, 0x2, 0x2, 0x2, 0xde, 0xdd, 0x3, 0x2, 
       0x2, 0x2, 0xdf, 0x5, 0x3, 0x2, 0x2, 0x2, 0xe0, 0xea, 0x5, 0x8, 0x5, 
       0x2, 0xe1, 0xea, 0x5, 0xe, 0x8, 0x2, 0xe2, 0xea, 0x5, 0x14, 0xb, 
       0x2, 0xe3, 0xea, 0x5, 0x32, 0x1a, 0x2, 0xe4, 0xea, 0x5, 0x46, 0x24, 
       0x2, 0xe5, 0xea, 0x5, 0x6c, 0x37, 0x2, 0xe6, 0xea, 0x5, 0x8c, 0x47, 
       0x2, 0xe7, 0xea, 0x5, 0x88, 0x45, 0x2, 0xe8, 0xea, 0x5, 0xac, 0x57, 
       0x2, 0xe9, 0xe0, 0x3, 0x2, 0x2, 0x2, 0xe9, 0xe1, 0x3, 0x2, 0x2, 0x2, 
       0xe9, 0xe2, 0x3, 0x2, 0x2, 0x2, 0xe9, 0xe3, 0x3, 0x2, 0x2, 0x2, 0xe9, 
       0xe4, 0x3, 0x2, 0x2, 0x2, 0xe9, 0xe5, 0x3, 0x2, 0x2, 0x2, 0xe9, 0xe6, 
       0x3, 0x2, 0x2, 0x2, 0xe9, 0xe7, 0x3, 0x2, 0x2, 0x2, 0xe9, 0xe8, 0x3, 
       0x2, 0x2, 0x2, 0xea, 0x7, 0x3, 0x2, 0x2, 0x2, 0xeb, 0xef, 0x7, 0x30, 
       0x2, 0x2, 0xec, 0xef, 0x5, 0xa, 0x6, 0x2, 0xed, 0xef, 0x5, 0xc, 0x7, 
       0x2, 0xee, 0xeb, 0x3, 0x2, 0x2, 0x2, 0xee, 0xec, 0x3, 0x2, 0x2, 0x2, 
       0xee, 0xed, 0x3, 0x2, 0x2, 0x2, 0xef, 0x9, 0x3, 0x2, 0x2, 0x2, 0xf0, 
       0xf1, 0x7, 0x16, 0x2, 0x2, 0xf1, 0xf2, 0x7, 0x19, 0x2, 0x2, 0xf2, 
       0xb, 0x3, 0x2, 0x2, 0x2, 0xf3, 0xf4, 0x7, 0x17, 0x2, 0x2, 0xf4, 0xf5, 
       0x7, 0x19, 0x2, 0x2, 0xf5, 0xd, 0x3, 0x2, 0x2, 0x2, 0xf6, 0xf7, 0x7, 
       0x3, 0x2, 0x2, 0xf7, 0xf8, 0x5, 0x10, 0x9, 0x2, 0xf8, 0xf9, 0x7, 
       0x19, 0x2, 0x2, 0xf9, 0xf, 0x3, 0x2, 0x2, 0x2, 0xfa, 0x100, 0x5, 
       0x12, 0xa, 0x2, 0xfb, 0xfc, 0x5, 0x12, 0xa, 0x2, 0xfc, 0xfd, 0x7, 
       0x1e, 0x2, 0x2, 0xfd, 0xfe, 0x5, 0x10, 0x9, 0x2, 0xfe, 0x100, 0x3, 
       0x2, 0x2, 0x2, 0xff, 0xfa, 0x3, 0x2, 0x2, 0x2, 0xff, 0xfb, 0x3, 0x2, 
       0x2, 0x2, 0x100, 0x11, 0x3, 0x2, 0x2, 0x2, 0x101, 0x102, 0x7, 0x2c, 
       0x2, 0x2, 0x102, 0x13, 0x3, 0x2, 0x2, 0x2, 0x103, 0x104, 0x5, 0x16, 
       0xc, 0x2, 0x104, 0x15, 0x3, 0x2, 0x2, 0x2, 0x105, 0x106, 0x7, 0x4, 
       0x2, 0x2, 0x106, 0x107, 0x5, 0x1a, 0xe, 0x2, 0x107, 0x108, 0x7, 0x19, 
       0x2, 0x2, 0x108, 0x112, 0x3, 0x2, 0x2, 0x2, 0x109, 0x10a, 0x5, 0x9c, 
       0x4f, 0x2, 0x10a, 0x10b, 0x7, 0x4, 0x2, 0x2, 0x10b, 0x10c, 0x5, 0x1a, 
       0xe, 0x2, 0x10c, 0x10d, 0x7, 0x19, 0x2, 0x2, 0x10d, 0x112, 0x3, 0x2, 
       0x2, 0x2, 0x10e, 0x10f, 0x5, 0x1a, 0xe, 0x2, 0x10f, 0x110, 0x7, 0x19, 
       0x2, 0x2, 0x110, 0x112, 0x3, 0x2, 0x2, 0x2, 0x111, 0x105, 0x3, 0x2, 
       0x2, 0x2, 0x111, 0x109, 0x3, 0x2, 0x2, 0x2, 0x111, 0x10e, 0x3, 0x2, 
       0x2, 0x2, 0x112, 0x17, 0x3, 0x2, 0x2, 0x2, 0x113, 0x114, 0x7, 0x4, 
       0x2, 0x2, 0x114, 0x115, 0x5, 0x1a, 0xe, 0x2, 0x115, 0x116, 0x7, 0x19, 
       0x2, 0x2, 0x116, 0x143, 0x3, 0x2, 0x2, 0x2, 0x117, 0x118, 0x5, 0x98, 
       0x4d, 0x2, 0x118, 0x119, 0x7, 0x4, 0x2, 0x2, 0x119, 0x11a, 0x5, 0x1a, 
       0xe, 0x2, 0x11a, 0x11b, 0x7, 0x19, 0x2, 0x2, 0x11b, 0x143, 0x3, 0x2, 
       0x2, 0x2, 0x11c, 0x11d, 0x7, 0xe, 0x2, 0x2, 0x11d, 0x11e, 0x7, 0x4, 
       0x2, 0x2, 0x11e, 0x11f, 0x5, 0x1a, 0xe, 0x2, 0x11f, 0x120, 0x7, 0x19, 
       0x2, 0x2, 0x120, 0x143, 0x3, 0x2, 0x2, 0x2, 0x121, 0x122, 0x5, 0x98, 
       0x4d, 0x2, 0x122, 0x123, 0x7, 0xe, 0x2, 0x2, 0x123, 0x124, 0x7, 0x4, 
       0x2, 0x2, 0x124, 0x125, 0x5, 0x1a, 0xe, 0x2, 0x125, 0x126, 0x7, 0x19, 
       0x2, 0x2, 0x126, 0x143, 0x3, 0x2, 0x2, 0x2, 0x127, 0x128, 0x7, 0xf, 
       0x2, 0x2, 0x128, 0x129, 0x5, 0x98, 0x4d, 0x2, 0x129, 0x12a, 0x7, 
       0xe, 0x2, 0x2, 0x12a, 0x12b, 0x7, 0x4, 0x2, 0x2, 0x12b, 0x12c, 0x5, 
       0x1a, 0xe, 0x2, 0x12c, 0x12d, 0x7, 0x19, 0x2, 0x2, 0x12d, 0x143, 
       0x3, 0x2, 0x2, 0x2, 0x12e, 0x12f, 0x7, 0xf, 0x2, 0x2, 0x12f, 0x130, 
       0x5, 0x98, 0x4d, 0x2, 0x130, 0x131, 0x7, 0x4, 0x2, 0x2, 0x131, 0x132, 
       0x5, 0x1a, 0xe, 0x2, 0x132, 0x133, 0x7, 0x19, 0x2, 0x2, 0x133, 0x143, 
       0x3, 0x2, 0x2, 0x2, 0x134, 0x135, 0x7, 0xf, 0x2, 0x2, 0x135, 0x136, 
       0x7, 0x4, 0x2, 0x2, 0x136, 0x137, 0x5, 0x1a, 0xe, 0x2, 0x137, 0x138, 
       0x7, 0x19, 0x2, 0x2, 0x138, 0x143, 0x3, 0x2, 0x2, 0x2, 0x139, 0x13a, 
       0x7, 0xf, 0x2, 0x2, 0x13a, 0x13b, 0x7, 0xe, 0x2, 0x2, 0x13b, 0x13c, 
       0x7, 0x4, 0x2, 0x2, 0x13c, 0x13d, 0x5, 0x1a, 0xe, 0x2, 0x13d, 0x13e, 
       0x7, 0x19, 0x2, 0x2, 0x13e, 0x143, 0x3, 0x2, 0x2, 0x2, 0x13f, 0x140, 
       0x5, 0x1a, 0xe, 0x2, 0x140, 0x141, 0x7, 0x19, 0x2, 0x2, 0x141, 0x143, 
       0x3, 0x2, 0x2, 0x2, 0x142, 0x113, 0x3, 0x2, 0x2, 0x2, 0x142, 0x117, 
       0x3, 0x2, 0x2, 0x2, 0x142, 0x11c, 0x3, 0x2, 0x2, 0x2, 0x142, 0x121, 
       0x3, 0x2, 0x2, 0x2, 0x142, 0x127, 0x3, 0x2, 0x2, 0x2, 0x142, 0x12e, 
       0x3, 0x2, 0x2, 0x2, 0x142, 0x134, 0x3, 0x2, 0x2, 0x2, 0x142, 0x139, 
       0x3, 0x2, 0x2, 0x2, 0x142, 0x13f, 0x3, 0x2, 0x2, 0x2, 0x143, 0x19, 
       0x3, 0x2, 0x2, 0x2, 0x144, 0x14a, 0x5, 0x1c, 0xf, 0x2, 0x145, 0x146, 
       0x5, 0x1c, 0xf, 0x2, 0x146, 0x147, 0x7, 0x1e, 0x2, 0x2, 0x147, 0x148, 
       0x5, 0x1a, 0xe, 0x2, 0x148, 0x14a, 0x3, 0x2, 0x2, 0x2, 0x149, 0x144, 
       0x3, 0x2, 0x2, 0x2, 0x149, 0x145, 0x3, 0x2, 0x2, 0x2, 0x14a, 0x1b, 
       0x3, 0x2, 0x2, 0x2, 0x14b, 0x14c, 0x7, 0x29, 0x2, 0x2, 0x14c, 0x15b, 
       0x5, 0x1e, 0x10, 0x2, 0x14d, 0x14e, 0x5, 0xd2, 0x6a, 0x2, 0x14e, 
       0x14f, 0x7, 0x1b, 0x2, 0x2, 0x14f, 0x150, 0x5, 0xd4, 0x6b, 0x2, 0x150, 
       0x151, 0x5, 0x1e, 0x10, 0x2, 0x151, 0x15b, 0x3, 0x2, 0x2, 0x2, 0x152, 
       0x153, 0x5, 0xd2, 0x6a, 0x2, 0x153, 0x154, 0x7, 0x1d, 0x2, 0x2, 0x154, 
       0x155, 0x5, 0xd4, 0x6b, 0x2, 0x155, 0x156, 0x5, 0x1e, 0x10, 0x2, 
       0x156, 0x15b, 0x3, 0x2, 0x2, 0x2, 0x157, 0x158, 0x5, 0xc2, 0x62, 
       0x2, 0x158, 0x159, 0x5, 0x1e, 0x10, 0x2, 0x159, 0x15b, 0x3, 0x2, 
       0x2, 0x2, 0x15a, 0x14b, 0x3, 0x2, 0x2, 0x2, 0x15a, 0x14d, 0x3, 0x2, 
       0x2, 0x2, 0x15a, 0x152, 0x3, 0x2, 0x2, 0x2, 0x15a, 0x157, 0x3, 0x2, 
       0x2, 0x2, 0x15b, 0x1d, 0x3, 0x2, 0x2, 0x2, 0x15c, 0x15d, 0x9, 0x2, 
       0x2, 0x2, 0x15d, 0x169, 0x5, 0xd0, 0x69, 0x2, 0x15e, 0x15f, 0x7, 
       0x2b, 0x2, 0x2, 0x15f, 0x160, 0x9, 0x2, 0x2, 0x2, 0x160, 0x169, 0x5, 
       0xd0, 0x69, 0x2, 0x161, 0x162, 0x9, 0x2, 0x2, 0x2, 0x162, 0x163, 
       0x7, 0x15, 0x2, 0x2, 0x163, 0x169, 0x5, 0xd0, 0x69, 0x2, 0x164, 0x165, 
       0x7, 0x2b, 0x2, 0x2, 0x165, 0x166, 0x9, 0x2, 0x2, 0x2, 0x166, 0x167, 
       0x7, 0x15, 0x2, 0x2, 0x167, 0x169, 0x5, 0xd0, 0x69, 0x2, 0x168, 0x15c, 
       0x3, 0x2, 0x2, 0x2, 0x168, 0x15e, 0x3, 0x2, 0x2, 0x2, 0x168, 0x161, 
       0x3, 0x2, 0x2, 0x2, 0x168, 0x164, 0x3, 0x2, 0x2, 0x2, 0x169, 0x1f, 
       0x3, 0x2, 0x2, 0x2, 0x16a, 0x16b, 0x7, 0x1f, 0x2, 0x2, 0x16b, 0x171, 
       0x7, 0x20, 0x2, 0x2, 0x16c, 0x16d, 0x7, 0x1f, 0x2, 0x2, 0x16d, 0x16e, 
       0x5, 0x22, 0x12, 0x2, 0x16e, 0x16f, 0x7, 0x20, 0x2, 0x2, 0x16f, 0x171, 
       0x3, 0x2, 0x2, 0x2, 0x170, 0x16a, 0x3, 0x2, 0x2, 0x2, 0x170, 0x16c, 
       0x3, 0x2, 0x2, 0x2, 0x171, 0x21, 0x3, 0x2, 0x2, 0x2, 0x172, 0x178, 
       0x5, 0xd0, 0x69, 0x2, 0x173, 0x174, 0x5, 0xd0, 0x69, 0x2, 0x174, 
       0x175, 0x7, 0x1e, 0x2, 0x2, 0x175, 0x176, 0x5, 0x22, 0x12, 0x2, 0x176, 
       0x178, 0x3, 0x2, 0x2, 0x2, 0x177, 0x172, 0x3, 0x2, 0x2, 0x2, 0x177, 
       0x173, 0x3, 0x2, 0x2, 0x2, 0x178, 0x23, 0x3, 0x2, 0x2, 0x2, 0x179, 
       0x17a, 0x7, 0x21, 0x2, 0x2, 0x17a, 0x180, 0x7, 0x22, 0x2, 0x2, 0x17b, 
       0x17c, 0x7, 0x21, 0x2, 0x2, 0x17c, 0x17d, 0x5, 0x26, 0x14, 0x2, 0x17d, 
       0x17e, 0x7, 0x22, 0x2, 0x2, 0x17e, 0x180, 0x3, 0x2, 0x2, 0x2, 0x17f, 
       0x179, 0x3, 0x2, 0x2, 0x2, 0x17f, 0x17b, 0x3, 0x2, 0x2, 0x2, 0x180, 
       0x25, 0x3, 0x2, 0x2, 0x2, 0x181, 0x182, 0x7, 0x29, 0x2, 0x2, 0x182, 
       0x183, 0x7, 0x1c, 0x2, 0x2, 0x183, 0x18b, 0x5, 0xd0, 0x69, 0x2, 0x184, 
       0x185, 0x7, 0x29, 0x2, 0x2, 0x185, 0x186, 0x7, 0x1c, 0x2, 0x2, 0x186, 
       0x187, 0x5, 0xd0, 0x69, 0x2, 0x187, 0x188, 0x7, 0x1e, 0x2, 0x2, 0x188, 
       0x189, 0x5, 0x26, 0x14, 0x2, 0x189, 0x18b, 0x3, 0x2, 0x2, 0x2, 0x18a, 
       0x181, 0x3, 0x2, 0x2, 0x2, 0x18a, 0x184, 0x3, 0x2, 0x2, 0x2, 0x18b, 
       0x27, 0x3, 0x2, 0x2, 0x2, 0x18c, 0x18d, 0x7, 0x23, 0x2, 0x2, 0x18d, 
       0x18e, 0x5, 0x2a, 0x16, 0x2, 0x18e, 0x18f, 0x7, 0x24, 0x2, 0x2, 0x18f, 
       0x29, 0x3, 0x2, 0x2, 0x2, 0x190, 0x195, 0x5, 0x2c, 0x17, 0x2, 0x191, 
       0x192, 0x5, 0x2c, 0x17, 0x2, 0x192, 0x193, 0x5, 0x2a, 0x16, 0x2, 
       0x193, 0x195, 0x3, 0x2, 0x2, 0x2, 0x194, 0x190, 0x3, 0x2, 0x2, 0x2, 
       0x194, 0x191, 0x3, 0x2, 0x2, 0x2, 0x195, 0x2b, 0x3, 0x2, 0x2, 0x2, 
       0x196, 0x1ef, 0x5, 0x34, 0x1b, 0x2, 0x197, 0x198, 0x5, 0x34, 0x1b, 
       0x2, 0x198, 0x199, 0x7, 0x25, 0x2, 0x2, 0x199, 0x1ef, 0x3, 0x2, 0x2, 
       0x2, 0x19a, 0x19b, 0x5, 0x34, 0x1b, 0x2, 0x19b, 0x19c, 0x7, 0x2b, 
       0x2, 0x2, 0x19c, 0x1ef, 0x3, 0x2, 0x2, 0x2, 0x19d, 0x19e, 0x5, 0x34, 
       0x1b, 0x2, 0x19e, 0x19f, 0x7, 0x2b, 0x2, 0x2, 0x19f, 0x1a0, 0x7, 
       0x25, 0x2, 0x2, 0x1a0, 0x1ef, 0x3, 0x2, 0x2, 0x2, 0x1a1, 0x1ef, 0x7, 
       0x29, 0x2, 0x2, 0x1a2, 0x1a3, 0x7, 0x29, 0x2, 0x2, 0x1a3, 0x1ef, 
       0x7, 0x25, 0x2, 0x2, 0x1a4, 0x1a5, 0x7, 0x29, 0x2, 0x2, 0x1a5, 0x1ef, 
       0x7, 0x2b, 0x2, 0x2, 0x1a6, 0x1a7, 0x7, 0x29, 0x2, 0x2, 0x1a7, 0x1a8, 
       0x7, 0x2b, 0x2, 0x2, 0x1a8, 0x1ef, 0x7, 0x25, 0x2, 0x2, 0x1a9, 0x1aa, 
       0x5, 0x2e, 0x18, 0x2, 0x1aa, 0x1ab, 0x7, 0x29, 0x2, 0x2, 0x1ab, 0x1ef, 
       0x3, 0x2, 0x2, 0x2, 0x1ac, 0x1ad, 0x5, 0x2e, 0x18, 0x2, 0x1ad, 0x1ae, 
       0x7, 0x29, 0x2, 0x2, 0x1ae, 0x1af, 0x7, 0x25, 0x2, 0x2, 0x1af, 0x1ef, 
       0x3, 0x2, 0x2, 0x2, 0x1b0, 0x1b1, 0x5, 0x2e, 0x18, 0x2, 0x1b1, 0x1b2, 
       0x7, 0x29, 0x2, 0x2, 0x1b2, 0x1b3, 0x7, 0x2b, 0x2, 0x2, 0x1b3, 0x1ef, 
       0x3, 0x2, 0x2, 0x2, 0x1b4, 0x1b5, 0x5, 0x2e, 0x18, 0x2, 0x1b5, 0x1b6, 
       0x7, 0x29, 0x2, 0x2, 0x1b6, 0x1b7, 0x7, 0x2b, 0x2, 0x2, 0x1b7, 0x1b8, 
       0x7, 0x25, 0x2, 0x2, 0x1b8, 0x1ef, 0x3, 0x2, 0x2, 0x2, 0x1b9, 0x1ba, 
       0x7, 0x29, 0x2, 0x2, 0x1ba, 0x1ef, 0x5, 0x30, 0x19, 0x2, 0x1bb, 0x1bc, 
       0x7, 0x29, 0x2, 0x2, 0x1bc, 0x1bd, 0x5, 0x30, 0x19, 0x2, 0x1bd, 0x1be, 
       0x7, 0x25, 0x2, 0x2, 0x1be, 0x1ef, 0x3, 0x2, 0x2, 0x2, 0x1bf, 0x1c0, 
       0x7, 0x29, 0x2, 0x2, 0x1c0, 0x1c1, 0x5, 0x30, 0x19, 0x2, 0x1c1, 0x1c2, 
       0x7, 0x2b, 0x2, 0x2, 0x1c2, 0x1ef, 0x3, 0x2, 0x2, 0x2, 0x1c3, 0x1c4, 
       0x7, 0x29, 0x2, 0x2, 0x1c4, 0x1c5, 0x5, 0x30, 0x19, 0x2, 0x1c5, 0x1c6, 
       0x7, 0x2b, 0x2, 0x2, 0x1c6, 0x1c7, 0x7, 0x25, 0x2, 0x2, 0x1c7, 0x1ef, 
       0x3, 0x2, 0x2, 0x2, 0x1c8, 0x1ef, 0x7, 0x2d, 0x2, 0x2, 0x1c9, 0x1ca, 
       0x7, 0x2d, 0x2, 0x2, 0x1ca, 0x1ef, 0x7, 0x25, 0x2, 0x2, 0x1cb, 0x1cc, 
       0x7, 0x2d, 0x2, 0x2, 0x1cc, 0x1ef, 0x7, 0x2b, 0x2, 0x2, 0x1cd, 0x1ce, 
       0x7, 0x2d, 0x2, 0x2, 0x1ce, 0x1cf, 0x7, 0x2b, 0x2, 0x2, 0x1cf, 0x1ef, 
       0x7, 0x25, 0x2, 0x2, 0x1d0, 0x1ef, 0x7, 0x2e, 0x2, 0x2, 0x1d1, 0x1d2, 
       0x7, 0x2e, 0x2, 0x2, 0x1d2, 0x1ef, 0x7, 0x25, 0x2, 0x2, 0x1d3, 0x1d4, 
       0x7, 0x2e, 0x2, 0x2, 0x1d4, 0x1ef, 0x7, 0x2b, 0x2, 0x2, 0x1d5, 0x1d6, 
       0x7, 0x2e, 0x2, 0x2, 0x1d6, 0x1d7, 0x7, 0x2b, 0x2, 0x2, 0x1d7, 0x1ef, 
       0x7, 0x25, 0x2, 0x2, 0x1d8, 0x1ef, 0x5, 0x28, 0x15, 0x2, 0x1d9, 0x1da, 
       0x5, 0x28, 0x15, 0x2, 0x1da, 0x1db, 0x7, 0x25, 0x2, 0x2, 0x1db, 0x1ef, 
       0x3, 0x2, 0x2, 0x2, 0x1dc, 0x1dd, 0x5, 0x28, 0x15, 0x2, 0x1dd, 0x1de, 
       0x7, 0x2b, 0x2, 0x2, 0x1de, 0x1ef, 0x3, 0x2, 0x2, 0x2, 0x1df, 0x1e0, 
       0x5, 0x28, 0x15, 0x2, 0x1e0, 0x1e1, 0x7, 0x2b, 0x2, 0x2, 0x1e1, 0x1e2, 
       0x7, 0x25, 0x2, 0x2, 0x1e2, 0x1ef, 0x3, 0x2, 0x2, 0x2, 0x1e3, 0x1ef, 
       0x5, 0xc2, 0x62, 0x2, 0x1e4, 0x1e5, 0x5, 0xc2, 0x62, 0x2, 0x1e5, 
       0x1e6, 0x7, 0x25, 0x2, 0x2, 0x1e6, 0x1ef, 0x3, 0x2, 0x2, 0x2, 0x1e7, 
       0x1e8, 0x5, 0xc2, 0x62, 0x2, 0x1e8, 0x1e9, 0x7, 0x2b, 0x2, 0x2, 0x1e9, 
       0x1ef, 0x3, 0x2, 0x2, 0x2, 0x1ea, 0x1eb, 0x5, 0xc2, 0x62, 0x2, 0x1eb, 
       0x1ec, 0x7, 0x2b, 0x2, 0x2, 0x1ec, 0x1ed, 0x7, 0x25, 0x2, 0x2, 0x1ed, 
       0x1ef, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x196, 0x3, 0x2, 0x2, 0x2, 0x1ee, 
       0x197, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x19a, 0x3, 0x2, 0x2, 0x2, 0x1ee, 
       0x19d, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1a1, 0x3, 0x2, 0x2, 0x2, 0x1ee, 
       0x1a2, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1a4, 0x3, 0x2, 0x2, 0x2, 0x1ee, 
       0x1a6, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1a9, 0x3, 0x2, 0x2, 0x2, 0x1ee, 
       0x1ac, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1b0, 0x3, 0x2, 0x2, 0x2, 0x1ee, 
       0x1b4, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1b9, 0x3, 0x2, 0x2, 0x2, 0x1ee, 
       0x1bb, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1bf, 0x3, 0x2, 0x2, 0x2, 0x1ee, 
       0x1c3, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1c8, 0x3, 0x2, 0x2, 0x2, 0x1ee, 
       0x1c9, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1cb, 0x3, 0x2, 0x2, 0x2, 0x1ee, 
       0x1cd, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1d0, 0x3, 0x2, 0x2, 0x2, 0x1ee, 
       0x1d1, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1d3, 0x3, 0x2, 0x2, 0x2, 0x1ee, 
       0x1d5, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1d8, 0x3, 0x2, 0x2, 0x2, 0x1ee, 
       0x1d9, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1dc, 0x3, 0x2, 0x2, 0x2, 0x1ee, 
       0x1df, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1e3, 0x3, 0x2, 0x2, 0x2, 0x1ee, 
       0x1e4, 0x3, 0x2, 0x2, 0x2, 0x1ee, 0x1e7, 0x3, 0x2, 0x2, 0x2, 0x1ee, 
       0x1ea, 0x3, 0x2, 0x2, 0x2, 0x1ef, 0x2d, 0x3, 0x2, 0x2, 0x2, 0x1f0, 
       0x1f1, 0x7, 0x28, 0x2, 0x2, 0x1f1, 0x2f, 0x3, 0x2, 0x2, 0x2, 0x1f2, 
       0x1f3, 0x7, 0x28, 0x2, 0x2, 0x1f3, 0x31, 0x3, 0x2, 0x2, 0x2, 0x1f4, 
       0x1f5, 0x5, 0x34, 0x1b, 0x2, 0x1f5, 0x1f6, 0x7, 0x19, 0x2, 0x2, 0x1f6, 
       0x33, 0x3, 0x2, 0x2, 0x2, 0x1f7, 0x1f8, 0x7, 0x29, 0x2, 0x2, 0x1f8, 
       0x208, 0x5, 0x42, 0x22, 0x2, 0x1f9, 0x1fa, 0x7, 0x29, 0x2, 0x2, 0x1fa, 
       0x1fb, 0x7, 0x1b, 0x2, 0x2, 0x1fb, 0x1fc, 0x5, 0x3e, 0x20, 0x2, 0x1fc, 
       0x1fd, 0x5, 0x42, 0x22, 0x2, 0x1fd, 0x208, 0x3, 0x2, 0x2, 0x2, 0x1fe, 
       0x1ff, 0x7, 0x29, 0x2, 0x2, 0x1ff, 0x200, 0x7, 0x1d, 0x2, 0x2, 0x200, 
       0x201, 0x5, 0x3e, 0x20, 0x2, 0x201, 0x202, 0x5, 0x42, 0x22, 0x2, 
       0x202, 0x208, 0x3, 0x2, 0x2, 0x2, 0x203, 0x208, 0x5, 0x38, 0x1d, 
       0x2, 0x204, 0x205, 0x5, 0xc2, 0x62, 0x2, 0x205, 0x206, 0x5, 0x36, 
       0x1c, 0x2, 0x206, 0x208, 0x3, 0x2, 0x2, 0x2, 0x207, 0x1f7, 0x3, 0x2, 
       0x2, 0x2, 0x207, 0x1f9, 0x3, 0x2, 0x2, 0x2, 0x207, 0x1fe, 0x3, 0x2, 
       0x2, 0x2, 0x207, 0x203, 0x3, 0x2, 0x2, 0x2, 0x207, 0x204, 0x3, 0x2, 
       0x2, 0x2, 0x208, 0x35, 0x3, 0x2, 0x2, 0x2, 0x209, 0x20a, 0x5, 0x42, 
       0x22, 0x2, 0x20a, 0x37, 0x3, 0x2, 0x2, 0x2, 0x20b, 0x20c, 0x7, 0x29, 
       0x2, 0x2, 0x20c, 0x20d, 0x7, 0x1b, 0x2, 0x2, 0x20d, 0x20e, 0x5, 0x3a, 
       0x1e, 0x2, 0x20e, 0x39, 0x3, 0x2, 0x2, 0x2, 0x20f, 0x215, 0x5, 0x3c, 
       0x1f, 0x2, 0x210, 0x211, 0x5, 0x3c, 0x1f, 0x2, 0x211, 0x212, 0x7, 
       0x1b, 0x2, 0x2, 0x212, 0x213, 0x5, 0x3a, 0x1e, 0x2, 0x213, 0x215, 
       0x3, 0x2, 0x2, 0x2, 0x214, 0x20f, 0x3, 0x2, 0x2, 0x2, 0x214, 0x210, 
       0x3, 0x2, 0x2, 0x2, 0x215, 0x3b, 0x3, 0x2, 0x2, 0x2, 0x216, 0x217, 
       0x7, 0x29, 0x2, 0x2, 0x217, 0x218, 0x5, 0x42, 0x22, 0x2, 0x218, 0x3d, 
       0x3, 0x2, 0x2, 0x2, 0x219, 0x21a, 0x7, 0x29, 0x2, 0x2, 0x21a, 0x3f, 
       0x3, 0x2, 0x2, 0x2, 0x21b, 0x21c, 0x7, 0x1b, 0x2, 0x2, 0x21c, 0x41, 
       0x3, 0x2, 0x2, 0x2, 0x21d, 0x21e, 0x7, 0x23, 0x2, 0x2, 0x21e, 0x224, 
       0x7, 0x24, 0x2, 0x2, 0x21f, 0x220, 0x7, 0x23, 0x2, 0x2, 0x220, 0x221, 
       0x5, 0x44, 0x23, 0x2, 0x221, 0x222, 0x7, 0x24, 0x2, 0x2, 0x222, 0x224, 
       0x3, 0x2, 0x2, 0x2, 0x223, 0x21d, 0x3, 0x2, 0x2, 0x2, 0x223, 0x21f, 
       0x3, 0x2, 0x2, 0x2, 0x224, 0x43, 0x3, 0x2, 0x2, 0x2, 0x225, 0x230, 
       0x5, 0xd0, 0x69, 0x2, 0x226, 0x227, 0x5, 0xd0, 0x69, 0x2, 0x227, 
       0x228, 0x7, 0x1e, 0x2, 0x2, 0x228, 0x229, 0x5, 0x44, 0x23, 0x2, 0x229, 
       0x230, 0x3, 0x2, 0x2, 0x2, 0x22a, 0x230, 0x5, 0x2a, 0x16, 0x2, 0x22b, 
       0x22c, 0x5, 0x2a, 0x16, 0x2, 0x22c, 0x22d, 0x7, 0x1e, 0x2, 0x2, 0x22d, 
       0x22e, 0x5, 0x44, 0x23, 0x2, 0x22e, 0x230, 0x3, 0x2, 0x2, 0x2, 0x22f, 
       0x225, 0x3, 0x2, 0x2, 0x2, 0x22f, 0x226, 0x3, 0x2, 0x2, 0x2, 0x22f, 
       0x22a, 0x3, 0x2, 0x2, 0x2, 0x22f, 0x22b, 0x3, 0x2, 0x2, 0x2, 0x230, 
       0x45, 0x3, 0x2, 0x2, 0x2, 0x231, 0x236, 0x5, 0x48, 0x25, 0x2, 0x232, 
       0x233, 0x5, 0x48, 0x25, 0x2, 0x233, 0x234, 0x5, 0x46, 0x24, 0x2, 
       0x234, 0x236, 0x3, 0x2, 0x2, 0x2, 0x235, 0x231, 0x3, 0x2, 0x2, 0x2, 
       0x235, 0x232, 0x3, 0x2, 0x2, 0x2, 0x236, 0x47, 0x3, 0x2, 0x2, 0x2, 
       0x237, 0x243, 0x5, 0x4a, 0x26, 0x2, 0x238, 0x239, 0x5, 0x4a, 0x26, 
       0x2, 0x239, 0x23a, 0x5, 0x4c, 0x27, 0x2, 0x23a, 0x243, 0x3, 0x2, 
       0x2, 0x2, 0x23b, 0x23c, 0x5, 0x4a, 0x26, 0x2, 0x23c, 0x23d, 0x5, 
       0x50, 0x29, 0x2, 0x23d, 0x243, 0x3, 0x2, 0x2, 0x2, 0x23e, 0x23f, 
       0x5, 0x4a, 0x26, 0x2, 0x23f, 0x240, 0x5, 0x4c, 0x27, 0x2, 0x240, 
       0x241, 0x5, 0x50, 0x29, 0x2, 0x241, 0x243, 0x3, 0x2, 0x2, 0x2, 0x242, 
       0x237, 0x3, 0x2, 0x2, 0x2, 0x242, 0x238, 0x3, 0x2, 0x2, 0x2, 0x242, 
       0x23b, 0x3, 0x2, 0x2, 0x2, 0x242, 0x23e, 0x3, 0x2, 0x2, 0x2, 0x243, 
       0x49, 0x3, 0x2, 0x2, 0x2, 0x244, 0x245, 0x7, 0x5, 0x2, 0x2, 0x245, 
       0x246, 0x5, 0x52, 0x2a, 0x2, 0x246, 0x247, 0x5, 0x54, 0x2b, 0x2, 
       0x247, 0x4b, 0x3, 0x2, 0x2, 0x2, 0x248, 0x24d, 0x5, 0x4e, 0x28, 0x2, 
       0x249, 0x24a, 0x5, 0x4e, 0x28, 0x2, 0x24a, 0x24b, 0x5, 0x4c, 0x27, 
       0x2, 0x24b, 0x24d, 0x3, 0x2, 0x2, 0x2, 0x24c, 0x248, 0x3, 0x2, 0x2, 
       0x2, 0x24c, 0x249, 0x3, 0x2, 0x2, 0x2, 0x24d, 0x4d, 0x3, 0x2, 0x2, 
       0x2, 0x24e, 0x24f, 0x7, 0x6, 0x2, 0x2, 0x24f, 0x250, 0x5, 0x52, 0x2a, 
       0x2, 0x250, 0x251, 0x5, 0x54, 0x2b, 0x2, 0x251, 0x4f, 0x3, 0x2, 0x2, 
       0x2, 0x252, 0x253, 0x7, 0x7, 0x2, 0x2, 0x253, 0x254, 0x5, 0x54, 0x2b, 
       0x2, 0x254, 0x51, 0x3, 0x2, 0x2, 0x2, 0x255, 0x256, 0x5, 0x58, 0x2d, 
       0x2, 0x256, 0x53, 0x3, 0x2, 0x2, 0x2, 0x257, 0x258, 0x7, 0x21, 0x2, 
       0x2, 0x258, 0x262, 0x7, 0x22, 0x2, 0x2, 0x259, 0x25a, 0x7, 0x21, 
       0x2, 0x2, 0x25a, 0x25b, 0x5, 0x56, 0x2c, 0x2, 0x25b, 0x25c, 0x7, 
       0x22, 0x2, 0x2, 0x25c, 0x262, 0x3, 0x2, 0x2, 0x2, 0x25d, 0x262, 0x5, 
       0x46, 0x24, 0x2, 0x25e, 0x262, 0x5, 0x32, 0x1a, 0x2, 0x25f, 0x262, 
       0x5, 0x6c, 0x37, 0x2, 0x260, 0x262, 0x5, 0x88, 0x45, 0x2, 0x261, 
       0x257, 0x3, 0x2, 0x2, 0x2, 0x261, 0x259, 0x3, 0x2, 0x2, 0x2, 0x261, 
       0x25d, 0x3, 0x2, 0x2, 0x2, 0x261, 0x25e, 0x3, 0x2, 0x2, 0x2, 0x261, 
       0x25f, 0x3, 0x2, 0x2, 0x2, 0x261, 0x260, 0x3, 0x2, 0x2, 0x2, 0x262, 
       0x55, 0x3, 0x2, 0x2, 0x2, 0x263, 0x268, 0x5, 0x6, 0x4, 0x2, 0x264, 
       0x265, 0x5, 0x6, 0x4, 0x2, 0x265, 0x266, 0x5, 0x56, 0x2c, 0x2, 0x266, 
       0x268, 0x3, 0x2, 0x2, 0x2, 0x267, 0x263, 0x3, 0x2, 0x2, 0x2, 0x267, 
       0x264, 0x3, 0x2, 0x2, 0x2, 0x268, 0x57, 0x3, 0x2, 0x2, 0x2, 0x269, 
       0x272, 0x5, 0x5a, 0x2e, 0x2, 0x26a, 0x26b, 0x5, 0x5a, 0x2e, 0x2, 
       0x26b, 0x26c, 0x5, 0x58, 0x2d, 0x2, 0x26c, 0x272, 0x3, 0x2, 0x2, 
       0x2, 0x26d, 0x272, 0x5, 0x5c, 0x2f, 0x2, 0x26e, 0x26f, 0x5, 0x5c, 
       0x2f, 0x2, 0x26f, 0x270, 0x5, 0x58, 0x2d, 0x2, 0x270, 0x272, 0x3, 
       0x2, 0x2, 0x2, 0x271, 0x269, 0x3, 0x2, 0x2, 0x2, 0x271, 0x26a, 0x3, 
       0x2, 0x2, 0x2, 0x271, 0x26d, 0x3, 0x2, 0x2, 0x2, 0x271, 0x26e, 0x3, 
       0x2, 0x2, 0x2, 0x272, 0x59, 0x3, 0x2, 0x2, 0x2, 0x273, 0x274, 0x7, 
       0x27, 0x2, 0x2, 0x274, 0x277, 0x5, 0x62, 0x32, 0x2, 0x275, 0x277, 
       0x5, 0x62, 0x32, 0x2, 0x276, 0x273, 0x3, 0x2, 0x2, 0x2, 0x276, 0x275, 
       0x3, 0x2, 0x2, 0x2, 0x277, 0x5b, 0x3, 0x2, 0x2, 0x2, 0x278, 0x27c, 
       0x5, 0x5e, 0x30, 0x2, 0x279, 0x27a, 0x7, 0x27, 0x2, 0x2, 0x27a, 0x27c, 
       0x5, 0x5e, 0x30, 0x2, 0x27b, 0x278, 0x3, 0x2, 0x2, 0x2, 0x27b, 0x279, 
       0x3, 0x2, 0x2, 0x2, 0x27c, 0x5d, 0x3, 0x2, 0x2, 0x2, 0x27d, 0x286, 
       0x5, 0x60, 0x31, 0x2, 0x27e, 0x27f, 0x5, 0x60, 0x31, 0x2, 0x27f, 
       0x280, 0x9, 0x3, 0x2, 0x2, 0x280, 0x286, 0x3, 0x2, 0x2, 0x2, 0x281, 
       0x282, 0x5, 0x60, 0x31, 0x2, 0x282, 0x283, 0x7, 0x2b, 0x2, 0x2, 0x283, 
       0x284, 0x9, 0x3, 0x2, 0x2, 0x284, 0x286, 0x3, 0x2, 0x2, 0x2, 0x285, 
       0x27d, 0x3, 0x2, 0x2, 0x2, 0x285, 0x27e, 0x3, 0x2, 0x2, 0x2, 0x285, 
       0x281, 0x3, 0x2, 0x2, 0x2, 0x286, 0x5f, 0x3, 0x2, 0x2, 0x2, 0x287, 
       0x288, 0x7, 0x23, 0x2, 0x2, 0x288, 0x289, 0x5, 0x58, 0x2d, 0x2, 0x289, 
       0x28a, 0x7, 0x24, 0x2, 0x2, 0x28a, 0x61, 0x3, 0x2, 0x2, 0x2, 0x28b, 
       0x28c, 0x5, 0x2e, 0x18, 0x2, 0x28c, 0x28d, 0x7, 0x29, 0x2, 0x2, 0x28d, 
       0x2e5, 0x3, 0x2, 0x2, 0x2, 0x28e, 0x28f, 0x5, 0x2e, 0x18, 0x2, 0x28f, 
       0x290, 0x7, 0x29, 0x2, 0x2, 0x290, 0x291, 0x9, 0x3, 0x2, 0x2, 0x291, 
       0x2e5, 0x3, 0x2, 0x2, 0x2, 0x292, 0x293, 0x5, 0x2e, 0x18, 0x2, 0x293, 
       0x294, 0x7, 0x29, 0x2, 0x2, 0x294, 0x295, 0x7, 0x2b, 0x2, 0x2, 0x295, 
       0x2e5, 0x3, 0x2, 0x2, 0x2, 0x296, 0x297, 0x5, 0x2e, 0x18, 0x2, 0x297, 
       0x298, 0x7, 0x29, 0x2, 0x2, 0x298, 0x299, 0x7, 0x2b, 0x2, 0x2, 0x299, 
       0x29a, 0x9, 0x3, 0x2, 0x2, 0x29a, 0x2e5, 0x3, 0x2, 0x2, 0x2, 0x29b, 
       0x29c, 0x7, 0x29, 0x2, 0x2, 0x29c, 0x2e5, 0x5, 0x30, 0x19, 0x2, 0x29d, 
       0x29e, 0x7, 0x29, 0x2, 0x2, 0x29e, 0x29f, 0x5, 0x30, 0x19, 0x2, 0x29f, 
       0x2a0, 0x9, 0x3, 0x2, 0x2, 0x2a0, 0x2e5, 0x3, 0x2, 0x2, 0x2, 0x2a1, 
       0x2a2, 0x7, 0x29, 0x2, 0x2, 0x2a2, 0x2a3, 0x5, 0x30, 0x19, 0x2, 0x2a3, 
       0x2a4, 0x7, 0x2b, 0x2, 0x2, 0x2a4, 0x2e5, 0x3, 0x2, 0x2, 0x2, 0x2a5, 
       0x2a6, 0x7, 0x29, 0x2, 0x2, 0x2a6, 0x2a7, 0x5, 0x30, 0x19, 0x2, 0x2a7, 
       0x2a8, 0x7, 0x2b, 0x2, 0x2, 0x2a8, 0x2a9, 0x9, 0x3, 0x2, 0x2, 0x2a9, 
       0x2e5, 0x3, 0x2, 0x2, 0x2, 0x2aa, 0x2e5, 0x7, 0x2d, 0x2, 0x2, 0x2ab, 
       0x2ac, 0x7, 0x2d, 0x2, 0x2, 0x2ac, 0x2e5, 0x9, 0x3, 0x2, 0x2, 0x2ad, 
       0x2ae, 0x7, 0x2d, 0x2, 0x2, 0x2ae, 0x2e5, 0x7, 0x2b, 0x2, 0x2, 0x2af, 
       0x2b0, 0x7, 0x2d, 0x2, 0x2, 0x2b0, 0x2b1, 0x7, 0x2b, 0x2, 0x2, 0x2b1, 
       0x2e5, 0x9, 0x3, 0x2, 0x2, 0x2b2, 0x2e5, 0x7, 0x2e, 0x2, 0x2, 0x2b3, 
       0x2b4, 0x7, 0x2e, 0x2, 0x2, 0x2b4, 0x2e5, 0x9, 0x3, 0x2, 0x2, 0x2b5, 
       0x2b6, 0x7, 0x2e, 0x2, 0x2, 0x2b6, 0x2e5, 0x7, 0x2b, 0x2, 0x2, 0x2b7, 
       0x2b8, 0x7, 0x2e, 0x2, 0x2, 0x2b8, 0x2b9, 0x7, 0x2b, 0x2, 0x2, 0x2b9, 
       0x2e5, 0x9, 0x3, 0x2, 0x2, 0x2ba, 0x2e5, 0x5, 0x64, 0x33, 0x2, 0x2bb, 
       0x2e5, 0x5, 0x34, 0x1b, 0x2, 0x2bc, 0x2bd, 0x5, 0x34, 0x1b, 0x2, 
       0x2bd, 0x2be, 0x9, 0x3, 0x2, 0x2, 0x2be, 0x2e5, 0x3, 0x2, 0x2, 0x2, 
       0x2bf, 0x2c0, 0x5, 0x34, 0x1b, 0x2, 0x2c0, 0x2c1, 0x7, 0x2b, 0x2, 
       0x2, 0x2c1, 0x2e5, 0x3, 0x2, 0x2, 0x2, 0x2c2, 0x2c3, 0x5, 0x34, 0x1b, 
       0x2, 0x2c3, 0x2c4, 0x7, 0x2b, 0x2, 0x2, 0x2c4, 0x2c5, 0x9, 0x3, 0x2, 
       0x2, 0x2c5, 0x2e5, 0x3, 0x2, 0x2, 0x2, 0x2c6, 0x2e5, 0x5, 0x28, 0x15, 
       0x2, 0x2c7, 0x2c8, 0x5, 0x28, 0x15, 0x2, 0x2c8, 0x2c9, 0x9, 0x3, 
       0x2, 0x2, 0x2c9, 0x2e5, 0x3, 0x2, 0x2, 0x2, 0x2ca, 0x2cb, 0x5, 0x28, 
       0x15, 0x2, 0x2cb, 0x2cc, 0x7, 0x2b, 0x2, 0x2, 0x2cc, 0x2e5, 0x3, 
       0x2, 0x2, 0x2, 0x2cd, 0x2ce, 0x5, 0x28, 0x15, 0x2, 0x2ce, 0x2cf, 
       0x7, 0x2b, 0x2, 0x2, 0x2cf, 0x2d0, 0x9, 0x3, 0x2, 0x2, 0x2d0, 0x2e5, 
       0x3, 0x2, 0x2, 0x2, 0x2d1, 0x2e5, 0x7, 0x29, 0x2, 0x2, 0x2d2, 0x2d3, 
       0x7, 0x29, 0x2, 0x2, 0x2d3, 0x2e5, 0x9, 0x3, 0x2, 0x2, 0x2d4, 0x2d5, 
       0x7, 0x29, 0x2, 0x2, 0x2d5, 0x2e5, 0x7, 0x2b, 0x2, 0x2, 0x2d6, 0x2d7, 
       0x7, 0x29, 0x2, 0x2, 0x2d7, 0x2d8, 0x7, 0x2b, 0x2, 0x2, 0x2d8, 0x2e5, 
       0x9, 0x3, 0x2, 0x2, 0x2d9, 0x2e5, 0x5, 0xc2, 0x62, 0x2, 0x2da, 0x2db, 
       0x5, 0xc2, 0x62, 0x2, 0x2db, 0x2dc, 0x9, 0x3, 0x2, 0x2, 0x2dc, 0x2e5, 
       0x3, 0x2, 0x2, 0x2, 0x2dd, 0x2de, 0x5, 0xc2, 0x62, 0x2, 0x2de, 0x2df, 
       0x7, 0x2b, 0x2, 0x2, 0x2df, 0x2e5, 0x3, 0x2, 0x2, 0x2, 0x2e0, 0x2e1, 
       0x5, 0xc2, 0x62, 0x2, 0x2e1, 0x2e2, 0x7, 0x2b, 0x2, 0x2, 0x2e2, 0x2e3, 
       0x9, 0x3, 0x2, 0x2, 0x2e3, 0x2e5, 0x3, 0x2, 0x2, 0x2, 0x2e4, 0x28b, 
       0x3, 0x2, 0x2, 0x2, 0x2e4, 0x28e, 0x3, 0x2, 0x2, 0x2, 0x2e4, 0x292, 
       0x3, 0x2, 0x2, 0x2, 0x2e4, 0x296, 0x3, 0x2, 0x2, 0x2, 0x2e4, 0x29b, 
       0x3, 0x2, 0x2, 0x2, 0x2e4, 0x29d, 0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2a1, 
       0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2a5, 0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2aa, 
       0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2ab, 0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2ad, 
       0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2af, 0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2b2, 
       0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2b3, 0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2b5, 
       0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2b7, 0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2ba, 
       0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2bb, 0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2bc, 
       0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2bf, 0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2c2, 
       0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2c6, 0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2c7, 
       0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2ca, 0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2cd, 
       0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2d1, 0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2d2, 
       0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2d4, 0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2d6, 
       0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2d9, 0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2da, 
       0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2dd, 0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2e0, 
       0x3, 0x2, 0x2, 0x2, 0x2e5, 0x63, 0x3, 0x2, 0x2, 0x2, 0x2e6, 0x2e7, 
       0x5, 0x66, 0x34, 0x2, 0x2e7, 0x2e8, 0x7, 0x1a, 0x2, 0x2, 0x2e8, 0x2e9, 
       0x5, 0x68, 0x35, 0x2, 0x2e9, 0x65, 0x3, 0x2, 0x2, 0x2, 0x2ea, 0x2ed, 
       0x5, 0xc2, 0x62, 0x2, 0x2eb, 0x2ed, 0x7, 0x29, 0x2, 0x2, 0x2ec, 0x2ea, 
       0x3, 0x2, 0x2, 0x2, 0x2ec, 0x2eb, 0x3, 0x2, 0x2, 0x2, 0x2ed, 0x67, 
       0x3, 0x2, 0x2, 0x2, 0x2ee, 0x2ef, 0x5, 0x6a, 0x36, 0x2, 0x2ef, 0x69, 
       0x3, 0x2, 0x2, 0x2, 0x2f0, 0x2fc, 0x5, 0x34, 0x1b, 0x2, 0x2f1, 0x2f2, 
       0x5, 0x34, 0x1b, 0x2, 0x2f2, 0x2f3, 0x9, 0x3, 0x2, 0x2, 0x2f3, 0x2fc, 
       0x3, 0x2, 0x2, 0x2, 0x2f4, 0x2f5, 0x5, 0x34, 0x1b, 0x2, 0x2f5, 0x2f6, 
       0x7, 0x2b, 0x2, 0x2, 0x2f6, 0x2fc, 0x3, 0x2, 0x2, 0x2, 0x2f7, 0x2f8, 
       0x5, 0x34, 0x1b, 0x2, 0x2f8, 0x2f9, 0x7, 0x2b, 0x2, 0x2, 0x2f9, 0x2fa, 
       0x9, 0x3, 0x2, 0x2, 0x2fa, 0x2fc, 0x3, 0x2, 0x2, 0x2, 0x2fb, 0x2f0, 
       0x3, 0x2, 0x2, 0x2, 0x2fb, 0x2f1, 0x3, 0x2, 0x2, 0x2, 0x2fb, 0x2f4, 
       0x3, 0x2, 0x2, 0x2, 0x2fb, 0x2f7, 0x3, 0x2, 0x2, 0x2, 0x2fc, 0x6b, 
       0x3, 0x2, 0x2, 0x2, 0x2fd, 0x302, 0x5, 0x6e, 0x38, 0x2, 0x2fe, 0x2ff, 
       0x5, 0x6e, 0x38, 0x2, 0x2ff, 0x300, 0x5, 0x6c, 0x37, 0x2, 0x300, 
       0x302, 0x3, 0x2, 0x2, 0x2, 0x301, 0x2fd, 0x3, 0x2, 0x2, 0x2, 0x301, 
       0x2fe, 0x3, 0x2, 0x2, 0x2, 0x302, 0x6d, 0x3, 0x2, 0x2, 0x2, 0x303, 
       0x304, 0x7, 0x8, 0x2, 0x2, 0x304, 0x305, 0x5, 0x70, 0x39, 0x2, 0x305, 
       0x306, 0x5, 0x86, 0x44, 0x2, 0x306, 0x6f, 0x3, 0x2, 0x2, 0x2, 0x307, 
       0x30b, 0x5, 0x72, 0x3a, 0x2, 0x308, 0x30b, 0x5, 0x74, 0x3b, 0x2, 
       0x309, 0x30b, 0x5, 0x76, 0x3c, 0x2, 0x30a, 0x307, 0x3, 0x2, 0x2, 
       0x2, 0x30a, 0x308, 0x3, 0x2, 0x2, 0x2, 0x30a, 0x309, 0x3, 0x2, 0x2, 
       0x2, 0x30b, 0x71, 0x3, 0x2, 0x2, 0x2, 0x30c, 0x30d, 0x7, 0x23, 0x2, 
       0x2, 0x30d, 0x310, 0x7, 0x24, 0x2, 0x2, 0x30e, 0x310, 0x3, 0x2, 0x2, 
       0x2, 0x30f, 0x30c, 0x3, 0x2, 0x2, 0x2, 0x30f, 0x30e, 0x3, 0x2, 0x2, 
       0x2, 0x310, 0x73, 0x3, 0x2, 0x2, 0x2, 0x311, 0x312, 0x7, 0x23, 0x2, 
       0x2, 0x312, 0x313, 0x5, 0x7c, 0x3f, 0x2, 0x313, 0x314, 0x5, 0x78, 
       0x3d, 0x2, 0x314, 0x315, 0x5, 0x7e, 0x40, 0x2, 0x315, 0x316, 0x5, 
       0x7a, 0x3e, 0x2, 0x316, 0x317, 0x5, 0x80, 0x41, 0x2, 0x317, 0x318, 
       0x7, 0x24, 0x2, 0x2, 0x318, 0x320, 0x3, 0x2, 0x2, 0x2, 0x319, 0x31a, 
       0x5, 0x7c, 0x3f, 0x2, 0x31a, 0x31b, 0x5, 0x78, 0x3d, 0x2, 0x31b, 
       0x31c, 0x5, 0x7e, 0x40, 0x2, 0x31c, 0x31d, 0x5, 0x7a, 0x3e, 0x2, 
       0x31d, 0x31e, 0x5, 0x80, 0x41, 0x2, 0x31e, 0x320, 0x3, 0x2, 0x2, 
       0x2, 0x31f, 0x311, 0x3, 0x2, 0x2, 0x2, 0x31f, 0x319, 0x3, 0x2, 0x2, 
       0x2, 0x320, 0x75, 0x3, 0x2, 0x2, 0x2, 0x321, 0x322, 0x5, 0x7e, 0x40, 
       0x2, 0x322, 0x77, 0x3, 0x2, 0x2, 0x2, 0x323, 0x324, 0x7, 0x19, 0x2, 
       0x2, 0x324, 0x79, 0x3, 0x2, 0x2, 0x2, 0x325, 0x326, 0x7, 0x19, 0x2, 
       0x2, 0x326, 0x7b, 0x3, 0x2, 0x2, 0x2, 0x327, 0x32c, 0x5, 0x1a, 0xe, 
       0x2, 0x328, 0x329, 0x7, 0x4, 0x2, 0x2, 0x329, 0x32c, 0x5, 0x1a, 0xe, 
       0x2, 0x32a, 0x32c, 0x3, 0x2, 0x2, 0x2, 0x32b, 0x327, 0x3, 0x2, 0x2, 
       0x2, 0x32b, 0x328, 0x3, 0x2, 0x2, 0x2, 0x32b, 0x32a, 0x3, 0x2, 0x2, 
       0x2, 0x32c, 0x7d, 0x3, 0x2, 0x2, 0x2, 0x32d, 0x330, 0x5, 0x58, 0x2d, 
       0x2, 0x32e, 0x330, 0x3, 0x2, 0x2, 0x2, 0x32f, 0x32d, 0x3, 0x2, 0x2, 
       0x2, 0x32f, 0x32e, 0x3, 0x2, 0x2, 0x2, 0x330, 0x7f, 0x3, 0x2, 0x2, 
       0x2, 0x331, 0x334, 0x5, 0x82, 0x42, 0x2, 0x332, 0x334, 0x3, 0x2, 
       0x2, 0x2, 0x333, 0x331, 0x3, 0x2, 0x2, 0x2, 0x333, 0x332, 0x3, 0x2, 
       0x2, 0x2, 0x334, 0x81, 0x3, 0x2, 0x2, 0x2, 0x335, 0x33b, 0x5, 0x2a, 
       0x16, 0x2, 0x336, 0x337, 0x5, 0x2a, 0x16, 0x2, 0x337, 0x338, 0x7, 
       0x1e, 0x2, 0x2, 0x338, 0x339, 0x5, 0x82, 0x42, 0x2, 0x339, 0x33b, 
       0x3, 0x2, 0x2, 0x2, 0x33a, 0x335, 0x3, 0x2, 0x2, 0x2, 0x33a, 0x336, 
       0x3, 0x2, 0x2, 0x2, 0x33b, 0x83, 0x3, 0x2, 0x2, 0x2, 0x33c, 0x341, 
       0x5, 0x6, 0x4, 0x2, 0x33d, 0x33e, 0x5, 0x6, 0x4, 0x2, 0x33e, 0x33f, 
       0x5, 0x84, 0x43, 0x2, 0x33f, 0x341, 0x3, 0x2, 0x2, 0x2, 0x340, 0x33c, 
       0x3, 0x2, 0x2, 0x2, 0x340, 0x33d, 0x3, 0x2, 0x2, 0x2, 0x341, 0x85, 
       0x3, 0x2, 0x2, 0x2, 0x342, 0x343, 0x7, 0x21, 0x2, 0x2, 0x343, 0x34d, 
       0x7, 0x22, 0x2, 0x2, 0x344, 0x345, 0x7, 0x21, 0x2, 0x2, 0x345, 0x346, 
       0x5, 0x84, 0x43, 0x2, 0x346, 0x347, 0x7, 0x22, 0x2, 0x2, 0x347, 0x34d, 
       0x3, 0x2, 0x2, 0x2, 0x348, 0x34d, 0x5, 0x46, 0x24, 0x2, 0x349, 0x34d, 
       0x5, 0x32, 0x1a, 0x2, 0x34a, 0x34d, 0x5, 0x6c, 0x37, 0x2, 0x34b, 
       0x34d, 0x5, 0x88, 0x45, 0x2, 0x34c, 0x342, 0x3, 0x2, 0x2, 0x2, 0x34c, 
       0x344, 0x3, 0x2, 0x2, 0x2, 0x34c, 0x348, 0x3, 0x2, 0x2, 0x2, 0x34c, 
       0x349, 0x3, 0x2, 0x2, 0x2, 0x34c, 0x34a, 0x3, 0x2, 0x2, 0x2, 0x34c, 
       0x34b, 0x3, 0x2, 0x2, 0x2, 0x34d, 0x87, 0x3, 0x2, 0x2, 0x2, 0x34e, 
       0x34f, 0x7, 0x9, 0x2, 0x2, 0x34f, 0x350, 0x5, 0x8a, 0x46, 0x2, 0x350, 
       0x351, 0x7, 0x19, 0x2, 0x2, 0x351, 0x89, 0x3, 0x2, 0x2, 0x2, 0x352, 
       0x355, 0x5, 0xd0, 0x69, 0x2, 0x353, 0x355, 0x5, 0x2a, 0x16, 0x2, 
       0x354, 0x352, 0x3, 0x2, 0x2, 0x2, 0x354, 0x353, 0x3, 0x2, 0x2, 0x2, 
       0x355, 0x8b, 0x3, 0x2, 0x2, 0x2, 0x356, 0x357, 0x5, 0x8e, 0x48, 0x2, 
       0x357, 0x358, 0x7, 0x21, 0x2, 0x2, 0x358, 0x359, 0x7, 0x22, 0x2, 
       0x2, 0x359, 0x375, 0x3, 0x2, 0x2, 0x2, 0x35a, 0x35b, 0x5, 0x8e, 0x48, 
       0x2, 0x35b, 0x35c, 0x7, 0x21, 0x2, 0x2, 0x35c, 0x35d, 0x5, 0xa2, 
       0x52, 0x2, 0x35d, 0x35e, 0x7, 0x22, 0x2, 0x2, 0x35e, 0x375, 0x3, 
       0x2, 0x2, 0x2, 0x35f, 0x360, 0x5, 0x94, 0x4b, 0x2, 0x360, 0x361, 
       0x7, 0x21, 0x2, 0x2, 0x361, 0x362, 0x7, 0x22, 0x2, 0x2, 0x362, 0x375, 
       0x3, 0x2, 0x2, 0x2, 0x363, 0x364, 0x5, 0x94, 0x4b, 0x2, 0x364, 0x365, 
       0x7, 0x21, 0x2, 0x2, 0x365, 0x366, 0x5, 0xa2, 0x52, 0x2, 0x366, 0x367, 
       0x7, 0x22, 0x2, 0x2, 0x367, 0x375, 0x3, 0x2, 0x2, 0x2, 0x368, 0x369, 
       0x5, 0x9e, 0x50, 0x2, 0x369, 0x36a, 0x7, 0x21, 0x2, 0x2, 0x36a, 0x36b, 
       0x7, 0x22, 0x2, 0x2, 0x36b, 0x375, 0x3, 0x2, 0x2, 0x2, 0x36c, 0x36d, 
       0x5, 0x9e, 0x50, 0x2, 0x36d, 0x36e, 0x7, 0x21, 0x2, 0x2, 0x36e, 0x36f, 
       0x5, 0xa2, 0x52, 0x2, 0x36f, 0x370, 0x7, 0x22, 0x2, 0x2, 0x370, 0x375, 
       0x3, 0x2, 0x2, 0x2, 0x371, 0x372, 0x5, 0xa0, 0x51, 0x2, 0x372, 0x373, 
       0x7, 0x19, 0x2, 0x2, 0x373, 0x375, 0x3, 0x2, 0x2, 0x2, 0x374, 0x356, 
       0x3, 0x2, 0x2, 0x2, 0x374, 0x35a, 0x3, 0x2, 0x2, 0x2, 0x374, 0x35f, 
       0x3, 0x2, 0x2, 0x2, 0x374, 0x363, 0x3, 0x2, 0x2, 0x2, 0x374, 0x368, 
       0x3, 0x2, 0x2, 0x2, 0x374, 0x36c, 0x3, 0x2, 0x2, 0x2, 0x374, 0x371, 
       0x3, 0x2, 0x2, 0x2, 0x375, 0x8d, 0x3, 0x2, 0x2, 0x2, 0x376, 0x377, 
       0x5, 0x90, 0x49, 0x2, 0x377, 0x8f, 0x3, 0x2, 0x2, 0x2, 0x378, 0x379, 
       0x7, 0xa, 0x2, 0x2, 0x379, 0x37a, 0x7, 0x29, 0x2, 0x2, 0x37a, 0x37b, 
       0x7, 0x23, 0x2, 0x2, 0x37b, 0x396, 0x7, 0x24, 0x2, 0x2, 0x37c, 0x37d, 
       0x7, 0xa, 0x2, 0x2, 0x37d, 0x37e, 0x7, 0x29, 0x2, 0x2, 0x37e, 0x37f, 
       0x7, 0x23, 0x2, 0x2, 0x37f, 0x380, 0x7, 0x24, 0x2, 0x2, 0x380, 0x383, 
       0x7, 0x18, 0x2, 0x2, 0x381, 0x384, 0x5, 0x92, 0x4a, 0x2, 0x382, 0x384, 
       0x7, 0x2b, 0x2, 0x2, 0x383, 0x381, 0x3, 0x2, 0x2, 0x2, 0x383, 0x382, 
       0x3, 0x2, 0x2, 0x2, 0x384, 0x396, 0x3, 0x2, 0x2, 0x2, 0x385, 0x386, 
       0x7, 0xa, 0x2, 0x2, 0x386, 0x387, 0x7, 0x29, 0x2, 0x2, 0x387, 0x388, 
       0x7, 0x23, 0x2, 0x2, 0x388, 0x389, 0x5, 0xa6, 0x54, 0x2, 0x389, 0x38a, 
       0x7, 0x24, 0x2, 0x2, 0x38a, 0x396, 0x3, 0x2, 0x2, 0x2, 0x38b, 0x38c, 
       0x7, 0xa, 0x2, 0x2, 0x38c, 0x38d, 0x7, 0x29, 0x2, 0x2, 0x38d, 0x38e, 
       0x7, 0x23, 0x2, 0x2, 0x38e, 0x38f, 0x5, 0xa6, 0x54, 0x2, 0x38f, 0x390, 
       0x7, 0x24, 0x2, 0x2, 0x390, 0x393, 0x7, 0x18, 0x2, 0x2, 0x391, 0x394, 
       0x5, 0x92, 0x4a, 0x2, 0x392, 0x394, 0x7, 0x2b, 0x2, 0x2, 0x393, 0x391, 
       0x3, 0x2, 0x2, 0x2, 0x393, 0x392, 0x3, 0x2, 0x2, 0x2, 0x394, 0x396, 
       0x3, 0x2, 0x2, 0x2, 0x395, 0x378, 0x3, 0x2, 0x2, 0x2, 0x395, 0x37c, 
       0x3, 0x2, 0x2, 0x2, 0x395, 0x385, 0x3, 0x2, 0x2, 0x2, 0x395, 0x38b, 
       0x3, 0x2, 0x2, 0x2, 0x396, 0x91, 0x3, 0x2, 0x2, 0x2, 0x397, 0x398, 
       0x7, 0x29, 0x2, 0x2, 0x398, 0x93, 0x3, 0x2, 0x2, 0x2, 0x399, 0x39a, 
       0x5, 0x9c, 0x4f, 0x2, 0x39a, 0x39b, 0x5, 0x90, 0x49, 0x2, 0x39b, 
       0x95, 0x3, 0x2, 0x2, 0x2, 0x39c, 0x39d, 0x5, 0x98, 0x4d, 0x2, 0x39d, 
       0x39e, 0x5, 0x90, 0x49, 0x2, 0x39e, 0x3b4, 0x3, 0x2, 0x2, 0x2, 0x39f, 
       0x3a0, 0x7, 0xe, 0x2, 0x2, 0x3a0, 0x3b4, 0x5, 0x90, 0x49, 0x2, 0x3a1, 
       0x3a2, 0x5, 0x98, 0x4d, 0x2, 0x3a2, 0x3a3, 0x7, 0xe, 0x2, 0x2, 0x3a3, 
       0x3a4, 0x5, 0x90, 0x49, 0x2, 0x3a4, 0x3b4, 0x3, 0x2, 0x2, 0x2, 0x3a5, 
       0x3a6, 0x7, 0xf, 0x2, 0x2, 0x3a6, 0x3a7, 0x5, 0x98, 0x4d, 0x2, 0x3a7, 
       0x3a8, 0x7, 0xe, 0x2, 0x2, 0x3a8, 0x3a9, 0x5, 0x90, 0x49, 0x2, 0x3a9, 
       0x3b4, 0x3, 0x2, 0x2, 0x2, 0x3aa, 0x3ab, 0x7, 0xf, 0x2, 0x2, 0x3ab, 
       0x3ac, 0x5, 0x98, 0x4d, 0x2, 0x3ac, 0x3ad, 0x5, 0x90, 0x49, 0x2, 
       0x3ad, 0x3b4, 0x3, 0x2, 0x2, 0x2, 0x3ae, 0x3af, 0x7, 0xf, 0x2, 0x2, 
       0x3af, 0x3b4, 0x5, 0x90, 0x49, 0x2, 0x3b0, 0x3b1, 0x7, 0xf, 0x2, 
       0x2, 0x3b1, 0x3b2, 0x7, 0xe, 0x2, 0x2, 0x3b2, 0x3b4, 0x5, 0x90, 0x49, 
       0x2, 0x3b3, 0x39c, 0x3, 0x2, 0x2, 0x2, 0x3b3, 0x39f, 0x3, 0x2, 0x2, 
       0x2, 0x3b3, 0x3a1, 0x3, 0x2, 0x2, 0x2, 0x3b3, 0x3a5, 0x3, 0x2, 0x2, 
       0x2, 0x3b3, 0x3aa, 0x3, 0x2, 0x2, 0x2, 0x3b3, 0x3ae, 0x3, 0x2, 0x2, 
       0x2, 0x3b3, 0x3b0, 0x3, 0x2, 0x2, 0x2, 0x3b4, 0x97, 0x3, 0x2, 0x2, 
       0x2, 0x3b5, 0x3b6, 0x9, 0x4, 0x2, 0x2, 0x3b6, 0x99, 0x3, 0x2, 0x2, 
       0x2, 0x3b7, 0x3b8, 0x9, 0x5, 0x2, 0x2, 0x3b8, 0x9b, 0x3, 0x2, 0x2, 
       0x2, 0x3b9, 0x3be, 0x5, 0x9a, 0x4e, 0x2, 0x3ba, 0x3bb, 0x5, 0x9a, 
       0x4e, 0x2, 0x3bb, 0x3bc, 0x5, 0x9c, 0x4f, 0x2, 0x3bc, 0x3be, 0x3, 
       0x2, 0x2, 0x2, 0x3bd, 0x3b9, 0x3, 0x2, 0x2, 0x2, 0x3bd, 0x3ba, 0x3, 
       0x2, 0x2, 0x2, 0x3be, 0x9d, 0x3, 0x2, 0x2, 0x2, 0x3bf, 0x3c0, 0x7, 
       0x29, 0x2, 0x2, 0x3c0, 0x3c1, 0x7, 0x23, 0x2, 0x2, 0x3c1, 0x3c8, 
       0x7, 0x24, 0x2, 0x2, 0x3c2, 0x3c3, 0x7, 0x29, 0x2, 0x2, 0x3c3, 0x3c4, 
       0x7, 0x23, 0x2, 0x2, 0x3c4, 0x3c5, 0x5, 0xa6, 0x54, 0x2, 0x3c5, 0x3c6, 
       0x7, 0x24, 0x2, 0x2, 0x3c6, 0x3c8, 0x3, 0x2, 0x2, 0x2, 0x3c7, 0x3bf, 
       0x3, 0x2, 0x2, 0x2, 0x3c7, 0x3c2, 0x3, 0x2, 0x2, 0x2, 0x3c8, 0x9f, 
       0x3, 0x2, 0x2, 0x2, 0x3c9, 0x3cc, 0x5, 0x8e, 0x48, 0x2, 0x3ca, 0x3cc, 
       0x5, 0x94, 0x4b, 0x2, 0x3cb, 0x3c9, 0x3, 0x2, 0x2, 0x2, 0x3cb, 0x3ca, 
       0x3, 0x2, 0x2, 0x2, 0x3cc, 0xa1, 0x3, 0x2, 0x2, 0x2, 0x3cd, 0x3ce, 
       0x5, 0xa4, 0x53, 0x2, 0x3ce, 0xa3, 0x3, 0x2, 0x2, 0x2, 0x3cf, 0x3d4, 
       0x5, 0x6, 0x4, 0x2, 0x3d0, 0x3d1, 0x5, 0x6, 0x4, 0x2, 0x3d1, 0x3d2, 
       0x5, 0xa4, 0x53, 0x2, 0x3d2, 0x3d4, 0x3, 0x2, 0x2, 0x2, 0x3d3, 0x3cf, 
       0x3, 0x2, 0x2, 0x2, 0x3d3, 0x3d0, 0x3, 0x2, 0x2, 0x2, 0x3d4, 0xa5, 
       0x3, 0x2, 0x2, 0x2, 0x3d5, 0x3d6, 0x5, 0xa8, 0x55, 0x2, 0x3d6, 0xa7, 
       0x3, 0x2, 0x2, 0x2, 0x3d7, 0x3dd, 0x5, 0xaa, 0x56, 0x2, 0x3d8, 0x3d9, 
       0x5, 0xaa, 0x56, 0x2, 0x3d9, 0x3da, 0x7, 0x1e, 0x2, 0x2, 0x3da, 0x3db, 
       0x5, 0xa8, 0x55, 0x2, 0x3db, 0x3dd, 0x3, 0x2, 0x2, 0x2, 0x3dc, 0x3d7, 
       0x3, 0x2, 0x2, 0x2, 0x3dc, 0x3d8, 0x3, 0x2, 0x2, 0x2, 0x3dd, 0xa9, 
       0x3, 0x2, 0x2, 0x2, 0x3de, 0x3df, 0x7, 0x29, 0x2, 0x2, 0x3df, 0x3e0, 
       0x7, 0x2b, 0x2, 0x2, 0x3e0, 0xab, 0x3, 0x2, 0x2, 0x2, 0x3e1, 0x3e5, 
       0x5, 0xae, 0x58, 0x2, 0x3e2, 0x3e5, 0x5, 0xb4, 0x5b, 0x2, 0x3e3, 
       0x3e5, 0x5, 0xba, 0x5e, 0x2, 0x3e4, 0x3e1, 0x3, 0x2, 0x2, 0x2, 0x3e4, 
       0x3e2, 0x3, 0x2, 0x2, 0x2, 0x3e4, 0x3e3, 0x3, 0x2, 0x2, 0x2, 0x3e5, 
       0xad, 0x3, 0x2, 0x2, 0x2, 0x3e6, 0x3e7, 0x5, 0xb0, 0x59, 0x2, 0x3e7, 
       0xaf, 0x3, 0x2, 0x2, 0x2, 0x3e8, 0x3e9, 0x7, 0x10, 0x2, 0x2, 0x3e9, 
       0x3ea, 0x7, 0x29, 0x2, 0x2, 0x3ea, 0x3eb, 0x7, 0x21, 0x2, 0x2, 0x3eb, 
       0x402, 0x7, 0x22, 0x2, 0x2, 0x3ec, 0x3ed, 0x7, 0x10, 0x2, 0x2, 0x3ed, 
       0x3ee, 0x7, 0x29, 0x2, 0x2, 0x3ee, 0x3ef, 0x7, 0x21, 0x2, 0x2, 0x3ef, 
       0x3f0, 0x5, 0xb2, 0x5a, 0x2, 0x3f0, 0x3f1, 0x7, 0x22, 0x2, 0x2, 0x3f1, 
       0x402, 0x3, 0x2, 0x2, 0x2, 0x3f2, 0x3f3, 0x7, 0x10, 0x2, 0x2, 0x3f3, 
       0x3f4, 0x7, 0x29, 0x2, 0x2, 0x3f4, 0x3f5, 0x7, 0x12, 0x2, 0x2, 0x3f5, 
       0x3f6, 0x5, 0x3e, 0x20, 0x2, 0x3f6, 0x3f7, 0x7, 0x21, 0x2, 0x2, 0x3f7, 
       0x3f8, 0x7, 0x22, 0x2, 0x2, 0x3f8, 0x402, 0x3, 0x2, 0x2, 0x2, 0x3f9, 
       0x3fa, 0x7, 0x10, 0x2, 0x2, 0x3fa, 0x3fb, 0x7, 0x29, 0x2, 0x2, 0x3fb, 
       0x3fc, 0x7, 0x12, 0x2, 0x2, 0x3fc, 0x3fd, 0x5, 0x3e, 0x20, 0x2, 0x3fd, 
       0x3fe, 0x7, 0x21, 0x2, 0x2, 0x3fe, 0x3ff, 0x5, 0xb2, 0x5a, 0x2, 0x3ff, 
       0x400, 0x7, 0x22, 0x2, 0x2, 0x400, 0x402, 0x3, 0x2, 0x2, 0x2, 0x401, 
       0x3e8, 0x3, 0x2, 0x2, 0x2, 0x401, 0x3ec, 0x3, 0x2, 0x2, 0x2, 0x401, 
       0x3f2, 0x3, 0x2, 0x2, 0x2, 0x401, 0x3f9, 0x3, 0x2, 0x2, 0x2, 0x402, 
       0xb1, 0x3, 0x2, 0x2, 0x2, 0x403, 0x404, 0x5, 0xa4, 0x53, 0x2, 0x404, 
       0xb3, 0x3, 0x2, 0x2, 0x2, 0x405, 0x406, 0x5, 0xb6, 0x5c, 0x2, 0x406, 
       0xb5, 0x3, 0x2, 0x2, 0x2, 0x407, 0x408, 0x7, 0x11, 0x2, 0x2, 0x408, 
       0x409, 0x7, 0x29, 0x2, 0x2, 0x409, 0x40a, 0x7, 0x21, 0x2, 0x2, 0x40a, 
       0x421, 0x7, 0x22, 0x2, 0x2, 0x40b, 0x40c, 0x7, 0x11, 0x2, 0x2, 0x40c, 
       0x40d, 0x7, 0x29, 0x2, 0x2, 0x40d, 0x40e, 0x7, 0x21, 0x2, 0x2, 0x40e, 
       0x40f, 0x5, 0xb8, 0x5d, 0x2, 0x40f, 0x410, 0x7, 0x22, 0x2, 0x2, 0x410, 
       0x421, 0x3, 0x2, 0x2, 0x2, 0x411, 0x412, 0x7, 0x11, 0x2, 0x2, 0x412, 
       0x413, 0x7, 0x29, 0x2, 0x2, 0x413, 0x414, 0x7, 0x12, 0x2, 0x2, 0x414, 
       0x415, 0x5, 0x3e, 0x20, 0x2, 0x415, 0x416, 0x7, 0x21, 0x2, 0x2, 0x416, 
       0x417, 0x7, 0x22, 0x2, 0x2, 0x417, 0x421, 0x3, 0x2, 0x2, 0x2, 0x418, 
       0x419, 0x7, 0x11, 0x2, 0x2, 0x419, 0x41a, 0x7, 0x29, 0x2, 0x2, 0x41a, 
       0x41b, 0x7, 0x12, 0x2, 0x2, 0x41b, 0x41c, 0x5, 0x3e, 0x20, 0x2, 0x41c, 
       0x41d, 0x7, 0x21, 0x2, 0x2, 0x41d, 0x41e, 0x5, 0xb8, 0x5d, 0x2, 0x41e, 
       0x41f, 0x7, 0x22, 0x2, 0x2, 0x41f, 0x421, 0x3, 0x2, 0x2, 0x2, 0x420, 
       0x407, 0x3, 0x2, 0x2, 0x2, 0x420, 0x40b, 0x3, 0x2, 0x2, 0x2, 0x420, 
       0x411, 0x3, 0x2, 0x2, 0x2, 0x420, 0x418, 0x3, 0x2, 0x2, 0x2, 0x421, 
       0xb7, 0x3, 0x2, 0x2, 0x2, 0x422, 0x423, 0x5, 0xa4, 0x53, 0x2, 0x423, 
       0xb9, 0x3, 0x2, 0x2, 0x2, 0x424, 0x425, 0x5, 0xbe, 0x60, 0x2, 0x425, 
       0x426, 0x7, 0x21, 0x2, 0x2, 0x426, 0x427, 0x7, 0x22, 0x2, 0x2, 0x427, 
       0x42e, 0x3, 0x2, 0x2, 0x2, 0x428, 0x429, 0x5, 0xbe, 0x60, 0x2, 0x429, 
       0x42a, 0x7, 0x21, 0x2, 0x2, 0x42a, 0x42b, 0x5, 0xbc, 0x5f, 0x2, 0x42b, 
       0x42c, 0x7, 0x22, 0x2, 0x2, 0x42c, 0x42e, 0x3, 0x2, 0x2, 0x2, 0x42d, 
       0x424, 0x3, 0x2, 0x2, 0x2, 0x42d, 0x428, 0x3, 0x2, 0x2, 0x2, 0x42e, 
       0xbb, 0x3, 0x2, 0x2, 0x2, 0x42f, 0x430, 0x5, 0xa4, 0x53, 0x2, 0x430, 
       0xbd, 0x3, 0x2, 0x2, 0x2, 0x431, 0x432, 0x7, 0x13, 0x2, 0x2, 0x432, 
       0x458, 0x7, 0x29, 0x2, 0x2, 0x433, 0x434, 0x7, 0x13, 0x2, 0x2, 0x434, 
       0x435, 0x7, 0x29, 0x2, 0x2, 0x435, 0x436, 0x7, 0x12, 0x2, 0x2, 0x436, 
       0x458, 0x5, 0x3e, 0x20, 0x2, 0x437, 0x438, 0x7, 0x13, 0x2, 0x2, 0x438, 
       0x439, 0x7, 0x29, 0x2, 0x2, 0x439, 0x43a, 0x7, 0x14, 0x2, 0x2, 0x43a, 
       0x458, 0x5, 0x3e, 0x20, 0x2, 0x43b, 0x43c, 0x7, 0x13, 0x2, 0x2, 0x43c, 
       0x43d, 0x7, 0x29, 0x2, 0x2, 0x43d, 0x43e, 0x7, 0x12, 0x2, 0x2, 0x43e, 
       0x43f, 0x5, 0x3e, 0x20, 0x2, 0x43f, 0x440, 0x7, 0x14, 0x2, 0x2, 0x440, 
       0x441, 0x5, 0xc0, 0x61, 0x2, 0x441, 0x458, 0x3, 0x2, 0x2, 0x2, 0x442, 
       0x443, 0x7, 0xf, 0x2, 0x2, 0x443, 0x444, 0x7, 0x13, 0x2, 0x2, 0x444, 
       0x458, 0x7, 0x29, 0x2, 0x2, 0x445, 0x446, 0x7, 0xf, 0x2, 0x2, 0x446, 
       0x447, 0x7, 0x13, 0x2, 0x2, 0x447, 0x448, 0x7, 0x29, 0x2, 0x2, 0x448, 
       0x449, 0x7, 0x12, 0x2, 0x2, 0x449, 0x458, 0x5, 0x3e, 0x20, 0x2, 0x44a, 
       0x44b, 0x7, 0xf, 0x2, 0x2, 0x44b, 0x44c, 0x7, 0x13, 0x2, 0x2, 0x44c, 
       0x44d, 0x7, 0x29, 0x2, 0x2, 0x44d, 0x44e, 0x7, 0x14, 0x2, 0x2, 0x44e, 
       0x458, 0x5, 0x3e, 0x20, 0x2, 0x44f, 0x450, 0x7, 0xf, 0x2, 0x2, 0x450, 
       0x451, 0x7, 0x13, 0x2, 0x2, 0x451, 0x452, 0x7, 0x29, 0x2, 0x2, 0x452, 
       0x453, 0x7, 0x12, 0x2, 0x2, 0x453, 0x454, 0x5, 0x3e, 0x20, 0x2, 0x454, 
       0x455, 0x7, 0x14, 0x2, 0x2, 0x455, 0x456, 0x5, 0xc0, 0x61, 0x2, 0x456, 
       0x458, 0x3, 0x2, 0x2, 0x2, 0x457, 0x431, 0x3, 0x2, 0x2, 0x2, 0x457, 
       0x433, 0x3, 0x2, 0x2, 0x2, 0x457, 0x437, 0x3, 0x2, 0x2, 0x2, 0x457, 
       0x43b, 0x3, 0x2, 0x2, 0x2, 0x457, 0x442, 0x3, 0x2, 0x2, 0x2, 0x457, 
       0x445, 0x3, 0x2, 0x2, 0x2, 0x457, 0x44a, 0x3, 0x2, 0x2, 0x2, 0x457, 
       0x44f, 0x3, 0x2, 0x2, 0x2, 0x458, 0xbf, 0x3, 0x2, 0x2, 0x2, 0x459, 
       0x45a, 0x7, 0x29, 0x2, 0x2, 0x45a, 0xc1, 0x3, 0x2, 0x2, 0x2, 0x45b, 
       0x460, 0x5, 0xc4, 0x63, 0x2, 0x45c, 0x45d, 0x5, 0xc4, 0x63, 0x2, 
       0x45d, 0x45e, 0x5, 0xc2, 0x62, 0x2, 0x45e, 0x460, 0x3, 0x2, 0x2, 
       0x2, 0x45f, 0x45b, 0x3, 0x2, 0x2, 0x2, 0x45f, 0x45c, 0x3, 0x2, 0x2, 
       0x2, 0x460, 0xc3, 0x3, 0x2, 0x2, 0x2, 0x461, 0x484, 0x7, 0x29, 0x2, 
       0x2, 0x462, 0x463, 0x7, 0x29, 0x2, 0x2, 0x463, 0x484, 0x7, 0x1b, 
       0x2, 0x2, 0x464, 0x465, 0x7, 0x29, 0x2, 0x2, 0x465, 0x484, 0x5, 0xc6, 
       0x64, 0x2, 0x466, 0x467, 0x7, 0x29, 0x2, 0x2, 0x467, 0x468, 0x5, 
       0xc6, 0x64, 0x2, 0x468, 0x469, 0x7, 0x1b, 0x2, 0x2, 0x469, 0x484, 
       0x3, 0x2, 0x2, 0x2, 0x46a, 0x46b, 0x5, 0x2e, 0x18, 0x2, 0x46b, 0x46c, 
       0x7, 0x29, 0x2, 0x2, 0x46c, 0x484, 0x3, 0x2, 0x2, 0x2, 0x46d, 0x46e, 
       0x7, 0x29, 0x2, 0x2, 0x46e, 0x484, 0x7, 0x1b, 0x2, 0x2, 0x46f, 0x470, 
       0x5, 0x2e, 0x18, 0x2, 0x470, 0x471, 0x7, 0x29, 0x2, 0x2, 0x471, 0x472, 
       0x5, 0xc6, 0x64, 0x2, 0x472, 0x484, 0x3, 0x2, 0x2, 0x2, 0x473, 0x474, 
       0x7, 0x29, 0x2, 0x2, 0x474, 0x475, 0x5, 0xc6, 0x64, 0x2, 0x475, 0x476, 
       0x7, 0x1b, 0x2, 0x2, 0x476, 0x484, 0x3, 0x2, 0x2, 0x2, 0x477, 0x478, 
       0x7, 0x29, 0x2, 0x2, 0x478, 0x484, 0x5, 0x30, 0x19, 0x2, 0x479, 0x47a, 
       0x7, 0x29, 0x2, 0x2, 0x47a, 0x484, 0x7, 0x1b, 0x2, 0x2, 0x47b, 0x47c, 
       0x7, 0x29, 0x2, 0x2, 0x47c, 0x47d, 0x5, 0xc6, 0x64, 0x2, 0x47d, 0x47e, 
       0x5, 0x30, 0x19, 0x2, 0x47e, 0x484, 0x3, 0x2, 0x2, 0x2, 0x47f, 0x480, 
       0x7, 0x29, 0x2, 0x2, 0x480, 0x481, 0x5, 0xc6, 0x64, 0x2, 0x481, 0x482, 
       0x7, 0x1b, 0x2, 0x2, 0x482, 0x484, 0x3, 0x2, 0x2, 0x2, 0x483, 0x461, 
       0x3, 0x2, 0x2, 0x2, 0x483, 0x462, 0x3, 0x2, 0x2, 0x2, 0x483, 0x464, 
       0x3, 0x2, 0x2, 0x2, 0x483, 0x466, 0x3, 0x2, 0x2, 0x2, 0x483, 0x46a, 
       0x3, 0x2, 0x2, 0x2, 0x483, 0x46d, 0x3, 0x2, 0x2, 0x2, 0x483, 0x46f, 
       0x3, 0x2, 0x2, 0x2, 0x483, 0x473, 0x3, 0x2, 0x2, 0x2, 0x483, 0x477, 
       0x3, 0x2, 0x2, 0x2, 0x483, 0x479, 0x3, 0x2, 0x2, 0x2, 0x483, 0x47b, 
       0x3, 0x2, 0x2, 0x2, 0x483, 0x47f, 0x3, 0x2, 0x2, 0x2, 0x484, 0xc5, 
       0x3, 0x2, 0x2, 0x2, 0x485, 0x486, 0x7, 0x1f, 0x2, 0x2, 0x486, 0x487, 
       0x5, 0xc8, 0x65, 0x2, 0x487, 0x488, 0x7, 0x20, 0x2, 0x2, 0x488, 0x48f, 
       0x3, 0x2, 0x2, 0x2, 0x489, 0x48a, 0x7, 0x1f, 0x2, 0x2, 0x48a, 0x48b, 
       0x5, 0xc8, 0x65, 0x2, 0x48b, 0x48c, 0x7, 0x20, 0x2, 0x2, 0x48c, 0x48d, 
       0x5, 0xc6, 0x64, 0x2, 0x48d, 0x48f, 0x3, 0x2, 0x2, 0x2, 0x48e, 0x485, 
       0x3, 0x2, 0x2, 0x2, 0x48e, 0x489, 0x3, 0x2, 0x2, 0x2, 0x48f, 0xc7, 
       0x3, 0x2, 0x2, 0x2, 0x490, 0x491, 0x5, 0x2a, 0x16, 0x2, 0x491, 0xc9, 
       0x3, 0x2, 0x2, 0x2, 0x492, 0x493, 0x7, 0x23, 0x2, 0x2, 0x493, 0x494, 
       0x5, 0xcc, 0x67, 0x2, 0x494, 0x495, 0x7, 0x24, 0x2, 0x2, 0x495, 0x4a4, 
       0x3, 0x2, 0x2, 0x2, 0x496, 0x497, 0x7, 0x23, 0x2, 0x2, 0x497, 0x498, 
       0x5, 0xcc, 0x67, 0x2, 0x498, 0x499, 0x7, 0x24, 0x2, 0x2, 0x499, 0x49a, 
       0x7, 0x23, 0x2, 0x2, 0x49a, 0x49b, 0x7, 0x24, 0x2, 0x2, 0x49b, 0x4a4, 
       0x3, 0x2, 0x2, 0x2, 0x49c, 0x49d, 0x7, 0x23, 0x2, 0x2, 0x49d, 0x49e, 
       0x5, 0xcc, 0x67, 0x2, 0x49e, 0x49f, 0x7, 0x24, 0x2, 0x2, 0x49f, 0x4a0, 
       0x7, 0x23, 0x2, 0x2, 0x4a0, 0x4a1, 0x5, 0x2a, 0x16, 0x2, 0x4a1, 0x4a2, 
       0x7, 0x24, 0x2, 0x2, 0x4a2, 0x4a4, 0x3, 0x2, 0x2, 0x2, 0x4a3, 0x492, 
       0x3, 0x2, 0x2, 0x2, 0x4a3, 0x496, 0x3, 0x2, 0x2, 0x2, 0x4a3, 0x49c, 
       0x3, 0x2, 0x2, 0x2, 0x4a4, 0xcb, 0x3, 0x2, 0x2, 0x2, 0x4a5, 0x4a6, 
       0x5, 0xce, 0x68, 0x2, 0x4a6, 0x4a7, 0x7, 0x21, 0x2, 0x2, 0x4a7, 0x4a8, 
       0x7, 0x22, 0x2, 0x2, 0x4a8, 0x4af, 0x3, 0x2, 0x2, 0x2, 0x4a9, 0x4aa, 
       0x5, 0xce, 0x68, 0x2, 0x4aa, 0x4ab, 0x7, 0x21, 0x2, 0x2, 0x4ab, 0x4ac, 
       0x5, 0xa2, 0x52, 0x2, 0x4ac, 0x4ad, 0x7, 0x22, 0x2, 0x2, 0x4ad, 0x4af, 
       0x3, 0x2, 0x2, 0x2, 0x4ae, 0x4a5, 0x3, 0x2, 0x2, 0x2, 0x4ae, 0x4a9, 
       0x3, 0x2, 0x2, 0x2, 0x4af, 0xcd, 0x3, 0x2, 0x2, 0x2, 0x4b0, 0x4b1, 
       0x7, 0xa, 0x2, 0x2, 0x4b1, 0x4b2, 0x7, 0x23, 0x2, 0x2, 0x4b2, 0x4ca, 
       0x7, 0x24, 0x2, 0x2, 0x4b3, 0x4b4, 0x7, 0xa, 0x2, 0x2, 0x4b4, 0x4b5, 
       0x7, 0x23, 0x2, 0x2, 0x4b5, 0x4b6, 0x7, 0x24, 0x2, 0x2, 0x4b6, 0x4b9, 
       0x7, 0x18, 0x2, 0x2, 0x4b7, 0x4ba, 0x5, 0x92, 0x4a, 0x2, 0x4b8, 0x4ba, 
       0x7, 0x2b, 0x2, 0x2, 0x4b9, 0x4b7, 0x3, 0x2, 0x2, 0x2, 0x4b9, 0x4b8, 
       0x3, 0x2, 0x2, 0x2, 0x4ba, 0x4ca, 0x3, 0x2, 0x2, 0x2, 0x4bb, 0x4bc, 
       0x7, 0xa, 0x2, 0x2, 0x4bc, 0x4bd, 0x7, 0x23, 0x2, 0x2, 0x4bd, 0x4be, 
       0x5, 0xa6, 0x54, 0x2, 0x4be, 0x4bf, 0x7, 0x24, 0x2, 0x2, 0x4bf, 0x4ca, 
       0x3, 0x2, 0x2, 0x2, 0x4c0, 0x4c1, 0x7, 0xa, 0x2, 0x2, 0x4c1, 0x4c2, 
       0x7, 0x23, 0x2, 0x2, 0x4c2, 0x4c3, 0x5, 0xa6, 0x54, 0x2, 0x4c3, 0x4c4, 
       0x7, 0x24, 0x2, 0x2, 0x4c4, 0x4c7, 0x7, 0x18, 0x2, 0x2, 0x4c5, 0x4c8, 
       0x5, 0x92, 0x4a, 0x2, 0x4c6, 0x4c8, 0x7, 0x2b, 0x2, 0x2, 0x4c7, 0x4c5, 
       0x3, 0x2, 0x2, 0x2, 0x4c7, 0x4c6, 0x3, 0x2, 0x2, 0x2, 0x4c8, 0x4ca, 
       0x3, 0x2, 0x2, 0x2, 0x4c9, 0x4b0, 0x3, 0x2, 0x2, 0x2, 0x4c9, 0x4b3, 
       0x3, 0x2, 0x2, 0x2, 0x4c9, 0x4bb, 0x3, 0x2, 0x2, 0x2, 0x4c9, 0x4c0, 
       0x3, 0x2, 0x2, 0x2, 0x4ca, 0xcf, 0x3, 0x2, 0x2, 0x2, 0x4cb, 0x4e4, 
       0x7, 0x29, 0x2, 0x2, 0x4cc, 0x4cd, 0x7, 0x29, 0x2, 0x2, 0x4cd, 0x4e4, 
       0x7, 0x2b, 0x2, 0x2, 0x4ce, 0x4e4, 0x7, 0x2d, 0x2, 0x2, 0x4cf, 0x4d0, 
       0x7, 0x2d, 0x2, 0x2, 0x4d0, 0x4e4, 0x7, 0x2b, 0x2, 0x2, 0x4d1, 0x4e4, 
       0x7, 0x2e, 0x2, 0x2, 0x4d2, 0x4d3, 0x7, 0x2e, 0x2, 0x2, 0x4d3, 0x4e4, 
       0x7, 0x2b, 0x2, 0x2, 0x4d4, 0x4e4, 0x7, 0x2c, 0x2, 0x2, 0x4d5, 0x4e4, 
       0x5, 0x20, 0x11, 0x2, 0x4d6, 0x4e4, 0x5, 0x24, 0x13, 0x2, 0x4d7, 
       0x4e4, 0x5, 0x2a, 0x16, 0x2, 0x4d8, 0x4e4, 0x5, 0x34, 0x1b, 0x2, 
       0x4d9, 0x4da, 0x5, 0xd2, 0x6a, 0x2, 0x4da, 0x4db, 0x7, 0x1b, 0x2, 
       0x2, 0x4db, 0x4dc, 0x5, 0xd4, 0x6b, 0x2, 0x4dc, 0x4e4, 0x3, 0x2, 
       0x2, 0x2, 0x4dd, 0x4de, 0x5, 0xd2, 0x6a, 0x2, 0x4de, 0x4df, 0x7, 
       0x1d, 0x2, 0x2, 0x4df, 0x4e0, 0x5, 0xd4, 0x6b, 0x2, 0x4e0, 0x4e4, 
       0x3, 0x2, 0x2, 0x2, 0x4e1, 0x4e4, 0x5, 0xca, 0x66, 0x2, 0x4e2, 0x4e4, 
       0x5, 0xc2, 0x62, 0x2, 0x4e3, 0x4cb, 0x3, 0x2, 0x2, 0x2, 0x4e3, 0x4cc, 
       0x3, 0x2, 0x2, 0x2, 0x4e3, 0x4ce, 0x3, 0x2, 0x2, 0x2, 0x4e3, 0x4cf, 
       0x3, 0x2, 0x2, 0x2, 0x4e3, 0x4d1, 0x3, 0x2, 0x2, 0x2, 0x4e3, 0x4d2, 
       0x3, 0x2, 0x2, 0x2, 0x4e3, 0x4d4, 0x3, 0x2, 0x2, 0x2, 0x4e3, 0x4d5, 
       0x3, 0x2, 0x2, 0x2, 0x4e3, 0x4d6, 0x3, 0x2, 0x2, 0x2, 0x4e3, 0x4d7, 
       0x3, 0x2, 0x2, 0x2, 0x4e3, 0x4d8, 0x3, 0x2, 0x2, 0x2, 0x4e3, 0x4d9, 
       0x3, 0x2, 0x2, 0x2, 0x4e3, 0x4dd, 0x3, 0x2, 0x2, 0x2, 0x4e3, 0x4e1, 
       0x3, 0x2, 0x2, 0x2, 0x4e3, 0x4e2, 0x3, 0x2, 0x2, 0x2, 0x4e4, 0xd1, 
       0x3, 0x2, 0x2, 0x2, 0x4e5, 0x4e6, 0x7, 0x29, 0x2, 0x2, 0x4e6, 0xd3, 
       0x3, 0x2, 0x2, 0x2, 0x4e7, 0x4e8, 0x7, 0x29, 0x2, 0x2, 0x4e8, 0xd5, 
       0x3, 0x2, 0x2, 0x2, 0x44, 0xde, 0xe9, 0xee, 0xff, 0x111, 0x142, 0x149, 
       0x15a, 0x168, 0x170, 0x177, 0x17f, 0x18a, 0x194, 0x1ee, 0x207, 0x214, 
       0x223, 0x22f, 0x235, 0x242, 0x24c, 0x261, 0x267, 0x271, 0x276, 0x27b, 
       0x285, 0x2e4, 0x2ec, 0x2fb, 0x301, 0x30a, 0x30f, 0x31f, 0x32b, 0x32f, 
       0x333, 0x33a, 0x340, 0x34c, 0x354, 0x374, 0x383, 0x393, 0x395, 0x3b3, 
       0x3bd, 0x3c7, 0x3cb, 0x3d3, 0x3dc, 0x3e4, 0x401, 0x420, 0x42d, 0x457, 
       0x45f, 0x483, 0x48e, 0x4a3, 0x4ae, 0x4b9, 0x4c7, 0x4c9, 0x4e3, 
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
