
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
    setState(156);
    fileContent(0);
    setState(157);
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
    setState(164);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 0, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        _localctx = _tracker.createInstance<FileContentContext>(parentContext, parentState);
        pushNewRecursionContext(_localctx, startState, RuleFileContent);
        setState(160);

        if (!(precpred(_ctx, 2))) throw FailedPredicateException(this, "precpred(_ctx, 2)");
        setState(161);
        sentence(); 
      }
      setState(166);
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
    setState(176);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 1, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(167);
      liveToken();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(168);
      use();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(169);
      variable();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(170);
      callingFunction();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(171);
      conditionalExpression();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(172);
      loop();
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(173);
      functions();
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(174);
      ret();
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(175);
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
    setState(178);
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
    setState(180);
    match(TParser::Use);
    setState(181);
    useValue();
    setState(182);
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
    setState(189);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 2, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(184);
      useString();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(185);
      useString();
      setState(186);
      match(TParser::Separator);
      setState(187);
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
    setState(191);
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
    setState(193);
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

TParser::MethodPermContext* TParser::VariableModesContext::methodPerm() {
  return getRuleContext<TParser::MethodPermContext>(0);
}

tree::TerminalNode* TParser::VariableModesContext::Static() {
  return getToken(TParser::Static, 0);
}

tree::TerminalNode* TParser::VariableModesContext::Final() {
  return getToken(TParser::Final, 0);
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
  enterRule(_localctx, 16, TParser::RuleVariableModes);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(242);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 3, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(195);
      match(TParser::Var);
      setState(196);
      variableMembers();
      setState(197);
      match(TParser::End);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(199);
      methodPerm();
      setState(200);
      match(TParser::Var);
      setState(201);
      variableMembers();
      setState(202);
      match(TParser::End);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(204);
      match(TParser::Static);
      setState(205);
      match(TParser::Var);
      setState(206);
      variableMembers();
      setState(207);
      match(TParser::End);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(209);
      methodPerm();
      setState(210);
      match(TParser::Static);
      setState(211);
      match(TParser::Var);
      setState(212);
      variableMembers();
      setState(213);
      match(TParser::End);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(215);
      match(TParser::Final);
      setState(216);
      methodPerm();
      setState(217);
      match(TParser::Static);
      setState(218);
      match(TParser::Var);
      setState(219);
      variableMembers();
      setState(220);
      match(TParser::End);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(222);
      match(TParser::Final);
      setState(223);
      methodPerm();
      setState(224);
      match(TParser::Var);
      setState(225);
      variableMembers();
      setState(226);
      match(TParser::End);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(228);
      match(TParser::Final);
      setState(229);
      match(TParser::Var);
      setState(230);
      variableMembers();
      setState(231);
      match(TParser::End);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(233);
      match(TParser::Final);
      setState(234);
      match(TParser::Static);
      setState(235);
      match(TParser::Var);
      setState(236);
      variableMembers();
      setState(237);
      match(TParser::End);
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(239);
      variableMembers();
      setState(240);
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
  enterRule(_localctx, 18, TParser::RuleVariableMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(249);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 4, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(244);
      variableDefinition();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(245);
      variableDefinition();
      setState(246);
      match(TParser::Separator);
      setState(247);
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
  enterRule(_localctx, 20, TParser::RuleVariableDefinition);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(266);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 5, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(251);
      match(TParser::Identifier);
      setState(252);
      variableDefinitionGeneral();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(253);
      objIdentifierA();
      setState(254);
      match(TParser::Point);
      setState(255);
      objIdentifierB();
      setState(256);
      variableDefinitionGeneral();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(258);
      objIdentifierA();
      setState(259);
      match(TParser::TwoTwoPoint);
      setState(260);
      objIdentifierB();
      setState(261);
      variableDefinitionGeneral();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(263);
      arrayAccessElements();
      setState(264);
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
  enterRule(_localctx, 22, TParser::RuleVariableDefinitionGeneral);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(280);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 6, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(268);
      _la = _input->LA(1);
      if (!(_la == TParser::Attr

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(269);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(270);
      match(TParser::TypeSpec);
      setState(271);
      _la = _input->LA(1);
      if (!(_la == TParser::Attr

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(272);
      generalValue();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(273);
      _la = _input->LA(1);
      if (!(_la == TParser::Attr

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(274);
      match(TParser::New);
      setState(275);
      generalValue();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(276);
      match(TParser::TypeSpec);
      setState(277);
      _la = _input->LA(1);
      if (!(_la == TParser::Attr

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(278);
      match(TParser::New);
      setState(279);
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
  enterRule(_localctx, 24, TParser::RuleIndexArray);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(288);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 7, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(282);
      match(TParser::OpenArIndex);
      setState(283);
      match(TParser::CloseArIndex);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(284);
      match(TParser::OpenArIndex);
      setState(285);
      indexArrayElements();
      setState(286);
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
  enterRule(_localctx, 26, TParser::RuleIndexArrayElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(295);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 8, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(290);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(291);
      generalValue();
      setState(292);
      match(TParser::Separator);
      setState(293);
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
  enterRule(_localctx, 28, TParser::RuleAssociativeArray);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(303);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 9, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(297);
      match(TParser::OpenBlock);
      setState(298);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(299);
      match(TParser::OpenBlock);
      setState(300);
      associativeArrayElements();
      setState(301);
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
  enterRule(_localctx, 30, TParser::RuleAssociativeArrayElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(314);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 10, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(305);
      match(TParser::Identifier);
      setState(306);
      match(TParser::TwoPoint);
      setState(307);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(308);
      match(TParser::Identifier);
      setState(309);
      match(TParser::TwoPoint);
      setState(310);
      generalValue();
      setState(311);
      match(TParser::Separator);
      setState(312);
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
  enterRule(_localctx, 32, TParser::RuleOperationBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(316);
    match(TParser::OpenOp);
    setState(317);
    operationElements();
    setState(318);
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
  enterRule(_localctx, 34, TParser::RuleOperationElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(324);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 11, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(320);
      operationValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(321);
      operationValue();
      setState(322);
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
  enterRule(_localctx, 36, TParser::RuleOperationValue);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(414);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 12, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(326);
      functionCall();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(327);
      functionCall();
      setState(328);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(330);
      functionCall();
      setState(331);
      match(TParser::TypeSpec);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(333);
      functionCall();
      setState(334);
      match(TParser::TypeSpec);
      setState(335);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(337);
      match(TParser::Identifier);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(338);
      match(TParser::Identifier);
      setState(339);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(340);
      match(TParser::Identifier);
      setState(341);
      match(TParser::TypeSpec);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(342);
      match(TParser::Identifier);
      setState(343);
      match(TParser::TypeSpec);
      setState(344);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(345);
      firstIncDec();
      setState(346);
      match(TParser::Identifier);
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(348);
      firstIncDec();
      setState(349);
      match(TParser::Identifier);
      setState(350);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(352);
      firstIncDec();
      setState(353);
      match(TParser::Identifier);
      setState(354);
      match(TParser::TypeSpec);
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(356);
      firstIncDec();
      setState(357);
      match(TParser::Identifier);
      setState(358);
      match(TParser::TypeSpec);
      setState(359);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 13: {
      enterOuterAlt(_localctx, 13);
      setState(361);
      match(TParser::Identifier);
      setState(362);
      lastIncDec();
      break;
    }

    case 14: {
      enterOuterAlt(_localctx, 14);
      setState(363);
      match(TParser::Identifier);
      setState(364);
      lastIncDec();
      setState(365);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 15: {
      enterOuterAlt(_localctx, 15);
      setState(367);
      match(TParser::Identifier);
      setState(368);
      lastIncDec();
      setState(369);
      match(TParser::TypeSpec);
      break;
    }

    case 16: {
      enterOuterAlt(_localctx, 16);
      setState(371);
      match(TParser::Identifier);
      setState(372);
      lastIncDec();
      setState(373);
      match(TParser::TypeSpec);
      setState(374);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 17: {
      enterOuterAlt(_localctx, 17);
      setState(376);
      match(TParser::Integer);
      break;
    }

    case 18: {
      enterOuterAlt(_localctx, 18);
      setState(377);
      match(TParser::Integer);
      setState(378);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 19: {
      enterOuterAlt(_localctx, 19);
      setState(379);
      match(TParser::Integer);
      setState(380);
      match(TParser::TypeSpec);
      break;
    }

    case 20: {
      enterOuterAlt(_localctx, 20);
      setState(381);
      match(TParser::Integer);
      setState(382);
      match(TParser::TypeSpec);
      setState(383);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 21: {
      enterOuterAlt(_localctx, 21);
      setState(384);
      match(TParser::Float);
      break;
    }

    case 22: {
      enterOuterAlt(_localctx, 22);
      setState(385);
      match(TParser::Float);
      setState(386);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 23: {
      enterOuterAlt(_localctx, 23);
      setState(387);
      match(TParser::Float);
      setState(388);
      match(TParser::TypeSpec);
      break;
    }

    case 24: {
      enterOuterAlt(_localctx, 24);
      setState(389);
      match(TParser::Float);
      setState(390);
      match(TParser::TypeSpec);
      setState(391);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 25: {
      enterOuterAlt(_localctx, 25);
      setState(392);
      operationBlock();
      break;
    }

    case 26: {
      enterOuterAlt(_localctx, 26);
      setState(393);
      operationBlock();
      setState(394);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 27: {
      enterOuterAlt(_localctx, 27);
      setState(396);
      operationBlock();
      setState(397);
      match(TParser::TypeSpec);
      break;
    }

    case 28: {
      enterOuterAlt(_localctx, 28);
      setState(399);
      operationBlock();
      setState(400);
      match(TParser::TypeSpec);
      setState(401);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 29: {
      enterOuterAlt(_localctx, 29);
      setState(403);
      arrayAccessElements();
      break;
    }

    case 30: {
      enterOuterAlt(_localctx, 30);
      setState(404);
      arrayAccessElements();
      setState(405);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 31: {
      enterOuterAlt(_localctx, 31);
      setState(407);
      arrayAccessElements();
      setState(408);
      match(TParser::TypeSpec);
      break;
    }

    case 32: {
      enterOuterAlt(_localctx, 32);
      setState(410);
      arrayAccessElements();
      setState(411);
      match(TParser::TypeSpec);
      setState(412);
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
  enterRule(_localctx, 38, TParser::RuleFirstIncDec);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(416);
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
  enterRule(_localctx, 40, TParser::RuleLastIncDec);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(418);
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
  enterRule(_localctx, 42, TParser::RuleCallingFunction);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(420);
    functionCall();
    setState(421);
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

TParser::PointSeparatorContext* TParser::FunctionCallContext::pointSeparator() {
  return getRuleContext<TParser::PointSeparatorContext>(0);
}

TParser::FunctionCallContext* TParser::FunctionCallContext::functionCall() {
  return getRuleContext<TParser::FunctionCallContext>(0);
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
  enterRule(_localctx, 44, TParser::RuleFunctionCall);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(442);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 13, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(423);
      match(TParser::Identifier);
      setState(424);
      functionCallParam();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(425);
      match(TParser::Identifier);
      setState(426);
      match(TParser::Point);
      setState(427);
      identifierB();
      setState(428);
      functionCallParam();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(430);
      match(TParser::Identifier);
      setState(431);
      match(TParser::TwoTwoPoint);
      setState(432);
      identifierB();
      setState(433);
      functionCallParam();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(435);
      match(TParser::Identifier);
      setState(436);
      match(TParser::Point);
      setState(437);
      identifierB();
      setState(438);
      functionCallParam();
      setState(439);
      pointSeparator();
      setState(440);
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
  enterRule(_localctx, 46, TParser::RuleIdentifierB);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(444);
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
  enterRule(_localctx, 48, TParser::RulePointSeparator);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(446);
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
  enterRule(_localctx, 50, TParser::RuleFunctionCallParam);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(454);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 14, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(448);
      match(TParser::OpenOp);
      setState(449);
      match(TParser::CloseOp);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(450);
      match(TParser::OpenOp);
      setState(451);
      functionCallParamElements();
      setState(452);
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
  enterRule(_localctx, 52, TParser::RuleFunctionCallParamElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(466);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 15, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(456);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(457);
      generalValue();
      setState(458);
      match(TParser::Separator);
      setState(459);
      functionCallParamElements();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(461);
      operationElements();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(462);
      operationElements();
      setState(463);
      match(TParser::Separator);
      setState(464);
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
  enterRule(_localctx, 54, TParser::RuleConditionalExpression);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(472);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 16, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(468);
      conditionalExpressionStructBlock();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(469);
      conditionalExpressionStructBlock();
      setState(470);
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
  enterRule(_localctx, 56, TParser::RuleConditionalExpressionStructBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(485);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 17, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(474);
      ifElementUnique();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(475);
      ifElementUnique();
      setState(476);
      elifElements();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(478);
      ifElementUnique();
      setState(479);
      elseElementUnique();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(481);
      ifElementUnique();
      setState(482);
      elifElements();
      setState(483);
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
  enterRule(_localctx, 58, TParser::RuleIfElementUnique);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(487);
    match(TParser::If);
    setState(488);
    conditionalExpressionItems();
    setState(489);
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
  enterRule(_localctx, 60, TParser::RuleElifElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(495);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 18, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(491);
      elifElementUnique();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(492);
      elifElementUnique();
      setState(493);
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
  enterRule(_localctx, 62, TParser::RuleElifElementUnique);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(497);
    match(TParser::Elif);
    setState(498);
    conditionalExpressionItems();
    setState(499);
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
  enterRule(_localctx, 64, TParser::RuleElseElementUnique);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(501);
    match(TParser::Else);
    setState(502);
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
  enterRule(_localctx, 66, TParser::RuleConditionalExpressionItems);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(504);
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
  enterRule(_localctx, 68, TParser::RuleConditionalBlockElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(516);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 19, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(506);
      match(TParser::OpenBlock);
      setState(507);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(508);
      match(TParser::OpenBlock);
      setState(509);
      conditionalBlockElsItems();
      setState(510);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(512);
      conditionalExpression();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(513);
      callingFunction();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(514);
      loop();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(515);
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
  enterRule(_localctx, 70, TParser::RuleConditionalBlockElsItems);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(522);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 20, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(518);
      sentence();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(519);
      sentence();
      setState(520);
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

//----------------- ConditionalExpressionElements2Context ------------------------------------------------------------------

TParser::ConditionalExpressionElements2Context::ConditionalExpressionElements2Context(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::DefaultExpValuesContext* TParser::ConditionalExpressionElements2Context::defaultExpValues() {
  return getRuleContext<TParser::DefaultExpValuesContext>(0);
}


size_t TParser::ConditionalExpressionElements2Context::getRuleIndex() const {
  return TParser::RuleConditionalExpressionElements2;
}

void TParser::ConditionalExpressionElements2Context::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConditionalExpressionElements2(this);
}

void TParser::ConditionalExpressionElements2Context::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConditionalExpressionElements2(this);
}


antlrcpp::Any TParser::ConditionalExpressionElements2Context::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConditionalExpressionElements2(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConditionalExpressionElements2Context* TParser::conditionalExpressionElements2() {
  ConditionalExpressionElements2Context *_localctx = _tracker.createInstance<ConditionalExpressionElements2Context>(_ctx, getState());
  enterRule(_localctx, 72, TParser::RuleConditionalExpressionElements2);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(524);
    defaultExpValues();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- DefaultExpValuesContext ------------------------------------------------------------------

TParser::DefaultExpValuesContext::DefaultExpValuesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::DefaultExpValuesUniqueContext* TParser::DefaultExpValuesContext::defaultExpValuesUnique() {
  return getRuleContext<TParser::DefaultExpValuesUniqueContext>(0);
}

TParser::DefaultExpValuesContext* TParser::DefaultExpValuesContext::defaultExpValues() {
  return getRuleContext<TParser::DefaultExpValuesContext>(0);
}


size_t TParser::DefaultExpValuesContext::getRuleIndex() const {
  return TParser::RuleDefaultExpValues;
}

void TParser::DefaultExpValuesContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterDefaultExpValues(this);
}

void TParser::DefaultExpValuesContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitDefaultExpValues(this);
}


antlrcpp::Any TParser::DefaultExpValuesContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitDefaultExpValues(this);
  else
    return visitor->visitChildren(this);
}

TParser::DefaultExpValuesContext* TParser::defaultExpValues() {
  DefaultExpValuesContext *_localctx = _tracker.createInstance<DefaultExpValuesContext>(_ctx, getState());
  enterRule(_localctx, 74, TParser::RuleDefaultExpValues);

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
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 21, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(526);
      defaultExpValuesUnique();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(527);
      defaultExpValuesUnique();
      setState(528);
      defaultExpValues();
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

//----------------- DefaultExpValuesUniqueContext ------------------------------------------------------------------

TParser::DefaultExpValuesUniqueContext::DefaultExpValuesUniqueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ConditionalExpValueContext* TParser::DefaultExpValuesUniqueContext::conditionalExpValue() {
  return getRuleContext<TParser::ConditionalExpValueContext>(0);
}

tree::TerminalNode* TParser::DefaultExpValuesUniqueContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

tree::TerminalNode* TParser::DefaultExpValuesUniqueContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}


size_t TParser::DefaultExpValuesUniqueContext::getRuleIndex() const {
  return TParser::RuleDefaultExpValuesUnique;
}

void TParser::DefaultExpValuesUniqueContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterDefaultExpValuesUnique(this);
}

void TParser::DefaultExpValuesUniqueContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitDefaultExpValuesUnique(this);
}


antlrcpp::Any TParser::DefaultExpValuesUniqueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitDefaultExpValuesUnique(this);
  else
    return visitor->visitChildren(this);
}

TParser::DefaultExpValuesUniqueContext* TParser::defaultExpValuesUnique() {
  DefaultExpValuesUniqueContext *_localctx = _tracker.createInstance<DefaultExpValuesUniqueContext>(_ctx, getState());
  enterRule(_localctx, 76, TParser::RuleDefaultExpValuesUnique);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(537);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 22, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(532);
      conditionalExpValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(533);
      match(TParser::OpenOp);
      setState(534);
      conditionalExpValue();
      setState(535);
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

//----------------- ConditionalExpressionElementsContext ------------------------------------------------------------------

TParser::ConditionalExpressionElementsContext::ConditionalExpressionElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ConditionalExpValueContext* TParser::ConditionalExpressionElementsContext::conditionalExpValue() {
  return getRuleContext<TParser::ConditionalExpValueContext>(0);
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
  enterRule(_localctx, 78, TParser::RuleConditionalExpressionElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(549);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 23, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(539);
      conditionalExpValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(540);
      conditionalExpValue();
      setState(541);
      conditionalExpressionElements();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(543);
      conditionExpBlock(0);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(544);
      conditionExpBlock(0);
      setState(545);
      conditionalExpressionElements();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(547);
      match(TParser::Not);
      setState(548);
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

tree::TerminalNode* TParser::ConditionExpBlockContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
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
  size_t startState = 80;
  enterRecursionRule(_localctx, 80, TParser::RuleConditionExpBlock, precedence);

    

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
    setState(552);
    match(TParser::OpenOp);
    setState(553);
    conditionalExpressionElements();
    setState(554);
    match(TParser::CloseOp);
    _ctx->stop = _input->LT(-1);
    setState(563);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 25, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        setState(561);
        _errHandler->sync(this);
        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 24, _ctx)) {
        case 1: {
          _localctx = _tracker.createInstance<ConditionExpBlockContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleConditionExpBlock);
          setState(556);

          if (!(precpred(_ctx, 2))) throw FailedPredicateException(this, "precpred(_ctx, 2)");
          setState(557);
          match(TParser::AssignmentOperator);
          break;
        }

        case 2: {
          _localctx = _tracker.createInstance<ConditionExpBlockContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleConditionExpBlock);
          setState(558);

          if (!(precpred(_ctx, 1))) throw FailedPredicateException(this, "precpred(_ctx, 1)");
          setState(559);
          match(TParser::TypeSpec);
          setState(560);
          match(TParser::AssignmentOperator);
          break;
        }

        default:
          break;
        } 
      }
      setState(565);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 25, _ctx);
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

TParser::FunctionCallContext* TParser::ConditionalExpValueContext::functionCall() {
  return getRuleContext<TParser::FunctionCallContext>(0);
}

TParser::IdentifierAttrFnContext* TParser::ConditionalExpValueContext::identifierAttrFn() {
  return getRuleContext<TParser::IdentifierAttrFnContext>(0);
}

tree::TerminalNode* TParser::ConditionalExpValueContext::Attr() {
  return getToken(TParser::Attr, 0);
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
  enterRule(_localctx, 82, TParser::RuleConditionalExpValue);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(674);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 26, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(566);
      firstIncDec();
      setState(567);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(569);
      firstIncDec();
      setState(570);
      match(TParser::Identifier);
      setState(571);
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
      setState(573);
      firstIncDec();
      setState(574);
      match(TParser::Identifier);
      setState(575);
      match(TParser::TypeSpec);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(577);
      firstIncDec();
      setState(578);
      match(TParser::Identifier);
      setState(579);
      match(TParser::TypeSpec);
      setState(580);
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
      setState(582);
      match(TParser::Identifier);
      setState(583);
      lastIncDec();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(584);
      match(TParser::Identifier);
      setState(585);
      lastIncDec();
      setState(586);
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
      setState(588);
      match(TParser::Identifier);
      setState(589);
      lastIncDec();
      setState(590);
      match(TParser::TypeSpec);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(592);
      match(TParser::Identifier);
      setState(593);
      lastIncDec();
      setState(594);
      match(TParser::TypeSpec);
      setState(595);
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
      setState(597);
      match(TParser::Integer);
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(598);
      match(TParser::Integer);
      setState(599);
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
      setState(600);
      match(TParser::Integer);
      setState(601);
      match(TParser::TypeSpec);
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(602);
      match(TParser::Integer);
      setState(603);
      match(TParser::TypeSpec);
      setState(604);
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
      setState(605);
      match(TParser::Float);
      break;
    }

    case 14: {
      enterOuterAlt(_localctx, 14);
      setState(606);
      match(TParser::Float);
      setState(607);
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
      setState(608);
      match(TParser::Float);
      setState(609);
      match(TParser::TypeSpec);
      break;
    }

    case 16: {
      enterOuterAlt(_localctx, 16);
      setState(610);
      match(TParser::Float);
      setState(611);
      match(TParser::TypeSpec);
      setState(612);
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
      setState(613);
      functionCall();
      break;
    }

    case 18: {
      enterOuterAlt(_localctx, 18);
      setState(614);
      functionCall();
      setState(615);
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
      setState(617);
      functionCall();
      setState(618);
      match(TParser::TypeSpec);
      break;
    }

    case 20: {
      enterOuterAlt(_localctx, 20);
      setState(620);
      functionCall();
      setState(621);
      match(TParser::TypeSpec);
      setState(622);
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
      setState(624);
      identifierAttrFn();
      setState(625);
      match(TParser::Attr);
      setState(626);
      functionCall();
      break;
    }

    case 22: {
      enterOuterAlt(_localctx, 22);
      setState(628);
      identifierAttrFn();
      setState(629);
      match(TParser::Attr);
      setState(630);
      functionCall();
      setState(631);
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
      setState(633);
      identifierAttrFn();
      setState(634);
      match(TParser::Attr);
      setState(635);
      functionCall();
      setState(636);
      match(TParser::TypeSpec);
      break;
    }

    case 24: {
      enterOuterAlt(_localctx, 24);
      setState(638);
      identifierAttrFn();
      setState(639);
      match(TParser::Attr);
      setState(640);
      functionCall();
      setState(641);
      match(TParser::TypeSpec);
      setState(642);
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
      setState(644);
      operationBlock();
      break;
    }

    case 26: {
      enterOuterAlt(_localctx, 26);
      setState(645);
      operationBlock();
      setState(646);
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
      setState(648);
      operationBlock();
      setState(649);
      match(TParser::TypeSpec);
      break;
    }

    case 28: {
      enterOuterAlt(_localctx, 28);
      setState(651);
      operationBlock();
      setState(652);
      match(TParser::TypeSpec);
      setState(653);
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
      setState(655);
      match(TParser::Identifier);
      break;
    }

    case 30: {
      enterOuterAlt(_localctx, 30);
      setState(656);
      match(TParser::Identifier);
      setState(657);
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
      setState(658);
      match(TParser::Identifier);
      setState(659);
      match(TParser::TypeSpec);
      break;
    }

    case 32: {
      enterOuterAlt(_localctx, 32);
      setState(660);
      match(TParser::Identifier);
      setState(661);
      match(TParser::TypeSpec);
      setState(662);
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

    case 33: {
      enterOuterAlt(_localctx, 33);
      setState(663);
      arrayAccessElements();
      break;
    }

    case 34: {
      enterOuterAlt(_localctx, 34);
      setState(664);
      arrayAccessElements();
      setState(665);
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

    case 35: {
      enterOuterAlt(_localctx, 35);
      setState(667);
      arrayAccessElements();
      setState(668);
      match(TParser::TypeSpec);
      break;
    }

    case 36: {
      enterOuterAlt(_localctx, 36);
      setState(670);
      arrayAccessElements();
      setState(671);
      match(TParser::TypeSpec);
      setState(672);
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

//----------------- IdentifierAttrFnContext ------------------------------------------------------------------

TParser::IdentifierAttrFnContext::IdentifierAttrFnContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ArrayAccessElementsContext* TParser::IdentifierAttrFnContext::arrayAccessElements() {
  return getRuleContext<TParser::ArrayAccessElementsContext>(0);
}

tree::TerminalNode* TParser::IdentifierAttrFnContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
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
  enterRule(_localctx, 84, TParser::RuleIdentifierAttrFn);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(683);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 27, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(676);
      arrayAccessElements();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(677);
      arrayAccessElements();
      setState(678);
      match(TParser::TypeSpec);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(680);
      match(TParser::Identifier);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(681);
      match(TParser::Identifier);
      setState(682);
      match(TParser::TypeSpec);
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

tree::TerminalNode* TParser::LoopContext::For() {
  return getToken(TParser::For, 0);
}

TParser::LoopExpressionContext* TParser::LoopContext::loopExpression() {
  return getRuleContext<TParser::LoopExpressionContext>(0);
}

tree::TerminalNode* TParser::LoopContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::LoopContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::LoopBlockElementsContext* TParser::LoopContext::loopBlockElements() {
  return getRuleContext<TParser::LoopBlockElementsContext>(0);
}

TParser::CallingFunctionContext* TParser::LoopContext::callingFunction() {
  return getRuleContext<TParser::CallingFunctionContext>(0);
}

TParser::LoopBlockElementsLimitedContext* TParser::LoopContext::loopBlockElementsLimited() {
  return getRuleContext<TParser::LoopBlockElementsLimitedContext>(0);
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
  enterRule(_localctx, 86, TParser::RuleLoop);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(704);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 28, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(685);
      match(TParser::For);
      setState(686);
      loopExpression();
      setState(687);
      match(TParser::OpenBlock);
      setState(688);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(690);
      match(TParser::For);
      setState(691);
      loopExpression();
      setState(692);
      match(TParser::OpenBlock);
      setState(693);
      loopBlockElements();
      setState(694);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(696);
      match(TParser::For);
      setState(697);
      loopExpression();
      setState(698);
      callingFunction();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(700);
      match(TParser::For);
      setState(701);
      loopExpression();
      setState(702);
      loopBlockElementsLimited();
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

//----------------- LoopExpressionContext ------------------------------------------------------------------

TParser::LoopExpressionContext::LoopExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::LoopExpressionContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

TParser::LoopOneMembersContext* TParser::LoopExpressionContext::loopOneMembers() {
  return getRuleContext<TParser::LoopOneMembersContext>(0);
}

std::vector<tree::TerminalNode *> TParser::LoopExpressionContext::End() {
  return getTokens(TParser::End);
}

tree::TerminalNode* TParser::LoopExpressionContext::End(size_t i) {
  return getToken(TParser::End, i);
}

TParser::LoopTwoMembersContext* TParser::LoopExpressionContext::loopTwoMembers() {
  return getRuleContext<TParser::LoopTwoMembersContext>(0);
}

TParser::LoopThreeMembersContext* TParser::LoopExpressionContext::loopThreeMembers() {
  return getRuleContext<TParser::LoopThreeMembersContext>(0);
}

tree::TerminalNode* TParser::LoopExpressionContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}

TParser::ConditionalExpressionElementsContext* TParser::LoopExpressionContext::conditionalExpressionElements() {
  return getRuleContext<TParser::ConditionalExpressionElementsContext>(0);
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
  enterRule(_localctx, 88, TParser::RuleLoopExpression);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(724);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 29, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(706);
      match(TParser::OpenOp);
      setState(707);
      loopOneMembers();
      setState(708);
      match(TParser::End);
      setState(709);
      loopTwoMembers();
      setState(710);
      match(TParser::End);
      setState(711);
      loopThreeMembers();
      setState(712);
      match(TParser::CloseOp);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(714);
      loopOneMembers();
      setState(715);
      match(TParser::End);
      setState(716);
      loopTwoMembers();
      setState(717);
      match(TParser::End);
      setState(718);
      loopThreeMembers();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(720);
      conditionalExpressionElements();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(721);
      match(TParser::OpenOp);
      setState(722);
      match(TParser::CloseOp);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);

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

//----------------- LoopOneMembersContext ------------------------------------------------------------------

TParser::LoopOneMembersContext::LoopOneMembersContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::VariableMembersContext* TParser::LoopOneMembersContext::variableMembers() {
  return getRuleContext<TParser::VariableMembersContext>(0);
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
  enterRule(_localctx, 90, TParser::RuleLoopOneMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(728);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Identifier: {
        enterOuterAlt(_localctx, 1);
        setState(726);
        variableMembers();
        break;
      }

      case TParser::End: {
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
  enterRule(_localctx, 92, TParser::RuleLoopTwoMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(732);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::OpenOp:
      case TParser::Not:
      case TParser::IncDecOperators:
      case TParser::Identifier:
      case TParser::Integer:
      case TParser::Float: {
        enterOuterAlt(_localctx, 1);
        setState(730);
        conditionalExpressionElements();
        break;
      }

      case TParser::End: {
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
  enterRule(_localctx, 94, TParser::RuleLoopThreeMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(736);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 32, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(734);
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

TParser::OperationBlockContext* TParser::LoopThreeMembersValuesContext::operationBlock() {
  return getRuleContext<TParser::OperationBlockContext>(0);
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
  enterRule(_localctx, 96, TParser::RuleLoopThreeMembersValues);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(748);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 33, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(738);
      operationElements();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(739);
      operationBlock();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(740);
      operationElements();
      setState(741);
      match(TParser::Separator);
      setState(742);
      loopThreeMembersValues();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(744);
      operationBlock();
      setState(745);
      match(TParser::Separator);
      setState(746);
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
  enterRule(_localctx, 98, TParser::RuleLoopBlockElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(754);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 34, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(750);
      sentence();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(751);
      sentence();
      setState(752);
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

TParser::LoopContext* TParser::LoopBlockElementsLimitedContext::loop() {
  return getRuleContext<TParser::LoopContext>(0);
}

TParser::LoopBlockElementsLimitedContext* TParser::LoopBlockElementsLimitedContext::loopBlockElementsLimited() {
  return getRuleContext<TParser::LoopBlockElementsLimitedContext>(0);
}

TParser::ConditionalExpressionContext* TParser::LoopBlockElementsLimitedContext::conditionalExpression() {
  return getRuleContext<TParser::ConditionalExpressionContext>(0);
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
  enterRule(_localctx, 100, TParser::RuleLoopBlockElementsLimited);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(762);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 35, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(756);
      loop();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(757);
      loop();
      setState(758);
      loopBlockElementsLimited();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(760);
      conditionalExpression();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(761);
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
  enterRule(_localctx, 102, TParser::RuleRet);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(764);
    match(TParser::Ret);
    setState(765);
    retValues();
    setState(766);
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

TParser::OperationBlockContext* TParser::RetValuesContext::operationBlock() {
  return getRuleContext<TParser::OperationBlockContext>(0);
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
  enterRule(_localctx, 104, TParser::RuleRetValues);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(771);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 36, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(768);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(769);
      operationElements();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(770);
      operationBlock();
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
  enterRule(_localctx, 106, TParser::RuleFunctions);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(803);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 37, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(773);
      functionsModes();
      setState(774);
      match(TParser::OpenBlock);
      setState(775);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(777);
      functionsModes();
      setState(778);
      match(TParser::OpenBlock);
      setState(779);
      functionCodeBlock();
      setState(780);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(782);
      functionMethodsModes();
      setState(783);
      match(TParser::OpenBlock);
      setState(784);
      match(TParser::CloseBlock);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(786);
      functionMethodsModes();
      setState(787);
      match(TParser::OpenBlock);
      setState(788);
      functionCodeBlock();
      setState(789);
      match(TParser::CloseBlock);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(791);
      constructClassMethod();
      setState(792);
      match(TParser::OpenBlock);
      setState(793);
      match(TParser::CloseBlock);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(795);
      constructClassMethod();
      setState(796);
      match(TParser::OpenBlock);
      setState(797);
      functionCodeBlock();
      setState(798);
      match(TParser::CloseBlock);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(800);
      interfaceMethod();
      setState(801);
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

//----------------- FunctionGeneralModesContext ------------------------------------------------------------------

TParser::FunctionGeneralModesContext::FunctionGeneralModesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::FunctionGeneralModesContext::Function() {
  return getToken(TParser::Function, 0);
}

std::vector<tree::TerminalNode *> TParser::FunctionGeneralModesContext::Identifier() {
  return getTokens(TParser::Identifier);
}

tree::TerminalNode* TParser::FunctionGeneralModesContext::Identifier(size_t i) {
  return getToken(TParser::Identifier, i);
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
  enterRule(_localctx, 108, TParser::RuleFunctionGeneralModes);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(829);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 38, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(805);
      match(TParser::Function);
      setState(806);
      match(TParser::Identifier);
      setState(807);
      match(TParser::OpenOp);
      setState(808);
      match(TParser::CloseOp);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(809);
      match(TParser::Function);
      setState(810);
      match(TParser::Identifier);
      setState(811);
      match(TParser::OpenOp);
      setState(812);
      match(TParser::CloseOp);
      setState(813);
      match(TParser::ArrowRight);
      setState(814);
      match(TParser::Identifier);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(815);
      match(TParser::Function);
      setState(816);
      match(TParser::Identifier);
      setState(817);
      match(TParser::OpenOp);
      setState(818);
      functionParams();
      setState(819);
      match(TParser::CloseOp);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(821);
      match(TParser::Function);
      setState(822);
      match(TParser::Identifier);
      setState(823);
      match(TParser::OpenOp);
      setState(824);
      functionParams();
      setState(825);
      match(TParser::CloseOp);
      setState(826);
      match(TParser::ArrowRight);
      setState(827);
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
  enterRule(_localctx, 110, TParser::RuleFunctionsModes);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(831);
    functionGeneralModes();
   
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

TParser::MethodPermContext* TParser::FunctionMethodsModesContext::methodPerm() {
  return getRuleContext<TParser::MethodPermContext>(0);
}

TParser::FunctionGeneralModesContext* TParser::FunctionMethodsModesContext::functionGeneralModes() {
  return getRuleContext<TParser::FunctionGeneralModesContext>(0);
}

tree::TerminalNode* TParser::FunctionMethodsModesContext::Static() {
  return getToken(TParser::Static, 0);
}

tree::TerminalNode* TParser::FunctionMethodsModesContext::Final() {
  return getToken(TParser::Final, 0);
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
  enterRule(_localctx, 112, TParser::RuleFunctionMethodsModes);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(856);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 39, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(833);
      methodPerm();
      setState(834);
      functionGeneralModes();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(836);
      match(TParser::Static);
      setState(837);
      functionGeneralModes();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(838);
      methodPerm();
      setState(839);
      match(TParser::Static);
      setState(840);
      functionGeneralModes();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(842);
      match(TParser::Final);
      setState(843);
      methodPerm();
      setState(844);
      match(TParser::Static);
      setState(845);
      functionGeneralModes();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(847);
      match(TParser::Final);
      setState(848);
      methodPerm();
      setState(849);
      functionGeneralModes();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(851);
      match(TParser::Final);
      setState(852);
      functionGeneralModes();
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(853);
      match(TParser::Final);
      setState(854);
      match(TParser::Static);
      setState(855);
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
  enterRule(_localctx, 114, TParser::RuleMethodPerm);
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
    setState(858);
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
  enterRule(_localctx, 116, TParser::RuleConstructClassMethod);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(868);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 40, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(860);
      match(TParser::Identifier);
      setState(861);
      match(TParser::OpenOp);
      setState(862);
      match(TParser::CloseOp);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(863);
      match(TParser::Identifier);
      setState(864);
      match(TParser::OpenOp);
      setState(865);
      functionParams();
      setState(866);
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
  enterRule(_localctx, 118, TParser::RuleInterfaceMethod);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(872);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Function: {
        enterOuterAlt(_localctx, 1);
        setState(870);
        functionsModes();
        break;
      }

      case TParser::Pub:
      case TParser::Pro:
      case TParser::Priv:
      case TParser::Static:
      case TParser::Final: {
        enterOuterAlt(_localctx, 2);
        setState(871);
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

TParser::SentenceContext* TParser::FunctionCodeBlockContext::sentence() {
  return getRuleContext<TParser::SentenceContext>(0);
}

TParser::FunctionCodeBlockContext* TParser::FunctionCodeBlockContext::functionCodeBlock() {
  return getRuleContext<TParser::FunctionCodeBlockContext>(0);
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
  enterRule(_localctx, 120, TParser::RuleFunctionCodeBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(878);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 42, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(874);
      sentence();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(875);
      sentence();
      setState(876);
      functionCodeBlock();
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

TParser::FunctionParamElementsContext* TParser::FunctionParamsContext::functionParamElements() {
  return getRuleContext<TParser::FunctionParamElementsContext>(0);
}

tree::TerminalNode* TParser::FunctionParamsContext::Separator() {
  return getToken(TParser::Separator, 0);
}

TParser::FunctionParamsContext* TParser::FunctionParamsContext::functionParams() {
  return getRuleContext<TParser::FunctionParamsContext>(0);
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
  enterRule(_localctx, 122, TParser::RuleFunctionParams);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(885);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 43, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(880);
      functionParamElements();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(881);
      functionParamElements();
      setState(882);
      match(TParser::Separator);
      setState(883);
      functionParams();
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
  enterRule(_localctx, 124, TParser::RuleFunctionParamElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(887);
    match(TParser::Identifier);
    setState(888);
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
  enterRule(_localctx, 126, TParser::RuleOopGeneral);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(893);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Interface: {
        enterOuterAlt(_localctx, 1);
        setState(890);
        interfaceClass();
        break;
      }

      case TParser::Abstract: {
        enterOuterAlt(_localctx, 2);
        setState(891);
        abstractClass();
        break;
      }

      case TParser::Final:
      case TParser::Class: {
        enterOuterAlt(_localctx, 3);
        setState(892);
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
  enterRule(_localctx, 128, TParser::RuleInterfaceClass);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(895);
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

std::vector<tree::TerminalNode *> TParser::InterfaceClassDefinitionContext::Identifier() {
  return getTokens(TParser::Identifier);
}

tree::TerminalNode* TParser::InterfaceClassDefinitionContext::Identifier(size_t i) {
  return getToken(TParser::Identifier, i);
}

tree::TerminalNode* TParser::InterfaceClassDefinitionContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::InterfaceClassDefinitionContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::FunctionCodeBlockContext* TParser::InterfaceClassDefinitionContext::functionCodeBlock() {
  return getRuleContext<TParser::FunctionCodeBlockContext>(0);
}

tree::TerminalNode* TParser::InterfaceClassDefinitionContext::Extends() {
  return getToken(TParser::Extends, 0);
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
  enterRule(_localctx, 130, TParser::RuleInterfaceClassDefinition);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(921);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 45, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(897);
      match(TParser::Interface);
      setState(898);
      match(TParser::Identifier);
      setState(899);
      match(TParser::OpenBlock);
      setState(900);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(901);
      match(TParser::Interface);
      setState(902);
      match(TParser::Identifier);
      setState(903);
      match(TParser::OpenBlock);
      setState(904);
      functionCodeBlock();
      setState(905);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(907);
      match(TParser::Interface);
      setState(908);
      match(TParser::Identifier);
      setState(909);
      match(TParser::Extends);
      setState(910);
      match(TParser::Identifier);
      setState(911);
      match(TParser::OpenBlock);
      setState(912);
      match(TParser::CloseBlock);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(913);
      match(TParser::Interface);
      setState(914);
      match(TParser::Identifier);
      setState(915);
      match(TParser::Extends);
      setState(916);
      match(TParser::Identifier);
      setState(917);
      match(TParser::OpenBlock);
      setState(918);
      functionCodeBlock();
      setState(919);
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
  enterRule(_localctx, 132, TParser::RuleAbstractClass);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(923);
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

std::vector<tree::TerminalNode *> TParser::AbstractClassDefinitionContext::Identifier() {
  return getTokens(TParser::Identifier);
}

tree::TerminalNode* TParser::AbstractClassDefinitionContext::Identifier(size_t i) {
  return getToken(TParser::Identifier, i);
}

tree::TerminalNode* TParser::AbstractClassDefinitionContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::AbstractClassDefinitionContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::FunctionCodeBlockContext* TParser::AbstractClassDefinitionContext::functionCodeBlock() {
  return getRuleContext<TParser::FunctionCodeBlockContext>(0);
}

tree::TerminalNode* TParser::AbstractClassDefinitionContext::Extends() {
  return getToken(TParser::Extends, 0);
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
  enterRule(_localctx, 134, TParser::RuleAbstractClassDefinition);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(949);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 46, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(925);
      match(TParser::Abstract);
      setState(926);
      match(TParser::Identifier);
      setState(927);
      match(TParser::OpenBlock);
      setState(928);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(929);
      match(TParser::Abstract);
      setState(930);
      match(TParser::Identifier);
      setState(931);
      match(TParser::OpenBlock);
      setState(932);
      functionCodeBlock();
      setState(933);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(935);
      match(TParser::Abstract);
      setState(936);
      match(TParser::Identifier);
      setState(937);
      match(TParser::Extends);
      setState(938);
      match(TParser::Identifier);
      setState(939);
      match(TParser::OpenBlock);
      setState(940);
      match(TParser::CloseBlock);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(941);
      match(TParser::Abstract);
      setState(942);
      match(TParser::Identifier);
      setState(943);
      match(TParser::Extends);
      setState(944);
      match(TParser::Identifier);
      setState(945);
      match(TParser::OpenBlock);
      setState(946);
      functionCodeBlock();
      setState(947);
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

//----------------- ClassDefinationContext ------------------------------------------------------------------

TParser::ClassDefinationContext::ClassDefinationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ClassModesGeneralContext* TParser::ClassDefinationContext::classModesGeneral() {
  return getRuleContext<TParser::ClassModesGeneralContext>(0);
}

tree::TerminalNode* TParser::ClassDefinationContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::ClassDefinationContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::FunctionCodeBlockContext* TParser::ClassDefinationContext::functionCodeBlock() {
  return getRuleContext<TParser::FunctionCodeBlockContext>(0);
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
  enterRule(_localctx, 136, TParser::RuleClassDefination);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(960);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 47, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(951);
      classModesGeneral();
      setState(952);
      match(TParser::OpenBlock);
      setState(953);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(955);
      classModesGeneral();
      setState(956);
      match(TParser::OpenBlock);
      setState(957);
      functionCodeBlock();
      setState(958);
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

//----------------- ClassModesGeneralContext ------------------------------------------------------------------

TParser::ClassModesGeneralContext::ClassModesGeneralContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ClassModesContext* TParser::ClassModesGeneralContext::classModes() {
  return getRuleContext<TParser::ClassModesContext>(0);
}

tree::TerminalNode* TParser::ClassModesGeneralContext::Final() {
  return getToken(TParser::Final, 0);
}


size_t TParser::ClassModesGeneralContext::getRuleIndex() const {
  return TParser::RuleClassModesGeneral;
}

void TParser::ClassModesGeneralContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterClassModesGeneral(this);
}

void TParser::ClassModesGeneralContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitClassModesGeneral(this);
}


antlrcpp::Any TParser::ClassModesGeneralContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitClassModesGeneral(this);
  else
    return visitor->visitChildren(this);
}

TParser::ClassModesGeneralContext* TParser::classModesGeneral() {
  ClassModesGeneralContext *_localctx = _tracker.createInstance<ClassModesGeneralContext>(_ctx, getState());
  enterRule(_localctx, 138, TParser::RuleClassModesGeneral);

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
    switch (_input->LA(1)) {
      case TParser::Class: {
        enterOuterAlt(_localctx, 1);
        setState(962);
        classModes();
        break;
      }

      case TParser::Final: {
        enterOuterAlt(_localctx, 2);
        setState(963);
        match(TParser::Final);
        setState(964);
        classModes();
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

//----------------- ClassModesContext ------------------------------------------------------------------

TParser::ClassModesContext::ClassModesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ClassModesContext::Class() {
  return getToken(TParser::Class, 0);
}

std::vector<tree::TerminalNode *> TParser::ClassModesContext::Identifier() {
  return getTokens(TParser::Identifier);
}

tree::TerminalNode* TParser::ClassModesContext::Identifier(size_t i) {
  return getToken(TParser::Identifier, i);
}

tree::TerminalNode* TParser::ClassModesContext::Extends() {
  return getToken(TParser::Extends, 0);
}

tree::TerminalNode* TParser::ClassModesContext::Implements() {
  return getToken(TParser::Implements, 0);
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
  enterRule(_localctx, 140, TParser::RuleClassModes);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(983);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 49, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(967);
      match(TParser::Class);
      setState(968);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(969);
      match(TParser::Class);
      setState(970);
      match(TParser::Identifier);
      setState(971);
      match(TParser::Extends);
      setState(972);
      match(TParser::Identifier);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(973);
      match(TParser::Class);
      setState(974);
      match(TParser::Identifier);
      setState(975);
      match(TParser::Implements);
      setState(976);
      match(TParser::Identifier);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(977);
      match(TParser::Class);
      setState(978);
      match(TParser::Identifier);
      setState(979);
      match(TParser::Extends);
      setState(980);
      match(TParser::Identifier);
      setState(981);
      match(TParser::Implements);
      setState(982);
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
  enterRule(_localctx, 142, TParser::RuleArrayAccessElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(989);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 50, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(985);
      arrayAccessElementsItems();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(986);
      arrayAccessElementsItems();
      setState(987);
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
  enterRule(_localctx, 144, TParser::RuleArrayAccessElementsItems);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(1000);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 51, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(991);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(992);
      match(TParser::Identifier);
      setState(993);
      match(TParser::Point);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(994);
      match(TParser::Identifier);
      setState(995);
      accessBlockAr();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(996);
      match(TParser::Identifier);
      setState(997);
      accessBlockAr();
      setState(998);
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
  enterRule(_localctx, 146, TParser::RuleAccessBlockAr);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(1011);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 52, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(1002);
      match(TParser::OpenArIndex);
      setState(1003);
      arrayIndexAccess();
      setState(1004);
      match(TParser::CloseArIndex);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(1006);
      match(TParser::OpenArIndex);
      setState(1007);
      arrayIndexAccess();
      setState(1008);
      match(TParser::CloseArIndex);
      setState(1009);
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
  enterRule(_localctx, 148, TParser::RuleArrayIndexAccess);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1013);
    operationElements();
   
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
  enterRule(_localctx, 150, TParser::RuleGeneralValue);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(1038);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 53, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(1015);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(1016);
      match(TParser::Identifier);
      setState(1017);
      match(TParser::TypeSpec);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(1018);
      match(TParser::Integer);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(1019);
      match(TParser::Integer);
      setState(1020);
      match(TParser::TypeSpec);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(1021);
      match(TParser::Float);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(1022);
      match(TParser::Float);
      setState(1023);
      match(TParser::TypeSpec);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(1024);
      match(TParser::String);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(1025);
      indexArray();
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(1026);
      associativeArray();
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(1027);
      operationElements();
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(1028);
      functionCall();
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(1029);
      objIdentifierA();
      setState(1030);
      match(TParser::Point);
      setState(1031);
      objIdentifierB();
      break;
    }

    case 13: {
      enterOuterAlt(_localctx, 13);
      setState(1033);
      objIdentifierA();
      setState(1034);
      match(TParser::TwoTwoPoint);
      setState(1035);
      objIdentifierB();
      break;
    }

    case 14: {
      enterOuterAlt(_localctx, 14);
      setState(1037);
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
  enterRule(_localctx, 152, TParser::RuleObjIdentifierA);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1040);
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
  enterRule(_localctx, 154, TParser::RuleObjIdentifierB);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1042);
    match(TParser::Identifier);
   
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
    case 40: return conditionExpBlockSempred(dynamic_cast<ConditionExpBlockContext *>(context), predicateIndex);

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
    case 1: return precpred(_ctx, 2);
    case 2: return precpred(_ctx, 1);

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
  "variable", "variableModes", "variableMembers", "variableDefinition", 
  "variableDefinitionGeneral", "indexArray", "indexArrayElements", "associativeArray", 
  "associativeArrayElements", "operationBlock", "operationElements", "operationValue", 
  "firstIncDec", "lastIncDec", "callingFunction", "functionCall", "identifierB", 
  "pointSeparator", "functionCallParam", "functionCallParamElements", "conditionalExpression", 
  "conditionalExpressionStructBlock", "ifElementUnique", "elifElements", 
  "elifElementUnique", "elseElementUnique", "conditionalExpressionItems", 
  "conditionalBlockElements", "conditionalBlockElsItems", "conditionalExpressionElements2", 
  "defaultExpValues", "defaultExpValuesUnique", "conditionalExpressionElements", 
  "conditionExpBlock", "conditionalExpValue", "identifierAttrFn", "loop", 
  "loopExpression", "loopOneMembers", "loopTwoMembers", "loopThreeMembers", 
  "loopThreeMembersValues", "loopBlockElements", "loopBlockElementsLimited", 
  "ret", "retValues", "functions", "functionGeneralModes", "functionsModes", 
  "functionMethodsModes", "methodPerm", "constructClassMethod", "interfaceMethod", 
  "functionCodeBlock", "functionParams", "functionParamElements", "oopGeneral", 
  "interfaceClass", "interfaceClassDefinition", "abstractClass", "abstractClassDefinition", 
  "classDefination", "classModesGeneral", "classModes", "arrayAccessElements", 
  "arrayAccessElementsItems", "accessBlockAr", "arrayIndexAccess", "generalValue", 
  "objIdentifierA", "objIdentifierB"
};

std::vector<std::string> TParser::_literalNames = {
  "", "'use'", "'var'", "'if'", "'elif'", "'else'", "'for'", "'ret'", "'fn'", 
  "'pub'", "'pro'", "'priv'", "'static'", "'final'", "'interface'", "'abstract'", 
  "'extends'", "'class'", "'implements'", "'new'", "'->'", "';'", "'='", 
  "'.'", "':'", "'::'", "','", "'['", "']'", "'{'", "'}'", "'('", "')'", 
  "", "", "'!'"
};

std::vector<std::string> TParser::_symbolicNames = {
  "", "Use", "Var", "If", "Elif", "Else", "For", "Ret", "Function", "Pub", 
  "Pro", "Priv", "Static", "Final", "Interface", "Abstract", "Extends", 
  "Class", "Implements", "New", "ArrowRight", "End", "Attr", "Point", "TwoPoint", 
  "TwoTwoPoint", "Separator", "OpenArIndex", "CloseArIndex", "OpenBlock", 
  "CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", "AssignmentOperator", 
  "Not", "IncDecOperators", "Identifier", "IDPrefix", "TypeSpec", "String", 
  "Integer", "Float", "Whitespace", "Newline", "Words", "BlockComment", 
  "LineComment"
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
       0x3, 0x31, 0x417, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 
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
       0x9, 0x4d, 0x4, 0x4e, 0x9, 0x4e, 0x4, 0x4f, 0x9, 0x4f, 0x3, 0x2, 
       0x3, 0x2, 0x3, 0x2, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x7, 0x3, 0xa5, 
       0xa, 0x3, 0xc, 0x3, 0xe, 0x3, 0xa8, 0xb, 0x3, 0x3, 0x4, 0x3, 0x4, 
       0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 
       0x4, 0x5, 0x4, 0xb3, 0xa, 0x4, 0x3, 0x5, 0x3, 0x5, 0x3, 0x6, 0x3, 
       0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 
       0x3, 0x7, 0x5, 0x7, 0xc0, 0xa, 0x7, 0x3, 0x8, 0x3, 0x8, 0x3, 0x9, 
       0x3, 0x9, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 
       0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
       0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 
       0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
       0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 
       0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
       0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 
       0xa, 0x3, 0xa, 0x3, 0xa, 0x5, 0xa, 0xf5, 0xa, 0xa, 0x3, 0xb, 0x3, 
       0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x5, 0xb, 0xfc, 0xa, 0xb, 0x3, 
       0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 
       0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 
       0xc, 0x3, 0xc, 0x5, 0xc, 0x10d, 0xa, 0xc, 0x3, 0xd, 0x3, 0xd, 0x3, 
       0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 
       0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x5, 0xd, 0x11b, 0xa, 0xd, 0x3, 0xe, 
       0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x5, 0xe, 0x123, 
       0xa, 0xe, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x5, 
       0xf, 0x12a, 0xa, 0xf, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 
       0x3, 0x10, 0x3, 0x10, 0x5, 0x10, 0x132, 0xa, 0x10, 0x3, 0x11, 0x3, 
       0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 
       0x11, 0x3, 0x11, 0x5, 0x11, 0x13d, 0xa, 0x11, 0x3, 0x12, 0x3, 0x12, 
       0x3, 0x12, 0x3, 0x12, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 
       0x5, 0x13, 0x147, 0xa, 0x13, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 
       0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 
       0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 
       0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 
       0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 
       0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 
       0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 
       0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 
       0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 
       0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 
       0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 
       0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 
       0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 
       0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 
       0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 
       0x14, 0x5, 0x14, 0x1a1, 0xa, 0x14, 0x3, 0x15, 0x3, 0x15, 0x3, 0x16, 
       0x3, 0x16, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x18, 0x3, 0x18, 
       0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 
       0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 
       0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x5, 0x18, 
       0x1bd, 0xa, 0x18, 0x3, 0x19, 0x3, 0x19, 0x3, 0x1a, 0x3, 0x1a, 0x3, 
       0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x5, 
       0x1b, 0x1c9, 0xa, 0x1b, 0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 
       0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 
       0x5, 0x1c, 0x1d5, 0xa, 0x1c, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 
       0x1d, 0x5, 0x1d, 0x1db, 0xa, 0x1d, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 
       0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 
       0x3, 0x1e, 0x3, 0x1e, 0x5, 0x1e, 0x1e8, 0xa, 0x1e, 0x3, 0x1f, 0x3, 
       0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 
       0x20, 0x5, 0x20, 0x1f2, 0xa, 0x20, 0x3, 0x21, 0x3, 0x21, 0x3, 0x21, 
       0x3, 0x21, 0x3, 0x22, 0x3, 0x22, 0x3, 0x22, 0x3, 0x23, 0x3, 0x23, 
       0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 
       0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x5, 0x24, 0x207, 0xa, 
       0x24, 0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 0x5, 0x25, 0x20d, 
       0xa, 0x25, 0x3, 0x26, 0x3, 0x26, 0x3, 0x27, 0x3, 0x27, 0x3, 0x27, 
       0x3, 0x27, 0x5, 0x27, 0x215, 0xa, 0x27, 0x3, 0x28, 0x3, 0x28, 0x3, 
       0x28, 0x3, 0x28, 0x3, 0x28, 0x5, 0x28, 0x21c, 0xa, 0x28, 0x3, 0x29, 
       0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 
       0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x5, 0x29, 0x228, 0xa, 0x29, 0x3, 
       0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 
       0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x7, 0x2a, 0x234, 0xa, 0x2a, 
       0xc, 0x2a, 0xe, 0x2a, 0x237, 0xb, 0x2a, 0x3, 0x2b, 0x3, 0x2b, 0x3, 
       0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 
       0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 
       0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 
       0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 
       0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 
       0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 
       0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 
       0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 
       0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 
       0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 
       0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 
       0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 
       0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 
       0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 
       0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 
       0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 
       0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 
       0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x5, 0x2b, 0x2a5, 0xa, 0x2b, 
       0x3, 0x2c, 0x3, 0x2c, 0x3, 0x2c, 0x3, 0x2c, 0x3, 0x2c, 0x3, 0x2c, 
       0x3, 0x2c, 0x5, 0x2c, 0x2ae, 0xa, 0x2c, 0x3, 0x2d, 0x3, 0x2d, 0x3, 
       0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x3, 
       0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x3, 
       0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x5, 0x2d, 0x2c3, 
       0xa, 0x2d, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 
       0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 
       0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 
       0x3, 0x2e, 0x5, 0x2e, 0x2d7, 0xa, 0x2e, 0x3, 0x2f, 0x3, 0x2f, 0x5, 
       0x2f, 0x2db, 0xa, 0x2f, 0x3, 0x30, 0x3, 0x30, 0x5, 0x30, 0x2df, 0xa, 
       0x30, 0x3, 0x31, 0x3, 0x31, 0x5, 0x31, 0x2e3, 0xa, 0x31, 0x3, 0x32, 
       0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 
       0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x5, 0x32, 0x2ef, 0xa, 0x32, 0x3, 
       0x33, 0x3, 0x33, 0x3, 0x33, 0x3, 0x33, 0x5, 0x33, 0x2f5, 0xa, 0x33, 
       0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 
       0x5, 0x34, 0x2fd, 0xa, 0x34, 0x3, 0x35, 0x3, 0x35, 0x3, 0x35, 0x3, 
       0x35, 0x3, 0x36, 0x3, 0x36, 0x3, 0x36, 0x5, 0x36, 0x306, 0xa, 0x36, 
       0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 
       0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 
       0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 
       0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 
       0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 
       0x5, 0x37, 0x326, 0xa, 0x37, 0x3, 0x38, 0x3, 0x38, 0x3, 0x38, 0x3, 
       0x38, 0x3, 0x38, 0x3, 0x38, 0x3, 0x38, 0x3, 0x38, 0x3, 0x38, 0x3, 
       0x38, 0x3, 0x38, 0x3, 0x38, 0x3, 0x38, 0x3, 0x38, 0x3, 0x38, 0x3, 
       0x38, 0x3, 0x38, 0x3, 0x38, 0x3, 0x38, 0x3, 0x38, 0x3, 0x38, 0x3, 
       0x38, 0x3, 0x38, 0x3, 0x38, 0x5, 0x38, 0x340, 0xa, 0x38, 0x3, 0x39, 
       0x3, 0x39, 0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3a, 
       0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3a, 
       0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3a, 
       0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3a, 
       0x5, 0x3a, 0x35b, 0xa, 0x3a, 0x3, 0x3b, 0x3, 0x3b, 0x3, 0x3c, 0x3, 
       0x3c, 0x3, 0x3c, 0x3, 0x3c, 0x3, 0x3c, 0x3, 0x3c, 0x3, 0x3c, 0x3, 
       0x3c, 0x5, 0x3c, 0x367, 0xa, 0x3c, 0x3, 0x3d, 0x3, 0x3d, 0x5, 0x3d, 
       0x36b, 0xa, 0x3d, 0x3, 0x3e, 0x3, 0x3e, 0x3, 0x3e, 0x3, 0x3e, 0x5, 
       0x3e, 0x371, 0xa, 0x3e, 0x3, 0x3f, 0x3, 0x3f, 0x3, 0x3f, 0x3, 0x3f, 
       0x3, 0x3f, 0x5, 0x3f, 0x378, 0xa, 0x3f, 0x3, 0x40, 0x3, 0x40, 0x3, 
       0x40, 0x3, 0x41, 0x3, 0x41, 0x3, 0x41, 0x5, 0x41, 0x380, 0xa, 0x41, 
       0x3, 0x42, 0x3, 0x42, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 
       0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 
       0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 
       0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 
       0x3, 0x43, 0x3, 0x43, 0x5, 0x43, 0x39c, 0xa, 0x43, 0x3, 0x44, 0x3, 
       0x44, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 
       0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 
       0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 
       0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 
       0x45, 0x5, 0x45, 0x3b8, 0xa, 0x45, 0x3, 0x46, 0x3, 0x46, 0x3, 0x46, 
       0x3, 0x46, 0x3, 0x46, 0x3, 0x46, 0x3, 0x46, 0x3, 0x46, 0x3, 0x46, 
       0x5, 0x46, 0x3c3, 0xa, 0x46, 0x3, 0x47, 0x3, 0x47, 0x3, 0x47, 0x5, 
       0x47, 0x3c8, 0xa, 0x47, 0x3, 0x48, 0x3, 0x48, 0x3, 0x48, 0x3, 0x48, 
       0x3, 0x48, 0x3, 0x48, 0x3, 0x48, 0x3, 0x48, 0x3, 0x48, 0x3, 0x48, 
       0x3, 0x48, 0x3, 0x48, 0x3, 0x48, 0x3, 0x48, 0x3, 0x48, 0x3, 0x48, 
       0x5, 0x48, 0x3da, 0xa, 0x48, 0x3, 0x49, 0x3, 0x49, 0x3, 0x49, 0x3, 
       0x49, 0x5, 0x49, 0x3e0, 0xa, 0x49, 0x3, 0x4a, 0x3, 0x4a, 0x3, 0x4a, 
       0x3, 0x4a, 0x3, 0x4a, 0x3, 0x4a, 0x3, 0x4a, 0x3, 0x4a, 0x3, 0x4a, 
       0x5, 0x4a, 0x3eb, 0xa, 0x4a, 0x3, 0x4b, 0x3, 0x4b, 0x3, 0x4b, 0x3, 
       0x4b, 0x3, 0x4b, 0x3, 0x4b, 0x3, 0x4b, 0x3, 0x4b, 0x3, 0x4b, 0x5, 
       0x4b, 0x3f6, 0xa, 0x4b, 0x3, 0x4c, 0x3, 0x4c, 0x3, 0x4d, 0x3, 0x4d, 
       0x3, 0x4d, 0x3, 0x4d, 0x3, 0x4d, 0x3, 0x4d, 0x3, 0x4d, 0x3, 0x4d, 
       0x3, 0x4d, 0x3, 0x4d, 0x3, 0x4d, 0x3, 0x4d, 0x3, 0x4d, 0x3, 0x4d, 
       0x3, 0x4d, 0x3, 0x4d, 0x3, 0x4d, 0x3, 0x4d, 0x3, 0x4d, 0x3, 0x4d, 
       0x3, 0x4d, 0x3, 0x4d, 0x3, 0x4d, 0x5, 0x4d, 0x411, 0xa, 0x4d, 0x3, 
       0x4e, 0x3, 0x4e, 0x3, 0x4f, 0x3, 0x4f, 0x3, 0x4f, 0x2, 0x4, 0x4, 
       0x52, 0x50, 0x2, 0x4, 0x6, 0x8, 0xa, 0xc, 0xe, 0x10, 0x12, 0x14, 
       0x16, 0x18, 0x1a, 0x1c, 0x1e, 0x20, 0x22, 0x24, 0x26, 0x28, 0x2a, 
       0x2c, 0x2e, 0x30, 0x32, 0x34, 0x36, 0x38, 0x3a, 0x3c, 0x3e, 0x40, 
       0x42, 0x44, 0x46, 0x48, 0x4a, 0x4c, 0x4e, 0x50, 0x52, 0x54, 0x56, 
       0x58, 0x5a, 0x5c, 0x5e, 0x60, 0x62, 0x64, 0x66, 0x68, 0x6a, 0x6c, 
       0x6e, 0x70, 0x72, 0x74, 0x76, 0x78, 0x7a, 0x7c, 0x7e, 0x80, 0x82, 
       0x84, 0x86, 0x88, 0x8a, 0x8c, 0x8e, 0x90, 0x92, 0x94, 0x96, 0x98, 
       0x9a, 0x9c, 0x2, 0x5, 0x4, 0x2, 0x18, 0x18, 0x24, 0x24, 0x3, 0x2, 
       0x23, 0x24, 0x3, 0x2, 0xb, 0xd, 0x2, 0x48a, 0x2, 0x9e, 0x3, 0x2, 
       0x2, 0x2, 0x4, 0xa1, 0x3, 0x2, 0x2, 0x2, 0x6, 0xb2, 0x3, 0x2, 0x2, 
       0x2, 0x8, 0xb4, 0x3, 0x2, 0x2, 0x2, 0xa, 0xb6, 0x3, 0x2, 0x2, 0x2, 
       0xc, 0xbf, 0x3, 0x2, 0x2, 0x2, 0xe, 0xc1, 0x3, 0x2, 0x2, 0x2, 0x10, 
       0xc3, 0x3, 0x2, 0x2, 0x2, 0x12, 0xf4, 0x3, 0x2, 0x2, 0x2, 0x14, 0xfb, 
       0x3, 0x2, 0x2, 0x2, 0x16, 0x10c, 0x3, 0x2, 0x2, 0x2, 0x18, 0x11a, 
       0x3, 0x2, 0x2, 0x2, 0x1a, 0x122, 0x3, 0x2, 0x2, 0x2, 0x1c, 0x129, 
       0x3, 0x2, 0x2, 0x2, 0x1e, 0x131, 0x3, 0x2, 0x2, 0x2, 0x20, 0x13c, 
       0x3, 0x2, 0x2, 0x2, 0x22, 0x13e, 0x3, 0x2, 0x2, 0x2, 0x24, 0x146, 
       0x3, 0x2, 0x2, 0x2, 0x26, 0x1a0, 0x3, 0x2, 0x2, 0x2, 0x28, 0x1a2, 
       0x3, 0x2, 0x2, 0x2, 0x2a, 0x1a4, 0x3, 0x2, 0x2, 0x2, 0x2c, 0x1a6, 
       0x3, 0x2, 0x2, 0x2, 0x2e, 0x1bc, 0x3, 0x2, 0x2, 0x2, 0x30, 0x1be, 
       0x3, 0x2, 0x2, 0x2, 0x32, 0x1c0, 0x3, 0x2, 0x2, 0x2, 0x34, 0x1c8, 
       0x3, 0x2, 0x2, 0x2, 0x36, 0x1d4, 0x3, 0x2, 0x2, 0x2, 0x38, 0x1da, 
       0x3, 0x2, 0x2, 0x2, 0x3a, 0x1e7, 0x3, 0x2, 0x2, 0x2, 0x3c, 0x1e9, 
       0x3, 0x2, 0x2, 0x2, 0x3e, 0x1f1, 0x3, 0x2, 0x2, 0x2, 0x40, 0x1f3, 
       0x3, 0x2, 0x2, 0x2, 0x42, 0x1f7, 0x3, 0x2, 0x2, 0x2, 0x44, 0x1fa, 
       0x3, 0x2, 0x2, 0x2, 0x46, 0x206, 0x3, 0x2, 0x2, 0x2, 0x48, 0x20c, 
       0x3, 0x2, 0x2, 0x2, 0x4a, 0x20e, 0x3, 0x2, 0x2, 0x2, 0x4c, 0x214, 
       0x3, 0x2, 0x2, 0x2, 0x4e, 0x21b, 0x3, 0x2, 0x2, 0x2, 0x50, 0x227, 
       0x3, 0x2, 0x2, 0x2, 0x52, 0x229, 0x3, 0x2, 0x2, 0x2, 0x54, 0x2a4, 
       0x3, 0x2, 0x2, 0x2, 0x56, 0x2ad, 0x3, 0x2, 0x2, 0x2, 0x58, 0x2c2, 
       0x3, 0x2, 0x2, 0x2, 0x5a, 0x2d6, 0x3, 0x2, 0x2, 0x2, 0x5c, 0x2da, 
       0x3, 0x2, 0x2, 0x2, 0x5e, 0x2de, 0x3, 0x2, 0x2, 0x2, 0x60, 0x2e2, 
       0x3, 0x2, 0x2, 0x2, 0x62, 0x2ee, 0x3, 0x2, 0x2, 0x2, 0x64, 0x2f4, 
       0x3, 0x2, 0x2, 0x2, 0x66, 0x2fc, 0x3, 0x2, 0x2, 0x2, 0x68, 0x2fe, 
       0x3, 0x2, 0x2, 0x2, 0x6a, 0x305, 0x3, 0x2, 0x2, 0x2, 0x6c, 0x325, 
       0x3, 0x2, 0x2, 0x2, 0x6e, 0x33f, 0x3, 0x2, 0x2, 0x2, 0x70, 0x341, 
       0x3, 0x2, 0x2, 0x2, 0x72, 0x35a, 0x3, 0x2, 0x2, 0x2, 0x74, 0x35c, 
       0x3, 0x2, 0x2, 0x2, 0x76, 0x366, 0x3, 0x2, 0x2, 0x2, 0x78, 0x36a, 
       0x3, 0x2, 0x2, 0x2, 0x7a, 0x370, 0x3, 0x2, 0x2, 0x2, 0x7c, 0x377, 
       0x3, 0x2, 0x2, 0x2, 0x7e, 0x379, 0x3, 0x2, 0x2, 0x2, 0x80, 0x37f, 
       0x3, 0x2, 0x2, 0x2, 0x82, 0x381, 0x3, 0x2, 0x2, 0x2, 0x84, 0x39b, 
       0x3, 0x2, 0x2, 0x2, 0x86, 0x39d, 0x3, 0x2, 0x2, 0x2, 0x88, 0x3b7, 
       0x3, 0x2, 0x2, 0x2, 0x8a, 0x3c2, 0x3, 0x2, 0x2, 0x2, 0x8c, 0x3c7, 
       0x3, 0x2, 0x2, 0x2, 0x8e, 0x3d9, 0x3, 0x2, 0x2, 0x2, 0x90, 0x3df, 
       0x3, 0x2, 0x2, 0x2, 0x92, 0x3ea, 0x3, 0x2, 0x2, 0x2, 0x94, 0x3f5, 
       0x3, 0x2, 0x2, 0x2, 0x96, 0x3f7, 0x3, 0x2, 0x2, 0x2, 0x98, 0x410, 
       0x3, 0x2, 0x2, 0x2, 0x9a, 0x412, 0x3, 0x2, 0x2, 0x2, 0x9c, 0x414, 
       0x3, 0x2, 0x2, 0x2, 0x9e, 0x9f, 0x5, 0x4, 0x3, 0x2, 0x9f, 0xa0, 0x7, 
       0x2, 0x2, 0x3, 0xa0, 0x3, 0x3, 0x2, 0x2, 0x2, 0xa1, 0xa6, 0x8, 0x3, 
       0x1, 0x2, 0xa2, 0xa3, 0xc, 0x4, 0x2, 0x2, 0xa3, 0xa5, 0x5, 0x6, 0x4, 
       0x2, 0xa4, 0xa2, 0x3, 0x2, 0x2, 0x2, 0xa5, 0xa8, 0x3, 0x2, 0x2, 0x2, 
       0xa6, 0xa4, 0x3, 0x2, 0x2, 0x2, 0xa6, 0xa7, 0x3, 0x2, 0x2, 0x2, 0xa7, 
       0x5, 0x3, 0x2, 0x2, 0x2, 0xa8, 0xa6, 0x3, 0x2, 0x2, 0x2, 0xa9, 0xb3, 
       0x5, 0x8, 0x5, 0x2, 0xaa, 0xb3, 0x5, 0xa, 0x6, 0x2, 0xab, 0xb3, 0x5, 
       0x10, 0x9, 0x2, 0xac, 0xb3, 0x5, 0x2c, 0x17, 0x2, 0xad, 0xb3, 0x5, 
       0x38, 0x1d, 0x2, 0xae, 0xb3, 0x5, 0x58, 0x2d, 0x2, 0xaf, 0xb3, 0x5, 
       0x6c, 0x37, 0x2, 0xb0, 0xb3, 0x5, 0x68, 0x35, 0x2, 0xb1, 0xb3, 0x5, 
       0x80, 0x41, 0x2, 0xb2, 0xa9, 0x3, 0x2, 0x2, 0x2, 0xb2, 0xaa, 0x3, 
       0x2, 0x2, 0x2, 0xb2, 0xab, 0x3, 0x2, 0x2, 0x2, 0xb2, 0xac, 0x3, 0x2, 
       0x2, 0x2, 0xb2, 0xad, 0x3, 0x2, 0x2, 0x2, 0xb2, 0xae, 0x3, 0x2, 0x2, 
       0x2, 0xb2, 0xaf, 0x3, 0x2, 0x2, 0x2, 0xb2, 0xb0, 0x3, 0x2, 0x2, 0x2, 
       0xb2, 0xb1, 0x3, 0x2, 0x2, 0x2, 0xb3, 0x7, 0x3, 0x2, 0x2, 0x2, 0xb4, 
       0xb5, 0x7, 0x2e, 0x2, 0x2, 0xb5, 0x9, 0x3, 0x2, 0x2, 0x2, 0xb6, 0xb7, 
       0x7, 0x3, 0x2, 0x2, 0xb7, 0xb8, 0x5, 0xc, 0x7, 0x2, 0xb8, 0xb9, 0x7, 
       0x17, 0x2, 0x2, 0xb9, 0xb, 0x3, 0x2, 0x2, 0x2, 0xba, 0xc0, 0x5, 0xe, 
       0x8, 0x2, 0xbb, 0xbc, 0x5, 0xe, 0x8, 0x2, 0xbc, 0xbd, 0x7, 0x1c, 
       0x2, 0x2, 0xbd, 0xbe, 0x5, 0xc, 0x7, 0x2, 0xbe, 0xc0, 0x3, 0x2, 0x2, 
       0x2, 0xbf, 0xba, 0x3, 0x2, 0x2, 0x2, 0xbf, 0xbb, 0x3, 0x2, 0x2, 0x2, 
       0xc0, 0xd, 0x3, 0x2, 0x2, 0x2, 0xc1, 0xc2, 0x7, 0x2a, 0x2, 0x2, 0xc2, 
       0xf, 0x3, 0x2, 0x2, 0x2, 0xc3, 0xc4, 0x5, 0x12, 0xa, 0x2, 0xc4, 0x11, 
       0x3, 0x2, 0x2, 0x2, 0xc5, 0xc6, 0x7, 0x4, 0x2, 0x2, 0xc6, 0xc7, 0x5, 
       0x14, 0xb, 0x2, 0xc7, 0xc8, 0x7, 0x17, 0x2, 0x2, 0xc8, 0xf5, 0x3, 
       0x2, 0x2, 0x2, 0xc9, 0xca, 0x5, 0x74, 0x3b, 0x2, 0xca, 0xcb, 0x7, 
       0x4, 0x2, 0x2, 0xcb, 0xcc, 0x5, 0x14, 0xb, 0x2, 0xcc, 0xcd, 0x7, 
       0x17, 0x2, 0x2, 0xcd, 0xf5, 0x3, 0x2, 0x2, 0x2, 0xce, 0xcf, 0x7, 
       0xe, 0x2, 0x2, 0xcf, 0xd0, 0x7, 0x4, 0x2, 0x2, 0xd0, 0xd1, 0x5, 0x14, 
       0xb, 0x2, 0xd1, 0xd2, 0x7, 0x17, 0x2, 0x2, 0xd2, 0xf5, 0x3, 0x2, 
       0x2, 0x2, 0xd3, 0xd4, 0x5, 0x74, 0x3b, 0x2, 0xd4, 0xd5, 0x7, 0xe, 
       0x2, 0x2, 0xd5, 0xd6, 0x7, 0x4, 0x2, 0x2, 0xd6, 0xd7, 0x5, 0x14, 
       0xb, 0x2, 0xd7, 0xd8, 0x7, 0x17, 0x2, 0x2, 0xd8, 0xf5, 0x3, 0x2, 
       0x2, 0x2, 0xd9, 0xda, 0x7, 0xf, 0x2, 0x2, 0xda, 0xdb, 0x5, 0x74, 
       0x3b, 0x2, 0xdb, 0xdc, 0x7, 0xe, 0x2, 0x2, 0xdc, 0xdd, 0x7, 0x4, 
       0x2, 0x2, 0xdd, 0xde, 0x5, 0x14, 0xb, 0x2, 0xde, 0xdf, 0x7, 0x17, 
       0x2, 0x2, 0xdf, 0xf5, 0x3, 0x2, 0x2, 0x2, 0xe0, 0xe1, 0x7, 0xf, 0x2, 
       0x2, 0xe1, 0xe2, 0x5, 0x74, 0x3b, 0x2, 0xe2, 0xe3, 0x7, 0x4, 0x2, 
       0x2, 0xe3, 0xe4, 0x5, 0x14, 0xb, 0x2, 0xe4, 0xe5, 0x7, 0x17, 0x2, 
       0x2, 0xe5, 0xf5, 0x3, 0x2, 0x2, 0x2, 0xe6, 0xe7, 0x7, 0xf, 0x2, 0x2, 
       0xe7, 0xe8, 0x7, 0x4, 0x2, 0x2, 0xe8, 0xe9, 0x5, 0x14, 0xb, 0x2, 
       0xe9, 0xea, 0x7, 0x17, 0x2, 0x2, 0xea, 0xf5, 0x3, 0x2, 0x2, 0x2, 
       0xeb, 0xec, 0x7, 0xf, 0x2, 0x2, 0xec, 0xed, 0x7, 0xe, 0x2, 0x2, 0xed, 
       0xee, 0x7, 0x4, 0x2, 0x2, 0xee, 0xef, 0x5, 0x14, 0xb, 0x2, 0xef, 
       0xf0, 0x7, 0x17, 0x2, 0x2, 0xf0, 0xf5, 0x3, 0x2, 0x2, 0x2, 0xf1, 
       0xf2, 0x5, 0x14, 0xb, 0x2, 0xf2, 0xf3, 0x7, 0x17, 0x2, 0x2, 0xf3, 
       0xf5, 0x3, 0x2, 0x2, 0x2, 0xf4, 0xc5, 0x3, 0x2, 0x2, 0x2, 0xf4, 0xc9, 
       0x3, 0x2, 0x2, 0x2, 0xf4, 0xce, 0x3, 0x2, 0x2, 0x2, 0xf4, 0xd3, 0x3, 
       0x2, 0x2, 0x2, 0xf4, 0xd9, 0x3, 0x2, 0x2, 0x2, 0xf4, 0xe0, 0x3, 0x2, 
       0x2, 0x2, 0xf4, 0xe6, 0x3, 0x2, 0x2, 0x2, 0xf4, 0xeb, 0x3, 0x2, 0x2, 
       0x2, 0xf4, 0xf1, 0x3, 0x2, 0x2, 0x2, 0xf5, 0x13, 0x3, 0x2, 0x2, 0x2, 
       0xf6, 0xfc, 0x5, 0x16, 0xc, 0x2, 0xf7, 0xf8, 0x5, 0x16, 0xc, 0x2, 
       0xf8, 0xf9, 0x7, 0x1c, 0x2, 0x2, 0xf9, 0xfa, 0x5, 0x14, 0xb, 0x2, 
       0xfa, 0xfc, 0x3, 0x2, 0x2, 0x2, 0xfb, 0xf6, 0x3, 0x2, 0x2, 0x2, 0xfb, 
       0xf7, 0x3, 0x2, 0x2, 0x2, 0xfc, 0x15, 0x3, 0x2, 0x2, 0x2, 0xfd, 0xfe, 
       0x7, 0x27, 0x2, 0x2, 0xfe, 0x10d, 0x5, 0x18, 0xd, 0x2, 0xff, 0x100, 
       0x5, 0x9a, 0x4e, 0x2, 0x100, 0x101, 0x7, 0x19, 0x2, 0x2, 0x101, 0x102, 
       0x5, 0x9c, 0x4f, 0x2, 0x102, 0x103, 0x5, 0x18, 0xd, 0x2, 0x103, 0x10d, 
       0x3, 0x2, 0x2, 0x2, 0x104, 0x105, 0x5, 0x9a, 0x4e, 0x2, 0x105, 0x106, 
       0x7, 0x1b, 0x2, 0x2, 0x106, 0x107, 0x5, 0x9c, 0x4f, 0x2, 0x107, 0x108, 
       0x5, 0x18, 0xd, 0x2, 0x108, 0x10d, 0x3, 0x2, 0x2, 0x2, 0x109, 0x10a, 
       0x5, 0x90, 0x49, 0x2, 0x10a, 0x10b, 0x5, 0x18, 0xd, 0x2, 0x10b, 0x10d, 
       0x3, 0x2, 0x2, 0x2, 0x10c, 0xfd, 0x3, 0x2, 0x2, 0x2, 0x10c, 0xff, 
       0x3, 0x2, 0x2, 0x2, 0x10c, 0x104, 0x3, 0x2, 0x2, 0x2, 0x10c, 0x109, 
       0x3, 0x2, 0x2, 0x2, 0x10d, 0x17, 0x3, 0x2, 0x2, 0x2, 0x10e, 0x10f, 
       0x9, 0x2, 0x2, 0x2, 0x10f, 0x11b, 0x5, 0x98, 0x4d, 0x2, 0x110, 0x111, 
       0x7, 0x29, 0x2, 0x2, 0x111, 0x112, 0x9, 0x2, 0x2, 0x2, 0x112, 0x11b, 
       0x5, 0x98, 0x4d, 0x2, 0x113, 0x114, 0x9, 0x2, 0x2, 0x2, 0x114, 0x115, 
       0x7, 0x15, 0x2, 0x2, 0x115, 0x11b, 0x5, 0x98, 0x4d, 0x2, 0x116, 0x117, 
       0x7, 0x29, 0x2, 0x2, 0x117, 0x118, 0x9, 0x2, 0x2, 0x2, 0x118, 0x119, 
       0x7, 0x15, 0x2, 0x2, 0x119, 0x11b, 0x5, 0x98, 0x4d, 0x2, 0x11a, 0x10e, 
       0x3, 0x2, 0x2, 0x2, 0x11a, 0x110, 0x3, 0x2, 0x2, 0x2, 0x11a, 0x113, 
       0x3, 0x2, 0x2, 0x2, 0x11a, 0x116, 0x3, 0x2, 0x2, 0x2, 0x11b, 0x19, 
       0x3, 0x2, 0x2, 0x2, 0x11c, 0x11d, 0x7, 0x1d, 0x2, 0x2, 0x11d, 0x123, 
       0x7, 0x1e, 0x2, 0x2, 0x11e, 0x11f, 0x7, 0x1d, 0x2, 0x2, 0x11f, 0x120, 
       0x5, 0x1c, 0xf, 0x2, 0x120, 0x121, 0x7, 0x1e, 0x2, 0x2, 0x121, 0x123, 
       0x3, 0x2, 0x2, 0x2, 0x122, 0x11c, 0x3, 0x2, 0x2, 0x2, 0x122, 0x11e, 
       0x3, 0x2, 0x2, 0x2, 0x123, 0x1b, 0x3, 0x2, 0x2, 0x2, 0x124, 0x12a, 
       0x5, 0x98, 0x4d, 0x2, 0x125, 0x126, 0x5, 0x98, 0x4d, 0x2, 0x126, 
       0x127, 0x7, 0x1c, 0x2, 0x2, 0x127, 0x128, 0x5, 0x1c, 0xf, 0x2, 0x128, 
       0x12a, 0x3, 0x2, 0x2, 0x2, 0x129, 0x124, 0x3, 0x2, 0x2, 0x2, 0x129, 
       0x125, 0x3, 0x2, 0x2, 0x2, 0x12a, 0x1d, 0x3, 0x2, 0x2, 0x2, 0x12b, 
       0x12c, 0x7, 0x1f, 0x2, 0x2, 0x12c, 0x132, 0x7, 0x20, 0x2, 0x2, 0x12d, 
       0x12e, 0x7, 0x1f, 0x2, 0x2, 0x12e, 0x12f, 0x5, 0x20, 0x11, 0x2, 0x12f, 
       0x130, 0x7, 0x20, 0x2, 0x2, 0x130, 0x132, 0x3, 0x2, 0x2, 0x2, 0x131, 
       0x12b, 0x3, 0x2, 0x2, 0x2, 0x131, 0x12d, 0x3, 0x2, 0x2, 0x2, 0x132, 
       0x1f, 0x3, 0x2, 0x2, 0x2, 0x133, 0x134, 0x7, 0x27, 0x2, 0x2, 0x134, 
       0x135, 0x7, 0x1a, 0x2, 0x2, 0x135, 0x13d, 0x5, 0x98, 0x4d, 0x2, 0x136, 
       0x137, 0x7, 0x27, 0x2, 0x2, 0x137, 0x138, 0x7, 0x1a, 0x2, 0x2, 0x138, 
       0x139, 0x5, 0x98, 0x4d, 0x2, 0x139, 0x13a, 0x7, 0x1c, 0x2, 0x2, 0x13a, 
       0x13b, 0x5, 0x20, 0x11, 0x2, 0x13b, 0x13d, 0x3, 0x2, 0x2, 0x2, 0x13c, 
       0x133, 0x3, 0x2, 0x2, 0x2, 0x13c, 0x136, 0x3, 0x2, 0x2, 0x2, 0x13d, 
       0x21, 0x3, 0x2, 0x2, 0x2, 0x13e, 0x13f, 0x7, 0x21, 0x2, 0x2, 0x13f, 
       0x140, 0x5, 0x24, 0x13, 0x2, 0x140, 0x141, 0x7, 0x22, 0x2, 0x2, 0x141, 
       0x23, 0x3, 0x2, 0x2, 0x2, 0x142, 0x147, 0x5, 0x26, 0x14, 0x2, 0x143, 
       0x144, 0x5, 0x26, 0x14, 0x2, 0x144, 0x145, 0x5, 0x24, 0x13, 0x2, 
       0x145, 0x147, 0x3, 0x2, 0x2, 0x2, 0x146, 0x142, 0x3, 0x2, 0x2, 0x2, 
       0x146, 0x143, 0x3, 0x2, 0x2, 0x2, 0x147, 0x25, 0x3, 0x2, 0x2, 0x2, 
       0x148, 0x1a1, 0x5, 0x2e, 0x18, 0x2, 0x149, 0x14a, 0x5, 0x2e, 0x18, 
       0x2, 0x14a, 0x14b, 0x7, 0x23, 0x2, 0x2, 0x14b, 0x1a1, 0x3, 0x2, 0x2, 
       0x2, 0x14c, 0x14d, 0x5, 0x2e, 0x18, 0x2, 0x14d, 0x14e, 0x7, 0x29, 
       0x2, 0x2, 0x14e, 0x1a1, 0x3, 0x2, 0x2, 0x2, 0x14f, 0x150, 0x5, 0x2e, 
       0x18, 0x2, 0x150, 0x151, 0x7, 0x29, 0x2, 0x2, 0x151, 0x152, 0x7, 
       0x23, 0x2, 0x2, 0x152, 0x1a1, 0x3, 0x2, 0x2, 0x2, 0x153, 0x1a1, 0x7, 
       0x27, 0x2, 0x2, 0x154, 0x155, 0x7, 0x27, 0x2, 0x2, 0x155, 0x1a1, 
       0x7, 0x23, 0x2, 0x2, 0x156, 0x157, 0x7, 0x27, 0x2, 0x2, 0x157, 0x1a1, 
       0x7, 0x29, 0x2, 0x2, 0x158, 0x159, 0x7, 0x27, 0x2, 0x2, 0x159, 0x15a, 
       0x7, 0x29, 0x2, 0x2, 0x15a, 0x1a1, 0x7, 0x23, 0x2, 0x2, 0x15b, 0x15c, 
       0x5, 0x28, 0x15, 0x2, 0x15c, 0x15d, 0x7, 0x27, 0x2, 0x2, 0x15d, 0x1a1, 
       0x3, 0x2, 0x2, 0x2, 0x15e, 0x15f, 0x5, 0x28, 0x15, 0x2, 0x15f, 0x160, 
       0x7, 0x27, 0x2, 0x2, 0x160, 0x161, 0x7, 0x23, 0x2, 0x2, 0x161, 0x1a1, 
       0x3, 0x2, 0x2, 0x2, 0x162, 0x163, 0x5, 0x28, 0x15, 0x2, 0x163, 0x164, 
       0x7, 0x27, 0x2, 0x2, 0x164, 0x165, 0x7, 0x29, 0x2, 0x2, 0x165, 0x1a1, 
       0x3, 0x2, 0x2, 0x2, 0x166, 0x167, 0x5, 0x28, 0x15, 0x2, 0x167, 0x168, 
       0x7, 0x27, 0x2, 0x2, 0x168, 0x169, 0x7, 0x29, 0x2, 0x2, 0x169, 0x16a, 
       0x7, 0x23, 0x2, 0x2, 0x16a, 0x1a1, 0x3, 0x2, 0x2, 0x2, 0x16b, 0x16c, 
       0x7, 0x27, 0x2, 0x2, 0x16c, 0x1a1, 0x5, 0x2a, 0x16, 0x2, 0x16d, 0x16e, 
       0x7, 0x27, 0x2, 0x2, 0x16e, 0x16f, 0x5, 0x2a, 0x16, 0x2, 0x16f, 0x170, 
       0x7, 0x23, 0x2, 0x2, 0x170, 0x1a1, 0x3, 0x2, 0x2, 0x2, 0x171, 0x172, 
       0x7, 0x27, 0x2, 0x2, 0x172, 0x173, 0x5, 0x2a, 0x16, 0x2, 0x173, 0x174, 
       0x7, 0x29, 0x2, 0x2, 0x174, 0x1a1, 0x3, 0x2, 0x2, 0x2, 0x175, 0x176, 
       0x7, 0x27, 0x2, 0x2, 0x176, 0x177, 0x5, 0x2a, 0x16, 0x2, 0x177, 0x178, 
       0x7, 0x29, 0x2, 0x2, 0x178, 0x179, 0x7, 0x23, 0x2, 0x2, 0x179, 0x1a1, 
       0x3, 0x2, 0x2, 0x2, 0x17a, 0x1a1, 0x7, 0x2b, 0x2, 0x2, 0x17b, 0x17c, 
       0x7, 0x2b, 0x2, 0x2, 0x17c, 0x1a1, 0x7, 0x23, 0x2, 0x2, 0x17d, 0x17e, 
       0x7, 0x2b, 0x2, 0x2, 0x17e, 0x1a1, 0x7, 0x29, 0x2, 0x2, 0x17f, 0x180, 
       0x7, 0x2b, 0x2, 0x2, 0x180, 0x181, 0x7, 0x29, 0x2, 0x2, 0x181, 0x1a1, 
       0x7, 0x23, 0x2, 0x2, 0x182, 0x1a1, 0x7, 0x2c, 0x2, 0x2, 0x183, 0x184, 
       0x7, 0x2c, 0x2, 0x2, 0x184, 0x1a1, 0x7, 0x23, 0x2, 0x2, 0x185, 0x186, 
       0x7, 0x2c, 0x2, 0x2, 0x186, 0x1a1, 0x7, 0x29, 0x2, 0x2, 0x187, 0x188, 
       0x7, 0x2c, 0x2, 0x2, 0x188, 0x189, 0x7, 0x29, 0x2, 0x2, 0x189, 0x1a1, 
       0x7, 0x23, 0x2, 0x2, 0x18a, 0x1a1, 0x5, 0x22, 0x12, 0x2, 0x18b, 0x18c, 
       0x5, 0x22, 0x12, 0x2, 0x18c, 0x18d, 0x7, 0x23, 0x2, 0x2, 0x18d, 0x1a1, 
       0x3, 0x2, 0x2, 0x2, 0x18e, 0x18f, 0x5, 0x22, 0x12, 0x2, 0x18f, 0x190, 
       0x7, 0x29, 0x2, 0x2, 0x190, 0x1a1, 0x3, 0x2, 0x2, 0x2, 0x191, 0x192, 
       0x5, 0x22, 0x12, 0x2, 0x192, 0x193, 0x7, 0x29, 0x2, 0x2, 0x193, 0x194, 
       0x7, 0x23, 0x2, 0x2, 0x194, 0x1a1, 0x3, 0x2, 0x2, 0x2, 0x195, 0x1a1, 
       0x5, 0x90, 0x49, 0x2, 0x196, 0x197, 0x5, 0x90, 0x49, 0x2, 0x197, 
       0x198, 0x7, 0x23, 0x2, 0x2, 0x198, 0x1a1, 0x3, 0x2, 0x2, 0x2, 0x199, 
       0x19a, 0x5, 0x90, 0x49, 0x2, 0x19a, 0x19b, 0x7, 0x29, 0x2, 0x2, 0x19b, 
       0x1a1, 0x3, 0x2, 0x2, 0x2, 0x19c, 0x19d, 0x5, 0x90, 0x49, 0x2, 0x19d, 
       0x19e, 0x7, 0x29, 0x2, 0x2, 0x19e, 0x19f, 0x7, 0x23, 0x2, 0x2, 0x19f, 
       0x1a1, 0x3, 0x2, 0x2, 0x2, 0x1a0, 0x148, 0x3, 0x2, 0x2, 0x2, 0x1a0, 
       0x149, 0x3, 0x2, 0x2, 0x2, 0x1a0, 0x14c, 0x3, 0x2, 0x2, 0x2, 0x1a0, 
       0x14f, 0x3, 0x2, 0x2, 0x2, 0x1a0, 0x153, 0x3, 0x2, 0x2, 0x2, 0x1a0, 
       0x154, 0x3, 0x2, 0x2, 0x2, 0x1a0, 0x156, 0x3, 0x2, 0x2, 0x2, 0x1a0, 
       0x158, 0x3, 0x2, 0x2, 0x2, 0x1a0, 0x15b, 0x3, 0x2, 0x2, 0x2, 0x1a0, 
       0x15e, 0x3, 0x2, 0x2, 0x2, 0x1a0, 0x162, 0x3, 0x2, 0x2, 0x2, 0x1a0, 
       0x166, 0x3, 0x2, 0x2, 0x2, 0x1a0, 0x16b, 0x3, 0x2, 0x2, 0x2, 0x1a0, 
       0x16d, 0x3, 0x2, 0x2, 0x2, 0x1a0, 0x171, 0x3, 0x2, 0x2, 0x2, 0x1a0, 
       0x175, 0x3, 0x2, 0x2, 0x2, 0x1a0, 0x17a, 0x3, 0x2, 0x2, 0x2, 0x1a0, 
       0x17b, 0x3, 0x2, 0x2, 0x2, 0x1a0, 0x17d, 0x3, 0x2, 0x2, 0x2, 0x1a0, 
       0x17f, 0x3, 0x2, 0x2, 0x2, 0x1a0, 0x182, 0x3, 0x2, 0x2, 0x2, 0x1a0, 
       0x183, 0x3, 0x2, 0x2, 0x2, 0x1a0, 0x185, 0x3, 0x2, 0x2, 0x2, 0x1a0, 
       0x187, 0x3, 0x2, 0x2, 0x2, 0x1a0, 0x18a, 0x3, 0x2, 0x2, 0x2, 0x1a0, 
       0x18b, 0x3, 0x2, 0x2, 0x2, 0x1a0, 0x18e, 0x3, 0x2, 0x2, 0x2, 0x1a0, 
       0x191, 0x3, 0x2, 0x2, 0x2, 0x1a0, 0x195, 0x3, 0x2, 0x2, 0x2, 0x1a0, 
       0x196, 0x3, 0x2, 0x2, 0x2, 0x1a0, 0x199, 0x3, 0x2, 0x2, 0x2, 0x1a0, 
       0x19c, 0x3, 0x2, 0x2, 0x2, 0x1a1, 0x27, 0x3, 0x2, 0x2, 0x2, 0x1a2, 
       0x1a3, 0x7, 0x26, 0x2, 0x2, 0x1a3, 0x29, 0x3, 0x2, 0x2, 0x2, 0x1a4, 
       0x1a5, 0x7, 0x26, 0x2, 0x2, 0x1a5, 0x2b, 0x3, 0x2, 0x2, 0x2, 0x1a6, 
       0x1a7, 0x5, 0x2e, 0x18, 0x2, 0x1a7, 0x1a8, 0x7, 0x17, 0x2, 0x2, 0x1a8, 
       0x2d, 0x3, 0x2, 0x2, 0x2, 0x1a9, 0x1aa, 0x7, 0x27, 0x2, 0x2, 0x1aa, 
       0x1bd, 0x5, 0x34, 0x1b, 0x2, 0x1ab, 0x1ac, 0x7, 0x27, 0x2, 0x2, 0x1ac, 
       0x1ad, 0x7, 0x19, 0x2, 0x2, 0x1ad, 0x1ae, 0x5, 0x30, 0x19, 0x2, 0x1ae, 
       0x1af, 0x5, 0x34, 0x1b, 0x2, 0x1af, 0x1bd, 0x3, 0x2, 0x2, 0x2, 0x1b0, 
       0x1b1, 0x7, 0x27, 0x2, 0x2, 0x1b1, 0x1b2, 0x7, 0x1b, 0x2, 0x2, 0x1b2, 
       0x1b3, 0x5, 0x30, 0x19, 0x2, 0x1b3, 0x1b4, 0x5, 0x34, 0x1b, 0x2, 
       0x1b4, 0x1bd, 0x3, 0x2, 0x2, 0x2, 0x1b5, 0x1b6, 0x7, 0x27, 0x2, 0x2, 
       0x1b6, 0x1b7, 0x7, 0x19, 0x2, 0x2, 0x1b7, 0x1b8, 0x5, 0x30, 0x19, 
       0x2, 0x1b8, 0x1b9, 0x5, 0x34, 0x1b, 0x2, 0x1b9, 0x1ba, 0x5, 0x32, 
       0x1a, 0x2, 0x1ba, 0x1bb, 0x5, 0x2e, 0x18, 0x2, 0x1bb, 0x1bd, 0x3, 
       0x2, 0x2, 0x2, 0x1bc, 0x1a9, 0x3, 0x2, 0x2, 0x2, 0x1bc, 0x1ab, 0x3, 
       0x2, 0x2, 0x2, 0x1bc, 0x1b0, 0x3, 0x2, 0x2, 0x2, 0x1bc, 0x1b5, 0x3, 
       0x2, 0x2, 0x2, 0x1bd, 0x2f, 0x3, 0x2, 0x2, 0x2, 0x1be, 0x1bf, 0x7, 
       0x27, 0x2, 0x2, 0x1bf, 0x31, 0x3, 0x2, 0x2, 0x2, 0x1c0, 0x1c1, 0x7, 
       0x19, 0x2, 0x2, 0x1c1, 0x33, 0x3, 0x2, 0x2, 0x2, 0x1c2, 0x1c3, 0x7, 
       0x21, 0x2, 0x2, 0x1c3, 0x1c9, 0x7, 0x22, 0x2, 0x2, 0x1c4, 0x1c5, 
       0x7, 0x21, 0x2, 0x2, 0x1c5, 0x1c6, 0x5, 0x36, 0x1c, 0x2, 0x1c6, 0x1c7, 
       0x7, 0x22, 0x2, 0x2, 0x1c7, 0x1c9, 0x3, 0x2, 0x2, 0x2, 0x1c8, 0x1c2, 
       0x3, 0x2, 0x2, 0x2, 0x1c8, 0x1c4, 0x3, 0x2, 0x2, 0x2, 0x1c9, 0x35, 
       0x3, 0x2, 0x2, 0x2, 0x1ca, 0x1d5, 0x5, 0x98, 0x4d, 0x2, 0x1cb, 0x1cc, 
       0x5, 0x98, 0x4d, 0x2, 0x1cc, 0x1cd, 0x7, 0x1c, 0x2, 0x2, 0x1cd, 0x1ce, 
       0x5, 0x36, 0x1c, 0x2, 0x1ce, 0x1d5, 0x3, 0x2, 0x2, 0x2, 0x1cf, 0x1d5, 
       0x5, 0x24, 0x13, 0x2, 0x1d0, 0x1d1, 0x5, 0x24, 0x13, 0x2, 0x1d1, 
       0x1d2, 0x7, 0x1c, 0x2, 0x2, 0x1d2, 0x1d3, 0x5, 0x36, 0x1c, 0x2, 0x1d3, 
       0x1d5, 0x3, 0x2, 0x2, 0x2, 0x1d4, 0x1ca, 0x3, 0x2, 0x2, 0x2, 0x1d4, 
       0x1cb, 0x3, 0x2, 0x2, 0x2, 0x1d4, 0x1cf, 0x3, 0x2, 0x2, 0x2, 0x1d4, 
       0x1d0, 0x3, 0x2, 0x2, 0x2, 0x1d5, 0x37, 0x3, 0x2, 0x2, 0x2, 0x1d6, 
       0x1db, 0x5, 0x3a, 0x1e, 0x2, 0x1d7, 0x1d8, 0x5, 0x3a, 0x1e, 0x2, 
       0x1d8, 0x1d9, 0x5, 0x38, 0x1d, 0x2, 0x1d9, 0x1db, 0x3, 0x2, 0x2, 
       0x2, 0x1da, 0x1d6, 0x3, 0x2, 0x2, 0x2, 0x1da, 0x1d7, 0x3, 0x2, 0x2, 
       0x2, 0x1db, 0x39, 0x3, 0x2, 0x2, 0x2, 0x1dc, 0x1e8, 0x5, 0x3c, 0x1f, 
       0x2, 0x1dd, 0x1de, 0x5, 0x3c, 0x1f, 0x2, 0x1de, 0x1df, 0x5, 0x3e, 
       0x20, 0x2, 0x1df, 0x1e8, 0x3, 0x2, 0x2, 0x2, 0x1e0, 0x1e1, 0x5, 0x3c, 
       0x1f, 0x2, 0x1e1, 0x1e2, 0x5, 0x42, 0x22, 0x2, 0x1e2, 0x1e8, 0x3, 
       0x2, 0x2, 0x2, 0x1e3, 0x1e4, 0x5, 0x3c, 0x1f, 0x2, 0x1e4, 0x1e5, 
       0x5, 0x3e, 0x20, 0x2, 0x1e5, 0x1e6, 0x5, 0x42, 0x22, 0x2, 0x1e6, 
       0x1e8, 0x3, 0x2, 0x2, 0x2, 0x1e7, 0x1dc, 0x3, 0x2, 0x2, 0x2, 0x1e7, 
       0x1dd, 0x3, 0x2, 0x2, 0x2, 0x1e7, 0x1e0, 0x3, 0x2, 0x2, 0x2, 0x1e7, 
       0x1e3, 0x3, 0x2, 0x2, 0x2, 0x1e8, 0x3b, 0x3, 0x2, 0x2, 0x2, 0x1e9, 
       0x1ea, 0x7, 0x5, 0x2, 0x2, 0x1ea, 0x1eb, 0x5, 0x44, 0x23, 0x2, 0x1eb, 
       0x1ec, 0x5, 0x46, 0x24, 0x2, 0x1ec, 0x3d, 0x3, 0x2, 0x2, 0x2, 0x1ed, 
       0x1f2, 0x5, 0x40, 0x21, 0x2, 0x1ee, 0x1ef, 0x5, 0x40, 0x21, 0x2, 
       0x1ef, 0x1f0, 0x5, 0x3e, 0x20, 0x2, 0x1f0, 0x1f2, 0x3, 0x2, 0x2, 
       0x2, 0x1f1, 0x1ed, 0x3, 0x2, 0x2, 0x2, 0x1f1, 0x1ee, 0x3, 0x2, 0x2, 
       0x2, 0x1f2, 0x3f, 0x3, 0x2, 0x2, 0x2, 0x1f3, 0x1f4, 0x7, 0x6, 0x2, 
       0x2, 0x1f4, 0x1f5, 0x5, 0x44, 0x23, 0x2, 0x1f5, 0x1f6, 0x5, 0x46, 
       0x24, 0x2, 0x1f6, 0x41, 0x3, 0x2, 0x2, 0x2, 0x1f7, 0x1f8, 0x7, 0x7, 
       0x2, 0x2, 0x1f8, 0x1f9, 0x5, 0x46, 0x24, 0x2, 0x1f9, 0x43, 0x3, 0x2, 
       0x2, 0x2, 0x1fa, 0x1fb, 0x5, 0x50, 0x29, 0x2, 0x1fb, 0x45, 0x3, 0x2, 
       0x2, 0x2, 0x1fc, 0x1fd, 0x7, 0x1f, 0x2, 0x2, 0x1fd, 0x207, 0x7, 0x20, 
       0x2, 0x2, 0x1fe, 0x1ff, 0x7, 0x1f, 0x2, 0x2, 0x1ff, 0x200, 0x5, 0x48, 
       0x25, 0x2, 0x200, 0x201, 0x7, 0x20, 0x2, 0x2, 0x201, 0x207, 0x3, 
       0x2, 0x2, 0x2, 0x202, 0x207, 0x5, 0x38, 0x1d, 0x2, 0x203, 0x207, 
       0x5, 0x2c, 0x17, 0x2, 0x204, 0x207, 0x5, 0x58, 0x2d, 0x2, 0x205, 
       0x207, 0x5, 0x68, 0x35, 0x2, 0x206, 0x1fc, 0x3, 0x2, 0x2, 0x2, 0x206, 
       0x1fe, 0x3, 0x2, 0x2, 0x2, 0x206, 0x202, 0x3, 0x2, 0x2, 0x2, 0x206, 
       0x203, 0x3, 0x2, 0x2, 0x2, 0x206, 0x204, 0x3, 0x2, 0x2, 0x2, 0x206, 
       0x205, 0x3, 0x2, 0x2, 0x2, 0x207, 0x47, 0x3, 0x2, 0x2, 0x2, 0x208, 
       0x20d, 0x5, 0x6, 0x4, 0x2, 0x209, 0x20a, 0x5, 0x6, 0x4, 0x2, 0x20a, 
       0x20b, 0x5, 0x48, 0x25, 0x2, 0x20b, 0x20d, 0x3, 0x2, 0x2, 0x2, 0x20c, 
       0x208, 0x3, 0x2, 0x2, 0x2, 0x20c, 0x209, 0x3, 0x2, 0x2, 0x2, 0x20d, 
       0x49, 0x3, 0x2, 0x2, 0x2, 0x20e, 0x20f, 0x5, 0x4c, 0x27, 0x2, 0x20f, 
       0x4b, 0x3, 0x2, 0x2, 0x2, 0x210, 0x215, 0x5, 0x4e, 0x28, 0x2, 0x211, 
       0x212, 0x5, 0x4e, 0x28, 0x2, 0x212, 0x213, 0x5, 0x4c, 0x27, 0x2, 
       0x213, 0x215, 0x3, 0x2, 0x2, 0x2, 0x214, 0x210, 0x3, 0x2, 0x2, 0x2, 
       0x214, 0x211, 0x3, 0x2, 0x2, 0x2, 0x215, 0x4d, 0x3, 0x2, 0x2, 0x2, 
       0x216, 0x21c, 0x5, 0x54, 0x2b, 0x2, 0x217, 0x218, 0x7, 0x21, 0x2, 
       0x2, 0x218, 0x219, 0x5, 0x54, 0x2b, 0x2, 0x219, 0x21a, 0x7, 0x22, 
       0x2, 0x2, 0x21a, 0x21c, 0x3, 0x2, 0x2, 0x2, 0x21b, 0x216, 0x3, 0x2, 
       0x2, 0x2, 0x21b, 0x217, 0x3, 0x2, 0x2, 0x2, 0x21c, 0x4f, 0x3, 0x2, 
       0x2, 0x2, 0x21d, 0x228, 0x5, 0x54, 0x2b, 0x2, 0x21e, 0x21f, 0x5, 
       0x54, 0x2b, 0x2, 0x21f, 0x220, 0x5, 0x50, 0x29, 0x2, 0x220, 0x228, 
       0x3, 0x2, 0x2, 0x2, 0x221, 0x228, 0x5, 0x52, 0x2a, 0x2, 0x222, 0x223, 
       0x5, 0x52, 0x2a, 0x2, 0x223, 0x224, 0x5, 0x50, 0x29, 0x2, 0x224, 
       0x228, 0x3, 0x2, 0x2, 0x2, 0x225, 0x226, 0x7, 0x25, 0x2, 0x2, 0x226, 
       0x228, 0x5, 0x50, 0x29, 0x2, 0x227, 0x21d, 0x3, 0x2, 0x2, 0x2, 0x227, 
       0x21e, 0x3, 0x2, 0x2, 0x2, 0x227, 0x221, 0x3, 0x2, 0x2, 0x2, 0x227, 
       0x222, 0x3, 0x2, 0x2, 0x2, 0x227, 0x225, 0x3, 0x2, 0x2, 0x2, 0x228, 
       0x51, 0x3, 0x2, 0x2, 0x2, 0x229, 0x22a, 0x8, 0x2a, 0x1, 0x2, 0x22a, 
       0x22b, 0x7, 0x21, 0x2, 0x2, 0x22b, 0x22c, 0x5, 0x50, 0x29, 0x2, 0x22c, 
       0x22d, 0x7, 0x22, 0x2, 0x2, 0x22d, 0x235, 0x3, 0x2, 0x2, 0x2, 0x22e, 
       0x22f, 0xc, 0x4, 0x2, 0x2, 0x22f, 0x234, 0x7, 0x24, 0x2, 0x2, 0x230, 
       0x231, 0xc, 0x3, 0x2, 0x2, 0x231, 0x232, 0x7, 0x29, 0x2, 0x2, 0x232, 
       0x234, 0x7, 0x24, 0x2, 0x2, 0x233, 0x22e, 0x3, 0x2, 0x2, 0x2, 0x233, 
       0x230, 0x3, 0x2, 0x2, 0x2, 0x234, 0x237, 0x3, 0x2, 0x2, 0x2, 0x235, 
       0x233, 0x3, 0x2, 0x2, 0x2, 0x235, 0x236, 0x3, 0x2, 0x2, 0x2, 0x236, 
       0x53, 0x3, 0x2, 0x2, 0x2, 0x237, 0x235, 0x3, 0x2, 0x2, 0x2, 0x238, 
       0x239, 0x5, 0x28, 0x15, 0x2, 0x239, 0x23a, 0x7, 0x27, 0x2, 0x2, 0x23a, 
       0x2a5, 0x3, 0x2, 0x2, 0x2, 0x23b, 0x23c, 0x5, 0x28, 0x15, 0x2, 0x23c, 
       0x23d, 0x7, 0x27, 0x2, 0x2, 0x23d, 0x23e, 0x9, 0x3, 0x2, 0x2, 0x23e, 
       0x2a5, 0x3, 0x2, 0x2, 0x2, 0x23f, 0x240, 0x5, 0x28, 0x15, 0x2, 0x240, 
       0x241, 0x7, 0x27, 0x2, 0x2, 0x241, 0x242, 0x7, 0x29, 0x2, 0x2, 0x242, 
       0x2a5, 0x3, 0x2, 0x2, 0x2, 0x243, 0x244, 0x5, 0x28, 0x15, 0x2, 0x244, 
       0x245, 0x7, 0x27, 0x2, 0x2, 0x245, 0x246, 0x7, 0x29, 0x2, 0x2, 0x246, 
       0x247, 0x9, 0x3, 0x2, 0x2, 0x247, 0x2a5, 0x3, 0x2, 0x2, 0x2, 0x248, 
       0x249, 0x7, 0x27, 0x2, 0x2, 0x249, 0x2a5, 0x5, 0x2a, 0x16, 0x2, 0x24a, 
       0x24b, 0x7, 0x27, 0x2, 0x2, 0x24b, 0x24c, 0x5, 0x2a, 0x16, 0x2, 0x24c, 
       0x24d, 0x9, 0x3, 0x2, 0x2, 0x24d, 0x2a5, 0x3, 0x2, 0x2, 0x2, 0x24e, 
       0x24f, 0x7, 0x27, 0x2, 0x2, 0x24f, 0x250, 0x5, 0x2a, 0x16, 0x2, 0x250, 
       0x251, 0x7, 0x29, 0x2, 0x2, 0x251, 0x2a5, 0x3, 0x2, 0x2, 0x2, 0x252, 
       0x253, 0x7, 0x27, 0x2, 0x2, 0x253, 0x254, 0x5, 0x2a, 0x16, 0x2, 0x254, 
       0x255, 0x7, 0x29, 0x2, 0x2, 0x255, 0x256, 0x9, 0x3, 0x2, 0x2, 0x256, 
       0x2a5, 0x3, 0x2, 0x2, 0x2, 0x257, 0x2a5, 0x7, 0x2b, 0x2, 0x2, 0x258, 
       0x259, 0x7, 0x2b, 0x2, 0x2, 0x259, 0x2a5, 0x9, 0x3, 0x2, 0x2, 0x25a, 
       0x25b, 0x7, 0x2b, 0x2, 0x2, 0x25b, 0x2a5, 0x7, 0x29, 0x2, 0x2, 0x25c, 
       0x25d, 0x7, 0x2b, 0x2, 0x2, 0x25d, 0x25e, 0x7, 0x29, 0x2, 0x2, 0x25e, 
       0x2a5, 0x9, 0x3, 0x2, 0x2, 0x25f, 0x2a5, 0x7, 0x2c, 0x2, 0x2, 0x260, 
       0x261, 0x7, 0x2c, 0x2, 0x2, 0x261, 0x2a5, 0x9, 0x3, 0x2, 0x2, 0x262, 
       0x263, 0x7, 0x2c, 0x2, 0x2, 0x263, 0x2a5, 0x7, 0x29, 0x2, 0x2, 0x264, 
       0x265, 0x7, 0x2c, 0x2, 0x2, 0x265, 0x266, 0x7, 0x29, 0x2, 0x2, 0x266, 
       0x2a5, 0x9, 0x3, 0x2, 0x2, 0x267, 0x2a5, 0x5, 0x2e, 0x18, 0x2, 0x268, 
       0x269, 0x5, 0x2e, 0x18, 0x2, 0x269, 0x26a, 0x9, 0x3, 0x2, 0x2, 0x26a, 
       0x2a5, 0x3, 0x2, 0x2, 0x2, 0x26b, 0x26c, 0x5, 0x2e, 0x18, 0x2, 0x26c, 
       0x26d, 0x7, 0x29, 0x2, 0x2, 0x26d, 0x2a5, 0x3, 0x2, 0x2, 0x2, 0x26e, 
       0x26f, 0x5, 0x2e, 0x18, 0x2, 0x26f, 0x270, 0x7, 0x29, 0x2, 0x2, 0x270, 
       0x271, 0x9, 0x3, 0x2, 0x2, 0x271, 0x2a5, 0x3, 0x2, 0x2, 0x2, 0x272, 
       0x273, 0x5, 0x56, 0x2c, 0x2, 0x273, 0x274, 0x7, 0x18, 0x2, 0x2, 0x274, 
       0x275, 0x5, 0x2e, 0x18, 0x2, 0x275, 0x2a5, 0x3, 0x2, 0x2, 0x2, 0x276, 
       0x277, 0x5, 0x56, 0x2c, 0x2, 0x277, 0x278, 0x7, 0x18, 0x2, 0x2, 0x278, 
       0x279, 0x5, 0x2e, 0x18, 0x2, 0x279, 0x27a, 0x9, 0x3, 0x2, 0x2, 0x27a, 
       0x2a5, 0x3, 0x2, 0x2, 0x2, 0x27b, 0x27c, 0x5, 0x56, 0x2c, 0x2, 0x27c, 
       0x27d, 0x7, 0x18, 0x2, 0x2, 0x27d, 0x27e, 0x5, 0x2e, 0x18, 0x2, 0x27e, 
       0x27f, 0x7, 0x29, 0x2, 0x2, 0x27f, 0x2a5, 0x3, 0x2, 0x2, 0x2, 0x280, 
       0x281, 0x5, 0x56, 0x2c, 0x2, 0x281, 0x282, 0x7, 0x18, 0x2, 0x2, 0x282, 
       0x283, 0x5, 0x2e, 0x18, 0x2, 0x283, 0x284, 0x7, 0x29, 0x2, 0x2, 0x284, 
       0x285, 0x9, 0x3, 0x2, 0x2, 0x285, 0x2a5, 0x3, 0x2, 0x2, 0x2, 0x286, 
       0x2a5, 0x5, 0x22, 0x12, 0x2, 0x287, 0x288, 0x5, 0x22, 0x12, 0x2, 
       0x288, 0x289, 0x9, 0x3, 0x2, 0x2, 0x289, 0x2a5, 0x3, 0x2, 0x2, 0x2, 
       0x28a, 0x28b, 0x5, 0x22, 0x12, 0x2, 0x28b, 0x28c, 0x7, 0x29, 0x2, 
       0x2, 0x28c, 0x2a5, 0x3, 0x2, 0x2, 0x2, 0x28d, 0x28e, 0x5, 0x22, 0x12, 
       0x2, 0x28e, 0x28f, 0x7, 0x29, 0x2, 0x2, 0x28f, 0x290, 0x9, 0x3, 0x2, 
       0x2, 0x290, 0x2a5, 0x3, 0x2, 0x2, 0x2, 0x291, 0x2a5, 0x7, 0x27, 0x2, 
       0x2, 0x292, 0x293, 0x7, 0x27, 0x2, 0x2, 0x293, 0x2a5, 0x9, 0x3, 0x2, 
       0x2, 0x294, 0x295, 0x7, 0x27, 0x2, 0x2, 0x295, 0x2a5, 0x7, 0x29, 
       0x2, 0x2, 0x296, 0x297, 0x7, 0x27, 0x2, 0x2, 0x297, 0x298, 0x7, 0x29, 
       0x2, 0x2, 0x298, 0x2a5, 0x9, 0x3, 0x2, 0x2, 0x299, 0x2a5, 0x5, 0x90, 
       0x49, 0x2, 0x29a, 0x29b, 0x5, 0x90, 0x49, 0x2, 0x29b, 0x29c, 0x9, 
       0x3, 0x2, 0x2, 0x29c, 0x2a5, 0x3, 0x2, 0x2, 0x2, 0x29d, 0x29e, 0x5, 
       0x90, 0x49, 0x2, 0x29e, 0x29f, 0x7, 0x29, 0x2, 0x2, 0x29f, 0x2a5, 
       0x3, 0x2, 0x2, 0x2, 0x2a0, 0x2a1, 0x5, 0x90, 0x49, 0x2, 0x2a1, 0x2a2, 
       0x7, 0x29, 0x2, 0x2, 0x2a2, 0x2a3, 0x9, 0x3, 0x2, 0x2, 0x2a3, 0x2a5, 
       0x3, 0x2, 0x2, 0x2, 0x2a4, 0x238, 0x3, 0x2, 0x2, 0x2, 0x2a4, 0x23b, 
       0x3, 0x2, 0x2, 0x2, 0x2a4, 0x23f, 0x3, 0x2, 0x2, 0x2, 0x2a4, 0x243, 
       0x3, 0x2, 0x2, 0x2, 0x2a4, 0x248, 0x3, 0x2, 0x2, 0x2, 0x2a4, 0x24a, 
       0x3, 0x2, 0x2, 0x2, 0x2a4, 0x24e, 0x3, 0x2, 0x2, 0x2, 0x2a4, 0x252, 
       0x3, 0x2, 0x2, 0x2, 0x2a4, 0x257, 0x3, 0x2, 0x2, 0x2, 0x2a4, 0x258, 
       0x3, 0x2, 0x2, 0x2, 0x2a4, 0x25a, 0x3, 0x2, 0x2, 0x2, 0x2a4, 0x25c, 
       0x3, 0x2, 0x2, 0x2, 0x2a4, 0x25f, 0x3, 0x2, 0x2, 0x2, 0x2a4, 0x260, 
       0x3, 0x2, 0x2, 0x2, 0x2a4, 0x262, 0x3, 0x2, 0x2, 0x2, 0x2a4, 0x264, 
       0x3, 0x2, 0x2, 0x2, 0x2a4, 0x267, 0x3, 0x2, 0x2, 0x2, 0x2a4, 0x268, 
       0x3, 0x2, 0x2, 0x2, 0x2a4, 0x26b, 0x3, 0x2, 0x2, 0x2, 0x2a4, 0x26e, 
       0x3, 0x2, 0x2, 0x2, 0x2a4, 0x272, 0x3, 0x2, 0x2, 0x2, 0x2a4, 0x276, 
       0x3, 0x2, 0x2, 0x2, 0x2a4, 0x27b, 0x3, 0x2, 0x2, 0x2, 0x2a4, 0x280, 
       0x3, 0x2, 0x2, 0x2, 0x2a4, 0x286, 0x3, 0x2, 0x2, 0x2, 0x2a4, 0x287, 
       0x3, 0x2, 0x2, 0x2, 0x2a4, 0x28a, 0x3, 0x2, 0x2, 0x2, 0x2a4, 0x28d, 
       0x3, 0x2, 0x2, 0x2, 0x2a4, 0x291, 0x3, 0x2, 0x2, 0x2, 0x2a4, 0x292, 
       0x3, 0x2, 0x2, 0x2, 0x2a4, 0x294, 0x3, 0x2, 0x2, 0x2, 0x2a4, 0x296, 
       0x3, 0x2, 0x2, 0x2, 0x2a4, 0x299, 0x3, 0x2, 0x2, 0x2, 0x2a4, 0x29a, 
       0x3, 0x2, 0x2, 0x2, 0x2a4, 0x29d, 0x3, 0x2, 0x2, 0x2, 0x2a4, 0x2a0, 
       0x3, 0x2, 0x2, 0x2, 0x2a5, 0x55, 0x3, 0x2, 0x2, 0x2, 0x2a6, 0x2ae, 
       0x5, 0x90, 0x49, 0x2, 0x2a7, 0x2a8, 0x5, 0x90, 0x49, 0x2, 0x2a8, 
       0x2a9, 0x7, 0x29, 0x2, 0x2, 0x2a9, 0x2ae, 0x3, 0x2, 0x2, 0x2, 0x2aa, 
       0x2ae, 0x7, 0x27, 0x2, 0x2, 0x2ab, 0x2ac, 0x7, 0x27, 0x2, 0x2, 0x2ac, 
       0x2ae, 0x7, 0x29, 0x2, 0x2, 0x2ad, 0x2a6, 0x3, 0x2, 0x2, 0x2, 0x2ad, 
       0x2a7, 0x3, 0x2, 0x2, 0x2, 0x2ad, 0x2aa, 0x3, 0x2, 0x2, 0x2, 0x2ad, 
       0x2ab, 0x3, 0x2, 0x2, 0x2, 0x2ae, 0x57, 0x3, 0x2, 0x2, 0x2, 0x2af, 
       0x2b0, 0x7, 0x8, 0x2, 0x2, 0x2b0, 0x2b1, 0x5, 0x5a, 0x2e, 0x2, 0x2b1, 
       0x2b2, 0x7, 0x1f, 0x2, 0x2, 0x2b2, 0x2b3, 0x7, 0x20, 0x2, 0x2, 0x2b3, 
       0x2c3, 0x3, 0x2, 0x2, 0x2, 0x2b4, 0x2b5, 0x7, 0x8, 0x2, 0x2, 0x2b5, 
       0x2b6, 0x5, 0x5a, 0x2e, 0x2, 0x2b6, 0x2b7, 0x7, 0x1f, 0x2, 0x2, 0x2b7, 
       0x2b8, 0x5, 0x64, 0x33, 0x2, 0x2b8, 0x2b9, 0x7, 0x20, 0x2, 0x2, 0x2b9, 
       0x2c3, 0x3, 0x2, 0x2, 0x2, 0x2ba, 0x2bb, 0x7, 0x8, 0x2, 0x2, 0x2bb, 
       0x2bc, 0x5, 0x5a, 0x2e, 0x2, 0x2bc, 0x2bd, 0x5, 0x2c, 0x17, 0x2, 
       0x2bd, 0x2c3, 0x3, 0x2, 0x2, 0x2, 0x2be, 0x2bf, 0x7, 0x8, 0x2, 0x2, 
       0x2bf, 0x2c0, 0x5, 0x5a, 0x2e, 0x2, 0x2c0, 0x2c1, 0x5, 0x66, 0x34, 
       0x2, 0x2c1, 0x2c3, 0x3, 0x2, 0x2, 0x2, 0x2c2, 0x2af, 0x3, 0x2, 0x2, 
       0x2, 0x2c2, 0x2b4, 0x3, 0x2, 0x2, 0x2, 0x2c2, 0x2ba, 0x3, 0x2, 0x2, 
       0x2, 0x2c2, 0x2be, 0x3, 0x2, 0x2, 0x2, 0x2c3, 0x59, 0x3, 0x2, 0x2, 
       0x2, 0x2c4, 0x2c5, 0x7, 0x21, 0x2, 0x2, 0x2c5, 0x2c6, 0x5, 0x5c, 
       0x2f, 0x2, 0x2c6, 0x2c7, 0x7, 0x17, 0x2, 0x2, 0x2c7, 0x2c8, 0x5, 
       0x5e, 0x30, 0x2, 0x2c8, 0x2c9, 0x7, 0x17, 0x2, 0x2, 0x2c9, 0x2ca, 
       0x5, 0x60, 0x31, 0x2, 0x2ca, 0x2cb, 0x7, 0x22, 0x2, 0x2, 0x2cb, 0x2d7, 
       0x3, 0x2, 0x2, 0x2, 0x2cc, 0x2cd, 0x5, 0x5c, 0x2f, 0x2, 0x2cd, 0x2ce, 
       0x7, 0x17, 0x2, 0x2, 0x2ce, 0x2cf, 0x5, 0x5e, 0x30, 0x2, 0x2cf, 0x2d0, 
       0x7, 0x17, 0x2, 0x2, 0x2d0, 0x2d1, 0x5, 0x60, 0x31, 0x2, 0x2d1, 0x2d7, 
       0x3, 0x2, 0x2, 0x2, 0x2d2, 0x2d7, 0x5, 0x50, 0x29, 0x2, 0x2d3, 0x2d4, 
       0x7, 0x21, 0x2, 0x2, 0x2d4, 0x2d7, 0x7, 0x22, 0x2, 0x2, 0x2d5, 0x2d7, 
       0x3, 0x2, 0x2, 0x2, 0x2d6, 0x2c4, 0x3, 0x2, 0x2, 0x2, 0x2d6, 0x2cc, 
       0x3, 0x2, 0x2, 0x2, 0x2d6, 0x2d2, 0x3, 0x2, 0x2, 0x2, 0x2d6, 0x2d3, 
       0x3, 0x2, 0x2, 0x2, 0x2d6, 0x2d5, 0x3, 0x2, 0x2, 0x2, 0x2d7, 0x5b, 
       0x3, 0x2, 0x2, 0x2, 0x2d8, 0x2db, 0x5, 0x14, 0xb, 0x2, 0x2d9, 0x2db, 
       0x3, 0x2, 0x2, 0x2, 0x2da, 0x2d8, 0x3, 0x2, 0x2, 0x2, 0x2da, 0x2d9, 
       0x3, 0x2, 0x2, 0x2, 0x2db, 0x5d, 0x3, 0x2, 0x2, 0x2, 0x2dc, 0x2df, 
       0x5, 0x50, 0x29, 0x2, 0x2dd, 0x2df, 0x3, 0x2, 0x2, 0x2, 0x2de, 0x2dc, 
       0x3, 0x2, 0x2, 0x2, 0x2de, 0x2dd, 0x3, 0x2, 0x2, 0x2, 0x2df, 0x5f, 
       0x3, 0x2, 0x2, 0x2, 0x2e0, 0x2e3, 0x5, 0x62, 0x32, 0x2, 0x2e1, 0x2e3, 
       0x3, 0x2, 0x2, 0x2, 0x2e2, 0x2e0, 0x3, 0x2, 0x2, 0x2, 0x2e2, 0x2e1, 
       0x3, 0x2, 0x2, 0x2, 0x2e3, 0x61, 0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2ef, 
       0x5, 0x24, 0x13, 0x2, 0x2e5, 0x2ef, 0x5, 0x22, 0x12, 0x2, 0x2e6, 
       0x2e7, 0x5, 0x24, 0x13, 0x2, 0x2e7, 0x2e8, 0x7, 0x1c, 0x2, 0x2, 0x2e8, 
       0x2e9, 0x5, 0x62, 0x32, 0x2, 0x2e9, 0x2ef, 0x3, 0x2, 0x2, 0x2, 0x2ea, 
       0x2eb, 0x5, 0x22, 0x12, 0x2, 0x2eb, 0x2ec, 0x7, 0x1c, 0x2, 0x2, 0x2ec, 
       0x2ed, 0x5, 0x62, 0x32, 0x2, 0x2ed, 0x2ef, 0x3, 0x2, 0x2, 0x2, 0x2ee, 
       0x2e4, 0x3, 0x2, 0x2, 0x2, 0x2ee, 0x2e5, 0x3, 0x2, 0x2, 0x2, 0x2ee, 
       0x2e6, 0x3, 0x2, 0x2, 0x2, 0x2ee, 0x2ea, 0x3, 0x2, 0x2, 0x2, 0x2ef, 
       0x63, 0x3, 0x2, 0x2, 0x2, 0x2f0, 0x2f5, 0x5, 0x6, 0x4, 0x2, 0x2f1, 
       0x2f2, 0x5, 0x6, 0x4, 0x2, 0x2f2, 0x2f3, 0x5, 0x64, 0x33, 0x2, 0x2f3, 
       0x2f5, 0x3, 0x2, 0x2, 0x2, 0x2f4, 0x2f0, 0x3, 0x2, 0x2, 0x2, 0x2f4, 
       0x2f1, 0x3, 0x2, 0x2, 0x2, 0x2f5, 0x65, 0x3, 0x2, 0x2, 0x2, 0x2f6, 
       0x2fd, 0x5, 0x58, 0x2d, 0x2, 0x2f7, 0x2f8, 0x5, 0x58, 0x2d, 0x2, 
       0x2f8, 0x2f9, 0x5, 0x66, 0x34, 0x2, 0x2f9, 0x2fd, 0x3, 0x2, 0x2, 
       0x2, 0x2fa, 0x2fd, 0x5, 0x38, 0x1d, 0x2, 0x2fb, 0x2fd, 0x5, 0x68, 
       0x35, 0x2, 0x2fc, 0x2f6, 0x3, 0x2, 0x2, 0x2, 0x2fc, 0x2f7, 0x3, 0x2, 
       0x2, 0x2, 0x2fc, 0x2fa, 0x3, 0x2, 0x2, 0x2, 0x2fc, 0x2fb, 0x3, 0x2, 
       0x2, 0x2, 0x2fd, 0x67, 0x3, 0x2, 0x2, 0x2, 0x2fe, 0x2ff, 0x7, 0x9, 
       0x2, 0x2, 0x2ff, 0x300, 0x5, 0x6a, 0x36, 0x2, 0x300, 0x301, 0x7, 
       0x17, 0x2, 0x2, 0x301, 0x69, 0x3, 0x2, 0x2, 0x2, 0x302, 0x306, 0x5, 
       0x98, 0x4d, 0x2, 0x303, 0x306, 0x5, 0x24, 0x13, 0x2, 0x304, 0x306, 
       0x5, 0x22, 0x12, 0x2, 0x305, 0x302, 0x3, 0x2, 0x2, 0x2, 0x305, 0x303, 
       0x3, 0x2, 0x2, 0x2, 0x305, 0x304, 0x3, 0x2, 0x2, 0x2, 0x306, 0x6b, 
       0x3, 0x2, 0x2, 0x2, 0x307, 0x308, 0x5, 0x70, 0x39, 0x2, 0x308, 0x309, 
       0x7, 0x1f, 0x2, 0x2, 0x309, 0x30a, 0x7, 0x20, 0x2, 0x2, 0x30a, 0x326, 
       0x3, 0x2, 0x2, 0x2, 0x30b, 0x30c, 0x5, 0x70, 0x39, 0x2, 0x30c, 0x30d, 
       0x7, 0x1f, 0x2, 0x2, 0x30d, 0x30e, 0x5, 0x7a, 0x3e, 0x2, 0x30e, 0x30f, 
       0x7, 0x20, 0x2, 0x2, 0x30f, 0x326, 0x3, 0x2, 0x2, 0x2, 0x310, 0x311, 
       0x5, 0x72, 0x3a, 0x2, 0x311, 0x312, 0x7, 0x1f, 0x2, 0x2, 0x312, 0x313, 
       0x7, 0x20, 0x2, 0x2, 0x313, 0x326, 0x3, 0x2, 0x2, 0x2, 0x314, 0x315, 
       0x5, 0x72, 0x3a, 0x2, 0x315, 0x316, 0x7, 0x1f, 0x2, 0x2, 0x316, 0x317, 
       0x5, 0x7a, 0x3e, 0x2, 0x317, 0x318, 0x7, 0x20, 0x2, 0x2, 0x318, 0x326, 
       0x3, 0x2, 0x2, 0x2, 0x319, 0x31a, 0x5, 0x76, 0x3c, 0x2, 0x31a, 0x31b, 
       0x7, 0x1f, 0x2, 0x2, 0x31b, 0x31c, 0x7, 0x20, 0x2, 0x2, 0x31c, 0x326, 
       0x3, 0x2, 0x2, 0x2, 0x31d, 0x31e, 0x5, 0x76, 0x3c, 0x2, 0x31e, 0x31f, 
       0x7, 0x1f, 0x2, 0x2, 0x31f, 0x320, 0x5, 0x7a, 0x3e, 0x2, 0x320, 0x321, 
       0x7, 0x20, 0x2, 0x2, 0x321, 0x326, 0x3, 0x2, 0x2, 0x2, 0x322, 0x323, 
       0x5, 0x78, 0x3d, 0x2, 0x323, 0x324, 0x7, 0x17, 0x2, 0x2, 0x324, 0x326, 
       0x3, 0x2, 0x2, 0x2, 0x325, 0x307, 0x3, 0x2, 0x2, 0x2, 0x325, 0x30b, 
       0x3, 0x2, 0x2, 0x2, 0x325, 0x310, 0x3, 0x2, 0x2, 0x2, 0x325, 0x314, 
       0x3, 0x2, 0x2, 0x2, 0x325, 0x319, 0x3, 0x2, 0x2, 0x2, 0x325, 0x31d, 
       0x3, 0x2, 0x2, 0x2, 0x325, 0x322, 0x3, 0x2, 0x2, 0x2, 0x326, 0x6d, 
       0x3, 0x2, 0x2, 0x2, 0x327, 0x328, 0x7, 0xa, 0x2, 0x2, 0x328, 0x329, 
       0x7, 0x27, 0x2, 0x2, 0x329, 0x32a, 0x7, 0x21, 0x2, 0x2, 0x32a, 0x340, 
       0x7, 0x22, 0x2, 0x2, 0x32b, 0x32c, 0x7, 0xa, 0x2, 0x2, 0x32c, 0x32d, 
       0x7, 0x27, 0x2, 0x2, 0x32d, 0x32e, 0x7, 0x21, 0x2, 0x2, 0x32e, 0x32f, 
       0x7, 0x22, 0x2, 0x2, 0x32f, 0x330, 0x7, 0x16, 0x2, 0x2, 0x330, 0x340, 
       0x7, 0x27, 0x2, 0x2, 0x331, 0x332, 0x7, 0xa, 0x2, 0x2, 0x332, 0x333, 
       0x7, 0x27, 0x2, 0x2, 0x333, 0x334, 0x7, 0x21, 0x2, 0x2, 0x334, 0x335, 
       0x5, 0x7c, 0x3f, 0x2, 0x335, 0x336, 0x7, 0x22, 0x2, 0x2, 0x336, 0x340, 
       0x3, 0x2, 0x2, 0x2, 0x337, 0x338, 0x7, 0xa, 0x2, 0x2, 0x338, 0x339, 
       0x7, 0x27, 0x2, 0x2, 0x339, 0x33a, 0x7, 0x21, 0x2, 0x2, 0x33a, 0x33b, 
       0x5, 0x7c, 0x3f, 0x2, 0x33b, 0x33c, 0x7, 0x22, 0x2, 0x2, 0x33c, 0x33d, 
       0x7, 0x16, 0x2, 0x2, 0x33d, 0x33e, 0x7, 0x27, 0x2, 0x2, 0x33e, 0x340, 
       0x3, 0x2, 0x2, 0x2, 0x33f, 0x327, 0x3, 0x2, 0x2, 0x2, 0x33f, 0x32b, 
       0x3, 0x2, 0x2, 0x2, 0x33f, 0x331, 0x3, 0x2, 0x2, 0x2, 0x33f, 0x337, 
       0x3, 0x2, 0x2, 0x2, 0x340, 0x6f, 0x3, 0x2, 0x2, 0x2, 0x341, 0x342, 
       0x5, 0x6e, 0x38, 0x2, 0x342, 0x71, 0x3, 0x2, 0x2, 0x2, 0x343, 0x344, 
       0x5, 0x74, 0x3b, 0x2, 0x344, 0x345, 0x5, 0x6e, 0x38, 0x2, 0x345, 
       0x35b, 0x3, 0x2, 0x2, 0x2, 0x346, 0x347, 0x7, 0xe, 0x2, 0x2, 0x347, 
       0x35b, 0x5, 0x6e, 0x38, 0x2, 0x348, 0x349, 0x5, 0x74, 0x3b, 0x2, 
       0x349, 0x34a, 0x7, 0xe, 0x2, 0x2, 0x34a, 0x34b, 0x5, 0x6e, 0x38, 
       0x2, 0x34b, 0x35b, 0x3, 0x2, 0x2, 0x2, 0x34c, 0x34d, 0x7, 0xf, 0x2, 
       0x2, 0x34d, 0x34e, 0x5, 0x74, 0x3b, 0x2, 0x34e, 0x34f, 0x7, 0xe, 
       0x2, 0x2, 0x34f, 0x350, 0x5, 0x6e, 0x38, 0x2, 0x350, 0x35b, 0x3, 
       0x2, 0x2, 0x2, 0x351, 0x352, 0x7, 0xf, 0x2, 0x2, 0x352, 0x353, 0x5, 
       0x74, 0x3b, 0x2, 0x353, 0x354, 0x5, 0x6e, 0x38, 0x2, 0x354, 0x35b, 
       0x3, 0x2, 0x2, 0x2, 0x355, 0x356, 0x7, 0xf, 0x2, 0x2, 0x356, 0x35b, 
       0x5, 0x6e, 0x38, 0x2, 0x357, 0x358, 0x7, 0xf, 0x2, 0x2, 0x358, 0x359, 
       0x7, 0xe, 0x2, 0x2, 0x359, 0x35b, 0x5, 0x6e, 0x38, 0x2, 0x35a, 0x343, 
       0x3, 0x2, 0x2, 0x2, 0x35a, 0x346, 0x3, 0x2, 0x2, 0x2, 0x35a, 0x348, 
       0x3, 0x2, 0x2, 0x2, 0x35a, 0x34c, 0x3, 0x2, 0x2, 0x2, 0x35a, 0x351, 
       0x3, 0x2, 0x2, 0x2, 0x35a, 0x355, 0x3, 0x2, 0x2, 0x2, 0x35a, 0x357, 
       0x3, 0x2, 0x2, 0x2, 0x35b, 0x73, 0x3, 0x2, 0x2, 0x2, 0x35c, 0x35d, 
       0x9, 0x4, 0x2, 0x2, 0x35d, 0x75, 0x3, 0x2, 0x2, 0x2, 0x35e, 0x35f, 
       0x7, 0x27, 0x2, 0x2, 0x35f, 0x360, 0x7, 0x21, 0x2, 0x2, 0x360, 0x367, 
       0x7, 0x22, 0x2, 0x2, 0x361, 0x362, 0x7, 0x27, 0x2, 0x2, 0x362, 0x363, 
       0x7, 0x21, 0x2, 0x2, 0x363, 0x364, 0x5, 0x7c, 0x3f, 0x2, 0x364, 0x365, 
       0x7, 0x22, 0x2, 0x2, 0x365, 0x367, 0x3, 0x2, 0x2, 0x2, 0x366, 0x35e, 
       0x3, 0x2, 0x2, 0x2, 0x366, 0x361, 0x3, 0x2, 0x2, 0x2, 0x367, 0x77, 
       0x3, 0x2, 0x2, 0x2, 0x368, 0x36b, 0x5, 0x70, 0x39, 0x2, 0x369, 0x36b, 
       0x5, 0x72, 0x3a, 0x2, 0x36a, 0x368, 0x3, 0x2, 0x2, 0x2, 0x36a, 0x369, 
       0x3, 0x2, 0x2, 0x2, 0x36b, 0x79, 0x3, 0x2, 0x2, 0x2, 0x36c, 0x371, 
       0x5, 0x6, 0x4, 0x2, 0x36d, 0x36e, 0x5, 0x6, 0x4, 0x2, 0x36e, 0x36f, 
       0x5, 0x7a, 0x3e, 0x2, 0x36f, 0x371, 0x3, 0x2, 0x2, 0x2, 0x370, 0x36c, 
       0x3, 0x2, 0x2, 0x2, 0x370, 0x36d, 0x3, 0x2, 0x2, 0x2, 0x371, 0x7b, 
       0x3, 0x2, 0x2, 0x2, 0x372, 0x378, 0x5, 0x7e, 0x40, 0x2, 0x373, 0x374, 
       0x5, 0x7e, 0x40, 0x2, 0x374, 0x375, 0x7, 0x1c, 0x2, 0x2, 0x375, 0x376, 
       0x5, 0x7c, 0x3f, 0x2, 0x376, 0x378, 0x3, 0x2, 0x2, 0x2, 0x377, 0x372, 
       0x3, 0x2, 0x2, 0x2, 0x377, 0x373, 0x3, 0x2, 0x2, 0x2, 0x378, 0x7d, 
       0x3, 0x2, 0x2, 0x2, 0x379, 0x37a, 0x7, 0x27, 0x2, 0x2, 0x37a, 0x37b, 
       0x7, 0x29, 0x2, 0x2, 0x37b, 0x7f, 0x3, 0x2, 0x2, 0x2, 0x37c, 0x380, 
       0x5, 0x82, 0x42, 0x2, 0x37d, 0x380, 0x5, 0x86, 0x44, 0x2, 0x37e, 
       0x380, 0x5, 0x8a, 0x46, 0x2, 0x37f, 0x37c, 0x3, 0x2, 0x2, 0x2, 0x37f, 
       0x37d, 0x3, 0x2, 0x2, 0x2, 0x37f, 0x37e, 0x3, 0x2, 0x2, 0x2, 0x380, 
       0x81, 0x3, 0x2, 0x2, 0x2, 0x381, 0x382, 0x5, 0x84, 0x43, 0x2, 0x382, 
       0x83, 0x3, 0x2, 0x2, 0x2, 0x383, 0x384, 0x7, 0x10, 0x2, 0x2, 0x384, 
       0x385, 0x7, 0x27, 0x2, 0x2, 0x385, 0x386, 0x7, 0x1f, 0x2, 0x2, 0x386, 
       0x39c, 0x7, 0x20, 0x2, 0x2, 0x387, 0x388, 0x7, 0x10, 0x2, 0x2, 0x388, 
       0x389, 0x7, 0x27, 0x2, 0x2, 0x389, 0x38a, 0x7, 0x1f, 0x2, 0x2, 0x38a, 
       0x38b, 0x5, 0x7a, 0x3e, 0x2, 0x38b, 0x38c, 0x7, 0x20, 0x2, 0x2, 0x38c, 
       0x39c, 0x3, 0x2, 0x2, 0x2, 0x38d, 0x38e, 0x7, 0x10, 0x2, 0x2, 0x38e, 
       0x38f, 0x7, 0x27, 0x2, 0x2, 0x38f, 0x390, 0x7, 0x12, 0x2, 0x2, 0x390, 
       0x391, 0x7, 0x27, 0x2, 0x2, 0x391, 0x392, 0x7, 0x1f, 0x2, 0x2, 0x392, 
       0x39c, 0x7, 0x20, 0x2, 0x2, 0x393, 0x394, 0x7, 0x10, 0x2, 0x2, 0x394, 
       0x395, 0x7, 0x27, 0x2, 0x2, 0x395, 0x396, 0x7, 0x12, 0x2, 0x2, 0x396, 
       0x397, 0x7, 0x27, 0x2, 0x2, 0x397, 0x398, 0x7, 0x1f, 0x2, 0x2, 0x398, 
       0x399, 0x5, 0x7a, 0x3e, 0x2, 0x399, 0x39a, 0x7, 0x20, 0x2, 0x2, 0x39a, 
       0x39c, 0x3, 0x2, 0x2, 0x2, 0x39b, 0x383, 0x3, 0x2, 0x2, 0x2, 0x39b, 
       0x387, 0x3, 0x2, 0x2, 0x2, 0x39b, 0x38d, 0x3, 0x2, 0x2, 0x2, 0x39b, 
       0x393, 0x3, 0x2, 0x2, 0x2, 0x39c, 0x85, 0x3, 0x2, 0x2, 0x2, 0x39d, 
       0x39e, 0x5, 0x88, 0x45, 0x2, 0x39e, 0x87, 0x3, 0x2, 0x2, 0x2, 0x39f, 
       0x3a0, 0x7, 0x11, 0x2, 0x2, 0x3a0, 0x3a1, 0x7, 0x27, 0x2, 0x2, 0x3a1, 
       0x3a2, 0x7, 0x1f, 0x2, 0x2, 0x3a2, 0x3b8, 0x7, 0x20, 0x2, 0x2, 0x3a3, 
       0x3a4, 0x7, 0x11, 0x2, 0x2, 0x3a4, 0x3a5, 0x7, 0x27, 0x2, 0x2, 0x3a5, 
       0x3a6, 0x7, 0x1f, 0x2, 0x2, 0x3a6, 0x3a7, 0x5, 0x7a, 0x3e, 0x2, 0x3a7, 
       0x3a8, 0x7, 0x20, 0x2, 0x2, 0x3a8, 0x3b8, 0x3, 0x2, 0x2, 0x2, 0x3a9, 
       0x3aa, 0x7, 0x11, 0x2, 0x2, 0x3aa, 0x3ab, 0x7, 0x27, 0x2, 0x2, 0x3ab, 
       0x3ac, 0x7, 0x12, 0x2, 0x2, 0x3ac, 0x3ad, 0x7, 0x27, 0x2, 0x2, 0x3ad, 
       0x3ae, 0x7, 0x1f, 0x2, 0x2, 0x3ae, 0x3b8, 0x7, 0x20, 0x2, 0x2, 0x3af, 
       0x3b0, 0x7, 0x11, 0x2, 0x2, 0x3b0, 0x3b1, 0x7, 0x27, 0x2, 0x2, 0x3b1, 
       0x3b2, 0x7, 0x12, 0x2, 0x2, 0x3b2, 0x3b3, 0x7, 0x27, 0x2, 0x2, 0x3b3, 
       0x3b4, 0x7, 0x1f, 0x2, 0x2, 0x3b4, 0x3b5, 0x5, 0x7a, 0x3e, 0x2, 0x3b5, 
       0x3b6, 0x7, 0x20, 0x2, 0x2, 0x3b6, 0x3b8, 0x3, 0x2, 0x2, 0x2, 0x3b7, 
       0x39f, 0x3, 0x2, 0x2, 0x2, 0x3b7, 0x3a3, 0x3, 0x2, 0x2, 0x2, 0x3b7, 
       0x3a9, 0x3, 0x2, 0x2, 0x2, 0x3b7, 0x3af, 0x3, 0x2, 0x2, 0x2, 0x3b8, 
       0x89, 0x3, 0x2, 0x2, 0x2, 0x3b9, 0x3ba, 0x5, 0x8c, 0x47, 0x2, 0x3ba, 
       0x3bb, 0x7, 0x1f, 0x2, 0x2, 0x3bb, 0x3bc, 0x7, 0x20, 0x2, 0x2, 0x3bc, 
       0x3c3, 0x3, 0x2, 0x2, 0x2, 0x3bd, 0x3be, 0x5, 0x8c, 0x47, 0x2, 0x3be, 
       0x3bf, 0x7, 0x1f, 0x2, 0x2, 0x3bf, 0x3c0, 0x5, 0x7a, 0x3e, 0x2, 0x3c0, 
       0x3c1, 0x7, 0x20, 0x2, 0x2, 0x3c1, 0x3c3, 0x3, 0x2, 0x2, 0x2, 0x3c2, 
       0x3b9, 0x3, 0x2, 0x2, 0x2, 0x3c2, 0x3bd, 0x3, 0x2, 0x2, 0x2, 0x3c3, 
       0x8b, 0x3, 0x2, 0x2, 0x2, 0x3c4, 0x3c8, 0x5, 0x8e, 0x48, 0x2, 0x3c5, 
       0x3c6, 0x7, 0xf, 0x2, 0x2, 0x3c6, 0x3c8, 0x5, 0x8e, 0x48, 0x2, 0x3c7, 
       0x3c4, 0x3, 0x2, 0x2, 0x2, 0x3c7, 0x3c5, 0x3, 0x2, 0x2, 0x2, 0x3c8, 
       0x8d, 0x3, 0x2, 0x2, 0x2, 0x3c9, 0x3ca, 0x7, 0x13, 0x2, 0x2, 0x3ca, 
       0x3da, 0x7, 0x27, 0x2, 0x2, 0x3cb, 0x3cc, 0x7, 0x13, 0x2, 0x2, 0x3cc, 
       0x3cd, 0x7, 0x27, 0x2, 0x2, 0x3cd, 0x3ce, 0x7, 0x12, 0x2, 0x2, 0x3ce, 
       0x3da, 0x7, 0x27, 0x2, 0x2, 0x3cf, 0x3d0, 0x7, 0x13, 0x2, 0x2, 0x3d0, 
       0x3d1, 0x7, 0x27, 0x2, 0x2, 0x3d1, 0x3d2, 0x7, 0x14, 0x2, 0x2, 0x3d2, 
       0x3da, 0x7, 0x27, 0x2, 0x2, 0x3d3, 0x3d4, 0x7, 0x13, 0x2, 0x2, 0x3d4, 
       0x3d5, 0x7, 0x27, 0x2, 0x2, 0x3d5, 0x3d6, 0x7, 0x12, 0x2, 0x2, 0x3d6, 
       0x3d7, 0x7, 0x27, 0x2, 0x2, 0x3d7, 0x3d8, 0x7, 0x14, 0x2, 0x2, 0x3d8, 
       0x3da, 0x7, 0x27, 0x2, 0x2, 0x3d9, 0x3c9, 0x3, 0x2, 0x2, 0x2, 0x3d9, 
       0x3cb, 0x3, 0x2, 0x2, 0x2, 0x3d9, 0x3cf, 0x3, 0x2, 0x2, 0x2, 0x3d9, 
       0x3d3, 0x3, 0x2, 0x2, 0x2, 0x3da, 0x8f, 0x3, 0x2, 0x2, 0x2, 0x3db, 
       0x3e0, 0x5, 0x92, 0x4a, 0x2, 0x3dc, 0x3dd, 0x5, 0x92, 0x4a, 0x2, 
       0x3dd, 0x3de, 0x5, 0x90, 0x49, 0x2, 0x3de, 0x3e0, 0x3, 0x2, 0x2, 
       0x2, 0x3df, 0x3db, 0x3, 0x2, 0x2, 0x2, 0x3df, 0x3dc, 0x3, 0x2, 0x2, 
       0x2, 0x3e0, 0x91, 0x3, 0x2, 0x2, 0x2, 0x3e1, 0x3eb, 0x7, 0x27, 0x2, 
       0x2, 0x3e2, 0x3e3, 0x7, 0x27, 0x2, 0x2, 0x3e3, 0x3eb, 0x7, 0x19, 
       0x2, 0x2, 0x3e4, 0x3e5, 0x7, 0x27, 0x2, 0x2, 0x3e5, 0x3eb, 0x5, 0x94, 
       0x4b, 0x2, 0x3e6, 0x3e7, 0x7, 0x27, 0x2, 0x2, 0x3e7, 0x3e8, 0x5, 
       0x94, 0x4b, 0x2, 0x3e8, 0x3e9, 0x7, 0x19, 0x2, 0x2, 0x3e9, 0x3eb, 
       0x3, 0x2, 0x2, 0x2, 0x3ea, 0x3e1, 0x3, 0x2, 0x2, 0x2, 0x3ea, 0x3e2, 
       0x3, 0x2, 0x2, 0x2, 0x3ea, 0x3e4, 0x3, 0x2, 0x2, 0x2, 0x3ea, 0x3e6, 
       0x3, 0x2, 0x2, 0x2, 0x3eb, 0x93, 0x3, 0x2, 0x2, 0x2, 0x3ec, 0x3ed, 
       0x7, 0x1d, 0x2, 0x2, 0x3ed, 0x3ee, 0x5, 0x96, 0x4c, 0x2, 0x3ee, 0x3ef, 
       0x7, 0x1e, 0x2, 0x2, 0x3ef, 0x3f6, 0x3, 0x2, 0x2, 0x2, 0x3f0, 0x3f1, 
       0x7, 0x1d, 0x2, 0x2, 0x3f1, 0x3f2, 0x5, 0x96, 0x4c, 0x2, 0x3f2, 0x3f3, 
       0x7, 0x1e, 0x2, 0x2, 0x3f3, 0x3f4, 0x5, 0x94, 0x4b, 0x2, 0x3f4, 0x3f6, 
       0x3, 0x2, 0x2, 0x2, 0x3f5, 0x3ec, 0x3, 0x2, 0x2, 0x2, 0x3f5, 0x3f0, 
       0x3, 0x2, 0x2, 0x2, 0x3f6, 0x95, 0x3, 0x2, 0x2, 0x2, 0x3f7, 0x3f8, 
       0x5, 0x24, 0x13, 0x2, 0x3f8, 0x97, 0x3, 0x2, 0x2, 0x2, 0x3f9, 0x411, 
       0x7, 0x27, 0x2, 0x2, 0x3fa, 0x3fb, 0x7, 0x27, 0x2, 0x2, 0x3fb, 0x411, 
       0x7, 0x29, 0x2, 0x2, 0x3fc, 0x411, 0x7, 0x2b, 0x2, 0x2, 0x3fd, 0x3fe, 
       0x7, 0x2b, 0x2, 0x2, 0x3fe, 0x411, 0x7, 0x29, 0x2, 0x2, 0x3ff, 0x411, 
       0x7, 0x2c, 0x2, 0x2, 0x400, 0x401, 0x7, 0x2c, 0x2, 0x2, 0x401, 0x411, 
       0x7, 0x29, 0x2, 0x2, 0x402, 0x411, 0x7, 0x2a, 0x2, 0x2, 0x403, 0x411, 
       0x5, 0x1a, 0xe, 0x2, 0x404, 0x411, 0x5, 0x1e, 0x10, 0x2, 0x405, 0x411, 
       0x5, 0x24, 0x13, 0x2, 0x406, 0x411, 0x5, 0x2e, 0x18, 0x2, 0x407, 
       0x408, 0x5, 0x9a, 0x4e, 0x2, 0x408, 0x409, 0x7, 0x19, 0x2, 0x2, 0x409, 
       0x40a, 0x5, 0x9c, 0x4f, 0x2, 0x40a, 0x411, 0x3, 0x2, 0x2, 0x2, 0x40b, 
       0x40c, 0x5, 0x9a, 0x4e, 0x2, 0x40c, 0x40d, 0x7, 0x1b, 0x2, 0x2, 0x40d, 
       0x40e, 0x5, 0x9c, 0x4f, 0x2, 0x40e, 0x411, 0x3, 0x2, 0x2, 0x2, 0x40f, 
       0x411, 0x5, 0x90, 0x49, 0x2, 0x410, 0x3f9, 0x3, 0x2, 0x2, 0x2, 0x410, 
       0x3fa, 0x3, 0x2, 0x2, 0x2, 0x410, 0x3fc, 0x3, 0x2, 0x2, 0x2, 0x410, 
       0x3fd, 0x3, 0x2, 0x2, 0x2, 0x410, 0x3ff, 0x3, 0x2, 0x2, 0x2, 0x410, 
       0x400, 0x3, 0x2, 0x2, 0x2, 0x410, 0x402, 0x3, 0x2, 0x2, 0x2, 0x410, 
       0x403, 0x3, 0x2, 0x2, 0x2, 0x410, 0x404, 0x3, 0x2, 0x2, 0x2, 0x410, 
       0x405, 0x3, 0x2, 0x2, 0x2, 0x410, 0x406, 0x3, 0x2, 0x2, 0x2, 0x410, 
       0x407, 0x3, 0x2, 0x2, 0x2, 0x410, 0x40b, 0x3, 0x2, 0x2, 0x2, 0x410, 
       0x40f, 0x3, 0x2, 0x2, 0x2, 0x411, 0x99, 0x3, 0x2, 0x2, 0x2, 0x412, 
       0x413, 0x7, 0x27, 0x2, 0x2, 0x413, 0x9b, 0x3, 0x2, 0x2, 0x2, 0x414, 
       0x415, 0x7, 0x27, 0x2, 0x2, 0x415, 0x9d, 0x3, 0x2, 0x2, 0x2, 0x38, 
       0xa6, 0xb2, 0xbf, 0xf4, 0xfb, 0x10c, 0x11a, 0x122, 0x129, 0x131, 
       0x13c, 0x146, 0x1a0, 0x1bc, 0x1c8, 0x1d4, 0x1da, 0x1e7, 0x1f1, 0x206, 
       0x20c, 0x214, 0x21b, 0x227, 0x233, 0x235, 0x2a4, 0x2ad, 0x2c2, 0x2d6, 
       0x2da, 0x2de, 0x2e2, 0x2ee, 0x2f4, 0x2fc, 0x305, 0x325, 0x33f, 0x35a, 
       0x366, 0x36a, 0x370, 0x377, 0x37f, 0x39b, 0x3b7, 0x3c2, 0x3c7, 0x3d9, 
       0x3df, 0x3ea, 0x3f5, 0x410, 
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
