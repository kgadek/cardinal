/* The following code was generated by JFlex 1.4.3 on 15.09.12 00:17 */


package parser;

import java_cup.runtime.*;
import java.io.IOException;
import java.util.Stack;

import parser.sym;
import static parser.sym.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 15.09.12 00:17 from the specification file
 * <tt>C:/Users/Dominika/Documents/eclipse_workspace/TK/Python_Interpreter/src/cup_and_lex/Lekser.lex</tt>
 */
public class LekserLex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int normal_state = 4;
  public static final int YYINITIAL = 0;
  public static final int indent_state = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\61\1\2\1\0\1\3\1\1\22\0\1\11\1\36\1\0"+
    "\1\13\1\0\1\25\2\0\1\26\1\27\1\23\1\21\1\31\1\22"+
    "\1\5\1\24\12\4\1\46\1\47\1\33\1\35\1\34\2\0\4\12"+
    "\1\7\1\42\15\12\1\41\6\12\1\52\1\0\1\53\1\0\1\12"+
    "\1\0\1\37\1\57\1\60\1\40\1\6\1\45\1\12\1\51\1\16"+
    "\2\12\1\43\1\56\1\17\1\32\1\14\1\12\1\15\1\44\1\20"+
    "\1\30\1\12\1\50\3\12\1\54\1\10\1\55\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\2\3\1\4\1\5\1\6\1\3"+
    "\1\7\2\10\1\11\1\12\1\13\6\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\14\1\25"+
    "\1\26\1\27\1\1\5\14\1\30\1\31\1\14\1\32"+
    "\1\33\1\34\1\35\1\14\1\36\1\0\5\14\1\37"+
    "\1\40\1\14\1\41\1\42\1\43\1\44\1\45\1\46"+
    "\7\14\1\0\5\14\1\47\1\50\1\51\5\14\1\36"+
    "\1\52\1\14\1\53\2\14\1\54\4\14\1\55\1\14"+
    "\1\56\1\57\1\14\1\60\1\61\1\62\1\63";

  private static int [] zzUnpackAction() {
    int [] result = new int[106];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\62\0\144\0\226\0\310\0\226\0\372\0\226"+
    "\0\226\0\226\0\310\0\226\0\u012c\0\226\0\226\0\u015e"+
    "\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc\0\226"+
    "\0\226\0\u02ee\0\226\0\226\0\226\0\226\0\226\0\u0320"+
    "\0\u0352\0\u0384\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0"+
    "\0\u04e2\0\226\0\226\0\u0514\0\226\0\226\0\226\0\226"+
    "\0\u0546\0\u0578\0\u05aa\0\u05dc\0\u060e\0\u0640\0\u0672\0\u06a4"+
    "\0\u01f4\0\u01f4\0\u06d6\0\226\0\u01f4\0\226\0\226\0\226"+
    "\0\226\0\u0708\0\u073a\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834"+
    "\0\u0866\0\u0898\0\u08ca\0\u08fc\0\u092e\0\u0960\0\u01f4\0\u01f4"+
    "\0\u01f4\0\u0992\0\u09c4\0\u09f6\0\u0a28\0\u0a5a\0\u0866\0\u01f4"+
    "\0\u0a8c\0\u01f4\0\u0abe\0\u0af0\0\u01f4\0\u0b22\0\u0b54\0\u0b86"+
    "\0\u0bb8\0\u01f4\0\u0bea\0\u01f4\0\u01f4\0\u0c1c\0\u01f4\0\u01f4"+
    "\0\u01f4\0\u01f4";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[106];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\2\4\1\0\10\4\1\5\46\4\1\6\1\7\1\10"+
    "\1\11\5\6\1\12\1\6\1\13\45\6\1\14\1\4"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\4"+
    "\1\17\1\23\1\5\1\24\1\25\1\26\1\27\1\23"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\23"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
    "\1\47\1\50\1\51\2\23\1\52\1\53\1\54\1\23"+
    "\1\55\1\56\1\57\1\60\2\23\1\61\1\17\62\0"+
    "\2\5\1\0\57\5\2\0\1\10\61\0\1\16\63\0"+
    "\1\20\1\62\2\63\56\0\1\62\61\0\1\23\1\0"+
    "\2\23\2\0\1\23\1\0\5\23\7\0\1\23\1\0"+
    "\1\23\4\0\4\23\1\64\2\23\2\0\2\23\4\0"+
    "\3\23\5\0\1\23\1\0\2\23\2\0\1\23\1\0"+
    "\5\23\7\0\1\23\1\0\1\23\4\0\7\23\2\0"+
    "\2\23\4\0\3\23\5\0\1\23\1\0\2\23\2\0"+
    "\1\23\1\0\1\23\1\65\3\23\7\0\1\23\1\0"+
    "\1\23\4\0\1\66\6\23\2\0\2\23\4\0\3\23"+
    "\5\0\1\23\1\0\1\67\1\23\2\0\1\23\1\0"+
    "\5\23\7\0\1\23\1\0\1\23\4\0\7\23\2\0"+
    "\2\23\4\0\3\23\5\0\1\23\1\0\2\23\2\0"+
    "\1\23\1\0\3\23\1\70\1\23\7\0\1\23\1\0"+
    "\1\23\4\0\5\23\1\71\1\72\2\0\2\23\4\0"+
    "\3\23\5\0\1\23\1\0\2\23\2\0\1\23\1\0"+
    "\5\23\7\0\1\23\1\0\1\73\4\0\7\23\2\0"+
    "\2\23\4\0\3\23\24\0\1\74\42\0\1\23\1\0"+
    "\2\23\2\0\1\23\1\0\1\23\1\75\3\23\7\0"+
    "\1\23\1\0\1\23\4\0\7\23\2\0\2\23\4\0"+
    "\3\23\36\0\1\76\61\0\1\77\61\0\1\100\61\0"+
    "\1\101\30\0\1\23\1\0\2\23\2\0\1\23\1\0"+
    "\3\23\1\102\1\23\7\0\1\23\1\0\1\23\4\0"+
    "\7\23\2\0\2\23\4\0\3\23\5\0\1\23\1\0"+
    "\1\103\1\23\2\0\1\23\1\0\5\23\7\0\1\23"+
    "\1\0\1\23\4\0\7\23\2\0\2\23\4\0\3\23"+
    "\5\0\1\23\1\0\2\23\2\0\1\23\1\0\1\23"+
    "\1\104\3\23\7\0\1\23\1\0\1\23\4\0\7\23"+
    "\2\0\2\23\4\0\3\23\5\0\1\23\1\0\2\23"+
    "\2\0\1\23\1\0\5\23\7\0\1\23\1\0\1\23"+
    "\4\0\1\105\6\23\2\0\2\23\4\0\3\23\5\0"+
    "\1\23\1\0\2\23\2\0\1\23\1\0\5\23\7\0"+
    "\1\23\1\0\1\23\4\0\1\106\6\23\2\0\2\23"+
    "\4\0\3\23\5\0\1\23\1\0\2\23\2\0\1\23"+
    "\1\0\5\23\7\0\1\23\1\0\1\23\4\0\7\23"+
    "\2\0\1\23\1\107\4\0\3\23\5\0\1\23\1\0"+
    "\2\23\2\0\1\23\1\0\5\23\7\0\1\23\1\0"+
    "\1\23\4\0\4\23\1\110\2\23\2\0\2\23\4\0"+
    "\3\23\5\0\1\62\1\0\2\63\62\0\2\111\7\0"+
    "\2\111\43\0\1\23\1\0\2\23\2\0\1\23\1\0"+
    "\5\23\7\0\1\23\1\0\1\23\4\0\5\23\1\112"+
    "\1\23\2\0\2\23\4\0\3\23\5\0\1\23\1\0"+
    "\2\23\2\0\1\23\1\0\2\23\1\113\2\23\7\0"+
    "\1\23\1\0\1\23\4\0\7\23\2\0\2\23\4\0"+
    "\3\23\5\0\1\23\1\0\2\23\2\0\1\23\1\0"+
    "\5\23\7\0\1\23\1\0\1\23\4\0\5\23\1\114"+
    "\1\23\2\0\2\23\4\0\3\23\5\0\1\23\1\0"+
    "\2\23\2\0\1\23\1\0\4\23\1\115\7\0\1\23"+
    "\1\0\1\23\4\0\7\23\2\0\2\23\4\0\3\23"+
    "\5\0\1\23\1\0\2\23\2\0\1\23\1\0\1\116"+
    "\4\23\7\0\1\23\1\0\1\23\4\0\7\23\2\0"+
    "\2\23\4\0\3\23\5\0\1\23\1\0\2\23\2\0"+
    "\1\23\1\0\4\23\1\117\7\0\1\23\1\0\1\23"+
    "\4\0\7\23\2\0\2\23\4\0\3\23\5\0\1\23"+
    "\1\0\2\23\2\0\1\23\1\0\5\23\7\0\1\23"+
    "\1\0\1\23\4\0\1\23\1\120\5\23\2\0\2\23"+
    "\4\0\3\23\5\0\1\23\1\0\2\23\2\0\1\23"+
    "\1\0\5\23\7\0\1\23\1\0\1\23\4\0\6\23"+
    "\1\121\2\0\2\23\4\0\3\23\5\0\1\23\1\0"+
    "\2\23\2\0\1\23\1\0\5\23\7\0\1\122\1\0"+
    "\1\23\4\0\7\23\2\0\2\23\4\0\3\23\5\0"+
    "\1\23\1\0\2\23\2\0\1\23\1\0\5\23\7\0"+
    "\1\23\1\0\1\23\4\0\4\23\1\123\2\23\2\0"+
    "\2\23\4\0\3\23\5\0\1\23\1\0\2\23\2\0"+
    "\1\23\1\0\5\23\7\0\1\23\1\0\1\23\4\0"+
    "\7\23\2\0\2\23\4\0\1\124\2\23\5\0\1\23"+
    "\1\0\2\23\2\0\1\23\1\0\2\23\1\125\2\23"+
    "\7\0\1\23\1\0\1\23\4\0\7\23\2\0\2\23"+
    "\4\0\3\23\5\0\1\23\1\0\2\23\2\0\1\23"+
    "\1\0\5\23\7\0\1\23\1\0\1\23\4\0\1\126"+
    "\6\23\2\0\2\23\4\0\3\23\5\0\1\127\61\0"+
    "\1\23\1\0\1\130\1\23\2\0\1\23\1\0\5\23"+
    "\7\0\1\23\1\0\1\23\4\0\7\23\2\0\2\23"+
    "\4\0\3\23\5\0\1\23\1\0\2\23\2\0\1\23"+
    "\1\0\3\23\1\131\1\23\7\0\1\23\1\0\1\23"+
    "\4\0\7\23\2\0\2\23\4\0\3\23\5\0\1\23"+
    "\1\0\2\23\2\0\1\23\1\0\5\23\7\0\1\23"+
    "\1\0\1\23\4\0\5\23\1\132\1\23\2\0\2\23"+
    "\4\0\3\23\5\0\1\23\1\0\2\23\2\0\1\23"+
    "\1\0\5\23\7\0\1\133\1\0\1\23\4\0\7\23"+
    "\2\0\2\23\4\0\3\23\5\0\1\23\1\0\2\23"+
    "\2\0\1\23\1\0\5\23\7\0\1\134\1\0\1\23"+
    "\4\0\7\23\2\0\2\23\4\0\3\23\5\0\1\23"+
    "\1\0\1\135\1\23\2\0\1\23\1\0\5\23\7\0"+
    "\1\23\1\0\1\23\4\0\7\23\2\0\2\23\4\0"+
    "\3\23\5\0\1\23\1\0\2\23\2\0\1\23\1\0"+
    "\5\23\7\0\1\23\1\0\1\23\4\0\5\23\1\136"+
    "\1\23\2\0\2\23\4\0\3\23\5\0\1\23\1\0"+
    "\2\23\2\0\1\23\1\0\5\23\7\0\1\23\1\0"+
    "\1\23\4\0\7\23\2\0\2\23\4\0\1\23\1\137"+
    "\1\23\5\0\1\23\1\0\2\23\2\0\1\23\1\0"+
    "\5\23\7\0\1\23\1\0\1\23\4\0\4\23\1\140"+
    "\2\23\2\0\2\23\4\0\3\23\5\0\1\23\1\0"+
    "\2\23\2\0\1\23\1\0\5\23\7\0\1\23\1\0"+
    "\1\23\4\0\5\23\1\141\1\23\2\0\2\23\4\0"+
    "\3\23\5\0\1\23\1\0\2\23\2\0\1\23\1\0"+
    "\4\23\1\142\7\0\1\23\1\0\1\23\4\0\7\23"+
    "\2\0\2\23\4\0\3\23\5\0\1\23\1\0\2\23"+
    "\2\0\1\23\1\0\1\23\1\143\3\23\7\0\1\23"+
    "\1\0\1\23\4\0\7\23\2\0\2\23\4\0\3\23"+
    "\5\0\1\23\1\0\2\23\2\0\1\23\1\0\4\23"+
    "\1\144\7\0\1\23\1\0\1\23\4\0\7\23\2\0"+
    "\2\23\4\0\3\23\5\0\1\23\1\0\1\145\1\23"+
    "\2\0\1\23\1\0\5\23\7\0\1\23\1\0\1\23"+
    "\4\0\7\23\2\0\2\23\4\0\3\23\5\0\1\23"+
    "\1\0\2\23\2\0\1\23\1\0\5\23\7\0\1\23"+
    "\1\0\1\23\4\0\1\23\1\146\5\23\2\0\2\23"+
    "\4\0\3\23\5\0\1\23\1\0\1\147\1\23\2\0"+
    "\1\23\1\0\5\23\7\0\1\23\1\0\1\23\4\0"+
    "\7\23\2\0\2\23\4\0\3\23\5\0\1\23\1\0"+
    "\2\23\2\0\1\23\1\0\5\23\7\0\1\23\1\0"+
    "\1\23\4\0\5\23\1\150\1\23\2\0\2\23\4\0"+
    "\3\23\5\0\1\23\1\0\2\23\2\0\1\23\1\0"+
    "\3\23\1\151\1\23\7\0\1\23\1\0\1\23\4\0"+
    "\7\23\2\0\2\23\4\0\3\23\5\0\1\23\1\0"+
    "\2\23\2\0\1\23\1\0\5\23\7\0\1\23\1\0"+
    "\1\23\4\0\1\152\6\23\2\0\2\23\4\0\3\23"+
    "\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3150];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\1\1\1\11\1\1\3\11\1\1\1\11"+
    "\1\1\2\11\10\1\2\11\1\1\5\11\12\1\2\11"+
    "\1\1\4\11\2\1\1\0\10\1\1\11\1\1\4\11"+
    "\7\1\1\0\41\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[106];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  	private Symbol symbol(int type) {
    	return new Symbol(type, yyline, yycolumn);
  	}
  
 	private Symbol symbol(int type, Object value) {
    	return new Symbol(type, yyline, yycolumn, value);
  	}
	
	private static final int TAB_LENGTH = 4;
	
	Stack<Integer> stack = new Stack<Integer>();
	private int current_indent;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LekserLex(java.io.Reader in) {
  	this.stack.push(0);
	current_indent = 0;
	yybegin(indent_state);
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public LekserLex(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 136) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 11: 
          { return symbol(sym.FULLSTOP);
          }
        case 52: break;
        case 49: 
          { return symbol(sym.CLASS);
          }
        case 53: break;
        case 31: 
          { return symbol(sym.IS);
          }
        case 54: break;
        case 2: 
          { /* ignore comments*/
          }
        case 55: break;
        case 38: 
          { return symbol(sym.NOTEQUAL);
          }
        case 56: break;
        case 35: 
          { return symbol(sym.LESSOREQUAL);
          }
        case 57: break;
        case 27: 
          { return symbol(sym.RIGHTSQUAREBRACKET);
          }
        case 58: break;
        case 19: 
          { return symbol(sym.RIGHTPARENTHESE);
          }
        case 59: break;
        case 51: 
          { return symbol(sym.LAMBDA);
          }
        case 60: break;
        case 7: 
          { current_indent = current_indent + TAB_LENGTH;
          }
        case 61: break;
        case 40: 
          { return symbol(sym.AND);
          }
        case 62: break;
        case 39: 
          { return symbol(sym.NOT);
          }
        case 63: break;
        case 26: 
          { return symbol(sym.LEFTSQUAREBRACKET);
          }
        case 64: break;
        case 23: 
          { return symbol(sym.ASSIGN);
          }
        case 65: break;
        case 16: 
          { return symbol(sym.DIV);
          }
        case 66: break;
        case 50: 
          { return symbol(sym.RETURN);
          }
        case 67: break;
        case 30: 
          { return symbol(sym.FLOAT, yytext());
          }
        case 68: break;
        case 4: 
          { if(current_indent > stack.peek()){
							stack.push(current_indent);
							yybegin(normal_state);
							return symbol(sym.INDENT);
						}
						else if(current_indent == stack.peek()){
							yybegin(normal_state);
						}
						else{
							yypushback(1);
							int tmp = stack.pop();
							return symbol(sym.DEDENT);
						}
          }
        case 69: break;
        case 33: 
          { return symbol(sym.POW);
          }
        case 70: break;
        case 13: 
          { return symbol(sym.PLUS);
          }
        case 71: break;
        case 17: 
          { return symbol(sym.MOD);
          }
        case 72: break;
        case 36: 
          { return symbol(sym.GREATEROREQUAL);
          }
        case 73: break;
        case 21: 
          { return symbol(sym.LESS);
          }
        case 74: break;
        case 6: 
          { current_indent++;
          }
        case 75: break;
        case 44: 
          { return symbol(sym.TRUE);
          }
        case 76: break;
        case 9: 
          { /*Ignore whitespaces*/
          }
        case 77: break;
        case 8: 
          { yybegin(indent_state);
						current_indent = 0;
						return symbol(sym.NEWLINE);
          }
        case 78: break;
        case 12: 
          { return symbol(sym.IDENTIFIER, yytext());
          }
        case 79: break;
        case 42: 
          { return symbol(sym.ELSE);
          }
        case 80: break;
        case 24: 
          { return symbol(sym.COLON);
          }
        case 81: break;
        case 41: 
          { return symbol(sym.DEF);
          }
        case 82: break;
        case 15: 
          { return symbol(sym.MULT);
          }
        case 83: break;
        case 22: 
          { return symbol(sym.GREATER);
          }
        case 84: break;
        case 48: 
          { return symbol(sym.WHILE);
          }
        case 85: break;
        case 43: 
          { return symbol(sym.PASS);
          }
        case 86: break;
        case 37: 
          { return symbol(sym.EQUAL);
          }
        case 87: break;
        case 3: 
          { yypushback(1);
						if(current_indent > stack.peek()){
							stack.push(current_indent);
							yybegin(normal_state);
							return symbol(sym.INDENT);
						}
						else if(current_indent == stack.peek()){
							yybegin(normal_state);
						}
						else{
							int tmp = stack.pop();
							return symbol(sym.DEDENT);
						}
          }
        case 88: break;
        case 32: 
          { return symbol(sym.IF);
          }
        case 89: break;
        case 5: 
          { /*Ignore whitespace*/
          }
        case 90: break;
        case 34: 
          { return symbol(sym.OR);
          }
        case 91: break;
        case 25: 
          { return symbol(sym.SEMICOLON);
          }
        case 92: break;
        case 46: 
          { return symbol(sym.INPUT);
          }
        case 93: break;
        case 1: 
          { System.out.println("Illegal char, '" + yytext() + "' line: " + yyline + ", column: " + yychar);
          }
        case 94: break;
        case 14: 
          { return symbol(sym.MINUS);
          }
        case 95: break;
        case 28: 
          { return symbol(sym.LEFTCURLYBRACKET);
          }
        case 96: break;
        case 18: 
          { return symbol(sym.LEFTPARENTHESE);
          }
        case 97: break;
        case 45: 
          { return symbol(sym.PRINT);
          }
        case 98: break;
        case 29: 
          { return symbol(sym.RIGHTCURLYBRACKET);
          }
        case 99: break;
        case 20: 
          { return symbol(sym.COMMA);
          }
        case 100: break;
        case 47: 
          { return symbol(sym.FALSE);
          }
        case 101: break;
        case 10: 
          { return symbol(sym.INTEGER, yytext());
          }
        case 102: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
