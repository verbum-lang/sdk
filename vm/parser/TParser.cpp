
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

TParser::SentencesContext* TParser::MainContext::sentences() {
  return getRuleContext<TParser::SentencesContext>(0);
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
    setState(190);
    sentences();
    setState(191);
    match(TParser::EOF);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- SentencesContext ------------------------------------------------------------------

TParser::SentencesContext::SentencesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::StatementsContext* TParser::SentencesContext::statements() {
  return getRuleContext<TParser::StatementsContext>(0);
}

TParser::SentencesContext* TParser::SentencesContext::sentences() {
  return getRuleContext<TParser::SentencesContext>(0);
}


size_t TParser::SentencesContext::getRuleIndex() const {
  return TParser::RuleSentences;
}

void TParser::SentencesContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterSentences(this);
}

void TParser::SentencesContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitSentences(this);
}


antlrcpp::Any TParser::SentencesContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitSentences(this);
  else
    return visitor->visitChildren(this);
}

TParser::SentencesContext* TParser::sentences() {
  SentencesContext *_localctx = _tracker.createInstance<SentencesContext>(_ctx, getState());
  enterRule(_localctx, 2, TParser::RuleSentences);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(198);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 0, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(193);
      statements();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(194);
      statements();
      setState(195);
      sentences();
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

//----------------- StatementsContext ------------------------------------------------------------------

TParser::StatementsContext::StatementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::BlockUseContext* TParser::StatementsContext::blockUse() {
  return getRuleContext<TParser::BlockUseContext>(0);
}

TParser::BlockVariableContext* TParser::StatementsContext::blockVariable() {
  return getRuleContext<TParser::BlockVariableContext>(0);
}

TParser::BlockRetContext* TParser::StatementsContext::blockRet() {
  return getRuleContext<TParser::BlockRetContext>(0);
}

TParser::BlockConditionalContext* TParser::StatementsContext::blockConditional() {
  return getRuleContext<TParser::BlockConditionalContext>(0);
}

TParser::BlockLoopContext* TParser::StatementsContext::blockLoop() {
  return getRuleContext<TParser::BlockLoopContext>(0);
}

TParser::BlockBreakContext* TParser::StatementsContext::blockBreak() {
  return getRuleContext<TParser::BlockBreakContext>(0);
}

TParser::BlockNextContext* TParser::StatementsContext::blockNext() {
  return getRuleContext<TParser::BlockNextContext>(0);
}

TParser::BlockTryCatchContext* TParser::StatementsContext::blockTryCatch() {
  return getRuleContext<TParser::BlockTryCatchContext>(0);
}

TParser::BlockFunctionContext* TParser::StatementsContext::blockFunction() {
  return getRuleContext<TParser::BlockFunctionContext>(0);
}

TParser::BlockInterfaceContext* TParser::StatementsContext::blockInterface() {
  return getRuleContext<TParser::BlockInterfaceContext>(0);
}

TParser::BlockAbstractionContext* TParser::StatementsContext::blockAbstraction() {
  return getRuleContext<TParser::BlockAbstractionContext>(0);
}

TParser::BlockClassContext* TParser::StatementsContext::blockClass() {
  return getRuleContext<TParser::BlockClassContext>(0);
}

TParser::BlockFunctionCallContext* TParser::StatementsContext::blockFunctionCall() {
  return getRuleContext<TParser::BlockFunctionCallContext>(0);
}

TParser::BlockClassConstructorContext* TParser::StatementsContext::blockClassConstructor() {
  return getRuleContext<TParser::BlockClassConstructorContext>(0);
}

TParser::BlockAttributionContext* TParser::StatementsContext::blockAttribution() {
  return getRuleContext<TParser::BlockAttributionContext>(0);
}

TParser::BlockMultipleAssignmentsContext* TParser::StatementsContext::blockMultipleAssignments() {
  return getRuleContext<TParser::BlockMultipleAssignmentsContext>(0);
}

TParser::BlockPermissionTokensContext* TParser::StatementsContext::blockPermissionTokens() {
  return getRuleContext<TParser::BlockPermissionTokensContext>(0);
}

TParser::BlockAnonymousObjectContext* TParser::StatementsContext::blockAnonymousObject() {
  return getRuleContext<TParser::BlockAnonymousObjectContext>(0);
}


size_t TParser::StatementsContext::getRuleIndex() const {
  return TParser::RuleStatements;
}

void TParser::StatementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterStatements(this);
}

void TParser::StatementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitStatements(this);
}


antlrcpp::Any TParser::StatementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitStatements(this);
  else
    return visitor->visitChildren(this);
}

TParser::StatementsContext* TParser::statements() {
  StatementsContext *_localctx = _tracker.createInstance<StatementsContext>(_ctx, getState());
  enterRule(_localctx, 4, TParser::RuleStatements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(218);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 1, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(200);
      blockUse();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(201);
      blockVariable();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(202);
      blockRet();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(203);
      blockConditional();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(204);
      blockLoop();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(205);
      blockBreak();
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(206);
      blockNext();
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(207);
      blockTryCatch();
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(208);
      blockFunction();
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(209);
      blockInterface();
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(210);
      blockAbstraction();
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(211);
      blockClass();
      break;
    }

    case 13: {
      enterOuterAlt(_localctx, 13);
      setState(212);
      blockFunctionCall();
      break;
    }

    case 14: {
      enterOuterAlt(_localctx, 14);
      setState(213);
      blockClassConstructor();
      break;
    }

    case 15: {
      enterOuterAlt(_localctx, 15);
      setState(214);
      blockAttribution();
      break;
    }

    case 16: {
      enterOuterAlt(_localctx, 16);
      setState(215);
      blockMultipleAssignments();
      break;
    }

    case 17: {
      enterOuterAlt(_localctx, 17);
      setState(216);
      blockPermissionTokens();
      break;
    }

    case 18: {
      enterOuterAlt(_localctx, 18);
      setState(217);
      blockAnonymousObject();
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

//----------------- BlockCodeContext ------------------------------------------------------------------

TParser::BlockCodeContext::BlockCodeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BlockCodeContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::BlockCodeContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::SentencesContext* TParser::BlockCodeContext::sentences() {
  return getRuleContext<TParser::SentencesContext>(0);
}


size_t TParser::BlockCodeContext::getRuleIndex() const {
  return TParser::RuleBlockCode;
}

void TParser::BlockCodeContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockCode(this);
}

void TParser::BlockCodeContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockCode(this);
}


antlrcpp::Any TParser::BlockCodeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockCode(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockCodeContext* TParser::blockCode() {
  BlockCodeContext *_localctx = _tracker.createInstance<BlockCodeContext>(_ctx, getState());
  enterRule(_localctx, 6, TParser::RuleBlockCode);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(226);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 2, _ctx)) {
    case 1: {
      setState(220);
      match(TParser::OpenBlock);
      setState(221);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      setState(222);
      match(TParser::OpenBlock);
      setState(223);
      sentences();
      setState(224);
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

//----------------- BlockUseContext ------------------------------------------------------------------

TParser::BlockUseContext::BlockUseContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BlockUseContext::Use() {
  return getToken(TParser::Use, 0);
}

TParser::UseValueContext* TParser::BlockUseContext::useValue() {
  return getRuleContext<TParser::UseValueContext>(0);
}

tree::TerminalNode* TParser::BlockUseContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::BlockUseContext::getRuleIndex() const {
  return TParser::RuleBlockUse;
}

void TParser::BlockUseContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockUse(this);
}

void TParser::BlockUseContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockUse(this);
}


antlrcpp::Any TParser::BlockUseContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockUse(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockUseContext* TParser::blockUse() {
  BlockUseContext *_localctx = _tracker.createInstance<BlockUseContext>(_ctx, getState());
  enterRule(_localctx, 8, TParser::RuleBlockUse);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(228);
    match(TParser::Use);
    setState(229);
    useValue();
    setState(230);
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
    setState(237);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 3, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(232);
      useString();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(233);
      useString();
      setState(234);
      match(TParser::Separator);
      setState(235);
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
    setState(239);
    match(TParser::String);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockVariableContext ------------------------------------------------------------------

TParser::BlockVariableContext::BlockVariableContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BlockVariableContext::Var() {
  return getToken(TParser::Var, 0);
}

TParser::VariableItemContext* TParser::BlockVariableContext::variableItem() {
  return getRuleContext<TParser::VariableItemContext>(0);
}

tree::TerminalNode* TParser::BlockVariableContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::BlockVariableContext::getRuleIndex() const {
  return TParser::RuleBlockVariable;
}

void TParser::BlockVariableContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockVariable(this);
}

void TParser::BlockVariableContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockVariable(this);
}


antlrcpp::Any TParser::BlockVariableContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockVariable(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockVariableContext* TParser::blockVariable() {
  BlockVariableContext *_localctx = _tracker.createInstance<BlockVariableContext>(_ctx, getState());
  enterRule(_localctx, 14, TParser::RuleBlockVariable);

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
    match(TParser::Var);
    setState(242);
    variableItem();
    setState(243);
    match(TParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariableItemContext ------------------------------------------------------------------

TParser::VariableItemContext::VariableItemContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::VariablePrefixModesContext* TParser::VariableItemContext::variablePrefixModes() {
  return getRuleContext<TParser::VariablePrefixModesContext>(0);
}

TParser::GeneralValueElementsContext* TParser::VariableItemContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
}

std::vector<tree::TerminalNode *> TParser::VariableItemContext::Separator() {
  return getTokens(TParser::Separator);
}

tree::TerminalNode* TParser::VariableItemContext::Separator(size_t i) {
  return getToken(TParser::Separator, i);
}

std::vector<TParser::VariableItemContext *> TParser::VariableItemContext::variableItem() {
  return getRuleContexts<TParser::VariableItemContext>();
}

TParser::VariableItemContext* TParser::VariableItemContext::variableItem(size_t i) {
  return getRuleContext<TParser::VariableItemContext>(i);
}

tree::TerminalNode* TParser::VariableItemContext::New() {
  return getToken(TParser::New, 0);
}

tree::TerminalNode* TParser::VariableItemContext::Await() {
  return getToken(TParser::Await, 0);
}


size_t TParser::VariableItemContext::getRuleIndex() const {
  return TParser::RuleVariableItem;
}

void TParser::VariableItemContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVariableItem(this);
}

void TParser::VariableItemContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVariableItem(this);
}


antlrcpp::Any TParser::VariableItemContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitVariableItem(this);
  else
    return visitor->visitChildren(this);
}

TParser::VariableItemContext* TParser::variableItem() {
  VariableItemContext *_localctx = _tracker.createInstance<VariableItemContext>(_ctx, getState());
  enterRule(_localctx, 16, TParser::RuleVariableItem);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(245);
    variablePrefixModes();
    setState(247);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::New

    || _la == TParser::Await) {
      setState(246);
      _la = _input->LA(1);
      if (!(_la == TParser::New

      || _la == TParser::Await)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
    }
    setState(249);
    generalValueElements();
    setState(254);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 5, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(250);
        match(TParser::Separator);
        setState(251);
        variableItem(); 
      }
      setState(256);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 5, _ctx);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariablePrefixModesContext ------------------------------------------------------------------

TParser::VariablePrefixModesContext::VariablePrefixModesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::VariablePrefixModesContext::Attr() {
  return getToken(TParser::Attr, 0);
}

tree::TerminalNode* TParser::VariablePrefixModesContext::AssignmentOperator() {
  return getToken(TParser::AssignmentOperator, 0);
}

TParser::IdentifierContext* TParser::VariablePrefixModesContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

tree::TerminalNode* TParser::VariablePrefixModesContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}


size_t TParser::VariablePrefixModesContext::getRuleIndex() const {
  return TParser::RuleVariablePrefixModes;
}

void TParser::VariablePrefixModesContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVariablePrefixModes(this);
}

void TParser::VariablePrefixModesContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVariablePrefixModes(this);
}


antlrcpp::Any TParser::VariablePrefixModesContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitVariablePrefixModes(this);
  else
    return visitor->visitChildren(this);
}

TParser::VariablePrefixModesContext* TParser::variablePrefixModes() {
  VariablePrefixModesContext *_localctx = _tracker.createInstance<VariablePrefixModesContext>(_ctx, getState());
  enterRule(_localctx, 18, TParser::RuleVariablePrefixModes);
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
    setState(261);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 6, _ctx)) {
    case 1: {
      setState(257);
      identifier();
      break;
    }

    case 2: {
      setState(258);
      identifier();
      setState(259);
      match(TParser::TypeSpec);
      break;
    }

    default:
      break;
    }
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
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockAttributionContext ------------------------------------------------------------------

TParser::BlockAttributionContext::BlockAttributionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::AttributionElementsContext* TParser::BlockAttributionContext::attributionElements() {
  return getRuleContext<TParser::AttributionElementsContext>(0);
}

tree::TerminalNode* TParser::BlockAttributionContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::BlockAttributionContext::getRuleIndex() const {
  return TParser::RuleBlockAttribution;
}

void TParser::BlockAttributionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockAttribution(this);
}

void TParser::BlockAttributionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockAttribution(this);
}


antlrcpp::Any TParser::BlockAttributionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockAttribution(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockAttributionContext* TParser::blockAttribution() {
  BlockAttributionContext *_localctx = _tracker.createInstance<BlockAttributionContext>(_ctx, getState());
  enterRule(_localctx, 20, TParser::RuleBlockAttribution);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(265);
    attributionElements();
    setState(266);
    match(TParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AttributionElementsContext ------------------------------------------------------------------

TParser::AttributionElementsContext::AttributionElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::IdentifierContext* TParser::AttributionElementsContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

TParser::GeneralValueElementsContext* TParser::AttributionElementsContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
}

tree::TerminalNode* TParser::AttributionElementsContext::Attr() {
  return getToken(TParser::Attr, 0);
}

tree::TerminalNode* TParser::AttributionElementsContext::AssignmentOperator() {
  return getToken(TParser::AssignmentOperator, 0);
}

TParser::IdentifierBContext* TParser::AttributionElementsContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}

tree::TerminalNode* TParser::AttributionElementsContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}

std::vector<tree::TerminalNode *> TParser::AttributionElementsContext::Separator() {
  return getTokens(TParser::Separator);
}

tree::TerminalNode* TParser::AttributionElementsContext::Separator(size_t i) {
  return getToken(TParser::Separator, i);
}

std::vector<TParser::AttributionElementsContext *> TParser::AttributionElementsContext::attributionElements() {
  return getRuleContexts<TParser::AttributionElementsContext>();
}

TParser::AttributionElementsContext* TParser::AttributionElementsContext::attributionElements(size_t i) {
  return getRuleContext<TParser::AttributionElementsContext>(i);
}

tree::TerminalNode* TParser::AttributionElementsContext::Point() {
  return getToken(TParser::Point, 0);
}

tree::TerminalNode* TParser::AttributionElementsContext::TwoTwoPoint() {
  return getToken(TParser::TwoTwoPoint, 0);
}

tree::TerminalNode* TParser::AttributionElementsContext::New() {
  return getToken(TParser::New, 0);
}

tree::TerminalNode* TParser::AttributionElementsContext::Await() {
  return getToken(TParser::Await, 0);
}

TParser::GeneralValueContext* TParser::AttributionElementsContext::generalValue() {
  return getRuleContext<TParser::GeneralValueContext>(0);
}


size_t TParser::AttributionElementsContext::getRuleIndex() const {
  return TParser::RuleAttributionElements;
}

void TParser::AttributionElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAttributionElements(this);
}

void TParser::AttributionElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAttributionElements(this);
}


antlrcpp::Any TParser::AttributionElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitAttributionElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::AttributionElementsContext* TParser::attributionElements() {
  AttributionElementsContext *_localctx = _tracker.createInstance<AttributionElementsContext>(_ctx, getState());
  enterRule(_localctx, 22, TParser::RuleAttributionElements);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    setState(304);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 14, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(268);
      identifier();
      setState(271);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::Point

      || _la == TParser::TwoTwoPoint) {
        setState(269);
        _la = _input->LA(1);
        if (!(_la == TParser::Point

        || _la == TParser::TwoTwoPoint)) {
        _errHandler->recoverInline(this);
        }
        else {
          _errHandler->reportMatch(this);
          consume();
        }
        setState(270);
        identifierB();
      }
      setState(274);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::TypeSpec) {
        setState(273);
        match(TParser::TypeSpec);
      }
      setState(276);
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
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::New

      || _la == TParser::Await) {
        setState(277);
        _la = _input->LA(1);
        if (!(_la == TParser::New

        || _la == TParser::Await)) {
        _errHandler->recoverInline(this);
        }
        else {
          _errHandler->reportMatch(this);
          consume();
        }
      }
      setState(280);
      generalValueElements();
      setState(285);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 10, _ctx);
      while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
        if (alt == 1) {
          setState(281);
          match(TParser::Separator);
          setState(282);
          attributionElements(); 
        }
        setState(287);
        _errHandler->sync(this);
        alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 10, _ctx);
      }
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(288);
      generalValue();
      setState(290);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::TypeSpec) {
        setState(289);
        match(TParser::TypeSpec);
      }
      setState(292);
      _la = _input->LA(1);
      if (!(_la == TParser::Attr

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(294);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::New

      || _la == TParser::Await) {
        setState(293);
        _la = _input->LA(1);
        if (!(_la == TParser::New

        || _la == TParser::Await)) {
        _errHandler->recoverInline(this);
        }
        else {
          _errHandler->reportMatch(this);
          consume();
        }
      }
      setState(296);
      generalValueElements();
      setState(301);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 13, _ctx);
      while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
        if (alt == 1) {
          setState(297);
          match(TParser::Separator);
          setState(298);
          attributionElements(); 
        }
        setState(303);
        _errHandler->sync(this);
        alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 13, _ctx);
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

//----------------- BlockMultipleAssignmentsContext ------------------------------------------------------------------

TParser::BlockMultipleAssignmentsContext::BlockMultipleAssignmentsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::VariableMultipleAssignmentsModesContext* TParser::BlockMultipleAssignmentsContext::variableMultipleAssignmentsModes() {
  return getRuleContext<TParser::VariableMultipleAssignmentsModesContext>(0);
}

tree::TerminalNode* TParser::BlockMultipleAssignmentsContext::Attr() {
  return getToken(TParser::Attr, 0);
}

TParser::GeneralValueElementsContext* TParser::BlockMultipleAssignmentsContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
}

tree::TerminalNode* TParser::BlockMultipleAssignmentsContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::BlockMultipleAssignmentsContext::getRuleIndex() const {
  return TParser::RuleBlockMultipleAssignments;
}

void TParser::BlockMultipleAssignmentsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockMultipleAssignments(this);
}

void TParser::BlockMultipleAssignmentsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockMultipleAssignments(this);
}


antlrcpp::Any TParser::BlockMultipleAssignmentsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockMultipleAssignments(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockMultipleAssignmentsContext* TParser::blockMultipleAssignments() {
  BlockMultipleAssignmentsContext *_localctx = _tracker.createInstance<BlockMultipleAssignmentsContext>(_ctx, getState());
  enterRule(_localctx, 24, TParser::RuleBlockMultipleAssignments);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(306);
    variableMultipleAssignmentsModes();
    setState(307);
    match(TParser::Attr);
    setState(308);
    generalValueElements();
    setState(309);
    match(TParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariableMultipleAssignmentsModesContext ------------------------------------------------------------------

TParser::VariableMultipleAssignmentsModesContext::VariableMultipleAssignmentsModesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::GeneralValueContext* TParser::VariableMultipleAssignmentsModesContext::generalValue() {
  return getRuleContext<TParser::GeneralValueContext>(0);
}

std::vector<tree::TerminalNode *> TParser::VariableMultipleAssignmentsModesContext::Attr() {
  return getTokens(TParser::Attr);
}

tree::TerminalNode* TParser::VariableMultipleAssignmentsModesContext::Attr(size_t i) {
  return getToken(TParser::Attr, i);
}

std::vector<TParser::VariableMultipleAssignmentsModesContext *> TParser::VariableMultipleAssignmentsModesContext::variableMultipleAssignmentsModes() {
  return getRuleContexts<TParser::VariableMultipleAssignmentsModesContext>();
}

TParser::VariableMultipleAssignmentsModesContext* TParser::VariableMultipleAssignmentsModesContext::variableMultipleAssignmentsModes(size_t i) {
  return getRuleContext<TParser::VariableMultipleAssignmentsModesContext>(i);
}


size_t TParser::VariableMultipleAssignmentsModesContext::getRuleIndex() const {
  return TParser::RuleVariableMultipleAssignmentsModes;
}

void TParser::VariableMultipleAssignmentsModesContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVariableMultipleAssignmentsModes(this);
}

void TParser::VariableMultipleAssignmentsModesContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVariableMultipleAssignmentsModes(this);
}


antlrcpp::Any TParser::VariableMultipleAssignmentsModesContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitVariableMultipleAssignmentsModes(this);
  else
    return visitor->visitChildren(this);
}

TParser::VariableMultipleAssignmentsModesContext* TParser::variableMultipleAssignmentsModes() {
  VariableMultipleAssignmentsModesContext *_localctx = _tracker.createInstance<VariableMultipleAssignmentsModesContext>(_ctx, getState());
  enterRule(_localctx, 26, TParser::RuleVariableMultipleAssignmentsModes);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(311);
    generalValue();
    setState(316);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 15, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(312);
        match(TParser::Attr);
        setState(313);
        variableMultipleAssignmentsModes(); 
      }
      setState(318);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 15, _ctx);
    }
   
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

TParser::IdentifierContext* TParser::FunctionCallContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

TParser::FunctionCallParamContext* TParser::FunctionCallContext::functionCallParam() {
  return getRuleContext<TParser::FunctionCallParamContext>(0);
}

TParser::IdentifierBContext* TParser::FunctionCallContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}

tree::TerminalNode* TParser::FunctionCallContext::Point() {
  return getToken(TParser::Point, 0);
}

tree::TerminalNode* TParser::FunctionCallContext::TwoTwoPoint() {
  return getToken(TParser::TwoTwoPoint, 0);
}

TParser::BlockAccessArrayElementsContext* TParser::FunctionCallContext::blockAccessArrayElements() {
  return getRuleContext<TParser::BlockAccessArrayElementsContext>(0);
}

tree::TerminalNode* TParser::FunctionCallContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

tree::TerminalNode* TParser::FunctionCallContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}

TParser::FunctionCallElementsContext* TParser::FunctionCallContext::functionCallElements() {
  return getRuleContext<TParser::FunctionCallElementsContext>(0);
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
  enterRule(_localctx, 28, TParser::RuleFunctionCall);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(333);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 18, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(319);
      identifier();
      setState(322);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::Point

      || _la == TParser::TwoTwoPoint) {
        setState(320);
        _la = _input->LA(1);
        if (!(_la == TParser::Point

        || _la == TParser::TwoTwoPoint)) {
        _errHandler->recoverInline(this);
        }
        else {
          _errHandler->reportMatch(this);
          consume();
        }
        setState(321);
        identifierB();
      }
      setState(324);
      functionCallParam();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(326);
      blockAccessArrayElements();
      setState(327);
      match(TParser::OpenOp);
      setState(329);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if ((((_la & ~ 0x3fULL) == 0) &&
        ((1ULL << _la) & ((1ULL << TParser::Function)
        | (1ULL << TParser::Class)
        | (1ULL << TParser::OpenArIndex)
        | (1ULL << TParser::OpenBlock)
        | (1ULL << TParser::OpenOp)
        | (1ULL << TParser::Not)
        | (1ULL << TParser::IncDecOperators)
        | (1ULL << TParser::Identifier)
        | (1ULL << TParser::Integer)
        | (1ULL << TParser::Float)
        | (1ULL << TParser::String))) != 0)) {
        setState(328);
        functionCallElements();
      }
      setState(331);
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

//----------------- FunctionCallFlowControlContext ------------------------------------------------------------------

TParser::FunctionCallFlowControlContext::FunctionCallFlowControlContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::IdentifierContext* TParser::FunctionCallFlowControlContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

TParser::FunctionCallParamContext* TParser::FunctionCallFlowControlContext::functionCallParam() {
  return getRuleContext<TParser::FunctionCallParamContext>(0);
}

TParser::IdentifierBContext* TParser::FunctionCallFlowControlContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}

tree::TerminalNode* TParser::FunctionCallFlowControlContext::Point() {
  return getToken(TParser::Point, 0);
}

tree::TerminalNode* TParser::FunctionCallFlowControlContext::TwoTwoPoint() {
  return getToken(TParser::TwoTwoPoint, 0);
}


size_t TParser::FunctionCallFlowControlContext::getRuleIndex() const {
  return TParser::RuleFunctionCallFlowControl;
}

void TParser::FunctionCallFlowControlContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionCallFlowControl(this);
}

void TParser::FunctionCallFlowControlContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionCallFlowControl(this);
}


antlrcpp::Any TParser::FunctionCallFlowControlContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionCallFlowControl(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionCallFlowControlContext* TParser::functionCallFlowControl() {
  FunctionCallFlowControlContext *_localctx = _tracker.createInstance<FunctionCallFlowControlContext>(_ctx, getState());
  enterRule(_localctx, 30, TParser::RuleFunctionCallFlowControl);
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
    setState(335);
    identifier();
    setState(338);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::Point

    || _la == TParser::TwoTwoPoint) {
      setState(336);
      _la = _input->LA(1);
      if (!(_la == TParser::Point

      || _la == TParser::TwoTwoPoint)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(337);
      identifierB();
    }
    setState(340);
    functionCallParam();
   
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
  enterRule(_localctx, 32, TParser::RuleFunctionCallParam);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(348);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 20, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(342);
      match(TParser::OpenOp);
      setState(343);
      match(TParser::CloseOp);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(344);
      match(TParser::OpenOp);
      setState(345);
      functionCallParamElements();
      setState(346);
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

TParser::GeneralValueElementsContext* TParser::FunctionCallParamElementsContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
}

std::vector<tree::TerminalNode *> TParser::FunctionCallParamElementsContext::Separator() {
  return getTokens(TParser::Separator);
}

tree::TerminalNode* TParser::FunctionCallParamElementsContext::Separator(size_t i) {
  return getToken(TParser::Separator, i);
}

std::vector<TParser::FunctionCallParamElementsContext *> TParser::FunctionCallParamElementsContext::functionCallParamElements() {
  return getRuleContexts<TParser::FunctionCallParamElementsContext>();
}

TParser::FunctionCallParamElementsContext* TParser::FunctionCallParamElementsContext::functionCallParamElements(size_t i) {
  return getRuleContext<TParser::FunctionCallParamElementsContext>(i);
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
  enterRule(_localctx, 34, TParser::RuleFunctionCallParamElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(350);
    generalValueElements();
    setState(355);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 21, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(351);
        match(TParser::Separator);
        setState(352);
        functionCallParamElements(); 
      }
      setState(357);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 21, _ctx);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockRetContext ------------------------------------------------------------------

TParser::BlockRetContext::BlockRetContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BlockRetContext::Ret() {
  return getToken(TParser::Ret, 0);
}

TParser::GeneralValueElementsContext* TParser::BlockRetContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
}

tree::TerminalNode* TParser::BlockRetContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::BlockRetContext::getRuleIndex() const {
  return TParser::RuleBlockRet;
}

void TParser::BlockRetContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockRet(this);
}

void TParser::BlockRetContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockRet(this);
}


antlrcpp::Any TParser::BlockRetContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockRet(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockRetContext* TParser::blockRet() {
  BlockRetContext *_localctx = _tracker.createInstance<BlockRetContext>(_ctx, getState());
  enterRule(_localctx, 36, TParser::RuleBlockRet);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(358);
    match(TParser::Ret);
    setState(359);
    generalValueElements();
    setState(360);
    match(TParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockConditionalContext ------------------------------------------------------------------

TParser::BlockConditionalContext::BlockConditionalContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::IfElementUniqueContext* TParser::BlockConditionalContext::ifElementUnique() {
  return getRuleContext<TParser::IfElementUniqueContext>(0);
}

TParser::ElifElementsContext* TParser::BlockConditionalContext::elifElements() {
  return getRuleContext<TParser::ElifElementsContext>(0);
}

TParser::ElseElementUniqueContext* TParser::BlockConditionalContext::elseElementUnique() {
  return getRuleContext<TParser::ElseElementUniqueContext>(0);
}


size_t TParser::BlockConditionalContext::getRuleIndex() const {
  return TParser::RuleBlockConditional;
}

void TParser::BlockConditionalContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockConditional(this);
}

void TParser::BlockConditionalContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockConditional(this);
}


antlrcpp::Any TParser::BlockConditionalContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockConditional(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockConditionalContext* TParser::blockConditional() {
  BlockConditionalContext *_localctx = _tracker.createInstance<BlockConditionalContext>(_ctx, getState());
  enterRule(_localctx, 38, TParser::RuleBlockConditional);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(362);
    ifElementUnique();
    setState(364);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 22, _ctx)) {
    case 1: {
      setState(363);
      elifElements();
      break;
    }

    default:
      break;
    }
    setState(367);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 23, _ctx)) {
    case 1: {
      setState(366);
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

TParser::ConditionalBlockExpressionContext* TParser::IfElementUniqueContext::conditionalBlockExpression() {
  return getRuleContext<TParser::ConditionalBlockExpressionContext>(0);
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
  enterRule(_localctx, 40, TParser::RuleIfElementUnique);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(369);
    match(TParser::If);
    setState(370);
    conditionalBlockExpression();
    setState(371);
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

std::vector<TParser::ElifElementsContext *> TParser::ElifElementsContext::elifElements() {
  return getRuleContexts<TParser::ElifElementsContext>();
}

TParser::ElifElementsContext* TParser::ElifElementsContext::elifElements(size_t i) {
  return getRuleContext<TParser::ElifElementsContext>(i);
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
  enterRule(_localctx, 42, TParser::RuleElifElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(373);
    elifElementUnique();
    setState(377);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 24, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(374);
        elifElements(); 
      }
      setState(379);
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

//----------------- ElifElementUniqueContext ------------------------------------------------------------------

TParser::ElifElementUniqueContext::ElifElementUniqueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ElifElementUniqueContext::Elif() {
  return getToken(TParser::Elif, 0);
}

TParser::ConditionalBlockExpressionContext* TParser::ElifElementUniqueContext::conditionalBlockExpression() {
  return getRuleContext<TParser::ConditionalBlockExpressionContext>(0);
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
  enterRule(_localctx, 44, TParser::RuleElifElementUnique);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(380);
    match(TParser::Elif);
    setState(381);
    conditionalBlockExpression();
    setState(382);
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
  enterRule(_localctx, 46, TParser::RuleElseElementUnique);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(384);
    match(TParser::Else);
    setState(385);
    conditionalBlockElements();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConditionalBlockExpressionContext ------------------------------------------------------------------

TParser::ConditionalBlockExpressionContext::ConditionalBlockExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::GeneralValueElementsContext* TParser::ConditionalBlockExpressionContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
}


size_t TParser::ConditionalBlockExpressionContext::getRuleIndex() const {
  return TParser::RuleConditionalBlockExpression;
}

void TParser::ConditionalBlockExpressionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConditionalBlockExpression(this);
}

void TParser::ConditionalBlockExpressionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConditionalBlockExpression(this);
}


antlrcpp::Any TParser::ConditionalBlockExpressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConditionalBlockExpression(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConditionalBlockExpressionContext* TParser::conditionalBlockExpression() {
  ConditionalBlockExpressionContext *_localctx = _tracker.createInstance<ConditionalBlockExpressionContext>(_ctx, getState());
  enterRule(_localctx, 48, TParser::RuleConditionalBlockExpression);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(387);
    generalValueElements();
   
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

TParser::CodeBlockFlowControlContext* TParser::ConditionalBlockElementsContext::codeBlockFlowControl() {
  return getRuleContext<TParser::CodeBlockFlowControlContext>(0);
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
  enterRule(_localctx, 50, TParser::RuleConditionalBlockElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(389);
    codeBlockFlowControl();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockLoopContext ------------------------------------------------------------------

TParser::BlockLoopContext::BlockLoopContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BlockLoopContext::For() {
  return getToken(TParser::For, 0);
}

TParser::LoopBlockElementsContext* TParser::BlockLoopContext::loopBlockElements() {
  return getRuleContext<TParser::LoopBlockElementsContext>(0);
}

TParser::LoopInfiniteContext* TParser::BlockLoopContext::loopInfinite() {
  return getRuleContext<TParser::LoopInfiniteContext>(0);
}

TParser::LoopConditionalContext* TParser::BlockLoopContext::loopConditional() {
  return getRuleContext<TParser::LoopConditionalContext>(0);
}

TParser::LoopCompleteContext* TParser::BlockLoopContext::loopComplete() {
  return getRuleContext<TParser::LoopCompleteContext>(0);
}


size_t TParser::BlockLoopContext::getRuleIndex() const {
  return TParser::RuleBlockLoop;
}

void TParser::BlockLoopContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockLoop(this);
}

void TParser::BlockLoopContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockLoop(this);
}


antlrcpp::Any TParser::BlockLoopContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockLoop(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockLoopContext* TParser::blockLoop() {
  BlockLoopContext *_localctx = _tracker.createInstance<BlockLoopContext>(_ctx, getState());
  enterRule(_localctx, 52, TParser::RuleBlockLoop);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(391);
    match(TParser::For);
    setState(395);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 25, _ctx)) {
    case 1: {
      setState(392);
      loopInfinite();
      break;
    }

    case 2: {
      setState(393);
      loopConditional();
      break;
    }

    case 3: {
      setState(394);
      loopComplete();
      break;
    }

    default:
      break;
    }
    setState(397);
    loopBlockElements();
   
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

TParser::CodeBlockFlowControlContext* TParser::LoopBlockElementsContext::codeBlockFlowControl() {
  return getRuleContext<TParser::CodeBlockFlowControlContext>(0);
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
  enterRule(_localctx, 54, TParser::RuleLoopBlockElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(399);
    codeBlockFlowControl();
   
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

tree::TerminalNode* TParser::LoopCompleteContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
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
  enterRule(_localctx, 56, TParser::RuleLoopComplete);
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
    setState(402);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::OpenOp) {
      setState(401);
      match(TParser::OpenOp);
    }
    setState(404);
    loopOneMembers();
    setState(405);
    endOne();
    setState(406);
    loopTwoMembers();
    setState(407);
    endTwo();
    setState(408);
    loopThreeMembers();
    setState(410);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::CloseOp) {
      setState(409);
      match(TParser::CloseOp);
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
  enterRule(_localctx, 58, TParser::RuleLoopConditional);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(412);
    loopTwoMembers();
   
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
  enterRule(_localctx, 60, TParser::RuleLoopInfinite);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(417);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::OpenOp: {
        enterOuterAlt(_localctx, 1);
        setState(414);
        match(TParser::OpenOp);
        setState(415);
        match(TParser::CloseOp);
        break;
      }

      case TParser::If:
      case TParser::For:
      case TParser::Ret:
      case TParser::Break:
      case TParser::Next:
      case TParser::Try:
      case TParser::OpenBlock:
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
  enterRule(_localctx, 62, TParser::RuleEndOne);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(419);
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
  enterRule(_localctx, 64, TParser::RuleEndTwo);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
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

//----------------- LoopOneMembersContext ------------------------------------------------------------------

TParser::LoopOneMembersContext::LoopOneMembersContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::LoopOneMembersContext::Var() {
  return getToken(TParser::Var, 0);
}

TParser::VariableItemContext* TParser::LoopOneMembersContext::variableItem() {
  return getRuleContext<TParser::VariableItemContext>(0);
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
  enterRule(_localctx, 66, TParser::RuleLoopOneMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(426);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Var: {
        enterOuterAlt(_localctx, 1);
        setState(423);
        match(TParser::Var);
        setState(424);
        variableItem();
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

TParser::GeneralValueElementsContext* TParser::LoopTwoMembersContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
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
  enterRule(_localctx, 68, TParser::RuleLoopTwoMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(430);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 30, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(428);
      generalValueElements();
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
  enterRule(_localctx, 70, TParser::RuleLoopThreeMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(434);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 31, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(432);
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

std::vector<TParser::GeneralValueElementsContext *> TParser::LoopThreeMembersValuesContext::generalValueElements() {
  return getRuleContexts<TParser::GeneralValueElementsContext>();
}

TParser::GeneralValueElementsContext* TParser::LoopThreeMembersValuesContext::generalValueElements(size_t i) {
  return getRuleContext<TParser::GeneralValueElementsContext>(i);
}

std::vector<tree::TerminalNode *> TParser::LoopThreeMembersValuesContext::Separator() {
  return getTokens(TParser::Separator);
}

tree::TerminalNode* TParser::LoopThreeMembersValuesContext::Separator(size_t i) {
  return getToken(TParser::Separator, i);
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
  enterRule(_localctx, 72, TParser::RuleLoopThreeMembersValues);
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
    setState(436);
    generalValueElements();
    setState(441);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == TParser::Separator) {
      setState(437);
      match(TParser::Separator);
      setState(438);
      generalValueElements();
      setState(443);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockBreakContext ------------------------------------------------------------------

TParser::BlockBreakContext::BlockBreakContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BlockBreakContext::Break() {
  return getToken(TParser::Break, 0);
}

tree::TerminalNode* TParser::BlockBreakContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::BlockBreakContext::getRuleIndex() const {
  return TParser::RuleBlockBreak;
}

void TParser::BlockBreakContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockBreak(this);
}

void TParser::BlockBreakContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockBreak(this);
}


antlrcpp::Any TParser::BlockBreakContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockBreak(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockBreakContext* TParser::blockBreak() {
  BlockBreakContext *_localctx = _tracker.createInstance<BlockBreakContext>(_ctx, getState());
  enterRule(_localctx, 74, TParser::RuleBlockBreak);

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
    match(TParser::Break);
    setState(445);
    match(TParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockNextContext ------------------------------------------------------------------

TParser::BlockNextContext::BlockNextContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BlockNextContext::Next() {
  return getToken(TParser::Next, 0);
}

tree::TerminalNode* TParser::BlockNextContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::BlockNextContext::getRuleIndex() const {
  return TParser::RuleBlockNext;
}

void TParser::BlockNextContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockNext(this);
}

void TParser::BlockNextContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockNext(this);
}


antlrcpp::Any TParser::BlockNextContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockNext(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockNextContext* TParser::blockNext() {
  BlockNextContext *_localctx = _tracker.createInstance<BlockNextContext>(_ctx, getState());
  enterRule(_localctx, 76, TParser::RuleBlockNext);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(447);
    match(TParser::Next);
    setState(448);
    match(TParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockTryCatchContext ------------------------------------------------------------------

TParser::BlockTryCatchContext::BlockTryCatchContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::TryUniqueElementContext* TParser::BlockTryCatchContext::tryUniqueElement() {
  return getRuleContext<TParser::TryUniqueElementContext>(0);
}

TParser::CatchUniqueElementContext* TParser::BlockTryCatchContext::catchUniqueElement() {
  return getRuleContext<TParser::CatchUniqueElementContext>(0);
}


size_t TParser::BlockTryCatchContext::getRuleIndex() const {
  return TParser::RuleBlockTryCatch;
}

void TParser::BlockTryCatchContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockTryCatch(this);
}

void TParser::BlockTryCatchContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockTryCatch(this);
}


antlrcpp::Any TParser::BlockTryCatchContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockTryCatch(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockTryCatchContext* TParser::blockTryCatch() {
  BlockTryCatchContext *_localctx = _tracker.createInstance<BlockTryCatchContext>(_ctx, getState());
  enterRule(_localctx, 78, TParser::RuleBlockTryCatch);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(450);
    tryUniqueElement();
    setState(452);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 33, _ctx)) {
    case 1: {
      setState(451);
      catchUniqueElement();
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

//----------------- TryUniqueElementContext ------------------------------------------------------------------

TParser::TryUniqueElementContext::TryUniqueElementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::TryUniqueElementContext::Try() {
  return getToken(TParser::Try, 0);
}

TParser::TryCatchElementsContext* TParser::TryUniqueElementContext::tryCatchElements() {
  return getRuleContext<TParser::TryCatchElementsContext>(0);
}


size_t TParser::TryUniqueElementContext::getRuleIndex() const {
  return TParser::RuleTryUniqueElement;
}

void TParser::TryUniqueElementContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterTryUniqueElement(this);
}

void TParser::TryUniqueElementContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitTryUniqueElement(this);
}


antlrcpp::Any TParser::TryUniqueElementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitTryUniqueElement(this);
  else
    return visitor->visitChildren(this);
}

TParser::TryUniqueElementContext* TParser::tryUniqueElement() {
  TryUniqueElementContext *_localctx = _tracker.createInstance<TryUniqueElementContext>(_ctx, getState());
  enterRule(_localctx, 80, TParser::RuleTryUniqueElement);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(454);
    match(TParser::Try);
    setState(455);
    tryCatchElements();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- CatchUniqueElementContext ------------------------------------------------------------------

TParser::CatchUniqueElementContext::CatchUniqueElementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::CatchUniqueElementContext::Catch() {
  return getToken(TParser::Catch, 0);
}

TParser::IdentifierContext* TParser::CatchUniqueElementContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

TParser::TryCatchElementsContext* TParser::CatchUniqueElementContext::tryCatchElements() {
  return getRuleContext<TParser::TryCatchElementsContext>(0);
}

tree::TerminalNode* TParser::CatchUniqueElementContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

tree::TerminalNode* TParser::CatchUniqueElementContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}


size_t TParser::CatchUniqueElementContext::getRuleIndex() const {
  return TParser::RuleCatchUniqueElement;
}

void TParser::CatchUniqueElementContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterCatchUniqueElement(this);
}

void TParser::CatchUniqueElementContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitCatchUniqueElement(this);
}


antlrcpp::Any TParser::CatchUniqueElementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitCatchUniqueElement(this);
  else
    return visitor->visitChildren(this);
}

TParser::CatchUniqueElementContext* TParser::catchUniqueElement() {
  CatchUniqueElementContext *_localctx = _tracker.createInstance<CatchUniqueElementContext>(_ctx, getState());
  enterRule(_localctx, 82, TParser::RuleCatchUniqueElement);
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
    setState(457);
    match(TParser::Catch);
    setState(459);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::OpenOp) {
      setState(458);
      match(TParser::OpenOp);
    }
    setState(461);
    identifier();
    setState(463);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::CloseOp) {
      setState(462);
      match(TParser::CloseOp);
    }
    setState(465);
    tryCatchElements();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- TryCatchElementsContext ------------------------------------------------------------------

TParser::TryCatchElementsContext::TryCatchElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::CodeBlockFlowControlContext* TParser::TryCatchElementsContext::codeBlockFlowControl() {
  return getRuleContext<TParser::CodeBlockFlowControlContext>(0);
}


size_t TParser::TryCatchElementsContext::getRuleIndex() const {
  return TParser::RuleTryCatchElements;
}

void TParser::TryCatchElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterTryCatchElements(this);
}

void TParser::TryCatchElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitTryCatchElements(this);
}


antlrcpp::Any TParser::TryCatchElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitTryCatchElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::TryCatchElementsContext* TParser::tryCatchElements() {
  TryCatchElementsContext *_localctx = _tracker.createInstance<TryCatchElementsContext>(_ctx, getState());
  enterRule(_localctx, 84, TParser::RuleTryCatchElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(467);
    codeBlockFlowControl();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockFunctionContext ------------------------------------------------------------------

TParser::BlockFunctionContext::BlockFunctionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> TParser::BlockFunctionContext::OpenOp() {
  return getTokens(TParser::OpenOp);
}

tree::TerminalNode* TParser::BlockFunctionContext::OpenOp(size_t i) {
  return getToken(TParser::OpenOp, i);
}

tree::TerminalNode* TParser::BlockFunctionContext::Function() {
  return getToken(TParser::Function, 0);
}

std::vector<tree::TerminalNode *> TParser::BlockFunctionContext::CloseOp() {
  return getTokens(TParser::CloseOp);
}

tree::TerminalNode* TParser::BlockFunctionContext::CloseOp(size_t i) {
  return getToken(TParser::CloseOp, i);
}

TParser::FunctionCodeBlockContext* TParser::BlockFunctionContext::functionCodeBlock() {
  return getRuleContext<TParser::FunctionCodeBlockContext>(0);
}

TParser::OpenOpAContext* TParser::BlockFunctionContext::openOpA() {
  return getRuleContext<TParser::OpenOpAContext>(0);
}

TParser::CloseOpAContext* TParser::BlockFunctionContext::closeOpA() {
  return getRuleContext<TParser::CloseOpAContext>(0);
}

tree::TerminalNode* TParser::BlockFunctionContext::End() {
  return getToken(TParser::End, 0);
}

TParser::IdentifierContext* TParser::BlockFunctionContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

TParser::FunctionParamContext* TParser::BlockFunctionContext::functionParam() {
  return getRuleContext<TParser::FunctionParamContext>(0);
}

tree::TerminalNode* TParser::BlockFunctionContext::ArrowRight() {
  return getToken(TParser::ArrowRight, 0);
}

TParser::FunctionAnonymousParamElementsContext* TParser::BlockFunctionContext::functionAnonymousParamElements() {
  return getRuleContext<TParser::FunctionAnonymousParamElementsContext>(0);
}

TParser::IdentifierBContext* TParser::BlockFunctionContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}

tree::TerminalNode* TParser::BlockFunctionContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}


size_t TParser::BlockFunctionContext::getRuleIndex() const {
  return TParser::RuleBlockFunction;
}

void TParser::BlockFunctionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockFunction(this);
}

void TParser::BlockFunctionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockFunction(this);
}


antlrcpp::Any TParser::BlockFunctionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockFunction(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockFunctionContext* TParser::blockFunction() {
  BlockFunctionContext *_localctx = _tracker.createInstance<BlockFunctionContext>(_ctx, getState());
  enterRule(_localctx, 86, TParser::RuleBlockFunction);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(515);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::OpenOp: {
        enterOuterAlt(_localctx, 1);
        setState(469);
        match(TParser::OpenOp);
        setState(470);
        match(TParser::Function);
        setState(472);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(471);
          identifier();
        }
        setState(474);
        match(TParser::OpenOp);
        setState(476);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(475);
          functionParam();
        }
        setState(478);
        match(TParser::CloseOp);
        setState(484);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::ArrowRight) {
          setState(479);
          match(TParser::ArrowRight);
          setState(482);
          _errHandler->sync(this);
          switch (_input->LA(1)) {
            case TParser::Identifier: {
              setState(480);
              identifierB();
              break;
            }

            case TParser::TypeSpec: {
              setState(481);
              match(TParser::TypeSpec);
              break;
            }

          default:
            throw NoViableAltException(this);
          }
        }
        setState(486);
        functionCodeBlock();
        setState(487);
        match(TParser::CloseOp);
        setState(488);
        openOpA();
        setState(490);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if ((((_la & ~ 0x3fULL) == 0) &&
          ((1ULL << _la) & ((1ULL << TParser::Function)
          | (1ULL << TParser::Class)
          | (1ULL << TParser::OpenArIndex)
          | (1ULL << TParser::OpenBlock)
          | (1ULL << TParser::OpenOp)
          | (1ULL << TParser::Not)
          | (1ULL << TParser::IncDecOperators)
          | (1ULL << TParser::Identifier)
          | (1ULL << TParser::Integer)
          | (1ULL << TParser::Float)
          | (1ULL << TParser::String))) != 0)) {
          setState(489);
          functionAnonymousParamElements();
        }
        setState(492);
        closeOpA();
        setState(493);
        match(TParser::End);
        break;
      }

      case TParser::Function: {
        enterOuterAlt(_localctx, 2);
        setState(495);
        match(TParser::Function);
        setState(497);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(496);
          identifier();
        }
        setState(499);
        match(TParser::OpenOp);
        setState(501);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(500);
          functionParam();
        }
        setState(503);
        match(TParser::CloseOp);
        setState(509);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::ArrowRight) {
          setState(504);
          match(TParser::ArrowRight);
          setState(507);
          _errHandler->sync(this);
          switch (_input->LA(1)) {
            case TParser::Identifier: {
              setState(505);
              identifierB();
              break;
            }

            case TParser::TypeSpec: {
              setState(506);
              match(TParser::TypeSpec);
              break;
            }

          default:
            throw NoViableAltException(this);
          }
        }
        setState(513);
        _errHandler->sync(this);
        switch (_input->LA(1)) {
          case TParser::OpenBlock: {
            setState(511);
            functionCodeBlock();
            break;
          }

          case TParser::End: {
            setState(512);
            match(TParser::End);
            break;
          }

        default:
          throw NoViableAltException(this);
        }
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

//----------------- BlockFunctionDeclarationAttrContext ------------------------------------------------------------------

TParser::BlockFunctionDeclarationAttrContext::BlockFunctionDeclarationAttrContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> TParser::BlockFunctionDeclarationAttrContext::OpenOp() {
  return getTokens(TParser::OpenOp);
}

tree::TerminalNode* TParser::BlockFunctionDeclarationAttrContext::OpenOp(size_t i) {
  return getToken(TParser::OpenOp, i);
}

tree::TerminalNode* TParser::BlockFunctionDeclarationAttrContext::Function() {
  return getToken(TParser::Function, 0);
}

std::vector<tree::TerminalNode *> TParser::BlockFunctionDeclarationAttrContext::CloseOp() {
  return getTokens(TParser::CloseOp);
}

tree::TerminalNode* TParser::BlockFunctionDeclarationAttrContext::CloseOp(size_t i) {
  return getToken(TParser::CloseOp, i);
}

TParser::FunctionCodeBlockContext* TParser::BlockFunctionDeclarationAttrContext::functionCodeBlock() {
  return getRuleContext<TParser::FunctionCodeBlockContext>(0);
}

TParser::OpenOpAContext* TParser::BlockFunctionDeclarationAttrContext::openOpA() {
  return getRuleContext<TParser::OpenOpAContext>(0);
}

TParser::CloseOpAContext* TParser::BlockFunctionDeclarationAttrContext::closeOpA() {
  return getRuleContext<TParser::CloseOpAContext>(0);
}

TParser::IdentifierContext* TParser::BlockFunctionDeclarationAttrContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

TParser::FunctionParamContext* TParser::BlockFunctionDeclarationAttrContext::functionParam() {
  return getRuleContext<TParser::FunctionParamContext>(0);
}

tree::TerminalNode* TParser::BlockFunctionDeclarationAttrContext::ArrowRight() {
  return getToken(TParser::ArrowRight, 0);
}

TParser::FunctionAnonymousParamElementsContext* TParser::BlockFunctionDeclarationAttrContext::functionAnonymousParamElements() {
  return getRuleContext<TParser::FunctionAnonymousParamElementsContext>(0);
}

TParser::IdentifierBContext* TParser::BlockFunctionDeclarationAttrContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}

tree::TerminalNode* TParser::BlockFunctionDeclarationAttrContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}


size_t TParser::BlockFunctionDeclarationAttrContext::getRuleIndex() const {
  return TParser::RuleBlockFunctionDeclarationAttr;
}

void TParser::BlockFunctionDeclarationAttrContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockFunctionDeclarationAttr(this);
}

void TParser::BlockFunctionDeclarationAttrContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockFunctionDeclarationAttr(this);
}


antlrcpp::Any TParser::BlockFunctionDeclarationAttrContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockFunctionDeclarationAttr(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockFunctionDeclarationAttrContext* TParser::blockFunctionDeclarationAttr() {
  BlockFunctionDeclarationAttrContext *_localctx = _tracker.createInstance<BlockFunctionDeclarationAttrContext>(_ctx, getState());
  enterRule(_localctx, 88, TParser::RuleBlockFunctionDeclarationAttr);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(559);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::OpenOp: {
        enterOuterAlt(_localctx, 1);
        setState(517);
        match(TParser::OpenOp);
        setState(518);
        match(TParser::Function);
        setState(520);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(519);
          identifier();
        }
        setState(522);
        match(TParser::OpenOp);
        setState(524);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(523);
          functionParam();
        }
        setState(526);
        match(TParser::CloseOp);
        setState(532);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::ArrowRight) {
          setState(527);
          match(TParser::ArrowRight);
          setState(530);
          _errHandler->sync(this);
          switch (_input->LA(1)) {
            case TParser::Identifier: {
              setState(528);
              identifierB();
              break;
            }

            case TParser::TypeSpec: {
              setState(529);
              match(TParser::TypeSpec);
              break;
            }

          default:
            throw NoViableAltException(this);
          }
        }
        setState(534);
        functionCodeBlock();
        setState(535);
        match(TParser::CloseOp);
        setState(536);
        openOpA();
        setState(538);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if ((((_la & ~ 0x3fULL) == 0) &&
          ((1ULL << _la) & ((1ULL << TParser::Function)
          | (1ULL << TParser::Class)
          | (1ULL << TParser::OpenArIndex)
          | (1ULL << TParser::OpenBlock)
          | (1ULL << TParser::OpenOp)
          | (1ULL << TParser::Not)
          | (1ULL << TParser::IncDecOperators)
          | (1ULL << TParser::Identifier)
          | (1ULL << TParser::Integer)
          | (1ULL << TParser::Float)
          | (1ULL << TParser::String))) != 0)) {
          setState(537);
          functionAnonymousParamElements();
        }
        setState(540);
        closeOpA();
        break;
      }

      case TParser::Function: {
        enterOuterAlt(_localctx, 2);
        setState(542);
        match(TParser::Function);
        setState(544);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(543);
          identifier();
        }
        setState(546);
        match(TParser::OpenOp);
        setState(548);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(547);
          functionParam();
        }
        setState(550);
        match(TParser::CloseOp);
        setState(556);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::ArrowRight) {
          setState(551);
          match(TParser::ArrowRight);
          setState(554);
          _errHandler->sync(this);
          switch (_input->LA(1)) {
            case TParser::Identifier: {
              setState(552);
              identifierB();
              break;
            }

            case TParser::TypeSpec: {
              setState(553);
              match(TParser::TypeSpec);
              break;
            }

          default:
            throw NoViableAltException(this);
          }
        }
        setState(558);
        functionCodeBlock();
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

//----------------- FunctionParamContext ------------------------------------------------------------------

TParser::FunctionParamContext::FunctionParamContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::FunctionParamContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::FunctionParamContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}

tree::TerminalNode* TParser::FunctionParamContext::Separator() {
  return getToken(TParser::Separator, 0);
}

TParser::FunctionParamContext* TParser::FunctionParamContext::functionParam() {
  return getRuleContext<TParser::FunctionParamContext>(0);
}


size_t TParser::FunctionParamContext::getRuleIndex() const {
  return TParser::RuleFunctionParam;
}

void TParser::FunctionParamContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionParam(this);
}

void TParser::FunctionParamContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionParam(this);
}


antlrcpp::Any TParser::FunctionParamContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionParam(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionParamContext* TParser::functionParam() {
  FunctionParamContext *_localctx = _tracker.createInstance<FunctionParamContext>(_ctx, getState());
  enterRule(_localctx, 90, TParser::RuleFunctionParam);
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
    setState(561);
    match(TParser::Identifier);
    setState(562);
    match(TParser::TypeSpec);
    setState(565);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::Separator) {
      setState(563);
      match(TParser::Separator);
      setState(564);
      functionParam();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionAnonymousParamElementsContext ------------------------------------------------------------------

TParser::FunctionAnonymousParamElementsContext::FunctionAnonymousParamElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<TParser::FunctionAnonymousParamContext *> TParser::FunctionAnonymousParamElementsContext::functionAnonymousParam() {
  return getRuleContexts<TParser::FunctionAnonymousParamContext>();
}

TParser::FunctionAnonymousParamContext* TParser::FunctionAnonymousParamElementsContext::functionAnonymousParam(size_t i) {
  return getRuleContext<TParser::FunctionAnonymousParamContext>(i);
}

std::vector<tree::TerminalNode *> TParser::FunctionAnonymousParamElementsContext::Separator() {
  return getTokens(TParser::Separator);
}

tree::TerminalNode* TParser::FunctionAnonymousParamElementsContext::Separator(size_t i) {
  return getToken(TParser::Separator, i);
}


size_t TParser::FunctionAnonymousParamElementsContext::getRuleIndex() const {
  return TParser::RuleFunctionAnonymousParamElements;
}

void TParser::FunctionAnonymousParamElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionAnonymousParamElements(this);
}

void TParser::FunctionAnonymousParamElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionAnonymousParamElements(this);
}


antlrcpp::Any TParser::FunctionAnonymousParamElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionAnonymousParamElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionAnonymousParamElementsContext* TParser::functionAnonymousParamElements() {
  FunctionAnonymousParamElementsContext *_localctx = _tracker.createInstance<FunctionAnonymousParamElementsContext>(_ctx, getState());
  enterRule(_localctx, 92, TParser::RuleFunctionAnonymousParamElements);
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
    setState(567);
    functionAnonymousParam();
    setState(572);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == TParser::Separator) {
      setState(568);
      match(TParser::Separator);
      setState(569);
      functionAnonymousParam();
      setState(574);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionAnonymousParamContext ------------------------------------------------------------------

TParser::FunctionAnonymousParamContext::FunctionAnonymousParamContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::GeneralValueElementsContext* TParser::FunctionAnonymousParamContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
}


size_t TParser::FunctionAnonymousParamContext::getRuleIndex() const {
  return TParser::RuleFunctionAnonymousParam;
}

void TParser::FunctionAnonymousParamContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionAnonymousParam(this);
}

void TParser::FunctionAnonymousParamContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionAnonymousParam(this);
}


antlrcpp::Any TParser::FunctionAnonymousParamContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionAnonymousParam(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionAnonymousParamContext* TParser::functionAnonymousParam() {
  FunctionAnonymousParamContext *_localctx = _tracker.createInstance<FunctionAnonymousParamContext>(_ctx, getState());
  enterRule(_localctx, 94, TParser::RuleFunctionAnonymousParam);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(575);
    generalValueElements();
   
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

TParser::CodeBlockControlContext* TParser::FunctionCodeBlockContext::codeBlockControl() {
  return getRuleContext<TParser::CodeBlockControlContext>(0);
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
  enterRule(_localctx, 96, TParser::RuleFunctionCodeBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(577);
    codeBlockControl();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockInterfaceContext ------------------------------------------------------------------

TParser::BlockInterfaceContext::BlockInterfaceContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BlockInterfaceContext::Interface() {
  return getToken(TParser::Interface, 0);
}

TParser::IdentifierContext* TParser::BlockInterfaceContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

TParser::InterfaceCodeBlockContext* TParser::BlockInterfaceContext::interfaceCodeBlock() {
  return getRuleContext<TParser::InterfaceCodeBlockContext>(0);
}

tree::TerminalNode* TParser::BlockInterfaceContext::Extends() {
  return getToken(TParser::Extends, 0);
}

TParser::IdentifierBContext* TParser::BlockInterfaceContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}


size_t TParser::BlockInterfaceContext::getRuleIndex() const {
  return TParser::RuleBlockInterface;
}

void TParser::BlockInterfaceContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockInterface(this);
}

void TParser::BlockInterfaceContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockInterface(this);
}


antlrcpp::Any TParser::BlockInterfaceContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockInterface(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockInterfaceContext* TParser::blockInterface() {
  BlockInterfaceContext *_localctx = _tracker.createInstance<BlockInterfaceContext>(_ctx, getState());
  enterRule(_localctx, 98, TParser::RuleBlockInterface);
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
    setState(579);
    match(TParser::Interface);
    setState(580);
    identifier();
    setState(583);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::Extends) {
      setState(581);
      match(TParser::Extends);
      setState(582);
      identifierB();
    }
    setState(585);
    interfaceCodeBlock();
   
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

TParser::CodeBlockControlContext* TParser::InterfaceCodeBlockContext::codeBlockControl() {
  return getRuleContext<TParser::CodeBlockControlContext>(0);
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
  enterRule(_localctx, 100, TParser::RuleInterfaceCodeBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(587);
    codeBlockControl();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockAbstractionContext ------------------------------------------------------------------

TParser::BlockAbstractionContext::BlockAbstractionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BlockAbstractionContext::Abstract() {
  return getToken(TParser::Abstract, 0);
}

TParser::IdentifierContext* TParser::BlockAbstractionContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

TParser::AbstractionCodeBlockContext* TParser::BlockAbstractionContext::abstractionCodeBlock() {
  return getRuleContext<TParser::AbstractionCodeBlockContext>(0);
}

tree::TerminalNode* TParser::BlockAbstractionContext::Extends() {
  return getToken(TParser::Extends, 0);
}

TParser::IdentifierBContext* TParser::BlockAbstractionContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}


size_t TParser::BlockAbstractionContext::getRuleIndex() const {
  return TParser::RuleBlockAbstraction;
}

void TParser::BlockAbstractionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockAbstraction(this);
}

void TParser::BlockAbstractionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockAbstraction(this);
}


antlrcpp::Any TParser::BlockAbstractionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockAbstraction(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockAbstractionContext* TParser::blockAbstraction() {
  BlockAbstractionContext *_localctx = _tracker.createInstance<BlockAbstractionContext>(_ctx, getState());
  enterRule(_localctx, 102, TParser::RuleBlockAbstraction);
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
    setState(589);
    match(TParser::Abstract);
    setState(590);
    identifier();
    setState(593);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::Extends) {
      setState(591);
      match(TParser::Extends);
      setState(592);
      identifierB();
    }
    setState(595);
    abstractionCodeBlock();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AbstractionCodeBlockContext ------------------------------------------------------------------

TParser::AbstractionCodeBlockContext::AbstractionCodeBlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::CodeBlockControlContext* TParser::AbstractionCodeBlockContext::codeBlockControl() {
  return getRuleContext<TParser::CodeBlockControlContext>(0);
}


size_t TParser::AbstractionCodeBlockContext::getRuleIndex() const {
  return TParser::RuleAbstractionCodeBlock;
}

void TParser::AbstractionCodeBlockContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAbstractionCodeBlock(this);
}

void TParser::AbstractionCodeBlockContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAbstractionCodeBlock(this);
}


antlrcpp::Any TParser::AbstractionCodeBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitAbstractionCodeBlock(this);
  else
    return visitor->visitChildren(this);
}

TParser::AbstractionCodeBlockContext* TParser::abstractionCodeBlock() {
  AbstractionCodeBlockContext *_localctx = _tracker.createInstance<AbstractionCodeBlockContext>(_ctx, getState());
  enterRule(_localctx, 104, TParser::RuleAbstractionCodeBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(597);
    codeBlockControl();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockClassContext ------------------------------------------------------------------

TParser::BlockClassContext::BlockClassContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::OpenOpAContext* TParser::BlockClassContext::openOpA() {
  return getRuleContext<TParser::OpenOpAContext>(0);
}

tree::TerminalNode* TParser::BlockClassContext::New() {
  return getToken(TParser::New, 0);
}

tree::TerminalNode* TParser::BlockClassContext::Class() {
  return getToken(TParser::Class, 0);
}

TParser::ClassCodeBlockContext* TParser::BlockClassContext::classCodeBlock() {
  return getRuleContext<TParser::ClassCodeBlockContext>(0);
}

TParser::CloseOpAContext* TParser::BlockClassContext::closeOpA() {
  return getRuleContext<TParser::CloseOpAContext>(0);
}

TParser::IdentifierContext* TParser::BlockClassContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

tree::TerminalNode* TParser::BlockClassContext::Extends() {
  return getToken(TParser::Extends, 0);
}

TParser::IdentifierBContext* TParser::BlockClassContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}

tree::TerminalNode* TParser::BlockClassContext::Implements() {
  return getToken(TParser::Implements, 0);
}

TParser::IdentifierCContext* TParser::BlockClassContext::identifierC() {
  return getRuleContext<TParser::IdentifierCContext>(0);
}

TParser::IdentifierDContext* TParser::BlockClassContext::identifierD() {
  return getRuleContext<TParser::IdentifierDContext>(0);
}

tree::TerminalNode* TParser::BlockClassContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

tree::TerminalNode* TParser::BlockClassContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}

tree::TerminalNode* TParser::BlockClassContext::End() {
  return getToken(TParser::End, 0);
}

tree::TerminalNode* TParser::BlockClassContext::Point() {
  return getToken(TParser::Point, 0);
}

tree::TerminalNode* TParser::BlockClassContext::TwoTwoPoint() {
  return getToken(TParser::TwoTwoPoint, 0);
}

TParser::GeneralValueElementsContext* TParser::BlockClassContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
}


size_t TParser::BlockClassContext::getRuleIndex() const {
  return TParser::RuleBlockClass;
}

void TParser::BlockClassContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockClass(this);
}

void TParser::BlockClassContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockClass(this);
}


antlrcpp::Any TParser::BlockClassContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockClass(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockClassContext* TParser::blockClass() {
  BlockClassContext *_localctx = _tracker.createInstance<BlockClassContext>(_ctx, getState());
  enterRule(_localctx, 106, TParser::RuleBlockClass);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(641);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::OpenOp: {
        enterOuterAlt(_localctx, 1);
        setState(599);
        openOpA();
        setState(600);
        match(TParser::New);
        setState(601);
        match(TParser::Class);
        setState(603);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(602);
          identifier();
        }
        setState(607);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Extends) {
          setState(605);
          match(TParser::Extends);
          setState(606);
          identifierB();
        }
        setState(611);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Implements) {
          setState(609);
          match(TParser::Implements);
          setState(610);
          identifierC();
        }
        setState(613);
        classCodeBlock();
        setState(614);
        closeOpA();
        setState(623);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Point

        || _la == TParser::TwoTwoPoint) {
          setState(615);
          _la = _input->LA(1);
          if (!(_la == TParser::Point

          || _la == TParser::TwoTwoPoint)) {
          _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          setState(616);
          identifierD();
          setState(617);
          match(TParser::OpenOp);
          setState(619);
          _errHandler->sync(this);

          _la = _input->LA(1);
          if ((((_la & ~ 0x3fULL) == 0) &&
            ((1ULL << _la) & ((1ULL << TParser::Function)
            | (1ULL << TParser::Class)
            | (1ULL << TParser::OpenArIndex)
            | (1ULL << TParser::OpenBlock)
            | (1ULL << TParser::OpenOp)
            | (1ULL << TParser::Not)
            | (1ULL << TParser::IncDecOperators)
            | (1ULL << TParser::Identifier)
            | (1ULL << TParser::Integer)
            | (1ULL << TParser::Float)
            | (1ULL << TParser::String))) != 0)) {
            setState(618);
            generalValueElements();
          }
          setState(621);
          match(TParser::CloseOp);
        }
        setState(626);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::End) {
          setState(625);
          match(TParser::End);
        }
        break;
      }

      case TParser::Class: {
        enterOuterAlt(_localctx, 2);
        setState(628);
        match(TParser::Class);
        setState(630);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(629);
          identifier();
        }
        setState(634);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Extends) {
          setState(632);
          match(TParser::Extends);
          setState(633);
          identifierB();
        }
        setState(638);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Implements) {
          setState(636);
          match(TParser::Implements);
          setState(637);
          identifierC();
        }
        setState(640);
        classCodeBlock();
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

//----------------- BlockClassDeclarationAttrContext ------------------------------------------------------------------

TParser::BlockClassDeclarationAttrContext::BlockClassDeclarationAttrContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::OpenOpAContext* TParser::BlockClassDeclarationAttrContext::openOpA() {
  return getRuleContext<TParser::OpenOpAContext>(0);
}

tree::TerminalNode* TParser::BlockClassDeclarationAttrContext::New() {
  return getToken(TParser::New, 0);
}

tree::TerminalNode* TParser::BlockClassDeclarationAttrContext::Class() {
  return getToken(TParser::Class, 0);
}

TParser::ClassCodeBlockContext* TParser::BlockClassDeclarationAttrContext::classCodeBlock() {
  return getRuleContext<TParser::ClassCodeBlockContext>(0);
}

TParser::CloseOpAContext* TParser::BlockClassDeclarationAttrContext::closeOpA() {
  return getRuleContext<TParser::CloseOpAContext>(0);
}

TParser::IdentifierContext* TParser::BlockClassDeclarationAttrContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

tree::TerminalNode* TParser::BlockClassDeclarationAttrContext::Extends() {
  return getToken(TParser::Extends, 0);
}

TParser::IdentifierBContext* TParser::BlockClassDeclarationAttrContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}

tree::TerminalNode* TParser::BlockClassDeclarationAttrContext::Implements() {
  return getToken(TParser::Implements, 0);
}

TParser::IdentifierCContext* TParser::BlockClassDeclarationAttrContext::identifierC() {
  return getRuleContext<TParser::IdentifierCContext>(0);
}

TParser::IdentifierDContext* TParser::BlockClassDeclarationAttrContext::identifierD() {
  return getRuleContext<TParser::IdentifierDContext>(0);
}

tree::TerminalNode* TParser::BlockClassDeclarationAttrContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

tree::TerminalNode* TParser::BlockClassDeclarationAttrContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}

tree::TerminalNode* TParser::BlockClassDeclarationAttrContext::Point() {
  return getToken(TParser::Point, 0);
}

tree::TerminalNode* TParser::BlockClassDeclarationAttrContext::TwoTwoPoint() {
  return getToken(TParser::TwoTwoPoint, 0);
}

TParser::GeneralValueElementsContext* TParser::BlockClassDeclarationAttrContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
}


size_t TParser::BlockClassDeclarationAttrContext::getRuleIndex() const {
  return TParser::RuleBlockClassDeclarationAttr;
}

void TParser::BlockClassDeclarationAttrContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockClassDeclarationAttr(this);
}

void TParser::BlockClassDeclarationAttrContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockClassDeclarationAttr(this);
}


antlrcpp::Any TParser::BlockClassDeclarationAttrContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockClassDeclarationAttr(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockClassDeclarationAttrContext* TParser::blockClassDeclarationAttr() {
  BlockClassDeclarationAttrContext *_localctx = _tracker.createInstance<BlockClassDeclarationAttrContext>(_ctx, getState());
  enterRule(_localctx, 108, TParser::RuleBlockClassDeclarationAttr);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(682);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::OpenOp: {
        enterOuterAlt(_localctx, 1);
        setState(643);
        openOpA();
        setState(644);
        match(TParser::New);
        setState(645);
        match(TParser::Class);
        setState(647);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(646);
          identifier();
        }
        setState(651);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Extends) {
          setState(649);
          match(TParser::Extends);
          setState(650);
          identifierB();
        }
        setState(655);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Implements) {
          setState(653);
          match(TParser::Implements);
          setState(654);
          identifierC();
        }
        setState(657);
        classCodeBlock();
        setState(658);
        closeOpA();
        setState(667);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Point

        || _la == TParser::TwoTwoPoint) {
          setState(659);
          _la = _input->LA(1);
          if (!(_la == TParser::Point

          || _la == TParser::TwoTwoPoint)) {
          _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          setState(660);
          identifierD();
          setState(661);
          match(TParser::OpenOp);
          setState(663);
          _errHandler->sync(this);

          _la = _input->LA(1);
          if ((((_la & ~ 0x3fULL) == 0) &&
            ((1ULL << _la) & ((1ULL << TParser::Function)
            | (1ULL << TParser::Class)
            | (1ULL << TParser::OpenArIndex)
            | (1ULL << TParser::OpenBlock)
            | (1ULL << TParser::OpenOp)
            | (1ULL << TParser::Not)
            | (1ULL << TParser::IncDecOperators)
            | (1ULL << TParser::Identifier)
            | (1ULL << TParser::Integer)
            | (1ULL << TParser::Float)
            | (1ULL << TParser::String))) != 0)) {
            setState(662);
            generalValueElements();
          }
          setState(665);
          match(TParser::CloseOp);
        }
        break;
      }

      case TParser::Class: {
        enterOuterAlt(_localctx, 2);
        setState(669);
        match(TParser::Class);
        setState(671);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(670);
          identifier();
        }
        setState(675);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Extends) {
          setState(673);
          match(TParser::Extends);
          setState(674);
          identifierB();
        }
        setState(679);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Implements) {
          setState(677);
          match(TParser::Implements);
          setState(678);
          identifierC();
        }
        setState(681);
        classCodeBlock();
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

//----------------- ClassAnonymousParamContext ------------------------------------------------------------------

TParser::ClassAnonymousParamContext::ClassAnonymousParamContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::GeneralValueElementsContext* TParser::ClassAnonymousParamContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
}


size_t TParser::ClassAnonymousParamContext::getRuleIndex() const {
  return TParser::RuleClassAnonymousParam;
}

void TParser::ClassAnonymousParamContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterClassAnonymousParam(this);
}

void TParser::ClassAnonymousParamContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitClassAnonymousParam(this);
}


antlrcpp::Any TParser::ClassAnonymousParamContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitClassAnonymousParam(this);
  else
    return visitor->visitChildren(this);
}

TParser::ClassAnonymousParamContext* TParser::classAnonymousParam() {
  ClassAnonymousParamContext *_localctx = _tracker.createInstance<ClassAnonymousParamContext>(_ctx, getState());
  enterRule(_localctx, 110, TParser::RuleClassAnonymousParam);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(684);
    generalValueElements();
   
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

TParser::CodeBlockControlContext* TParser::ClassCodeBlockContext::codeBlockControl() {
  return getRuleContext<TParser::CodeBlockControlContext>(0);
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
  enterRule(_localctx, 112, TParser::RuleClassCodeBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(686);
    codeBlockControl();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockArrayContext ------------------------------------------------------------------

TParser::BlockArrayContext::BlockArrayContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::IndexArrayContext* TParser::BlockArrayContext::indexArray() {
  return getRuleContext<TParser::IndexArrayContext>(0);
}

TParser::AssociativeArrayContext* TParser::BlockArrayContext::associativeArray() {
  return getRuleContext<TParser::AssociativeArrayContext>(0);
}


size_t TParser::BlockArrayContext::getRuleIndex() const {
  return TParser::RuleBlockArray;
}

void TParser::BlockArrayContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockArray(this);
}

void TParser::BlockArrayContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockArray(this);
}


antlrcpp::Any TParser::BlockArrayContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockArray(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockArrayContext* TParser::blockArray() {
  BlockArrayContext *_localctx = _tracker.createInstance<BlockArrayContext>(_ctx, getState());
  enterRule(_localctx, 114, TParser::RuleBlockArray);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(690);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::OpenArIndex: {
        setState(688);
        indexArray();
        break;
      }

      case TParser::OpenBlock: {
        setState(689);
        associativeArray();
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

//----------------- IndexArrayContext ------------------------------------------------------------------

TParser::IndexArrayContext::IndexArrayContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::IndexArrayContext::OpenArIndex() {
  return getToken(TParser::OpenArIndex, 0);
}

TParser::IndexArrayElementsContext* TParser::IndexArrayContext::indexArrayElements() {
  return getRuleContext<TParser::IndexArrayElementsContext>(0);
}

tree::TerminalNode* TParser::IndexArrayContext::CloseArIndex() {
  return getToken(TParser::CloseArIndex, 0);
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
  enterRule(_localctx, 116, TParser::RuleIndexArray);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(692);
    match(TParser::OpenArIndex);
    setState(693);
    indexArrayElements();
    setState(694);
    match(TParser::CloseArIndex);
   
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

TParser::GeneralValueElementsContext* TParser::IndexArrayElementsContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
}

std::vector<tree::TerminalNode *> TParser::IndexArrayElementsContext::Separator() {
  return getTokens(TParser::Separator);
}

tree::TerminalNode* TParser::IndexArrayElementsContext::Separator(size_t i) {
  return getToken(TParser::Separator, i);
}

std::vector<TParser::IndexArrayElementsContext *> TParser::IndexArrayElementsContext::indexArrayElements() {
  return getRuleContexts<TParser::IndexArrayElementsContext>();
}

TParser::IndexArrayElementsContext* TParser::IndexArrayElementsContext::indexArrayElements(size_t i) {
  return getRuleContext<TParser::IndexArrayElementsContext>(i);
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
  enterRule(_localctx, 118, TParser::RuleIndexArrayElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(696);
    generalValueElements();
    setState(701);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 81, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(697);
        match(TParser::Separator);
        setState(698);
        indexArrayElements(); 
      }
      setState(703);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 81, _ctx);
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

TParser::AssociativeArrayElementsContext* TParser::AssociativeArrayContext::associativeArrayElements() {
  return getRuleContext<TParser::AssociativeArrayElementsContext>(0);
}

tree::TerminalNode* TParser::AssociativeArrayContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
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
  enterRule(_localctx, 120, TParser::RuleAssociativeArray);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(704);
    match(TParser::OpenBlock);
    setState(705);
    associativeArrayElements();
    setState(706);
    match(TParser::CloseBlock);
   
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

TParser::IdentifierContext* TParser::AssociativeArrayElementsContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

tree::TerminalNode* TParser::AssociativeArrayElementsContext::TwoPoint() {
  return getToken(TParser::TwoPoint, 0);
}

TParser::GeneralValueElementsContext* TParser::AssociativeArrayElementsContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
}

std::vector<tree::TerminalNode *> TParser::AssociativeArrayElementsContext::Separator() {
  return getTokens(TParser::Separator);
}

tree::TerminalNode* TParser::AssociativeArrayElementsContext::Separator(size_t i) {
  return getToken(TParser::Separator, i);
}

std::vector<TParser::AssociativeArrayElementsContext *> TParser::AssociativeArrayElementsContext::associativeArrayElements() {
  return getRuleContexts<TParser::AssociativeArrayElementsContext>();
}

TParser::AssociativeArrayElementsContext* TParser::AssociativeArrayElementsContext::associativeArrayElements(size_t i) {
  return getRuleContext<TParser::AssociativeArrayElementsContext>(i);
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
  enterRule(_localctx, 122, TParser::RuleAssociativeArrayElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(708);
    identifier();
    setState(709);
    match(TParser::TwoPoint);
    setState(710);
    generalValueElements();
    setState(715);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 82, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(711);
        match(TParser::Separator);
        setState(712);
        associativeArrayElements(); 
      }
      setState(717);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 82, _ctx);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockLambdaFunctionsContext ------------------------------------------------------------------

TParser::BlockLambdaFunctionsContext::BlockLambdaFunctionsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BlockLambdaFunctionsContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

tree::TerminalNode* TParser::BlockLambdaFunctionsContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}

tree::TerminalNode* TParser::BlockLambdaFunctionsContext::ARightLB() {
  return getToken(TParser::ARightLB, 0);
}

TParser::LambdaFnCodeBlockContext* TParser::BlockLambdaFunctionsContext::lambdaFnCodeBlock() {
  return getRuleContext<TParser::LambdaFnCodeBlockContext>(0);
}

TParser::LambdaFnParamsContext* TParser::BlockLambdaFunctionsContext::lambdaFnParams() {
  return getRuleContext<TParser::LambdaFnParamsContext>(0);
}

tree::TerminalNode* TParser::BlockLambdaFunctionsContext::ArrowRight() {
  return getToken(TParser::ArrowRight, 0);
}

TParser::IdentifierContext* TParser::BlockLambdaFunctionsContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

tree::TerminalNode* TParser::BlockLambdaFunctionsContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}


size_t TParser::BlockLambdaFunctionsContext::getRuleIndex() const {
  return TParser::RuleBlockLambdaFunctions;
}

void TParser::BlockLambdaFunctionsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockLambdaFunctions(this);
}

void TParser::BlockLambdaFunctionsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockLambdaFunctions(this);
}


antlrcpp::Any TParser::BlockLambdaFunctionsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockLambdaFunctions(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockLambdaFunctionsContext* TParser::blockLambdaFunctions() {
  BlockLambdaFunctionsContext *_localctx = _tracker.createInstance<BlockLambdaFunctionsContext>(_ctx, getState());
  enterRule(_localctx, 124, TParser::RuleBlockLambdaFunctions);
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
    setState(718);
    match(TParser::OpenOp);
    setState(720);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::Identifier) {
      setState(719);
      lambdaFnParams();
    }
    setState(722);
    match(TParser::CloseOp);
    setState(728);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::ArrowRight) {
      setState(723);
      match(TParser::ArrowRight);
      setState(726);
      _errHandler->sync(this);
      switch (_input->LA(1)) {
        case TParser::Identifier: {
          setState(724);
          identifier();
          break;
        }

        case TParser::TypeSpec: {
          setState(725);
          match(TParser::TypeSpec);
          break;
        }

      default:
        throw NoViableAltException(this);
      }
    }
    setState(730);
    match(TParser::ARightLB);
    setState(731);
    lambdaFnCodeBlock();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LambdaFnParamsContext ------------------------------------------------------------------

TParser::LambdaFnParamsContext::LambdaFnParamsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::IdentifierContext* TParser::LambdaFnParamsContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

tree::TerminalNode* TParser::LambdaFnParamsContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}

std::vector<tree::TerminalNode *> TParser::LambdaFnParamsContext::Separator() {
  return getTokens(TParser::Separator);
}

tree::TerminalNode* TParser::LambdaFnParamsContext::Separator(size_t i) {
  return getToken(TParser::Separator, i);
}

std::vector<TParser::LambdaFnParamsContext *> TParser::LambdaFnParamsContext::lambdaFnParams() {
  return getRuleContexts<TParser::LambdaFnParamsContext>();
}

TParser::LambdaFnParamsContext* TParser::LambdaFnParamsContext::lambdaFnParams(size_t i) {
  return getRuleContext<TParser::LambdaFnParamsContext>(i);
}


size_t TParser::LambdaFnParamsContext::getRuleIndex() const {
  return TParser::RuleLambdaFnParams;
}

void TParser::LambdaFnParamsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLambdaFnParams(this);
}

void TParser::LambdaFnParamsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLambdaFnParams(this);
}


antlrcpp::Any TParser::LambdaFnParamsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLambdaFnParams(this);
  else
    return visitor->visitChildren(this);
}

TParser::LambdaFnParamsContext* TParser::lambdaFnParams() {
  LambdaFnParamsContext *_localctx = _tracker.createInstance<LambdaFnParamsContext>(_ctx, getState());
  enterRule(_localctx, 126, TParser::RuleLambdaFnParams);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(733);
    identifier();
    setState(735);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::TypeSpec) {
      setState(734);
      match(TParser::TypeSpec);
    }
    setState(741);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 87, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(737);
        match(TParser::Separator);
        setState(738);
        lambdaFnParams(); 
      }
      setState(743);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 87, _ctx);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LambdaFnCodeBlockContext ------------------------------------------------------------------

TParser::LambdaFnCodeBlockContext::LambdaFnCodeBlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::CodeBlockControlContext* TParser::LambdaFnCodeBlockContext::codeBlockControl() {
  return getRuleContext<TParser::CodeBlockControlContext>(0);
}

TParser::GeneralValueElementsContext* TParser::LambdaFnCodeBlockContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
}


size_t TParser::LambdaFnCodeBlockContext::getRuleIndex() const {
  return TParser::RuleLambdaFnCodeBlock;
}

void TParser::LambdaFnCodeBlockContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLambdaFnCodeBlock(this);
}

void TParser::LambdaFnCodeBlockContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLambdaFnCodeBlock(this);
}


antlrcpp::Any TParser::LambdaFnCodeBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLambdaFnCodeBlock(this);
  else
    return visitor->visitChildren(this);
}

TParser::LambdaFnCodeBlockContext* TParser::lambdaFnCodeBlock() {
  LambdaFnCodeBlockContext *_localctx = _tracker.createInstance<LambdaFnCodeBlockContext>(_ctx, getState());
  enterRule(_localctx, 128, TParser::RuleLambdaFnCodeBlock);

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
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 88, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(744);
      codeBlockControl();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(745);
      generalValueElements();
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

//----------------- BlockClassConstructorContext ------------------------------------------------------------------

TParser::BlockClassConstructorContext::BlockClassConstructorContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::IdentifierContext* TParser::BlockClassConstructorContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

tree::TerminalNode* TParser::BlockClassConstructorContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

tree::TerminalNode* TParser::BlockClassConstructorContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}

TParser::CodeBlockControlContext* TParser::BlockClassConstructorContext::codeBlockControl() {
  return getRuleContext<TParser::CodeBlockControlContext>(0);
}

TParser::FunctionParamContext* TParser::BlockClassConstructorContext::functionParam() {
  return getRuleContext<TParser::FunctionParamContext>(0);
}


size_t TParser::BlockClassConstructorContext::getRuleIndex() const {
  return TParser::RuleBlockClassConstructor;
}

void TParser::BlockClassConstructorContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockClassConstructor(this);
}

void TParser::BlockClassConstructorContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockClassConstructor(this);
}


antlrcpp::Any TParser::BlockClassConstructorContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockClassConstructor(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockClassConstructorContext* TParser::blockClassConstructor() {
  BlockClassConstructorContext *_localctx = _tracker.createInstance<BlockClassConstructorContext>(_ctx, getState());
  enterRule(_localctx, 130, TParser::RuleBlockClassConstructor);
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
    setState(748);
    identifier();
    setState(749);
    match(TParser::OpenOp);
    setState(751);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::Identifier) {
      setState(750);
      functionParam();
    }
    setState(753);
    match(TParser::CloseOp);
    setState(754);
    codeBlockControl();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockFunctionCallContext ------------------------------------------------------------------

TParser::BlockFunctionCallContext::BlockFunctionCallContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::IdentifierContext* TParser::BlockFunctionCallContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

tree::TerminalNode* TParser::BlockFunctionCallContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

tree::TerminalNode* TParser::BlockFunctionCallContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}

tree::TerminalNode* TParser::BlockFunctionCallContext::End() {
  return getToken(TParser::End, 0);
}

TParser::IdentifierBContext* TParser::BlockFunctionCallContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}

TParser::FunctionCallElementsContext* TParser::BlockFunctionCallContext::functionCallElements() {
  return getRuleContext<TParser::FunctionCallElementsContext>(0);
}

tree::TerminalNode* TParser::BlockFunctionCallContext::Point() {
  return getToken(TParser::Point, 0);
}

tree::TerminalNode* TParser::BlockFunctionCallContext::TwoTwoPoint() {
  return getToken(TParser::TwoTwoPoint, 0);
}

TParser::BlockAccessArrayElementsContext* TParser::BlockFunctionCallContext::blockAccessArrayElements() {
  return getRuleContext<TParser::BlockAccessArrayElementsContext>(0);
}


size_t TParser::BlockFunctionCallContext::getRuleIndex() const {
  return TParser::RuleBlockFunctionCall;
}

void TParser::BlockFunctionCallContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockFunctionCall(this);
}

void TParser::BlockFunctionCallContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockFunctionCall(this);
}


antlrcpp::Any TParser::BlockFunctionCallContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockFunctionCall(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockFunctionCallContext* TParser::blockFunctionCall() {
  BlockFunctionCallContext *_localctx = _tracker.createInstance<BlockFunctionCallContext>(_ctx, getState());
  enterRule(_localctx, 132, TParser::RuleBlockFunctionCall);
  size_t _la = 0;

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
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 93, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(756);
      identifier();
      setState(759);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::Point

      || _la == TParser::TwoTwoPoint) {
        setState(757);
        _la = _input->LA(1);
        if (!(_la == TParser::Point

        || _la == TParser::TwoTwoPoint)) {
        _errHandler->recoverInline(this);
        }
        else {
          _errHandler->reportMatch(this);
          consume();
        }
        setState(758);
        identifierB();
      }
      setState(761);
      match(TParser::OpenOp);
      setState(763);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if ((((_la & ~ 0x3fULL) == 0) &&
        ((1ULL << _la) & ((1ULL << TParser::Function)
        | (1ULL << TParser::Class)
        | (1ULL << TParser::OpenArIndex)
        | (1ULL << TParser::OpenBlock)
        | (1ULL << TParser::OpenOp)
        | (1ULL << TParser::Not)
        | (1ULL << TParser::IncDecOperators)
        | (1ULL << TParser::Identifier)
        | (1ULL << TParser::Integer)
        | (1ULL << TParser::Float)
        | (1ULL << TParser::String))) != 0)) {
        setState(762);
        functionCallElements();
      }
      setState(765);
      match(TParser::CloseOp);
      setState(766);
      match(TParser::End);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(768);
      blockAccessArrayElements();
      setState(769);
      match(TParser::OpenOp);
      setState(771);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if ((((_la & ~ 0x3fULL) == 0) &&
        ((1ULL << _la) & ((1ULL << TParser::Function)
        | (1ULL << TParser::Class)
        | (1ULL << TParser::OpenArIndex)
        | (1ULL << TParser::OpenBlock)
        | (1ULL << TParser::OpenOp)
        | (1ULL << TParser::Not)
        | (1ULL << TParser::IncDecOperators)
        | (1ULL << TParser::Identifier)
        | (1ULL << TParser::Integer)
        | (1ULL << TParser::Float)
        | (1ULL << TParser::String))) != 0)) {
        setState(770);
        functionCallElements();
      }
      setState(773);
      match(TParser::CloseOp);
      setState(774);
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

//----------------- FunctionCallElementsContext ------------------------------------------------------------------

TParser::FunctionCallElementsContext::FunctionCallElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::GeneralValueElementsContext* TParser::FunctionCallElementsContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
}

std::vector<tree::TerminalNode *> TParser::FunctionCallElementsContext::Separator() {
  return getTokens(TParser::Separator);
}

tree::TerminalNode* TParser::FunctionCallElementsContext::Separator(size_t i) {
  return getToken(TParser::Separator, i);
}

std::vector<TParser::FunctionCallElementsContext *> TParser::FunctionCallElementsContext::functionCallElements() {
  return getRuleContexts<TParser::FunctionCallElementsContext>();
}

TParser::FunctionCallElementsContext* TParser::FunctionCallElementsContext::functionCallElements(size_t i) {
  return getRuleContext<TParser::FunctionCallElementsContext>(i);
}


size_t TParser::FunctionCallElementsContext::getRuleIndex() const {
  return TParser::RuleFunctionCallElements;
}

void TParser::FunctionCallElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionCallElements(this);
}

void TParser::FunctionCallElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionCallElements(this);
}


antlrcpp::Any TParser::FunctionCallElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionCallElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionCallElementsContext* TParser::functionCallElements() {
  FunctionCallElementsContext *_localctx = _tracker.createInstance<FunctionCallElementsContext>(_ctx, getState());
  enterRule(_localctx, 134, TParser::RuleFunctionCallElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(778);
    generalValueElements();
    setState(783);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 94, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(779);
        match(TParser::Separator);
        setState(780);
        functionCallElements(); 
      }
      setState(785);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 94, _ctx);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockCascadingMethodContext ------------------------------------------------------------------

TParser::BlockCascadingMethodContext::BlockCascadingMethodContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::BlockCascadingMethodAttrContext* TParser::BlockCascadingMethodContext::blockCascadingMethodAttr() {
  return getRuleContext<TParser::BlockCascadingMethodAttrContext>(0);
}

tree::TerminalNode* TParser::BlockCascadingMethodContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::BlockCascadingMethodContext::getRuleIndex() const {
  return TParser::RuleBlockCascadingMethod;
}

void TParser::BlockCascadingMethodContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockCascadingMethod(this);
}

void TParser::BlockCascadingMethodContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockCascadingMethod(this);
}


antlrcpp::Any TParser::BlockCascadingMethodContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockCascadingMethod(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockCascadingMethodContext* TParser::blockCascadingMethod() {
  BlockCascadingMethodContext *_localctx = _tracker.createInstance<BlockCascadingMethodContext>(_ctx, getState());
  enterRule(_localctx, 136, TParser::RuleBlockCascadingMethod);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(786);
    blockCascadingMethodAttr();
    setState(787);
    match(TParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockCascadingMethodAttrContext ------------------------------------------------------------------

TParser::BlockCascadingMethodAttrContext::BlockCascadingMethodAttrContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::BlockAccessArrayElementsContext* TParser::BlockCascadingMethodAttrContext::blockAccessArrayElements() {
  return getRuleContext<TParser::BlockAccessArrayElementsContext>(0);
}

tree::TerminalNode* TParser::BlockCascadingMethodAttrContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

tree::TerminalNode* TParser::BlockCascadingMethodAttrContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}

std::vector<tree::TerminalNode *> TParser::BlockCascadingMethodAttrContext::PointPoint() {
  return getTokens(TParser::PointPoint);
}

tree::TerminalNode* TParser::BlockCascadingMethodAttrContext::PointPoint(size_t i) {
  return getToken(TParser::PointPoint, i);
}

std::vector<TParser::BlockCascadingMethodAttrContext *> TParser::BlockCascadingMethodAttrContext::blockCascadingMethodAttr() {
  return getRuleContexts<TParser::BlockCascadingMethodAttrContext>();
}

TParser::BlockCascadingMethodAttrContext* TParser::BlockCascadingMethodAttrContext::blockCascadingMethodAttr(size_t i) {
  return getRuleContext<TParser::BlockCascadingMethodAttrContext>(i);
}

TParser::FunctionCallElementsContext* TParser::BlockCascadingMethodAttrContext::functionCallElements() {
  return getRuleContext<TParser::FunctionCallElementsContext>(0);
}


size_t TParser::BlockCascadingMethodAttrContext::getRuleIndex() const {
  return TParser::RuleBlockCascadingMethodAttr;
}

void TParser::BlockCascadingMethodAttrContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockCascadingMethodAttr(this);
}

void TParser::BlockCascadingMethodAttrContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockCascadingMethodAttr(this);
}


antlrcpp::Any TParser::BlockCascadingMethodAttrContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockCascadingMethodAttr(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockCascadingMethodAttrContext* TParser::blockCascadingMethodAttr() {
  BlockCascadingMethodAttrContext *_localctx = _tracker.createInstance<BlockCascadingMethodAttrContext>(_ctx, getState());
  enterRule(_localctx, 138, TParser::RuleBlockCascadingMethodAttr);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(789);
    blockAccessArrayElements();
    setState(795);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::OpenOp) {
      setState(790);
      match(TParser::OpenOp);
      setState(792);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if ((((_la & ~ 0x3fULL) == 0) &&
        ((1ULL << _la) & ((1ULL << TParser::Function)
        | (1ULL << TParser::Class)
        | (1ULL << TParser::OpenArIndex)
        | (1ULL << TParser::OpenBlock)
        | (1ULL << TParser::OpenOp)
        | (1ULL << TParser::Not)
        | (1ULL << TParser::IncDecOperators)
        | (1ULL << TParser::Identifier)
        | (1ULL << TParser::Integer)
        | (1ULL << TParser::Float)
        | (1ULL << TParser::String))) != 0)) {
        setState(791);
        functionCallElements();
      }
      setState(794);
      match(TParser::CloseOp);
    }
    setState(801);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 97, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(797);
        match(TParser::PointPoint);
        setState(798);
        blockCascadingMethodAttr(); 
      }
      setState(803);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 97, _ctx);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockAnonymousObjectContext ------------------------------------------------------------------

TParser::BlockAnonymousObjectContext::BlockAnonymousObjectContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BlockAnonymousObjectContext::New() {
  return getToken(TParser::New, 0);
}

TParser::IdentifierContext* TParser::BlockAnonymousObjectContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

std::vector<tree::TerminalNode *> TParser::BlockAnonymousObjectContext::OpenOp() {
  return getTokens(TParser::OpenOp);
}

tree::TerminalNode* TParser::BlockAnonymousObjectContext::OpenOp(size_t i) {
  return getToken(TParser::OpenOp, i);
}

std::vector<tree::TerminalNode *> TParser::BlockAnonymousObjectContext::CloseOp() {
  return getTokens(TParser::CloseOp);
}

tree::TerminalNode* TParser::BlockAnonymousObjectContext::CloseOp(size_t i) {
  return getToken(TParser::CloseOp, i);
}

tree::TerminalNode* TParser::BlockAnonymousObjectContext::End() {
  return getToken(TParser::End, 0);
}

std::vector<TParser::GeneralValueElementsContext *> TParser::BlockAnonymousObjectContext::generalValueElements() {
  return getRuleContexts<TParser::GeneralValueElementsContext>();
}

TParser::GeneralValueElementsContext* TParser::BlockAnonymousObjectContext::generalValueElements(size_t i) {
  return getRuleContext<TParser::GeneralValueElementsContext>(i);
}

TParser::IdentifierBContext* TParser::BlockAnonymousObjectContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}

tree::TerminalNode* TParser::BlockAnonymousObjectContext::Point() {
  return getToken(TParser::Point, 0);
}

tree::TerminalNode* TParser::BlockAnonymousObjectContext::TwoTwoPoint() {
  return getToken(TParser::TwoTwoPoint, 0);
}


size_t TParser::BlockAnonymousObjectContext::getRuleIndex() const {
  return TParser::RuleBlockAnonymousObject;
}

void TParser::BlockAnonymousObjectContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockAnonymousObject(this);
}

void TParser::BlockAnonymousObjectContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockAnonymousObject(this);
}


antlrcpp::Any TParser::BlockAnonymousObjectContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockAnonymousObject(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockAnonymousObjectContext* TParser::blockAnonymousObject() {
  BlockAnonymousObjectContext *_localctx = _tracker.createInstance<BlockAnonymousObjectContext>(_ctx, getState());
  enterRule(_localctx, 140, TParser::RuleBlockAnonymousObject);
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
    setState(805);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::OpenOp) {
      setState(804);
      match(TParser::OpenOp);
    }
    setState(807);
    match(TParser::New);
    setState(808);
    identifier();
    setState(809);
    match(TParser::OpenOp);
    setState(811);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << TParser::Function)
      | (1ULL << TParser::Class)
      | (1ULL << TParser::OpenArIndex)
      | (1ULL << TParser::OpenBlock)
      | (1ULL << TParser::OpenOp)
      | (1ULL << TParser::Not)
      | (1ULL << TParser::IncDecOperators)
      | (1ULL << TParser::Identifier)
      | (1ULL << TParser::Integer)
      | (1ULL << TParser::Float)
      | (1ULL << TParser::String))) != 0)) {
      setState(810);
      generalValueElements();
    }
    setState(813);
    match(TParser::CloseOp);
    setState(815);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::CloseOp) {
      setState(814);
      match(TParser::CloseOp);
    }
    setState(825);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::Point

    || _la == TParser::TwoTwoPoint) {
      setState(817);
      _la = _input->LA(1);
      if (!(_la == TParser::Point

      || _la == TParser::TwoTwoPoint)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(818);
      identifierB();
      setState(819);
      match(TParser::OpenOp);
      setState(821);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if ((((_la & ~ 0x3fULL) == 0) &&
        ((1ULL << _la) & ((1ULL << TParser::Function)
        | (1ULL << TParser::Class)
        | (1ULL << TParser::OpenArIndex)
        | (1ULL << TParser::OpenBlock)
        | (1ULL << TParser::OpenOp)
        | (1ULL << TParser::Not)
        | (1ULL << TParser::IncDecOperators)
        | (1ULL << TParser::Identifier)
        | (1ULL << TParser::Integer)
        | (1ULL << TParser::Float)
        | (1ULL << TParser::String))) != 0)) {
        setState(820);
        generalValueElements();
      }
      setState(823);
      match(TParser::CloseOp);
    }
    setState(827);
    match(TParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockAnonymousObjectAttrContext ------------------------------------------------------------------

TParser::BlockAnonymousObjectAttrContext::BlockAnonymousObjectAttrContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> TParser::BlockAnonymousObjectAttrContext::OpenOp() {
  return getTokens(TParser::OpenOp);
}

tree::TerminalNode* TParser::BlockAnonymousObjectAttrContext::OpenOp(size_t i) {
  return getToken(TParser::OpenOp, i);
}

tree::TerminalNode* TParser::BlockAnonymousObjectAttrContext::New() {
  return getToken(TParser::New, 0);
}

TParser::IdentifierContext* TParser::BlockAnonymousObjectAttrContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

std::vector<tree::TerminalNode *> TParser::BlockAnonymousObjectAttrContext::CloseOp() {
  return getTokens(TParser::CloseOp);
}

tree::TerminalNode* TParser::BlockAnonymousObjectAttrContext::CloseOp(size_t i) {
  return getToken(TParser::CloseOp, i);
}

std::vector<TParser::GeneralValueElementsContext *> TParser::BlockAnonymousObjectAttrContext::generalValueElements() {
  return getRuleContexts<TParser::GeneralValueElementsContext>();
}

TParser::GeneralValueElementsContext* TParser::BlockAnonymousObjectAttrContext::generalValueElements(size_t i) {
  return getRuleContext<TParser::GeneralValueElementsContext>(i);
}

TParser::IdentifierBContext* TParser::BlockAnonymousObjectAttrContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}

tree::TerminalNode* TParser::BlockAnonymousObjectAttrContext::Point() {
  return getToken(TParser::Point, 0);
}

tree::TerminalNode* TParser::BlockAnonymousObjectAttrContext::TwoTwoPoint() {
  return getToken(TParser::TwoTwoPoint, 0);
}


size_t TParser::BlockAnonymousObjectAttrContext::getRuleIndex() const {
  return TParser::RuleBlockAnonymousObjectAttr;
}

void TParser::BlockAnonymousObjectAttrContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockAnonymousObjectAttr(this);
}

void TParser::BlockAnonymousObjectAttrContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockAnonymousObjectAttr(this);
}


antlrcpp::Any TParser::BlockAnonymousObjectAttrContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockAnonymousObjectAttr(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockAnonymousObjectAttrContext* TParser::blockAnonymousObjectAttr() {
  BlockAnonymousObjectAttrContext *_localctx = _tracker.createInstance<BlockAnonymousObjectAttrContext>(_ctx, getState());
  enterRule(_localctx, 142, TParser::RuleBlockAnonymousObjectAttr);
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
    setState(829);
    match(TParser::OpenOp);
    setState(830);
    match(TParser::New);
    setState(831);
    identifier();
    setState(832);
    match(TParser::OpenOp);
    setState(834);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << TParser::Function)
      | (1ULL << TParser::Class)
      | (1ULL << TParser::OpenArIndex)
      | (1ULL << TParser::OpenBlock)
      | (1ULL << TParser::OpenOp)
      | (1ULL << TParser::Not)
      | (1ULL << TParser::IncDecOperators)
      | (1ULL << TParser::Identifier)
      | (1ULL << TParser::Integer)
      | (1ULL << TParser::Float)
      | (1ULL << TParser::String))) != 0)) {
      setState(833);
      generalValueElements();
    }
    setState(836);
    match(TParser::CloseOp);
    setState(837);
    match(TParser::CloseOp);
    setState(846);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::Point

    || _la == TParser::TwoTwoPoint) {
      setState(838);
      _la = _input->LA(1);
      if (!(_la == TParser::Point

      || _la == TParser::TwoTwoPoint)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(839);
      identifierB();
      setState(840);
      match(TParser::OpenOp);
      setState(842);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if ((((_la & ~ 0x3fULL) == 0) &&
        ((1ULL << _la) & ((1ULL << TParser::Function)
        | (1ULL << TParser::Class)
        | (1ULL << TParser::OpenArIndex)
        | (1ULL << TParser::OpenBlock)
        | (1ULL << TParser::OpenOp)
        | (1ULL << TParser::Not)
        | (1ULL << TParser::IncDecOperators)
        | (1ULL << TParser::Identifier)
        | (1ULL << TParser::Integer)
        | (1ULL << TParser::Float)
        | (1ULL << TParser::String))) != 0)) {
        setState(841);
        generalValueElements();
      }
      setState(844);
      match(TParser::CloseOp);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockAccessArrayElementsContext ------------------------------------------------------------------

TParser::BlockAccessArrayElementsContext::BlockAccessArrayElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ArrayAccessElementsContext* TParser::BlockAccessArrayElementsContext::arrayAccessElements() {
  return getRuleContext<TParser::ArrayAccessElementsContext>(0);
}


size_t TParser::BlockAccessArrayElementsContext::getRuleIndex() const {
  return TParser::RuleBlockAccessArrayElements;
}

void TParser::BlockAccessArrayElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockAccessArrayElements(this);
}

void TParser::BlockAccessArrayElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockAccessArrayElements(this);
}


antlrcpp::Any TParser::BlockAccessArrayElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockAccessArrayElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockAccessArrayElementsContext* TParser::blockAccessArrayElements() {
  BlockAccessArrayElementsContext *_localctx = _tracker.createInstance<BlockAccessArrayElementsContext>(_ctx, getState());
  enterRule(_localctx, 144, TParser::RuleBlockAccessArrayElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(848);
    arrayAccessElements();
   
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

std::vector<TParser::ArrayAccessElementsContext *> TParser::ArrayAccessElementsContext::arrayAccessElements() {
  return getRuleContexts<TParser::ArrayAccessElementsContext>();
}

TParser::ArrayAccessElementsContext* TParser::ArrayAccessElementsContext::arrayAccessElements(size_t i) {
  return getRuleContext<TParser::ArrayAccessElementsContext>(i);
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
  enterRule(_localctx, 146, TParser::RuleArrayAccessElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(850);
    arrayAccessElementsItems();
    setState(854);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 106, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(851);
        arrayAccessElements(); 
      }
      setState(856);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 106, _ctx);
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

TParser::IdentifierContext* TParser::ArrayAccessElementsItemsContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

TParser::FirstIncDecContext* TParser::ArrayAccessElementsItemsContext::firstIncDec() {
  return getRuleContext<TParser::FirstIncDecContext>(0);
}

TParser::AccessBlockArContext* TParser::ArrayAccessElementsItemsContext::accessBlockAr() {
  return getRuleContext<TParser::AccessBlockArContext>(0);
}

TParser::LastIncDecContext* TParser::ArrayAccessElementsItemsContext::lastIncDec() {
  return getRuleContext<TParser::LastIncDecContext>(0);
}

tree::TerminalNode* TParser::ArrayAccessElementsItemsContext::Point() {
  return getToken(TParser::Point, 0);
}

tree::TerminalNode* TParser::ArrayAccessElementsItemsContext::TwoTwoPoint() {
  return getToken(TParser::TwoTwoPoint, 0);
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
  enterRule(_localctx, 148, TParser::RuleArrayAccessElementsItems);
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
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::IncDecOperators) {
      setState(857);
      firstIncDec();
    }
    setState(860);
    identifier();
    setState(862);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 108, _ctx)) {
    case 1: {
      setState(861);
      accessBlockAr();
      break;
    }

    default:
      break;
    }
    setState(865);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 109, _ctx)) {
    case 1: {
      setState(864);
      lastIncDec();
      break;
    }

    default:
      break;
    }
    setState(868);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::Point

    || _la == TParser::TwoTwoPoint) {
      setState(867);
      _la = _input->LA(1);
      if (!(_la == TParser::Point

      || _la == TParser::TwoTwoPoint)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
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

std::vector<TParser::AccessBlockArContext *> TParser::AccessBlockArContext::accessBlockAr() {
  return getRuleContexts<TParser::AccessBlockArContext>();
}

TParser::AccessBlockArContext* TParser::AccessBlockArContext::accessBlockAr(size_t i) {
  return getRuleContext<TParser::AccessBlockArContext>(i);
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
  enterRule(_localctx, 150, TParser::RuleAccessBlockAr);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(870);
    match(TParser::OpenArIndex);
    setState(871);
    arrayIndexAccess();
    setState(872);
    match(TParser::CloseArIndex);
    setState(876);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 111, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(873);
        accessBlockAr(); 
      }
      setState(878);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 111, _ctx);
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

TParser::GeneralValueElementsContext* TParser::ArrayIndexAccessContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
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
  enterRule(_localctx, 152, TParser::RuleArrayIndexAccess);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(879);
    generalValueElements();
   
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
  enterRule(_localctx, 154, TParser::RuleFirstIncDec);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(881);
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
  enterRule(_localctx, 156, TParser::RuleLastIncDec);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(883);
    match(TParser::IncDecOperators);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockPermissionTokensContext ------------------------------------------------------------------

TParser::BlockPermissionTokensContext::BlockPermissionTokensContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BlockPermissionTokensContext::Pub() {
  return getToken(TParser::Pub, 0);
}

tree::TerminalNode* TParser::BlockPermissionTokensContext::Pro() {
  return getToken(TParser::Pro, 0);
}

tree::TerminalNode* TParser::BlockPermissionTokensContext::Priv() {
  return getToken(TParser::Priv, 0);
}

tree::TerminalNode* TParser::BlockPermissionTokensContext::Static() {
  return getToken(TParser::Static, 0);
}

tree::TerminalNode* TParser::BlockPermissionTokensContext::Final() {
  return getToken(TParser::Final, 0);
}

tree::TerminalNode* TParser::BlockPermissionTokensContext::Async() {
  return getToken(TParser::Async, 0);
}


size_t TParser::BlockPermissionTokensContext::getRuleIndex() const {
  return TParser::RuleBlockPermissionTokens;
}

void TParser::BlockPermissionTokensContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockPermissionTokens(this);
}

void TParser::BlockPermissionTokensContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockPermissionTokens(this);
}


antlrcpp::Any TParser::BlockPermissionTokensContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockPermissionTokens(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockPermissionTokensContext* TParser::blockPermissionTokens() {
  BlockPermissionTokensContext *_localctx = _tracker.createInstance<BlockPermissionTokensContext>(_ctx, getState());
  enterRule(_localctx, 158, TParser::RuleBlockPermissionTokens);
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
    setState(885);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << TParser::Pub)
      | (1ULL << TParser::Pro)
      | (1ULL << TParser::Priv)
      | (1ULL << TParser::Static)
      | (1ULL << TParser::Final)
      | (1ULL << TParser::Async))) != 0))) {
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

//----------------- CodeBlockFlowControlContext ------------------------------------------------------------------

TParser::CodeBlockFlowControlContext::CodeBlockFlowControlContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::CodeBlockFlowControlContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::CodeBlockFlowControlContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::SentencesContext* TParser::CodeBlockFlowControlContext::sentences() {
  return getRuleContext<TParser::SentencesContext>(0);
}

TParser::CodeBlockFlowControlElementsContext* TParser::CodeBlockFlowControlContext::codeBlockFlowControlElements() {
  return getRuleContext<TParser::CodeBlockFlowControlElementsContext>(0);
}


size_t TParser::CodeBlockFlowControlContext::getRuleIndex() const {
  return TParser::RuleCodeBlockFlowControl;
}

void TParser::CodeBlockFlowControlContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterCodeBlockFlowControl(this);
}

void TParser::CodeBlockFlowControlContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitCodeBlockFlowControl(this);
}


antlrcpp::Any TParser::CodeBlockFlowControlContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitCodeBlockFlowControl(this);
  else
    return visitor->visitChildren(this);
}

TParser::CodeBlockFlowControlContext* TParser::codeBlockFlowControl() {
  CodeBlockFlowControlContext *_localctx = _tracker.createInstance<CodeBlockFlowControlContext>(_ctx, getState());
  enterRule(_localctx, 160, TParser::RuleCodeBlockFlowControl);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(894);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 112, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(887);
      match(TParser::OpenBlock);
      setState(888);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(889);
      match(TParser::OpenBlock);
      setState(890);
      sentences();
      setState(891);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(893);
      codeBlockFlowControlElements();
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

//----------------- CodeBlockFlowControlElementsContext ------------------------------------------------------------------

TParser::CodeBlockFlowControlElementsContext::CodeBlockFlowControlElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionCallFlowControlContext* TParser::CodeBlockFlowControlElementsContext::functionCallFlowControl() {
  return getRuleContext<TParser::FunctionCallFlowControlContext>(0);
}

tree::TerminalNode* TParser::CodeBlockFlowControlElementsContext::End() {
  return getToken(TParser::End, 0);
}

TParser::BlockRetContext* TParser::CodeBlockFlowControlElementsContext::blockRet() {
  return getRuleContext<TParser::BlockRetContext>(0);
}

TParser::BlockConditionalContext* TParser::CodeBlockFlowControlElementsContext::blockConditional() {
  return getRuleContext<TParser::BlockConditionalContext>(0);
}

TParser::BlockLoopContext* TParser::CodeBlockFlowControlElementsContext::blockLoop() {
  return getRuleContext<TParser::BlockLoopContext>(0);
}

TParser::BlockTryCatchContext* TParser::CodeBlockFlowControlElementsContext::blockTryCatch() {
  return getRuleContext<TParser::BlockTryCatchContext>(0);
}

TParser::BlockBreakContext* TParser::CodeBlockFlowControlElementsContext::blockBreak() {
  return getRuleContext<TParser::BlockBreakContext>(0);
}

TParser::BlockNextContext* TParser::CodeBlockFlowControlElementsContext::blockNext() {
  return getRuleContext<TParser::BlockNextContext>(0);
}


size_t TParser::CodeBlockFlowControlElementsContext::getRuleIndex() const {
  return TParser::RuleCodeBlockFlowControlElements;
}

void TParser::CodeBlockFlowControlElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterCodeBlockFlowControlElements(this);
}

void TParser::CodeBlockFlowControlElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitCodeBlockFlowControlElements(this);
}


antlrcpp::Any TParser::CodeBlockFlowControlElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitCodeBlockFlowControlElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::CodeBlockFlowControlElementsContext* TParser::codeBlockFlowControlElements() {
  CodeBlockFlowControlElementsContext *_localctx = _tracker.createInstance<CodeBlockFlowControlElementsContext>(_ctx, getState());
  enterRule(_localctx, 162, TParser::RuleCodeBlockFlowControlElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(905);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Identifier: {
        enterOuterAlt(_localctx, 1);
        setState(896);
        functionCallFlowControl();
        setState(897);
        match(TParser::End);
        break;
      }

      case TParser::Ret: {
        enterOuterAlt(_localctx, 2);
        setState(899);
        blockRet();
        break;
      }

      case TParser::If: {
        enterOuterAlt(_localctx, 3);
        setState(900);
        blockConditional();
        break;
      }

      case TParser::For: {
        enterOuterAlt(_localctx, 4);
        setState(901);
        blockLoop();
        break;
      }

      case TParser::Try: {
        enterOuterAlt(_localctx, 5);
        setState(902);
        blockTryCatch();
        break;
      }

      case TParser::Break: {
        enterOuterAlt(_localctx, 6);
        setState(903);
        blockBreak();
        break;
      }

      case TParser::Next: {
        enterOuterAlt(_localctx, 7);
        setState(904);
        blockNext();
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

//----------------- CodeBlockControlContext ------------------------------------------------------------------

TParser::CodeBlockControlContext::CodeBlockControlContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::CodeBlockControlContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::CodeBlockControlContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::SentencesContext* TParser::CodeBlockControlContext::sentences() {
  return getRuleContext<TParser::SentencesContext>(0);
}


size_t TParser::CodeBlockControlContext::getRuleIndex() const {
  return TParser::RuleCodeBlockControl;
}

void TParser::CodeBlockControlContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterCodeBlockControl(this);
}

void TParser::CodeBlockControlContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitCodeBlockControl(this);
}


antlrcpp::Any TParser::CodeBlockControlContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitCodeBlockControl(this);
  else
    return visitor->visitChildren(this);
}

TParser::CodeBlockControlContext* TParser::codeBlockControl() {
  CodeBlockControlContext *_localctx = _tracker.createInstance<CodeBlockControlContext>(_ctx, getState());
  enterRule(_localctx, 164, TParser::RuleCodeBlockControl);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(913);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 114, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(907);
      match(TParser::OpenBlock);
      setState(908);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(909);
      match(TParser::OpenBlock);
      setState(910);
      sentences();
      setState(911);
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

//----------------- GeneralValueContext ------------------------------------------------------------------

TParser::GeneralValueContext::GeneralValueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionCallContext* TParser::GeneralValueContext::functionCall() {
  return getRuleContext<TParser::FunctionCallContext>(0);
}

tree::TerminalNode* TParser::GeneralValueContext::Not() {
  return getToken(TParser::Not, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::ArithmeticOperator() {
  return getToken(TParser::ArithmeticOperator, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::AssignmentOperator() {
  return getToken(TParser::AssignmentOperator, 0);
}

TParser::IdentifierContext* TParser::GeneralValueContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

TParser::IdentifierBContext* TParser::GeneralValueContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}

tree::TerminalNode* TParser::GeneralValueContext::Point() {
  return getToken(TParser::Point, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::TwoTwoPoint() {
  return getToken(TParser::TwoTwoPoint, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::Attr() {
  return getToken(TParser::Attr, 0);
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

TParser::IncDecOperatorsAContext* TParser::GeneralValueContext::incDecOperatorsA() {
  return getRuleContext<TParser::IncDecOperatorsAContext>(0);
}

TParser::IncDecOperatorsBContext* TParser::GeneralValueContext::incDecOperatorsB() {
  return getRuleContext<TParser::IncDecOperatorsBContext>(0);
}

TParser::BlockArrayContext* TParser::GeneralValueContext::blockArray() {
  return getRuleContext<TParser::BlockArrayContext>(0);
}

TParser::BlockFunctionDeclarationAttrContext* TParser::GeneralValueContext::blockFunctionDeclarationAttr() {
  return getRuleContext<TParser::BlockFunctionDeclarationAttrContext>(0);
}

TParser::BlockClassDeclarationAttrContext* TParser::GeneralValueContext::blockClassDeclarationAttr() {
  return getRuleContext<TParser::BlockClassDeclarationAttrContext>(0);
}

TParser::BlockLambdaFunctionsContext* TParser::GeneralValueContext::blockLambdaFunctions() {
  return getRuleContext<TParser::BlockLambdaFunctionsContext>(0);
}

TParser::BlockAccessArrayElementsContext* TParser::GeneralValueContext::blockAccessArrayElements() {
  return getRuleContext<TParser::BlockAccessArrayElementsContext>(0);
}

TParser::BlockAnonymousObjectAttrContext* TParser::GeneralValueContext::blockAnonymousObjectAttr() {
  return getRuleContext<TParser::BlockAnonymousObjectAttrContext>(0);
}

tree::TerminalNode* TParser::GeneralValueContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::OpenArIndex() {
  return getToken(TParser::OpenArIndex, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::CloseArIndex() {
  return getToken(TParser::CloseArIndex, 0);
}

TParser::GeneralValueBlockContext* TParser::GeneralValueContext::generalValueBlock() {
  return getRuleContext<TParser::GeneralValueBlockContext>(0);
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
  enterRule(_localctx, 166, TParser::RuleGeneralValue);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(1073);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 162, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(916);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::Not) {
        setState(915);
        match(TParser::Not);
      }
      setState(918);
      functionCall();
      setState(920);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 116, _ctx)) {
      case 1: {
        setState(919);
        match(TParser::TypeSpec);
        break;
      }

      default:
        break;
      }
      setState(923);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::ArithmeticOperator) {
        setState(922);
        match(TParser::ArithmeticOperator);
      }
      setState(926);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 118, _ctx)) {
      case 1: {
        setState(925);
        match(TParser::AssignmentOperator);
        break;
      }

      default:
        break;
      }
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(929);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::Not) {
        setState(928);
        match(TParser::Not);
      }
      setState(931);
      identifier();
      setState(932);
      _la = _input->LA(1);
      if (!(_la == TParser::Point

      || _la == TParser::TwoTwoPoint)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(933);
      identifierB();
      setState(935);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 120, _ctx)) {
      case 1: {
        setState(934);
        match(TParser::TypeSpec);
        break;
      }

      default:
        break;
      }
      setState(938);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 121, _ctx)) {
      case 1: {
        setState(937);
        match(TParser::Attr);
        break;
      }

      default:
        break;
      }
      setState(941);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::ArithmeticOperator) {
        setState(940);
        match(TParser::ArithmeticOperator);
      }
      setState(944);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 123, _ctx)) {
      case 1: {
        setState(943);
        match(TParser::AssignmentOperator);
        break;
      }

      default:
        break;
      }
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(1007);
      _errHandler->sync(this);
      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 143, _ctx)) {
      case 1: {
        setState(947);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Not) {
          setState(946);
          match(TParser::Not);
        }
        setState(950);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::IncDecOperators) {
          setState(949);
          incDecOperatorsA();
        }
        setState(952);
        identifier();
        setState(954);
        _errHandler->sync(this);

        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 126, _ctx)) {
        case 1: {
          setState(953);
          incDecOperatorsB();
          break;
        }

        default:
          break;
        }
        setState(957);
        _errHandler->sync(this);

        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 127, _ctx)) {
        case 1: {
          setState(956);
          match(TParser::TypeSpec);
          break;
        }

        default:
          break;
        }
        setState(960);
        _errHandler->sync(this);

        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 128, _ctx)) {
        case 1: {
          setState(959);
          match(TParser::Attr);
          break;
        }

        default:
          break;
        }
        setState(963);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::ArithmeticOperator) {
          setState(962);
          match(TParser::ArithmeticOperator);
        }
        setState(966);
        _errHandler->sync(this);

        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 130, _ctx)) {
        case 1: {
          setState(965);
          match(TParser::AssignmentOperator);
          break;
        }

        default:
          break;
        }
        break;
      }

      case 2: {
        setState(969);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Not) {
          setState(968);
          match(TParser::Not);
        }
        setState(971);
        match(TParser::Integer);
        setState(973);
        _errHandler->sync(this);

        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 132, _ctx)) {
        case 1: {
          setState(972);
          match(TParser::TypeSpec);
          break;
        }

        default:
          break;
        }
        setState(976);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::ArithmeticOperator) {
          setState(975);
          match(TParser::ArithmeticOperator);
        }
        setState(979);
        _errHandler->sync(this);

        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 134, _ctx)) {
        case 1: {
          setState(978);
          match(TParser::AssignmentOperator);
          break;
        }

        default:
          break;
        }
        break;
      }

      case 3: {
        setState(982);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Not) {
          setState(981);
          match(TParser::Not);
        }
        setState(984);
        match(TParser::Float);
        setState(986);
        _errHandler->sync(this);

        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 136, _ctx)) {
        case 1: {
          setState(985);
          match(TParser::TypeSpec);
          break;
        }

        default:
          break;
        }
        setState(989);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::ArithmeticOperator) {
          setState(988);
          match(TParser::ArithmeticOperator);
        }
        setState(992);
        _errHandler->sync(this);

        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 138, _ctx)) {
        case 1: {
          setState(991);
          match(TParser::AssignmentOperator);
          break;
        }

        default:
          break;
        }
        break;
      }

      case 4: {
        setState(995);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Not) {
          setState(994);
          match(TParser::Not);
        }
        setState(997);
        match(TParser::String);
        setState(999);
        _errHandler->sync(this);

        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 140, _ctx)) {
        case 1: {
          setState(998);
          match(TParser::TypeSpec);
          break;
        }

        default:
          break;
        }
        setState(1002);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::ArithmeticOperator) {
          setState(1001);
          match(TParser::ArithmeticOperator);
        }
        setState(1005);
        _errHandler->sync(this);

        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 142, _ctx)) {
        case 1: {
          setState(1004);
          match(TParser::AssignmentOperator);
          break;
        }

        default:
          break;
        }
        break;
      }

      default:
        break;
      }
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(1010);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::Not) {
        setState(1009);
        match(TParser::Not);
      }
      setState(1013);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::IncDecOperators) {
        setState(1012);
        incDecOperatorsA();
      }
      setState(1015);
      blockArray();
      setState(1017);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 146, _ctx)) {
      case 1: {
        setState(1016);
        incDecOperatorsB();
        break;
      }

      default:
        break;
      }
      setState(1020);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 147, _ctx)) {
      case 1: {
        setState(1019);
        match(TParser::TypeSpec);
        break;
      }

      default:
        break;
      }
      setState(1023);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::ArithmeticOperator) {
        setState(1022);
        match(TParser::ArithmeticOperator);
      }
      setState(1026);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 149, _ctx)) {
      case 1: {
        setState(1025);
        match(TParser::AssignmentOperator);
        break;
      }

      default:
        break;
      }
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(1028);
      blockFunctionDeclarationAttr();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(1029);
      blockClassDeclarationAttr();
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(1030);
      blockLambdaFunctions();
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(1032);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::Not) {
        setState(1031);
        match(TParser::Not);
      }
      setState(1035);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 151, _ctx)) {
      case 1: {
        setState(1034);
        incDecOperatorsA();
        break;
      }

      default:
        break;
      }
      setState(1037);
      blockAccessArrayElements();
      setState(1039);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 152, _ctx)) {
      case 1: {
        setState(1038);
        incDecOperatorsB();
        break;
      }

      default:
        break;
      }
      setState(1042);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 153, _ctx)) {
      case 1: {
        setState(1041);
        match(TParser::TypeSpec);
        break;
      }

      default:
        break;
      }
      setState(1045);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 154, _ctx)) {
      case 1: {
        setState(1044);
        match(TParser::Attr);
        break;
      }

      default:
        break;
      }
      setState(1048);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::ArithmeticOperator) {
        setState(1047);
        match(TParser::ArithmeticOperator);
      }
      setState(1051);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 156, _ctx)) {
      case 1: {
        setState(1050);
        match(TParser::AssignmentOperator);
        break;
      }

      default:
        break;
      }
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(1053);
      blockAnonymousObjectAttr();
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(1058);
      _errHandler->sync(this);
      switch (_input->LA(1)) {
        case TParser::OpenBlock: {
          setState(1054);
          match(TParser::OpenBlock);
          setState(1055);
          match(TParser::CloseBlock);
          break;
        }

        case TParser::OpenArIndex: {
          setState(1056);
          match(TParser::OpenArIndex);
          setState(1057);
          match(TParser::CloseArIndex);
          break;
        }

      default:
        throw NoViableAltException(this);
      }
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(1061);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::Not) {
        setState(1060);
        match(TParser::Not);
      }
      setState(1063);
      generalValueBlock();
      setState(1065);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 159, _ctx)) {
      case 1: {
        setState(1064);
        match(TParser::TypeSpec);
        break;
      }

      default:
        break;
      }
      setState(1068);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::ArithmeticOperator) {
        setState(1067);
        match(TParser::ArithmeticOperator);
      }
      setState(1071);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 161, _ctx)) {
      case 1: {
        setState(1070);
        match(TParser::AssignmentOperator);
        break;
      }

      default:
        break;
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

//----------------- GeneralValueBlockContext ------------------------------------------------------------------

TParser::GeneralValueBlockContext::GeneralValueBlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::GeneralValueBlockContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

TParser::GeneralValueItemsContext* TParser::GeneralValueBlockContext::generalValueItems() {
  return getRuleContext<TParser::GeneralValueItemsContext>(0);
}

tree::TerminalNode* TParser::GeneralValueBlockContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}


size_t TParser::GeneralValueBlockContext::getRuleIndex() const {
  return TParser::RuleGeneralValueBlock;
}

void TParser::GeneralValueBlockContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterGeneralValueBlock(this);
}

void TParser::GeneralValueBlockContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitGeneralValueBlock(this);
}


antlrcpp::Any TParser::GeneralValueBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitGeneralValueBlock(this);
  else
    return visitor->visitChildren(this);
}

TParser::GeneralValueBlockContext* TParser::generalValueBlock() {
  GeneralValueBlockContext *_localctx = _tracker.createInstance<GeneralValueBlockContext>(_ctx, getState());
  enterRule(_localctx, 168, TParser::RuleGeneralValueBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1075);
    match(TParser::OpenOp);
    setState(1076);
    generalValueItems();
    setState(1077);
    match(TParser::CloseOp);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- GeneralValueItemsContext ------------------------------------------------------------------

TParser::GeneralValueItemsContext::GeneralValueItemsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::GeneralValueContext* TParser::GeneralValueItemsContext::generalValue() {
  return getRuleContext<TParser::GeneralValueContext>(0);
}

std::vector<TParser::GeneralValueItemsContext *> TParser::GeneralValueItemsContext::generalValueItems() {
  return getRuleContexts<TParser::GeneralValueItemsContext>();
}

TParser::GeneralValueItemsContext* TParser::GeneralValueItemsContext::generalValueItems(size_t i) {
  return getRuleContext<TParser::GeneralValueItemsContext>(i);
}


size_t TParser::GeneralValueItemsContext::getRuleIndex() const {
  return TParser::RuleGeneralValueItems;
}

void TParser::GeneralValueItemsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterGeneralValueItems(this);
}

void TParser::GeneralValueItemsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitGeneralValueItems(this);
}


antlrcpp::Any TParser::GeneralValueItemsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitGeneralValueItems(this);
  else
    return visitor->visitChildren(this);
}

TParser::GeneralValueItemsContext* TParser::generalValueItems() {
  GeneralValueItemsContext *_localctx = _tracker.createInstance<GeneralValueItemsContext>(_ctx, getState());
  enterRule(_localctx, 170, TParser::RuleGeneralValueItems);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(1079);
    generalValue();
    setState(1083);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 163, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(1080);
        generalValueItems(); 
      }
      setState(1085);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 163, _ctx);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- GeneralValueElementsContext ------------------------------------------------------------------

TParser::GeneralValueElementsContext::GeneralValueElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::GeneralValueContext* TParser::GeneralValueElementsContext::generalValue() {
  return getRuleContext<TParser::GeneralValueContext>(0);
}

std::vector<TParser::GeneralValueElementsContext *> TParser::GeneralValueElementsContext::generalValueElements() {
  return getRuleContexts<TParser::GeneralValueElementsContext>();
}

TParser::GeneralValueElementsContext* TParser::GeneralValueElementsContext::generalValueElements(size_t i) {
  return getRuleContext<TParser::GeneralValueElementsContext>(i);
}


size_t TParser::GeneralValueElementsContext::getRuleIndex() const {
  return TParser::RuleGeneralValueElements;
}

void TParser::GeneralValueElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterGeneralValueElements(this);
}

void TParser::GeneralValueElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitGeneralValueElements(this);
}


antlrcpp::Any TParser::GeneralValueElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitGeneralValueElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::GeneralValueElementsContext* TParser::generalValueElements() {
  GeneralValueElementsContext *_localctx = _tracker.createInstance<GeneralValueElementsContext>(_ctx, getState());
  enterRule(_localctx, 172, TParser::RuleGeneralValueElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(1086);
    generalValue();
    setState(1090);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 164, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(1087);
        generalValueElements(); 
      }
      setState(1092);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 164, _ctx);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IdentifierContext ------------------------------------------------------------------

TParser::IdentifierContext::IdentifierContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::IdentifierContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}


size_t TParser::IdentifierContext::getRuleIndex() const {
  return TParser::RuleIdentifier;
}

void TParser::IdentifierContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIdentifier(this);
}

void TParser::IdentifierContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIdentifier(this);
}


antlrcpp::Any TParser::IdentifierContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitIdentifier(this);
  else
    return visitor->visitChildren(this);
}

TParser::IdentifierContext* TParser::identifier() {
  IdentifierContext *_localctx = _tracker.createInstance<IdentifierContext>(_ctx, getState());
  enterRule(_localctx, 174, TParser::RuleIdentifier);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1093);
    match(TParser::Identifier);
   
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
  enterRule(_localctx, 176, TParser::RuleIdentifierB);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1095);
    match(TParser::Identifier);
   
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
  enterRule(_localctx, 178, TParser::RuleIdentifierC);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1097);
    match(TParser::Identifier);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IdentifierDContext ------------------------------------------------------------------

TParser::IdentifierDContext::IdentifierDContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::IdentifierDContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}


size_t TParser::IdentifierDContext::getRuleIndex() const {
  return TParser::RuleIdentifierD;
}

void TParser::IdentifierDContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIdentifierD(this);
}

void TParser::IdentifierDContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIdentifierD(this);
}


antlrcpp::Any TParser::IdentifierDContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitIdentifierD(this);
  else
    return visitor->visitChildren(this);
}

TParser::IdentifierDContext* TParser::identifierD() {
  IdentifierDContext *_localctx = _tracker.createInstance<IdentifierDContext>(_ctx, getState());
  enterRule(_localctx, 180, TParser::RuleIdentifierD);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1099);
    match(TParser::Identifier);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IncDecOperatorsAContext ------------------------------------------------------------------

TParser::IncDecOperatorsAContext::IncDecOperatorsAContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::IncDecOperatorsAContext::IncDecOperators() {
  return getToken(TParser::IncDecOperators, 0);
}


size_t TParser::IncDecOperatorsAContext::getRuleIndex() const {
  return TParser::RuleIncDecOperatorsA;
}

void TParser::IncDecOperatorsAContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIncDecOperatorsA(this);
}

void TParser::IncDecOperatorsAContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIncDecOperatorsA(this);
}


antlrcpp::Any TParser::IncDecOperatorsAContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitIncDecOperatorsA(this);
  else
    return visitor->visitChildren(this);
}

TParser::IncDecOperatorsAContext* TParser::incDecOperatorsA() {
  IncDecOperatorsAContext *_localctx = _tracker.createInstance<IncDecOperatorsAContext>(_ctx, getState());
  enterRule(_localctx, 182, TParser::RuleIncDecOperatorsA);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1101);
    match(TParser::IncDecOperators);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IncDecOperatorsBContext ------------------------------------------------------------------

TParser::IncDecOperatorsBContext::IncDecOperatorsBContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::IncDecOperatorsBContext::IncDecOperators() {
  return getToken(TParser::IncDecOperators, 0);
}


size_t TParser::IncDecOperatorsBContext::getRuleIndex() const {
  return TParser::RuleIncDecOperatorsB;
}

void TParser::IncDecOperatorsBContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIncDecOperatorsB(this);
}

void TParser::IncDecOperatorsBContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIncDecOperatorsB(this);
}


antlrcpp::Any TParser::IncDecOperatorsBContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitIncDecOperatorsB(this);
  else
    return visitor->visitChildren(this);
}

TParser::IncDecOperatorsBContext* TParser::incDecOperatorsB() {
  IncDecOperatorsBContext *_localctx = _tracker.createInstance<IncDecOperatorsBContext>(_ctx, getState());
  enterRule(_localctx, 184, TParser::RuleIncDecOperatorsB);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1103);
    match(TParser::IncDecOperators);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- OpenOpAContext ------------------------------------------------------------------

TParser::OpenOpAContext::OpenOpAContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::OpenOpAContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}


size_t TParser::OpenOpAContext::getRuleIndex() const {
  return TParser::RuleOpenOpA;
}

void TParser::OpenOpAContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterOpenOpA(this);
}

void TParser::OpenOpAContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitOpenOpA(this);
}


antlrcpp::Any TParser::OpenOpAContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitOpenOpA(this);
  else
    return visitor->visitChildren(this);
}

TParser::OpenOpAContext* TParser::openOpA() {
  OpenOpAContext *_localctx = _tracker.createInstance<OpenOpAContext>(_ctx, getState());
  enterRule(_localctx, 186, TParser::RuleOpenOpA);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1105);
    match(TParser::OpenOp);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- CloseOpAContext ------------------------------------------------------------------

TParser::CloseOpAContext::CloseOpAContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::CloseOpAContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}


size_t TParser::CloseOpAContext::getRuleIndex() const {
  return TParser::RuleCloseOpA;
}

void TParser::CloseOpAContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterCloseOpA(this);
}

void TParser::CloseOpAContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitCloseOpA(this);
}


antlrcpp::Any TParser::CloseOpAContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitCloseOpA(this);
  else
    return visitor->visitChildren(this);
}

TParser::CloseOpAContext* TParser::closeOpA() {
  CloseOpAContext *_localctx = _tracker.createInstance<CloseOpAContext>(_ctx, getState());
  enterRule(_localctx, 188, TParser::RuleCloseOpA);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1107);
    match(TParser::CloseOp);
   
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
  "main", "sentences", "statements", "blockCode", "blockUse", "useValue", 
  "useString", "blockVariable", "variableItem", "variablePrefixModes", "blockAttribution", 
  "attributionElements", "blockMultipleAssignments", "variableMultipleAssignmentsModes", 
  "functionCall", "functionCallFlowControl", "functionCallParam", "functionCallParamElements", 
  "blockRet", "blockConditional", "ifElementUnique", "elifElements", "elifElementUnique", 
  "elseElementUnique", "conditionalBlockExpression", "conditionalBlockElements", 
  "blockLoop", "loopBlockElements", "loopComplete", "loopConditional", "loopInfinite", 
  "endOne", "endTwo", "loopOneMembers", "loopTwoMembers", "loopThreeMembers", 
  "loopThreeMembersValues", "blockBreak", "blockNext", "blockTryCatch", 
  "tryUniqueElement", "catchUniqueElement", "tryCatchElements", "blockFunction", 
  "blockFunctionDeclarationAttr", "functionParam", "functionAnonymousParamElements", 
  "functionAnonymousParam", "functionCodeBlock", "blockInterface", "interfaceCodeBlock", 
  "blockAbstraction", "abstractionCodeBlock", "blockClass", "blockClassDeclarationAttr", 
  "classAnonymousParam", "classCodeBlock", "blockArray", "indexArray", "indexArrayElements", 
  "associativeArray", "associativeArrayElements", "blockLambdaFunctions", 
  "lambdaFnParams", "lambdaFnCodeBlock", "blockClassConstructor", "blockFunctionCall", 
  "functionCallElements", "blockCascadingMethod", "blockCascadingMethodAttr", 
  "blockAnonymousObject", "blockAnonymousObjectAttr", "blockAccessArrayElements", 
  "arrayAccessElements", "arrayAccessElementsItems", "accessBlockAr", "arrayIndexAccess", 
  "firstIncDec", "lastIncDec", "blockPermissionTokens", "codeBlockFlowControl", 
  "codeBlockFlowControlElements", "codeBlockControl", "generalValue", "generalValueBlock", 
  "generalValueItems", "generalValueElements", "identifier", "identifierB", 
  "identifierC", "identifierD", "incDecOperatorsA", "incDecOperatorsB", 
  "openOpA", "closeOpA"
};

std::vector<std::string> TParser::_literalNames = {
  "", "'use'", "'var'", "'if'", "'elif'", "'else'", "'for'", "'ret'", "'fn'", 
  "'pub'", "'pro'", "'priv'", "'static'", "'final'", "'interface'", "'abstract'", 
  "'extends'", "'class'", "'implements'", "'new'", "'break'", "'next'", 
  "'async'", "'await'", "'try'", "'catch'", "'->'", "'=>'", "';'", "'='", 
  "'.'", "':'", "'::'", "'..'", "','", "'['", "']'", "'{'", "'}'", "'('", 
  "')'", "", "", "'!'"
};

std::vector<std::string> TParser::_symbolicNames = {
  "", "Use", "Var", "If", "Elif", "Else", "For", "Ret", "Function", "Pub", 
  "Pro", "Priv", "Static", "Final", "Interface", "Abstract", "Extends", 
  "Class", "Implements", "New", "Break", "Next", "Async", "Await", "Try", 
  "Catch", "ArrowRight", "ARightLB", "End", "Attr", "Point", "TwoPoint", 
  "TwoTwoPoint", "PointPoint", "Separator", "OpenArIndex", "CloseArIndex", 
  "OpenBlock", "CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", 
  "AssignmentOperator", "Not", "IncDecOperators", "Identifier", "IDPrefix", 
  "TypeSpec", "Words", "Integer", "Float", "String", "BlockComment", "LineComment", 
  "Whitespace", "Newline"
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
       0x3, 0x39, 0x458, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 
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
       0x9, 0x5f, 0x4, 0x60, 0x9, 0x60, 0x3, 0x2, 0x3, 0x2, 0x3, 0x2, 0x3, 
       0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x5, 0x3, 0xc9, 0xa, 
       0x3, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 
       0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 
       0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x5, 0x4, 
       0xdd, 0xa, 0x4, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 
       0x3, 0x5, 0x5, 0x5, 0xe5, 0xa, 0x5, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 
       0x3, 0x6, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x5, 
       0x7, 0xf0, 0xa, 0x7, 0x3, 0x8, 0x3, 0x8, 0x3, 0x9, 0x3, 0x9, 0x3, 
       0x9, 0x3, 0x9, 0x3, 0xa, 0x3, 0xa, 0x5, 0xa, 0xfa, 0xa, 0xa, 0x3, 
       0xa, 0x3, 0xa, 0x3, 0xa, 0x7, 0xa, 0xff, 0xa, 0xa, 0xc, 0xa, 0xe, 
       0xa, 0x102, 0xb, 0xa, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x5, 
       0xb, 0x108, 0xa, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xc, 0x3, 0xc, 0x3, 
       0xc, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x5, 0xd, 0x112, 0xa, 0xd, 0x3, 
       0xd, 0x5, 0xd, 0x115, 0xa, 0xd, 0x3, 0xd, 0x3, 0xd, 0x5, 0xd, 0x119, 
       0xa, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x7, 0xd, 0x11e, 0xa, 0xd, 
       0xc, 0xd, 0xe, 0xd, 0x121, 0xb, 0xd, 0x3, 0xd, 0x3, 0xd, 0x5, 0xd, 
       0x125, 0xa, 0xd, 0x3, 0xd, 0x3, 0xd, 0x5, 0xd, 0x129, 0xa, 0xd, 0x3, 
       0xd, 0x3, 0xd, 0x3, 0xd, 0x7, 0xd, 0x12e, 0xa, 0xd, 0xc, 0xd, 0xe, 
       0xd, 0x131, 0xb, 0xd, 0x5, 0xd, 0x133, 0xa, 0xd, 0x3, 0xe, 0x3, 0xe, 
       0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x7, 
       0xf, 0x13d, 0xa, 0xf, 0xc, 0xf, 0xe, 0xf, 0x140, 0xb, 0xf, 0x3, 0x10, 
       0x3, 0x10, 0x3, 0x10, 0x5, 0x10, 0x145, 0xa, 0x10, 0x3, 0x10, 0x3, 
       0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x5, 0x10, 0x14c, 0xa, 0x10, 
       0x3, 0x10, 0x3, 0x10, 0x5, 0x10, 0x150, 0xa, 0x10, 0x3, 0x11, 0x3, 
       0x11, 0x3, 0x11, 0x5, 0x11, 0x155, 0xa, 0x11, 0x3, 0x11, 0x3, 0x11, 
       0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 
       0x5, 0x12, 0x15f, 0xa, 0x12, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x7, 
       0x13, 0x164, 0xa, 0x13, 0xc, 0x13, 0xe, 0x13, 0x167, 0xb, 0x13, 0x3, 
       0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x15, 0x3, 0x15, 0x5, 
       0x15, 0x16f, 0xa, 0x15, 0x3, 0x15, 0x5, 0x15, 0x172, 0xa, 0x15, 0x3, 
       0x16, 0x3, 0x16, 0x3, 0x16, 0x3, 0x16, 0x3, 0x17, 0x3, 0x17, 0x7, 
       0x17, 0x17a, 0xa, 0x17, 0xc, 0x17, 0xe, 0x17, 0x17d, 0xb, 0x17, 0x3, 
       0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x19, 0x3, 0x19, 0x3, 
       0x19, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1c, 0x3, 
       0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x5, 0x1c, 0x18e, 0xa, 0x1c, 0x3, 0x1c, 
       0x3, 0x1c, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1e, 0x5, 0x1e, 0x195, 0xa, 
       0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 
       0x1e, 0x5, 0x1e, 0x19d, 0xa, 0x1e, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x20, 
       0x3, 0x20, 0x3, 0x20, 0x5, 0x20, 0x1a4, 0xa, 0x20, 0x3, 0x21, 0x3, 
       0x21, 0x3, 0x22, 0x3, 0x22, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x5, 
       0x23, 0x1ad, 0xa, 0x23, 0x3, 0x24, 0x3, 0x24, 0x5, 0x24, 0x1b1, 0xa, 
       0x24, 0x3, 0x25, 0x3, 0x25, 0x5, 0x25, 0x1b5, 0xa, 0x25, 0x3, 0x26, 
       0x3, 0x26, 0x3, 0x26, 0x7, 0x26, 0x1ba, 0xa, 0x26, 0xc, 0x26, 0xe, 
       0x26, 0x1bd, 0xb, 0x26, 0x3, 0x27, 0x3, 0x27, 0x3, 0x27, 0x3, 0x28, 
       0x3, 0x28, 0x3, 0x28, 0x3, 0x29, 0x3, 0x29, 0x5, 0x29, 0x1c7, 0xa, 
       0x29, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2b, 0x3, 0x2b, 0x5, 
       0x2b, 0x1ce, 0xa, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x5, 0x2b, 0x1d2, 0xa, 
       0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2c, 0x3, 0x2c, 0x3, 0x2d, 0x3, 
       0x2d, 0x3, 0x2d, 0x5, 0x2d, 0x1db, 0xa, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 
       0x5, 0x2d, 0x1df, 0xa, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x3, 
       0x2d, 0x5, 0x2d, 0x1e5, 0xa, 0x2d, 0x5, 0x2d, 0x1e7, 0xa, 0x2d, 0x3, 
       0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x5, 0x2d, 0x1ed, 0xa, 0x2d, 
       0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x5, 0x2d, 
       0x1f4, 0xa, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x5, 0x2d, 0x1f8, 0xa, 0x2d, 
       0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x5, 0x2d, 0x1fe, 0xa, 
       0x2d, 0x5, 0x2d, 0x200, 0xa, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x5, 0x2d, 
       0x204, 0xa, 0x2d, 0x5, 0x2d, 0x206, 0xa, 0x2d, 0x3, 0x2e, 0x3, 0x2e, 
       0x3, 0x2e, 0x5, 0x2e, 0x20b, 0xa, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x5, 
       0x2e, 0x20f, 0xa, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 
       0x5, 0x2e, 0x215, 0xa, 0x2e, 0x5, 0x2e, 0x217, 0xa, 0x2e, 0x3, 0x2e, 
       0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x5, 0x2e, 0x21d, 0xa, 0x2e, 0x3, 
       0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x5, 0x2e, 0x223, 0xa, 0x2e, 
       0x3, 0x2e, 0x3, 0x2e, 0x5, 0x2e, 0x227, 0xa, 0x2e, 0x3, 0x2e, 0x3, 
       0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x5, 0x2e, 0x22d, 0xa, 0x2e, 0x5, 0x2e, 
       0x22f, 0xa, 0x2e, 0x3, 0x2e, 0x5, 0x2e, 0x232, 0xa, 0x2e, 0x3, 0x2f, 
       0x3, 0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x5, 0x2f, 0x238, 0xa, 0x2f, 0x3, 
       0x30, 0x3, 0x30, 0x3, 0x30, 0x7, 0x30, 0x23d, 0xa, 0x30, 0xc, 0x30, 
       0xe, 0x30, 0x240, 0xb, 0x30, 0x3, 0x31, 0x3, 0x31, 0x3, 0x32, 0x3, 
       0x32, 0x3, 0x33, 0x3, 0x33, 0x3, 0x33, 0x3, 0x33, 0x5, 0x33, 0x24a, 
       0xa, 0x33, 0x3, 0x33, 0x3, 0x33, 0x3, 0x34, 0x3, 0x34, 0x3, 0x35, 
       0x3, 0x35, 0x3, 0x35, 0x3, 0x35, 0x5, 0x35, 0x254, 0xa, 0x35, 0x3, 
       0x35, 0x3, 0x35, 0x3, 0x36, 0x3, 0x36, 0x3, 0x37, 0x3, 0x37, 0x3, 
       0x37, 0x3, 0x37, 0x5, 0x37, 0x25e, 0xa, 0x37, 0x3, 0x37, 0x3, 0x37, 
       0x5, 0x37, 0x262, 0xa, 0x37, 0x3, 0x37, 0x3, 0x37, 0x5, 0x37, 0x266, 
       0xa, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 
       0x3, 0x37, 0x5, 0x37, 0x26e, 0xa, 0x37, 0x3, 0x37, 0x3, 0x37, 0x5, 
       0x37, 0x272, 0xa, 0x37, 0x3, 0x37, 0x5, 0x37, 0x275, 0xa, 0x37, 0x3, 
       0x37, 0x3, 0x37, 0x5, 0x37, 0x279, 0xa, 0x37, 0x3, 0x37, 0x3, 0x37, 
       0x5, 0x37, 0x27d, 0xa, 0x37, 0x3, 0x37, 0x3, 0x37, 0x5, 0x37, 0x281, 
       0xa, 0x37, 0x3, 0x37, 0x5, 0x37, 0x284, 0xa, 0x37, 0x3, 0x38, 0x3, 
       0x38, 0x3, 0x38, 0x3, 0x38, 0x5, 0x38, 0x28a, 0xa, 0x38, 0x3, 0x38, 
       0x3, 0x38, 0x5, 0x38, 0x28e, 0xa, 0x38, 0x3, 0x38, 0x3, 0x38, 0x5, 
       0x38, 0x292, 0xa, 0x38, 0x3, 0x38, 0x3, 0x38, 0x3, 0x38, 0x3, 0x38, 
       0x3, 0x38, 0x3, 0x38, 0x5, 0x38, 0x29a, 0xa, 0x38, 0x3, 0x38, 0x3, 
       0x38, 0x5, 0x38, 0x29e, 0xa, 0x38, 0x3, 0x38, 0x3, 0x38, 0x5, 0x38, 
       0x2a2, 0xa, 0x38, 0x3, 0x38, 0x3, 0x38, 0x5, 0x38, 0x2a6, 0xa, 0x38, 
       0x3, 0x38, 0x3, 0x38, 0x5, 0x38, 0x2aa, 0xa, 0x38, 0x3, 0x38, 0x5, 
       0x38, 0x2ad, 0xa, 0x38, 0x3, 0x39, 0x3, 0x39, 0x3, 0x3a, 0x3, 0x3a, 
       0x3, 0x3b, 0x3, 0x3b, 0x5, 0x3b, 0x2b5, 0xa, 0x3b, 0x3, 0x3c, 0x3, 
       0x3c, 0x3, 0x3c, 0x3, 0x3c, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 0x7, 
       0x3d, 0x2be, 0xa, 0x3d, 0xc, 0x3d, 0xe, 0x3d, 0x2c1, 0xb, 0x3d, 0x3, 
       0x3e, 0x3, 0x3e, 0x3, 0x3e, 0x3, 0x3e, 0x3, 0x3f, 0x3, 0x3f, 0x3, 
       0x3f, 0x3, 0x3f, 0x3, 0x3f, 0x7, 0x3f, 0x2cc, 0xa, 0x3f, 0xc, 0x3f, 
       0xe, 0x3f, 0x2cf, 0xb, 0x3f, 0x3, 0x40, 0x3, 0x40, 0x5, 0x40, 0x2d3, 
       0xa, 0x40, 0x3, 0x40, 0x3, 0x40, 0x3, 0x40, 0x3, 0x40, 0x5, 0x40, 
       0x2d9, 0xa, 0x40, 0x5, 0x40, 0x2db, 0xa, 0x40, 0x3, 0x40, 0x3, 0x40, 
       0x3, 0x40, 0x3, 0x41, 0x3, 0x41, 0x5, 0x41, 0x2e2, 0xa, 0x41, 0x3, 
       0x41, 0x3, 0x41, 0x7, 0x41, 0x2e6, 0xa, 0x41, 0xc, 0x41, 0xe, 0x41, 
       0x2e9, 0xb, 0x41, 0x3, 0x42, 0x3, 0x42, 0x5, 0x42, 0x2ed, 0xa, 0x42, 
       0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x5, 0x43, 0x2f2, 0xa, 0x43, 0x3, 
       0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x44, 0x3, 0x44, 0x3, 0x44, 0x5, 
       0x44, 0x2fa, 0xa, 0x44, 0x3, 0x44, 0x3, 0x44, 0x5, 0x44, 0x2fe, 0xa, 
       0x44, 0x3, 0x44, 0x3, 0x44, 0x3, 0x44, 0x3, 0x44, 0x3, 0x44, 0x3, 
       0x44, 0x5, 0x44, 0x306, 0xa, 0x44, 0x3, 0x44, 0x3, 0x44, 0x3, 0x44, 
       0x5, 0x44, 0x30b, 0xa, 0x44, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x7, 
       0x45, 0x310, 0xa, 0x45, 0xc, 0x45, 0xe, 0x45, 0x313, 0xb, 0x45, 0x3, 
       0x46, 0x3, 0x46, 0x3, 0x46, 0x3, 0x47, 0x3, 0x47, 0x3, 0x47, 0x5, 
       0x47, 0x31b, 0xa, 0x47, 0x3, 0x47, 0x5, 0x47, 0x31e, 0xa, 0x47, 0x3, 
       0x47, 0x3, 0x47, 0x7, 0x47, 0x322, 0xa, 0x47, 0xc, 0x47, 0xe, 0x47, 
       0x325, 0xb, 0x47, 0x3, 0x48, 0x5, 0x48, 0x328, 0xa, 0x48, 0x3, 0x48, 
       0x3, 0x48, 0x3, 0x48, 0x3, 0x48, 0x5, 0x48, 0x32e, 0xa, 0x48, 0x3, 
       0x48, 0x3, 0x48, 0x5, 0x48, 0x332, 0xa, 0x48, 0x3, 0x48, 0x3, 0x48, 
       0x3, 0x48, 0x3, 0x48, 0x5, 0x48, 0x338, 0xa, 0x48, 0x3, 0x48, 0x3, 
       0x48, 0x5, 0x48, 0x33c, 0xa, 0x48, 0x3, 0x48, 0x3, 0x48, 0x3, 0x49, 
       0x3, 0x49, 0x3, 0x49, 0x3, 0x49, 0x3, 0x49, 0x5, 0x49, 0x345, 0xa, 
       0x49, 0x3, 0x49, 0x3, 0x49, 0x3, 0x49, 0x3, 0x49, 0x3, 0x49, 0x3, 
       0x49, 0x5, 0x49, 0x34d, 0xa, 0x49, 0x3, 0x49, 0x3, 0x49, 0x5, 0x49, 
       0x351, 0xa, 0x49, 0x3, 0x4a, 0x3, 0x4a, 0x3, 0x4b, 0x3, 0x4b, 0x7, 
       0x4b, 0x357, 0xa, 0x4b, 0xc, 0x4b, 0xe, 0x4b, 0x35a, 0xb, 0x4b, 0x3, 
       0x4c, 0x5, 0x4c, 0x35d, 0xa, 0x4c, 0x3, 0x4c, 0x3, 0x4c, 0x5, 0x4c, 
       0x361, 0xa, 0x4c, 0x3, 0x4c, 0x5, 0x4c, 0x364, 0xa, 0x4c, 0x3, 0x4c, 
       0x5, 0x4c, 0x367, 0xa, 0x4c, 0x3, 0x4d, 0x3, 0x4d, 0x3, 0x4d, 0x3, 
       0x4d, 0x7, 0x4d, 0x36d, 0xa, 0x4d, 0xc, 0x4d, 0xe, 0x4d, 0x370, 0xb, 
       0x4d, 0x3, 0x4e, 0x3, 0x4e, 0x3, 0x4f, 0x3, 0x4f, 0x3, 0x50, 0x3, 
       0x50, 0x3, 0x51, 0x3, 0x51, 0x3, 0x52, 0x3, 0x52, 0x3, 0x52, 0x3, 
       0x52, 0x3, 0x52, 0x3, 0x52, 0x3, 0x52, 0x5, 0x52, 0x381, 0xa, 0x52, 
       0x3, 0x53, 0x3, 0x53, 0x3, 0x53, 0x3, 0x53, 0x3, 0x53, 0x3, 0x53, 
       0x3, 0x53, 0x3, 0x53, 0x3, 0x53, 0x5, 0x53, 0x38c, 0xa, 0x53, 0x3, 
       0x54, 0x3, 0x54, 0x3, 0x54, 0x3, 0x54, 0x3, 0x54, 0x3, 0x54, 0x5, 
       0x54, 0x394, 0xa, 0x54, 0x3, 0x55, 0x5, 0x55, 0x397, 0xa, 0x55, 0x3, 
       0x55, 0x3, 0x55, 0x5, 0x55, 0x39b, 0xa, 0x55, 0x3, 0x55, 0x5, 0x55, 
       0x39e, 0xa, 0x55, 0x3, 0x55, 0x5, 0x55, 0x3a1, 0xa, 0x55, 0x3, 0x55, 
       0x5, 0x55, 0x3a4, 0xa, 0x55, 0x3, 0x55, 0x3, 0x55, 0x3, 0x55, 0x3, 
       0x55, 0x5, 0x55, 0x3aa, 0xa, 0x55, 0x3, 0x55, 0x5, 0x55, 0x3ad, 0xa, 
       0x55, 0x3, 0x55, 0x5, 0x55, 0x3b0, 0xa, 0x55, 0x3, 0x55, 0x5, 0x55, 
       0x3b3, 0xa, 0x55, 0x3, 0x55, 0x5, 0x55, 0x3b6, 0xa, 0x55, 0x3, 0x55, 
       0x5, 0x55, 0x3b9, 0xa, 0x55, 0x3, 0x55, 0x3, 0x55, 0x5, 0x55, 0x3bd, 
       0xa, 0x55, 0x3, 0x55, 0x5, 0x55, 0x3c0, 0xa, 0x55, 0x3, 0x55, 0x5, 
       0x55, 0x3c3, 0xa, 0x55, 0x3, 0x55, 0x5, 0x55, 0x3c6, 0xa, 0x55, 0x3, 
       0x55, 0x5, 0x55, 0x3c9, 0xa, 0x55, 0x3, 0x55, 0x5, 0x55, 0x3cc, 0xa, 
       0x55, 0x3, 0x55, 0x3, 0x55, 0x5, 0x55, 0x3d0, 0xa, 0x55, 0x3, 0x55, 
       0x5, 0x55, 0x3d3, 0xa, 0x55, 0x3, 0x55, 0x5, 0x55, 0x3d6, 0xa, 0x55, 
       0x3, 0x55, 0x5, 0x55, 0x3d9, 0xa, 0x55, 0x3, 0x55, 0x3, 0x55, 0x5, 
       0x55, 0x3dd, 0xa, 0x55, 0x3, 0x55, 0x5, 0x55, 0x3e0, 0xa, 0x55, 0x3, 
       0x55, 0x5, 0x55, 0x3e3, 0xa, 0x55, 0x3, 0x55, 0x5, 0x55, 0x3e6, 0xa, 
       0x55, 0x3, 0x55, 0x3, 0x55, 0x5, 0x55, 0x3ea, 0xa, 0x55, 0x3, 0x55, 
       0x5, 0x55, 0x3ed, 0xa, 0x55, 0x3, 0x55, 0x5, 0x55, 0x3f0, 0xa, 0x55, 
       0x5, 0x55, 0x3f2, 0xa, 0x55, 0x3, 0x55, 0x5, 0x55, 0x3f5, 0xa, 0x55, 
       0x3, 0x55, 0x5, 0x55, 0x3f8, 0xa, 0x55, 0x3, 0x55, 0x3, 0x55, 0x5, 
       0x55, 0x3fc, 0xa, 0x55, 0x3, 0x55, 0x5, 0x55, 0x3ff, 0xa, 0x55, 0x3, 
       0x55, 0x5, 0x55, 0x402, 0xa, 0x55, 0x3, 0x55, 0x5, 0x55, 0x405, 0xa, 
       0x55, 0x3, 0x55, 0x3, 0x55, 0x3, 0x55, 0x3, 0x55, 0x5, 0x55, 0x40b, 
       0xa, 0x55, 0x3, 0x55, 0x5, 0x55, 0x40e, 0xa, 0x55, 0x3, 0x55, 0x3, 
       0x55, 0x5, 0x55, 0x412, 0xa, 0x55, 0x3, 0x55, 0x5, 0x55, 0x415, 0xa, 
       0x55, 0x3, 0x55, 0x5, 0x55, 0x418, 0xa, 0x55, 0x3, 0x55, 0x5, 0x55, 
       0x41b, 0xa, 0x55, 0x3, 0x55, 0x5, 0x55, 0x41e, 0xa, 0x55, 0x3, 0x55, 
       0x3, 0x55, 0x3, 0x55, 0x3, 0x55, 0x3, 0x55, 0x5, 0x55, 0x425, 0xa, 
       0x55, 0x3, 0x55, 0x5, 0x55, 0x428, 0xa, 0x55, 0x3, 0x55, 0x3, 0x55, 
       0x5, 0x55, 0x42c, 0xa, 0x55, 0x3, 0x55, 0x5, 0x55, 0x42f, 0xa, 0x55, 
       0x3, 0x55, 0x5, 0x55, 0x432, 0xa, 0x55, 0x5, 0x55, 0x434, 0xa, 0x55, 
       0x3, 0x56, 0x3, 0x56, 0x3, 0x56, 0x3, 0x56, 0x3, 0x57, 0x3, 0x57, 
       0x7, 0x57, 0x43c, 0xa, 0x57, 0xc, 0x57, 0xe, 0x57, 0x43f, 0xb, 0x57, 
       0x3, 0x58, 0x3, 0x58, 0x7, 0x58, 0x443, 0xa, 0x58, 0xc, 0x58, 0xe, 
       0x58, 0x446, 0xb, 0x58, 0x3, 0x59, 0x3, 0x59, 0x3, 0x5a, 0x3, 0x5a, 
       0x3, 0x5b, 0x3, 0x5b, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5d, 0x3, 0x5d, 
       0x3, 0x5e, 0x3, 0x5e, 0x3, 0x5f, 0x3, 0x5f, 0x3, 0x60, 0x3, 0x60, 
       0x3, 0x60, 0x2, 0x2, 0x61, 0x2, 0x4, 0x6, 0x8, 0xa, 0xc, 0xe, 0x10, 
       0x12, 0x14, 0x16, 0x18, 0x1a, 0x1c, 0x1e, 0x20, 0x22, 0x24, 0x26, 
       0x28, 0x2a, 0x2c, 0x2e, 0x30, 0x32, 0x34, 0x36, 0x38, 0x3a, 0x3c, 
       0x3e, 0x40, 0x42, 0x44, 0x46, 0x48, 0x4a, 0x4c, 0x4e, 0x50, 0x52, 
       0x54, 0x56, 0x58, 0x5a, 0x5c, 0x5e, 0x60, 0x62, 0x64, 0x66, 0x68, 
       0x6a, 0x6c, 0x6e, 0x70, 0x72, 0x74, 0x76, 0x78, 0x7a, 0x7c, 0x7e, 
       0x80, 0x82, 0x84, 0x86, 0x88, 0x8a, 0x8c, 0x8e, 0x90, 0x92, 0x94, 
       0x96, 0x98, 0x9a, 0x9c, 0x9e, 0xa0, 0xa2, 0xa4, 0xa6, 0xa8, 0xaa, 
       0xac, 0xae, 0xb0, 0xb2, 0xb4, 0xb6, 0xb8, 0xba, 0xbc, 0xbe, 0x2, 
       0x6, 0x4, 0x2, 0x15, 0x15, 0x19, 0x19, 0x4, 0x2, 0x1f, 0x1f, 0x2c, 
       0x2c, 0x4, 0x2, 0x20, 0x20, 0x22, 0x22, 0x4, 0x2, 0xb, 0xf, 0x18, 
       0x18, 0x2, 0x4c0, 0x2, 0xc0, 0x3, 0x2, 0x2, 0x2, 0x4, 0xc8, 0x3, 
       0x2, 0x2, 0x2, 0x6, 0xdc, 0x3, 0x2, 0x2, 0x2, 0x8, 0xe4, 0x3, 0x2, 
       0x2, 0x2, 0xa, 0xe6, 0x3, 0x2, 0x2, 0x2, 0xc, 0xef, 0x3, 0x2, 0x2, 
       0x2, 0xe, 0xf1, 0x3, 0x2, 0x2, 0x2, 0x10, 0xf3, 0x3, 0x2, 0x2, 0x2, 
       0x12, 0xf7, 0x3, 0x2, 0x2, 0x2, 0x14, 0x107, 0x3, 0x2, 0x2, 0x2, 
       0x16, 0x10b, 0x3, 0x2, 0x2, 0x2, 0x18, 0x132, 0x3, 0x2, 0x2, 0x2, 
       0x1a, 0x134, 0x3, 0x2, 0x2, 0x2, 0x1c, 0x139, 0x3, 0x2, 0x2, 0x2, 
       0x1e, 0x14f, 0x3, 0x2, 0x2, 0x2, 0x20, 0x151, 0x3, 0x2, 0x2, 0x2, 
       0x22, 0x15e, 0x3, 0x2, 0x2, 0x2, 0x24, 0x160, 0x3, 0x2, 0x2, 0x2, 
       0x26, 0x168, 0x3, 0x2, 0x2, 0x2, 0x28, 0x16c, 0x3, 0x2, 0x2, 0x2, 
       0x2a, 0x173, 0x3, 0x2, 0x2, 0x2, 0x2c, 0x177, 0x3, 0x2, 0x2, 0x2, 
       0x2e, 0x17e, 0x3, 0x2, 0x2, 0x2, 0x30, 0x182, 0x3, 0x2, 0x2, 0x2, 
       0x32, 0x185, 0x3, 0x2, 0x2, 0x2, 0x34, 0x187, 0x3, 0x2, 0x2, 0x2, 
       0x36, 0x189, 0x3, 0x2, 0x2, 0x2, 0x38, 0x191, 0x3, 0x2, 0x2, 0x2, 
       0x3a, 0x194, 0x3, 0x2, 0x2, 0x2, 0x3c, 0x19e, 0x3, 0x2, 0x2, 0x2, 
       0x3e, 0x1a3, 0x3, 0x2, 0x2, 0x2, 0x40, 0x1a5, 0x3, 0x2, 0x2, 0x2, 
       0x42, 0x1a7, 0x3, 0x2, 0x2, 0x2, 0x44, 0x1ac, 0x3, 0x2, 0x2, 0x2, 
       0x46, 0x1b0, 0x3, 0x2, 0x2, 0x2, 0x48, 0x1b4, 0x3, 0x2, 0x2, 0x2, 
       0x4a, 0x1b6, 0x3, 0x2, 0x2, 0x2, 0x4c, 0x1be, 0x3, 0x2, 0x2, 0x2, 
       0x4e, 0x1c1, 0x3, 0x2, 0x2, 0x2, 0x50, 0x1c4, 0x3, 0x2, 0x2, 0x2, 
       0x52, 0x1c8, 0x3, 0x2, 0x2, 0x2, 0x54, 0x1cb, 0x3, 0x2, 0x2, 0x2, 
       0x56, 0x1d5, 0x3, 0x2, 0x2, 0x2, 0x58, 0x205, 0x3, 0x2, 0x2, 0x2, 
       0x5a, 0x231, 0x3, 0x2, 0x2, 0x2, 0x5c, 0x233, 0x3, 0x2, 0x2, 0x2, 
       0x5e, 0x239, 0x3, 0x2, 0x2, 0x2, 0x60, 0x241, 0x3, 0x2, 0x2, 0x2, 
       0x62, 0x243, 0x3, 0x2, 0x2, 0x2, 0x64, 0x245, 0x3, 0x2, 0x2, 0x2, 
       0x66, 0x24d, 0x3, 0x2, 0x2, 0x2, 0x68, 0x24f, 0x3, 0x2, 0x2, 0x2, 
       0x6a, 0x257, 0x3, 0x2, 0x2, 0x2, 0x6c, 0x283, 0x3, 0x2, 0x2, 0x2, 
       0x6e, 0x2ac, 0x3, 0x2, 0x2, 0x2, 0x70, 0x2ae, 0x3, 0x2, 0x2, 0x2, 
       0x72, 0x2b0, 0x3, 0x2, 0x2, 0x2, 0x74, 0x2b4, 0x3, 0x2, 0x2, 0x2, 
       0x76, 0x2b6, 0x3, 0x2, 0x2, 0x2, 0x78, 0x2ba, 0x3, 0x2, 0x2, 0x2, 
       0x7a, 0x2c2, 0x3, 0x2, 0x2, 0x2, 0x7c, 0x2c6, 0x3, 0x2, 0x2, 0x2, 
       0x7e, 0x2d0, 0x3, 0x2, 0x2, 0x2, 0x80, 0x2df, 0x3, 0x2, 0x2, 0x2, 
       0x82, 0x2ec, 0x3, 0x2, 0x2, 0x2, 0x84, 0x2ee, 0x3, 0x2, 0x2, 0x2, 
       0x86, 0x30a, 0x3, 0x2, 0x2, 0x2, 0x88, 0x30c, 0x3, 0x2, 0x2, 0x2, 
       0x8a, 0x314, 0x3, 0x2, 0x2, 0x2, 0x8c, 0x317, 0x3, 0x2, 0x2, 0x2, 
       0x8e, 0x327, 0x3, 0x2, 0x2, 0x2, 0x90, 0x33f, 0x3, 0x2, 0x2, 0x2, 
       0x92, 0x352, 0x3, 0x2, 0x2, 0x2, 0x94, 0x354, 0x3, 0x2, 0x2, 0x2, 
       0x96, 0x35c, 0x3, 0x2, 0x2, 0x2, 0x98, 0x368, 0x3, 0x2, 0x2, 0x2, 
       0x9a, 0x371, 0x3, 0x2, 0x2, 0x2, 0x9c, 0x373, 0x3, 0x2, 0x2, 0x2, 
       0x9e, 0x375, 0x3, 0x2, 0x2, 0x2, 0xa0, 0x377, 0x3, 0x2, 0x2, 0x2, 
       0xa2, 0x380, 0x3, 0x2, 0x2, 0x2, 0xa4, 0x38b, 0x3, 0x2, 0x2, 0x2, 
       0xa6, 0x393, 0x3, 0x2, 0x2, 0x2, 0xa8, 0x433, 0x3, 0x2, 0x2, 0x2, 
       0xaa, 0x435, 0x3, 0x2, 0x2, 0x2, 0xac, 0x439, 0x3, 0x2, 0x2, 0x2, 
       0xae, 0x440, 0x3, 0x2, 0x2, 0x2, 0xb0, 0x447, 0x3, 0x2, 0x2, 0x2, 
       0xb2, 0x449, 0x3, 0x2, 0x2, 0x2, 0xb4, 0x44b, 0x3, 0x2, 0x2, 0x2, 
       0xb6, 0x44d, 0x3, 0x2, 0x2, 0x2, 0xb8, 0x44f, 0x3, 0x2, 0x2, 0x2, 
       0xba, 0x451, 0x3, 0x2, 0x2, 0x2, 0xbc, 0x453, 0x3, 0x2, 0x2, 0x2, 
       0xbe, 0x455, 0x3, 0x2, 0x2, 0x2, 0xc0, 0xc1, 0x5, 0x4, 0x3, 0x2, 
       0xc1, 0xc2, 0x7, 0x2, 0x2, 0x3, 0xc2, 0x3, 0x3, 0x2, 0x2, 0x2, 0xc3, 
       0xc9, 0x5, 0x6, 0x4, 0x2, 0xc4, 0xc5, 0x5, 0x6, 0x4, 0x2, 0xc5, 0xc6, 
       0x5, 0x4, 0x3, 0x2, 0xc6, 0xc9, 0x3, 0x2, 0x2, 0x2, 0xc7, 0xc9, 0x3, 
       0x2, 0x2, 0x2, 0xc8, 0xc3, 0x3, 0x2, 0x2, 0x2, 0xc8, 0xc4, 0x3, 0x2, 
       0x2, 0x2, 0xc8, 0xc7, 0x3, 0x2, 0x2, 0x2, 0xc9, 0x5, 0x3, 0x2, 0x2, 
       0x2, 0xca, 0xdd, 0x5, 0xa, 0x6, 0x2, 0xcb, 0xdd, 0x5, 0x10, 0x9, 
       0x2, 0xcc, 0xdd, 0x5, 0x26, 0x14, 0x2, 0xcd, 0xdd, 0x5, 0x28, 0x15, 
       0x2, 0xce, 0xdd, 0x5, 0x36, 0x1c, 0x2, 0xcf, 0xdd, 0x5, 0x4c, 0x27, 
       0x2, 0xd0, 0xdd, 0x5, 0x4e, 0x28, 0x2, 0xd1, 0xdd, 0x5, 0x50, 0x29, 
       0x2, 0xd2, 0xdd, 0x5, 0x58, 0x2d, 0x2, 0xd3, 0xdd, 0x5, 0x64, 0x33, 
       0x2, 0xd4, 0xdd, 0x5, 0x68, 0x35, 0x2, 0xd5, 0xdd, 0x5, 0x6c, 0x37, 
       0x2, 0xd6, 0xdd, 0x5, 0x86, 0x44, 0x2, 0xd7, 0xdd, 0x5, 0x84, 0x43, 
       0x2, 0xd8, 0xdd, 0x5, 0x16, 0xc, 0x2, 0xd9, 0xdd, 0x5, 0x1a, 0xe, 
       0x2, 0xda, 0xdd, 0x5, 0xa0, 0x51, 0x2, 0xdb, 0xdd, 0x5, 0x8e, 0x48, 
       0x2, 0xdc, 0xca, 0x3, 0x2, 0x2, 0x2, 0xdc, 0xcb, 0x3, 0x2, 0x2, 0x2, 
       0xdc, 0xcc, 0x3, 0x2, 0x2, 0x2, 0xdc, 0xcd, 0x3, 0x2, 0x2, 0x2, 0xdc, 
       0xce, 0x3, 0x2, 0x2, 0x2, 0xdc, 0xcf, 0x3, 0x2, 0x2, 0x2, 0xdc, 0xd0, 
       0x3, 0x2, 0x2, 0x2, 0xdc, 0xd1, 0x3, 0x2, 0x2, 0x2, 0xdc, 0xd2, 0x3, 
       0x2, 0x2, 0x2, 0xdc, 0xd3, 0x3, 0x2, 0x2, 0x2, 0xdc, 0xd4, 0x3, 0x2, 
       0x2, 0x2, 0xdc, 0xd5, 0x3, 0x2, 0x2, 0x2, 0xdc, 0xd6, 0x3, 0x2, 0x2, 
       0x2, 0xdc, 0xd7, 0x3, 0x2, 0x2, 0x2, 0xdc, 0xd8, 0x3, 0x2, 0x2, 0x2, 
       0xdc, 0xd9, 0x3, 0x2, 0x2, 0x2, 0xdc, 0xda, 0x3, 0x2, 0x2, 0x2, 0xdc, 
       0xdb, 0x3, 0x2, 0x2, 0x2, 0xdd, 0x7, 0x3, 0x2, 0x2, 0x2, 0xde, 0xdf, 
       0x7, 0x27, 0x2, 0x2, 0xdf, 0xe5, 0x7, 0x28, 0x2, 0x2, 0xe0, 0xe1, 
       0x7, 0x27, 0x2, 0x2, 0xe1, 0xe2, 0x5, 0x4, 0x3, 0x2, 0xe2, 0xe3, 
       0x7, 0x28, 0x2, 0x2, 0xe3, 0xe5, 0x3, 0x2, 0x2, 0x2, 0xe4, 0xde, 
       0x3, 0x2, 0x2, 0x2, 0xe4, 0xe0, 0x3, 0x2, 0x2, 0x2, 0xe5, 0x9, 0x3, 
       0x2, 0x2, 0x2, 0xe6, 0xe7, 0x7, 0x3, 0x2, 0x2, 0xe7, 0xe8, 0x5, 0xc, 
       0x7, 0x2, 0xe8, 0xe9, 0x7, 0x1e, 0x2, 0x2, 0xe9, 0xb, 0x3, 0x2, 0x2, 
       0x2, 0xea, 0xf0, 0x5, 0xe, 0x8, 0x2, 0xeb, 0xec, 0x5, 0xe, 0x8, 0x2, 
       0xec, 0xed, 0x7, 0x24, 0x2, 0x2, 0xed, 0xee, 0x5, 0xc, 0x7, 0x2, 
       0xee, 0xf0, 0x3, 0x2, 0x2, 0x2, 0xef, 0xea, 0x3, 0x2, 0x2, 0x2, 0xef, 
       0xeb, 0x3, 0x2, 0x2, 0x2, 0xf0, 0xd, 0x3, 0x2, 0x2, 0x2, 0xf1, 0xf2, 
       0x7, 0x35, 0x2, 0x2, 0xf2, 0xf, 0x3, 0x2, 0x2, 0x2, 0xf3, 0xf4, 0x7, 
       0x4, 0x2, 0x2, 0xf4, 0xf5, 0x5, 0x12, 0xa, 0x2, 0xf5, 0xf6, 0x7, 
       0x1e, 0x2, 0x2, 0xf6, 0x11, 0x3, 0x2, 0x2, 0x2, 0xf7, 0xf9, 0x5, 
       0x14, 0xb, 0x2, 0xf8, 0xfa, 0x9, 0x2, 0x2, 0x2, 0xf9, 0xf8, 0x3, 
       0x2, 0x2, 0x2, 0xf9, 0xfa, 0x3, 0x2, 0x2, 0x2, 0xfa, 0xfb, 0x3, 0x2, 
       0x2, 0x2, 0xfb, 0x100, 0x5, 0xae, 0x58, 0x2, 0xfc, 0xfd, 0x7, 0x24, 
       0x2, 0x2, 0xfd, 0xff, 0x5, 0x12, 0xa, 0x2, 0xfe, 0xfc, 0x3, 0x2, 
       0x2, 0x2, 0xff, 0x102, 0x3, 0x2, 0x2, 0x2, 0x100, 0xfe, 0x3, 0x2, 
       0x2, 0x2, 0x100, 0x101, 0x3, 0x2, 0x2, 0x2, 0x101, 0x13, 0x3, 0x2, 
       0x2, 0x2, 0x102, 0x100, 0x3, 0x2, 0x2, 0x2, 0x103, 0x108, 0x5, 0xb0, 
       0x59, 0x2, 0x104, 0x105, 0x5, 0xb0, 0x59, 0x2, 0x105, 0x106, 0x7, 
       0x31, 0x2, 0x2, 0x106, 0x108, 0x3, 0x2, 0x2, 0x2, 0x107, 0x103, 0x3, 
       0x2, 0x2, 0x2, 0x107, 0x104, 0x3, 0x2, 0x2, 0x2, 0x108, 0x109, 0x3, 
       0x2, 0x2, 0x2, 0x109, 0x10a, 0x9, 0x3, 0x2, 0x2, 0x10a, 0x15, 0x3, 
       0x2, 0x2, 0x2, 0x10b, 0x10c, 0x5, 0x18, 0xd, 0x2, 0x10c, 0x10d, 0x7, 
       0x1e, 0x2, 0x2, 0x10d, 0x17, 0x3, 0x2, 0x2, 0x2, 0x10e, 0x111, 0x5, 
       0xb0, 0x59, 0x2, 0x10f, 0x110, 0x9, 0x4, 0x2, 0x2, 0x110, 0x112, 
       0x5, 0xb2, 0x5a, 0x2, 0x111, 0x10f, 0x3, 0x2, 0x2, 0x2, 0x111, 0x112, 
       0x3, 0x2, 0x2, 0x2, 0x112, 0x114, 0x3, 0x2, 0x2, 0x2, 0x113, 0x115, 
       0x7, 0x31, 0x2, 0x2, 0x114, 0x113, 0x3, 0x2, 0x2, 0x2, 0x114, 0x115, 
       0x3, 0x2, 0x2, 0x2, 0x115, 0x116, 0x3, 0x2, 0x2, 0x2, 0x116, 0x118, 
       0x9, 0x3, 0x2, 0x2, 0x117, 0x119, 0x9, 0x2, 0x2, 0x2, 0x118, 0x117, 
       0x3, 0x2, 0x2, 0x2, 0x118, 0x119, 0x3, 0x2, 0x2, 0x2, 0x119, 0x11a, 
       0x3, 0x2, 0x2, 0x2, 0x11a, 0x11f, 0x5, 0xae, 0x58, 0x2, 0x11b, 0x11c, 
       0x7, 0x24, 0x2, 0x2, 0x11c, 0x11e, 0x5, 0x18, 0xd, 0x2, 0x11d, 0x11b, 
       0x3, 0x2, 0x2, 0x2, 0x11e, 0x121, 0x3, 0x2, 0x2, 0x2, 0x11f, 0x11d, 
       0x3, 0x2, 0x2, 0x2, 0x11f, 0x120, 0x3, 0x2, 0x2, 0x2, 0x120, 0x133, 
       0x3, 0x2, 0x2, 0x2, 0x121, 0x11f, 0x3, 0x2, 0x2, 0x2, 0x122, 0x124, 
       0x5, 0xa8, 0x55, 0x2, 0x123, 0x125, 0x7, 0x31, 0x2, 0x2, 0x124, 0x123, 
       0x3, 0x2, 0x2, 0x2, 0x124, 0x125, 0x3, 0x2, 0x2, 0x2, 0x125, 0x126, 
       0x3, 0x2, 0x2, 0x2, 0x126, 0x128, 0x9, 0x3, 0x2, 0x2, 0x127, 0x129, 
       0x9, 0x2, 0x2, 0x2, 0x128, 0x127, 0x3, 0x2, 0x2, 0x2, 0x128, 0x129, 
       0x3, 0x2, 0x2, 0x2, 0x129, 0x12a, 0x3, 0x2, 0x2, 0x2, 0x12a, 0x12f, 
       0x5, 0xae, 0x58, 0x2, 0x12b, 0x12c, 0x7, 0x24, 0x2, 0x2, 0x12c, 0x12e, 
       0x5, 0x18, 0xd, 0x2, 0x12d, 0x12b, 0x3, 0x2, 0x2, 0x2, 0x12e, 0x131, 
       0x3, 0x2, 0x2, 0x2, 0x12f, 0x12d, 0x3, 0x2, 0x2, 0x2, 0x12f, 0x130, 
       0x3, 0x2, 0x2, 0x2, 0x130, 0x133, 0x3, 0x2, 0x2, 0x2, 0x131, 0x12f, 
       0x3, 0x2, 0x2, 0x2, 0x132, 0x10e, 0x3, 0x2, 0x2, 0x2, 0x132, 0x122, 
       0x3, 0x2, 0x2, 0x2, 0x133, 0x19, 0x3, 0x2, 0x2, 0x2, 0x134, 0x135, 
       0x5, 0x1c, 0xf, 0x2, 0x135, 0x136, 0x7, 0x1f, 0x2, 0x2, 0x136, 0x137, 
       0x5, 0xae, 0x58, 0x2, 0x137, 0x138, 0x7, 0x1e, 0x2, 0x2, 0x138, 0x1b, 
       0x3, 0x2, 0x2, 0x2, 0x139, 0x13e, 0x5, 0xa8, 0x55, 0x2, 0x13a, 0x13b, 
       0x7, 0x1f, 0x2, 0x2, 0x13b, 0x13d, 0x5, 0x1c, 0xf, 0x2, 0x13c, 0x13a, 
       0x3, 0x2, 0x2, 0x2, 0x13d, 0x140, 0x3, 0x2, 0x2, 0x2, 0x13e, 0x13c, 
       0x3, 0x2, 0x2, 0x2, 0x13e, 0x13f, 0x3, 0x2, 0x2, 0x2, 0x13f, 0x1d, 
       0x3, 0x2, 0x2, 0x2, 0x140, 0x13e, 0x3, 0x2, 0x2, 0x2, 0x141, 0x144, 
       0x5, 0xb0, 0x59, 0x2, 0x142, 0x143, 0x9, 0x4, 0x2, 0x2, 0x143, 0x145, 
       0x5, 0xb2, 0x5a, 0x2, 0x144, 0x142, 0x3, 0x2, 0x2, 0x2, 0x144, 0x145, 
       0x3, 0x2, 0x2, 0x2, 0x145, 0x146, 0x3, 0x2, 0x2, 0x2, 0x146, 0x147, 
       0x5, 0x22, 0x12, 0x2, 0x147, 0x150, 0x3, 0x2, 0x2, 0x2, 0x148, 0x149, 
       0x5, 0x92, 0x4a, 0x2, 0x149, 0x14b, 0x7, 0x29, 0x2, 0x2, 0x14a, 0x14c, 
       0x5, 0x88, 0x45, 0x2, 0x14b, 0x14a, 0x3, 0x2, 0x2, 0x2, 0x14b, 0x14c, 
       0x3, 0x2, 0x2, 0x2, 0x14c, 0x14d, 0x3, 0x2, 0x2, 0x2, 0x14d, 0x14e, 
       0x7, 0x2a, 0x2, 0x2, 0x14e, 0x150, 0x3, 0x2, 0x2, 0x2, 0x14f, 0x141, 
       0x3, 0x2, 0x2, 0x2, 0x14f, 0x148, 0x3, 0x2, 0x2, 0x2, 0x150, 0x1f, 
       0x3, 0x2, 0x2, 0x2, 0x151, 0x154, 0x5, 0xb0, 0x59, 0x2, 0x152, 0x153, 
       0x9, 0x4, 0x2, 0x2, 0x153, 0x155, 0x5, 0xb2, 0x5a, 0x2, 0x154, 0x152, 
       0x3, 0x2, 0x2, 0x2, 0x154, 0x155, 0x3, 0x2, 0x2, 0x2, 0x155, 0x156, 
       0x3, 0x2, 0x2, 0x2, 0x156, 0x157, 0x5, 0x22, 0x12, 0x2, 0x157, 0x21, 
       0x3, 0x2, 0x2, 0x2, 0x158, 0x159, 0x7, 0x29, 0x2, 0x2, 0x159, 0x15f, 
       0x7, 0x2a, 0x2, 0x2, 0x15a, 0x15b, 0x7, 0x29, 0x2, 0x2, 0x15b, 0x15c, 
       0x5, 0x24, 0x13, 0x2, 0x15c, 0x15d, 0x7, 0x2a, 0x2, 0x2, 0x15d, 0x15f, 
       0x3, 0x2, 0x2, 0x2, 0x15e, 0x158, 0x3, 0x2, 0x2, 0x2, 0x15e, 0x15a, 
       0x3, 0x2, 0x2, 0x2, 0x15f, 0x23, 0x3, 0x2, 0x2, 0x2, 0x160, 0x165, 
       0x5, 0xae, 0x58, 0x2, 0x161, 0x162, 0x7, 0x24, 0x2, 0x2, 0x162, 0x164, 
       0x5, 0x24, 0x13, 0x2, 0x163, 0x161, 0x3, 0x2, 0x2, 0x2, 0x164, 0x167, 
       0x3, 0x2, 0x2, 0x2, 0x165, 0x163, 0x3, 0x2, 0x2, 0x2, 0x165, 0x166, 
       0x3, 0x2, 0x2, 0x2, 0x166, 0x25, 0x3, 0x2, 0x2, 0x2, 0x167, 0x165, 
       0x3, 0x2, 0x2, 0x2, 0x168, 0x169, 0x7, 0x9, 0x2, 0x2, 0x169, 0x16a, 
       0x5, 0xae, 0x58, 0x2, 0x16a, 0x16b, 0x7, 0x1e, 0x2, 0x2, 0x16b, 0x27, 
       0x3, 0x2, 0x2, 0x2, 0x16c, 0x16e, 0x5, 0x2a, 0x16, 0x2, 0x16d, 0x16f, 
       0x5, 0x2c, 0x17, 0x2, 0x16e, 0x16d, 0x3, 0x2, 0x2, 0x2, 0x16e, 0x16f, 
       0x3, 0x2, 0x2, 0x2, 0x16f, 0x171, 0x3, 0x2, 0x2, 0x2, 0x170, 0x172, 
       0x5, 0x30, 0x19, 0x2, 0x171, 0x170, 0x3, 0x2, 0x2, 0x2, 0x171, 0x172, 
       0x3, 0x2, 0x2, 0x2, 0x172, 0x29, 0x3, 0x2, 0x2, 0x2, 0x173, 0x174, 
       0x7, 0x5, 0x2, 0x2, 0x174, 0x175, 0x5, 0x32, 0x1a, 0x2, 0x175, 0x176, 
       0x5, 0x34, 0x1b, 0x2, 0x176, 0x2b, 0x3, 0x2, 0x2, 0x2, 0x177, 0x17b, 
       0x5, 0x2e, 0x18, 0x2, 0x178, 0x17a, 0x5, 0x2c, 0x17, 0x2, 0x179, 
       0x178, 0x3, 0x2, 0x2, 0x2, 0x17a, 0x17d, 0x3, 0x2, 0x2, 0x2, 0x17b, 
       0x179, 0x3, 0x2, 0x2, 0x2, 0x17b, 0x17c, 0x3, 0x2, 0x2, 0x2, 0x17c, 
       0x2d, 0x3, 0x2, 0x2, 0x2, 0x17d, 0x17b, 0x3, 0x2, 0x2, 0x2, 0x17e, 
       0x17f, 0x7, 0x6, 0x2, 0x2, 0x17f, 0x180, 0x5, 0x32, 0x1a, 0x2, 0x180, 
       0x181, 0x5, 0x34, 0x1b, 0x2, 0x181, 0x2f, 0x3, 0x2, 0x2, 0x2, 0x182, 
       0x183, 0x7, 0x7, 0x2, 0x2, 0x183, 0x184, 0x5, 0x34, 0x1b, 0x2, 0x184, 
       0x31, 0x3, 0x2, 0x2, 0x2, 0x185, 0x186, 0x5, 0xae, 0x58, 0x2, 0x186, 
       0x33, 0x3, 0x2, 0x2, 0x2, 0x187, 0x188, 0x5, 0xa2, 0x52, 0x2, 0x188, 
       0x35, 0x3, 0x2, 0x2, 0x2, 0x189, 0x18d, 0x7, 0x8, 0x2, 0x2, 0x18a, 
       0x18e, 0x5, 0x3e, 0x20, 0x2, 0x18b, 0x18e, 0x5, 0x3c, 0x1f, 0x2, 
       0x18c, 0x18e, 0x5, 0x3a, 0x1e, 0x2, 0x18d, 0x18a, 0x3, 0x2, 0x2, 
       0x2, 0x18d, 0x18b, 0x3, 0x2, 0x2, 0x2, 0x18d, 0x18c, 0x3, 0x2, 0x2, 
       0x2, 0x18e, 0x18f, 0x3, 0x2, 0x2, 0x2, 0x18f, 0x190, 0x5, 0x38, 0x1d, 
       0x2, 0x190, 0x37, 0x3, 0x2, 0x2, 0x2, 0x191, 0x192, 0x5, 0xa2, 0x52, 
       0x2, 0x192, 0x39, 0x3, 0x2, 0x2, 0x2, 0x193, 0x195, 0x7, 0x29, 0x2, 
       0x2, 0x194, 0x193, 0x3, 0x2, 0x2, 0x2, 0x194, 0x195, 0x3, 0x2, 0x2, 
       0x2, 0x195, 0x196, 0x3, 0x2, 0x2, 0x2, 0x196, 0x197, 0x5, 0x44, 0x23, 
       0x2, 0x197, 0x198, 0x5, 0x40, 0x21, 0x2, 0x198, 0x199, 0x5, 0x46, 
       0x24, 0x2, 0x199, 0x19a, 0x5, 0x42, 0x22, 0x2, 0x19a, 0x19c, 0x5, 
       0x48, 0x25, 0x2, 0x19b, 0x19d, 0x7, 0x2a, 0x2, 0x2, 0x19c, 0x19b, 
       0x3, 0x2, 0x2, 0x2, 0x19c, 0x19d, 0x3, 0x2, 0x2, 0x2, 0x19d, 0x3b, 
       0x3, 0x2, 0x2, 0x2, 0x19e, 0x19f, 0x5, 0x46, 0x24, 0x2, 0x19f, 0x3d, 
       0x3, 0x2, 0x2, 0x2, 0x1a0, 0x1a1, 0x7, 0x29, 0x2, 0x2, 0x1a1, 0x1a4, 
       0x7, 0x2a, 0x2, 0x2, 0x1a2, 0x1a4, 0x3, 0x2, 0x2, 0x2, 0x1a3, 0x1a0, 
       0x3, 0x2, 0x2, 0x2, 0x1a3, 0x1a2, 0x3, 0x2, 0x2, 0x2, 0x1a4, 0x3f, 
       0x3, 0x2, 0x2, 0x2, 0x1a5, 0x1a6, 0x7, 0x1e, 0x2, 0x2, 0x1a6, 0x41, 
       0x3, 0x2, 0x2, 0x2, 0x1a7, 0x1a8, 0x7, 0x1e, 0x2, 0x2, 0x1a8, 0x43, 
       0x3, 0x2, 0x2, 0x2, 0x1a9, 0x1aa, 0x7, 0x4, 0x2, 0x2, 0x1aa, 0x1ad, 
       0x5, 0x12, 0xa, 0x2, 0x1ab, 0x1ad, 0x3, 0x2, 0x2, 0x2, 0x1ac, 0x1a9, 
       0x3, 0x2, 0x2, 0x2, 0x1ac, 0x1ab, 0x3, 0x2, 0x2, 0x2, 0x1ad, 0x45, 
       0x3, 0x2, 0x2, 0x2, 0x1ae, 0x1b1, 0x5, 0xae, 0x58, 0x2, 0x1af, 0x1b1, 
       0x3, 0x2, 0x2, 0x2, 0x1b0, 0x1ae, 0x3, 0x2, 0x2, 0x2, 0x1b0, 0x1af, 
       0x3, 0x2, 0x2, 0x2, 0x1b1, 0x47, 0x3, 0x2, 0x2, 0x2, 0x1b2, 0x1b5, 
       0x5, 0x4a, 0x26, 0x2, 0x1b3, 0x1b5, 0x3, 0x2, 0x2, 0x2, 0x1b4, 0x1b2, 
       0x3, 0x2, 0x2, 0x2, 0x1b4, 0x1b3, 0x3, 0x2, 0x2, 0x2, 0x1b5, 0x49, 
       0x3, 0x2, 0x2, 0x2, 0x1b6, 0x1bb, 0x5, 0xae, 0x58, 0x2, 0x1b7, 0x1b8, 
       0x7, 0x24, 0x2, 0x2, 0x1b8, 0x1ba, 0x5, 0xae, 0x58, 0x2, 0x1b9, 0x1b7, 
       0x3, 0x2, 0x2, 0x2, 0x1ba, 0x1bd, 0x3, 0x2, 0x2, 0x2, 0x1bb, 0x1b9, 
       0x3, 0x2, 0x2, 0x2, 0x1bb, 0x1bc, 0x3, 0x2, 0x2, 0x2, 0x1bc, 0x4b, 
       0x3, 0x2, 0x2, 0x2, 0x1bd, 0x1bb, 0x3, 0x2, 0x2, 0x2, 0x1be, 0x1bf, 
       0x7, 0x16, 0x2, 0x2, 0x1bf, 0x1c0, 0x7, 0x1e, 0x2, 0x2, 0x1c0, 0x4d, 
       0x3, 0x2, 0x2, 0x2, 0x1c1, 0x1c2, 0x7, 0x17, 0x2, 0x2, 0x1c2, 0x1c3, 
       0x7, 0x1e, 0x2, 0x2, 0x1c3, 0x4f, 0x3, 0x2, 0x2, 0x2, 0x1c4, 0x1c6, 
       0x5, 0x52, 0x2a, 0x2, 0x1c5, 0x1c7, 0x5, 0x54, 0x2b, 0x2, 0x1c6, 
       0x1c5, 0x3, 0x2, 0x2, 0x2, 0x1c6, 0x1c7, 0x3, 0x2, 0x2, 0x2, 0x1c7, 
       0x51, 0x3, 0x2, 0x2, 0x2, 0x1c8, 0x1c9, 0x7, 0x1a, 0x2, 0x2, 0x1c9, 
       0x1ca, 0x5, 0x56, 0x2c, 0x2, 0x1ca, 0x53, 0x3, 0x2, 0x2, 0x2, 0x1cb, 
       0x1cd, 0x7, 0x1b, 0x2, 0x2, 0x1cc, 0x1ce, 0x7, 0x29, 0x2, 0x2, 0x1cd, 
       0x1cc, 0x3, 0x2, 0x2, 0x2, 0x1cd, 0x1ce, 0x3, 0x2, 0x2, 0x2, 0x1ce, 
       0x1cf, 0x3, 0x2, 0x2, 0x2, 0x1cf, 0x1d1, 0x5, 0xb0, 0x59, 0x2, 0x1d0, 
       0x1d2, 0x7, 0x2a, 0x2, 0x2, 0x1d1, 0x1d0, 0x3, 0x2, 0x2, 0x2, 0x1d1, 
       0x1d2, 0x3, 0x2, 0x2, 0x2, 0x1d2, 0x1d3, 0x3, 0x2, 0x2, 0x2, 0x1d3, 
       0x1d4, 0x5, 0x56, 0x2c, 0x2, 0x1d4, 0x55, 0x3, 0x2, 0x2, 0x2, 0x1d5, 
       0x1d6, 0x5, 0xa2, 0x52, 0x2, 0x1d6, 0x57, 0x3, 0x2, 0x2, 0x2, 0x1d7, 
       0x1d8, 0x7, 0x29, 0x2, 0x2, 0x1d8, 0x1da, 0x7, 0xa, 0x2, 0x2, 0x1d9, 
       0x1db, 0x5, 0xb0, 0x59, 0x2, 0x1da, 0x1d9, 0x3, 0x2, 0x2, 0x2, 0x1da, 
       0x1db, 0x3, 0x2, 0x2, 0x2, 0x1db, 0x1dc, 0x3, 0x2, 0x2, 0x2, 0x1dc, 
       0x1de, 0x7, 0x29, 0x2, 0x2, 0x1dd, 0x1df, 0x5, 0x5c, 0x2f, 0x2, 0x1de, 
       0x1dd, 0x3, 0x2, 0x2, 0x2, 0x1de, 0x1df, 0x3, 0x2, 0x2, 0x2, 0x1df, 
       0x1e0, 0x3, 0x2, 0x2, 0x2, 0x1e0, 0x1e6, 0x7, 0x2a, 0x2, 0x2, 0x1e1, 
       0x1e4, 0x7, 0x1c, 0x2, 0x2, 0x1e2, 0x1e5, 0x5, 0xb2, 0x5a, 0x2, 0x1e3, 
       0x1e5, 0x7, 0x31, 0x2, 0x2, 0x1e4, 0x1e2, 0x3, 0x2, 0x2, 0x2, 0x1e4, 
       0x1e3, 0x3, 0x2, 0x2, 0x2, 0x1e5, 0x1e7, 0x3, 0x2, 0x2, 0x2, 0x1e6, 
       0x1e1, 0x3, 0x2, 0x2, 0x2, 0x1e6, 0x1e7, 0x3, 0x2, 0x2, 0x2, 0x1e7, 
       0x1e8, 0x3, 0x2, 0x2, 0x2, 0x1e8, 0x1e9, 0x5, 0x62, 0x32, 0x2, 0x1e9, 
       0x1ea, 0x7, 0x2a, 0x2, 0x2, 0x1ea, 0x1ec, 0x5, 0xbc, 0x5f, 0x2, 0x1eb, 
       0x1ed, 0x5, 0x5e, 0x30, 0x2, 0x1ec, 0x1eb, 0x3, 0x2, 0x2, 0x2, 0x1ec, 
       0x1ed, 0x3, 0x2, 0x2, 0x2, 0x1ed, 0x1ee, 0x3, 0x2, 0x2, 0x2, 0x1ee, 
       0x1ef, 0x5, 0xbe, 0x60, 0x2, 0x1ef, 0x1f0, 0x7, 0x1e, 0x2, 0x2, 0x1f0, 
       0x206, 0x3, 0x2, 0x2, 0x2, 0x1f1, 0x1f3, 0x7, 0xa, 0x2, 0x2, 0x1f2, 
       0x1f4, 0x5, 0xb0, 0x59, 0x2, 0x1f3, 0x1f2, 0x3, 0x2, 0x2, 0x2, 0x1f3, 
       0x1f4, 0x3, 0x2, 0x2, 0x2, 0x1f4, 0x1f5, 0x3, 0x2, 0x2, 0x2, 0x1f5, 
       0x1f7, 0x7, 0x29, 0x2, 0x2, 0x1f6, 0x1f8, 0x5, 0x5c, 0x2f, 0x2, 0x1f7, 
       0x1f6, 0x3, 0x2, 0x2, 0x2, 0x1f7, 0x1f8, 0x3, 0x2, 0x2, 0x2, 0x1f8, 
       0x1f9, 0x3, 0x2, 0x2, 0x2, 0x1f9, 0x1ff, 0x7, 0x2a, 0x2, 0x2, 0x1fa, 
       0x1fd, 0x7, 0x1c, 0x2, 0x2, 0x1fb, 0x1fe, 0x5, 0xb2, 0x5a, 0x2, 0x1fc, 
       0x1fe, 0x7, 0x31, 0x2, 0x2, 0x1fd, 0x1fb, 0x3, 0x2, 0x2, 0x2, 0x1fd, 
       0x1fc, 0x3, 0x2, 0x2, 0x2, 0x1fe, 0x200, 0x3, 0x2, 0x2, 0x2, 0x1ff, 
       0x1fa, 0x3, 0x2, 0x2, 0x2, 0x1ff, 0x200, 0x3, 0x2, 0x2, 0x2, 0x200, 
       0x203, 0x3, 0x2, 0x2, 0x2, 0x201, 0x204, 0x5, 0x62, 0x32, 0x2, 0x202, 
       0x204, 0x7, 0x1e, 0x2, 0x2, 0x203, 0x201, 0x3, 0x2, 0x2, 0x2, 0x203, 
       0x202, 0x3, 0x2, 0x2, 0x2, 0x204, 0x206, 0x3, 0x2, 0x2, 0x2, 0x205, 
       0x1d7, 0x3, 0x2, 0x2, 0x2, 0x205, 0x1f1, 0x3, 0x2, 0x2, 0x2, 0x206, 
       0x59, 0x3, 0x2, 0x2, 0x2, 0x207, 0x208, 0x7, 0x29, 0x2, 0x2, 0x208, 
       0x20a, 0x7, 0xa, 0x2, 0x2, 0x209, 0x20b, 0x5, 0xb0, 0x59, 0x2, 0x20a, 
       0x209, 0x3, 0x2, 0x2, 0x2, 0x20a, 0x20b, 0x3, 0x2, 0x2, 0x2, 0x20b, 
       0x20c, 0x3, 0x2, 0x2, 0x2, 0x20c, 0x20e, 0x7, 0x29, 0x2, 0x2, 0x20d, 
       0x20f, 0x5, 0x5c, 0x2f, 0x2, 0x20e, 0x20d, 0x3, 0x2, 0x2, 0x2, 0x20e, 
       0x20f, 0x3, 0x2, 0x2, 0x2, 0x20f, 0x210, 0x3, 0x2, 0x2, 0x2, 0x210, 
       0x216, 0x7, 0x2a, 0x2, 0x2, 0x211, 0x214, 0x7, 0x1c, 0x2, 0x2, 0x212, 
       0x215, 0x5, 0xb2, 0x5a, 0x2, 0x213, 0x215, 0x7, 0x31, 0x2, 0x2, 0x214, 
       0x212, 0x3, 0x2, 0x2, 0x2, 0x214, 0x213, 0x3, 0x2, 0x2, 0x2, 0x215, 
       0x217, 0x3, 0x2, 0x2, 0x2, 0x216, 0x211, 0x3, 0x2, 0x2, 0x2, 0x216, 
       0x217, 0x3, 0x2, 0x2, 0x2, 0x217, 0x218, 0x3, 0x2, 0x2, 0x2, 0x218, 
       0x219, 0x5, 0x62, 0x32, 0x2, 0x219, 0x21a, 0x7, 0x2a, 0x2, 0x2, 0x21a, 
       0x21c, 0x5, 0xbc, 0x5f, 0x2, 0x21b, 0x21d, 0x5, 0x5e, 0x30, 0x2, 
       0x21c, 0x21b, 0x3, 0x2, 0x2, 0x2, 0x21c, 0x21d, 0x3, 0x2, 0x2, 0x2, 
       0x21d, 0x21e, 0x3, 0x2, 0x2, 0x2, 0x21e, 0x21f, 0x5, 0xbe, 0x60, 
       0x2, 0x21f, 0x232, 0x3, 0x2, 0x2, 0x2, 0x220, 0x222, 0x7, 0xa, 0x2, 
       0x2, 0x221, 0x223, 0x5, 0xb0, 0x59, 0x2, 0x222, 0x221, 0x3, 0x2, 
       0x2, 0x2, 0x222, 0x223, 0x3, 0x2, 0x2, 0x2, 0x223, 0x224, 0x3, 0x2, 
       0x2, 0x2, 0x224, 0x226, 0x7, 0x29, 0x2, 0x2, 0x225, 0x227, 0x5, 0x5c, 
       0x2f, 0x2, 0x226, 0x225, 0x3, 0x2, 0x2, 0x2, 0x226, 0x227, 0x3, 0x2, 
       0x2, 0x2, 0x227, 0x228, 0x3, 0x2, 0x2, 0x2, 0x228, 0x22e, 0x7, 0x2a, 
       0x2, 0x2, 0x229, 0x22c, 0x7, 0x1c, 0x2, 0x2, 0x22a, 0x22d, 0x5, 0xb2, 
       0x5a, 0x2, 0x22b, 0x22d, 0x7, 0x31, 0x2, 0x2, 0x22c, 0x22a, 0x3, 
       0x2, 0x2, 0x2, 0x22c, 0x22b, 0x3, 0x2, 0x2, 0x2, 0x22d, 0x22f, 0x3, 
       0x2, 0x2, 0x2, 0x22e, 0x229, 0x3, 0x2, 0x2, 0x2, 0x22e, 0x22f, 0x3, 
       0x2, 0x2, 0x2, 0x22f, 0x230, 0x3, 0x2, 0x2, 0x2, 0x230, 0x232, 0x5, 
       0x62, 0x32, 0x2, 0x231, 0x207, 0x3, 0x2, 0x2, 0x2, 0x231, 0x220, 
       0x3, 0x2, 0x2, 0x2, 0x232, 0x5b, 0x3, 0x2, 0x2, 0x2, 0x233, 0x234, 
       0x7, 0x2f, 0x2, 0x2, 0x234, 0x237, 0x7, 0x31, 0x2, 0x2, 0x235, 0x236, 
       0x7, 0x24, 0x2, 0x2, 0x236, 0x238, 0x5, 0x5c, 0x2f, 0x2, 0x237, 0x235, 
       0x3, 0x2, 0x2, 0x2, 0x237, 0x238, 0x3, 0x2, 0x2, 0x2, 0x238, 0x5d, 
       0x3, 0x2, 0x2, 0x2, 0x239, 0x23e, 0x5, 0x60, 0x31, 0x2, 0x23a, 0x23b, 
       0x7, 0x24, 0x2, 0x2, 0x23b, 0x23d, 0x5, 0x60, 0x31, 0x2, 0x23c, 0x23a, 
       0x3, 0x2, 0x2, 0x2, 0x23d, 0x240, 0x3, 0x2, 0x2, 0x2, 0x23e, 0x23c, 
       0x3, 0x2, 0x2, 0x2, 0x23e, 0x23f, 0x3, 0x2, 0x2, 0x2, 0x23f, 0x5f, 
       0x3, 0x2, 0x2, 0x2, 0x240, 0x23e, 0x3, 0x2, 0x2, 0x2, 0x241, 0x242, 
       0x5, 0xae, 0x58, 0x2, 0x242, 0x61, 0x3, 0x2, 0x2, 0x2, 0x243, 0x244, 
       0x5, 0xa6, 0x54, 0x2, 0x244, 0x63, 0x3, 0x2, 0x2, 0x2, 0x245, 0x246, 
       0x7, 0x10, 0x2, 0x2, 0x246, 0x249, 0x5, 0xb0, 0x59, 0x2, 0x247, 0x248, 
       0x7, 0x12, 0x2, 0x2, 0x248, 0x24a, 0x5, 0xb2, 0x5a, 0x2, 0x249, 0x247, 
       0x3, 0x2, 0x2, 0x2, 0x249, 0x24a, 0x3, 0x2, 0x2, 0x2, 0x24a, 0x24b, 
       0x3, 0x2, 0x2, 0x2, 0x24b, 0x24c, 0x5, 0x66, 0x34, 0x2, 0x24c, 0x65, 
       0x3, 0x2, 0x2, 0x2, 0x24d, 0x24e, 0x5, 0xa6, 0x54, 0x2, 0x24e, 0x67, 
       0x3, 0x2, 0x2, 0x2, 0x24f, 0x250, 0x7, 0x11, 0x2, 0x2, 0x250, 0x253, 
       0x5, 0xb0, 0x59, 0x2, 0x251, 0x252, 0x7, 0x12, 0x2, 0x2, 0x252, 0x254, 
       0x5, 0xb2, 0x5a, 0x2, 0x253, 0x251, 0x3, 0x2, 0x2, 0x2, 0x253, 0x254, 
       0x3, 0x2, 0x2, 0x2, 0x254, 0x255, 0x3, 0x2, 0x2, 0x2, 0x255, 0x256, 
       0x5, 0x6a, 0x36, 0x2, 0x256, 0x69, 0x3, 0x2, 0x2, 0x2, 0x257, 0x258, 
       0x5, 0xa6, 0x54, 0x2, 0x258, 0x6b, 0x3, 0x2, 0x2, 0x2, 0x259, 0x25a, 
       0x5, 0xbc, 0x5f, 0x2, 0x25a, 0x25b, 0x7, 0x15, 0x2, 0x2, 0x25b, 0x25d, 
       0x7, 0x13, 0x2, 0x2, 0x25c, 0x25e, 0x5, 0xb0, 0x59, 0x2, 0x25d, 0x25c, 
       0x3, 0x2, 0x2, 0x2, 0x25d, 0x25e, 0x3, 0x2, 0x2, 0x2, 0x25e, 0x261, 
       0x3, 0x2, 0x2, 0x2, 0x25f, 0x260, 0x7, 0x12, 0x2, 0x2, 0x260, 0x262, 
       0x5, 0xb2, 0x5a, 0x2, 0x261, 0x25f, 0x3, 0x2, 0x2, 0x2, 0x261, 0x262, 
       0x3, 0x2, 0x2, 0x2, 0x262, 0x265, 0x3, 0x2, 0x2, 0x2, 0x263, 0x264, 
       0x7, 0x14, 0x2, 0x2, 0x264, 0x266, 0x5, 0xb4, 0x5b, 0x2, 0x265, 0x263, 
       0x3, 0x2, 0x2, 0x2, 0x265, 0x266, 0x3, 0x2, 0x2, 0x2, 0x266, 0x267, 
       0x3, 0x2, 0x2, 0x2, 0x267, 0x268, 0x5, 0x72, 0x3a, 0x2, 0x268, 0x271, 
       0x5, 0xbe, 0x60, 0x2, 0x269, 0x26a, 0x9, 0x4, 0x2, 0x2, 0x26a, 0x26b, 
       0x5, 0xb6, 0x5c, 0x2, 0x26b, 0x26d, 0x7, 0x29, 0x2, 0x2, 0x26c, 0x26e, 
       0x5, 0xae, 0x58, 0x2, 0x26d, 0x26c, 0x3, 0x2, 0x2, 0x2, 0x26d, 0x26e, 
       0x3, 0x2, 0x2, 0x2, 0x26e, 0x26f, 0x3, 0x2, 0x2, 0x2, 0x26f, 0x270, 
       0x7, 0x2a, 0x2, 0x2, 0x270, 0x272, 0x3, 0x2, 0x2, 0x2, 0x271, 0x269, 
       0x3, 0x2, 0x2, 0x2, 0x271, 0x272, 0x3, 0x2, 0x2, 0x2, 0x272, 0x274, 
       0x3, 0x2, 0x2, 0x2, 0x273, 0x275, 0x7, 0x1e, 0x2, 0x2, 0x274, 0x273, 
       0x3, 0x2, 0x2, 0x2, 0x274, 0x275, 0x3, 0x2, 0x2, 0x2, 0x275, 0x284, 
       0x3, 0x2, 0x2, 0x2, 0x276, 0x278, 0x7, 0x13, 0x2, 0x2, 0x277, 0x279, 
       0x5, 0xb0, 0x59, 0x2, 0x278, 0x277, 0x3, 0x2, 0x2, 0x2, 0x278, 0x279, 
       0x3, 0x2, 0x2, 0x2, 0x279, 0x27c, 0x3, 0x2, 0x2, 0x2, 0x27a, 0x27b, 
       0x7, 0x12, 0x2, 0x2, 0x27b, 0x27d, 0x5, 0xb2, 0x5a, 0x2, 0x27c, 0x27a, 
       0x3, 0x2, 0x2, 0x2, 0x27c, 0x27d, 0x3, 0x2, 0x2, 0x2, 0x27d, 0x280, 
       0x3, 0x2, 0x2, 0x2, 0x27e, 0x27f, 0x7, 0x14, 0x2, 0x2, 0x27f, 0x281, 
       0x5, 0xb4, 0x5b, 0x2, 0x280, 0x27e, 0x3, 0x2, 0x2, 0x2, 0x280, 0x281, 
       0x3, 0x2, 0x2, 0x2, 0x281, 0x282, 0x3, 0x2, 0x2, 0x2, 0x282, 0x284, 
       0x5, 0x72, 0x3a, 0x2, 0x283, 0x259, 0x3, 0x2, 0x2, 0x2, 0x283, 0x276, 
       0x3, 0x2, 0x2, 0x2, 0x284, 0x6d, 0x3, 0x2, 0x2, 0x2, 0x285, 0x286, 
       0x5, 0xbc, 0x5f, 0x2, 0x286, 0x287, 0x7, 0x15, 0x2, 0x2, 0x287, 0x289, 
       0x7, 0x13, 0x2, 0x2, 0x288, 0x28a, 0x5, 0xb0, 0x59, 0x2, 0x289, 0x288, 
       0x3, 0x2, 0x2, 0x2, 0x289, 0x28a, 0x3, 0x2, 0x2, 0x2, 0x28a, 0x28d, 
       0x3, 0x2, 0x2, 0x2, 0x28b, 0x28c, 0x7, 0x12, 0x2, 0x2, 0x28c, 0x28e, 
       0x5, 0xb2, 0x5a, 0x2, 0x28d, 0x28b, 0x3, 0x2, 0x2, 0x2, 0x28d, 0x28e, 
       0x3, 0x2, 0x2, 0x2, 0x28e, 0x291, 0x3, 0x2, 0x2, 0x2, 0x28f, 0x290, 
       0x7, 0x14, 0x2, 0x2, 0x290, 0x292, 0x5, 0xb4, 0x5b, 0x2, 0x291, 0x28f, 
       0x3, 0x2, 0x2, 0x2, 0x291, 0x292, 0x3, 0x2, 0x2, 0x2, 0x292, 0x293, 
       0x3, 0x2, 0x2, 0x2, 0x293, 0x294, 0x5, 0x72, 0x3a, 0x2, 0x294, 0x29d, 
       0x5, 0xbe, 0x60, 0x2, 0x295, 0x296, 0x9, 0x4, 0x2, 0x2, 0x296, 0x297, 
       0x5, 0xb6, 0x5c, 0x2, 0x297, 0x299, 0x7, 0x29, 0x2, 0x2, 0x298, 0x29a, 
       0x5, 0xae, 0x58, 0x2, 0x299, 0x298, 0x3, 0x2, 0x2, 0x2, 0x299, 0x29a, 
       0x3, 0x2, 0x2, 0x2, 0x29a, 0x29b, 0x3, 0x2, 0x2, 0x2, 0x29b, 0x29c, 
       0x7, 0x2a, 0x2, 0x2, 0x29c, 0x29e, 0x3, 0x2, 0x2, 0x2, 0x29d, 0x295, 
       0x3, 0x2, 0x2, 0x2, 0x29d, 0x29e, 0x3, 0x2, 0x2, 0x2, 0x29e, 0x2ad, 
       0x3, 0x2, 0x2, 0x2, 0x29f, 0x2a1, 0x7, 0x13, 0x2, 0x2, 0x2a0, 0x2a2, 
       0x5, 0xb0, 0x59, 0x2, 0x2a1, 0x2a0, 0x3, 0x2, 0x2, 0x2, 0x2a1, 0x2a2, 
       0x3, 0x2, 0x2, 0x2, 0x2a2, 0x2a5, 0x3, 0x2, 0x2, 0x2, 0x2a3, 0x2a4, 
       0x7, 0x12, 0x2, 0x2, 0x2a4, 0x2a6, 0x5, 0xb2, 0x5a, 0x2, 0x2a5, 0x2a3, 
       0x3, 0x2, 0x2, 0x2, 0x2a5, 0x2a6, 0x3, 0x2, 0x2, 0x2, 0x2a6, 0x2a9, 
       0x3, 0x2, 0x2, 0x2, 0x2a7, 0x2a8, 0x7, 0x14, 0x2, 0x2, 0x2a8, 0x2aa, 
       0x5, 0xb4, 0x5b, 0x2, 0x2a9, 0x2a7, 0x3, 0x2, 0x2, 0x2, 0x2a9, 0x2aa, 
       0x3, 0x2, 0x2, 0x2, 0x2aa, 0x2ab, 0x3, 0x2, 0x2, 0x2, 0x2ab, 0x2ad, 
       0x5, 0x72, 0x3a, 0x2, 0x2ac, 0x285, 0x3, 0x2, 0x2, 0x2, 0x2ac, 0x29f, 
       0x3, 0x2, 0x2, 0x2, 0x2ad, 0x6f, 0x3, 0x2, 0x2, 0x2, 0x2ae, 0x2af, 
       0x5, 0xae, 0x58, 0x2, 0x2af, 0x71, 0x3, 0x2, 0x2, 0x2, 0x2b0, 0x2b1, 
       0x5, 0xa6, 0x54, 0x2, 0x2b1, 0x73, 0x3, 0x2, 0x2, 0x2, 0x2b2, 0x2b5, 
       0x5, 0x76, 0x3c, 0x2, 0x2b3, 0x2b5, 0x5, 0x7a, 0x3e, 0x2, 0x2b4, 
       0x2b2, 0x3, 0x2, 0x2, 0x2, 0x2b4, 0x2b3, 0x3, 0x2, 0x2, 0x2, 0x2b5, 
       0x75, 0x3, 0x2, 0x2, 0x2, 0x2b6, 0x2b7, 0x7, 0x25, 0x2, 0x2, 0x2b7, 
       0x2b8, 0x5, 0x78, 0x3d, 0x2, 0x2b8, 0x2b9, 0x7, 0x26, 0x2, 0x2, 0x2b9, 
       0x77, 0x3, 0x2, 0x2, 0x2, 0x2ba, 0x2bf, 0x5, 0xae, 0x58, 0x2, 0x2bb, 
       0x2bc, 0x7, 0x24, 0x2, 0x2, 0x2bc, 0x2be, 0x5, 0x78, 0x3d, 0x2, 0x2bd, 
       0x2bb, 0x3, 0x2, 0x2, 0x2, 0x2be, 0x2c1, 0x3, 0x2, 0x2, 0x2, 0x2bf, 
       0x2bd, 0x3, 0x2, 0x2, 0x2, 0x2bf, 0x2c0, 0x3, 0x2, 0x2, 0x2, 0x2c0, 
       0x79, 0x3, 0x2, 0x2, 0x2, 0x2c1, 0x2bf, 0x3, 0x2, 0x2, 0x2, 0x2c2, 
       0x2c3, 0x7, 0x27, 0x2, 0x2, 0x2c3, 0x2c4, 0x5, 0x7c, 0x3f, 0x2, 0x2c4, 
       0x2c5, 0x7, 0x28, 0x2, 0x2, 0x2c5, 0x7b, 0x3, 0x2, 0x2, 0x2, 0x2c6, 
       0x2c7, 0x5, 0xb0, 0x59, 0x2, 0x2c7, 0x2c8, 0x7, 0x21, 0x2, 0x2, 0x2c8, 
       0x2cd, 0x5, 0xae, 0x58, 0x2, 0x2c9, 0x2ca, 0x7, 0x24, 0x2, 0x2, 0x2ca, 
       0x2cc, 0x5, 0x7c, 0x3f, 0x2, 0x2cb, 0x2c9, 0x3, 0x2, 0x2, 0x2, 0x2cc, 
       0x2cf, 0x3, 0x2, 0x2, 0x2, 0x2cd, 0x2cb, 0x3, 0x2, 0x2, 0x2, 0x2cd, 
       0x2ce, 0x3, 0x2, 0x2, 0x2, 0x2ce, 0x7d, 0x3, 0x2, 0x2, 0x2, 0x2cf, 
       0x2cd, 0x3, 0x2, 0x2, 0x2, 0x2d0, 0x2d2, 0x7, 0x29, 0x2, 0x2, 0x2d1, 
       0x2d3, 0x5, 0x80, 0x41, 0x2, 0x2d2, 0x2d1, 0x3, 0x2, 0x2, 0x2, 0x2d2, 
       0x2d3, 0x3, 0x2, 0x2, 0x2, 0x2d3, 0x2d4, 0x3, 0x2, 0x2, 0x2, 0x2d4, 
       0x2da, 0x7, 0x2a, 0x2, 0x2, 0x2d5, 0x2d8, 0x7, 0x1c, 0x2, 0x2, 0x2d6, 
       0x2d9, 0x5, 0xb0, 0x59, 0x2, 0x2d7, 0x2d9, 0x7, 0x31, 0x2, 0x2, 0x2d8, 
       0x2d6, 0x3, 0x2, 0x2, 0x2, 0x2d8, 0x2d7, 0x3, 0x2, 0x2, 0x2, 0x2d9, 
       0x2db, 0x3, 0x2, 0x2, 0x2, 0x2da, 0x2d5, 0x3, 0x2, 0x2, 0x2, 0x2da, 
       0x2db, 0x3, 0x2, 0x2, 0x2, 0x2db, 0x2dc, 0x3, 0x2, 0x2, 0x2, 0x2dc, 
       0x2dd, 0x7, 0x1d, 0x2, 0x2, 0x2dd, 0x2de, 0x5, 0x82, 0x42, 0x2, 0x2de, 
       0x7f, 0x3, 0x2, 0x2, 0x2, 0x2df, 0x2e1, 0x5, 0xb0, 0x59, 0x2, 0x2e0, 
       0x2e2, 0x7, 0x31, 0x2, 0x2, 0x2e1, 0x2e0, 0x3, 0x2, 0x2, 0x2, 0x2e1, 
       0x2e2, 0x3, 0x2, 0x2, 0x2, 0x2e2, 0x2e7, 0x3, 0x2, 0x2, 0x2, 0x2e3, 
       0x2e4, 0x7, 0x24, 0x2, 0x2, 0x2e4, 0x2e6, 0x5, 0x80, 0x41, 0x2, 0x2e5, 
       0x2e3, 0x3, 0x2, 0x2, 0x2, 0x2e6, 0x2e9, 0x3, 0x2, 0x2, 0x2, 0x2e7, 
       0x2e5, 0x3, 0x2, 0x2, 0x2, 0x2e7, 0x2e8, 0x3, 0x2, 0x2, 0x2, 0x2e8, 
       0x81, 0x3, 0x2, 0x2, 0x2, 0x2e9, 0x2e7, 0x3, 0x2, 0x2, 0x2, 0x2ea, 
       0x2ed, 0x5, 0xa6, 0x54, 0x2, 0x2eb, 0x2ed, 0x5, 0xae, 0x58, 0x2, 
       0x2ec, 0x2ea, 0x3, 0x2, 0x2, 0x2, 0x2ec, 0x2eb, 0x3, 0x2, 0x2, 0x2, 
       0x2ed, 0x83, 0x3, 0x2, 0x2, 0x2, 0x2ee, 0x2ef, 0x5, 0xb0, 0x59, 0x2, 
       0x2ef, 0x2f1, 0x7, 0x29, 0x2, 0x2, 0x2f0, 0x2f2, 0x5, 0x5c, 0x2f, 
       0x2, 0x2f1, 0x2f0, 0x3, 0x2, 0x2, 0x2, 0x2f1, 0x2f2, 0x3, 0x2, 0x2, 
       0x2, 0x2f2, 0x2f3, 0x3, 0x2, 0x2, 0x2, 0x2f3, 0x2f4, 0x7, 0x2a, 0x2, 
       0x2, 0x2f4, 0x2f5, 0x5, 0xa6, 0x54, 0x2, 0x2f5, 0x85, 0x3, 0x2, 0x2, 
       0x2, 0x2f6, 0x2f9, 0x5, 0xb0, 0x59, 0x2, 0x2f7, 0x2f8, 0x9, 0x4, 
       0x2, 0x2, 0x2f8, 0x2fa, 0x5, 0xb2, 0x5a, 0x2, 0x2f9, 0x2f7, 0x3, 
       0x2, 0x2, 0x2, 0x2f9, 0x2fa, 0x3, 0x2, 0x2, 0x2, 0x2fa, 0x2fb, 0x3, 
       0x2, 0x2, 0x2, 0x2fb, 0x2fd, 0x7, 0x29, 0x2, 0x2, 0x2fc, 0x2fe, 0x5, 
       0x88, 0x45, 0x2, 0x2fd, 0x2fc, 0x3, 0x2, 0x2, 0x2, 0x2fd, 0x2fe, 
       0x3, 0x2, 0x2, 0x2, 0x2fe, 0x2ff, 0x3, 0x2, 0x2, 0x2, 0x2ff, 0x300, 
       0x7, 0x2a, 0x2, 0x2, 0x300, 0x301, 0x7, 0x1e, 0x2, 0x2, 0x301, 0x30b, 
       0x3, 0x2, 0x2, 0x2, 0x302, 0x303, 0x5, 0x92, 0x4a, 0x2, 0x303, 0x305, 
       0x7, 0x29, 0x2, 0x2, 0x304, 0x306, 0x5, 0x88, 0x45, 0x2, 0x305, 0x304, 
       0x3, 0x2, 0x2, 0x2, 0x305, 0x306, 0x3, 0x2, 0x2, 0x2, 0x306, 0x307, 
       0x3, 0x2, 0x2, 0x2, 0x307, 0x308, 0x7, 0x2a, 0x2, 0x2, 0x308, 0x309, 
       0x7, 0x1e, 0x2, 0x2, 0x309, 0x30b, 0x3, 0x2, 0x2, 0x2, 0x30a, 0x2f6, 
       0x3, 0x2, 0x2, 0x2, 0x30a, 0x302, 0x3, 0x2, 0x2, 0x2, 0x30b, 0x87, 
       0x3, 0x2, 0x2, 0x2, 0x30c, 0x311, 0x5, 0xae, 0x58, 0x2, 0x30d, 0x30e, 
       0x7, 0x24, 0x2, 0x2, 0x30e, 0x310, 0x5, 0x88, 0x45, 0x2, 0x30f, 0x30d, 
       0x3, 0x2, 0x2, 0x2, 0x310, 0x313, 0x3, 0x2, 0x2, 0x2, 0x311, 0x30f, 
       0x3, 0x2, 0x2, 0x2, 0x311, 0x312, 0x3, 0x2, 0x2, 0x2, 0x312, 0x89, 
       0x3, 0x2, 0x2, 0x2, 0x313, 0x311, 0x3, 0x2, 0x2, 0x2, 0x314, 0x315, 
       0x5, 0x8c, 0x47, 0x2, 0x315, 0x316, 0x7, 0x1e, 0x2, 0x2, 0x316, 0x8b, 
       0x3, 0x2, 0x2, 0x2, 0x317, 0x31d, 0x5, 0x92, 0x4a, 0x2, 0x318, 0x31a, 
       0x7, 0x29, 0x2, 0x2, 0x319, 0x31b, 0x5, 0x88, 0x45, 0x2, 0x31a, 0x319, 
       0x3, 0x2, 0x2, 0x2, 0x31a, 0x31b, 0x3, 0x2, 0x2, 0x2, 0x31b, 0x31c, 
       0x3, 0x2, 0x2, 0x2, 0x31c, 0x31e, 0x7, 0x2a, 0x2, 0x2, 0x31d, 0x318, 
       0x3, 0x2, 0x2, 0x2, 0x31d, 0x31e, 0x3, 0x2, 0x2, 0x2, 0x31e, 0x323, 
       0x3, 0x2, 0x2, 0x2, 0x31f, 0x320, 0x7, 0x23, 0x2, 0x2, 0x320, 0x322, 
       0x5, 0x8c, 0x47, 0x2, 0x321, 0x31f, 0x3, 0x2, 0x2, 0x2, 0x322, 0x325, 
       0x3, 0x2, 0x2, 0x2, 0x323, 0x321, 0x3, 0x2, 0x2, 0x2, 0x323, 0x324, 
       0x3, 0x2, 0x2, 0x2, 0x324, 0x8d, 0x3, 0x2, 0x2, 0x2, 0x325, 0x323, 
       0x3, 0x2, 0x2, 0x2, 0x326, 0x328, 0x7, 0x29, 0x2, 0x2, 0x327, 0x326, 
       0x3, 0x2, 0x2, 0x2, 0x327, 0x328, 0x3, 0x2, 0x2, 0x2, 0x328, 0x329, 
       0x3, 0x2, 0x2, 0x2, 0x329, 0x32a, 0x7, 0x15, 0x2, 0x2, 0x32a, 0x32b, 
       0x5, 0xb0, 0x59, 0x2, 0x32b, 0x32d, 0x7, 0x29, 0x2, 0x2, 0x32c, 0x32e, 
       0x5, 0xae, 0x58, 0x2, 0x32d, 0x32c, 0x3, 0x2, 0x2, 0x2, 0x32d, 0x32e, 
       0x3, 0x2, 0x2, 0x2, 0x32e, 0x32f, 0x3, 0x2, 0x2, 0x2, 0x32f, 0x331, 
       0x7, 0x2a, 0x2, 0x2, 0x330, 0x332, 0x7, 0x2a, 0x2, 0x2, 0x331, 0x330, 
       0x3, 0x2, 0x2, 0x2, 0x331, 0x332, 0x3, 0x2, 0x2, 0x2, 0x332, 0x33b, 
       0x3, 0x2, 0x2, 0x2, 0x333, 0x334, 0x9, 0x4, 0x2, 0x2, 0x334, 0x335, 
       0x5, 0xb2, 0x5a, 0x2, 0x335, 0x337, 0x7, 0x29, 0x2, 0x2, 0x336, 0x338, 
       0x5, 0xae, 0x58, 0x2, 0x337, 0x336, 0x3, 0x2, 0x2, 0x2, 0x337, 0x338, 
       0x3, 0x2, 0x2, 0x2, 0x338, 0x339, 0x3, 0x2, 0x2, 0x2, 0x339, 0x33a, 
       0x7, 0x2a, 0x2, 0x2, 0x33a, 0x33c, 0x3, 0x2, 0x2, 0x2, 0x33b, 0x333, 
       0x3, 0x2, 0x2, 0x2, 0x33b, 0x33c, 0x3, 0x2, 0x2, 0x2, 0x33c, 0x33d, 
       0x3, 0x2, 0x2, 0x2, 0x33d, 0x33e, 0x7, 0x1e, 0x2, 0x2, 0x33e, 0x8f, 
       0x3, 0x2, 0x2, 0x2, 0x33f, 0x340, 0x7, 0x29, 0x2, 0x2, 0x340, 0x341, 
       0x7, 0x15, 0x2, 0x2, 0x341, 0x342, 0x5, 0xb0, 0x59, 0x2, 0x342, 0x344, 
       0x7, 0x29, 0x2, 0x2, 0x343, 0x345, 0x5, 0xae, 0x58, 0x2, 0x344, 0x343, 
       0x3, 0x2, 0x2, 0x2, 0x344, 0x345, 0x3, 0x2, 0x2, 0x2, 0x345, 0x346, 
       0x3, 0x2, 0x2, 0x2, 0x346, 0x347, 0x7, 0x2a, 0x2, 0x2, 0x347, 0x350, 
       0x7, 0x2a, 0x2, 0x2, 0x348, 0x349, 0x9, 0x4, 0x2, 0x2, 0x349, 0x34a, 
       0x5, 0xb2, 0x5a, 0x2, 0x34a, 0x34c, 0x7, 0x29, 0x2, 0x2, 0x34b, 0x34d, 
       0x5, 0xae, 0x58, 0x2, 0x34c, 0x34b, 0x3, 0x2, 0x2, 0x2, 0x34c, 0x34d, 
       0x3, 0x2, 0x2, 0x2, 0x34d, 0x34e, 0x3, 0x2, 0x2, 0x2, 0x34e, 0x34f, 
       0x7, 0x2a, 0x2, 0x2, 0x34f, 0x351, 0x3, 0x2, 0x2, 0x2, 0x350, 0x348, 
       0x3, 0x2, 0x2, 0x2, 0x350, 0x351, 0x3, 0x2, 0x2, 0x2, 0x351, 0x91, 
       0x3, 0x2, 0x2, 0x2, 0x352, 0x353, 0x5, 0x94, 0x4b, 0x2, 0x353, 0x93, 
       0x3, 0x2, 0x2, 0x2, 0x354, 0x358, 0x5, 0x96, 0x4c, 0x2, 0x355, 0x357, 
       0x5, 0x94, 0x4b, 0x2, 0x356, 0x355, 0x3, 0x2, 0x2, 0x2, 0x357, 0x35a, 
       0x3, 0x2, 0x2, 0x2, 0x358, 0x356, 0x3, 0x2, 0x2, 0x2, 0x358, 0x359, 
       0x3, 0x2, 0x2, 0x2, 0x359, 0x95, 0x3, 0x2, 0x2, 0x2, 0x35a, 0x358, 
       0x3, 0x2, 0x2, 0x2, 0x35b, 0x35d, 0x5, 0x9c, 0x4f, 0x2, 0x35c, 0x35b, 
       0x3, 0x2, 0x2, 0x2, 0x35c, 0x35d, 0x3, 0x2, 0x2, 0x2, 0x35d, 0x35e, 
       0x3, 0x2, 0x2, 0x2, 0x35e, 0x360, 0x5, 0xb0, 0x59, 0x2, 0x35f, 0x361, 
       0x5, 0x98, 0x4d, 0x2, 0x360, 0x35f, 0x3, 0x2, 0x2, 0x2, 0x360, 0x361, 
       0x3, 0x2, 0x2, 0x2, 0x361, 0x363, 0x3, 0x2, 0x2, 0x2, 0x362, 0x364, 
       0x5, 0x9e, 0x50, 0x2, 0x363, 0x362, 0x3, 0x2, 0x2, 0x2, 0x363, 0x364, 
       0x3, 0x2, 0x2, 0x2, 0x364, 0x366, 0x3, 0x2, 0x2, 0x2, 0x365, 0x367, 
       0x9, 0x4, 0x2, 0x2, 0x366, 0x365, 0x3, 0x2, 0x2, 0x2, 0x366, 0x367, 
       0x3, 0x2, 0x2, 0x2, 0x367, 0x97, 0x3, 0x2, 0x2, 0x2, 0x368, 0x369, 
       0x7, 0x25, 0x2, 0x2, 0x369, 0x36a, 0x5, 0x9a, 0x4e, 0x2, 0x36a, 0x36e, 
       0x7, 0x26, 0x2, 0x2, 0x36b, 0x36d, 0x5, 0x98, 0x4d, 0x2, 0x36c, 0x36b, 
       0x3, 0x2, 0x2, 0x2, 0x36d, 0x370, 0x3, 0x2, 0x2, 0x2, 0x36e, 0x36c, 
       0x3, 0x2, 0x2, 0x2, 0x36e, 0x36f, 0x3, 0x2, 0x2, 0x2, 0x36f, 0x99, 
       0x3, 0x2, 0x2, 0x2, 0x370, 0x36e, 0x3, 0x2, 0x2, 0x2, 0x371, 0x372, 
       0x5, 0xae, 0x58, 0x2, 0x372, 0x9b, 0x3, 0x2, 0x2, 0x2, 0x373, 0x374, 
       0x7, 0x2e, 0x2, 0x2, 0x374, 0x9d, 0x3, 0x2, 0x2, 0x2, 0x375, 0x376, 
       0x7, 0x2e, 0x2, 0x2, 0x376, 0x9f, 0x3, 0x2, 0x2, 0x2, 0x377, 0x378, 
       0x9, 0x5, 0x2, 0x2, 0x378, 0xa1, 0x3, 0x2, 0x2, 0x2, 0x379, 0x37a, 
       0x7, 0x27, 0x2, 0x2, 0x37a, 0x381, 0x7, 0x28, 0x2, 0x2, 0x37b, 0x37c, 
       0x7, 0x27, 0x2, 0x2, 0x37c, 0x37d, 0x5, 0x4, 0x3, 0x2, 0x37d, 0x37e, 
       0x7, 0x28, 0x2, 0x2, 0x37e, 0x381, 0x3, 0x2, 0x2, 0x2, 0x37f, 0x381, 
       0x5, 0xa4, 0x53, 0x2, 0x380, 0x379, 0x3, 0x2, 0x2, 0x2, 0x380, 0x37b, 
       0x3, 0x2, 0x2, 0x2, 0x380, 0x37f, 0x3, 0x2, 0x2, 0x2, 0x381, 0xa3, 
       0x3, 0x2, 0x2, 0x2, 0x382, 0x383, 0x5, 0x20, 0x11, 0x2, 0x383, 0x384, 
       0x7, 0x1e, 0x2, 0x2, 0x384, 0x38c, 0x3, 0x2, 0x2, 0x2, 0x385, 0x38c, 
       0x5, 0x26, 0x14, 0x2, 0x386, 0x38c, 0x5, 0x28, 0x15, 0x2, 0x387, 
       0x38c, 0x5, 0x36, 0x1c, 0x2, 0x388, 0x38c, 0x5, 0x50, 0x29, 0x2, 
       0x389, 0x38c, 0x5, 0x4c, 0x27, 0x2, 0x38a, 0x38c, 0x5, 0x4e, 0x28, 
       0x2, 0x38b, 0x382, 0x3, 0x2, 0x2, 0x2, 0x38b, 0x385, 0x3, 0x2, 0x2, 
       0x2, 0x38b, 0x386, 0x3, 0x2, 0x2, 0x2, 0x38b, 0x387, 0x3, 0x2, 0x2, 
       0x2, 0x38b, 0x388, 0x3, 0x2, 0x2, 0x2, 0x38b, 0x389, 0x3, 0x2, 0x2, 
       0x2, 0x38b, 0x38a, 0x3, 0x2, 0x2, 0x2, 0x38c, 0xa5, 0x3, 0x2, 0x2, 
       0x2, 0x38d, 0x38e, 0x7, 0x27, 0x2, 0x2, 0x38e, 0x394, 0x7, 0x28, 
       0x2, 0x2, 0x38f, 0x390, 0x7, 0x27, 0x2, 0x2, 0x390, 0x391, 0x5, 0x4, 
       0x3, 0x2, 0x391, 0x392, 0x7, 0x28, 0x2, 0x2, 0x392, 0x394, 0x3, 0x2, 
       0x2, 0x2, 0x393, 0x38d, 0x3, 0x2, 0x2, 0x2, 0x393, 0x38f, 0x3, 0x2, 
       0x2, 0x2, 0x394, 0xa7, 0x3, 0x2, 0x2, 0x2, 0x395, 0x397, 0x7, 0x2d, 
       0x2, 0x2, 0x396, 0x395, 0x3, 0x2, 0x2, 0x2, 0x396, 0x397, 0x3, 0x2, 
       0x2, 0x2, 0x397, 0x398, 0x3, 0x2, 0x2, 0x2, 0x398, 0x39a, 0x5, 0x1e, 
       0x10, 0x2, 0x399, 0x39b, 0x7, 0x31, 0x2, 0x2, 0x39a, 0x399, 0x3, 
       0x2, 0x2, 0x2, 0x39a, 0x39b, 0x3, 0x2, 0x2, 0x2, 0x39b, 0x39d, 0x3, 
       0x2, 0x2, 0x2, 0x39c, 0x39e, 0x7, 0x2b, 0x2, 0x2, 0x39d, 0x39c, 0x3, 
       0x2, 0x2, 0x2, 0x39d, 0x39e, 0x3, 0x2, 0x2, 0x2, 0x39e, 0x3a0, 0x3, 
       0x2, 0x2, 0x2, 0x39f, 0x3a1, 0x7, 0x2c, 0x2, 0x2, 0x3a0, 0x39f, 0x3, 
       0x2, 0x2, 0x2, 0x3a0, 0x3a1, 0x3, 0x2, 0x2, 0x2, 0x3a1, 0x434, 0x3, 
       0x2, 0x2, 0x2, 0x3a2, 0x3a4, 0x7, 0x2d, 0x2, 0x2, 0x3a3, 0x3a2, 0x3, 
       0x2, 0x2, 0x2, 0x3a3, 0x3a4, 0x3, 0x2, 0x2, 0x2, 0x3a4, 0x3a5, 0x3, 
       0x2, 0x2, 0x2, 0x3a5, 0x3a6, 0x5, 0xb0, 0x59, 0x2, 0x3a6, 0x3a7, 
       0x9, 0x4, 0x2, 0x2, 0x3a7, 0x3a9, 0x5, 0xb2, 0x5a, 0x2, 0x3a8, 0x3aa, 
       0x7, 0x31, 0x2, 0x2, 0x3a9, 0x3a8, 0x3, 0x2, 0x2, 0x2, 0x3a9, 0x3aa, 
       0x3, 0x2, 0x2, 0x2, 0x3aa, 0x3ac, 0x3, 0x2, 0x2, 0x2, 0x3ab, 0x3ad, 
       0x7, 0x1f, 0x2, 0x2, 0x3ac, 0x3ab, 0x3, 0x2, 0x2, 0x2, 0x3ac, 0x3ad, 
       0x3, 0x2, 0x2, 0x2, 0x3ad, 0x3af, 0x3, 0x2, 0x2, 0x2, 0x3ae, 0x3b0, 
       0x7, 0x2b, 0x2, 0x2, 0x3af, 0x3ae, 0x3, 0x2, 0x2, 0x2, 0x3af, 0x3b0, 
       0x3, 0x2, 0x2, 0x2, 0x3b0, 0x3b2, 0x3, 0x2, 0x2, 0x2, 0x3b1, 0x3b3, 
       0x7, 0x2c, 0x2, 0x2, 0x3b2, 0x3b1, 0x3, 0x2, 0x2, 0x2, 0x3b2, 0x3b3, 
       0x3, 0x2, 0x2, 0x2, 0x3b3, 0x434, 0x3, 0x2, 0x2, 0x2, 0x3b4, 0x3b6, 
       0x7, 0x2d, 0x2, 0x2, 0x3b5, 0x3b4, 0x3, 0x2, 0x2, 0x2, 0x3b5, 0x3b6, 
       0x3, 0x2, 0x2, 0x2, 0x3b6, 0x3b8, 0x3, 0x2, 0x2, 0x2, 0x3b7, 0x3b9, 
       0x5, 0xb8, 0x5d, 0x2, 0x3b8, 0x3b7, 0x3, 0x2, 0x2, 0x2, 0x3b8, 0x3b9, 
       0x3, 0x2, 0x2, 0x2, 0x3b9, 0x3ba, 0x3, 0x2, 0x2, 0x2, 0x3ba, 0x3bc, 
       0x5, 0xb0, 0x59, 0x2, 0x3bb, 0x3bd, 0x5, 0xba, 0x5e, 0x2, 0x3bc, 
       0x3bb, 0x3, 0x2, 0x2, 0x2, 0x3bc, 0x3bd, 0x3, 0x2, 0x2, 0x2, 0x3bd, 
       0x3bf, 0x3, 0x2, 0x2, 0x2, 0x3be, 0x3c0, 0x7, 0x31, 0x2, 0x2, 0x3bf, 
       0x3be, 0x3, 0x2, 0x2, 0x2, 0x3bf, 0x3c0, 0x3, 0x2, 0x2, 0x2, 0x3c0, 
       0x3c2, 0x3, 0x2, 0x2, 0x2, 0x3c1, 0x3c3, 0x7, 0x1f, 0x2, 0x2, 0x3c2, 
       0x3c1, 0x3, 0x2, 0x2, 0x2, 0x3c2, 0x3c3, 0x3, 0x2, 0x2, 0x2, 0x3c3, 
       0x3c5, 0x3, 0x2, 0x2, 0x2, 0x3c4, 0x3c6, 0x7, 0x2b, 0x2, 0x2, 0x3c5, 
       0x3c4, 0x3, 0x2, 0x2, 0x2, 0x3c5, 0x3c6, 0x3, 0x2, 0x2, 0x2, 0x3c6, 
       0x3c8, 0x3, 0x2, 0x2, 0x2, 0x3c7, 0x3c9, 0x7, 0x2c, 0x2, 0x2, 0x3c8, 
       0x3c7, 0x3, 0x2, 0x2, 0x2, 0x3c8, 0x3c9, 0x3, 0x2, 0x2, 0x2, 0x3c9, 
       0x3f2, 0x3, 0x2, 0x2, 0x2, 0x3ca, 0x3cc, 0x7, 0x2d, 0x2, 0x2, 0x3cb, 
       0x3ca, 0x3, 0x2, 0x2, 0x2, 0x3cb, 0x3cc, 0x3, 0x2, 0x2, 0x2, 0x3cc, 
       0x3cd, 0x3, 0x2, 0x2, 0x2, 0x3cd, 0x3cf, 0x7, 0x33, 0x2, 0x2, 0x3ce, 
       0x3d0, 0x7, 0x31, 0x2, 0x2, 0x3cf, 0x3ce, 0x3, 0x2, 0x2, 0x2, 0x3cf, 
       0x3d0, 0x3, 0x2, 0x2, 0x2, 0x3d0, 0x3d2, 0x3, 0x2, 0x2, 0x2, 0x3d1, 
       0x3d3, 0x7, 0x2b, 0x2, 0x2, 0x3d2, 0x3d1, 0x3, 0x2, 0x2, 0x2, 0x3d2, 
       0x3d3, 0x3, 0x2, 0x2, 0x2, 0x3d3, 0x3d5, 0x3, 0x2, 0x2, 0x2, 0x3d4, 
       0x3d6, 0x7, 0x2c, 0x2, 0x2, 0x3d5, 0x3d4, 0x3, 0x2, 0x2, 0x2, 0x3d5, 
       0x3d6, 0x3, 0x2, 0x2, 0x2, 0x3d6, 0x3f2, 0x3, 0x2, 0x2, 0x2, 0x3d7, 
       0x3d9, 0x7, 0x2d, 0x2, 0x2, 0x3d8, 0x3d7, 0x3, 0x2, 0x2, 0x2, 0x3d8, 
       0x3d9, 0x3, 0x2, 0x2, 0x2, 0x3d9, 0x3da, 0x3, 0x2, 0x2, 0x2, 0x3da, 
       0x3dc, 0x7, 0x34, 0x2, 0x2, 0x3db, 0x3dd, 0x7, 0x31, 0x2, 0x2, 0x3dc, 
       0x3db, 0x3, 0x2, 0x2, 0x2, 0x3dc, 0x3dd, 0x3, 0x2, 0x2, 0x2, 0x3dd, 
       0x3df, 0x3, 0x2, 0x2, 0x2, 0x3de, 0x3e0, 0x7, 0x2b, 0x2, 0x2, 0x3df, 
       0x3de, 0x3, 0x2, 0x2, 0x2, 0x3df, 0x3e0, 0x3, 0x2, 0x2, 0x2, 0x3e0, 
       0x3e2, 0x3, 0x2, 0x2, 0x2, 0x3e1, 0x3e3, 0x7, 0x2c, 0x2, 0x2, 0x3e2, 
       0x3e1, 0x3, 0x2, 0x2, 0x2, 0x3e2, 0x3e3, 0x3, 0x2, 0x2, 0x2, 0x3e3, 
       0x3f2, 0x3, 0x2, 0x2, 0x2, 0x3e4, 0x3e6, 0x7, 0x2d, 0x2, 0x2, 0x3e5, 
       0x3e4, 0x3, 0x2, 0x2, 0x2, 0x3e5, 0x3e6, 0x3, 0x2, 0x2, 0x2, 0x3e6, 
       0x3e7, 0x3, 0x2, 0x2, 0x2, 0x3e7, 0x3e9, 0x7, 0x35, 0x2, 0x2, 0x3e8, 
       0x3ea, 0x7, 0x31, 0x2, 0x2, 0x3e9, 0x3e8, 0x3, 0x2, 0x2, 0x2, 0x3e9, 
       0x3ea, 0x3, 0x2, 0x2, 0x2, 0x3ea, 0x3ec, 0x3, 0x2, 0x2, 0x2, 0x3eb, 
       0x3ed, 0x7, 0x2b, 0x2, 0x2, 0x3ec, 0x3eb, 0x3, 0x2, 0x2, 0x2, 0x3ec, 
       0x3ed, 0x3, 0x2, 0x2, 0x2, 0x3ed, 0x3ef, 0x3, 0x2, 0x2, 0x2, 0x3ee, 
       0x3f0, 0x7, 0x2c, 0x2, 0x2, 0x3ef, 0x3ee, 0x3, 0x2, 0x2, 0x2, 0x3ef, 
       0x3f0, 0x3, 0x2, 0x2, 0x2, 0x3f0, 0x3f2, 0x3, 0x2, 0x2, 0x2, 0x3f1, 
       0x3b5, 0x3, 0x2, 0x2, 0x2, 0x3f1, 0x3cb, 0x3, 0x2, 0x2, 0x2, 0x3f1, 
       0x3d8, 0x3, 0x2, 0x2, 0x2, 0x3f1, 0x3e5, 0x3, 0x2, 0x2, 0x2, 0x3f2, 
       0x434, 0x3, 0x2, 0x2, 0x2, 0x3f3, 0x3f5, 0x7, 0x2d, 0x2, 0x2, 0x3f4, 
       0x3f3, 0x3, 0x2, 0x2, 0x2, 0x3f4, 0x3f5, 0x3, 0x2, 0x2, 0x2, 0x3f5, 
       0x3f7, 0x3, 0x2, 0x2, 0x2, 0x3f6, 0x3f8, 0x5, 0xb8, 0x5d, 0x2, 0x3f7, 
       0x3f6, 0x3, 0x2, 0x2, 0x2, 0x3f7, 0x3f8, 0x3, 0x2, 0x2, 0x2, 0x3f8, 
       0x3f9, 0x3, 0x2, 0x2, 0x2, 0x3f9, 0x3fb, 0x5, 0x74, 0x3b, 0x2, 0x3fa, 
       0x3fc, 0x5, 0xba, 0x5e, 0x2, 0x3fb, 0x3fa, 0x3, 0x2, 0x2, 0x2, 0x3fb, 
       0x3fc, 0x3, 0x2, 0x2, 0x2, 0x3fc, 0x3fe, 0x3, 0x2, 0x2, 0x2, 0x3fd, 
       0x3ff, 0x7, 0x31, 0x2, 0x2, 0x3fe, 0x3fd, 0x3, 0x2, 0x2, 0x2, 0x3fe, 
       0x3ff, 0x3, 0x2, 0x2, 0x2, 0x3ff, 0x401, 0x3, 0x2, 0x2, 0x2, 0x400, 
       0x402, 0x7, 0x2b, 0x2, 0x2, 0x401, 0x400, 0x3, 0x2, 0x2, 0x2, 0x401, 
       0x402, 0x3, 0x2, 0x2, 0x2, 0x402, 0x404, 0x3, 0x2, 0x2, 0x2, 0x403, 
       0x405, 0x7, 0x2c, 0x2, 0x2, 0x404, 0x403, 0x3, 0x2, 0x2, 0x2, 0x404, 
       0x405, 0x3, 0x2, 0x2, 0x2, 0x405, 0x434, 0x3, 0x2, 0x2, 0x2, 0x406, 
       0x434, 0x5, 0x5a, 0x2e, 0x2, 0x407, 0x434, 0x5, 0x6e, 0x38, 0x2, 
       0x408, 0x434, 0x5, 0x7e, 0x40, 0x2, 0x409, 0x40b, 0x7, 0x2d, 0x2, 
       0x2, 0x40a, 0x409, 0x3, 0x2, 0x2, 0x2, 0x40a, 0x40b, 0x3, 0x2, 0x2, 
       0x2, 0x40b, 0x40d, 0x3, 0x2, 0x2, 0x2, 0x40c, 0x40e, 0x5, 0xb8, 0x5d, 
       0x2, 0x40d, 0x40c, 0x3, 0x2, 0x2, 0x2, 0x40d, 0x40e, 0x3, 0x2, 0x2, 
       0x2, 0x40e, 0x40f, 0x3, 0x2, 0x2, 0x2, 0x40f, 0x411, 0x5, 0x92, 0x4a, 
       0x2, 0x410, 0x412, 0x5, 0xba, 0x5e, 0x2, 0x411, 0x410, 0x3, 0x2, 
       0x2, 0x2, 0x411, 0x412, 0x3, 0x2, 0x2, 0x2, 0x412, 0x414, 0x3, 0x2, 
       0x2, 0x2, 0x413, 0x415, 0x7, 0x31, 0x2, 0x2, 0x414, 0x413, 0x3, 0x2, 
       0x2, 0x2, 0x414, 0x415, 0x3, 0x2, 0x2, 0x2, 0x415, 0x417, 0x3, 0x2, 
       0x2, 0x2, 0x416, 0x418, 0x7, 0x1f, 0x2, 0x2, 0x417, 0x416, 0x3, 0x2, 
       0x2, 0x2, 0x417, 0x418, 0x3, 0x2, 0x2, 0x2, 0x418, 0x41a, 0x3, 0x2, 
       0x2, 0x2, 0x419, 0x41b, 0x7, 0x2b, 0x2, 0x2, 0x41a, 0x419, 0x3, 0x2, 
       0x2, 0x2, 0x41a, 0x41b, 0x3, 0x2, 0x2, 0x2, 0x41b, 0x41d, 0x3, 0x2, 
       0x2, 0x2, 0x41c, 0x41e, 0x7, 0x2c, 0x2, 0x2, 0x41d, 0x41c, 0x3, 0x2, 
       0x2, 0x2, 0x41d, 0x41e, 0x3, 0x2, 0x2, 0x2, 0x41e, 0x434, 0x3, 0x2, 
       0x2, 0x2, 0x41f, 0x434, 0x5, 0x90, 0x49, 0x2, 0x420, 0x421, 0x7, 
       0x27, 0x2, 0x2, 0x421, 0x425, 0x7, 0x28, 0x2, 0x2, 0x422, 0x423, 
       0x7, 0x25, 0x2, 0x2, 0x423, 0x425, 0x7, 0x26, 0x2, 0x2, 0x424, 0x420, 
       0x3, 0x2, 0x2, 0x2, 0x424, 0x422, 0x3, 0x2, 0x2, 0x2, 0x425, 0x434, 
       0x3, 0x2, 0x2, 0x2, 0x426, 0x428, 0x7, 0x2d, 0x2, 0x2, 0x427, 0x426, 
       0x3, 0x2, 0x2, 0x2, 0x427, 0x428, 0x3, 0x2, 0x2, 0x2, 0x428, 0x429, 
       0x3, 0x2, 0x2, 0x2, 0x429, 0x42b, 0x5, 0xaa, 0x56, 0x2, 0x42a, 0x42c, 
       0x7, 0x31, 0x2, 0x2, 0x42b, 0x42a, 0x3, 0x2, 0x2, 0x2, 0x42b, 0x42c, 
       0x3, 0x2, 0x2, 0x2, 0x42c, 0x42e, 0x3, 0x2, 0x2, 0x2, 0x42d, 0x42f, 
       0x7, 0x2b, 0x2, 0x2, 0x42e, 0x42d, 0x3, 0x2, 0x2, 0x2, 0x42e, 0x42f, 
       0x3, 0x2, 0x2, 0x2, 0x42f, 0x431, 0x3, 0x2, 0x2, 0x2, 0x430, 0x432, 
       0x7, 0x2c, 0x2, 0x2, 0x431, 0x430, 0x3, 0x2, 0x2, 0x2, 0x431, 0x432, 
       0x3, 0x2, 0x2, 0x2, 0x432, 0x434, 0x3, 0x2, 0x2, 0x2, 0x433, 0x396, 
       0x3, 0x2, 0x2, 0x2, 0x433, 0x3a3, 0x3, 0x2, 0x2, 0x2, 0x433, 0x3f1, 
       0x3, 0x2, 0x2, 0x2, 0x433, 0x3f4, 0x3, 0x2, 0x2, 0x2, 0x433, 0x406, 
       0x3, 0x2, 0x2, 0x2, 0x433, 0x407, 0x3, 0x2, 0x2, 0x2, 0x433, 0x408, 
       0x3, 0x2, 0x2, 0x2, 0x433, 0x40a, 0x3, 0x2, 0x2, 0x2, 0x433, 0x41f, 
       0x3, 0x2, 0x2, 0x2, 0x433, 0x424, 0x3, 0x2, 0x2, 0x2, 0x433, 0x427, 
       0x3, 0x2, 0x2, 0x2, 0x434, 0xa9, 0x3, 0x2, 0x2, 0x2, 0x435, 0x436, 
       0x7, 0x29, 0x2, 0x2, 0x436, 0x437, 0x5, 0xac, 0x57, 0x2, 0x437, 0x438, 
       0x7, 0x2a, 0x2, 0x2, 0x438, 0xab, 0x3, 0x2, 0x2, 0x2, 0x439, 0x43d, 
       0x5, 0xa8, 0x55, 0x2, 0x43a, 0x43c, 0x5, 0xac, 0x57, 0x2, 0x43b, 
       0x43a, 0x3, 0x2, 0x2, 0x2, 0x43c, 0x43f, 0x3, 0x2, 0x2, 0x2, 0x43d, 
       0x43b, 0x3, 0x2, 0x2, 0x2, 0x43d, 0x43e, 0x3, 0x2, 0x2, 0x2, 0x43e, 
       0xad, 0x3, 0x2, 0x2, 0x2, 0x43f, 0x43d, 0x3, 0x2, 0x2, 0x2, 0x440, 
       0x444, 0x5, 0xa8, 0x55, 0x2, 0x441, 0x443, 0x5, 0xae, 0x58, 0x2, 
       0x442, 0x441, 0x3, 0x2, 0x2, 0x2, 0x443, 0x446, 0x3, 0x2, 0x2, 0x2, 
       0x444, 0x442, 0x3, 0x2, 0x2, 0x2, 0x444, 0x445, 0x3, 0x2, 0x2, 0x2, 
       0x445, 0xaf, 0x3, 0x2, 0x2, 0x2, 0x446, 0x444, 0x3, 0x2, 0x2, 0x2, 
       0x447, 0x448, 0x7, 0x2f, 0x2, 0x2, 0x448, 0xb1, 0x3, 0x2, 0x2, 0x2, 
       0x449, 0x44a, 0x7, 0x2f, 0x2, 0x2, 0x44a, 0xb3, 0x3, 0x2, 0x2, 0x2, 
       0x44b, 0x44c, 0x7, 0x2f, 0x2, 0x2, 0x44c, 0xb5, 0x3, 0x2, 0x2, 0x2, 
       0x44d, 0x44e, 0x7, 0x2f, 0x2, 0x2, 0x44e, 0xb7, 0x3, 0x2, 0x2, 0x2, 
       0x44f, 0x450, 0x7, 0x2e, 0x2, 0x2, 0x450, 0xb9, 0x3, 0x2, 0x2, 0x2, 
       0x451, 0x452, 0x7, 0x2e, 0x2, 0x2, 0x452, 0xbb, 0x3, 0x2, 0x2, 0x2, 
       0x453, 0x454, 0x7, 0x29, 0x2, 0x2, 0x454, 0xbd, 0x3, 0x2, 0x2, 0x2, 
       0x455, 0x456, 0x7, 0x2a, 0x2, 0x2, 0x456, 0xbf, 0x3, 0x2, 0x2, 0x2, 
       0xa7, 0xc8, 0xdc, 0xe4, 0xef, 0xf9, 0x100, 0x107, 0x111, 0x114, 0x118, 
       0x11f, 0x124, 0x128, 0x12f, 0x132, 0x13e, 0x144, 0x14b, 0x14f, 0x154, 
       0x15e, 0x165, 0x16e, 0x171, 0x17b, 0x18d, 0x194, 0x19c, 0x1a3, 0x1ac, 
       0x1b0, 0x1b4, 0x1bb, 0x1c6, 0x1cd, 0x1d1, 0x1da, 0x1de, 0x1e4, 0x1e6, 
       0x1ec, 0x1f3, 0x1f7, 0x1fd, 0x1ff, 0x203, 0x205, 0x20a, 0x20e, 0x214, 
       0x216, 0x21c, 0x222, 0x226, 0x22c, 0x22e, 0x231, 0x237, 0x23e, 0x249, 
       0x253, 0x25d, 0x261, 0x265, 0x26d, 0x271, 0x274, 0x278, 0x27c, 0x280, 
       0x283, 0x289, 0x28d, 0x291, 0x299, 0x29d, 0x2a1, 0x2a5, 0x2a9, 0x2ac, 
       0x2b4, 0x2bf, 0x2cd, 0x2d2, 0x2d8, 0x2da, 0x2e1, 0x2e7, 0x2ec, 0x2f1, 
       0x2f9, 0x2fd, 0x305, 0x30a, 0x311, 0x31a, 0x31d, 0x323, 0x327, 0x32d, 
       0x331, 0x337, 0x33b, 0x344, 0x34c, 0x350, 0x358, 0x35c, 0x360, 0x363, 
       0x366, 0x36e, 0x380, 0x38b, 0x393, 0x396, 0x39a, 0x39d, 0x3a0, 0x3a3, 
       0x3a9, 0x3ac, 0x3af, 0x3b2, 0x3b5, 0x3b8, 0x3bc, 0x3bf, 0x3c2, 0x3c5, 
       0x3c8, 0x3cb, 0x3cf, 0x3d2, 0x3d5, 0x3d8, 0x3dc, 0x3df, 0x3e2, 0x3e5, 
       0x3e9, 0x3ec, 0x3ef, 0x3f1, 0x3f4, 0x3f7, 0x3fb, 0x3fe, 0x401, 0x404, 
       0x40a, 0x40d, 0x411, 0x414, 0x417, 0x41a, 0x41d, 0x424, 0x427, 0x42b, 
       0x42e, 0x431, 0x433, 0x43d, 0x444, 
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
