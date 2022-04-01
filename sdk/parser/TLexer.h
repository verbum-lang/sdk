
// Generated from ./TLexer.g4 by ANTLR 4.9.2

#pragma once


#include "antlr4-runtime.h"


	#ifndef _WIN32
	#pragma GCC diagnostic ignored "-Wunused-parameter"
	#endif


namespace verbum {


class  TLexer : public antlr4::Lexer {
public:
  enum {
    Use = 1, Var = 2, If = 3, Elif = 4, Else = 5, For = 6, Ret = 7, Function = 8, 
    Pub = 9, Pro = 10, Priv = 11, Static = 12, Final = 13, Interface = 14, 
    Abstract = 15, Extends = 16, ArrowRight = 17, End = 18, Attr = 19, Point = 20, 
    TwoPoint = 21, TwoTwoPoint = 22, Separator = 23, OpenArIndex = 24, CloseArIndex = 25, 
    OpenBlock = 26, CloseBlock = 27, OpenOp = 28, CloseOp = 29, ArithmeticOperator = 30, 
    AssignmentOperator = 31, Not = 32, IncDecOperators = 33, Identifier = 34, 
    IDPrefix = 35, TypeSpec = 36, String = 37, Integer = 38, Float = 39, 
    Whitespace = 40, Newline = 41, Words = 42, BlockComment = 43, LineComment = 44
  };

  explicit TLexer(antlr4::CharStream *input);
  ~TLexer();

  virtual std::string getGrammarFileName() const override;
  virtual const std::vector<std::string>& getRuleNames() const override;

  virtual const std::vector<std::string>& getChannelNames() const override;
  virtual const std::vector<std::string>& getModeNames() const override;
  virtual const std::vector<std::string>& getTokenNames() const override; // deprecated, use vocabulary instead
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;

  virtual const std::vector<uint16_t> getSerializedATN() const override;
  virtual const antlr4::atn::ATN& getATN() const override;

private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;
  static std::vector<std::string> _channelNames;
  static std::vector<std::string> _modeNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  // Individual action functions triggered by action() above.

  // Individual semantic predicate functions triggered by sempred() above.

  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

}  // namespace verbum
