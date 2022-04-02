
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
    setState(142);
    fileContent(0);
    setState(143);
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
    setState(150);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 0, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        _localctx = _tracker.createInstance<FileContentContext>(parentContext, parentState);
        pushNewRecursionContext(_localctx, startState, RuleFileContent);
        setState(146);

        if (!(precpred(_ctx, 2))) throw FailedPredicateException(this, "precpred(_ctx, 2)");
        setState(147);
        sentence(); 
      }
      setState(152);
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
    setState(162);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 1, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(153);
      liveToken();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(154);
      use();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(155);
      variable();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(156);
      callingFunction();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(157);
      conditionalExpression();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(158);
      loop();
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(159);
      functions();
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(160);
      ret();
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(161);
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
    setState(164);
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
    setState(166);
    match(TParser::Use);
    setState(167);
    useValue();
    setState(168);
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
    setState(175);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 2, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(170);
      useString();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(171);
      useString();
      setState(172);
      match(TParser::Separator);
      setState(173);
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
    setState(177);
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
    setState(179);
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
    setState(228);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 3, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(181);
      match(TParser::Var);
      setState(182);
      variableMembers();
      setState(183);
      match(TParser::End);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(185);
      methodPerm();
      setState(186);
      match(TParser::Var);
      setState(187);
      variableMembers();
      setState(188);
      match(TParser::End);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(190);
      match(TParser::Static);
      setState(191);
      match(TParser::Var);
      setState(192);
      variableMembers();
      setState(193);
      match(TParser::End);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(195);
      methodPerm();
      setState(196);
      match(TParser::Static);
      setState(197);
      match(TParser::Var);
      setState(198);
      variableMembers();
      setState(199);
      match(TParser::End);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(201);
      match(TParser::Final);
      setState(202);
      methodPerm();
      setState(203);
      match(TParser::Static);
      setState(204);
      match(TParser::Var);
      setState(205);
      variableMembers();
      setState(206);
      match(TParser::End);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(208);
      match(TParser::Final);
      setState(209);
      methodPerm();
      setState(210);
      match(TParser::Var);
      setState(211);
      variableMembers();
      setState(212);
      match(TParser::End);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(214);
      match(TParser::Final);
      setState(215);
      match(TParser::Var);
      setState(216);
      variableMembers();
      setState(217);
      match(TParser::End);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(219);
      match(TParser::Final);
      setState(220);
      match(TParser::Static);
      setState(221);
      match(TParser::Var);
      setState(222);
      variableMembers();
      setState(223);
      match(TParser::End);
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(225);
      variableMembers();
      setState(226);
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
    setState(235);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 4, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(230);
      variableDefinition();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(231);
      variableDefinition();
      setState(232);
      match(TParser::Separator);
      setState(233);
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
    setState(252);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 5, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(237);
      match(TParser::Identifier);
      setState(238);
      variableDefinitionGeneral();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(239);
      objIdentifierA();
      setState(240);
      match(TParser::Point);
      setState(241);
      objIdentifierB();
      setState(242);
      variableDefinitionGeneral();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(244);
      objIdentifierA();
      setState(245);
      match(TParser::TwoTwoPoint);
      setState(246);
      objIdentifierB();
      setState(247);
      variableDefinitionGeneral();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(249);
      arrayAccessElements();
      setState(250);
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
    setState(266);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 6, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(254);
      _la = _input->LA(1);
      if (!(_la == TParser::Attr

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(255);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(256);
      match(TParser::TypeSpec);
      setState(257);
      _la = _input->LA(1);
      if (!(_la == TParser::Attr

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(258);
      generalValue();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(259);
      _la = _input->LA(1);
      if (!(_la == TParser::Attr

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(260);
      match(TParser::New);
      setState(261);
      generalValue();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(262);
      match(TParser::TypeSpec);
      setState(263);
      _la = _input->LA(1);
      if (!(_la == TParser::Attr

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(264);
      match(TParser::New);
      setState(265);
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
    setState(274);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 7, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(268);
      match(TParser::OpenArIndex);
      setState(269);
      match(TParser::CloseArIndex);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(270);
      match(TParser::OpenArIndex);
      setState(271);
      indexArrayElements();
      setState(272);
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
    setState(281);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 8, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(276);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(277);
      generalValue();
      setState(278);
      match(TParser::Separator);
      setState(279);
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
    setState(289);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 9, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(283);
      match(TParser::OpenBlock);
      setState(284);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(285);
      match(TParser::OpenBlock);
      setState(286);
      associativeArrayElements();
      setState(287);
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
    setState(300);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 10, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(291);
      match(TParser::Identifier);
      setState(292);
      match(TParser::TwoPoint);
      setState(293);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(294);
      match(TParser::Identifier);
      setState(295);
      match(TParser::TwoPoint);
      setState(296);
      generalValue();
      setState(297);
      match(TParser::Separator);
      setState(298);
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
    setState(302);
    match(TParser::OpenOp);
    setState(303);
    operationElements();
    setState(304);
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
    setState(310);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 11, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(306);
      operationValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(307);
      operationValue();
      setState(308);
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
    setState(400);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 12, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(312);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(313);
      match(TParser::Identifier);
      setState(314);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(315);
      match(TParser::Identifier);
      setState(316);
      match(TParser::TypeSpec);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(317);
      match(TParser::Identifier);
      setState(318);
      match(TParser::TypeSpec);
      setState(319);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(320);
      firstIncDec();
      setState(321);
      match(TParser::Identifier);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(323);
      firstIncDec();
      setState(324);
      match(TParser::Identifier);
      setState(325);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(327);
      firstIncDec();
      setState(328);
      match(TParser::Identifier);
      setState(329);
      match(TParser::TypeSpec);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(331);
      firstIncDec();
      setState(332);
      match(TParser::Identifier);
      setState(333);
      match(TParser::TypeSpec);
      setState(334);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(336);
      match(TParser::Identifier);
      setState(337);
      lastIncDec();
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(338);
      match(TParser::Identifier);
      setState(339);
      lastIncDec();
      setState(340);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(342);
      match(TParser::Identifier);
      setState(343);
      lastIncDec();
      setState(344);
      match(TParser::TypeSpec);
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(346);
      match(TParser::Identifier);
      setState(347);
      lastIncDec();
      setState(348);
      match(TParser::TypeSpec);
      setState(349);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 13: {
      enterOuterAlt(_localctx, 13);
      setState(351);
      match(TParser::Integer);
      break;
    }

    case 14: {
      enterOuterAlt(_localctx, 14);
      setState(352);
      match(TParser::Integer);
      setState(353);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 15: {
      enterOuterAlt(_localctx, 15);
      setState(354);
      match(TParser::Integer);
      setState(355);
      match(TParser::TypeSpec);
      break;
    }

    case 16: {
      enterOuterAlt(_localctx, 16);
      setState(356);
      match(TParser::Integer);
      setState(357);
      match(TParser::TypeSpec);
      setState(358);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 17: {
      enterOuterAlt(_localctx, 17);
      setState(359);
      match(TParser::Float);
      break;
    }

    case 18: {
      enterOuterAlt(_localctx, 18);
      setState(360);
      match(TParser::Float);
      setState(361);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 19: {
      enterOuterAlt(_localctx, 19);
      setState(362);
      match(TParser::Float);
      setState(363);
      match(TParser::TypeSpec);
      break;
    }

    case 20: {
      enterOuterAlt(_localctx, 20);
      setState(364);
      match(TParser::Float);
      setState(365);
      match(TParser::TypeSpec);
      setState(366);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 21: {
      enterOuterAlt(_localctx, 21);
      setState(367);
      functionCall();
      break;
    }

    case 22: {
      enterOuterAlt(_localctx, 22);
      setState(368);
      functionCall();
      setState(369);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 23: {
      enterOuterAlt(_localctx, 23);
      setState(371);
      functionCall();
      setState(372);
      match(TParser::TypeSpec);
      break;
    }

    case 24: {
      enterOuterAlt(_localctx, 24);
      setState(374);
      functionCall();
      setState(375);
      match(TParser::TypeSpec);
      setState(376);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 25: {
      enterOuterAlt(_localctx, 25);
      setState(378);
      operationBlock();
      break;
    }

    case 26: {
      enterOuterAlt(_localctx, 26);
      setState(379);
      operationBlock();
      setState(380);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 27: {
      enterOuterAlt(_localctx, 27);
      setState(382);
      operationBlock();
      setState(383);
      match(TParser::TypeSpec);
      break;
    }

    case 28: {
      enterOuterAlt(_localctx, 28);
      setState(385);
      operationBlock();
      setState(386);
      match(TParser::TypeSpec);
      setState(387);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 29: {
      enterOuterAlt(_localctx, 29);
      setState(389);
      arrayAccessElements();
      break;
    }

    case 30: {
      enterOuterAlt(_localctx, 30);
      setState(390);
      arrayAccessElements();
      setState(391);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 31: {
      enterOuterAlt(_localctx, 31);
      setState(393);
      arrayAccessElements();
      setState(394);
      match(TParser::TypeSpec);
      break;
    }

    case 32: {
      enterOuterAlt(_localctx, 32);
      setState(396);
      arrayAccessElements();
      setState(397);
      match(TParser::TypeSpec);
      setState(398);
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
    setState(402);
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
    setState(404);
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
    setState(406);
    functionCall();
    setState(407);
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
    setState(428);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 13, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(409);
      match(TParser::Identifier);
      setState(410);
      functionCallParam();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(411);
      match(TParser::Identifier);
      setState(412);
      match(TParser::Point);
      setState(413);
      identifierB();
      setState(414);
      functionCallParam();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(416);
      match(TParser::Identifier);
      setState(417);
      match(TParser::TwoTwoPoint);
      setState(418);
      identifierB();
      setState(419);
      functionCallParam();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(421);
      match(TParser::Identifier);
      setState(422);
      match(TParser::Point);
      setState(423);
      identifierB();
      setState(424);
      functionCallParam();
      setState(425);
      pointSeparator();
      setState(426);
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
    setState(430);
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
    setState(432);
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
    setState(440);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 14, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(434);
      match(TParser::OpenOp);
      setState(435);
      match(TParser::CloseOp);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(436);
      match(TParser::OpenOp);
      setState(437);
      functionCallParamElements();
      setState(438);
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
    setState(452);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 15, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(442);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(443);
      generalValue();
      setState(444);
      match(TParser::Separator);
      setState(445);
      functionCallParamElements();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(447);
      operationElements();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(448);
      operationElements();
      setState(449);
      match(TParser::Separator);
      setState(450);
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
  enterRule(_localctx, 54, TParser::RuleConditionalExpression);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(457);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::If: {
        enterOuterAlt(_localctx, 1);
        setState(454);
        ifConditions();
        break;
      }

      case TParser::Elif: {
        enterOuterAlt(_localctx, 2);
        setState(455);
        elifConditions();
        break;
      }

      case TParser::Else: {
        enterOuterAlt(_localctx, 3);
        setState(456);
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

//----------------- ConditionalBlockElementsContext ------------------------------------------------------------------

TParser::ConditionalBlockElementsContext::ConditionalBlockElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ConditionalExpressionContext* TParser::ConditionalBlockElementsContext::conditionalExpression() {
  return getRuleContext<TParser::ConditionalExpressionContext>(0);
}

TParser::ConditionalBlockElementsContext* TParser::ConditionalBlockElementsContext::conditionalBlockElements() {
  return getRuleContext<TParser::ConditionalBlockElementsContext>(0);
}

TParser::SentenceContext* TParser::ConditionalBlockElementsContext::sentence() {
  return getRuleContext<TParser::SentenceContext>(0);
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
  enterRule(_localctx, 56, TParser::RuleConditionalBlockElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(467);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 17, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(459);
      conditionalExpression();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(460);
      conditionalExpression();
      setState(461);
      conditionalBlockElements();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(463);
      sentence();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(464);
      sentence();
      setState(465);
      conditionalBlockElements();
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

TParser::ConditionalBlockElementsContext* TParser::IfConditionsContext::conditionalBlockElements() {
  return getRuleContext<TParser::ConditionalBlockElementsContext>(0);
}

TParser::CondBlockElementsLimitedContext* TParser::IfConditionsContext::condBlockElementsLimited() {
  return getRuleContext<TParser::CondBlockElementsLimitedContext>(0);
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
  enterRule(_localctx, 58, TParser::RuleIfConditions);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(488);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 18, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(469);
      match(TParser::If);
      setState(470);
      conditionalExpressionElements();
      setState(471);
      callingFunction();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(473);
      match(TParser::If);
      setState(474);
      conditionalExpressionElements();
      setState(475);
      match(TParser::OpenBlock);
      setState(476);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(478);
      match(TParser::If);
      setState(479);
      conditionalExpressionElements();
      setState(480);
      match(TParser::OpenBlock);
      setState(481);
      conditionalBlockElements();
      setState(482);
      match(TParser::CloseBlock);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(484);
      match(TParser::If);
      setState(485);
      conditionalExpressionElements();
      setState(486);
      condBlockElementsLimited();
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

TParser::ConditionalBlockElementsContext* TParser::ElifConditionsContext::conditionalBlockElements() {
  return getRuleContext<TParser::ConditionalBlockElementsContext>(0);
}

TParser::CondBlockElementsLimitedContext* TParser::ElifConditionsContext::condBlockElementsLimited() {
  return getRuleContext<TParser::CondBlockElementsLimitedContext>(0);
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
  enterRule(_localctx, 60, TParser::RuleElifConditions);

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
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 19, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(490);
      match(TParser::Elif);
      setState(491);
      conditionalExpressionElements();
      setState(492);
      callingFunction();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(494);
      match(TParser::Elif);
      setState(495);
      conditionalExpressionElements();
      setState(496);
      match(TParser::OpenBlock);
      setState(497);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(499);
      match(TParser::Elif);
      setState(500);
      conditionalExpressionElements();
      setState(501);
      match(TParser::OpenBlock);
      setState(502);
      conditionalBlockElements();
      setState(503);
      match(TParser::CloseBlock);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(505);
      match(TParser::Elif);
      setState(506);
      conditionalExpressionElements();
      setState(507);
      condBlockElementsLimited();
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

TParser::ConditionalBlockElementsContext* TParser::ElseConditionsContext::conditionalBlockElements() {
  return getRuleContext<TParser::ConditionalBlockElementsContext>(0);
}

TParser::CondBlockElementsLimitedContext* TParser::ElseConditionsContext::condBlockElementsLimited() {
  return getRuleContext<TParser::CondBlockElementsLimitedContext>(0);
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
  enterRule(_localctx, 62, TParser::RuleElseConditions);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(523);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 20, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(511);
      match(TParser::Else);
      setState(512);
      callingFunction();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(513);
      match(TParser::Else);
      setState(514);
      match(TParser::OpenBlock);
      setState(515);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(516);
      match(TParser::Else);
      setState(517);
      match(TParser::OpenBlock);
      setState(518);
      conditionalBlockElements();
      setState(519);
      match(TParser::CloseBlock);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(521);
      match(TParser::Else);
      setState(522);
      condBlockElementsLimited();
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

//----------------- CondBlockElementsLimitedContext ------------------------------------------------------------------

TParser::CondBlockElementsLimitedContext::CondBlockElementsLimitedContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::IfConditionsContext* TParser::CondBlockElementsLimitedContext::ifConditions() {
  return getRuleContext<TParser::IfConditionsContext>(0);
}

TParser::ConditionalBlockElementsContext* TParser::CondBlockElementsLimitedContext::conditionalBlockElements() {
  return getRuleContext<TParser::ConditionalBlockElementsContext>(0);
}

TParser::LoopContext* TParser::CondBlockElementsLimitedContext::loop() {
  return getRuleContext<TParser::LoopContext>(0);
}

TParser::CondBlockElementsLimitedContext* TParser::CondBlockElementsLimitedContext::condBlockElementsLimited() {
  return getRuleContext<TParser::CondBlockElementsLimitedContext>(0);
}

TParser::RetContext* TParser::CondBlockElementsLimitedContext::ret() {
  return getRuleContext<TParser::RetContext>(0);
}


size_t TParser::CondBlockElementsLimitedContext::getRuleIndex() const {
  return TParser::RuleCondBlockElementsLimited;
}

void TParser::CondBlockElementsLimitedContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterCondBlockElementsLimited(this);
}

void TParser::CondBlockElementsLimitedContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitCondBlockElementsLimited(this);
}


antlrcpp::Any TParser::CondBlockElementsLimitedContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitCondBlockElementsLimited(this);
  else
    return visitor->visitChildren(this);
}

TParser::CondBlockElementsLimitedContext* TParser::condBlockElementsLimited() {
  CondBlockElementsLimitedContext *_localctx = _tracker.createInstance<CondBlockElementsLimitedContext>(_ctx, getState());
  enterRule(_localctx, 64, TParser::RuleCondBlockElementsLimited);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(534);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 21, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(525);
      ifConditions();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(526);
      ifConditions();
      setState(527);
      conditionalBlockElements();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(529);
      loop();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(530);
      loop();
      setState(531);
      condBlockElementsLimited();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(533);
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
  enterRule(_localctx, 66, TParser::RuleConditionalExpressionElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(546);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 22, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(536);
      conditionalExpElementsValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(537);
      conditionalExpElementsValue();
      setState(538);
      conditionalExpressionElements();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(540);
      conditionExpBlock(0);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(541);
      conditionExpBlock(0);
      setState(542);
      conditionalExpressionElements();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(544);
      match(TParser::Not);
      setState(545);
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
  enterRule(_localctx, 68, TParser::RuleConditionalExpElementsValue);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(552);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 23, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(548);
      conditionalExpValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(549);
      conditionalExpValue();
      setState(550);
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
  size_t startState = 70;
  enterRecursionRule(_localctx, 70, TParser::RuleConditionExpBlock, precedence);

    

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
    setState(555);
    match(TParser::OpenOp);
    setState(556);
    conditionalExpressionElements();
    setState(557);
    match(TParser::CloseOp);
    _ctx->stop = _input->LT(-1);
    setState(563);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 24, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        _localctx = _tracker.createInstance<ConditionExpBlockContext>(parentContext, parentState);
        pushNewRecursionContext(_localctx, startState, RuleConditionExpBlock);
        setState(559);

        if (!(precpred(_ctx, 1))) throw FailedPredicateException(this, "precpred(_ctx, 1)");
        setState(560);
        match(TParser::AssignmentOperator); 
      }
      setState(565);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 24, _ctx);
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
  enterRule(_localctx, 72, TParser::RuleConditionalExpValue);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(673);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 25, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(566);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(567);
      match(TParser::Identifier);
      setState(568);
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
      setState(569);
      match(TParser::Identifier);
      setState(570);
      match(TParser::TypeSpec);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(571);
      match(TParser::Identifier);
      setState(572);
      match(TParser::TypeSpec);
      setState(573);
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
      setState(574);
      firstIncDec();
      setState(575);
      match(TParser::Identifier);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(577);
      firstIncDec();
      setState(578);
      match(TParser::Identifier);
      setState(579);
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
      setState(581);
      firstIncDec();
      setState(582);
      match(TParser::Identifier);
      setState(583);
      match(TParser::TypeSpec);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(585);
      firstIncDec();
      setState(586);
      match(TParser::Identifier);
      setState(587);
      match(TParser::TypeSpec);
      setState(588);
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
      setState(590);
      match(TParser::Identifier);
      setState(591);
      lastIncDec();
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(592);
      match(TParser::Identifier);
      setState(593);
      lastIncDec();
      setState(594);
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
      setState(596);
      match(TParser::Identifier);
      setState(597);
      lastIncDec();
      setState(598);
      match(TParser::TypeSpec);
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(600);
      match(TParser::Identifier);
      setState(601);
      lastIncDec();
      setState(602);
      match(TParser::TypeSpec);
      setState(603);
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
      match(TParser::Integer);
      break;
    }

    case 14: {
      enterOuterAlt(_localctx, 14);
      setState(606);
      match(TParser::Integer);
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
      match(TParser::Integer);
      setState(609);
      match(TParser::TypeSpec);
      break;
    }

    case 16: {
      enterOuterAlt(_localctx, 16);
      setState(610);
      match(TParser::Integer);
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
      match(TParser::Float);
      break;
    }

    case 18: {
      enterOuterAlt(_localctx, 18);
      setState(614);
      match(TParser::Float);
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
      setState(616);
      match(TParser::Float);
      setState(617);
      match(TParser::TypeSpec);
      break;
    }

    case 20: {
      enterOuterAlt(_localctx, 20);
      setState(618);
      match(TParser::Float);
      setState(619);
      match(TParser::TypeSpec);
      setState(620);
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
      setState(621);
      functionCall();
      break;
    }

    case 22: {
      enterOuterAlt(_localctx, 22);
      setState(622);
      functionCall();
      setState(623);
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
      setState(625);
      functionCall();
      setState(626);
      match(TParser::TypeSpec);
      break;
    }

    case 24: {
      enterOuterAlt(_localctx, 24);
      setState(628);
      functionCall();
      setState(629);
      match(TParser::TypeSpec);
      setState(630);
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
      setState(632);
      match(TParser::Identifier);
      setState(633);
      match(TParser::Attr);
      setState(634);
      functionCall();
      break;
    }

    case 26: {
      enterOuterAlt(_localctx, 26);
      setState(635);
      match(TParser::Identifier);
      setState(636);
      match(TParser::Attr);
      setState(637);
      functionCall();
      setState(638);
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
      setState(640);
      match(TParser::Identifier);
      setState(641);
      match(TParser::Attr);
      setState(642);
      functionCall();
      setState(643);
      match(TParser::TypeSpec);
      break;
    }

    case 28: {
      enterOuterAlt(_localctx, 28);
      setState(645);
      match(TParser::Identifier);
      setState(646);
      match(TParser::Attr);
      setState(647);
      functionCall();
      setState(648);
      match(TParser::TypeSpec);
      setState(649);
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
      setState(651);
      operationBlock();
      break;
    }

    case 30: {
      enterOuterAlt(_localctx, 30);
      setState(652);
      operationBlock();
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

    case 31: {
      enterOuterAlt(_localctx, 31);
      setState(655);
      operationBlock();
      setState(656);
      match(TParser::TypeSpec);
      break;
    }

    case 32: {
      enterOuterAlt(_localctx, 32);
      setState(658);
      operationBlock();
      setState(659);
      match(TParser::TypeSpec);
      setState(660);
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
      setState(662);
      arrayAccessElements();
      break;
    }

    case 34: {
      enterOuterAlt(_localctx, 34);
      setState(663);
      arrayAccessElements();
      setState(664);
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
      setState(666);
      arrayAccessElements();
      setState(667);
      match(TParser::TypeSpec);
      break;
    }

    case 36: {
      enterOuterAlt(_localctx, 36);
      setState(669);
      arrayAccessElements();
      setState(670);
      match(TParser::TypeSpec);
      setState(671);
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
  enterRule(_localctx, 74, TParser::RuleLoop);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(694);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 26, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(675);
      match(TParser::For);
      setState(676);
      loopExpression();
      setState(677);
      match(TParser::OpenBlock);
      setState(678);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(680);
      match(TParser::For);
      setState(681);
      loopExpression();
      setState(682);
      match(TParser::OpenBlock);
      setState(683);
      loopBlockElements();
      setState(684);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(686);
      match(TParser::For);
      setState(687);
      loopExpression();
      setState(688);
      callingFunction();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(690);
      match(TParser::For);
      setState(691);
      loopExpression();
      setState(692);
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
  enterRule(_localctx, 76, TParser::RuleLoopExpression);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(714);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 27, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(696);
      match(TParser::OpenOp);
      setState(697);
      loopOneMembers();
      setState(698);
      match(TParser::End);
      setState(699);
      loopTwoMembers();
      setState(700);
      match(TParser::End);
      setState(701);
      loopThreeMembers();
      setState(702);
      match(TParser::CloseOp);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(704);
      loopOneMembers();
      setState(705);
      match(TParser::End);
      setState(706);
      loopTwoMembers();
      setState(707);
      match(TParser::End);
      setState(708);
      loopThreeMembers();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(710);
      conditionalExpressionElements();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(711);
      match(TParser::OpenOp);
      setState(712);
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
  enterRule(_localctx, 78, TParser::RuleLoopOneMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(718);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Identifier: {
        enterOuterAlt(_localctx, 1);
        setState(716);
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
  enterRule(_localctx, 80, TParser::RuleLoopTwoMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(722);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::OpenOp:
      case TParser::Not:
      case TParser::IncDecOperators:
      case TParser::Identifier:
      case TParser::Integer:
      case TParser::Float: {
        enterOuterAlt(_localctx, 1);
        setState(720);
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
  enterRule(_localctx, 82, TParser::RuleLoopThreeMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(726);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 30, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(724);
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
  enterRule(_localctx, 84, TParser::RuleLoopThreeMembersValues);

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
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 31, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(728);
      operationElements();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(729);
      operationBlock();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(730);
      operationElements();
      setState(731);
      match(TParser::Separator);
      setState(732);
      loopThreeMembersValues();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(734);
      operationBlock();
      setState(735);
      match(TParser::Separator);
      setState(736);
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
  enterRule(_localctx, 86, TParser::RuleLoopBlockElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(744);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 32, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(740);
      sentence();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(741);
      sentence();
      setState(742);
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

TParser::IfConditionsContext* TParser::LoopBlockElementsLimitedContext::ifConditions() {
  return getRuleContext<TParser::IfConditionsContext>(0);
}

TParser::LoopBlockElementsLimitedContext* TParser::LoopBlockElementsLimitedContext::loopBlockElementsLimited() {
  return getRuleContext<TParser::LoopBlockElementsLimitedContext>(0);
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
  enterRule(_localctx, 88, TParser::RuleLoopBlockElementsLimited);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(755);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 33, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(746);
      ifConditions();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(747);
      ifConditions();
      setState(748);
      loopBlockElementsLimited();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(750);
      loop();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(751);
      loop();
      setState(752);
      loopBlockElementsLimited();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(754);
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
  enterRule(_localctx, 90, TParser::RuleRet);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(757);
    match(TParser::Ret);
    setState(758);
    retValues();
    setState(759);
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
  enterRule(_localctx, 92, TParser::RuleRetValues);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(764);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 34, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(761);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(762);
      operationElements();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(763);
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
  enterRule(_localctx, 94, TParser::RuleFunctions);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(796);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 35, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(766);
      functionsModes();
      setState(767);
      match(TParser::OpenBlock);
      setState(768);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(770);
      functionsModes();
      setState(771);
      match(TParser::OpenBlock);
      setState(772);
      functionCodeBlock();
      setState(773);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(775);
      functionMethodsModes();
      setState(776);
      match(TParser::OpenBlock);
      setState(777);
      match(TParser::CloseBlock);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(779);
      functionMethodsModes();
      setState(780);
      match(TParser::OpenBlock);
      setState(781);
      functionCodeBlock();
      setState(782);
      match(TParser::CloseBlock);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(784);
      constructClassMethod();
      setState(785);
      match(TParser::OpenBlock);
      setState(786);
      match(TParser::CloseBlock);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(788);
      constructClassMethod();
      setState(789);
      match(TParser::OpenBlock);
      setState(790);
      functionCodeBlock();
      setState(791);
      match(TParser::CloseBlock);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(793);
      interfaceMethod();
      setState(794);
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
  enterRule(_localctx, 96, TParser::RuleFunctionGeneralModes);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(822);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 36, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(798);
      match(TParser::Function);
      setState(799);
      match(TParser::Identifier);
      setState(800);
      match(TParser::OpenOp);
      setState(801);
      match(TParser::CloseOp);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(802);
      match(TParser::Function);
      setState(803);
      match(TParser::Identifier);
      setState(804);
      match(TParser::OpenOp);
      setState(805);
      match(TParser::CloseOp);
      setState(806);
      match(TParser::ArrowRight);
      setState(807);
      match(TParser::Identifier);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(808);
      match(TParser::Function);
      setState(809);
      match(TParser::Identifier);
      setState(810);
      match(TParser::OpenOp);
      setState(811);
      functionParams();
      setState(812);
      match(TParser::CloseOp);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(814);
      match(TParser::Function);
      setState(815);
      match(TParser::Identifier);
      setState(816);
      match(TParser::OpenOp);
      setState(817);
      functionParams();
      setState(818);
      match(TParser::CloseOp);
      setState(819);
      match(TParser::ArrowRight);
      setState(820);
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
  enterRule(_localctx, 98, TParser::RuleFunctionsModes);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(824);
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
  enterRule(_localctx, 100, TParser::RuleFunctionMethodsModes);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(849);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 37, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(826);
      methodPerm();
      setState(827);
      functionGeneralModes();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(829);
      match(TParser::Static);
      setState(830);
      functionGeneralModes();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(831);
      methodPerm();
      setState(832);
      match(TParser::Static);
      setState(833);
      functionGeneralModes();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(835);
      match(TParser::Final);
      setState(836);
      methodPerm();
      setState(837);
      match(TParser::Static);
      setState(838);
      functionGeneralModes();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(840);
      match(TParser::Final);
      setState(841);
      methodPerm();
      setState(842);
      functionGeneralModes();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(844);
      match(TParser::Final);
      setState(845);
      functionGeneralModes();
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(846);
      match(TParser::Final);
      setState(847);
      match(TParser::Static);
      setState(848);
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
  enterRule(_localctx, 102, TParser::RuleMethodPerm);
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
    setState(851);
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
  enterRule(_localctx, 104, TParser::RuleConstructClassMethod);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(861);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 38, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(853);
      match(TParser::Identifier);
      setState(854);
      match(TParser::OpenOp);
      setState(855);
      match(TParser::CloseOp);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(856);
      match(TParser::Identifier);
      setState(857);
      match(TParser::OpenOp);
      setState(858);
      functionParams();
      setState(859);
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
  enterRule(_localctx, 106, TParser::RuleInterfaceMethod);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(865);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Function: {
        enterOuterAlt(_localctx, 1);
        setState(863);
        functionsModes();
        break;
      }

      case TParser::Pub:
      case TParser::Pro:
      case TParser::Priv:
      case TParser::Static:
      case TParser::Final: {
        enterOuterAlt(_localctx, 2);
        setState(864);
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
  enterRule(_localctx, 108, TParser::RuleFunctionCodeBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(871);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 40, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(867);
      sentence();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(868);
      sentence();
      setState(869);
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
  enterRule(_localctx, 110, TParser::RuleFunctionParams);

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
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 41, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(873);
      functionParamElements();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(874);
      functionParamElements();
      setState(875);
      match(TParser::Separator);
      setState(876);
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
  enterRule(_localctx, 112, TParser::RuleFunctionParamElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(880);
    match(TParser::Identifier);
    setState(881);
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
  enterRule(_localctx, 114, TParser::RuleOopGeneral);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(886);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Interface: {
        enterOuterAlt(_localctx, 1);
        setState(883);
        interfaceClass();
        break;
      }

      case TParser::Abstract: {
        enterOuterAlt(_localctx, 2);
        setState(884);
        abstractClass();
        break;
      }

      case TParser::Final:
      case TParser::Class: {
        enterOuterAlt(_localctx, 3);
        setState(885);
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
  enterRule(_localctx, 116, TParser::RuleInterfaceClass);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(888);
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
  enterRule(_localctx, 118, TParser::RuleInterfaceClassDefinition);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(914);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 43, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(890);
      match(TParser::Interface);
      setState(891);
      match(TParser::Identifier);
      setState(892);
      match(TParser::OpenBlock);
      setState(893);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(894);
      match(TParser::Interface);
      setState(895);
      match(TParser::Identifier);
      setState(896);
      match(TParser::OpenBlock);
      setState(897);
      functionCodeBlock();
      setState(898);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(900);
      match(TParser::Interface);
      setState(901);
      match(TParser::Identifier);
      setState(902);
      match(TParser::Extends);
      setState(903);
      match(TParser::Identifier);
      setState(904);
      match(TParser::OpenBlock);
      setState(905);
      match(TParser::CloseBlock);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(906);
      match(TParser::Interface);
      setState(907);
      match(TParser::Identifier);
      setState(908);
      match(TParser::Extends);
      setState(909);
      match(TParser::Identifier);
      setState(910);
      match(TParser::OpenBlock);
      setState(911);
      functionCodeBlock();
      setState(912);
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
  enterRule(_localctx, 120, TParser::RuleAbstractClass);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(916);
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
  enterRule(_localctx, 122, TParser::RuleAbstractClassDefinition);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(942);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 44, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(918);
      match(TParser::Abstract);
      setState(919);
      match(TParser::Identifier);
      setState(920);
      match(TParser::OpenBlock);
      setState(921);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(922);
      match(TParser::Abstract);
      setState(923);
      match(TParser::Identifier);
      setState(924);
      match(TParser::OpenBlock);
      setState(925);
      functionCodeBlock();
      setState(926);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(928);
      match(TParser::Abstract);
      setState(929);
      match(TParser::Identifier);
      setState(930);
      match(TParser::Extends);
      setState(931);
      match(TParser::Identifier);
      setState(932);
      match(TParser::OpenBlock);
      setState(933);
      match(TParser::CloseBlock);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(934);
      match(TParser::Abstract);
      setState(935);
      match(TParser::Identifier);
      setState(936);
      match(TParser::Extends);
      setState(937);
      match(TParser::Identifier);
      setState(938);
      match(TParser::OpenBlock);
      setState(939);
      functionCodeBlock();
      setState(940);
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
  enterRule(_localctx, 124, TParser::RuleClassDefination);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(953);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 45, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(944);
      classModesGeneral();
      setState(945);
      match(TParser::OpenBlock);
      setState(946);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(948);
      classModesGeneral();
      setState(949);
      match(TParser::OpenBlock);
      setState(950);
      functionCodeBlock();
      setState(951);
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
  enterRule(_localctx, 126, TParser::RuleClassModesGeneral);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(958);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Class: {
        enterOuterAlt(_localctx, 1);
        setState(955);
        classModes();
        break;
      }

      case TParser::Final: {
        enterOuterAlt(_localctx, 2);
        setState(956);
        match(TParser::Final);
        setState(957);
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
  enterRule(_localctx, 128, TParser::RuleClassModes);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(976);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 47, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(960);
      match(TParser::Class);
      setState(961);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(962);
      match(TParser::Class);
      setState(963);
      match(TParser::Identifier);
      setState(964);
      match(TParser::Extends);
      setState(965);
      match(TParser::Identifier);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(966);
      match(TParser::Class);
      setState(967);
      match(TParser::Identifier);
      setState(968);
      match(TParser::Implements);
      setState(969);
      match(TParser::Identifier);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(970);
      match(TParser::Class);
      setState(971);
      match(TParser::Identifier);
      setState(972);
      match(TParser::Extends);
      setState(973);
      match(TParser::Identifier);
      setState(974);
      match(TParser::Implements);
      setState(975);
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

tree::TerminalNode* TParser::ArrayAccessElementsContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::ArrayAccessElementsContext::Point() {
  return getToken(TParser::Point, 0);
}

TParser::ArrayAccessElementsContext* TParser::ArrayAccessElementsContext::arrayAccessElements() {
  return getRuleContext<TParser::ArrayAccessElementsContext>(0);
}

TParser::AccessBlockArContext* TParser::ArrayAccessElementsContext::accessBlockAr() {
  return getRuleContext<TParser::AccessBlockArContext>(0);
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
  enterRule(_localctx, 130, TParser::RuleArrayAccessElements);

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
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 48, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(978);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(979);
      match(TParser::Identifier);
      setState(980);
      match(TParser::Point);
      setState(981);
      arrayAccessElements();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(982);
      match(TParser::Identifier);
      setState(983);
      accessBlockAr();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(984);
      match(TParser::Identifier);
      setState(985);
      accessBlockAr();
      setState(986);
      match(TParser::Point);
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
  enterRule(_localctx, 132, TParser::RuleAccessBlockAr);

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
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 49, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(991);
      match(TParser::OpenArIndex);
      setState(992);
      arrayIndexAccess();
      setState(993);
      match(TParser::CloseArIndex);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(995);
      match(TParser::OpenArIndex);
      setState(996);
      arrayIndexAccess();
      setState(997);
      match(TParser::CloseArIndex);
      setState(998);
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

tree::TerminalNode* TParser::ArrayIndexAccessContext::Integer() {
  return getToken(TParser::Integer, 0);
}

tree::TerminalNode* TParser::ArrayIndexAccessContext::Identifier() {
  return getToken(TParser::Identifier, 0);
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
  enterRule(_localctx, 134, TParser::RuleArrayIndexAccess);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(1004);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 50, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(1002);
      _la = _input->LA(1);
      if (!(_la == TParser::Identifier

      || _la == TParser::Integer)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(1003);
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
  enterRule(_localctx, 136, TParser::RuleGeneralValue);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(1029);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 51, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(1006);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(1007);
      match(TParser::Identifier);
      setState(1008);
      match(TParser::TypeSpec);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(1009);
      match(TParser::Integer);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(1010);
      match(TParser::Integer);
      setState(1011);
      match(TParser::TypeSpec);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(1012);
      match(TParser::Float);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(1013);
      match(TParser::Float);
      setState(1014);
      match(TParser::TypeSpec);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(1015);
      match(TParser::String);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(1016);
      indexArray();
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(1017);
      associativeArray();
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(1018);
      operationElements();
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(1019);
      functionCall();
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(1020);
      objIdentifierA();
      setState(1021);
      match(TParser::Point);
      setState(1022);
      objIdentifierB();
      break;
    }

    case 13: {
      enterOuterAlt(_localctx, 13);
      setState(1024);
      objIdentifierA();
      setState(1025);
      match(TParser::TwoTwoPoint);
      setState(1026);
      objIdentifierB();
      break;
    }

    case 14: {
      enterOuterAlt(_localctx, 14);
      setState(1028);
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
  enterRule(_localctx, 138, TParser::RuleObjIdentifierA);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1031);
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
  enterRule(_localctx, 140, TParser::RuleObjIdentifierB);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1033);
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
    case 35: return conditionExpBlockSempred(dynamic_cast<ConditionExpBlockContext *>(context), predicateIndex);

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
  "variable", "variableModes", "variableMembers", "variableDefinition", 
  "variableDefinitionGeneral", "indexArray", "indexArrayElements", "associativeArray", 
  "associativeArrayElements", "operationBlock", "operationElements", "operationValue", 
  "firstIncDec", "lastIncDec", "callingFunction", "functionCall", "identifierB", 
  "pointSeparator", "functionCallParam", "functionCallParamElements", "conditionalExpression", 
  "conditionalBlockElements", "ifConditions", "elifConditions", "elseConditions", 
  "condBlockElementsLimited", "conditionalExpressionElements", "conditionalExpElementsValue", 
  "conditionExpBlock", "conditionalExpValue", "loop", "loopExpression", 
  "loopOneMembers", "loopTwoMembers", "loopThreeMembers", "loopThreeMembersValues", 
  "loopBlockElements", "loopBlockElementsLimited", "ret", "retValues", "functions", 
  "functionGeneralModes", "functionsModes", "functionMethodsModes", "methodPerm", 
  "constructClassMethod", "interfaceMethod", "functionCodeBlock", "functionParams", 
  "functionParamElements", "oopGeneral", "interfaceClass", "interfaceClassDefinition", 
  "abstractClass", "abstractClassDefinition", "classDefination", "classModesGeneral", 
  "classModes", "arrayAccessElements", "accessBlockAr", "arrayIndexAccess", 
  "generalValue", "objIdentifierA", "objIdentifierB"
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
       0x3, 0x31, 0x40e, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 
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
       0x9, 0x47, 0x4, 0x48, 0x9, 0x48, 0x3, 0x2, 0x3, 0x2, 0x3, 0x2, 0x3, 
       0x3, 0x3, 0x3, 0x3, 0x3, 0x7, 0x3, 0x97, 0xa, 0x3, 0xc, 0x3, 0xe, 
       0x3, 0x9a, 0xb, 0x3, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 
       0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x5, 0x4, 0xa5, 0xa, 
       0x4, 0x3, 0x5, 0x3, 0x5, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 
       0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x5, 0x7, 0xb2, 
       0xa, 0x7, 0x3, 0x8, 0x3, 0x8, 0x3, 0x9, 0x3, 0x9, 0x3, 0xa, 0x3, 
       0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
       0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 
       0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
       0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 
       0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
       0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 
       0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
       0x5, 0xa, 0xe7, 0xa, 0xa, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 
       0x3, 0xb, 0x5, 0xb, 0xee, 0xa, 0xb, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 
       0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 
       0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x5, 0xc, 
       0xff, 0xa, 0xc, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 
       0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 
       0xd, 0x5, 0xd, 0x10d, 0xa, 0xd, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 
       0xe, 0x3, 0xe, 0x3, 0xe, 0x5, 0xe, 0x115, 0xa, 0xe, 0x3, 0xf, 0x3, 
       0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x5, 0xf, 0x11c, 0xa, 0xf, 0x3, 
       0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x5, 
       0x10, 0x124, 0xa, 0x10, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 
       0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x5, 0x11, 
       0x12f, 0xa, 0x11, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 
       0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x5, 0x13, 0x139, 0xa, 0x13, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x5, 0x14, 0x193, 0xa, 
       0x14, 0x3, 0x15, 0x3, 0x15, 0x3, 0x16, 0x3, 0x16, 0x3, 0x17, 0x3, 
       0x17, 0x3, 0x17, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 
       0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 
       0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 
       0x18, 0x3, 0x18, 0x3, 0x18, 0x5, 0x18, 0x1af, 0xa, 0x18, 0x3, 0x19, 
       0x3, 0x19, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 
       0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x5, 0x1b, 0x1bb, 0xa, 0x1b, 0x3, 
       0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x3, 
       0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x5, 0x1c, 0x1c7, 0xa, 0x1c, 
       0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x5, 0x1d, 0x1cc, 0xa, 0x1d, 0x3, 
       0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 
       0x1e, 0x3, 0x1e, 0x5, 0x1e, 0x1d6, 0xa, 0x1e, 0x3, 0x1f, 0x3, 0x1f, 
       0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 
       0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 
       0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x5, 0x1f, 
       0x1eb, 0xa, 0x1f, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 
       0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 
       0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 
       0x20, 0x3, 0x20, 0x3, 0x20, 0x5, 0x20, 0x200, 0xa, 0x20, 0x3, 0x21, 
       0x3, 0x21, 0x3, 0x21, 0x3, 0x21, 0x3, 0x21, 0x3, 0x21, 0x3, 0x21, 
       0x3, 0x21, 0x3, 0x21, 0x3, 0x21, 0x3, 0x21, 0x3, 0x21, 0x5, 0x21, 
       0x20e, 0xa, 0x21, 0x3, 0x22, 0x3, 0x22, 0x3, 0x22, 0x3, 0x22, 0x3, 
       0x22, 0x3, 0x22, 0x3, 0x22, 0x3, 0x22, 0x3, 0x22, 0x5, 0x22, 0x219, 
       0xa, 0x22, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 
       0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x5, 0x23, 
       0x225, 0xa, 0x23, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x5, 
       0x24, 0x22b, 0xa, 0x24, 0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 
       0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 0x7, 0x25, 0x234, 0xa, 0x25, 0xc, 
       0x25, 0xe, 0x25, 0x237, 0xb, 0x25, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 
       0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 
       0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 
       0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 
       0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 
       0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 
       0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 
       0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 
       0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 
       0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 
       0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 
       0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 
       0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 
       0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 
       0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 
       0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 
       0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 
       0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 
       0x3, 0x26, 0x3, 0x26, 0x5, 0x26, 0x2a4, 0xa, 0x26, 0x3, 0x27, 0x3, 
       0x27, 0x3, 0x27, 0x3, 0x27, 0x3, 0x27, 0x3, 0x27, 0x3, 0x27, 0x3, 
       0x27, 0x3, 0x27, 0x3, 0x27, 0x3, 0x27, 0x3, 0x27, 0x3, 0x27, 0x3, 
       0x27, 0x3, 0x27, 0x3, 0x27, 0x3, 0x27, 0x3, 0x27, 0x3, 0x27, 0x5, 
       0x27, 0x2b9, 0xa, 0x27, 0x3, 0x28, 0x3, 0x28, 0x3, 0x28, 0x3, 0x28, 
       0x3, 0x28, 0x3, 0x28, 0x3, 0x28, 0x3, 0x28, 0x3, 0x28, 0x3, 0x28, 
       0x3, 0x28, 0x3, 0x28, 0x3, 0x28, 0x3, 0x28, 0x3, 0x28, 0x3, 0x28, 
       0x3, 0x28, 0x3, 0x28, 0x5, 0x28, 0x2cd, 0xa, 0x28, 0x3, 0x29, 0x3, 
       0x29, 0x5, 0x29, 0x2d1, 0xa, 0x29, 0x3, 0x2a, 0x3, 0x2a, 0x5, 0x2a, 
       0x2d5, 0xa, 0x2a, 0x3, 0x2b, 0x3, 0x2b, 0x5, 0x2b, 0x2d9, 0xa, 0x2b, 
       0x3, 0x2c, 0x3, 0x2c, 0x3, 0x2c, 0x3, 0x2c, 0x3, 0x2c, 0x3, 0x2c, 
       0x3, 0x2c, 0x3, 0x2c, 0x3, 0x2c, 0x3, 0x2c, 0x5, 0x2c, 0x2e5, 0xa, 
       0x2c, 0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x5, 0x2d, 0x2eb, 
       0xa, 0x2d, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 
       0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x5, 0x2e, 0x2f6, 0xa, 
       0x2e, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x30, 0x3, 
       0x30, 0x3, 0x30, 0x5, 0x30, 0x2ff, 0xa, 0x30, 0x3, 0x31, 0x3, 0x31, 
       0x3, 0x31, 0x3, 0x31, 0x3, 0x31, 0x3, 0x31, 0x3, 0x31, 0x3, 0x31, 
       0x3, 0x31, 0x3, 0x31, 0x3, 0x31, 0x3, 0x31, 0x3, 0x31, 0x3, 0x31, 
       0x3, 0x31, 0x3, 0x31, 0x3, 0x31, 0x3, 0x31, 0x3, 0x31, 0x3, 0x31, 
       0x3, 0x31, 0x3, 0x31, 0x3, 0x31, 0x3, 0x31, 0x3, 0x31, 0x3, 0x31, 
       0x3, 0x31, 0x3, 0x31, 0x3, 0x31, 0x3, 0x31, 0x5, 0x31, 0x31f, 0xa, 
       0x31, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 
       0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 
       0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 
       0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 
       0x32, 0x5, 0x32, 0x339, 0xa, 0x32, 0x3, 0x33, 0x3, 0x33, 0x3, 0x34, 
       0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 
       0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 
       0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 
       0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 0x5, 0x34, 0x354, 0xa, 
       0x34, 0x3, 0x35, 0x3, 0x35, 0x3, 0x36, 0x3, 0x36, 0x3, 0x36, 0x3, 
       0x36, 0x3, 0x36, 0x3, 0x36, 0x3, 0x36, 0x3, 0x36, 0x5, 0x36, 0x360, 
       0xa, 0x36, 0x3, 0x37, 0x3, 0x37, 0x5, 0x37, 0x364, 0xa, 0x37, 0x3, 
       0x38, 0x3, 0x38, 0x3, 0x38, 0x3, 0x38, 0x5, 0x38, 0x36a, 0xa, 0x38, 
       0x3, 0x39, 0x3, 0x39, 0x3, 0x39, 0x3, 0x39, 0x3, 0x39, 0x5, 0x39, 
       0x371, 0xa, 0x39, 0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3b, 0x3, 
       0x3b, 0x3, 0x3b, 0x5, 0x3b, 0x379, 0xa, 0x3b, 0x3, 0x3c, 0x3, 0x3c, 
       0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 
       0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 
       0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 
       0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 
       0x5, 0x3d, 0x395, 0xa, 0x3d, 0x3, 0x3e, 0x3, 0x3e, 0x3, 0x3f, 0x3, 
       0x3f, 0x3, 0x3f, 0x3, 0x3f, 0x3, 0x3f, 0x3, 0x3f, 0x3, 0x3f, 0x3, 
       0x3f, 0x3, 0x3f, 0x3, 0x3f, 0x3, 0x3f, 0x3, 0x3f, 0x3, 0x3f, 0x3, 
       0x3f, 0x3, 0x3f, 0x3, 0x3f, 0x3, 0x3f, 0x3, 0x3f, 0x3, 0x3f, 0x3, 
       0x3f, 0x3, 0x3f, 0x3, 0x3f, 0x3, 0x3f, 0x3, 0x3f, 0x5, 0x3f, 0x3b1, 
       0xa, 0x3f, 0x3, 0x40, 0x3, 0x40, 0x3, 0x40, 0x3, 0x40, 0x3, 0x40, 
       0x3, 0x40, 0x3, 0x40, 0x3, 0x40, 0x3, 0x40, 0x5, 0x40, 0x3bc, 0xa, 
       0x40, 0x3, 0x41, 0x3, 0x41, 0x3, 0x41, 0x5, 0x41, 0x3c1, 0xa, 0x41, 
       0x3, 0x42, 0x3, 0x42, 0x3, 0x42, 0x3, 0x42, 0x3, 0x42, 0x3, 0x42, 
       0x3, 0x42, 0x3, 0x42, 0x3, 0x42, 0x3, 0x42, 0x3, 0x42, 0x3, 0x42, 
       0x3, 0x42, 0x3, 0x42, 0x3, 0x42, 0x3, 0x42, 0x5, 0x42, 0x3d3, 0xa, 
       0x42, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 
       0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x5, 
       0x43, 0x3e0, 0xa, 0x43, 0x3, 0x44, 0x3, 0x44, 0x3, 0x44, 0x3, 0x44, 
       0x3, 0x44, 0x3, 0x44, 0x3, 0x44, 0x3, 0x44, 0x3, 0x44, 0x5, 0x44, 
       0x3eb, 0xa, 0x44, 0x3, 0x45, 0x3, 0x45, 0x5, 0x45, 0x3ef, 0xa, 0x45, 
       0x3, 0x46, 0x3, 0x46, 0x3, 0x46, 0x3, 0x46, 0x3, 0x46, 0x3, 0x46, 
       0x3, 0x46, 0x3, 0x46, 0x3, 0x46, 0x3, 0x46, 0x3, 0x46, 0x3, 0x46, 
       0x3, 0x46, 0x3, 0x46, 0x3, 0x46, 0x3, 0x46, 0x3, 0x46, 0x3, 0x46, 
       0x3, 0x46, 0x3, 0x46, 0x3, 0x46, 0x3, 0x46, 0x3, 0x46, 0x5, 0x46, 
       0x408, 0xa, 0x46, 0x3, 0x47, 0x3, 0x47, 0x3, 0x48, 0x3, 0x48, 0x3, 
       0x48, 0x2, 0x4, 0x4, 0x48, 0x49, 0x2, 0x4, 0x6, 0x8, 0xa, 0xc, 0xe, 
       0x10, 0x12, 0x14, 0x16, 0x18, 0x1a, 0x1c, 0x1e, 0x20, 0x22, 0x24, 
       0x26, 0x28, 0x2a, 0x2c, 0x2e, 0x30, 0x32, 0x34, 0x36, 0x38, 0x3a, 
       0x3c, 0x3e, 0x40, 0x42, 0x44, 0x46, 0x48, 0x4a, 0x4c, 0x4e, 0x50, 
       0x52, 0x54, 0x56, 0x58, 0x5a, 0x5c, 0x5e, 0x60, 0x62, 0x64, 0x66, 
       0x68, 0x6a, 0x6c, 0x6e, 0x70, 0x72, 0x74, 0x76, 0x78, 0x7a, 0x7c, 
       0x7e, 0x80, 0x82, 0x84, 0x86, 0x88, 0x8a, 0x8c, 0x8e, 0x2, 0x6, 0x4, 
       0x2, 0x18, 0x18, 0x24, 0x24, 0x3, 0x2, 0x23, 0x24, 0x3, 0x2, 0xb, 
       0xd, 0x4, 0x2, 0x27, 0x27, 0x2b, 0x2b, 0x2, 0x48b, 0x2, 0x90, 0x3, 
       0x2, 0x2, 0x2, 0x4, 0x93, 0x3, 0x2, 0x2, 0x2, 0x6, 0xa4, 0x3, 0x2, 
       0x2, 0x2, 0x8, 0xa6, 0x3, 0x2, 0x2, 0x2, 0xa, 0xa8, 0x3, 0x2, 0x2, 
       0x2, 0xc, 0xb1, 0x3, 0x2, 0x2, 0x2, 0xe, 0xb3, 0x3, 0x2, 0x2, 0x2, 
       0x10, 0xb5, 0x3, 0x2, 0x2, 0x2, 0x12, 0xe6, 0x3, 0x2, 0x2, 0x2, 0x14, 
       0xed, 0x3, 0x2, 0x2, 0x2, 0x16, 0xfe, 0x3, 0x2, 0x2, 0x2, 0x18, 0x10c, 
       0x3, 0x2, 0x2, 0x2, 0x1a, 0x114, 0x3, 0x2, 0x2, 0x2, 0x1c, 0x11b, 
       0x3, 0x2, 0x2, 0x2, 0x1e, 0x123, 0x3, 0x2, 0x2, 0x2, 0x20, 0x12e, 
       0x3, 0x2, 0x2, 0x2, 0x22, 0x130, 0x3, 0x2, 0x2, 0x2, 0x24, 0x138, 
       0x3, 0x2, 0x2, 0x2, 0x26, 0x192, 0x3, 0x2, 0x2, 0x2, 0x28, 0x194, 
       0x3, 0x2, 0x2, 0x2, 0x2a, 0x196, 0x3, 0x2, 0x2, 0x2, 0x2c, 0x198, 
       0x3, 0x2, 0x2, 0x2, 0x2e, 0x1ae, 0x3, 0x2, 0x2, 0x2, 0x30, 0x1b0, 
       0x3, 0x2, 0x2, 0x2, 0x32, 0x1b2, 0x3, 0x2, 0x2, 0x2, 0x34, 0x1ba, 
       0x3, 0x2, 0x2, 0x2, 0x36, 0x1c6, 0x3, 0x2, 0x2, 0x2, 0x38, 0x1cb, 
       0x3, 0x2, 0x2, 0x2, 0x3a, 0x1d5, 0x3, 0x2, 0x2, 0x2, 0x3c, 0x1ea, 
       0x3, 0x2, 0x2, 0x2, 0x3e, 0x1ff, 0x3, 0x2, 0x2, 0x2, 0x40, 0x20d, 
       0x3, 0x2, 0x2, 0x2, 0x42, 0x218, 0x3, 0x2, 0x2, 0x2, 0x44, 0x224, 
       0x3, 0x2, 0x2, 0x2, 0x46, 0x22a, 0x3, 0x2, 0x2, 0x2, 0x48, 0x22c, 
       0x3, 0x2, 0x2, 0x2, 0x4a, 0x2a3, 0x3, 0x2, 0x2, 0x2, 0x4c, 0x2b8, 
       0x3, 0x2, 0x2, 0x2, 0x4e, 0x2cc, 0x3, 0x2, 0x2, 0x2, 0x50, 0x2d0, 
       0x3, 0x2, 0x2, 0x2, 0x52, 0x2d4, 0x3, 0x2, 0x2, 0x2, 0x54, 0x2d8, 
       0x3, 0x2, 0x2, 0x2, 0x56, 0x2e4, 0x3, 0x2, 0x2, 0x2, 0x58, 0x2ea, 
       0x3, 0x2, 0x2, 0x2, 0x5a, 0x2f5, 0x3, 0x2, 0x2, 0x2, 0x5c, 0x2f7, 
       0x3, 0x2, 0x2, 0x2, 0x5e, 0x2fe, 0x3, 0x2, 0x2, 0x2, 0x60, 0x31e, 
       0x3, 0x2, 0x2, 0x2, 0x62, 0x338, 0x3, 0x2, 0x2, 0x2, 0x64, 0x33a, 
       0x3, 0x2, 0x2, 0x2, 0x66, 0x353, 0x3, 0x2, 0x2, 0x2, 0x68, 0x355, 
       0x3, 0x2, 0x2, 0x2, 0x6a, 0x35f, 0x3, 0x2, 0x2, 0x2, 0x6c, 0x363, 
       0x3, 0x2, 0x2, 0x2, 0x6e, 0x369, 0x3, 0x2, 0x2, 0x2, 0x70, 0x370, 
       0x3, 0x2, 0x2, 0x2, 0x72, 0x372, 0x3, 0x2, 0x2, 0x2, 0x74, 0x378, 
       0x3, 0x2, 0x2, 0x2, 0x76, 0x37a, 0x3, 0x2, 0x2, 0x2, 0x78, 0x394, 
       0x3, 0x2, 0x2, 0x2, 0x7a, 0x396, 0x3, 0x2, 0x2, 0x2, 0x7c, 0x3b0, 
       0x3, 0x2, 0x2, 0x2, 0x7e, 0x3bb, 0x3, 0x2, 0x2, 0x2, 0x80, 0x3c0, 
       0x3, 0x2, 0x2, 0x2, 0x82, 0x3d2, 0x3, 0x2, 0x2, 0x2, 0x84, 0x3df, 
       0x3, 0x2, 0x2, 0x2, 0x86, 0x3ea, 0x3, 0x2, 0x2, 0x2, 0x88, 0x3ee, 
       0x3, 0x2, 0x2, 0x2, 0x8a, 0x407, 0x3, 0x2, 0x2, 0x2, 0x8c, 0x409, 
       0x3, 0x2, 0x2, 0x2, 0x8e, 0x40b, 0x3, 0x2, 0x2, 0x2, 0x90, 0x91, 
       0x5, 0x4, 0x3, 0x2, 0x91, 0x92, 0x7, 0x2, 0x2, 0x3, 0x92, 0x3, 0x3, 
       0x2, 0x2, 0x2, 0x93, 0x98, 0x8, 0x3, 0x1, 0x2, 0x94, 0x95, 0xc, 0x4, 
       0x2, 0x2, 0x95, 0x97, 0x5, 0x6, 0x4, 0x2, 0x96, 0x94, 0x3, 0x2, 0x2, 
       0x2, 0x97, 0x9a, 0x3, 0x2, 0x2, 0x2, 0x98, 0x96, 0x3, 0x2, 0x2, 0x2, 
       0x98, 0x99, 0x3, 0x2, 0x2, 0x2, 0x99, 0x5, 0x3, 0x2, 0x2, 0x2, 0x9a, 
       0x98, 0x3, 0x2, 0x2, 0x2, 0x9b, 0xa5, 0x5, 0x8, 0x5, 0x2, 0x9c, 0xa5, 
       0x5, 0xa, 0x6, 0x2, 0x9d, 0xa5, 0x5, 0x10, 0x9, 0x2, 0x9e, 0xa5, 
       0x5, 0x2c, 0x17, 0x2, 0x9f, 0xa5, 0x5, 0x38, 0x1d, 0x2, 0xa0, 0xa5, 
       0x5, 0x4c, 0x27, 0x2, 0xa1, 0xa5, 0x5, 0x60, 0x31, 0x2, 0xa2, 0xa5, 
       0x5, 0x5c, 0x2f, 0x2, 0xa3, 0xa5, 0x5, 0x74, 0x3b, 0x2, 0xa4, 0x9b, 
       0x3, 0x2, 0x2, 0x2, 0xa4, 0x9c, 0x3, 0x2, 0x2, 0x2, 0xa4, 0x9d, 0x3, 
       0x2, 0x2, 0x2, 0xa4, 0x9e, 0x3, 0x2, 0x2, 0x2, 0xa4, 0x9f, 0x3, 0x2, 
       0x2, 0x2, 0xa4, 0xa0, 0x3, 0x2, 0x2, 0x2, 0xa4, 0xa1, 0x3, 0x2, 0x2, 
       0x2, 0xa4, 0xa2, 0x3, 0x2, 0x2, 0x2, 0xa4, 0xa3, 0x3, 0x2, 0x2, 0x2, 
       0xa5, 0x7, 0x3, 0x2, 0x2, 0x2, 0xa6, 0xa7, 0x7, 0x2e, 0x2, 0x2, 0xa7, 
       0x9, 0x3, 0x2, 0x2, 0x2, 0xa8, 0xa9, 0x7, 0x3, 0x2, 0x2, 0xa9, 0xaa, 
       0x5, 0xc, 0x7, 0x2, 0xaa, 0xab, 0x7, 0x17, 0x2, 0x2, 0xab, 0xb, 0x3, 
       0x2, 0x2, 0x2, 0xac, 0xb2, 0x5, 0xe, 0x8, 0x2, 0xad, 0xae, 0x5, 0xe, 
       0x8, 0x2, 0xae, 0xaf, 0x7, 0x1c, 0x2, 0x2, 0xaf, 0xb0, 0x5, 0xc, 
       0x7, 0x2, 0xb0, 0xb2, 0x3, 0x2, 0x2, 0x2, 0xb1, 0xac, 0x3, 0x2, 0x2, 
       0x2, 0xb1, 0xad, 0x3, 0x2, 0x2, 0x2, 0xb2, 0xd, 0x3, 0x2, 0x2, 0x2, 
       0xb3, 0xb4, 0x7, 0x2a, 0x2, 0x2, 0xb4, 0xf, 0x3, 0x2, 0x2, 0x2, 0xb5, 
       0xb6, 0x5, 0x12, 0xa, 0x2, 0xb6, 0x11, 0x3, 0x2, 0x2, 0x2, 0xb7, 
       0xb8, 0x7, 0x4, 0x2, 0x2, 0xb8, 0xb9, 0x5, 0x14, 0xb, 0x2, 0xb9, 
       0xba, 0x7, 0x17, 0x2, 0x2, 0xba, 0xe7, 0x3, 0x2, 0x2, 0x2, 0xbb, 
       0xbc, 0x5, 0x68, 0x35, 0x2, 0xbc, 0xbd, 0x7, 0x4, 0x2, 0x2, 0xbd, 
       0xbe, 0x5, 0x14, 0xb, 0x2, 0xbe, 0xbf, 0x7, 0x17, 0x2, 0x2, 0xbf, 
       0xe7, 0x3, 0x2, 0x2, 0x2, 0xc0, 0xc1, 0x7, 0xe, 0x2, 0x2, 0xc1, 0xc2, 
       0x7, 0x4, 0x2, 0x2, 0xc2, 0xc3, 0x5, 0x14, 0xb, 0x2, 0xc3, 0xc4, 
       0x7, 0x17, 0x2, 0x2, 0xc4, 0xe7, 0x3, 0x2, 0x2, 0x2, 0xc5, 0xc6, 
       0x5, 0x68, 0x35, 0x2, 0xc6, 0xc7, 0x7, 0xe, 0x2, 0x2, 0xc7, 0xc8, 
       0x7, 0x4, 0x2, 0x2, 0xc8, 0xc9, 0x5, 0x14, 0xb, 0x2, 0xc9, 0xca, 
       0x7, 0x17, 0x2, 0x2, 0xca, 0xe7, 0x3, 0x2, 0x2, 0x2, 0xcb, 0xcc, 
       0x7, 0xf, 0x2, 0x2, 0xcc, 0xcd, 0x5, 0x68, 0x35, 0x2, 0xcd, 0xce, 
       0x7, 0xe, 0x2, 0x2, 0xce, 0xcf, 0x7, 0x4, 0x2, 0x2, 0xcf, 0xd0, 0x5, 
       0x14, 0xb, 0x2, 0xd0, 0xd1, 0x7, 0x17, 0x2, 0x2, 0xd1, 0xe7, 0x3, 
       0x2, 0x2, 0x2, 0xd2, 0xd3, 0x7, 0xf, 0x2, 0x2, 0xd3, 0xd4, 0x5, 0x68, 
       0x35, 0x2, 0xd4, 0xd5, 0x7, 0x4, 0x2, 0x2, 0xd5, 0xd6, 0x5, 0x14, 
       0xb, 0x2, 0xd6, 0xd7, 0x7, 0x17, 0x2, 0x2, 0xd7, 0xe7, 0x3, 0x2, 
       0x2, 0x2, 0xd8, 0xd9, 0x7, 0xf, 0x2, 0x2, 0xd9, 0xda, 0x7, 0x4, 0x2, 
       0x2, 0xda, 0xdb, 0x5, 0x14, 0xb, 0x2, 0xdb, 0xdc, 0x7, 0x17, 0x2, 
       0x2, 0xdc, 0xe7, 0x3, 0x2, 0x2, 0x2, 0xdd, 0xde, 0x7, 0xf, 0x2, 0x2, 
       0xde, 0xdf, 0x7, 0xe, 0x2, 0x2, 0xdf, 0xe0, 0x7, 0x4, 0x2, 0x2, 0xe0, 
       0xe1, 0x5, 0x14, 0xb, 0x2, 0xe1, 0xe2, 0x7, 0x17, 0x2, 0x2, 0xe2, 
       0xe7, 0x3, 0x2, 0x2, 0x2, 0xe3, 0xe4, 0x5, 0x14, 0xb, 0x2, 0xe4, 
       0xe5, 0x7, 0x17, 0x2, 0x2, 0xe5, 0xe7, 0x3, 0x2, 0x2, 0x2, 0xe6, 
       0xb7, 0x3, 0x2, 0x2, 0x2, 0xe6, 0xbb, 0x3, 0x2, 0x2, 0x2, 0xe6, 0xc0, 
       0x3, 0x2, 0x2, 0x2, 0xe6, 0xc5, 0x3, 0x2, 0x2, 0x2, 0xe6, 0xcb, 0x3, 
       0x2, 0x2, 0x2, 0xe6, 0xd2, 0x3, 0x2, 0x2, 0x2, 0xe6, 0xd8, 0x3, 0x2, 
       0x2, 0x2, 0xe6, 0xdd, 0x3, 0x2, 0x2, 0x2, 0xe6, 0xe3, 0x3, 0x2, 0x2, 
       0x2, 0xe7, 0x13, 0x3, 0x2, 0x2, 0x2, 0xe8, 0xee, 0x5, 0x16, 0xc, 
       0x2, 0xe9, 0xea, 0x5, 0x16, 0xc, 0x2, 0xea, 0xeb, 0x7, 0x1c, 0x2, 
       0x2, 0xeb, 0xec, 0x5, 0x14, 0xb, 0x2, 0xec, 0xee, 0x3, 0x2, 0x2, 
       0x2, 0xed, 0xe8, 0x3, 0x2, 0x2, 0x2, 0xed, 0xe9, 0x3, 0x2, 0x2, 0x2, 
       0xee, 0x15, 0x3, 0x2, 0x2, 0x2, 0xef, 0xf0, 0x7, 0x27, 0x2, 0x2, 
       0xf0, 0xff, 0x5, 0x18, 0xd, 0x2, 0xf1, 0xf2, 0x5, 0x8c, 0x47, 0x2, 
       0xf2, 0xf3, 0x7, 0x19, 0x2, 0x2, 0xf3, 0xf4, 0x5, 0x8e, 0x48, 0x2, 
       0xf4, 0xf5, 0x5, 0x18, 0xd, 0x2, 0xf5, 0xff, 0x3, 0x2, 0x2, 0x2, 
       0xf6, 0xf7, 0x5, 0x8c, 0x47, 0x2, 0xf7, 0xf8, 0x7, 0x1b, 0x2, 0x2, 
       0xf8, 0xf9, 0x5, 0x8e, 0x48, 0x2, 0xf9, 0xfa, 0x5, 0x18, 0xd, 0x2, 
       0xfa, 0xff, 0x3, 0x2, 0x2, 0x2, 0xfb, 0xfc, 0x5, 0x84, 0x43, 0x2, 
       0xfc, 0xfd, 0x5, 0x18, 0xd, 0x2, 0xfd, 0xff, 0x3, 0x2, 0x2, 0x2, 
       0xfe, 0xef, 0x3, 0x2, 0x2, 0x2, 0xfe, 0xf1, 0x3, 0x2, 0x2, 0x2, 0xfe, 
       0xf6, 0x3, 0x2, 0x2, 0x2, 0xfe, 0xfb, 0x3, 0x2, 0x2, 0x2, 0xff, 0x17, 
       0x3, 0x2, 0x2, 0x2, 0x100, 0x101, 0x9, 0x2, 0x2, 0x2, 0x101, 0x10d, 
       0x5, 0x8a, 0x46, 0x2, 0x102, 0x103, 0x7, 0x29, 0x2, 0x2, 0x103, 0x104, 
       0x9, 0x2, 0x2, 0x2, 0x104, 0x10d, 0x5, 0x8a, 0x46, 0x2, 0x105, 0x106, 
       0x9, 0x2, 0x2, 0x2, 0x106, 0x107, 0x7, 0x15, 0x2, 0x2, 0x107, 0x10d, 
       0x5, 0x8a, 0x46, 0x2, 0x108, 0x109, 0x7, 0x29, 0x2, 0x2, 0x109, 0x10a, 
       0x9, 0x2, 0x2, 0x2, 0x10a, 0x10b, 0x7, 0x15, 0x2, 0x2, 0x10b, 0x10d, 
       0x5, 0x8a, 0x46, 0x2, 0x10c, 0x100, 0x3, 0x2, 0x2, 0x2, 0x10c, 0x102, 
       0x3, 0x2, 0x2, 0x2, 0x10c, 0x105, 0x3, 0x2, 0x2, 0x2, 0x10c, 0x108, 
       0x3, 0x2, 0x2, 0x2, 0x10d, 0x19, 0x3, 0x2, 0x2, 0x2, 0x10e, 0x10f, 
       0x7, 0x1d, 0x2, 0x2, 0x10f, 0x115, 0x7, 0x1e, 0x2, 0x2, 0x110, 0x111, 
       0x7, 0x1d, 0x2, 0x2, 0x111, 0x112, 0x5, 0x1c, 0xf, 0x2, 0x112, 0x113, 
       0x7, 0x1e, 0x2, 0x2, 0x113, 0x115, 0x3, 0x2, 0x2, 0x2, 0x114, 0x10e, 
       0x3, 0x2, 0x2, 0x2, 0x114, 0x110, 0x3, 0x2, 0x2, 0x2, 0x115, 0x1b, 
       0x3, 0x2, 0x2, 0x2, 0x116, 0x11c, 0x5, 0x8a, 0x46, 0x2, 0x117, 0x118, 
       0x5, 0x8a, 0x46, 0x2, 0x118, 0x119, 0x7, 0x1c, 0x2, 0x2, 0x119, 0x11a, 
       0x5, 0x1c, 0xf, 0x2, 0x11a, 0x11c, 0x3, 0x2, 0x2, 0x2, 0x11b, 0x116, 
       0x3, 0x2, 0x2, 0x2, 0x11b, 0x117, 0x3, 0x2, 0x2, 0x2, 0x11c, 0x1d, 
       0x3, 0x2, 0x2, 0x2, 0x11d, 0x11e, 0x7, 0x1f, 0x2, 0x2, 0x11e, 0x124, 
       0x7, 0x20, 0x2, 0x2, 0x11f, 0x120, 0x7, 0x1f, 0x2, 0x2, 0x120, 0x121, 
       0x5, 0x20, 0x11, 0x2, 0x121, 0x122, 0x7, 0x20, 0x2, 0x2, 0x122, 0x124, 
       0x3, 0x2, 0x2, 0x2, 0x123, 0x11d, 0x3, 0x2, 0x2, 0x2, 0x123, 0x11f, 
       0x3, 0x2, 0x2, 0x2, 0x124, 0x1f, 0x3, 0x2, 0x2, 0x2, 0x125, 0x126, 
       0x7, 0x27, 0x2, 0x2, 0x126, 0x127, 0x7, 0x1a, 0x2, 0x2, 0x127, 0x12f, 
       0x5, 0x8a, 0x46, 0x2, 0x128, 0x129, 0x7, 0x27, 0x2, 0x2, 0x129, 0x12a, 
       0x7, 0x1a, 0x2, 0x2, 0x12a, 0x12b, 0x5, 0x8a, 0x46, 0x2, 0x12b, 0x12c, 
       0x7, 0x1c, 0x2, 0x2, 0x12c, 0x12d, 0x5, 0x20, 0x11, 0x2, 0x12d, 0x12f, 
       0x3, 0x2, 0x2, 0x2, 0x12e, 0x125, 0x3, 0x2, 0x2, 0x2, 0x12e, 0x128, 
       0x3, 0x2, 0x2, 0x2, 0x12f, 0x21, 0x3, 0x2, 0x2, 0x2, 0x130, 0x131, 
       0x7, 0x21, 0x2, 0x2, 0x131, 0x132, 0x5, 0x24, 0x13, 0x2, 0x132, 0x133, 
       0x7, 0x22, 0x2, 0x2, 0x133, 0x23, 0x3, 0x2, 0x2, 0x2, 0x134, 0x139, 
       0x5, 0x26, 0x14, 0x2, 0x135, 0x136, 0x5, 0x26, 0x14, 0x2, 0x136, 
       0x137, 0x5, 0x24, 0x13, 0x2, 0x137, 0x139, 0x3, 0x2, 0x2, 0x2, 0x138, 
       0x134, 0x3, 0x2, 0x2, 0x2, 0x138, 0x135, 0x3, 0x2, 0x2, 0x2, 0x139, 
       0x25, 0x3, 0x2, 0x2, 0x2, 0x13a, 0x193, 0x7, 0x27, 0x2, 0x2, 0x13b, 
       0x13c, 0x7, 0x27, 0x2, 0x2, 0x13c, 0x193, 0x7, 0x23, 0x2, 0x2, 0x13d, 
       0x13e, 0x7, 0x27, 0x2, 0x2, 0x13e, 0x193, 0x7, 0x29, 0x2, 0x2, 0x13f, 
       0x140, 0x7, 0x27, 0x2, 0x2, 0x140, 0x141, 0x7, 0x29, 0x2, 0x2, 0x141, 
       0x193, 0x7, 0x23, 0x2, 0x2, 0x142, 0x143, 0x5, 0x28, 0x15, 0x2, 0x143, 
       0x144, 0x7, 0x27, 0x2, 0x2, 0x144, 0x193, 0x3, 0x2, 0x2, 0x2, 0x145, 
       0x146, 0x5, 0x28, 0x15, 0x2, 0x146, 0x147, 0x7, 0x27, 0x2, 0x2, 0x147, 
       0x148, 0x7, 0x23, 0x2, 0x2, 0x148, 0x193, 0x3, 0x2, 0x2, 0x2, 0x149, 
       0x14a, 0x5, 0x28, 0x15, 0x2, 0x14a, 0x14b, 0x7, 0x27, 0x2, 0x2, 0x14b, 
       0x14c, 0x7, 0x29, 0x2, 0x2, 0x14c, 0x193, 0x3, 0x2, 0x2, 0x2, 0x14d, 
       0x14e, 0x5, 0x28, 0x15, 0x2, 0x14e, 0x14f, 0x7, 0x27, 0x2, 0x2, 0x14f, 
       0x150, 0x7, 0x29, 0x2, 0x2, 0x150, 0x151, 0x7, 0x23, 0x2, 0x2, 0x151, 
       0x193, 0x3, 0x2, 0x2, 0x2, 0x152, 0x153, 0x7, 0x27, 0x2, 0x2, 0x153, 
       0x193, 0x5, 0x2a, 0x16, 0x2, 0x154, 0x155, 0x7, 0x27, 0x2, 0x2, 0x155, 
       0x156, 0x5, 0x2a, 0x16, 0x2, 0x156, 0x157, 0x7, 0x23, 0x2, 0x2, 0x157, 
       0x193, 0x3, 0x2, 0x2, 0x2, 0x158, 0x159, 0x7, 0x27, 0x2, 0x2, 0x159, 
       0x15a, 0x5, 0x2a, 0x16, 0x2, 0x15a, 0x15b, 0x7, 0x29, 0x2, 0x2, 0x15b, 
       0x193, 0x3, 0x2, 0x2, 0x2, 0x15c, 0x15d, 0x7, 0x27, 0x2, 0x2, 0x15d, 
       0x15e, 0x5, 0x2a, 0x16, 0x2, 0x15e, 0x15f, 0x7, 0x29, 0x2, 0x2, 0x15f, 
       0x160, 0x7, 0x23, 0x2, 0x2, 0x160, 0x193, 0x3, 0x2, 0x2, 0x2, 0x161, 
       0x193, 0x7, 0x2b, 0x2, 0x2, 0x162, 0x163, 0x7, 0x2b, 0x2, 0x2, 0x163, 
       0x193, 0x7, 0x23, 0x2, 0x2, 0x164, 0x165, 0x7, 0x2b, 0x2, 0x2, 0x165, 
       0x193, 0x7, 0x29, 0x2, 0x2, 0x166, 0x167, 0x7, 0x2b, 0x2, 0x2, 0x167, 
       0x168, 0x7, 0x29, 0x2, 0x2, 0x168, 0x193, 0x7, 0x23, 0x2, 0x2, 0x169, 
       0x193, 0x7, 0x2c, 0x2, 0x2, 0x16a, 0x16b, 0x7, 0x2c, 0x2, 0x2, 0x16b, 
       0x193, 0x7, 0x23, 0x2, 0x2, 0x16c, 0x16d, 0x7, 0x2c, 0x2, 0x2, 0x16d, 
       0x193, 0x7, 0x29, 0x2, 0x2, 0x16e, 0x16f, 0x7, 0x2c, 0x2, 0x2, 0x16f, 
       0x170, 0x7, 0x29, 0x2, 0x2, 0x170, 0x193, 0x7, 0x23, 0x2, 0x2, 0x171, 
       0x193, 0x5, 0x2e, 0x18, 0x2, 0x172, 0x173, 0x5, 0x2e, 0x18, 0x2, 
       0x173, 0x174, 0x7, 0x23, 0x2, 0x2, 0x174, 0x193, 0x3, 0x2, 0x2, 0x2, 
       0x175, 0x176, 0x5, 0x2e, 0x18, 0x2, 0x176, 0x177, 0x7, 0x29, 0x2, 
       0x2, 0x177, 0x193, 0x3, 0x2, 0x2, 0x2, 0x178, 0x179, 0x5, 0x2e, 0x18, 
       0x2, 0x179, 0x17a, 0x7, 0x29, 0x2, 0x2, 0x17a, 0x17b, 0x7, 0x23, 
       0x2, 0x2, 0x17b, 0x193, 0x3, 0x2, 0x2, 0x2, 0x17c, 0x193, 0x5, 0x22, 
       0x12, 0x2, 0x17d, 0x17e, 0x5, 0x22, 0x12, 0x2, 0x17e, 0x17f, 0x7, 
       0x23, 0x2, 0x2, 0x17f, 0x193, 0x3, 0x2, 0x2, 0x2, 0x180, 0x181, 0x5, 
       0x22, 0x12, 0x2, 0x181, 0x182, 0x7, 0x29, 0x2, 0x2, 0x182, 0x193, 
       0x3, 0x2, 0x2, 0x2, 0x183, 0x184, 0x5, 0x22, 0x12, 0x2, 0x184, 0x185, 
       0x7, 0x29, 0x2, 0x2, 0x185, 0x186, 0x7, 0x23, 0x2, 0x2, 0x186, 0x193, 
       0x3, 0x2, 0x2, 0x2, 0x187, 0x193, 0x5, 0x84, 0x43, 0x2, 0x188, 0x189, 
       0x5, 0x84, 0x43, 0x2, 0x189, 0x18a, 0x7, 0x23, 0x2, 0x2, 0x18a, 0x193, 
       0x3, 0x2, 0x2, 0x2, 0x18b, 0x18c, 0x5, 0x84, 0x43, 0x2, 0x18c, 0x18d, 
       0x7, 0x29, 0x2, 0x2, 0x18d, 0x193, 0x3, 0x2, 0x2, 0x2, 0x18e, 0x18f, 
       0x5, 0x84, 0x43, 0x2, 0x18f, 0x190, 0x7, 0x29, 0x2, 0x2, 0x190, 0x191, 
       0x7, 0x23, 0x2, 0x2, 0x191, 0x193, 0x3, 0x2, 0x2, 0x2, 0x192, 0x13a, 
       0x3, 0x2, 0x2, 0x2, 0x192, 0x13b, 0x3, 0x2, 0x2, 0x2, 0x192, 0x13d, 
       0x3, 0x2, 0x2, 0x2, 0x192, 0x13f, 0x3, 0x2, 0x2, 0x2, 0x192, 0x142, 
       0x3, 0x2, 0x2, 0x2, 0x192, 0x145, 0x3, 0x2, 0x2, 0x2, 0x192, 0x149, 
       0x3, 0x2, 0x2, 0x2, 0x192, 0x14d, 0x3, 0x2, 0x2, 0x2, 0x192, 0x152, 
       0x3, 0x2, 0x2, 0x2, 0x192, 0x154, 0x3, 0x2, 0x2, 0x2, 0x192, 0x158, 
       0x3, 0x2, 0x2, 0x2, 0x192, 0x15c, 0x3, 0x2, 0x2, 0x2, 0x192, 0x161, 
       0x3, 0x2, 0x2, 0x2, 0x192, 0x162, 0x3, 0x2, 0x2, 0x2, 0x192, 0x164, 
       0x3, 0x2, 0x2, 0x2, 0x192, 0x166, 0x3, 0x2, 0x2, 0x2, 0x192, 0x169, 
       0x3, 0x2, 0x2, 0x2, 0x192, 0x16a, 0x3, 0x2, 0x2, 0x2, 0x192, 0x16c, 
       0x3, 0x2, 0x2, 0x2, 0x192, 0x16e, 0x3, 0x2, 0x2, 0x2, 0x192, 0x171, 
       0x3, 0x2, 0x2, 0x2, 0x192, 0x172, 0x3, 0x2, 0x2, 0x2, 0x192, 0x175, 
       0x3, 0x2, 0x2, 0x2, 0x192, 0x178, 0x3, 0x2, 0x2, 0x2, 0x192, 0x17c, 
       0x3, 0x2, 0x2, 0x2, 0x192, 0x17d, 0x3, 0x2, 0x2, 0x2, 0x192, 0x180, 
       0x3, 0x2, 0x2, 0x2, 0x192, 0x183, 0x3, 0x2, 0x2, 0x2, 0x192, 0x187, 
       0x3, 0x2, 0x2, 0x2, 0x192, 0x188, 0x3, 0x2, 0x2, 0x2, 0x192, 0x18b, 
       0x3, 0x2, 0x2, 0x2, 0x192, 0x18e, 0x3, 0x2, 0x2, 0x2, 0x193, 0x27, 
       0x3, 0x2, 0x2, 0x2, 0x194, 0x195, 0x7, 0x26, 0x2, 0x2, 0x195, 0x29, 
       0x3, 0x2, 0x2, 0x2, 0x196, 0x197, 0x7, 0x26, 0x2, 0x2, 0x197, 0x2b, 
       0x3, 0x2, 0x2, 0x2, 0x198, 0x199, 0x5, 0x2e, 0x18, 0x2, 0x199, 0x19a, 
       0x7, 0x17, 0x2, 0x2, 0x19a, 0x2d, 0x3, 0x2, 0x2, 0x2, 0x19b, 0x19c, 
       0x7, 0x27, 0x2, 0x2, 0x19c, 0x1af, 0x5, 0x34, 0x1b, 0x2, 0x19d, 0x19e, 
       0x7, 0x27, 0x2, 0x2, 0x19e, 0x19f, 0x7, 0x19, 0x2, 0x2, 0x19f, 0x1a0, 
       0x5, 0x30, 0x19, 0x2, 0x1a0, 0x1a1, 0x5, 0x34, 0x1b, 0x2, 0x1a1, 
       0x1af, 0x3, 0x2, 0x2, 0x2, 0x1a2, 0x1a3, 0x7, 0x27, 0x2, 0x2, 0x1a3, 
       0x1a4, 0x7, 0x1b, 0x2, 0x2, 0x1a4, 0x1a5, 0x5, 0x30, 0x19, 0x2, 0x1a5, 
       0x1a6, 0x5, 0x34, 0x1b, 0x2, 0x1a6, 0x1af, 0x3, 0x2, 0x2, 0x2, 0x1a7, 
       0x1a8, 0x7, 0x27, 0x2, 0x2, 0x1a8, 0x1a9, 0x7, 0x19, 0x2, 0x2, 0x1a9, 
       0x1aa, 0x5, 0x30, 0x19, 0x2, 0x1aa, 0x1ab, 0x5, 0x34, 0x1b, 0x2, 
       0x1ab, 0x1ac, 0x5, 0x32, 0x1a, 0x2, 0x1ac, 0x1ad, 0x5, 0x2e, 0x18, 
       0x2, 0x1ad, 0x1af, 0x3, 0x2, 0x2, 0x2, 0x1ae, 0x19b, 0x3, 0x2, 0x2, 
       0x2, 0x1ae, 0x19d, 0x3, 0x2, 0x2, 0x2, 0x1ae, 0x1a2, 0x3, 0x2, 0x2, 
       0x2, 0x1ae, 0x1a7, 0x3, 0x2, 0x2, 0x2, 0x1af, 0x2f, 0x3, 0x2, 0x2, 
       0x2, 0x1b0, 0x1b1, 0x7, 0x27, 0x2, 0x2, 0x1b1, 0x31, 0x3, 0x2, 0x2, 
       0x2, 0x1b2, 0x1b3, 0x7, 0x19, 0x2, 0x2, 0x1b3, 0x33, 0x3, 0x2, 0x2, 
       0x2, 0x1b4, 0x1b5, 0x7, 0x21, 0x2, 0x2, 0x1b5, 0x1bb, 0x7, 0x22, 
       0x2, 0x2, 0x1b6, 0x1b7, 0x7, 0x21, 0x2, 0x2, 0x1b7, 0x1b8, 0x5, 0x36, 
       0x1c, 0x2, 0x1b8, 0x1b9, 0x7, 0x22, 0x2, 0x2, 0x1b9, 0x1bb, 0x3, 
       0x2, 0x2, 0x2, 0x1ba, 0x1b4, 0x3, 0x2, 0x2, 0x2, 0x1ba, 0x1b6, 0x3, 
       0x2, 0x2, 0x2, 0x1bb, 0x35, 0x3, 0x2, 0x2, 0x2, 0x1bc, 0x1c7, 0x5, 
       0x8a, 0x46, 0x2, 0x1bd, 0x1be, 0x5, 0x8a, 0x46, 0x2, 0x1be, 0x1bf, 
       0x7, 0x1c, 0x2, 0x2, 0x1bf, 0x1c0, 0x5, 0x36, 0x1c, 0x2, 0x1c0, 0x1c7, 
       0x3, 0x2, 0x2, 0x2, 0x1c1, 0x1c7, 0x5, 0x24, 0x13, 0x2, 0x1c2, 0x1c3, 
       0x5, 0x24, 0x13, 0x2, 0x1c3, 0x1c4, 0x7, 0x1c, 0x2, 0x2, 0x1c4, 0x1c5, 
       0x5, 0x36, 0x1c, 0x2, 0x1c5, 0x1c7, 0x3, 0x2, 0x2, 0x2, 0x1c6, 0x1bc, 
       0x3, 0x2, 0x2, 0x2, 0x1c6, 0x1bd, 0x3, 0x2, 0x2, 0x2, 0x1c6, 0x1c1, 
       0x3, 0x2, 0x2, 0x2, 0x1c6, 0x1c2, 0x3, 0x2, 0x2, 0x2, 0x1c7, 0x37, 
       0x3, 0x2, 0x2, 0x2, 0x1c8, 0x1cc, 0x5, 0x3c, 0x1f, 0x2, 0x1c9, 0x1cc, 
       0x5, 0x3e, 0x20, 0x2, 0x1ca, 0x1cc, 0x5, 0x40, 0x21, 0x2, 0x1cb, 
       0x1c8, 0x3, 0x2, 0x2, 0x2, 0x1cb, 0x1c9, 0x3, 0x2, 0x2, 0x2, 0x1cb, 
       0x1ca, 0x3, 0x2, 0x2, 0x2, 0x1cc, 0x39, 0x3, 0x2, 0x2, 0x2, 0x1cd, 
       0x1d6, 0x5, 0x38, 0x1d, 0x2, 0x1ce, 0x1cf, 0x5, 0x38, 0x1d, 0x2, 
       0x1cf, 0x1d0, 0x5, 0x3a, 0x1e, 0x2, 0x1d0, 0x1d6, 0x3, 0x2, 0x2, 
       0x2, 0x1d1, 0x1d6, 0x5, 0x6, 0x4, 0x2, 0x1d2, 0x1d3, 0x5, 0x6, 0x4, 
       0x2, 0x1d3, 0x1d4, 0x5, 0x3a, 0x1e, 0x2, 0x1d4, 0x1d6, 0x3, 0x2, 
       0x2, 0x2, 0x1d5, 0x1cd, 0x3, 0x2, 0x2, 0x2, 0x1d5, 0x1ce, 0x3, 0x2, 
       0x2, 0x2, 0x1d5, 0x1d1, 0x3, 0x2, 0x2, 0x2, 0x1d5, 0x1d2, 0x3, 0x2, 
       0x2, 0x2, 0x1d6, 0x3b, 0x3, 0x2, 0x2, 0x2, 0x1d7, 0x1d8, 0x7, 0x5, 
       0x2, 0x2, 0x1d8, 0x1d9, 0x5, 0x44, 0x23, 0x2, 0x1d9, 0x1da, 0x5, 
       0x2c, 0x17, 0x2, 0x1da, 0x1eb, 0x3, 0x2, 0x2, 0x2, 0x1db, 0x1dc, 
       0x7, 0x5, 0x2, 0x2, 0x1dc, 0x1dd, 0x5, 0x44, 0x23, 0x2, 0x1dd, 0x1de, 
       0x7, 0x1f, 0x2, 0x2, 0x1de, 0x1df, 0x7, 0x20, 0x2, 0x2, 0x1df, 0x1eb, 
       0x3, 0x2, 0x2, 0x2, 0x1e0, 0x1e1, 0x7, 0x5, 0x2, 0x2, 0x1e1, 0x1e2, 
       0x5, 0x44, 0x23, 0x2, 0x1e2, 0x1e3, 0x7, 0x1f, 0x2, 0x2, 0x1e3, 0x1e4, 
       0x5, 0x3a, 0x1e, 0x2, 0x1e4, 0x1e5, 0x7, 0x20, 0x2, 0x2, 0x1e5, 0x1eb, 
       0x3, 0x2, 0x2, 0x2, 0x1e6, 0x1e7, 0x7, 0x5, 0x2, 0x2, 0x1e7, 0x1e8, 
       0x5, 0x44, 0x23, 0x2, 0x1e8, 0x1e9, 0x5, 0x42, 0x22, 0x2, 0x1e9, 
       0x1eb, 0x3, 0x2, 0x2, 0x2, 0x1ea, 0x1d7, 0x3, 0x2, 0x2, 0x2, 0x1ea, 
       0x1db, 0x3, 0x2, 0x2, 0x2, 0x1ea, 0x1e0, 0x3, 0x2, 0x2, 0x2, 0x1ea, 
       0x1e6, 0x3, 0x2, 0x2, 0x2, 0x1eb, 0x3d, 0x3, 0x2, 0x2, 0x2, 0x1ec, 
       0x1ed, 0x7, 0x6, 0x2, 0x2, 0x1ed, 0x1ee, 0x5, 0x44, 0x23, 0x2, 0x1ee, 
       0x1ef, 0x5, 0x2c, 0x17, 0x2, 0x1ef, 0x200, 0x3, 0x2, 0x2, 0x2, 0x1f0, 
       0x1f1, 0x7, 0x6, 0x2, 0x2, 0x1f1, 0x1f2, 0x5, 0x44, 0x23, 0x2, 0x1f2, 
       0x1f3, 0x7, 0x1f, 0x2, 0x2, 0x1f3, 0x1f4, 0x7, 0x20, 0x2, 0x2, 0x1f4, 
       0x200, 0x3, 0x2, 0x2, 0x2, 0x1f5, 0x1f6, 0x7, 0x6, 0x2, 0x2, 0x1f6, 
       0x1f7, 0x5, 0x44, 0x23, 0x2, 0x1f7, 0x1f8, 0x7, 0x1f, 0x2, 0x2, 0x1f8, 
       0x1f9, 0x5, 0x3a, 0x1e, 0x2, 0x1f9, 0x1fa, 0x7, 0x20, 0x2, 0x2, 0x1fa, 
       0x200, 0x3, 0x2, 0x2, 0x2, 0x1fb, 0x1fc, 0x7, 0x6, 0x2, 0x2, 0x1fc, 
       0x1fd, 0x5, 0x44, 0x23, 0x2, 0x1fd, 0x1fe, 0x5, 0x42, 0x22, 0x2, 
       0x1fe, 0x200, 0x3, 0x2, 0x2, 0x2, 0x1ff, 0x1ec, 0x3, 0x2, 0x2, 0x2, 
       0x1ff, 0x1f0, 0x3, 0x2, 0x2, 0x2, 0x1ff, 0x1f5, 0x3, 0x2, 0x2, 0x2, 
       0x1ff, 0x1fb, 0x3, 0x2, 0x2, 0x2, 0x200, 0x3f, 0x3, 0x2, 0x2, 0x2, 
       0x201, 0x202, 0x7, 0x7, 0x2, 0x2, 0x202, 0x20e, 0x5, 0x2c, 0x17, 
       0x2, 0x203, 0x204, 0x7, 0x7, 0x2, 0x2, 0x204, 0x205, 0x7, 0x1f, 0x2, 
       0x2, 0x205, 0x20e, 0x7, 0x20, 0x2, 0x2, 0x206, 0x207, 0x7, 0x7, 0x2, 
       0x2, 0x207, 0x208, 0x7, 0x1f, 0x2, 0x2, 0x208, 0x209, 0x5, 0x3a, 
       0x1e, 0x2, 0x209, 0x20a, 0x7, 0x20, 0x2, 0x2, 0x20a, 0x20e, 0x3, 
       0x2, 0x2, 0x2, 0x20b, 0x20c, 0x7, 0x7, 0x2, 0x2, 0x20c, 0x20e, 0x5, 
       0x42, 0x22, 0x2, 0x20d, 0x201, 0x3, 0x2, 0x2, 0x2, 0x20d, 0x203, 
       0x3, 0x2, 0x2, 0x2, 0x20d, 0x206, 0x3, 0x2, 0x2, 0x2, 0x20d, 0x20b, 
       0x3, 0x2, 0x2, 0x2, 0x20e, 0x41, 0x3, 0x2, 0x2, 0x2, 0x20f, 0x219, 
       0x5, 0x3c, 0x1f, 0x2, 0x210, 0x211, 0x5, 0x3c, 0x1f, 0x2, 0x211, 
       0x212, 0x5, 0x3a, 0x1e, 0x2, 0x212, 0x219, 0x3, 0x2, 0x2, 0x2, 0x213, 
       0x219, 0x5, 0x4c, 0x27, 0x2, 0x214, 0x215, 0x5, 0x4c, 0x27, 0x2, 
       0x215, 0x216, 0x5, 0x42, 0x22, 0x2, 0x216, 0x219, 0x3, 0x2, 0x2, 
       0x2, 0x217, 0x219, 0x5, 0x5c, 0x2f, 0x2, 0x218, 0x20f, 0x3, 0x2, 
       0x2, 0x2, 0x218, 0x210, 0x3, 0x2, 0x2, 0x2, 0x218, 0x213, 0x3, 0x2, 
       0x2, 0x2, 0x218, 0x214, 0x3, 0x2, 0x2, 0x2, 0x218, 0x217, 0x3, 0x2, 
       0x2, 0x2, 0x219, 0x43, 0x3, 0x2, 0x2, 0x2, 0x21a, 0x225, 0x5, 0x46, 
       0x24, 0x2, 0x21b, 0x21c, 0x5, 0x46, 0x24, 0x2, 0x21c, 0x21d, 0x5, 
       0x44, 0x23, 0x2, 0x21d, 0x225, 0x3, 0x2, 0x2, 0x2, 0x21e, 0x225, 
       0x5, 0x48, 0x25, 0x2, 0x21f, 0x220, 0x5, 0x48, 0x25, 0x2, 0x220, 
       0x221, 0x5, 0x44, 0x23, 0x2, 0x221, 0x225, 0x3, 0x2, 0x2, 0x2, 0x222, 
       0x223, 0x7, 0x25, 0x2, 0x2, 0x223, 0x225, 0x5, 0x44, 0x23, 0x2, 0x224, 
       0x21a, 0x3, 0x2, 0x2, 0x2, 0x224, 0x21b, 0x3, 0x2, 0x2, 0x2, 0x224, 
       0x21e, 0x3, 0x2, 0x2, 0x2, 0x224, 0x21f, 0x3, 0x2, 0x2, 0x2, 0x224, 
       0x222, 0x3, 0x2, 0x2, 0x2, 0x225, 0x45, 0x3, 0x2, 0x2, 0x2, 0x226, 
       0x22b, 0x5, 0x4a, 0x26, 0x2, 0x227, 0x228, 0x5, 0x4a, 0x26, 0x2, 
       0x228, 0x229, 0x5, 0x46, 0x24, 0x2, 0x229, 0x22b, 0x3, 0x2, 0x2, 
       0x2, 0x22a, 0x226, 0x3, 0x2, 0x2, 0x2, 0x22a, 0x227, 0x3, 0x2, 0x2, 
       0x2, 0x22b, 0x47, 0x3, 0x2, 0x2, 0x2, 0x22c, 0x22d, 0x8, 0x25, 0x1, 
       0x2, 0x22d, 0x22e, 0x7, 0x21, 0x2, 0x2, 0x22e, 0x22f, 0x5, 0x44, 
       0x23, 0x2, 0x22f, 0x230, 0x7, 0x22, 0x2, 0x2, 0x230, 0x235, 0x3, 
       0x2, 0x2, 0x2, 0x231, 0x232, 0xc, 0x3, 0x2, 0x2, 0x232, 0x234, 0x7, 
       0x24, 0x2, 0x2, 0x233, 0x231, 0x3, 0x2, 0x2, 0x2, 0x234, 0x237, 0x3, 
       0x2, 0x2, 0x2, 0x235, 0x233, 0x3, 0x2, 0x2, 0x2, 0x235, 0x236, 0x3, 
       0x2, 0x2, 0x2, 0x236, 0x49, 0x3, 0x2, 0x2, 0x2, 0x237, 0x235, 0x3, 
       0x2, 0x2, 0x2, 0x238, 0x2a4, 0x7, 0x27, 0x2, 0x2, 0x239, 0x23a, 0x7, 
       0x27, 0x2, 0x2, 0x23a, 0x2a4, 0x9, 0x3, 0x2, 0x2, 0x23b, 0x23c, 0x7, 
       0x27, 0x2, 0x2, 0x23c, 0x2a4, 0x7, 0x29, 0x2, 0x2, 0x23d, 0x23e, 
       0x7, 0x27, 0x2, 0x2, 0x23e, 0x23f, 0x7, 0x29, 0x2, 0x2, 0x23f, 0x2a4, 
       0x9, 0x3, 0x2, 0x2, 0x240, 0x241, 0x5, 0x28, 0x15, 0x2, 0x241, 0x242, 
       0x7, 0x27, 0x2, 0x2, 0x242, 0x2a4, 0x3, 0x2, 0x2, 0x2, 0x243, 0x244, 
       0x5, 0x28, 0x15, 0x2, 0x244, 0x245, 0x7, 0x27, 0x2, 0x2, 0x245, 0x246, 
       0x9, 0x3, 0x2, 0x2, 0x246, 0x2a4, 0x3, 0x2, 0x2, 0x2, 0x247, 0x248, 
       0x5, 0x28, 0x15, 0x2, 0x248, 0x249, 0x7, 0x27, 0x2, 0x2, 0x249, 0x24a, 
       0x7, 0x29, 0x2, 0x2, 0x24a, 0x2a4, 0x3, 0x2, 0x2, 0x2, 0x24b, 0x24c, 
       0x5, 0x28, 0x15, 0x2, 0x24c, 0x24d, 0x7, 0x27, 0x2, 0x2, 0x24d, 0x24e, 
       0x7, 0x29, 0x2, 0x2, 0x24e, 0x24f, 0x9, 0x3, 0x2, 0x2, 0x24f, 0x2a4, 
       0x3, 0x2, 0x2, 0x2, 0x250, 0x251, 0x7, 0x27, 0x2, 0x2, 0x251, 0x2a4, 
       0x5, 0x2a, 0x16, 0x2, 0x252, 0x253, 0x7, 0x27, 0x2, 0x2, 0x253, 0x254, 
       0x5, 0x2a, 0x16, 0x2, 0x254, 0x255, 0x9, 0x3, 0x2, 0x2, 0x255, 0x2a4, 
       0x3, 0x2, 0x2, 0x2, 0x256, 0x257, 0x7, 0x27, 0x2, 0x2, 0x257, 0x258, 
       0x5, 0x2a, 0x16, 0x2, 0x258, 0x259, 0x7, 0x29, 0x2, 0x2, 0x259, 0x2a4, 
       0x3, 0x2, 0x2, 0x2, 0x25a, 0x25b, 0x7, 0x27, 0x2, 0x2, 0x25b, 0x25c, 
       0x5, 0x2a, 0x16, 0x2, 0x25c, 0x25d, 0x7, 0x29, 0x2, 0x2, 0x25d, 0x25e, 
       0x9, 0x3, 0x2, 0x2, 0x25e, 0x2a4, 0x3, 0x2, 0x2, 0x2, 0x25f, 0x2a4, 
       0x7, 0x2b, 0x2, 0x2, 0x260, 0x261, 0x7, 0x2b, 0x2, 0x2, 0x261, 0x2a4, 
       0x9, 0x3, 0x2, 0x2, 0x262, 0x263, 0x7, 0x2b, 0x2, 0x2, 0x263, 0x2a4, 
       0x7, 0x29, 0x2, 0x2, 0x264, 0x265, 0x7, 0x2b, 0x2, 0x2, 0x265, 0x266, 
       0x7, 0x29, 0x2, 0x2, 0x266, 0x2a4, 0x9, 0x3, 0x2, 0x2, 0x267, 0x2a4, 
       0x7, 0x2c, 0x2, 0x2, 0x268, 0x269, 0x7, 0x2c, 0x2, 0x2, 0x269, 0x2a4, 
       0x9, 0x3, 0x2, 0x2, 0x26a, 0x26b, 0x7, 0x2c, 0x2, 0x2, 0x26b, 0x2a4, 
       0x7, 0x29, 0x2, 0x2, 0x26c, 0x26d, 0x7, 0x2c, 0x2, 0x2, 0x26d, 0x26e, 
       0x7, 0x29, 0x2, 0x2, 0x26e, 0x2a4, 0x9, 0x3, 0x2, 0x2, 0x26f, 0x2a4, 
       0x5, 0x2e, 0x18, 0x2, 0x270, 0x271, 0x5, 0x2e, 0x18, 0x2, 0x271, 
       0x272, 0x9, 0x3, 0x2, 0x2, 0x272, 0x2a4, 0x3, 0x2, 0x2, 0x2, 0x273, 
       0x274, 0x5, 0x2e, 0x18, 0x2, 0x274, 0x275, 0x7, 0x29, 0x2, 0x2, 0x275, 
       0x2a4, 0x3, 0x2, 0x2, 0x2, 0x276, 0x277, 0x5, 0x2e, 0x18, 0x2, 0x277, 
       0x278, 0x7, 0x29, 0x2, 0x2, 0x278, 0x279, 0x9, 0x3, 0x2, 0x2, 0x279, 
       0x2a4, 0x3, 0x2, 0x2, 0x2, 0x27a, 0x27b, 0x7, 0x27, 0x2, 0x2, 0x27b, 
       0x27c, 0x7, 0x18, 0x2, 0x2, 0x27c, 0x2a4, 0x5, 0x2e, 0x18, 0x2, 0x27d, 
       0x27e, 0x7, 0x27, 0x2, 0x2, 0x27e, 0x27f, 0x7, 0x18, 0x2, 0x2, 0x27f, 
       0x280, 0x5, 0x2e, 0x18, 0x2, 0x280, 0x281, 0x9, 0x3, 0x2, 0x2, 0x281, 
       0x2a4, 0x3, 0x2, 0x2, 0x2, 0x282, 0x283, 0x7, 0x27, 0x2, 0x2, 0x283, 
       0x284, 0x7, 0x18, 0x2, 0x2, 0x284, 0x285, 0x5, 0x2e, 0x18, 0x2, 0x285, 
       0x286, 0x7, 0x29, 0x2, 0x2, 0x286, 0x2a4, 0x3, 0x2, 0x2, 0x2, 0x287, 
       0x288, 0x7, 0x27, 0x2, 0x2, 0x288, 0x289, 0x7, 0x18, 0x2, 0x2, 0x289, 
       0x28a, 0x5, 0x2e, 0x18, 0x2, 0x28a, 0x28b, 0x7, 0x29, 0x2, 0x2, 0x28b, 
       0x28c, 0x9, 0x3, 0x2, 0x2, 0x28c, 0x2a4, 0x3, 0x2, 0x2, 0x2, 0x28d, 
       0x2a4, 0x5, 0x22, 0x12, 0x2, 0x28e, 0x28f, 0x5, 0x22, 0x12, 0x2, 
       0x28f, 0x290, 0x9, 0x3, 0x2, 0x2, 0x290, 0x2a4, 0x3, 0x2, 0x2, 0x2, 
       0x291, 0x292, 0x5, 0x22, 0x12, 0x2, 0x292, 0x293, 0x7, 0x29, 0x2, 
       0x2, 0x293, 0x2a4, 0x3, 0x2, 0x2, 0x2, 0x294, 0x295, 0x5, 0x22, 0x12, 
       0x2, 0x295, 0x296, 0x7, 0x29, 0x2, 0x2, 0x296, 0x297, 0x9, 0x3, 0x2, 
       0x2, 0x297, 0x2a4, 0x3, 0x2, 0x2, 0x2, 0x298, 0x2a4, 0x5, 0x84, 0x43, 
       0x2, 0x299, 0x29a, 0x5, 0x84, 0x43, 0x2, 0x29a, 0x29b, 0x9, 0x3, 
       0x2, 0x2, 0x29b, 0x2a4, 0x3, 0x2, 0x2, 0x2, 0x29c, 0x29d, 0x5, 0x84, 
       0x43, 0x2, 0x29d, 0x29e, 0x7, 0x29, 0x2, 0x2, 0x29e, 0x2a4, 0x3, 
       0x2, 0x2, 0x2, 0x29f, 0x2a0, 0x5, 0x84, 0x43, 0x2, 0x2a0, 0x2a1, 
       0x7, 0x29, 0x2, 0x2, 0x2a1, 0x2a2, 0x9, 0x3, 0x2, 0x2, 0x2a2, 0x2a4, 
       0x3, 0x2, 0x2, 0x2, 0x2a3, 0x238, 0x3, 0x2, 0x2, 0x2, 0x2a3, 0x239, 
       0x3, 0x2, 0x2, 0x2, 0x2a3, 0x23b, 0x3, 0x2, 0x2, 0x2, 0x2a3, 0x23d, 
       0x3, 0x2, 0x2, 0x2, 0x2a3, 0x240, 0x3, 0x2, 0x2, 0x2, 0x2a3, 0x243, 
       0x3, 0x2, 0x2, 0x2, 0x2a3, 0x247, 0x3, 0x2, 0x2, 0x2, 0x2a3, 0x24b, 
       0x3, 0x2, 0x2, 0x2, 0x2a3, 0x250, 0x3, 0x2, 0x2, 0x2, 0x2a3, 0x252, 
       0x3, 0x2, 0x2, 0x2, 0x2a3, 0x256, 0x3, 0x2, 0x2, 0x2, 0x2a3, 0x25a, 
       0x3, 0x2, 0x2, 0x2, 0x2a3, 0x25f, 0x3, 0x2, 0x2, 0x2, 0x2a3, 0x260, 
       0x3, 0x2, 0x2, 0x2, 0x2a3, 0x262, 0x3, 0x2, 0x2, 0x2, 0x2a3, 0x264, 
       0x3, 0x2, 0x2, 0x2, 0x2a3, 0x267, 0x3, 0x2, 0x2, 0x2, 0x2a3, 0x268, 
       0x3, 0x2, 0x2, 0x2, 0x2a3, 0x26a, 0x3, 0x2, 0x2, 0x2, 0x2a3, 0x26c, 
       0x3, 0x2, 0x2, 0x2, 0x2a3, 0x26f, 0x3, 0x2, 0x2, 0x2, 0x2a3, 0x270, 
       0x3, 0x2, 0x2, 0x2, 0x2a3, 0x273, 0x3, 0x2, 0x2, 0x2, 0x2a3, 0x276, 
       0x3, 0x2, 0x2, 0x2, 0x2a3, 0x27a, 0x3, 0x2, 0x2, 0x2, 0x2a3, 0x27d, 
       0x3, 0x2, 0x2, 0x2, 0x2a3, 0x282, 0x3, 0x2, 0x2, 0x2, 0x2a3, 0x287, 
       0x3, 0x2, 0x2, 0x2, 0x2a3, 0x28d, 0x3, 0x2, 0x2, 0x2, 0x2a3, 0x28e, 
       0x3, 0x2, 0x2, 0x2, 0x2a3, 0x291, 0x3, 0x2, 0x2, 0x2, 0x2a3, 0x294, 
       0x3, 0x2, 0x2, 0x2, 0x2a3, 0x298, 0x3, 0x2, 0x2, 0x2, 0x2a3, 0x299, 
       0x3, 0x2, 0x2, 0x2, 0x2a3, 0x29c, 0x3, 0x2, 0x2, 0x2, 0x2a3, 0x29f, 
       0x3, 0x2, 0x2, 0x2, 0x2a4, 0x4b, 0x3, 0x2, 0x2, 0x2, 0x2a5, 0x2a6, 
       0x7, 0x8, 0x2, 0x2, 0x2a6, 0x2a7, 0x5, 0x4e, 0x28, 0x2, 0x2a7, 0x2a8, 
       0x7, 0x1f, 0x2, 0x2, 0x2a8, 0x2a9, 0x7, 0x20, 0x2, 0x2, 0x2a9, 0x2b9, 
       0x3, 0x2, 0x2, 0x2, 0x2aa, 0x2ab, 0x7, 0x8, 0x2, 0x2, 0x2ab, 0x2ac, 
       0x5, 0x4e, 0x28, 0x2, 0x2ac, 0x2ad, 0x7, 0x1f, 0x2, 0x2, 0x2ad, 0x2ae, 
       0x5, 0x58, 0x2d, 0x2, 0x2ae, 0x2af, 0x7, 0x20, 0x2, 0x2, 0x2af, 0x2b9, 
       0x3, 0x2, 0x2, 0x2, 0x2b0, 0x2b1, 0x7, 0x8, 0x2, 0x2, 0x2b1, 0x2b2, 
       0x5, 0x4e, 0x28, 0x2, 0x2b2, 0x2b3, 0x5, 0x2c, 0x17, 0x2, 0x2b3, 
       0x2b9, 0x3, 0x2, 0x2, 0x2, 0x2b4, 0x2b5, 0x7, 0x8, 0x2, 0x2, 0x2b5, 
       0x2b6, 0x5, 0x4e, 0x28, 0x2, 0x2b6, 0x2b7, 0x5, 0x5a, 0x2e, 0x2, 
       0x2b7, 0x2b9, 0x3, 0x2, 0x2, 0x2, 0x2b8, 0x2a5, 0x3, 0x2, 0x2, 0x2, 
       0x2b8, 0x2aa, 0x3, 0x2, 0x2, 0x2, 0x2b8, 0x2b0, 0x3, 0x2, 0x2, 0x2, 
       0x2b8, 0x2b4, 0x3, 0x2, 0x2, 0x2, 0x2b9, 0x4d, 0x3, 0x2, 0x2, 0x2, 
       0x2ba, 0x2bb, 0x7, 0x21, 0x2, 0x2, 0x2bb, 0x2bc, 0x5, 0x50, 0x29, 
       0x2, 0x2bc, 0x2bd, 0x7, 0x17, 0x2, 0x2, 0x2bd, 0x2be, 0x5, 0x52, 
       0x2a, 0x2, 0x2be, 0x2bf, 0x7, 0x17, 0x2, 0x2, 0x2bf, 0x2c0, 0x5, 
       0x54, 0x2b, 0x2, 0x2c0, 0x2c1, 0x7, 0x22, 0x2, 0x2, 0x2c1, 0x2cd, 
       0x3, 0x2, 0x2, 0x2, 0x2c2, 0x2c3, 0x5, 0x50, 0x29, 0x2, 0x2c3, 0x2c4, 
       0x7, 0x17, 0x2, 0x2, 0x2c4, 0x2c5, 0x5, 0x52, 0x2a, 0x2, 0x2c5, 0x2c6, 
       0x7, 0x17, 0x2, 0x2, 0x2c6, 0x2c7, 0x5, 0x54, 0x2b, 0x2, 0x2c7, 0x2cd, 
       0x3, 0x2, 0x2, 0x2, 0x2c8, 0x2cd, 0x5, 0x44, 0x23, 0x2, 0x2c9, 0x2ca, 
       0x7, 0x21, 0x2, 0x2, 0x2ca, 0x2cd, 0x7, 0x22, 0x2, 0x2, 0x2cb, 0x2cd, 
       0x3, 0x2, 0x2, 0x2, 0x2cc, 0x2ba, 0x3, 0x2, 0x2, 0x2, 0x2cc, 0x2c2, 
       0x3, 0x2, 0x2, 0x2, 0x2cc, 0x2c8, 0x3, 0x2, 0x2, 0x2, 0x2cc, 0x2c9, 
       0x3, 0x2, 0x2, 0x2, 0x2cc, 0x2cb, 0x3, 0x2, 0x2, 0x2, 0x2cd, 0x4f, 
       0x3, 0x2, 0x2, 0x2, 0x2ce, 0x2d1, 0x5, 0x14, 0xb, 0x2, 0x2cf, 0x2d1, 
       0x3, 0x2, 0x2, 0x2, 0x2d0, 0x2ce, 0x3, 0x2, 0x2, 0x2, 0x2d0, 0x2cf, 
       0x3, 0x2, 0x2, 0x2, 0x2d1, 0x51, 0x3, 0x2, 0x2, 0x2, 0x2d2, 0x2d5, 
       0x5, 0x44, 0x23, 0x2, 0x2d3, 0x2d5, 0x3, 0x2, 0x2, 0x2, 0x2d4, 0x2d2, 
       0x3, 0x2, 0x2, 0x2, 0x2d4, 0x2d3, 0x3, 0x2, 0x2, 0x2, 0x2d5, 0x53, 
       0x3, 0x2, 0x2, 0x2, 0x2d6, 0x2d9, 0x5, 0x56, 0x2c, 0x2, 0x2d7, 0x2d9, 
       0x3, 0x2, 0x2, 0x2, 0x2d8, 0x2d6, 0x3, 0x2, 0x2, 0x2, 0x2d8, 0x2d7, 
       0x3, 0x2, 0x2, 0x2, 0x2d9, 0x55, 0x3, 0x2, 0x2, 0x2, 0x2da, 0x2e5, 
       0x5, 0x24, 0x13, 0x2, 0x2db, 0x2e5, 0x5, 0x22, 0x12, 0x2, 0x2dc, 
       0x2dd, 0x5, 0x24, 0x13, 0x2, 0x2dd, 0x2de, 0x7, 0x1c, 0x2, 0x2, 0x2de, 
       0x2df, 0x5, 0x56, 0x2c, 0x2, 0x2df, 0x2e5, 0x3, 0x2, 0x2, 0x2, 0x2e0, 
       0x2e1, 0x5, 0x22, 0x12, 0x2, 0x2e1, 0x2e2, 0x7, 0x1c, 0x2, 0x2, 0x2e2, 
       0x2e3, 0x5, 0x56, 0x2c, 0x2, 0x2e3, 0x2e5, 0x3, 0x2, 0x2, 0x2, 0x2e4, 
       0x2da, 0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2db, 0x3, 0x2, 0x2, 0x2, 0x2e4, 
       0x2dc, 0x3, 0x2, 0x2, 0x2, 0x2e4, 0x2e0, 0x3, 0x2, 0x2, 0x2, 0x2e5, 
       0x57, 0x3, 0x2, 0x2, 0x2, 0x2e6, 0x2eb, 0x5, 0x6, 0x4, 0x2, 0x2e7, 
       0x2e8, 0x5, 0x6, 0x4, 0x2, 0x2e8, 0x2e9, 0x5, 0x58, 0x2d, 0x2, 0x2e9, 
       0x2eb, 0x3, 0x2, 0x2, 0x2, 0x2ea, 0x2e6, 0x3, 0x2, 0x2, 0x2, 0x2ea, 
       0x2e7, 0x3, 0x2, 0x2, 0x2, 0x2eb, 0x59, 0x3, 0x2, 0x2, 0x2, 0x2ec, 
       0x2f6, 0x5, 0x3c, 0x1f, 0x2, 0x2ed, 0x2ee, 0x5, 0x3c, 0x1f, 0x2, 
       0x2ee, 0x2ef, 0x5, 0x5a, 0x2e, 0x2, 0x2ef, 0x2f6, 0x3, 0x2, 0x2, 
       0x2, 0x2f0, 0x2f6, 0x5, 0x4c, 0x27, 0x2, 0x2f1, 0x2f2, 0x5, 0x4c, 
       0x27, 0x2, 0x2f2, 0x2f3, 0x5, 0x5a, 0x2e, 0x2, 0x2f3, 0x2f6, 0x3, 
       0x2, 0x2, 0x2, 0x2f4, 0x2f6, 0x5, 0x5c, 0x2f, 0x2, 0x2f5, 0x2ec, 
       0x3, 0x2, 0x2, 0x2, 0x2f5, 0x2ed, 0x3, 0x2, 0x2, 0x2, 0x2f5, 0x2f0, 
       0x3, 0x2, 0x2, 0x2, 0x2f5, 0x2f1, 0x3, 0x2, 0x2, 0x2, 0x2f5, 0x2f4, 
       0x3, 0x2, 0x2, 0x2, 0x2f6, 0x5b, 0x3, 0x2, 0x2, 0x2, 0x2f7, 0x2f8, 
       0x7, 0x9, 0x2, 0x2, 0x2f8, 0x2f9, 0x5, 0x5e, 0x30, 0x2, 0x2f9, 0x2fa, 
       0x7, 0x17, 0x2, 0x2, 0x2fa, 0x5d, 0x3, 0x2, 0x2, 0x2, 0x2fb, 0x2ff, 
       0x5, 0x8a, 0x46, 0x2, 0x2fc, 0x2ff, 0x5, 0x24, 0x13, 0x2, 0x2fd, 
       0x2ff, 0x5, 0x22, 0x12, 0x2, 0x2fe, 0x2fb, 0x3, 0x2, 0x2, 0x2, 0x2fe, 
       0x2fc, 0x3, 0x2, 0x2, 0x2, 0x2fe, 0x2fd, 0x3, 0x2, 0x2, 0x2, 0x2ff, 
       0x5f, 0x3, 0x2, 0x2, 0x2, 0x300, 0x301, 0x5, 0x64, 0x33, 0x2, 0x301, 
       0x302, 0x7, 0x1f, 0x2, 0x2, 0x302, 0x303, 0x7, 0x20, 0x2, 0x2, 0x303, 
       0x31f, 0x3, 0x2, 0x2, 0x2, 0x304, 0x305, 0x5, 0x64, 0x33, 0x2, 0x305, 
       0x306, 0x7, 0x1f, 0x2, 0x2, 0x306, 0x307, 0x5, 0x6e, 0x38, 0x2, 0x307, 
       0x308, 0x7, 0x20, 0x2, 0x2, 0x308, 0x31f, 0x3, 0x2, 0x2, 0x2, 0x309, 
       0x30a, 0x5, 0x66, 0x34, 0x2, 0x30a, 0x30b, 0x7, 0x1f, 0x2, 0x2, 0x30b, 
       0x30c, 0x7, 0x20, 0x2, 0x2, 0x30c, 0x31f, 0x3, 0x2, 0x2, 0x2, 0x30d, 
       0x30e, 0x5, 0x66, 0x34, 0x2, 0x30e, 0x30f, 0x7, 0x1f, 0x2, 0x2, 0x30f, 
       0x310, 0x5, 0x6e, 0x38, 0x2, 0x310, 0x311, 0x7, 0x20, 0x2, 0x2, 0x311, 
       0x31f, 0x3, 0x2, 0x2, 0x2, 0x312, 0x313, 0x5, 0x6a, 0x36, 0x2, 0x313, 
       0x314, 0x7, 0x1f, 0x2, 0x2, 0x314, 0x315, 0x7, 0x20, 0x2, 0x2, 0x315, 
       0x31f, 0x3, 0x2, 0x2, 0x2, 0x316, 0x317, 0x5, 0x6a, 0x36, 0x2, 0x317, 
       0x318, 0x7, 0x1f, 0x2, 0x2, 0x318, 0x319, 0x5, 0x6e, 0x38, 0x2, 0x319, 
       0x31a, 0x7, 0x20, 0x2, 0x2, 0x31a, 0x31f, 0x3, 0x2, 0x2, 0x2, 0x31b, 
       0x31c, 0x5, 0x6c, 0x37, 0x2, 0x31c, 0x31d, 0x7, 0x17, 0x2, 0x2, 0x31d, 
       0x31f, 0x3, 0x2, 0x2, 0x2, 0x31e, 0x300, 0x3, 0x2, 0x2, 0x2, 0x31e, 
       0x304, 0x3, 0x2, 0x2, 0x2, 0x31e, 0x309, 0x3, 0x2, 0x2, 0x2, 0x31e, 
       0x30d, 0x3, 0x2, 0x2, 0x2, 0x31e, 0x312, 0x3, 0x2, 0x2, 0x2, 0x31e, 
       0x316, 0x3, 0x2, 0x2, 0x2, 0x31e, 0x31b, 0x3, 0x2, 0x2, 0x2, 0x31f, 
       0x61, 0x3, 0x2, 0x2, 0x2, 0x320, 0x321, 0x7, 0xa, 0x2, 0x2, 0x321, 
       0x322, 0x7, 0x27, 0x2, 0x2, 0x322, 0x323, 0x7, 0x21, 0x2, 0x2, 0x323, 
       0x339, 0x7, 0x22, 0x2, 0x2, 0x324, 0x325, 0x7, 0xa, 0x2, 0x2, 0x325, 
       0x326, 0x7, 0x27, 0x2, 0x2, 0x326, 0x327, 0x7, 0x21, 0x2, 0x2, 0x327, 
       0x328, 0x7, 0x22, 0x2, 0x2, 0x328, 0x329, 0x7, 0x16, 0x2, 0x2, 0x329, 
       0x339, 0x7, 0x27, 0x2, 0x2, 0x32a, 0x32b, 0x7, 0xa, 0x2, 0x2, 0x32b, 
       0x32c, 0x7, 0x27, 0x2, 0x2, 0x32c, 0x32d, 0x7, 0x21, 0x2, 0x2, 0x32d, 
       0x32e, 0x5, 0x70, 0x39, 0x2, 0x32e, 0x32f, 0x7, 0x22, 0x2, 0x2, 0x32f, 
       0x339, 0x3, 0x2, 0x2, 0x2, 0x330, 0x331, 0x7, 0xa, 0x2, 0x2, 0x331, 
       0x332, 0x7, 0x27, 0x2, 0x2, 0x332, 0x333, 0x7, 0x21, 0x2, 0x2, 0x333, 
       0x334, 0x5, 0x70, 0x39, 0x2, 0x334, 0x335, 0x7, 0x22, 0x2, 0x2, 0x335, 
       0x336, 0x7, 0x16, 0x2, 0x2, 0x336, 0x337, 0x7, 0x27, 0x2, 0x2, 0x337, 
       0x339, 0x3, 0x2, 0x2, 0x2, 0x338, 0x320, 0x3, 0x2, 0x2, 0x2, 0x338, 
       0x324, 0x3, 0x2, 0x2, 0x2, 0x338, 0x32a, 0x3, 0x2, 0x2, 0x2, 0x338, 
       0x330, 0x3, 0x2, 0x2, 0x2, 0x339, 0x63, 0x3, 0x2, 0x2, 0x2, 0x33a, 
       0x33b, 0x5, 0x62, 0x32, 0x2, 0x33b, 0x65, 0x3, 0x2, 0x2, 0x2, 0x33c, 
       0x33d, 0x5, 0x68, 0x35, 0x2, 0x33d, 0x33e, 0x5, 0x62, 0x32, 0x2, 
       0x33e, 0x354, 0x3, 0x2, 0x2, 0x2, 0x33f, 0x340, 0x7, 0xe, 0x2, 0x2, 
       0x340, 0x354, 0x5, 0x62, 0x32, 0x2, 0x341, 0x342, 0x5, 0x68, 0x35, 
       0x2, 0x342, 0x343, 0x7, 0xe, 0x2, 0x2, 0x343, 0x344, 0x5, 0x62, 0x32, 
       0x2, 0x344, 0x354, 0x3, 0x2, 0x2, 0x2, 0x345, 0x346, 0x7, 0xf, 0x2, 
       0x2, 0x346, 0x347, 0x5, 0x68, 0x35, 0x2, 0x347, 0x348, 0x7, 0xe, 
       0x2, 0x2, 0x348, 0x349, 0x5, 0x62, 0x32, 0x2, 0x349, 0x354, 0x3, 
       0x2, 0x2, 0x2, 0x34a, 0x34b, 0x7, 0xf, 0x2, 0x2, 0x34b, 0x34c, 0x5, 
       0x68, 0x35, 0x2, 0x34c, 0x34d, 0x5, 0x62, 0x32, 0x2, 0x34d, 0x354, 
       0x3, 0x2, 0x2, 0x2, 0x34e, 0x34f, 0x7, 0xf, 0x2, 0x2, 0x34f, 0x354, 
       0x5, 0x62, 0x32, 0x2, 0x350, 0x351, 0x7, 0xf, 0x2, 0x2, 0x351, 0x352, 
       0x7, 0xe, 0x2, 0x2, 0x352, 0x354, 0x5, 0x62, 0x32, 0x2, 0x353, 0x33c, 
       0x3, 0x2, 0x2, 0x2, 0x353, 0x33f, 0x3, 0x2, 0x2, 0x2, 0x353, 0x341, 
       0x3, 0x2, 0x2, 0x2, 0x353, 0x345, 0x3, 0x2, 0x2, 0x2, 0x353, 0x34a, 
       0x3, 0x2, 0x2, 0x2, 0x353, 0x34e, 0x3, 0x2, 0x2, 0x2, 0x353, 0x350, 
       0x3, 0x2, 0x2, 0x2, 0x354, 0x67, 0x3, 0x2, 0x2, 0x2, 0x355, 0x356, 
       0x9, 0x4, 0x2, 0x2, 0x356, 0x69, 0x3, 0x2, 0x2, 0x2, 0x357, 0x358, 
       0x7, 0x27, 0x2, 0x2, 0x358, 0x359, 0x7, 0x21, 0x2, 0x2, 0x359, 0x360, 
       0x7, 0x22, 0x2, 0x2, 0x35a, 0x35b, 0x7, 0x27, 0x2, 0x2, 0x35b, 0x35c, 
       0x7, 0x21, 0x2, 0x2, 0x35c, 0x35d, 0x5, 0x70, 0x39, 0x2, 0x35d, 0x35e, 
       0x7, 0x22, 0x2, 0x2, 0x35e, 0x360, 0x3, 0x2, 0x2, 0x2, 0x35f, 0x357, 
       0x3, 0x2, 0x2, 0x2, 0x35f, 0x35a, 0x3, 0x2, 0x2, 0x2, 0x360, 0x6b, 
       0x3, 0x2, 0x2, 0x2, 0x361, 0x364, 0x5, 0x64, 0x33, 0x2, 0x362, 0x364, 
       0x5, 0x66, 0x34, 0x2, 0x363, 0x361, 0x3, 0x2, 0x2, 0x2, 0x363, 0x362, 
       0x3, 0x2, 0x2, 0x2, 0x364, 0x6d, 0x3, 0x2, 0x2, 0x2, 0x365, 0x36a, 
       0x5, 0x6, 0x4, 0x2, 0x366, 0x367, 0x5, 0x6, 0x4, 0x2, 0x367, 0x368, 
       0x5, 0x6e, 0x38, 0x2, 0x368, 0x36a, 0x3, 0x2, 0x2, 0x2, 0x369, 0x365, 
       0x3, 0x2, 0x2, 0x2, 0x369, 0x366, 0x3, 0x2, 0x2, 0x2, 0x36a, 0x6f, 
       0x3, 0x2, 0x2, 0x2, 0x36b, 0x371, 0x5, 0x72, 0x3a, 0x2, 0x36c, 0x36d, 
       0x5, 0x72, 0x3a, 0x2, 0x36d, 0x36e, 0x7, 0x1c, 0x2, 0x2, 0x36e, 0x36f, 
       0x5, 0x70, 0x39, 0x2, 0x36f, 0x371, 0x3, 0x2, 0x2, 0x2, 0x370, 0x36b, 
       0x3, 0x2, 0x2, 0x2, 0x370, 0x36c, 0x3, 0x2, 0x2, 0x2, 0x371, 0x71, 
       0x3, 0x2, 0x2, 0x2, 0x372, 0x373, 0x7, 0x27, 0x2, 0x2, 0x373, 0x374, 
       0x7, 0x29, 0x2, 0x2, 0x374, 0x73, 0x3, 0x2, 0x2, 0x2, 0x375, 0x379, 
       0x5, 0x76, 0x3c, 0x2, 0x376, 0x379, 0x5, 0x7a, 0x3e, 0x2, 0x377, 
       0x379, 0x5, 0x7e, 0x40, 0x2, 0x378, 0x375, 0x3, 0x2, 0x2, 0x2, 0x378, 
       0x376, 0x3, 0x2, 0x2, 0x2, 0x378, 0x377, 0x3, 0x2, 0x2, 0x2, 0x379, 
       0x75, 0x3, 0x2, 0x2, 0x2, 0x37a, 0x37b, 0x5, 0x78, 0x3d, 0x2, 0x37b, 
       0x77, 0x3, 0x2, 0x2, 0x2, 0x37c, 0x37d, 0x7, 0x10, 0x2, 0x2, 0x37d, 
       0x37e, 0x7, 0x27, 0x2, 0x2, 0x37e, 0x37f, 0x7, 0x1f, 0x2, 0x2, 0x37f, 
       0x395, 0x7, 0x20, 0x2, 0x2, 0x380, 0x381, 0x7, 0x10, 0x2, 0x2, 0x381, 
       0x382, 0x7, 0x27, 0x2, 0x2, 0x382, 0x383, 0x7, 0x1f, 0x2, 0x2, 0x383, 
       0x384, 0x5, 0x6e, 0x38, 0x2, 0x384, 0x385, 0x7, 0x20, 0x2, 0x2, 0x385, 
       0x395, 0x3, 0x2, 0x2, 0x2, 0x386, 0x387, 0x7, 0x10, 0x2, 0x2, 0x387, 
       0x388, 0x7, 0x27, 0x2, 0x2, 0x388, 0x389, 0x7, 0x12, 0x2, 0x2, 0x389, 
       0x38a, 0x7, 0x27, 0x2, 0x2, 0x38a, 0x38b, 0x7, 0x1f, 0x2, 0x2, 0x38b, 
       0x395, 0x7, 0x20, 0x2, 0x2, 0x38c, 0x38d, 0x7, 0x10, 0x2, 0x2, 0x38d, 
       0x38e, 0x7, 0x27, 0x2, 0x2, 0x38e, 0x38f, 0x7, 0x12, 0x2, 0x2, 0x38f, 
       0x390, 0x7, 0x27, 0x2, 0x2, 0x390, 0x391, 0x7, 0x1f, 0x2, 0x2, 0x391, 
       0x392, 0x5, 0x6e, 0x38, 0x2, 0x392, 0x393, 0x7, 0x20, 0x2, 0x2, 0x393, 
       0x395, 0x3, 0x2, 0x2, 0x2, 0x394, 0x37c, 0x3, 0x2, 0x2, 0x2, 0x394, 
       0x380, 0x3, 0x2, 0x2, 0x2, 0x394, 0x386, 0x3, 0x2, 0x2, 0x2, 0x394, 
       0x38c, 0x3, 0x2, 0x2, 0x2, 0x395, 0x79, 0x3, 0x2, 0x2, 0x2, 0x396, 
       0x397, 0x5, 0x7c, 0x3f, 0x2, 0x397, 0x7b, 0x3, 0x2, 0x2, 0x2, 0x398, 
       0x399, 0x7, 0x11, 0x2, 0x2, 0x399, 0x39a, 0x7, 0x27, 0x2, 0x2, 0x39a, 
       0x39b, 0x7, 0x1f, 0x2, 0x2, 0x39b, 0x3b1, 0x7, 0x20, 0x2, 0x2, 0x39c, 
       0x39d, 0x7, 0x11, 0x2, 0x2, 0x39d, 0x39e, 0x7, 0x27, 0x2, 0x2, 0x39e, 
       0x39f, 0x7, 0x1f, 0x2, 0x2, 0x39f, 0x3a0, 0x5, 0x6e, 0x38, 0x2, 0x3a0, 
       0x3a1, 0x7, 0x20, 0x2, 0x2, 0x3a1, 0x3b1, 0x3, 0x2, 0x2, 0x2, 0x3a2, 
       0x3a3, 0x7, 0x11, 0x2, 0x2, 0x3a3, 0x3a4, 0x7, 0x27, 0x2, 0x2, 0x3a4, 
       0x3a5, 0x7, 0x12, 0x2, 0x2, 0x3a5, 0x3a6, 0x7, 0x27, 0x2, 0x2, 0x3a6, 
       0x3a7, 0x7, 0x1f, 0x2, 0x2, 0x3a7, 0x3b1, 0x7, 0x20, 0x2, 0x2, 0x3a8, 
       0x3a9, 0x7, 0x11, 0x2, 0x2, 0x3a9, 0x3aa, 0x7, 0x27, 0x2, 0x2, 0x3aa, 
       0x3ab, 0x7, 0x12, 0x2, 0x2, 0x3ab, 0x3ac, 0x7, 0x27, 0x2, 0x2, 0x3ac, 
       0x3ad, 0x7, 0x1f, 0x2, 0x2, 0x3ad, 0x3ae, 0x5, 0x6e, 0x38, 0x2, 0x3ae, 
       0x3af, 0x7, 0x20, 0x2, 0x2, 0x3af, 0x3b1, 0x3, 0x2, 0x2, 0x2, 0x3b0, 
       0x398, 0x3, 0x2, 0x2, 0x2, 0x3b0, 0x39c, 0x3, 0x2, 0x2, 0x2, 0x3b0, 
       0x3a2, 0x3, 0x2, 0x2, 0x2, 0x3b0, 0x3a8, 0x3, 0x2, 0x2, 0x2, 0x3b1, 
       0x7d, 0x3, 0x2, 0x2, 0x2, 0x3b2, 0x3b3, 0x5, 0x80, 0x41, 0x2, 0x3b3, 
       0x3b4, 0x7, 0x1f, 0x2, 0x2, 0x3b4, 0x3b5, 0x7, 0x20, 0x2, 0x2, 0x3b5, 
       0x3bc, 0x3, 0x2, 0x2, 0x2, 0x3b6, 0x3b7, 0x5, 0x80, 0x41, 0x2, 0x3b7, 
       0x3b8, 0x7, 0x1f, 0x2, 0x2, 0x3b8, 0x3b9, 0x5, 0x6e, 0x38, 0x2, 0x3b9, 
       0x3ba, 0x7, 0x20, 0x2, 0x2, 0x3ba, 0x3bc, 0x3, 0x2, 0x2, 0x2, 0x3bb, 
       0x3b2, 0x3, 0x2, 0x2, 0x2, 0x3bb, 0x3b6, 0x3, 0x2, 0x2, 0x2, 0x3bc, 
       0x7f, 0x3, 0x2, 0x2, 0x2, 0x3bd, 0x3c1, 0x5, 0x82, 0x42, 0x2, 0x3be, 
       0x3bf, 0x7, 0xf, 0x2, 0x2, 0x3bf, 0x3c1, 0x5, 0x82, 0x42, 0x2, 0x3c0, 
       0x3bd, 0x3, 0x2, 0x2, 0x2, 0x3c0, 0x3be, 0x3, 0x2, 0x2, 0x2, 0x3c1, 
       0x81, 0x3, 0x2, 0x2, 0x2, 0x3c2, 0x3c3, 0x7, 0x13, 0x2, 0x2, 0x3c3, 
       0x3d3, 0x7, 0x27, 0x2, 0x2, 0x3c4, 0x3c5, 0x7, 0x13, 0x2, 0x2, 0x3c5, 
       0x3c6, 0x7, 0x27, 0x2, 0x2, 0x3c6, 0x3c7, 0x7, 0x12, 0x2, 0x2, 0x3c7, 
       0x3d3, 0x7, 0x27, 0x2, 0x2, 0x3c8, 0x3c9, 0x7, 0x13, 0x2, 0x2, 0x3c9, 
       0x3ca, 0x7, 0x27, 0x2, 0x2, 0x3ca, 0x3cb, 0x7, 0x14, 0x2, 0x2, 0x3cb, 
       0x3d3, 0x7, 0x27, 0x2, 0x2, 0x3cc, 0x3cd, 0x7, 0x13, 0x2, 0x2, 0x3cd, 
       0x3ce, 0x7, 0x27, 0x2, 0x2, 0x3ce, 0x3cf, 0x7, 0x12, 0x2, 0x2, 0x3cf, 
       0x3d0, 0x7, 0x27, 0x2, 0x2, 0x3d0, 0x3d1, 0x7, 0x14, 0x2, 0x2, 0x3d1, 
       0x3d3, 0x7, 0x27, 0x2, 0x2, 0x3d2, 0x3c2, 0x3, 0x2, 0x2, 0x2, 0x3d2, 
       0x3c4, 0x3, 0x2, 0x2, 0x2, 0x3d2, 0x3c8, 0x3, 0x2, 0x2, 0x2, 0x3d2, 
       0x3cc, 0x3, 0x2, 0x2, 0x2, 0x3d3, 0x83, 0x3, 0x2, 0x2, 0x2, 0x3d4, 
       0x3e0, 0x7, 0x27, 0x2, 0x2, 0x3d5, 0x3d6, 0x7, 0x27, 0x2, 0x2, 0x3d6, 
       0x3d7, 0x7, 0x19, 0x2, 0x2, 0x3d7, 0x3e0, 0x5, 0x84, 0x43, 0x2, 0x3d8, 
       0x3d9, 0x7, 0x27, 0x2, 0x2, 0x3d9, 0x3e0, 0x5, 0x86, 0x44, 0x2, 0x3da, 
       0x3db, 0x7, 0x27, 0x2, 0x2, 0x3db, 0x3dc, 0x5, 0x86, 0x44, 0x2, 0x3dc, 
       0x3dd, 0x7, 0x19, 0x2, 0x2, 0x3dd, 0x3de, 0x5, 0x84, 0x43, 0x2, 0x3de, 
       0x3e0, 0x3, 0x2, 0x2, 0x2, 0x3df, 0x3d4, 0x3, 0x2, 0x2, 0x2, 0x3df, 
       0x3d5, 0x3, 0x2, 0x2, 0x2, 0x3df, 0x3d8, 0x3, 0x2, 0x2, 0x2, 0x3df, 
       0x3da, 0x3, 0x2, 0x2, 0x2, 0x3e0, 0x85, 0x3, 0x2, 0x2, 0x2, 0x3e1, 
       0x3e2, 0x7, 0x1d, 0x2, 0x2, 0x3e2, 0x3e3, 0x5, 0x88, 0x45, 0x2, 0x3e3, 
       0x3e4, 0x7, 0x1e, 0x2, 0x2, 0x3e4, 0x3eb, 0x3, 0x2, 0x2, 0x2, 0x3e5, 
       0x3e6, 0x7, 0x1d, 0x2, 0x2, 0x3e6, 0x3e7, 0x5, 0x88, 0x45, 0x2, 0x3e7, 
       0x3e8, 0x7, 0x1e, 0x2, 0x2, 0x3e8, 0x3e9, 0x5, 0x86, 0x44, 0x2, 0x3e9, 
       0x3eb, 0x3, 0x2, 0x2, 0x2, 0x3ea, 0x3e1, 0x3, 0x2, 0x2, 0x2, 0x3ea, 
       0x3e5, 0x3, 0x2, 0x2, 0x2, 0x3eb, 0x87, 0x3, 0x2, 0x2, 0x2, 0x3ec, 
       0x3ef, 0x9, 0x5, 0x2, 0x2, 0x3ed, 0x3ef, 0x5, 0x24, 0x13, 0x2, 0x3ee, 
       0x3ec, 0x3, 0x2, 0x2, 0x2, 0x3ee, 0x3ed, 0x3, 0x2, 0x2, 0x2, 0x3ef, 
       0x89, 0x3, 0x2, 0x2, 0x2, 0x3f0, 0x408, 0x7, 0x27, 0x2, 0x2, 0x3f1, 
       0x3f2, 0x7, 0x27, 0x2, 0x2, 0x3f2, 0x408, 0x7, 0x29, 0x2, 0x2, 0x3f3, 
       0x408, 0x7, 0x2b, 0x2, 0x2, 0x3f4, 0x3f5, 0x7, 0x2b, 0x2, 0x2, 0x3f5, 
       0x408, 0x7, 0x29, 0x2, 0x2, 0x3f6, 0x408, 0x7, 0x2c, 0x2, 0x2, 0x3f7, 
       0x3f8, 0x7, 0x2c, 0x2, 0x2, 0x3f8, 0x408, 0x7, 0x29, 0x2, 0x2, 0x3f9, 
       0x408, 0x7, 0x2a, 0x2, 0x2, 0x3fa, 0x408, 0x5, 0x1a, 0xe, 0x2, 0x3fb, 
       0x408, 0x5, 0x1e, 0x10, 0x2, 0x3fc, 0x408, 0x5, 0x24, 0x13, 0x2, 
       0x3fd, 0x408, 0x5, 0x2e, 0x18, 0x2, 0x3fe, 0x3ff, 0x5, 0x8c, 0x47, 
       0x2, 0x3ff, 0x400, 0x7, 0x19, 0x2, 0x2, 0x400, 0x401, 0x5, 0x8e, 
       0x48, 0x2, 0x401, 0x408, 0x3, 0x2, 0x2, 0x2, 0x402, 0x403, 0x5, 0x8c, 
       0x47, 0x2, 0x403, 0x404, 0x7, 0x1b, 0x2, 0x2, 0x404, 0x405, 0x5, 
       0x8e, 0x48, 0x2, 0x405, 0x408, 0x3, 0x2, 0x2, 0x2, 0x406, 0x408, 
       0x5, 0x84, 0x43, 0x2, 0x407, 0x3f0, 0x3, 0x2, 0x2, 0x2, 0x407, 0x3f1, 
       0x3, 0x2, 0x2, 0x2, 0x407, 0x3f3, 0x3, 0x2, 0x2, 0x2, 0x407, 0x3f4, 
       0x3, 0x2, 0x2, 0x2, 0x407, 0x3f6, 0x3, 0x2, 0x2, 0x2, 0x407, 0x3f7, 
       0x3, 0x2, 0x2, 0x2, 0x407, 0x3f9, 0x3, 0x2, 0x2, 0x2, 0x407, 0x3fa, 
       0x3, 0x2, 0x2, 0x2, 0x407, 0x3fb, 0x3, 0x2, 0x2, 0x2, 0x407, 0x3fc, 
       0x3, 0x2, 0x2, 0x2, 0x407, 0x3fd, 0x3, 0x2, 0x2, 0x2, 0x407, 0x3fe, 
       0x3, 0x2, 0x2, 0x2, 0x407, 0x402, 0x3, 0x2, 0x2, 0x2, 0x407, 0x406, 
       0x3, 0x2, 0x2, 0x2, 0x408, 0x8b, 0x3, 0x2, 0x2, 0x2, 0x409, 0x40a, 
       0x7, 0x27, 0x2, 0x2, 0x40a, 0x8d, 0x3, 0x2, 0x2, 0x2, 0x40b, 0x40c, 
       0x7, 0x27, 0x2, 0x2, 0x40c, 0x8f, 0x3, 0x2, 0x2, 0x2, 0x36, 0x98, 
       0xa4, 0xb1, 0xe6, 0xed, 0xfe, 0x10c, 0x114, 0x11b, 0x123, 0x12e, 
       0x138, 0x192, 0x1ae, 0x1ba, 0x1c6, 0x1cb, 0x1d5, 0x1ea, 0x1ff, 0x20d, 
       0x218, 0x224, 0x22a, 0x235, 0x2a3, 0x2b8, 0x2cc, 0x2d0, 0x2d4, 0x2d8, 
       0x2e4, 0x2ea, 0x2f5, 0x2fe, 0x31e, 0x338, 0x353, 0x35f, 0x363, 0x369, 
       0x370, 0x378, 0x394, 0x3b0, 0x3bb, 0x3c0, 0x3d2, 0x3df, 0x3ea, 0x3ee, 
       0x407, 
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
