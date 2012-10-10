// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g 2010-05-26 10:47:15

package org.cesta.parsers.dot;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DotLexer extends Lexer {
    public static final int GRAPH=14;
    public static final int EDGE=18;
    public static final int HTMLSTR=47;
    public static final int ID=27;
    public static final int EOF=-1;
    public static final int VALIDSTR=29;
    public static final int LPAREN=12;
    public static final int STR=49;
    public static final int ESCAPE_SEQUENCE=50;
    public static final int RPAREN=13;
    public static final int O_SQR_BRACKET=6;
    public static final int GRAPH_ROOT=20;
    public static final int COMMA=10;
    public static final int EQUAL=9;
    public static final int ALPHACHAR=48;
    public static final int COMMENT=53;
    public static final int C_SQR_BRACKET=7;
    public static final int NODE_STMT=24;
    public static final int ATTR=26;
    public static final int D=35;
    public static final int E=42;
    public static final int F=55;
    public static final int C_BRACKET=5;
    public static final int G=30;
    public static final int A=32;
    public static final int B=44;
    public static final int NODE=17;
    public static final int STRICT=16;
    public static final int SUBGRAPH=19;
    public static final int C=39;
    public static final int L=58;
    public static final int LINE_COMMENT=54;
    public static final int M=59;
    public static final int STMT_LIST=22;
    public static final int N=40;
    public static final int O=41;
    public static final int H=34;
    public static final int I=36;
    public static final int J=56;
    public static final int K=57;
    public static final int NUMBER=45;
    public static final int U=43;
    public static final int T=38;
    public static final int W=62;
    public static final int V=61;
    public static final int SEMI_COLON=8;
    public static final int Q=60;
    public static final int P=33;
    public static final int S=37;
    public static final int R=31;
    public static final int O_BRACKET=4;
    public static final int DIGRAPH=15;
    public static final int Y=64;
    public static final int X=63;
    public static final int Z=65;
    public static final int COLON=11;
    public static final int WS=51;
    public static final int NEWLINE=52;
    public static final int QUOTEDSTR=46;
    public static final int EDGEOP=28;
    public static final int EDGE_STMT=23;
    public static final int ATTR_LIST=25;
    public static final int SUBGRAPH_ROOT=21;



    // delegates
    // delegators

    public DotLexer() {;} 
    public DotLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DotLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g"; }

    // $ANTLR start "O_BRACKET"
    public final void mO_BRACKET() throws RecognitionException {
        try {
            int _type = O_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:9:11: ( '{' )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:9:13: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "O_BRACKET"

    // $ANTLR start "C_BRACKET"
    public final void mC_BRACKET() throws RecognitionException {
        try {
            int _type = C_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:10:11: ( '}' )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:10:13: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "C_BRACKET"

    // $ANTLR start "O_SQR_BRACKET"
    public final void mO_SQR_BRACKET() throws RecognitionException {
        try {
            int _type = O_SQR_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:11:15: ( '[' )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:11:17: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "O_SQR_BRACKET"

    // $ANTLR start "C_SQR_BRACKET"
    public final void mC_SQR_BRACKET() throws RecognitionException {
        try {
            int _type = C_SQR_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:12:15: ( ']' )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:12:17: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "C_SQR_BRACKET"

    // $ANTLR start "SEMI_COLON"
    public final void mSEMI_COLON() throws RecognitionException {
        try {
            int _type = SEMI_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:13:12: ( ';' )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:13:14: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI_COLON"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:14:7: ( '=' )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:14:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:15:7: ( ',' )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:16:7: ( ':' )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:16:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:17:8: ( '(' )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:17:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:18:8: ( ')' )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:18:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "GRAPH"
    public final void mGRAPH() throws RecognitionException {
        try {
            int _type = GRAPH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:201:6: ( G R A P H )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:201:8: G R A P H
            {
            mG(); 
            mR(); 
            mA(); 
            mP(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GRAPH"

    // $ANTLR start "DIGRAPH"
    public final void mDIGRAPH() throws RecognitionException {
        try {
            int _type = DIGRAPH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:202:8: ( D I G R A P H )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:202:10: D I G R A P H
            {
            mD(); 
            mI(); 
            mG(); 
            mR(); 
            mA(); 
            mP(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIGRAPH"

    // $ANTLR start "STRICT"
    public final void mSTRICT() throws RecognitionException {
        try {
            int _type = STRICT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:203:7: ( S T R I C T )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:203:9: S T R I C T
            {
            mS(); 
            mT(); 
            mR(); 
            mI(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRICT"

    // $ANTLR start "NODE"
    public final void mNODE() throws RecognitionException {
        try {
            int _type = NODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:204:5: ( N O D E )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:204:7: N O D E
            {
            mN(); 
            mO(); 
            mD(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NODE"

    // $ANTLR start "EDGE"
    public final void mEDGE() throws RecognitionException {
        try {
            int _type = EDGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:205:5: ( E D G E )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:205:7: E D G E
            {
            mE(); 
            mD(); 
            mG(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EDGE"

    // $ANTLR start "SUBGRAPH"
    public final void mSUBGRAPH() throws RecognitionException {
        try {
            int _type = SUBGRAPH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:206:9: ( S U B G R A P H )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:206:11: S U B G R A P H
            {
            mS(); 
            mU(); 
            mB(); 
            mG(); 
            mR(); 
            mA(); 
            mP(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUBGRAPH"

    // $ANTLR start "EDGEOP"
    public final void mEDGEOP() throws RecognitionException {
        try {
            int _type = EDGEOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:208:8: ( '->' | '--' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='>') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='-') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:208:10: '->'
                    {
                    match("->"); 


                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:208:17: '--'
                    {
                    match("--"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EDGEOP"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:211:5: ( ( VALIDSTR | NUMBER | QUOTEDSTR | HTMLSTR ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:211:8: ( VALIDSTR | NUMBER | QUOTEDSTR | HTMLSTR )
            {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:211:8: ( VALIDSTR | NUMBER | QUOTEDSTR | HTMLSTR )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt2=1;
                }
                break;
            case '-':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt2=2;
                }
                break;
            case '\"':
                {
                alt2=3;
                }
                break;
            case '<':
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:211:11: VALIDSTR
                    {
                    mVALIDSTR(); 

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:212:11: NUMBER
                    {
                    mNUMBER(); 

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:213:11: QUOTEDSTR
                    {
                    mQUOTEDSTR(); 

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:214:11: HTMLSTR
                    {
                    mHTMLSTR(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "ALPHACHAR"
    public final void mALPHACHAR() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:220:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:220:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "ALPHACHAR"

    // $ANTLR start "VALIDSTR"
    public final void mVALIDSTR() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:227:5: ( ALPHACHAR ( ALPHACHAR | '0' .. '9' )* )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:227:8: ALPHACHAR ( ALPHACHAR | '0' .. '9' )*
            {
            mALPHACHAR(); 
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:228:9: ( ALPHACHAR | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "VALIDSTR"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:234:5: ( ( '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:234:8: ( '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:234:8: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:234:9: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:234:15: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:234:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:234:27: ( '.' ( '0' .. '9' )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:234:28: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:234:32: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:234:33: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "QUOTEDSTR"
    public final void mQUOTEDSTR() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:238:5: ( '\"' STR '\"' )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:238:8: '\"' STR '\"'
            {
            match('\"'); 
            mSTR(); 
            match('\"'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "QUOTEDSTR"

    // $ANTLR start "STR"
    public final void mSTR() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:244:5: ( ( ESCAPE_SEQUENCE | ~ ( '\\\\' | '\"' ) )* )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:245:6: ( ESCAPE_SEQUENCE | ~ ( '\\\\' | '\"' ) )*
            {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:245:6: ( ESCAPE_SEQUENCE | ~ ( '\\\\' | '\"' ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\\') ) {
                    alt8=1;
                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:245:7: ESCAPE_SEQUENCE
            	    {
            	    mESCAPE_SEQUENCE(); 

            	    }
            	    break;
            	case 2 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:245:25: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "STR"

    // $ANTLR start "ESCAPE_SEQUENCE"
    public final void mESCAPE_SEQUENCE() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:249:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:249:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "ESCAPE_SEQUENCE"

    // $ANTLR start "HTMLSTR"
    public final void mHTMLSTR() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:253:5: ( '<' (~ '>' )* '>' )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:253:8: '<' (~ '>' )* '>'
            {
            match('<'); 
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:253:12: (~ '>' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='=')||(LA9_0>='?' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:253:13: ~ '>'
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='=')||(input.LA(1)>='?' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match('>'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "HTMLSTR"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:256:5: ( ( ' ' | '\\t' )+ )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:256:8: ( ' ' | '\\t' )+
            {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:256:8: ( ' ' | '\\t' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\t'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


                    _channel = HIDDEN;
                

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:262:10: ( ( '\\r' '\\n' | '\\r' | '\\n' | '\\u000C' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:262:13: ( '\\r' '\\n' | '\\r' | '\\n' | '\\u000C' )
            {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:262:13: ( '\\r' '\\n' | '\\r' | '\\n' | '\\u000C' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case '\r':
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='\n') ) {
                    alt11=1;
                }
                else {
                    alt11=2;}
                }
                break;
            case '\n':
                {
                alt11=3;
                }
                break;
            case '\f':
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:262:14: '\\r' '\\n'
                    {
                    match('\r'); 
                    match('\n'); 

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:262:24: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:262:29: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:262:34: '\\u000C'
                    {
                    match('\f'); 

                    }
                    break;

            }


                    _channel = HIDDEN;
                

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:269:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:269:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:269:14: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:269:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("*/"); 


                    _channel = HIDDEN;
                

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:276:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:276:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:276:12: (~ ( '\\n' | '\\r' ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:276:12: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:276:26: ( '\\r' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:276:26: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

                    _channel = HIDDEN;
                

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:282:11: ( ( 'a' | 'A' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:282:12: ( 'a' | 'A' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:283:11: ( ( 'b' | 'B' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:283:12: ( 'b' | 'B' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "B"

    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:284:11: ( ( 'c' | 'C' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:284:12: ( 'c' | 'C' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "C"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:285:11: ( ( 'd' | 'D' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:285:12: ( 'd' | 'D' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "D"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:286:11: ( ( 'e' | 'E' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:286:12: ( 'e' | 'E' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:287:11: ( ( 'f' | 'F' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:287:12: ( 'f' | 'F' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "G"
    public final void mG() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:288:11: ( ( 'g' | 'G' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:288:12: ( 'g' | 'G' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "G"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:289:11: ( ( 'h' | 'H' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:289:12: ( 'h' | 'H' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:290:11: ( ( 'i' | 'I' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:290:12: ( 'i' | 'I' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "I"

    // $ANTLR start "J"
    public final void mJ() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:291:11: ( ( 'j' | 'J' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:291:12: ( 'j' | 'J' )
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "J"

    // $ANTLR start "K"
    public final void mK() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:292:11: ( ( 'k' | 'K' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:292:12: ( 'k' | 'K' )
            {
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "K"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:293:11: ( ( 'l' | 'L' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:293:12: ( 'l' | 'L' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:294:11: ( ( 'm' | 'M' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:294:12: ( 'm' | 'M' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:295:11: ( ( 'n' | 'N' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:295:12: ( 'n' | 'N' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:296:11: ( ( 'o' | 'O' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:296:12: ( 'o' | 'O' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "O"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:297:11: ( ( 'p' | 'P' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:297:12: ( 'p' | 'P' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "P"

    // $ANTLR start "Q"
    public final void mQ() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:298:11: ( ( 'q' | 'Q' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:298:12: ( 'q' | 'Q' )
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Q"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:299:11: ( ( 'r' | 'R' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:299:12: ( 'r' | 'R' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:300:11: ( ( 's' | 'S' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:300:12: ( 's' | 'S' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:301:11: ( ( 't' | 'T' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:301:12: ( 't' | 'T' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:302:11: ( ( 'u' | 'U' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:302:12: ( 'u' | 'U' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "U"

    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:303:11: ( ( 'v' | 'V' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:303:12: ( 'v' | 'V' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "V"

    // $ANTLR start "W"
    public final void mW() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:304:11: ( ( 'w' | 'W' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:304:12: ( 'w' | 'W' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "W"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:305:11: ( ( 'x' | 'X' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:305:12: ( 'x' | 'X' )
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:306:11: ( ( 'y' | 'Y' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:306:12: ( 'y' | 'Y' )
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:307:11: ( ( 'z' | 'Z' ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:307:12: ( 'z' | 'Z' )
            {
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Z"

    public void mTokens() throws RecognitionException {
        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:1:8: ( O_BRACKET | C_BRACKET | O_SQR_BRACKET | C_SQR_BRACKET | SEMI_COLON | EQUAL | COMMA | COLON | LPAREN | RPAREN | GRAPH | DIGRAPH | STRICT | NODE | EDGE | SUBGRAPH | EDGEOP | ID | WS | NEWLINE | COMMENT | LINE_COMMENT )
        int alt15=22;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:1:10: O_BRACKET
                {
                mO_BRACKET(); 

                }
                break;
            case 2 :
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:1:20: C_BRACKET
                {
                mC_BRACKET(); 

                }
                break;
            case 3 :
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:1:30: O_SQR_BRACKET
                {
                mO_SQR_BRACKET(); 

                }
                break;
            case 4 :
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:1:44: C_SQR_BRACKET
                {
                mC_SQR_BRACKET(); 

                }
                break;
            case 5 :
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:1:58: SEMI_COLON
                {
                mSEMI_COLON(); 

                }
                break;
            case 6 :
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:1:69: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 7 :
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:1:75: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 8 :
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:1:81: COLON
                {
                mCOLON(); 

                }
                break;
            case 9 :
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:1:87: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 10 :
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:1:94: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 11 :
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:1:101: GRAPH
                {
                mGRAPH(); 

                }
                break;
            case 12 :
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:1:107: DIGRAPH
                {
                mDIGRAPH(); 

                }
                break;
            case 13 :
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:1:115: STRICT
                {
                mSTRICT(); 

                }
                break;
            case 14 :
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:1:122: NODE
                {
                mNODE(); 

                }
                break;
            case 15 :
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:1:127: EDGE
                {
                mEDGE(); 

                }
                break;
            case 16 :
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:1:132: SUBGRAPH
                {
                mSUBGRAPH(); 

                }
                break;
            case 17 :
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:1:141: EDGEOP
                {
                mEDGEOP(); 

                }
                break;
            case 18 :
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:1:148: ID
                {
                mID(); 

                }
                break;
            case 19 :
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:1:151: WS
                {
                mWS(); 

                }
                break;
            case 20 :
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:1:154: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 21 :
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:1:162: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 22 :
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\dot\\Dot.g:1:170: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\13\uffff\5\21\5\uffff\6\21\3\uffff\12\21\1\56\1\57\1\60\3\21\3"+
        "\uffff\1\21\1\65\1\21\1\67\1\uffff\1\21\1\uffff\1\71\1\uffff";
    static final String DFA15_eofS =
        "\72\uffff";
    static final String DFA15_minS =
        "\1\11\12\uffff\1\122\1\111\1\124\1\117\1\104\1\55\3\uffff\1\52"+
        "\1\101\1\107\1\122\1\102\1\104\1\107\3\uffff\1\120\1\122\1\111\1"+
        "\107\2\105\1\110\1\101\1\103\1\122\3\60\1\120\1\124\1\101\3\uffff"+
        "\1\110\1\60\1\120\1\60\1\uffff\1\110\1\uffff\1\60\1\uffff";
    static final String DFA15_maxS =
        "\1\175\12\uffff\1\162\1\151\1\165\1\157\1\144\1\76\3\uffff\1\57"+
        "\1\141\1\147\1\162\1\142\1\144\1\147\3\uffff\1\160\1\162\1\151\1"+
        "\147\2\145\1\150\1\141\1\143\1\162\3\172\1\160\1\164\1\141\3\uffff"+
        "\1\150\1\172\1\160\1\172\1\uffff\1\150\1\uffff\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\6\uffff\1\22"+
        "\1\23\1\24\7\uffff\1\21\1\25\1\26\20\uffff\1\16\1\17\1\13\4\uffff"+
        "\1\15\1\uffff\1\14\1\uffff\1\20";
    static final String DFA15_specialS =
        "\72\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\22\1\23\1\uffff\2\23\22\uffff\1\22\1\uffff\1\21\5\uffff"+
            "\1\11\1\12\2\uffff\1\7\1\20\1\uffff\1\24\12\21\1\10\1\5\1\21"+
            "\1\6\3\uffff\3\21\1\14\1\17\1\21\1\13\6\21\1\16\4\21\1\15\7"+
            "\21\1\3\1\uffff\1\4\1\uffff\1\21\1\uffff\3\21\1\14\1\17\1\21"+
            "\1\13\6\21\1\16\4\21\1\15\7\21\1\1\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\25\37\uffff\1\25",
            "\1\26\37\uffff\1\26",
            "\1\27\1\30\36\uffff\1\27\1\30",
            "\1\31\37\uffff\1\31",
            "\1\32\37\uffff\1\32",
            "\1\33\2\uffff\12\21\4\uffff\1\33",
            "",
            "",
            "",
            "\1\34\4\uffff\1\35",
            "\1\36\37\uffff\1\36",
            "\1\37\37\uffff\1\37",
            "\1\40\37\uffff\1\40",
            "\1\41\37\uffff\1\41",
            "\1\42\37\uffff\1\42",
            "\1\43\37\uffff\1\43",
            "",
            "",
            "",
            "\1\44\37\uffff\1\44",
            "\1\45\37\uffff\1\45",
            "\1\46\37\uffff\1\46",
            "\1\47\37\uffff\1\47",
            "\1\50\37\uffff\1\50",
            "\1\51\37\uffff\1\51",
            "\1\52\37\uffff\1\52",
            "\1\53\37\uffff\1\53",
            "\1\54\37\uffff\1\54",
            "\1\55\37\uffff\1\55",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\61\37\uffff\1\61",
            "\1\62\37\uffff\1\62",
            "\1\63\37\uffff\1\63",
            "",
            "",
            "",
            "\1\64\37\uffff\1\64",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\66\37\uffff\1\66",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "\1\70\37\uffff\1\70",
            "",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( O_BRACKET | C_BRACKET | O_SQR_BRACKET | C_SQR_BRACKET | SEMI_COLON | EQUAL | COMMA | COLON | LPAREN | RPAREN | GRAPH | DIGRAPH | STRICT | NODE | EDGE | SUBGRAPH | EDGEOP | ID | WS | NEWLINE | COMMENT | LINE_COMMENT );";
        }
    }
 

}