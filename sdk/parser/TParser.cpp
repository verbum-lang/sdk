
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
    setState(48);
    fileContent(0);
    setState(49);
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
    setState(56);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 0, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        _localctx = _tracker.createInstance<FileContentContext>(parentContext, parentState);
        pushNewRecursionContext(_localctx, startState, RuleFileContent);
        setState(52);

        if (!(precpred(_ctx, 2))) throw FailedPredicateException(this, "precpred(_ctx, 2)");
        setState(53);
        sentence(); 
      }
      setState(58);
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

TParser::LiveTokensContext* TParser::SentenceContext::liveTokens() {
  return getRuleContext<TParser::LiveTokensContext>(0);
}

TParser::UseContext* TParser::SentenceContext::use() {
  return getRuleContext<TParser::UseContext>(0);
}

TParser::VariableContext* TParser::SentenceContext::variable() {
  return getRuleContext<TParser::VariableContext>(0);
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
    setState(62);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Newline: {
        enterOuterAlt(_localctx, 1);
        setState(59);
        liveTokens();
        break;
      }

      case TParser::Use: {
        enterOuterAlt(_localctx, 2);
        setState(60);
        use();
        break;
      }

      case TParser::Var: {
        enterOuterAlt(_localctx, 3);
        setState(61);
        variable();
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

//----------------- LiveTokensContext ------------------------------------------------------------------

TParser::LiveTokensContext::LiveTokensContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::LiveTokensContext::Newline() {
  return getToken(TParser::Newline, 0);
}


size_t TParser::LiveTokensContext::getRuleIndex() const {
  return TParser::RuleLiveTokens;
}

void TParser::LiveTokensContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLiveTokens(this);
}

void TParser::LiveTokensContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLiveTokens(this);
}


antlrcpp::Any TParser::LiveTokensContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLiveTokens(this);
  else
    return visitor->visitChildren(this);
}

TParser::LiveTokensContext* TParser::liveTokens() {
  LiveTokensContext *_localctx = _tracker.createInstance<LiveTokensContext>(_ctx, getState());
  enterRule(_localctx, 6, TParser::RuleLiveTokens);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(64);
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
    setState(66);
    match(TParser::Use);
    setState(67);
    useValue();
    setState(68);
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
    setState(75);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 2, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(70);
      useString();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(71);
      useString();
      setState(72);
      match(TParser::Separator);
      setState(73);
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
    setState(77);
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
    setState(79);
    match(TParser::Var);
    setState(80);
    variableMembers();
    setState(81);
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
    setState(88);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 3, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(83);
      variableDefinition();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(84);
      variableDefinition();
      setState(85);
      match(TParser::Separator);
      setState(86);
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
    setState(97);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 4, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(90);
      match(TParser::Identifier);
      setState(91);
      match(TParser::Attr);
      setState(92);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(93);
      match(TParser::Identifier);
      setState(94);
      match(TParser::TypeSpec);
      setState(95);
      match(TParser::Attr);
      setState(96);
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
    setState(105);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 5, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(99);
      match(TParser::OpenArIndex);
      setState(100);
      match(TParser::CloseArIndex);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(101);
      match(TParser::OpenArIndex);
      setState(102);
      indexArrayElements();
      setState(103);
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
    setState(112);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 6, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(107);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(108);
      generalValue();
      setState(109);
      match(TParser::Separator);
      setState(110);
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
    setState(120);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 7, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(114);
      match(TParser::OpenBlock);
      setState(115);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(116);
      match(TParser::OpenBlock);
      setState(117);
      associativeArrayElements();
      setState(118);
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
    setState(131);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 8, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(122);
      match(TParser::Identifier);
      setState(123);
      match(TParser::TwoPoint);
      setState(124);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(125);
      match(TParser::Identifier);
      setState(126);
      match(TParser::TwoPoint);
      setState(127);
      generalValue();
      setState(128);
      match(TParser::Separator);
      setState(129);
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
    setState(133);
    match(TParser::OpenOp);
    setState(134);
    operationElements();
    setState(135);
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
    setState(141);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 9, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(137);
      operationValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(138);
      operationValue();
      setState(139);
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
    setState(210);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 10, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(143);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(144);
      match(TParser::Identifier);
      setState(145);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(146);
      match(TParser::Identifier);
      setState(147);
      match(TParser::TypeSpec);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(148);
      match(TParser::Identifier);
      setState(149);
      match(TParser::TypeSpec);
      setState(150);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(151);
      firstIncDec();
      setState(152);
      match(TParser::Identifier);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(154);
      firstIncDec();
      setState(155);
      match(TParser::Identifier);
      setState(156);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(158);
      firstIncDec();
      setState(159);
      match(TParser::Identifier);
      setState(160);
      match(TParser::TypeSpec);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(162);
      firstIncDec();
      setState(163);
      match(TParser::Identifier);
      setState(164);
      match(TParser::TypeSpec);
      setState(165);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(167);
      match(TParser::Identifier);
      setState(168);
      lastIncDec();
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(169);
      match(TParser::Identifier);
      setState(170);
      lastIncDec();
      setState(171);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(173);
      match(TParser::Identifier);
      setState(174);
      lastIncDec();
      setState(175);
      match(TParser::TypeSpec);
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(177);
      match(TParser::Identifier);
      setState(178);
      lastIncDec();
      setState(179);
      match(TParser::TypeSpec);
      setState(180);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 13: {
      enterOuterAlt(_localctx, 13);
      setState(182);
      match(TParser::Integer);
      break;
    }

    case 14: {
      enterOuterAlt(_localctx, 14);
      setState(183);
      match(TParser::Integer);
      setState(184);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 15: {
      enterOuterAlt(_localctx, 15);
      setState(185);
      match(TParser::Integer);
      setState(186);
      match(TParser::TypeSpec);
      break;
    }

    case 16: {
      enterOuterAlt(_localctx, 16);
      setState(187);
      match(TParser::Integer);
      setState(188);
      match(TParser::TypeSpec);
      setState(189);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 17: {
      enterOuterAlt(_localctx, 17);
      setState(190);
      match(TParser::Float);
      break;
    }

    case 18: {
      enterOuterAlt(_localctx, 18);
      setState(191);
      match(TParser::Float);
      setState(192);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 19: {
      enterOuterAlt(_localctx, 19);
      setState(193);
      match(TParser::Float);
      setState(194);
      match(TParser::TypeSpec);
      break;
    }

    case 20: {
      enterOuterAlt(_localctx, 20);
      setState(195);
      match(TParser::Float);
      setState(196);
      match(TParser::TypeSpec);
      setState(197);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 21: {
      enterOuterAlt(_localctx, 21);
      setState(198);
      functionCall();
      break;
    }

    case 22: {
      enterOuterAlt(_localctx, 22);
      setState(199);
      operationBlock();
      break;
    }

    case 23: {
      enterOuterAlt(_localctx, 23);
      setState(200);
      operationBlock();
      setState(201);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 24: {
      enterOuterAlt(_localctx, 24);
      setState(203);
      operationBlock();
      setState(204);
      match(TParser::TypeSpec);
      break;
    }

    case 25: {
      enterOuterAlt(_localctx, 25);
      setState(206);
      operationBlock();
      setState(207);
      match(TParser::TypeSpec);
      setState(208);
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
    setState(212);
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
    setState(214);
    match(TParser::IncDecOperators);
   
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
  enterRule(_localctx, 38, TParser::RuleFunctionCall);

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
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 11, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(216);
      match(TParser::Identifier);
      setState(217);
      functionCallParam();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(218);
      match(TParser::Identifier);
      setState(219);
      match(TParser::Point);
      setState(220);
      identifierB();
      setState(221);
      functionCallParam();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(223);
      match(TParser::Identifier);
      setState(224);
      match(TParser::TwoTwoPoint);
      setState(225);
      identifierB();
      setState(226);
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
  enterRule(_localctx, 40, TParser::RuleIdentifierB);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(230);
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

TParser::FunctionCallParamElementsContext* TParser::FunctionCallParamContext::functionCallParamElements() {
  return getRuleContext<TParser::FunctionCallParamElementsContext>(0);
}

tree::TerminalNode* TParser::FunctionCallParamContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
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
  enterRule(_localctx, 42, TParser::RuleFunctionCallParam);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(232);
    match(TParser::OpenOp);
    setState(233);
    functionCallParamElements();
    setState(234);
    match(TParser::CloseOp);
   
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
  enterRule(_localctx, 44, TParser::RuleFunctionCallParamElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(241);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 12, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(236);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(237);
      generalValue();
      setState(238);
      match(TParser::Separator);
      setState(239);
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

tree::TerminalNode* TParser::GeneralValueContext::String() {
  return getToken(TParser::String, 0);
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
  enterRule(_localctx, 46, TParser::RuleGeneralValue);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(258);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 13, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(243);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(244);
      match(TParser::Identifier);
      setState(245);
      match(TParser::TypeSpec);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(246);
      match(TParser::String);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(247);
      match(TParser::Integer);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(248);
      match(TParser::Integer);
      setState(249);
      match(TParser::TypeSpec);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(250);
      match(TParser::Float);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(251);
      match(TParser::Float);
      setState(252);
      match(TParser::TypeSpec);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(253);
      match(TParser::Bool);
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(254);
      indexArray();
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(255);
      associativeArray();
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(256);
      operationBlock();
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(257);
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

// Static vars and initialization.
std::vector<dfa::DFA> TParser::_decisionToDFA;
atn::PredictionContextCache TParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN TParser::_atn;
std::vector<uint16_t> TParser::_serializedATN;

std::vector<std::string> TParser::_ruleNames = {
  "main", "fileContent", "sentence", "liveTokens", "use", "useValue", "useString", 
  "variable", "variableMembers", "variableDefinition", "indexArray", "indexArrayElements", 
  "associativeArray", "associativeArrayElements", "operationBlock", "operationElements", 
  "operationValue", "firstIncDec", "lastIncDec", "functionCall", "identifierB", 
  "functionCallParam", "functionCallParamElements", "generalValue"
};

std::vector<std::string> TParser::_literalNames = {
  "", "'use'", "'var'", "", "';'", "'='", "'.'", "':'", "'::'", "','", "'['", 
  "']'", "'{'", "'}'", "'('", "')'"
};

std::vector<std::string> TParser::_symbolicNames = {
  "", "Use", "Var", "Bool", "End", "Attr", "Point", "TwoPoint", "TwoTwoPoint", 
  "Separator", "OpenArIndex", "CloseArIndex", "OpenBlock", "CloseBlock", 
  "OpenOp", "CloseOp", "ArithmeticOperator", "IncDecOperators", "Identifier", 
  "IDPrefix", "TypeSpec", "String", "Integer", "Float", "Whitespace", "Newline", 
  "Words", "BlockComment", "LineComment"
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
       0x3, 0x1e, 0x107, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 
       0x9, 0x4, 0x4, 0x5, 0x9, 0x5, 0x4, 0x6, 0x9, 0x6, 0x4, 0x7, 0x9, 
       0x7, 0x4, 0x8, 0x9, 0x8, 0x4, 0x9, 0x9, 0x9, 0x4, 0xa, 0x9, 0xa, 
       0x4, 0xb, 0x9, 0xb, 0x4, 0xc, 0x9, 0xc, 0x4, 0xd, 0x9, 0xd, 0x4, 
       0xe, 0x9, 0xe, 0x4, 0xf, 0x9, 0xf, 0x4, 0x10, 0x9, 0x10, 0x4, 0x11, 
       0x9, 0x11, 0x4, 0x12, 0x9, 0x12, 0x4, 0x13, 0x9, 0x13, 0x4, 0x14, 
       0x9, 0x14, 0x4, 0x15, 0x9, 0x15, 0x4, 0x16, 0x9, 0x16, 0x4, 0x17, 
       0x9, 0x17, 0x4, 0x18, 0x9, 0x18, 0x4, 0x19, 0x9, 0x19, 0x3, 0x2, 
       0x3, 0x2, 0x3, 0x2, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x7, 0x3, 0x39, 
       0xa, 0x3, 0xc, 0x3, 0xe, 0x3, 0x3c, 0xb, 0x3, 0x3, 0x4, 0x3, 0x4, 
       0x3, 0x4, 0x5, 0x4, 0x41, 0xa, 0x4, 0x3, 0x5, 0x3, 0x5, 0x3, 0x6, 
       0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 
       0x7, 0x3, 0x7, 0x5, 0x7, 0x4e, 0xa, 0x7, 0x3, 0x8, 0x3, 0x8, 0x3, 
       0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
       0x3, 0xa, 0x3, 0xa, 0x5, 0xa, 0x5b, 0xa, 0xa, 0x3, 0xb, 0x3, 0xb, 
       0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x5, 0xb, 0x64, 
       0xa, 0xb, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 
       0xc, 0x5, 0xc, 0x6c, 0xa, 0xc, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 
       0xd, 0x3, 0xd, 0x5, 0xd, 0x73, 0xa, 0xd, 0x3, 0xe, 0x3, 0xe, 0x3, 
       0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x5, 0xe, 0x7b, 0xa, 0xe, 0x3, 
       0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 
       0x3, 0xf, 0x3, 0xf, 0x5, 0xf, 0x86, 0xa, 0xf, 0x3, 0x10, 0x3, 0x10, 
       0x3, 0x10, 0x3, 0x10, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 
       0x5, 0x11, 0x90, 0xa, 0x11, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 
       0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 
       0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 
       0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 
       0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 
       0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 
       0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 
       0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 
       0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 
       0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 
       0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 
       0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x5, 0x12, 0xd5, 0xa, 0x12, 
       0x3, 0x13, 0x3, 0x13, 0x3, 0x14, 0x3, 0x14, 0x3, 0x15, 0x3, 0x15, 
       0x3, 0x15, 0x3, 0x15, 0x3, 0x15, 0x3, 0x15, 0x3, 0x15, 0x3, 0x15, 
       0x3, 0x15, 0x3, 0x15, 0x3, 0x15, 0x3, 0x15, 0x5, 0x15, 0xe7, 0xa, 
       0x15, 0x3, 0x16, 0x3, 0x16, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 
       0x17, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x5, 
       0x18, 0xf4, 0xa, 0x18, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 
       0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 
       0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x5, 0x19, 
       0x105, 0xa, 0x19, 0x3, 0x19, 0x2, 0x3, 0x4, 0x1a, 0x2, 0x4, 0x6, 
       0x8, 0xa, 0xc, 0xe, 0x10, 0x12, 0x14, 0x16, 0x18, 0x1a, 0x1c, 0x1e, 
       0x20, 0x22, 0x24, 0x26, 0x28, 0x2a, 0x2c, 0x2e, 0x30, 0x2, 0x2, 0x2, 
       0x11f, 0x2, 0x32, 0x3, 0x2, 0x2, 0x2, 0x4, 0x35, 0x3, 0x2, 0x2, 0x2, 
       0x6, 0x40, 0x3, 0x2, 0x2, 0x2, 0x8, 0x42, 0x3, 0x2, 0x2, 0x2, 0xa, 
       0x44, 0x3, 0x2, 0x2, 0x2, 0xc, 0x4d, 0x3, 0x2, 0x2, 0x2, 0xe, 0x4f, 
       0x3, 0x2, 0x2, 0x2, 0x10, 0x51, 0x3, 0x2, 0x2, 0x2, 0x12, 0x5a, 0x3, 
       0x2, 0x2, 0x2, 0x14, 0x63, 0x3, 0x2, 0x2, 0x2, 0x16, 0x6b, 0x3, 0x2, 
       0x2, 0x2, 0x18, 0x72, 0x3, 0x2, 0x2, 0x2, 0x1a, 0x7a, 0x3, 0x2, 0x2, 
       0x2, 0x1c, 0x85, 0x3, 0x2, 0x2, 0x2, 0x1e, 0x87, 0x3, 0x2, 0x2, 0x2, 
       0x20, 0x8f, 0x3, 0x2, 0x2, 0x2, 0x22, 0xd4, 0x3, 0x2, 0x2, 0x2, 0x24, 
       0xd6, 0x3, 0x2, 0x2, 0x2, 0x26, 0xd8, 0x3, 0x2, 0x2, 0x2, 0x28, 0xe6, 
       0x3, 0x2, 0x2, 0x2, 0x2a, 0xe8, 0x3, 0x2, 0x2, 0x2, 0x2c, 0xea, 0x3, 
       0x2, 0x2, 0x2, 0x2e, 0xf3, 0x3, 0x2, 0x2, 0x2, 0x30, 0x104, 0x3, 
       0x2, 0x2, 0x2, 0x32, 0x33, 0x5, 0x4, 0x3, 0x2, 0x33, 0x34, 0x7, 0x2, 
       0x2, 0x3, 0x34, 0x3, 0x3, 0x2, 0x2, 0x2, 0x35, 0x3a, 0x8, 0x3, 0x1, 
       0x2, 0x36, 0x37, 0xc, 0x4, 0x2, 0x2, 0x37, 0x39, 0x5, 0x6, 0x4, 0x2, 
       0x38, 0x36, 0x3, 0x2, 0x2, 0x2, 0x39, 0x3c, 0x3, 0x2, 0x2, 0x2, 0x3a, 
       0x38, 0x3, 0x2, 0x2, 0x2, 0x3a, 0x3b, 0x3, 0x2, 0x2, 0x2, 0x3b, 0x5, 
       0x3, 0x2, 0x2, 0x2, 0x3c, 0x3a, 0x3, 0x2, 0x2, 0x2, 0x3d, 0x41, 0x5, 
       0x8, 0x5, 0x2, 0x3e, 0x41, 0x5, 0xa, 0x6, 0x2, 0x3f, 0x41, 0x5, 0x10, 
       0x9, 0x2, 0x40, 0x3d, 0x3, 0x2, 0x2, 0x2, 0x40, 0x3e, 0x3, 0x2, 0x2, 
       0x2, 0x40, 0x3f, 0x3, 0x2, 0x2, 0x2, 0x41, 0x7, 0x3, 0x2, 0x2, 0x2, 
       0x42, 0x43, 0x7, 0x1b, 0x2, 0x2, 0x43, 0x9, 0x3, 0x2, 0x2, 0x2, 0x44, 
       0x45, 0x7, 0x3, 0x2, 0x2, 0x45, 0x46, 0x5, 0xc, 0x7, 0x2, 0x46, 0x47, 
       0x7, 0x6, 0x2, 0x2, 0x47, 0xb, 0x3, 0x2, 0x2, 0x2, 0x48, 0x4e, 0x5, 
       0xe, 0x8, 0x2, 0x49, 0x4a, 0x5, 0xe, 0x8, 0x2, 0x4a, 0x4b, 0x7, 0xb, 
       0x2, 0x2, 0x4b, 0x4c, 0x5, 0xc, 0x7, 0x2, 0x4c, 0x4e, 0x3, 0x2, 0x2, 
       0x2, 0x4d, 0x48, 0x3, 0x2, 0x2, 0x2, 0x4d, 0x49, 0x3, 0x2, 0x2, 0x2, 
       0x4e, 0xd, 0x3, 0x2, 0x2, 0x2, 0x4f, 0x50, 0x7, 0x17, 0x2, 0x2, 0x50, 
       0xf, 0x3, 0x2, 0x2, 0x2, 0x51, 0x52, 0x7, 0x4, 0x2, 0x2, 0x52, 0x53, 
       0x5, 0x12, 0xa, 0x2, 0x53, 0x54, 0x7, 0x6, 0x2, 0x2, 0x54, 0x11, 
       0x3, 0x2, 0x2, 0x2, 0x55, 0x5b, 0x5, 0x14, 0xb, 0x2, 0x56, 0x57, 
       0x5, 0x14, 0xb, 0x2, 0x57, 0x58, 0x7, 0xb, 0x2, 0x2, 0x58, 0x59, 
       0x5, 0x12, 0xa, 0x2, 0x59, 0x5b, 0x3, 0x2, 0x2, 0x2, 0x5a, 0x55, 
       0x3, 0x2, 0x2, 0x2, 0x5a, 0x56, 0x3, 0x2, 0x2, 0x2, 0x5b, 0x13, 0x3, 
       0x2, 0x2, 0x2, 0x5c, 0x5d, 0x7, 0x14, 0x2, 0x2, 0x5d, 0x5e, 0x7, 
       0x7, 0x2, 0x2, 0x5e, 0x64, 0x5, 0x30, 0x19, 0x2, 0x5f, 0x60, 0x7, 
       0x14, 0x2, 0x2, 0x60, 0x61, 0x7, 0x16, 0x2, 0x2, 0x61, 0x62, 0x7, 
       0x7, 0x2, 0x2, 0x62, 0x64, 0x5, 0x30, 0x19, 0x2, 0x63, 0x5c, 0x3, 
       0x2, 0x2, 0x2, 0x63, 0x5f, 0x3, 0x2, 0x2, 0x2, 0x64, 0x15, 0x3, 0x2, 
       0x2, 0x2, 0x65, 0x66, 0x7, 0xc, 0x2, 0x2, 0x66, 0x6c, 0x7, 0xd, 0x2, 
       0x2, 0x67, 0x68, 0x7, 0xc, 0x2, 0x2, 0x68, 0x69, 0x5, 0x18, 0xd, 
       0x2, 0x69, 0x6a, 0x7, 0xd, 0x2, 0x2, 0x6a, 0x6c, 0x3, 0x2, 0x2, 0x2, 
       0x6b, 0x65, 0x3, 0x2, 0x2, 0x2, 0x6b, 0x67, 0x3, 0x2, 0x2, 0x2, 0x6c, 
       0x17, 0x3, 0x2, 0x2, 0x2, 0x6d, 0x73, 0x5, 0x30, 0x19, 0x2, 0x6e, 
       0x6f, 0x5, 0x30, 0x19, 0x2, 0x6f, 0x70, 0x7, 0xb, 0x2, 0x2, 0x70, 
       0x71, 0x5, 0x18, 0xd, 0x2, 0x71, 0x73, 0x3, 0x2, 0x2, 0x2, 0x72, 
       0x6d, 0x3, 0x2, 0x2, 0x2, 0x72, 0x6e, 0x3, 0x2, 0x2, 0x2, 0x73, 0x19, 
       0x3, 0x2, 0x2, 0x2, 0x74, 0x75, 0x7, 0xe, 0x2, 0x2, 0x75, 0x7b, 0x7, 
       0xf, 0x2, 0x2, 0x76, 0x77, 0x7, 0xe, 0x2, 0x2, 0x77, 0x78, 0x5, 0x1c, 
       0xf, 0x2, 0x78, 0x79, 0x7, 0xf, 0x2, 0x2, 0x79, 0x7b, 0x3, 0x2, 0x2, 
       0x2, 0x7a, 0x74, 0x3, 0x2, 0x2, 0x2, 0x7a, 0x76, 0x3, 0x2, 0x2, 0x2, 
       0x7b, 0x1b, 0x3, 0x2, 0x2, 0x2, 0x7c, 0x7d, 0x7, 0x14, 0x2, 0x2, 
       0x7d, 0x7e, 0x7, 0x9, 0x2, 0x2, 0x7e, 0x86, 0x5, 0x30, 0x19, 0x2, 
       0x7f, 0x80, 0x7, 0x14, 0x2, 0x2, 0x80, 0x81, 0x7, 0x9, 0x2, 0x2, 
       0x81, 0x82, 0x5, 0x30, 0x19, 0x2, 0x82, 0x83, 0x7, 0xb, 0x2, 0x2, 
       0x83, 0x84, 0x5, 0x1c, 0xf, 0x2, 0x84, 0x86, 0x3, 0x2, 0x2, 0x2, 
       0x85, 0x7c, 0x3, 0x2, 0x2, 0x2, 0x85, 0x7f, 0x3, 0x2, 0x2, 0x2, 0x86, 
       0x1d, 0x3, 0x2, 0x2, 0x2, 0x87, 0x88, 0x7, 0x10, 0x2, 0x2, 0x88, 
       0x89, 0x5, 0x20, 0x11, 0x2, 0x89, 0x8a, 0x7, 0x11, 0x2, 0x2, 0x8a, 
       0x1f, 0x3, 0x2, 0x2, 0x2, 0x8b, 0x90, 0x5, 0x22, 0x12, 0x2, 0x8c, 
       0x8d, 0x5, 0x22, 0x12, 0x2, 0x8d, 0x8e, 0x5, 0x20, 0x11, 0x2, 0x8e, 
       0x90, 0x3, 0x2, 0x2, 0x2, 0x8f, 0x8b, 0x3, 0x2, 0x2, 0x2, 0x8f, 0x8c, 
       0x3, 0x2, 0x2, 0x2, 0x90, 0x21, 0x3, 0x2, 0x2, 0x2, 0x91, 0xd5, 0x7, 
       0x14, 0x2, 0x2, 0x92, 0x93, 0x7, 0x14, 0x2, 0x2, 0x93, 0xd5, 0x7, 
       0x12, 0x2, 0x2, 0x94, 0x95, 0x7, 0x14, 0x2, 0x2, 0x95, 0xd5, 0x7, 
       0x16, 0x2, 0x2, 0x96, 0x97, 0x7, 0x14, 0x2, 0x2, 0x97, 0x98, 0x7, 
       0x16, 0x2, 0x2, 0x98, 0xd5, 0x7, 0x12, 0x2, 0x2, 0x99, 0x9a, 0x5, 
       0x24, 0x13, 0x2, 0x9a, 0x9b, 0x7, 0x14, 0x2, 0x2, 0x9b, 0xd5, 0x3, 
       0x2, 0x2, 0x2, 0x9c, 0x9d, 0x5, 0x24, 0x13, 0x2, 0x9d, 0x9e, 0x7, 
       0x14, 0x2, 0x2, 0x9e, 0x9f, 0x7, 0x12, 0x2, 0x2, 0x9f, 0xd5, 0x3, 
       0x2, 0x2, 0x2, 0xa0, 0xa1, 0x5, 0x24, 0x13, 0x2, 0xa1, 0xa2, 0x7, 
       0x14, 0x2, 0x2, 0xa2, 0xa3, 0x7, 0x16, 0x2, 0x2, 0xa3, 0xd5, 0x3, 
       0x2, 0x2, 0x2, 0xa4, 0xa5, 0x5, 0x24, 0x13, 0x2, 0xa5, 0xa6, 0x7, 
       0x14, 0x2, 0x2, 0xa6, 0xa7, 0x7, 0x16, 0x2, 0x2, 0xa7, 0xa8, 0x7, 
       0x12, 0x2, 0x2, 0xa8, 0xd5, 0x3, 0x2, 0x2, 0x2, 0xa9, 0xaa, 0x7, 
       0x14, 0x2, 0x2, 0xaa, 0xd5, 0x5, 0x26, 0x14, 0x2, 0xab, 0xac, 0x7, 
       0x14, 0x2, 0x2, 0xac, 0xad, 0x5, 0x26, 0x14, 0x2, 0xad, 0xae, 0x7, 
       0x12, 0x2, 0x2, 0xae, 0xd5, 0x3, 0x2, 0x2, 0x2, 0xaf, 0xb0, 0x7, 
       0x14, 0x2, 0x2, 0xb0, 0xb1, 0x5, 0x26, 0x14, 0x2, 0xb1, 0xb2, 0x7, 
       0x16, 0x2, 0x2, 0xb2, 0xd5, 0x3, 0x2, 0x2, 0x2, 0xb3, 0xb4, 0x7, 
       0x14, 0x2, 0x2, 0xb4, 0xb5, 0x5, 0x26, 0x14, 0x2, 0xb5, 0xb6, 0x7, 
       0x16, 0x2, 0x2, 0xb6, 0xb7, 0x7, 0x12, 0x2, 0x2, 0xb7, 0xd5, 0x3, 
       0x2, 0x2, 0x2, 0xb8, 0xd5, 0x7, 0x18, 0x2, 0x2, 0xb9, 0xba, 0x7, 
       0x18, 0x2, 0x2, 0xba, 0xd5, 0x7, 0x12, 0x2, 0x2, 0xbb, 0xbc, 0x7, 
       0x18, 0x2, 0x2, 0xbc, 0xd5, 0x7, 0x16, 0x2, 0x2, 0xbd, 0xbe, 0x7, 
       0x18, 0x2, 0x2, 0xbe, 0xbf, 0x7, 0x16, 0x2, 0x2, 0xbf, 0xd5, 0x7, 
       0x12, 0x2, 0x2, 0xc0, 0xd5, 0x7, 0x19, 0x2, 0x2, 0xc1, 0xc2, 0x7, 
       0x19, 0x2, 0x2, 0xc2, 0xd5, 0x7, 0x12, 0x2, 0x2, 0xc3, 0xc4, 0x7, 
       0x19, 0x2, 0x2, 0xc4, 0xd5, 0x7, 0x16, 0x2, 0x2, 0xc5, 0xc6, 0x7, 
       0x19, 0x2, 0x2, 0xc6, 0xc7, 0x7, 0x16, 0x2, 0x2, 0xc7, 0xd5, 0x7, 
       0x12, 0x2, 0x2, 0xc8, 0xd5, 0x5, 0x28, 0x15, 0x2, 0xc9, 0xd5, 0x5, 
       0x1e, 0x10, 0x2, 0xca, 0xcb, 0x5, 0x1e, 0x10, 0x2, 0xcb, 0xcc, 0x7, 
       0x12, 0x2, 0x2, 0xcc, 0xd5, 0x3, 0x2, 0x2, 0x2, 0xcd, 0xce, 0x5, 
       0x1e, 0x10, 0x2, 0xce, 0xcf, 0x7, 0x16, 0x2, 0x2, 0xcf, 0xd5, 0x3, 
       0x2, 0x2, 0x2, 0xd0, 0xd1, 0x5, 0x1e, 0x10, 0x2, 0xd1, 0xd2, 0x7, 
       0x16, 0x2, 0x2, 0xd2, 0xd3, 0x7, 0x12, 0x2, 0x2, 0xd3, 0xd5, 0x3, 
       0x2, 0x2, 0x2, 0xd4, 0x91, 0x3, 0x2, 0x2, 0x2, 0xd4, 0x92, 0x3, 0x2, 
       0x2, 0x2, 0xd4, 0x94, 0x3, 0x2, 0x2, 0x2, 0xd4, 0x96, 0x3, 0x2, 0x2, 
       0x2, 0xd4, 0x99, 0x3, 0x2, 0x2, 0x2, 0xd4, 0x9c, 0x3, 0x2, 0x2, 0x2, 
       0xd4, 0xa0, 0x3, 0x2, 0x2, 0x2, 0xd4, 0xa4, 0x3, 0x2, 0x2, 0x2, 0xd4, 
       0xa9, 0x3, 0x2, 0x2, 0x2, 0xd4, 0xab, 0x3, 0x2, 0x2, 0x2, 0xd4, 0xaf, 
       0x3, 0x2, 0x2, 0x2, 0xd4, 0xb3, 0x3, 0x2, 0x2, 0x2, 0xd4, 0xb8, 0x3, 
       0x2, 0x2, 0x2, 0xd4, 0xb9, 0x3, 0x2, 0x2, 0x2, 0xd4, 0xbb, 0x3, 0x2, 
       0x2, 0x2, 0xd4, 0xbd, 0x3, 0x2, 0x2, 0x2, 0xd4, 0xc0, 0x3, 0x2, 0x2, 
       0x2, 0xd4, 0xc1, 0x3, 0x2, 0x2, 0x2, 0xd4, 0xc3, 0x3, 0x2, 0x2, 0x2, 
       0xd4, 0xc5, 0x3, 0x2, 0x2, 0x2, 0xd4, 0xc8, 0x3, 0x2, 0x2, 0x2, 0xd4, 
       0xc9, 0x3, 0x2, 0x2, 0x2, 0xd4, 0xca, 0x3, 0x2, 0x2, 0x2, 0xd4, 0xcd, 
       0x3, 0x2, 0x2, 0x2, 0xd4, 0xd0, 0x3, 0x2, 0x2, 0x2, 0xd5, 0x23, 0x3, 
       0x2, 0x2, 0x2, 0xd6, 0xd7, 0x7, 0x13, 0x2, 0x2, 0xd7, 0x25, 0x3, 
       0x2, 0x2, 0x2, 0xd8, 0xd9, 0x7, 0x13, 0x2, 0x2, 0xd9, 0x27, 0x3, 
       0x2, 0x2, 0x2, 0xda, 0xdb, 0x7, 0x14, 0x2, 0x2, 0xdb, 0xe7, 0x5, 
       0x2c, 0x17, 0x2, 0xdc, 0xdd, 0x7, 0x14, 0x2, 0x2, 0xdd, 0xde, 0x7, 
       0x8, 0x2, 0x2, 0xde, 0xdf, 0x5, 0x2a, 0x16, 0x2, 0xdf, 0xe0, 0x5, 
       0x2c, 0x17, 0x2, 0xe0, 0xe7, 0x3, 0x2, 0x2, 0x2, 0xe1, 0xe2, 0x7, 
       0x14, 0x2, 0x2, 0xe2, 0xe3, 0x7, 0xa, 0x2, 0x2, 0xe3, 0xe4, 0x5, 
       0x2a, 0x16, 0x2, 0xe4, 0xe5, 0x5, 0x2c, 0x17, 0x2, 0xe5, 0xe7, 0x3, 
       0x2, 0x2, 0x2, 0xe6, 0xda, 0x3, 0x2, 0x2, 0x2, 0xe6, 0xdc, 0x3, 0x2, 
       0x2, 0x2, 0xe6, 0xe1, 0x3, 0x2, 0x2, 0x2, 0xe7, 0x29, 0x3, 0x2, 0x2, 
       0x2, 0xe8, 0xe9, 0x7, 0x14, 0x2, 0x2, 0xe9, 0x2b, 0x3, 0x2, 0x2, 
       0x2, 0xea, 0xeb, 0x7, 0x10, 0x2, 0x2, 0xeb, 0xec, 0x5, 0x2e, 0x18, 
       0x2, 0xec, 0xed, 0x7, 0x11, 0x2, 0x2, 0xed, 0x2d, 0x3, 0x2, 0x2, 
       0x2, 0xee, 0xf4, 0x5, 0x30, 0x19, 0x2, 0xef, 0xf0, 0x5, 0x30, 0x19, 
       0x2, 0xf0, 0xf1, 0x7, 0xb, 0x2, 0x2, 0xf1, 0xf2, 0x5, 0x2e, 0x18, 
       0x2, 0xf2, 0xf4, 0x3, 0x2, 0x2, 0x2, 0xf3, 0xee, 0x3, 0x2, 0x2, 0x2, 
       0xf3, 0xef, 0x3, 0x2, 0x2, 0x2, 0xf4, 0x2f, 0x3, 0x2, 0x2, 0x2, 0xf5, 
       0x105, 0x7, 0x14, 0x2, 0x2, 0xf6, 0xf7, 0x7, 0x14, 0x2, 0x2, 0xf7, 
       0x105, 0x7, 0x16, 0x2, 0x2, 0xf8, 0x105, 0x7, 0x17, 0x2, 0x2, 0xf9, 
       0x105, 0x7, 0x18, 0x2, 0x2, 0xfa, 0xfb, 0x7, 0x18, 0x2, 0x2, 0xfb, 
       0x105, 0x7, 0x16, 0x2, 0x2, 0xfc, 0x105, 0x7, 0x19, 0x2, 0x2, 0xfd, 
       0xfe, 0x7, 0x19, 0x2, 0x2, 0xfe, 0x105, 0x7, 0x16, 0x2, 0x2, 0xff, 
       0x105, 0x7, 0x5, 0x2, 0x2, 0x100, 0x105, 0x5, 0x16, 0xc, 0x2, 0x101, 
       0x105, 0x5, 0x1a, 0xe, 0x2, 0x102, 0x105, 0x5, 0x1e, 0x10, 0x2, 0x103, 
       0x105, 0x5, 0x28, 0x15, 0x2, 0x104, 0xf5, 0x3, 0x2, 0x2, 0x2, 0x104, 
       0xf6, 0x3, 0x2, 0x2, 0x2, 0x104, 0xf8, 0x3, 0x2, 0x2, 0x2, 0x104, 
       0xf9, 0x3, 0x2, 0x2, 0x2, 0x104, 0xfa, 0x3, 0x2, 0x2, 0x2, 0x104, 
       0xfc, 0x3, 0x2, 0x2, 0x2, 0x104, 0xfd, 0x3, 0x2, 0x2, 0x2, 0x104, 
       0xff, 0x3, 0x2, 0x2, 0x2, 0x104, 0x100, 0x3, 0x2, 0x2, 0x2, 0x104, 
       0x101, 0x3, 0x2, 0x2, 0x2, 0x104, 0x102, 0x3, 0x2, 0x2, 0x2, 0x104, 
       0x103, 0x3, 0x2, 0x2, 0x2, 0x105, 0x31, 0x3, 0x2, 0x2, 0x2, 0x10, 
       0x3a, 0x40, 0x4d, 0x5a, 0x63, 0x6b, 0x72, 0x7a, 0x85, 0x8f, 0xd4, 
       0xe6, 0xf3, 0x104, 
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
