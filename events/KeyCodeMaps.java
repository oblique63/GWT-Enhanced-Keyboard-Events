
import java.util.HashMap;


public class KeyCodeMaps {
	private KeyCodeMaps() {}
	
	public static final HashMap<Integer,Integer> INT_MAP;
	public static final HashMap<Integer,String> CHAR_MAP;
	public static final HashMap<Integer,String> SYMBOL_MAP;
	
	// For symbols obtained by holding SHIFT
	public static final HashMap<Integer,String> SHIFT_SYMBOL_MAP;
	
	static {
		// Numerical Input
		INT_MAP = new HashMap<Integer,Integer>();
		for (int i=0; i < 10; i++) {
			//            CODE   NUMBER
			INT_MAP.put(  48+i  ,   i   );
			// Number Pad Support:
			INT_MAP.put(  96+i  ,   i   );
		}
		
		// Character Input
		CHAR_MAP = new HashMap<Integer,String>();
		int i = 0;
		for (char letter = 'a'; letter <= 'z'; letter++) {
			//            CODE          LETTER
			CHAR_MAP.put( 65+i , String.valueOf(letter));
			i++;
		}
		
		// Symbol Input
		SYMBOL_MAP = new HashMap<Integer,String>();
		//              CODE     SYMBOL
		SYMBOL_MAP.put(   45  ,   "-"   ); // Opera
		SYMBOL_MAP.put(   59  ,   ";"   ); // Firefox
		SYMBOL_MAP.put(  106  ,   "*"   );
		SYMBOL_MAP.put(  107  ,   "+"   );
		SYMBOL_MAP.put(  109  ,   "-"   );
		SYMBOL_MAP.put(  110  ,   "."   );
		SYMBOL_MAP.put(  111  ,   "/"   );
		SYMBOL_MAP.put(  186  ,   ";"   );
		SYMBOL_MAP.put(  187  ,   "="   );
		SYMBOL_MAP.put(  188  ,   ","   );
		SYMBOL_MAP.put(  189  ,   "-"   );
		SYMBOL_MAP.put(  190  ,   "."   );
		SYMBOL_MAP.put(  191  ,   "/"   );
		SYMBOL_MAP.put(  192  ,   "`"   );
		SYMBOL_MAP.put(  219  ,   "["   );
		SYMBOL_MAP.put(  220  ,   "\\"  );
		SYMBOL_MAP.put(  221  ,   "]"   );
		SYMBOL_MAP.put(  222  ,   "'"   );
		
		// Additional Symbol Input through holding SHIFT
		SHIFT_SYMBOL_MAP = new HashMap<Integer,String>();
		//                    CODE    SYMBOL
		SHIFT_SYMBOL_MAP.put(  45  ,   "_"   ); // Opera
		SHIFT_SYMBOL_MAP.put(  48  ,   "!"   );
		SHIFT_SYMBOL_MAP.put(  49  ,   "@"   );
		SHIFT_SYMBOL_MAP.put(  50  ,   "#"   );
		SHIFT_SYMBOL_MAP.put(  51  ,   "$"   );
		SHIFT_SYMBOL_MAP.put(  52  ,   "%"   );
		SHIFT_SYMBOL_MAP.put(  53  ,   "^"   );
		SHIFT_SYMBOL_MAP.put(  54  ,   "&"   );
		SHIFT_SYMBOL_MAP.put(  55  ,   "*"   );
		SHIFT_SYMBOL_MAP.put(  56  ,   "("   );
		SHIFT_SYMBOL_MAP.put(  57  ,   ")"   );
		SHIFT_SYMBOL_MAP.put(  59  ,   ":"   ); // Firefox
		SHIFT_SYMBOL_MAP.put(  95  ,   "_"   ); // Safari
		SHIFT_SYMBOL_MAP.put( 186  ,   ":"   );
		SHIFT_SYMBOL_MAP.put( 187  ,   "+"   );
		SHIFT_SYMBOL_MAP.put( 188  ,   "<"   );
		SHIFT_SYMBOL_MAP.put( 189  ,   "_"   );
		SHIFT_SYMBOL_MAP.put( 190  ,   ">"   );
		SHIFT_SYMBOL_MAP.put( 191  ,   "?"   );
		SHIFT_SYMBOL_MAP.put( 192  ,   "~"   );
		SHIFT_SYMBOL_MAP.put( 219  ,   "{"   );
		SHIFT_SYMBOL_MAP.put( 220  ,   "|"   );
		SHIFT_SYMBOL_MAP.put( 221  ,   "}"   );
		SHIFT_SYMBOL_MAP.put( 222  ,   "\""  );
	}
}
