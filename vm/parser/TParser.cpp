
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
    setState(66);
    sentences();
    setState(67);
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
    setState(74);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 0, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(69);
      statements();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(70);
      statements();
      setState(71);
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

TParser::BlockCommentsContext* TParser::StatementsContext::blockComments() {
  return getRuleContext<TParser::BlockCommentsContext>(0);
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

TParser::BlockCodeContext* TParser::StatementsContext::blockCode() {
  return getRuleContext<TParser::BlockCodeContext>(0);
}

TParser::BlockLiveTokensContext* TParser::StatementsContext::blockLiveTokens() {
  return getRuleContext<TParser::BlockLiveTokensContext>(0);
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
    setState(83);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::BlockComment:
      case TParser::LineComment: {
        enterOuterAlt(_localctx, 1);
        setState(76);
        blockComments();
        break;
      }

      case TParser::Use: {
        enterOuterAlt(_localctx, 2);
        setState(77);
        blockUse();
        break;
      }

      case TParser::Var: {
        enterOuterAlt(_localctx, 3);
        setState(78);
        blockVariable();
        break;
      }

      case TParser::Ret: {
        enterOuterAlt(_localctx, 4);
        setState(79);
        blockRet();
        break;
      }

      case TParser::If: {
        enterOuterAlt(_localctx, 5);
        setState(80);
        blockConditional();
        break;
      }

      case TParser::OpenBlock: {
        enterOuterAlt(_localctx, 6);
        setState(81);
        blockCode();
        break;
      }

      case TParser::For:
      case TParser::Function:
      case TParser::Pub:
      case TParser::Pro:
      case TParser::Priv:
      case TParser::Static:
      case TParser::Final:
      case TParser::Interface:
      case TParser::Abstract:
      case TParser::Extends:
      case TParser::Class:
      case TParser::Implements:
      case TParser::New:
      case TParser::Break:
      case TParser::Next:
      case TParser::Async:
      case TParser::Await:
      case TParser::Try:
      case TParser::Catch:
      case TParser::ArrowRight:
      case TParser::ARightLB:
      case TParser::End:
      case TParser::Attr:
      case TParser::Point:
      case TParser::TwoPoint:
      case TParser::TwoTwoPoint:
      case TParser::Separator:
      case TParser::OpenArIndex:
      case TParser::CloseArIndex:
      case TParser::OpenOp:
      case TParser::CloseOp:
      case TParser::ArithmeticOperator:
      case TParser::AssignmentOperator:
      case TParser::Not:
      case TParser::IncDecOperators:
      case TParser::Identifier:
      case TParser::IDPrefix:
      case TParser::TypeSpec:
      case TParser::Words:
      case TParser::Integer:
      case TParser::Float:
      case TParser::String: {
        enterOuterAlt(_localctx, 7);
        setState(82);
        blockLiveTokens();
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
    setState(91);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 2, _ctx)) {
    case 1: {
      setState(85);
      match(TParser::OpenBlock);
      setState(86);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      setState(87);
      match(TParser::OpenBlock);
      setState(88);
      sentences();
      setState(89);
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

//----------------- BlockCommentsContext ------------------------------------------------------------------

TParser::BlockCommentsContext::BlockCommentsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BlockCommentsContext::BlockComment() {
  return getToken(TParser::BlockComment, 0);
}

tree::TerminalNode* TParser::BlockCommentsContext::LineComment() {
  return getToken(TParser::LineComment, 0);
}


size_t TParser::BlockCommentsContext::getRuleIndex() const {
  return TParser::RuleBlockComments;
}

void TParser::BlockCommentsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockComments(this);
}

void TParser::BlockCommentsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockComments(this);
}


antlrcpp::Any TParser::BlockCommentsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockComments(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockCommentsContext* TParser::blockComments() {
  BlockCommentsContext *_localctx = _tracker.createInstance<BlockCommentsContext>(_ctx, getState());
  enterRule(_localctx, 8, TParser::RuleBlockComments);
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
    setState(93);
    _la = _input->LA(1);
    if (!(_la == TParser::BlockComment

    || _la == TParser::LineComment)) {
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
  enterRule(_localctx, 10, TParser::RuleBlockUse);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(95);
    match(TParser::Use);
    setState(96);
    useValue();
    setState(97);
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
  enterRule(_localctx, 12, TParser::RuleUseValue);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(104);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 3, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(99);
      useString();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(100);
      useString();
      setState(101);
      match(TParser::Separator);
      setState(102);
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
  enterRule(_localctx, 14, TParser::RuleUseString);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(106);
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
  enterRule(_localctx, 16, TParser::RuleBlockVariable);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(108);
    match(TParser::Var);
    setState(109);
    variableItem();
    setState(110);
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
  enterRule(_localctx, 18, TParser::RuleVariableItem);
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
    setState(112);
    variablePrefixModes();
    setState(114);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::New

    || _la == TParser::Await) {
      setState(113);
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
    setState(116);
    generalValueElements();
    setState(121);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 5, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(117);
        match(TParser::Separator);
        setState(118);
        variableItem(); 
      }
      setState(123);
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

TParser::MethodVisibilityContext* TParser::VariablePrefixModesContext::methodVisibility() {
  return getRuleContext<TParser::MethodVisibilityContext>(0);
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
  enterRule(_localctx, 20, TParser::RuleVariablePrefixModes);
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
    setState(125);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << TParser::Pub)
      | (1ULL << TParser::Pro)
      | (1ULL << TParser::Priv)
      | (1ULL << TParser::Static)
      | (1ULL << TParser::Final)
      | (1ULL << TParser::Async))) != 0)) {
      setState(124);
      methodVisibility();
    }
    setState(131);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 7, _ctx)) {
    case 1: {
      setState(127);
      identifier();
      break;
    }

    case 2: {
      setState(128);
      identifier();
      setState(129);
      match(TParser::TypeSpec);
      break;
    }

    default:
      break;
    }
    setState(133);
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

tree::TerminalNode* TParser::VisibilityItemsContext::Async() {
  return getToken(TParser::Async, 0);
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
  enterRule(_localctx, 22, TParser::RuleVisibilityItems);
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
    setState(135);
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

//----------------- MethodVisibilityContext ------------------------------------------------------------------

TParser::MethodVisibilityContext::MethodVisibilityContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::VisibilityItemsContext* TParser::MethodVisibilityContext::visibilityItems() {
  return getRuleContext<TParser::VisibilityItemsContext>(0);
}

std::vector<TParser::MethodVisibilityContext *> TParser::MethodVisibilityContext::methodVisibility() {
  return getRuleContexts<TParser::MethodVisibilityContext>();
}

TParser::MethodVisibilityContext* TParser::MethodVisibilityContext::methodVisibility(size_t i) {
  return getRuleContext<TParser::MethodVisibilityContext>(i);
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
  enterRule(_localctx, 24, TParser::RuleMethodVisibility);

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
    setState(137);
    visibilityItems();
    setState(141);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 8, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(138);
        methodVisibility(); 
      }
      setState(143);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 8, _ctx);
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

TParser::FunctionCallPrefixContext* TParser::FunctionCallContext::functionCallPrefix() {
  return getRuleContext<TParser::FunctionCallPrefixContext>(0);
}

TParser::FunctionCallParamContext* TParser::FunctionCallContext::functionCallParam() {
  return getRuleContext<TParser::FunctionCallParamContext>(0);
}

TParser::IdentifierContext* TParser::FunctionCallContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
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
  enterRule(_localctx, 26, TParser::RuleFunctionCall);
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
    setState(144);
    functionCallPrefix();
    setState(146);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::Identifier) {
      setState(145);
      identifier();
    }
    setState(148);
    functionCallParam();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionCallPrefixContext ------------------------------------------------------------------

TParser::FunctionCallPrefixContext::FunctionCallPrefixContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::IdentifierContext* TParser::FunctionCallPrefixContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

tree::TerminalNode* TParser::FunctionCallPrefixContext::Point() {
  return getToken(TParser::Point, 0);
}

tree::TerminalNode* TParser::FunctionCallPrefixContext::TwoTwoPoint() {
  return getToken(TParser::TwoTwoPoint, 0);
}


size_t TParser::FunctionCallPrefixContext::getRuleIndex() const {
  return TParser::RuleFunctionCallPrefix;
}

void TParser::FunctionCallPrefixContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionCallPrefix(this);
}

void TParser::FunctionCallPrefixContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionCallPrefix(this);
}


antlrcpp::Any TParser::FunctionCallPrefixContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionCallPrefix(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionCallPrefixContext* TParser::functionCallPrefix() {
  FunctionCallPrefixContext *_localctx = _tracker.createInstance<FunctionCallPrefixContext>(_ctx, getState());
  enterRule(_localctx, 28, TParser::RuleFunctionCallPrefix);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(157);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 10, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(150);
      identifier();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(151);
      identifier();
      setState(152);
      match(TParser::Point);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(154);
      identifier();
      setState(155);
      match(TParser::TwoTwoPoint);
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
  enterRule(_localctx, 30, TParser::RuleFunctionCallParam);

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
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 11, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(159);
      match(TParser::OpenOp);
      setState(160);
      match(TParser::CloseOp);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(161);
      match(TParser::OpenOp);
      setState(162);
      functionCallParamElements();
      setState(163);
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
  enterRule(_localctx, 32, TParser::RuleFunctionCallParamElements);

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
    setState(167);
    generalValue();
    setState(172);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 12, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(168);
        match(TParser::Separator);
        setState(169);
        functionCallParamElements(); 
      }
      setState(174);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 12, _ctx);
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
  enterRule(_localctx, 34, TParser::RuleBlockRet);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(175);
    match(TParser::Ret);
    setState(176);
    generalValueElements();
    setState(177);
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
  enterRule(_localctx, 36, TParser::RuleBlockConditional);

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
    ifElementUnique();
    setState(181);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 13, _ctx)) {
    case 1: {
      setState(180);
      elifElements();
      break;
    }

    default:
      break;
    }
    setState(184);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 14, _ctx)) {
    case 1: {
      setState(183);
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
  enterRule(_localctx, 38, TParser::RuleIfElementUnique);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(186);
    match(TParser::If);
    setState(187);
    conditionalBlockExpression();
    setState(188);
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
  enterRule(_localctx, 40, TParser::RuleElifElements);

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
    setState(190);
    elifElementUnique();
    setState(194);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 15, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(191);
        elifElements(); 
      }
      setState(196);
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
  enterRule(_localctx, 42, TParser::RuleElifElementUnique);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(197);
    match(TParser::Elif);
    setState(198);
    conditionalBlockExpression();
    setState(199);
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
  enterRule(_localctx, 44, TParser::RuleElseElementUnique);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(201);
    match(TParser::Else);
    setState(202);
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
  enterRule(_localctx, 46, TParser::RuleConditionalBlockExpression);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(204);
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

tree::TerminalNode* TParser::ConditionalBlockElementsContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::ConditionalBlockElementsContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::SentencesContext* TParser::ConditionalBlockElementsContext::sentences() {
  return getRuleContext<TParser::SentencesContext>(0);
}

TParser::BlockConditionalContext* TParser::ConditionalBlockElementsContext::blockConditional() {
  return getRuleContext<TParser::BlockConditionalContext>(0);
}

TParser::BlockRetContext* TParser::ConditionalBlockElementsContext::blockRet() {
  return getRuleContext<TParser::BlockRetContext>(0);
}

TParser::FunctionCallContext* TParser::ConditionalBlockElementsContext::functionCall() {
  return getRuleContext<TParser::FunctionCallContext>(0);
}

tree::TerminalNode* TParser::ConditionalBlockElementsContext::End() {
  return getToken(TParser::End, 0);
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
  enterRule(_localctx, 48, TParser::RuleConditionalBlockElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(217);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 16, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(206);
      match(TParser::OpenBlock);
      setState(207);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(208);
      match(TParser::OpenBlock);
      setState(209);
      sentences();
      setState(210);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(212);
      blockConditional();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(213);
      blockRet();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(214);
      functionCall();
      setState(215);
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

//----------------- GeneralValueContext ------------------------------------------------------------------

TParser::GeneralValueContext::GeneralValueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::IdentifierContext* TParser::GeneralValueContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
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

tree::TerminalNode* TParser::GeneralValueContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::ArithmeticOperator() {
  return getToken(TParser::ArithmeticOperator, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::AssignmentOperator() {
  return getToken(TParser::AssignmentOperator, 0);
}

TParser::FunctionCallContext* TParser::GeneralValueContext::functionCall() {
  return getRuleContext<TParser::FunctionCallContext>(0);
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
  enterRule(_localctx, 50, TParser::RuleGeneralValue);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(284);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 37, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(262);
      _errHandler->sync(this);
      switch (_input->LA(1)) {
        case TParser::IncDecOperators:
        case TParser::Identifier: {
          setState(220);
          _errHandler->sync(this);

          _la = _input->LA(1);
          if (_la == TParser::IncDecOperators) {
            setState(219);
            incDecOperatorsA();
          }
          setState(222);
          identifier();
          setState(224);
          _errHandler->sync(this);

          switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 18, _ctx)) {
          case 1: {
            setState(223);
            incDecOperatorsB();
            break;
          }

          default:
            break;
          }
          setState(227);
          _errHandler->sync(this);

          _la = _input->LA(1);
          if (_la == TParser::TypeSpec) {
            setState(226);
            match(TParser::TypeSpec);
          }
          setState(230);
          _errHandler->sync(this);

          _la = _input->LA(1);
          if (_la == TParser::ArithmeticOperator) {
            setState(229);
            match(TParser::ArithmeticOperator);
          }
          setState(233);
          _errHandler->sync(this);

          _la = _input->LA(1);
          if (_la == TParser::AssignmentOperator) {
            setState(232);
            match(TParser::AssignmentOperator);
          }
          break;
        }

        case TParser::Integer: {
          setState(235);
          match(TParser::Integer);
          setState(237);
          _errHandler->sync(this);

          _la = _input->LA(1);
          if (_la == TParser::TypeSpec) {
            setState(236);
            match(TParser::TypeSpec);
          }
          setState(240);
          _errHandler->sync(this);

          _la = _input->LA(1);
          if (_la == TParser::ArithmeticOperator) {
            setState(239);
            match(TParser::ArithmeticOperator);
          }
          setState(243);
          _errHandler->sync(this);

          _la = _input->LA(1);
          if (_la == TParser::AssignmentOperator) {
            setState(242);
            match(TParser::AssignmentOperator);
          }
          break;
        }

        case TParser::Float: {
          setState(245);
          match(TParser::Float);
          setState(247);
          _errHandler->sync(this);

          _la = _input->LA(1);
          if (_la == TParser::TypeSpec) {
            setState(246);
            match(TParser::TypeSpec);
          }
          setState(250);
          _errHandler->sync(this);

          _la = _input->LA(1);
          if (_la == TParser::ArithmeticOperator) {
            setState(249);
            match(TParser::ArithmeticOperator);
          }
          setState(253);
          _errHandler->sync(this);

          _la = _input->LA(1);
          if (_la == TParser::AssignmentOperator) {
            setState(252);
            match(TParser::AssignmentOperator);
          }
          break;
        }

        case TParser::String: {
          setState(255);
          match(TParser::String);
          setState(257);
          _errHandler->sync(this);

          _la = _input->LA(1);
          if (_la == TParser::ArithmeticOperator) {
            setState(256);
            match(TParser::ArithmeticOperator);
          }
          setState(260);
          _errHandler->sync(this);

          _la = _input->LA(1);
          if (_la == TParser::AssignmentOperator) {
            setState(259);
            match(TParser::AssignmentOperator);
          }
          break;
        }

      default:
        throw NoViableAltException(this);
      }
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(264);
      functionCall();
      setState(266);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::TypeSpec) {
        setState(265);
        match(TParser::TypeSpec);
      }
      setState(269);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::ArithmeticOperator) {
        setState(268);
        match(TParser::ArithmeticOperator);
      }
      setState(272);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::AssignmentOperator) {
        setState(271);
        match(TParser::AssignmentOperator);
      }
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(274);
      generalValueBlock();
      setState(276);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::TypeSpec) {
        setState(275);
        match(TParser::TypeSpec);
      }
      setState(279);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::ArithmeticOperator) {
        setState(278);
        match(TParser::ArithmeticOperator);
      }
      setState(282);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::AssignmentOperator) {
        setState(281);
        match(TParser::AssignmentOperator);
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

tree::TerminalNode* TParser::GeneralValueBlockContext::Not() {
  return getToken(TParser::Not, 0);
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
  enterRule(_localctx, 52, TParser::RuleGeneralValueBlock);
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
    setState(287);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::Not) {
      setState(286);
      match(TParser::Not);
    }
    setState(289);
    match(TParser::OpenOp);
    setState(290);
    generalValueItems();
    setState(291);
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

tree::TerminalNode* TParser::GeneralValueItemsContext::Not() {
  return getToken(TParser::Not, 0);
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
  enterRule(_localctx, 54, TParser::RuleGeneralValueItems);

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
    setState(294);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 39, _ctx)) {
    case 1: {
      setState(293);
      match(TParser::Not);
      break;
    }

    default:
      break;
    }
    setState(296);
    generalValue();
    setState(300);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 40, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(297);
        generalValueItems(); 
      }
      setState(302);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 40, _ctx);
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

tree::TerminalNode* TParser::GeneralValueElementsContext::Not() {
  return getToken(TParser::Not, 0);
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
  enterRule(_localctx, 56, TParser::RuleGeneralValueElements);

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
    setState(304);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 41, _ctx)) {
    case 1: {
      setState(303);
      match(TParser::Not);
      break;
    }

    default:
      break;
    }
    setState(306);
    generalValue();
    setState(310);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 42, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(307);
        generalValueElements(); 
      }
      setState(312);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 42, _ctx);
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
  enterRule(_localctx, 58, TParser::RuleIdentifier);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(313);
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
  enterRule(_localctx, 60, TParser::RuleIncDecOperatorsA);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(315);
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
  enterRule(_localctx, 62, TParser::RuleIncDecOperatorsB);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(317);
    match(TParser::IncDecOperators);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockLiveTokensContext ------------------------------------------------------------------

TParser::BlockLiveTokensContext::BlockLiveTokensContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BlockLiveTokensContext::For() {
  return getToken(TParser::For, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Function() {
  return getToken(TParser::Function, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Pub() {
  return getToken(TParser::Pub, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Pro() {
  return getToken(TParser::Pro, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Priv() {
  return getToken(TParser::Priv, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Static() {
  return getToken(TParser::Static, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Final() {
  return getToken(TParser::Final, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Interface() {
  return getToken(TParser::Interface, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Abstract() {
  return getToken(TParser::Abstract, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Extends() {
  return getToken(TParser::Extends, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Class() {
  return getToken(TParser::Class, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Implements() {
  return getToken(TParser::Implements, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::New() {
  return getToken(TParser::New, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Break() {
  return getToken(TParser::Break, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Next() {
  return getToken(TParser::Next, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Async() {
  return getToken(TParser::Async, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Await() {
  return getToken(TParser::Await, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Try() {
  return getToken(TParser::Try, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Catch() {
  return getToken(TParser::Catch, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::ArrowRight() {
  return getToken(TParser::ArrowRight, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::ARightLB() {
  return getToken(TParser::ARightLB, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::End() {
  return getToken(TParser::End, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Attr() {
  return getToken(TParser::Attr, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Point() {
  return getToken(TParser::Point, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::TwoPoint() {
  return getToken(TParser::TwoPoint, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::TwoTwoPoint() {
  return getToken(TParser::TwoTwoPoint, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Separator() {
  return getToken(TParser::Separator, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::OpenArIndex() {
  return getToken(TParser::OpenArIndex, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::CloseArIndex() {
  return getToken(TParser::CloseArIndex, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::ArithmeticOperator() {
  return getToken(TParser::ArithmeticOperator, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::AssignmentOperator() {
  return getToken(TParser::AssignmentOperator, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Not() {
  return getToken(TParser::Not, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::IncDecOperators() {
  return getToken(TParser::IncDecOperators, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::IDPrefix() {
  return getToken(TParser::IDPrefix, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Words() {
  return getToken(TParser::Words, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Integer() {
  return getToken(TParser::Integer, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Float() {
  return getToken(TParser::Float, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::String() {
  return getToken(TParser::String, 0);
}


size_t TParser::BlockLiveTokensContext::getRuleIndex() const {
  return TParser::RuleBlockLiveTokens;
}

void TParser::BlockLiveTokensContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockLiveTokens(this);
}

void TParser::BlockLiveTokensContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockLiveTokens(this);
}


antlrcpp::Any TParser::BlockLiveTokensContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockLiveTokens(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockLiveTokensContext* TParser::blockLiveTokens() {
  BlockLiveTokensContext *_localctx = _tracker.createInstance<BlockLiveTokensContext>(_ctx, getState());
  enterRule(_localctx, 64, TParser::RuleBlockLiveTokens);
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
    setState(319);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << TParser::For)
      | (1ULL << TParser::Function)
      | (1ULL << TParser::Pub)
      | (1ULL << TParser::Pro)
      | (1ULL << TParser::Priv)
      | (1ULL << TParser::Static)
      | (1ULL << TParser::Final)
      | (1ULL << TParser::Interface)
      | (1ULL << TParser::Abstract)
      | (1ULL << TParser::Extends)
      | (1ULL << TParser::Class)
      | (1ULL << TParser::Implements)
      | (1ULL << TParser::New)
      | (1ULL << TParser::Break)
      | (1ULL << TParser::Next)
      | (1ULL << TParser::Async)
      | (1ULL << TParser::Await)
      | (1ULL << TParser::Try)
      | (1ULL << TParser::Catch)
      | (1ULL << TParser::ArrowRight)
      | (1ULL << TParser::ARightLB)
      | (1ULL << TParser::End)
      | (1ULL << TParser::Attr)
      | (1ULL << TParser::Point)
      | (1ULL << TParser::TwoPoint)
      | (1ULL << TParser::TwoTwoPoint)
      | (1ULL << TParser::Separator)
      | (1ULL << TParser::OpenArIndex)
      | (1ULL << TParser::CloseArIndex)
      | (1ULL << TParser::OpenOp)
      | (1ULL << TParser::CloseOp)
      | (1ULL << TParser::ArithmeticOperator)
      | (1ULL << TParser::AssignmentOperator)
      | (1ULL << TParser::Not)
      | (1ULL << TParser::IncDecOperators)
      | (1ULL << TParser::Identifier)
      | (1ULL << TParser::IDPrefix)
      | (1ULL << TParser::TypeSpec)
      | (1ULL << TParser::Words)
      | (1ULL << TParser::Integer)
      | (1ULL << TParser::Float)
      | (1ULL << TParser::String))) != 0))) {
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

// Static vars and initialization.
std::vector<dfa::DFA> TParser::_decisionToDFA;
atn::PredictionContextCache TParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN TParser::_atn;
std::vector<uint16_t> TParser::_serializedATN;

std::vector<std::string> TParser::_ruleNames = {
  "main", "sentences", "statements", "blockCode", "blockComments", "blockUse", 
  "useValue", "useString", "blockVariable", "variableItem", "variablePrefixModes", 
  "visibilityItems", "methodVisibility", "functionCall", "functionCallPrefix", 
  "functionCallParam", "functionCallParamElements", "blockRet", "blockConditional", 
  "ifElementUnique", "elifElements", "elifElementUnique", "elseElementUnique", 
  "conditionalBlockExpression", "conditionalBlockElements", "generalValue", 
  "generalValueBlock", "generalValueItems", "generalValueElements", "identifier", 
  "incDecOperatorsA", "incDecOperatorsB", "blockLiveTokens"
};

std::vector<std::string> TParser::_literalNames = {
  "", "'use'", "'var'", "'if'", "'elif'", "'else'", "'for'", "'ret'", "'fn'", 
  "'pub'", "'pro'", "'priv'", "'static'", "'final'", "'interface'", "'abstract'", 
  "'extends'", "'class'", "'implements'", "'new'", "'break'", "'next'", 
  "'async'", "'await'", "'try'", "'catch'", "'->'", "'=>'", "';'", "'='", 
  "'.'", "':'", "'::'", "','", "'['", "']'", "'{'", "'}'", "'('", "')'", 
  "", "", "'!'"
};

std::vector<std::string> TParser::_symbolicNames = {
  "", "Use", "Var", "If", "Elif", "Else", "For", "Ret", "Function", "Pub", 
  "Pro", "Priv", "Static", "Final", "Interface", "Abstract", "Extends", 
  "Class", "Implements", "New", "Break", "Next", "Async", "Await", "Try", 
  "Catch", "ArrowRight", "ARightLB", "End", "Attr", "Point", "TwoPoint", 
  "TwoTwoPoint", "Separator", "OpenArIndex", "CloseArIndex", "OpenBlock", 
  "CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", "AssignmentOperator", 
  "Not", "IncDecOperators", "Identifier", "IDPrefix", "TypeSpec", "Words", 
  "Integer", "Float", "String", "BlockComment", "LineComment", "Whitespace", 
  "Newline"
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
       0x3, 0x38, 0x144, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 
       0x9, 0x4, 0x4, 0x5, 0x9, 0x5, 0x4, 0x6, 0x9, 0x6, 0x4, 0x7, 0x9, 
       0x7, 0x4, 0x8, 0x9, 0x8, 0x4, 0x9, 0x9, 0x9, 0x4, 0xa, 0x9, 0xa, 
       0x4, 0xb, 0x9, 0xb, 0x4, 0xc, 0x9, 0xc, 0x4, 0xd, 0x9, 0xd, 0x4, 
       0xe, 0x9, 0xe, 0x4, 0xf, 0x9, 0xf, 0x4, 0x10, 0x9, 0x10, 0x4, 0x11, 
       0x9, 0x11, 0x4, 0x12, 0x9, 0x12, 0x4, 0x13, 0x9, 0x13, 0x4, 0x14, 
       0x9, 0x14, 0x4, 0x15, 0x9, 0x15, 0x4, 0x16, 0x9, 0x16, 0x4, 0x17, 
       0x9, 0x17, 0x4, 0x18, 0x9, 0x18, 0x4, 0x19, 0x9, 0x19, 0x4, 0x1a, 
       0x9, 0x1a, 0x4, 0x1b, 0x9, 0x1b, 0x4, 0x1c, 0x9, 0x1c, 0x4, 0x1d, 
       0x9, 0x1d, 0x4, 0x1e, 0x9, 0x1e, 0x4, 0x1f, 0x9, 0x1f, 0x4, 0x20, 
       0x9, 0x20, 0x4, 0x21, 0x9, 0x21, 0x4, 0x22, 0x9, 0x22, 0x3, 0x2, 
       0x3, 0x2, 0x3, 0x2, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 
       0x3, 0x5, 0x3, 0x4d, 0xa, 0x3, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 
       0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x5, 0x4, 0x56, 0xa, 0x4, 0x3, 
       0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x5, 0x5, 
       0x5e, 0xa, 0x5, 0x3, 0x6, 0x3, 0x6, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 
       0x3, 0x7, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x5, 
       0x8, 0x6b, 0xa, 0x8, 0x3, 0x9, 0x3, 0x9, 0x3, 0xa, 0x3, 0xa, 0x3, 
       0xa, 0x3, 0xa, 0x3, 0xb, 0x3, 0xb, 0x5, 0xb, 0x75, 0xa, 0xb, 0x3, 
       0xb, 0x3, 0xb, 0x3, 0xb, 0x7, 0xb, 0x7a, 0xa, 0xb, 0xc, 0xb, 0xe, 
       0xb, 0x7d, 0xb, 0xb, 0x3, 0xc, 0x5, 0xc, 0x80, 0xa, 0xc, 0x3, 0xc, 
       0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x5, 0xc, 0x86, 0xa, 0xc, 0x3, 0xc, 
       0x3, 0xc, 0x3, 0xd, 0x3, 0xd, 0x3, 0xe, 0x3, 0xe, 0x7, 0xe, 0x8e, 
       0xa, 0xe, 0xc, 0xe, 0xe, 0xe, 0x91, 0xb, 0xe, 0x3, 0xf, 0x3, 0xf, 
       0x5, 0xf, 0x95, 0xa, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0x10, 0x3, 0x10, 
       0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x5, 0x10, 
       0xa0, 0xa, 0x10, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 
       0x11, 0x3, 0x11, 0x5, 0x11, 0xa8, 0xa, 0x11, 0x3, 0x12, 0x3, 0x12, 
       0x3, 0x12, 0x7, 0x12, 0xad, 0xa, 0x12, 0xc, 0x12, 0xe, 0x12, 0xb0, 
       0xb, 0x12, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x14, 
       0x3, 0x14, 0x5, 0x14, 0xb8, 0xa, 0x14, 0x3, 0x14, 0x5, 0x14, 0xbb, 
       0xa, 0x14, 0x3, 0x15, 0x3, 0x15, 0x3, 0x15, 0x3, 0x15, 0x3, 0x16, 
       0x3, 0x16, 0x7, 0x16, 0xc3, 0xa, 0x16, 0xc, 0x16, 0xe, 0x16, 0xc6, 
       0xb, 0x16, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x18, 
       0x3, 0x18, 0x3, 0x18, 0x3, 0x19, 0x3, 0x19, 0x3, 0x1a, 0x3, 0x1a, 
       0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 
       0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x5, 0x1a, 0xdc, 0xa, 0x1a, 0x3, 
       0x1b, 0x5, 0x1b, 0xdf, 0xa, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x5, 0x1b, 
       0xe3, 0xa, 0x1b, 0x3, 0x1b, 0x5, 0x1b, 0xe6, 0xa, 0x1b, 0x3, 0x1b, 
       0x5, 0x1b, 0xe9, 0xa, 0x1b, 0x3, 0x1b, 0x5, 0x1b, 0xec, 0xa, 0x1b, 
       0x3, 0x1b, 0x3, 0x1b, 0x5, 0x1b, 0xf0, 0xa, 0x1b, 0x3, 0x1b, 0x5, 
       0x1b, 0xf3, 0xa, 0x1b, 0x3, 0x1b, 0x5, 0x1b, 0xf6, 0xa, 0x1b, 0x3, 
       0x1b, 0x3, 0x1b, 0x5, 0x1b, 0xfa, 0xa, 0x1b, 0x3, 0x1b, 0x5, 0x1b, 
       0xfd, 0xa, 0x1b, 0x3, 0x1b, 0x5, 0x1b, 0x100, 0xa, 0x1b, 0x3, 0x1b, 
       0x3, 0x1b, 0x5, 0x1b, 0x104, 0xa, 0x1b, 0x3, 0x1b, 0x5, 0x1b, 0x107, 
       0xa, 0x1b, 0x5, 0x1b, 0x109, 0xa, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x5, 
       0x1b, 0x10d, 0xa, 0x1b, 0x3, 0x1b, 0x5, 0x1b, 0x110, 0xa, 0x1b, 0x3, 
       0x1b, 0x5, 0x1b, 0x113, 0xa, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x5, 0x1b, 
       0x117, 0xa, 0x1b, 0x3, 0x1b, 0x5, 0x1b, 0x11a, 0xa, 0x1b, 0x3, 0x1b, 
       0x5, 0x1b, 0x11d, 0xa, 0x1b, 0x5, 0x1b, 0x11f, 0xa, 0x1b, 0x3, 0x1c, 
       0x5, 0x1c, 0x122, 0xa, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x3, 
       0x1c, 0x3, 0x1d, 0x5, 0x1d, 0x129, 0xa, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 
       0x7, 0x1d, 0x12d, 0xa, 0x1d, 0xc, 0x1d, 0xe, 0x1d, 0x130, 0xb, 0x1d, 
       0x3, 0x1e, 0x5, 0x1e, 0x133, 0xa, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x7, 
       0x1e, 0x137, 0xa, 0x1e, 0xc, 0x1e, 0xe, 0x1e, 0x13a, 0xb, 0x1e, 0x3, 
       0x1f, 0x3, 0x1f, 0x3, 0x20, 0x3, 0x20, 0x3, 0x21, 0x3, 0x21, 0x3, 
       0x22, 0x3, 0x22, 0x3, 0x22, 0x2, 0x2, 0x23, 0x2, 0x4, 0x6, 0x8, 0xa, 
       0xc, 0xe, 0x10, 0x12, 0x14, 0x16, 0x18, 0x1a, 0x1c, 0x1e, 0x20, 0x22, 
       0x24, 0x26, 0x28, 0x2a, 0x2c, 0x2e, 0x30, 0x32, 0x34, 0x36, 0x38, 
       0x3a, 0x3c, 0x3e, 0x40, 0x42, 0x2, 0x7, 0x3, 0x2, 0x35, 0x36, 0x4, 
       0x2, 0x15, 0x15, 0x19, 0x19, 0x4, 0x2, 0x1f, 0x1f, 0x2b, 0x2b, 0x4, 
       0x2, 0xb, 0xf, 0x18, 0x18, 0x5, 0x2, 0x8, 0x8, 0xa, 0x25, 0x28, 0x34, 
       0x2, 0x15a, 0x2, 0x44, 0x3, 0x2, 0x2, 0x2, 0x4, 0x4c, 0x3, 0x2, 0x2, 
       0x2, 0x6, 0x55, 0x3, 0x2, 0x2, 0x2, 0x8, 0x5d, 0x3, 0x2, 0x2, 0x2, 
       0xa, 0x5f, 0x3, 0x2, 0x2, 0x2, 0xc, 0x61, 0x3, 0x2, 0x2, 0x2, 0xe, 
       0x6a, 0x3, 0x2, 0x2, 0x2, 0x10, 0x6c, 0x3, 0x2, 0x2, 0x2, 0x12, 0x6e, 
       0x3, 0x2, 0x2, 0x2, 0x14, 0x72, 0x3, 0x2, 0x2, 0x2, 0x16, 0x7f, 0x3, 
       0x2, 0x2, 0x2, 0x18, 0x89, 0x3, 0x2, 0x2, 0x2, 0x1a, 0x8b, 0x3, 0x2, 
       0x2, 0x2, 0x1c, 0x92, 0x3, 0x2, 0x2, 0x2, 0x1e, 0x9f, 0x3, 0x2, 0x2, 
       0x2, 0x20, 0xa7, 0x3, 0x2, 0x2, 0x2, 0x22, 0xa9, 0x3, 0x2, 0x2, 0x2, 
       0x24, 0xb1, 0x3, 0x2, 0x2, 0x2, 0x26, 0xb5, 0x3, 0x2, 0x2, 0x2, 0x28, 
       0xbc, 0x3, 0x2, 0x2, 0x2, 0x2a, 0xc0, 0x3, 0x2, 0x2, 0x2, 0x2c, 0xc7, 
       0x3, 0x2, 0x2, 0x2, 0x2e, 0xcb, 0x3, 0x2, 0x2, 0x2, 0x30, 0xce, 0x3, 
       0x2, 0x2, 0x2, 0x32, 0xdb, 0x3, 0x2, 0x2, 0x2, 0x34, 0x11e, 0x3, 
       0x2, 0x2, 0x2, 0x36, 0x121, 0x3, 0x2, 0x2, 0x2, 0x38, 0x128, 0x3, 
       0x2, 0x2, 0x2, 0x3a, 0x132, 0x3, 0x2, 0x2, 0x2, 0x3c, 0x13b, 0x3, 
       0x2, 0x2, 0x2, 0x3e, 0x13d, 0x3, 0x2, 0x2, 0x2, 0x40, 0x13f, 0x3, 
       0x2, 0x2, 0x2, 0x42, 0x141, 0x3, 0x2, 0x2, 0x2, 0x44, 0x45, 0x5, 
       0x4, 0x3, 0x2, 0x45, 0x46, 0x7, 0x2, 0x2, 0x3, 0x46, 0x3, 0x3, 0x2, 
       0x2, 0x2, 0x47, 0x4d, 0x5, 0x6, 0x4, 0x2, 0x48, 0x49, 0x5, 0x6, 0x4, 
       0x2, 0x49, 0x4a, 0x5, 0x4, 0x3, 0x2, 0x4a, 0x4d, 0x3, 0x2, 0x2, 0x2, 
       0x4b, 0x4d, 0x3, 0x2, 0x2, 0x2, 0x4c, 0x47, 0x3, 0x2, 0x2, 0x2, 0x4c, 
       0x48, 0x3, 0x2, 0x2, 0x2, 0x4c, 0x4b, 0x3, 0x2, 0x2, 0x2, 0x4d, 0x5, 
       0x3, 0x2, 0x2, 0x2, 0x4e, 0x56, 0x5, 0xa, 0x6, 0x2, 0x4f, 0x56, 0x5, 
       0xc, 0x7, 0x2, 0x50, 0x56, 0x5, 0x12, 0xa, 0x2, 0x51, 0x56, 0x5, 
       0x24, 0x13, 0x2, 0x52, 0x56, 0x5, 0x26, 0x14, 0x2, 0x53, 0x56, 0x5, 
       0x8, 0x5, 0x2, 0x54, 0x56, 0x5, 0x42, 0x22, 0x2, 0x55, 0x4e, 0x3, 
       0x2, 0x2, 0x2, 0x55, 0x4f, 0x3, 0x2, 0x2, 0x2, 0x55, 0x50, 0x3, 0x2, 
       0x2, 0x2, 0x55, 0x51, 0x3, 0x2, 0x2, 0x2, 0x55, 0x52, 0x3, 0x2, 0x2, 
       0x2, 0x55, 0x53, 0x3, 0x2, 0x2, 0x2, 0x55, 0x54, 0x3, 0x2, 0x2, 0x2, 
       0x56, 0x7, 0x3, 0x2, 0x2, 0x2, 0x57, 0x58, 0x7, 0x26, 0x2, 0x2, 0x58, 
       0x5e, 0x7, 0x27, 0x2, 0x2, 0x59, 0x5a, 0x7, 0x26, 0x2, 0x2, 0x5a, 
       0x5b, 0x5, 0x4, 0x3, 0x2, 0x5b, 0x5c, 0x7, 0x27, 0x2, 0x2, 0x5c, 
       0x5e, 0x3, 0x2, 0x2, 0x2, 0x5d, 0x57, 0x3, 0x2, 0x2, 0x2, 0x5d, 0x59, 
       0x3, 0x2, 0x2, 0x2, 0x5e, 0x9, 0x3, 0x2, 0x2, 0x2, 0x5f, 0x60, 0x9, 
       0x2, 0x2, 0x2, 0x60, 0xb, 0x3, 0x2, 0x2, 0x2, 0x61, 0x62, 0x7, 0x3, 
       0x2, 0x2, 0x62, 0x63, 0x5, 0xe, 0x8, 0x2, 0x63, 0x64, 0x7, 0x1e, 
       0x2, 0x2, 0x64, 0xd, 0x3, 0x2, 0x2, 0x2, 0x65, 0x6b, 0x5, 0x10, 0x9, 
       0x2, 0x66, 0x67, 0x5, 0x10, 0x9, 0x2, 0x67, 0x68, 0x7, 0x23, 0x2, 
       0x2, 0x68, 0x69, 0x5, 0xe, 0x8, 0x2, 0x69, 0x6b, 0x3, 0x2, 0x2, 0x2, 
       0x6a, 0x65, 0x3, 0x2, 0x2, 0x2, 0x6a, 0x66, 0x3, 0x2, 0x2, 0x2, 0x6b, 
       0xf, 0x3, 0x2, 0x2, 0x2, 0x6c, 0x6d, 0x7, 0x34, 0x2, 0x2, 0x6d, 0x11, 
       0x3, 0x2, 0x2, 0x2, 0x6e, 0x6f, 0x7, 0x4, 0x2, 0x2, 0x6f, 0x70, 0x5, 
       0x14, 0xb, 0x2, 0x70, 0x71, 0x7, 0x1e, 0x2, 0x2, 0x71, 0x13, 0x3, 
       0x2, 0x2, 0x2, 0x72, 0x74, 0x5, 0x16, 0xc, 0x2, 0x73, 0x75, 0x9, 
       0x3, 0x2, 0x2, 0x74, 0x73, 0x3, 0x2, 0x2, 0x2, 0x74, 0x75, 0x3, 0x2, 
       0x2, 0x2, 0x75, 0x76, 0x3, 0x2, 0x2, 0x2, 0x76, 0x7b, 0x5, 0x3a, 
       0x1e, 0x2, 0x77, 0x78, 0x7, 0x23, 0x2, 0x2, 0x78, 0x7a, 0x5, 0x14, 
       0xb, 0x2, 0x79, 0x77, 0x3, 0x2, 0x2, 0x2, 0x7a, 0x7d, 0x3, 0x2, 0x2, 
       0x2, 0x7b, 0x79, 0x3, 0x2, 0x2, 0x2, 0x7b, 0x7c, 0x3, 0x2, 0x2, 0x2, 
       0x7c, 0x15, 0x3, 0x2, 0x2, 0x2, 0x7d, 0x7b, 0x3, 0x2, 0x2, 0x2, 0x7e, 
       0x80, 0x5, 0x1a, 0xe, 0x2, 0x7f, 0x7e, 0x3, 0x2, 0x2, 0x2, 0x7f, 
       0x80, 0x3, 0x2, 0x2, 0x2, 0x80, 0x85, 0x3, 0x2, 0x2, 0x2, 0x81, 0x86, 
       0x5, 0x3c, 0x1f, 0x2, 0x82, 0x83, 0x5, 0x3c, 0x1f, 0x2, 0x83, 0x84, 
       0x7, 0x30, 0x2, 0x2, 0x84, 0x86, 0x3, 0x2, 0x2, 0x2, 0x85, 0x81, 
       0x3, 0x2, 0x2, 0x2, 0x85, 0x82, 0x3, 0x2, 0x2, 0x2, 0x86, 0x87, 0x3, 
       0x2, 0x2, 0x2, 0x87, 0x88, 0x9, 0x4, 0x2, 0x2, 0x88, 0x17, 0x3, 0x2, 
       0x2, 0x2, 0x89, 0x8a, 0x9, 0x5, 0x2, 0x2, 0x8a, 0x19, 0x3, 0x2, 0x2, 
       0x2, 0x8b, 0x8f, 0x5, 0x18, 0xd, 0x2, 0x8c, 0x8e, 0x5, 0x1a, 0xe, 
       0x2, 0x8d, 0x8c, 0x3, 0x2, 0x2, 0x2, 0x8e, 0x91, 0x3, 0x2, 0x2, 0x2, 
       0x8f, 0x8d, 0x3, 0x2, 0x2, 0x2, 0x8f, 0x90, 0x3, 0x2, 0x2, 0x2, 0x90, 
       0x1b, 0x3, 0x2, 0x2, 0x2, 0x91, 0x8f, 0x3, 0x2, 0x2, 0x2, 0x92, 0x94, 
       0x5, 0x1e, 0x10, 0x2, 0x93, 0x95, 0x5, 0x3c, 0x1f, 0x2, 0x94, 0x93, 
       0x3, 0x2, 0x2, 0x2, 0x94, 0x95, 0x3, 0x2, 0x2, 0x2, 0x95, 0x96, 0x3, 
       0x2, 0x2, 0x2, 0x96, 0x97, 0x5, 0x20, 0x11, 0x2, 0x97, 0x1d, 0x3, 
       0x2, 0x2, 0x2, 0x98, 0xa0, 0x5, 0x3c, 0x1f, 0x2, 0x99, 0x9a, 0x5, 
       0x3c, 0x1f, 0x2, 0x9a, 0x9b, 0x7, 0x20, 0x2, 0x2, 0x9b, 0xa0, 0x3, 
       0x2, 0x2, 0x2, 0x9c, 0x9d, 0x5, 0x3c, 0x1f, 0x2, 0x9d, 0x9e, 0x7, 
       0x22, 0x2, 0x2, 0x9e, 0xa0, 0x3, 0x2, 0x2, 0x2, 0x9f, 0x98, 0x3, 
       0x2, 0x2, 0x2, 0x9f, 0x99, 0x3, 0x2, 0x2, 0x2, 0x9f, 0x9c, 0x3, 0x2, 
       0x2, 0x2, 0xa0, 0x1f, 0x3, 0x2, 0x2, 0x2, 0xa1, 0xa2, 0x7, 0x28, 
       0x2, 0x2, 0xa2, 0xa8, 0x7, 0x29, 0x2, 0x2, 0xa3, 0xa4, 0x7, 0x28, 
       0x2, 0x2, 0xa4, 0xa5, 0x5, 0x22, 0x12, 0x2, 0xa5, 0xa6, 0x7, 0x29, 
       0x2, 0x2, 0xa6, 0xa8, 0x3, 0x2, 0x2, 0x2, 0xa7, 0xa1, 0x3, 0x2, 0x2, 
       0x2, 0xa7, 0xa3, 0x3, 0x2, 0x2, 0x2, 0xa8, 0x21, 0x3, 0x2, 0x2, 0x2, 
       0xa9, 0xae, 0x5, 0x34, 0x1b, 0x2, 0xaa, 0xab, 0x7, 0x23, 0x2, 0x2, 
       0xab, 0xad, 0x5, 0x22, 0x12, 0x2, 0xac, 0xaa, 0x3, 0x2, 0x2, 0x2, 
       0xad, 0xb0, 0x3, 0x2, 0x2, 0x2, 0xae, 0xac, 0x3, 0x2, 0x2, 0x2, 0xae, 
       0xaf, 0x3, 0x2, 0x2, 0x2, 0xaf, 0x23, 0x3, 0x2, 0x2, 0x2, 0xb0, 0xae, 
       0x3, 0x2, 0x2, 0x2, 0xb1, 0xb2, 0x7, 0x9, 0x2, 0x2, 0xb2, 0xb3, 0x5, 
       0x3a, 0x1e, 0x2, 0xb3, 0xb4, 0x7, 0x1e, 0x2, 0x2, 0xb4, 0x25, 0x3, 
       0x2, 0x2, 0x2, 0xb5, 0xb7, 0x5, 0x28, 0x15, 0x2, 0xb6, 0xb8, 0x5, 
       0x2a, 0x16, 0x2, 0xb7, 0xb6, 0x3, 0x2, 0x2, 0x2, 0xb7, 0xb8, 0x3, 
       0x2, 0x2, 0x2, 0xb8, 0xba, 0x3, 0x2, 0x2, 0x2, 0xb9, 0xbb, 0x5, 0x2e, 
       0x18, 0x2, 0xba, 0xb9, 0x3, 0x2, 0x2, 0x2, 0xba, 0xbb, 0x3, 0x2, 
       0x2, 0x2, 0xbb, 0x27, 0x3, 0x2, 0x2, 0x2, 0xbc, 0xbd, 0x7, 0x5, 0x2, 
       0x2, 0xbd, 0xbe, 0x5, 0x30, 0x19, 0x2, 0xbe, 0xbf, 0x5, 0x32, 0x1a, 
       0x2, 0xbf, 0x29, 0x3, 0x2, 0x2, 0x2, 0xc0, 0xc4, 0x5, 0x2c, 0x17, 
       0x2, 0xc1, 0xc3, 0x5, 0x2a, 0x16, 0x2, 0xc2, 0xc1, 0x3, 0x2, 0x2, 
       0x2, 0xc3, 0xc6, 0x3, 0x2, 0x2, 0x2, 0xc4, 0xc2, 0x3, 0x2, 0x2, 0x2, 
       0xc4, 0xc5, 0x3, 0x2, 0x2, 0x2, 0xc5, 0x2b, 0x3, 0x2, 0x2, 0x2, 0xc6, 
       0xc4, 0x3, 0x2, 0x2, 0x2, 0xc7, 0xc8, 0x7, 0x6, 0x2, 0x2, 0xc8, 0xc9, 
       0x5, 0x30, 0x19, 0x2, 0xc9, 0xca, 0x5, 0x32, 0x1a, 0x2, 0xca, 0x2d, 
       0x3, 0x2, 0x2, 0x2, 0xcb, 0xcc, 0x7, 0x7, 0x2, 0x2, 0xcc, 0xcd, 0x5, 
       0x32, 0x1a, 0x2, 0xcd, 0x2f, 0x3, 0x2, 0x2, 0x2, 0xce, 0xcf, 0x5, 
       0x3a, 0x1e, 0x2, 0xcf, 0x31, 0x3, 0x2, 0x2, 0x2, 0xd0, 0xd1, 0x7, 
       0x26, 0x2, 0x2, 0xd1, 0xdc, 0x7, 0x27, 0x2, 0x2, 0xd2, 0xd3, 0x7, 
       0x26, 0x2, 0x2, 0xd3, 0xd4, 0x5, 0x4, 0x3, 0x2, 0xd4, 0xd5, 0x7, 
       0x27, 0x2, 0x2, 0xd5, 0xdc, 0x3, 0x2, 0x2, 0x2, 0xd6, 0xdc, 0x5, 
       0x26, 0x14, 0x2, 0xd7, 0xdc, 0x5, 0x24, 0x13, 0x2, 0xd8, 0xd9, 0x5, 
       0x1c, 0xf, 0x2, 0xd9, 0xda, 0x7, 0x1e, 0x2, 0x2, 0xda, 0xdc, 0x3, 
       0x2, 0x2, 0x2, 0xdb, 0xd0, 0x3, 0x2, 0x2, 0x2, 0xdb, 0xd2, 0x3, 0x2, 
       0x2, 0x2, 0xdb, 0xd6, 0x3, 0x2, 0x2, 0x2, 0xdb, 0xd7, 0x3, 0x2, 0x2, 
       0x2, 0xdb, 0xd8, 0x3, 0x2, 0x2, 0x2, 0xdc, 0x33, 0x3, 0x2, 0x2, 0x2, 
       0xdd, 0xdf, 0x5, 0x3e, 0x20, 0x2, 0xde, 0xdd, 0x3, 0x2, 0x2, 0x2, 
       0xde, 0xdf, 0x3, 0x2, 0x2, 0x2, 0xdf, 0xe0, 0x3, 0x2, 0x2, 0x2, 0xe0, 
       0xe2, 0x5, 0x3c, 0x1f, 0x2, 0xe1, 0xe3, 0x5, 0x40, 0x21, 0x2, 0xe2, 
       0xe1, 0x3, 0x2, 0x2, 0x2, 0xe2, 0xe3, 0x3, 0x2, 0x2, 0x2, 0xe3, 0xe5, 
       0x3, 0x2, 0x2, 0x2, 0xe4, 0xe6, 0x7, 0x30, 0x2, 0x2, 0xe5, 0xe4, 
       0x3, 0x2, 0x2, 0x2, 0xe5, 0xe6, 0x3, 0x2, 0x2, 0x2, 0xe6, 0xe8, 0x3, 
       0x2, 0x2, 0x2, 0xe7, 0xe9, 0x7, 0x2a, 0x2, 0x2, 0xe8, 0xe7, 0x3, 
       0x2, 0x2, 0x2, 0xe8, 0xe9, 0x3, 0x2, 0x2, 0x2, 0xe9, 0xeb, 0x3, 0x2, 
       0x2, 0x2, 0xea, 0xec, 0x7, 0x2b, 0x2, 0x2, 0xeb, 0xea, 0x3, 0x2, 
       0x2, 0x2, 0xeb, 0xec, 0x3, 0x2, 0x2, 0x2, 0xec, 0x109, 0x3, 0x2, 
       0x2, 0x2, 0xed, 0xef, 0x7, 0x32, 0x2, 0x2, 0xee, 0xf0, 0x7, 0x30, 
       0x2, 0x2, 0xef, 0xee, 0x3, 0x2, 0x2, 0x2, 0xef, 0xf0, 0x3, 0x2, 0x2, 
       0x2, 0xf0, 0xf2, 0x3, 0x2, 0x2, 0x2, 0xf1, 0xf3, 0x7, 0x2a, 0x2, 
       0x2, 0xf2, 0xf1, 0x3, 0x2, 0x2, 0x2, 0xf2, 0xf3, 0x3, 0x2, 0x2, 0x2, 
       0xf3, 0xf5, 0x3, 0x2, 0x2, 0x2, 0xf4, 0xf6, 0x7, 0x2b, 0x2, 0x2, 
       0xf5, 0xf4, 0x3, 0x2, 0x2, 0x2, 0xf5, 0xf6, 0x3, 0x2, 0x2, 0x2, 0xf6, 
       0x109, 0x3, 0x2, 0x2, 0x2, 0xf7, 0xf9, 0x7, 0x33, 0x2, 0x2, 0xf8, 
       0xfa, 0x7, 0x30, 0x2, 0x2, 0xf9, 0xf8, 0x3, 0x2, 0x2, 0x2, 0xf9, 
       0xfa, 0x3, 0x2, 0x2, 0x2, 0xfa, 0xfc, 0x3, 0x2, 0x2, 0x2, 0xfb, 0xfd, 
       0x7, 0x2a, 0x2, 0x2, 0xfc, 0xfb, 0x3, 0x2, 0x2, 0x2, 0xfc, 0xfd, 
       0x3, 0x2, 0x2, 0x2, 0xfd, 0xff, 0x3, 0x2, 0x2, 0x2, 0xfe, 0x100, 
       0x7, 0x2b, 0x2, 0x2, 0xff, 0xfe, 0x3, 0x2, 0x2, 0x2, 0xff, 0x100, 
       0x3, 0x2, 0x2, 0x2, 0x100, 0x109, 0x3, 0x2, 0x2, 0x2, 0x101, 0x103, 
       0x7, 0x34, 0x2, 0x2, 0x102, 0x104, 0x7, 0x2a, 0x2, 0x2, 0x103, 0x102, 
       0x3, 0x2, 0x2, 0x2, 0x103, 0x104, 0x3, 0x2, 0x2, 0x2, 0x104, 0x106, 
       0x3, 0x2, 0x2, 0x2, 0x105, 0x107, 0x7, 0x2b, 0x2, 0x2, 0x106, 0x105, 
       0x3, 0x2, 0x2, 0x2, 0x106, 0x107, 0x3, 0x2, 0x2, 0x2, 0x107, 0x109, 
       0x3, 0x2, 0x2, 0x2, 0x108, 0xde, 0x3, 0x2, 0x2, 0x2, 0x108, 0xed, 
       0x3, 0x2, 0x2, 0x2, 0x108, 0xf7, 0x3, 0x2, 0x2, 0x2, 0x108, 0x101, 
       0x3, 0x2, 0x2, 0x2, 0x109, 0x11f, 0x3, 0x2, 0x2, 0x2, 0x10a, 0x10c, 
       0x5, 0x1c, 0xf, 0x2, 0x10b, 0x10d, 0x7, 0x30, 0x2, 0x2, 0x10c, 0x10b, 
       0x3, 0x2, 0x2, 0x2, 0x10c, 0x10d, 0x3, 0x2, 0x2, 0x2, 0x10d, 0x10f, 
       0x3, 0x2, 0x2, 0x2, 0x10e, 0x110, 0x7, 0x2a, 0x2, 0x2, 0x10f, 0x10e, 
       0x3, 0x2, 0x2, 0x2, 0x10f, 0x110, 0x3, 0x2, 0x2, 0x2, 0x110, 0x112, 
       0x3, 0x2, 0x2, 0x2, 0x111, 0x113, 0x7, 0x2b, 0x2, 0x2, 0x112, 0x111, 
       0x3, 0x2, 0x2, 0x2, 0x112, 0x113, 0x3, 0x2, 0x2, 0x2, 0x113, 0x11f, 
       0x3, 0x2, 0x2, 0x2, 0x114, 0x116, 0x5, 0x36, 0x1c, 0x2, 0x115, 0x117, 
       0x7, 0x30, 0x2, 0x2, 0x116, 0x115, 0x3, 0x2, 0x2, 0x2, 0x116, 0x117, 
       0x3, 0x2, 0x2, 0x2, 0x117, 0x119, 0x3, 0x2, 0x2, 0x2, 0x118, 0x11a, 
       0x7, 0x2a, 0x2, 0x2, 0x119, 0x118, 0x3, 0x2, 0x2, 0x2, 0x119, 0x11a, 
       0x3, 0x2, 0x2, 0x2, 0x11a, 0x11c, 0x3, 0x2, 0x2, 0x2, 0x11b, 0x11d, 
       0x7, 0x2b, 0x2, 0x2, 0x11c, 0x11b, 0x3, 0x2, 0x2, 0x2, 0x11c, 0x11d, 
       0x3, 0x2, 0x2, 0x2, 0x11d, 0x11f, 0x3, 0x2, 0x2, 0x2, 0x11e, 0x108, 
       0x3, 0x2, 0x2, 0x2, 0x11e, 0x10a, 0x3, 0x2, 0x2, 0x2, 0x11e, 0x114, 
       0x3, 0x2, 0x2, 0x2, 0x11f, 0x35, 0x3, 0x2, 0x2, 0x2, 0x120, 0x122, 
       0x7, 0x2c, 0x2, 0x2, 0x121, 0x120, 0x3, 0x2, 0x2, 0x2, 0x121, 0x122, 
       0x3, 0x2, 0x2, 0x2, 0x122, 0x123, 0x3, 0x2, 0x2, 0x2, 0x123, 0x124, 
       0x7, 0x28, 0x2, 0x2, 0x124, 0x125, 0x5, 0x38, 0x1d, 0x2, 0x125, 0x126, 
       0x7, 0x29, 0x2, 0x2, 0x126, 0x37, 0x3, 0x2, 0x2, 0x2, 0x127, 0x129, 
       0x7, 0x2c, 0x2, 0x2, 0x128, 0x127, 0x3, 0x2, 0x2, 0x2, 0x128, 0x129, 
       0x3, 0x2, 0x2, 0x2, 0x129, 0x12a, 0x3, 0x2, 0x2, 0x2, 0x12a, 0x12e, 
       0x5, 0x34, 0x1b, 0x2, 0x12b, 0x12d, 0x5, 0x38, 0x1d, 0x2, 0x12c, 
       0x12b, 0x3, 0x2, 0x2, 0x2, 0x12d, 0x130, 0x3, 0x2, 0x2, 0x2, 0x12e, 
       0x12c, 0x3, 0x2, 0x2, 0x2, 0x12e, 0x12f, 0x3, 0x2, 0x2, 0x2, 0x12f, 
       0x39, 0x3, 0x2, 0x2, 0x2, 0x130, 0x12e, 0x3, 0x2, 0x2, 0x2, 0x131, 
       0x133, 0x7, 0x2c, 0x2, 0x2, 0x132, 0x131, 0x3, 0x2, 0x2, 0x2, 0x132, 
       0x133, 0x3, 0x2, 0x2, 0x2, 0x133, 0x134, 0x3, 0x2, 0x2, 0x2, 0x134, 
       0x138, 0x5, 0x34, 0x1b, 0x2, 0x135, 0x137, 0x5, 0x3a, 0x1e, 0x2, 
       0x136, 0x135, 0x3, 0x2, 0x2, 0x2, 0x137, 0x13a, 0x3, 0x2, 0x2, 0x2, 
       0x138, 0x136, 0x3, 0x2, 0x2, 0x2, 0x138, 0x139, 0x3, 0x2, 0x2, 0x2, 
       0x139, 0x3b, 0x3, 0x2, 0x2, 0x2, 0x13a, 0x138, 0x3, 0x2, 0x2, 0x2, 
       0x13b, 0x13c, 0x7, 0x2e, 0x2, 0x2, 0x13c, 0x3d, 0x3, 0x2, 0x2, 0x2, 
       0x13d, 0x13e, 0x7, 0x2d, 0x2, 0x2, 0x13e, 0x3f, 0x3, 0x2, 0x2, 0x2, 
       0x13f, 0x140, 0x7, 0x2d, 0x2, 0x2, 0x140, 0x41, 0x3, 0x2, 0x2, 0x2, 
       0x141, 0x142, 0x9, 0x6, 0x2, 0x2, 0x142, 0x43, 0x3, 0x2, 0x2, 0x2, 
       0x2d, 0x4c, 0x55, 0x5d, 0x6a, 0x74, 0x7b, 0x7f, 0x85, 0x8f, 0x94, 
       0x9f, 0xa7, 0xae, 0xb7, 0xba, 0xc4, 0xdb, 0xde, 0xe2, 0xe5, 0xe8, 
       0xeb, 0xef, 0xf2, 0xf5, 0xf9, 0xfc, 0xff, 0x103, 0x106, 0x108, 0x10c, 
       0x10f, 0x112, 0x116, 0x119, 0x11c, 0x11e, 0x121, 0x128, 0x12e, 0x132, 
       0x138, 
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
