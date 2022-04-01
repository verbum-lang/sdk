
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
    Use = 1, Var = 2, If = 3, Elif = 4, Else = 5, For = 6, Ret = 7, End = 8, 
    Attr = 9, Point = 10, TwoPoint = 11, TwoTwoPoint = 12, Separator = 13, 
    OpenArIndex = 14, CloseArIndex = 15, OpenBlock = 16, CloseBlock = 17, 
    OpenOp = 18, CloseOp = 19, ArithmeticOperator = 20, AssignmentOperator = 21, 
    Not = 22, IncDecOperators = 23, Identifier = 24, IDPrefix = 25, TypeSpec = 26, 
    String = 27, Integer = 28, Float = 29, Whitespace = 30, Newline = 31, 
    Words = 32, BlockComment = 33, LineComment = 34
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
