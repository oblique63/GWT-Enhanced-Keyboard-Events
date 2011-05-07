
import java.util.HashMap;


public class KeyCodeMaps {
    private KeyCodeMaps() {}
    
    public static final HashMap<Integer,Integer> INT_MAP;
    public static final HashMap<Integer,String> CHAR_MAP;
    public static final HashMap<Integer, String> F_KEY_MAP;
    public static final HashMap<Integer,String> SYMBOL_MAP;
    
    // For symbols obtained by holding SHIFT
    public static final HashMap<Integer,String> SHIFT_SYMBOL_MAP;
    
    // All other 'special' keys
    public static final HashMap<Integer, String> SPECIAL_KEY_MAP;
    
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
	
	
        // F-key input
        F_KEY_MAP = new HashMap<Integer, String>();
        for (int j = 0; j < 12; j++)
            F_KEY_MAP.put(112+j, "f"+(j+1));
	
	
        // Symbol Input
        SYMBOL_MAP = new HashMap<Integer,String>();
        //              CODE     SYMBOL
        SYMBOL_MAP.put(   45  ,   "-"   ); // Opera
        SYMBOL_MAP.put(   59  ,   ";"   ); // Firefox
        SYMBOL_MAP.put(   61  ,   "="   ); // Firefox
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
        SHIFT_SYMBOL_MAP.put(  61  ,   "+"   ); // Firefox
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
	
	
        // Special keys
        SPECIAL_KEY_MAP = new HashMap<Integer, String>();
	
        SPECIAL_KEY_MAP.put(8, "backspace");
        SPECIAL_KEY_MAP.put(9, "tab");
        SPECIAL_KEY_MAP.put(13, "enter");
        SPECIAL_KEY_MAP.put(16, "shift");
        SPECIAL_KEY_MAP.put(17, "ctrl");
        SPECIAL_KEY_MAP.put(18, "alt");
        SPECIAL_KEY_MAP.put(19, "pause");
        SPECIAL_KEY_MAP.put(20, "capsLock");
        SPECIAL_KEY_MAP.put(27, "esc");
        SPECIAL_KEY_MAP.put(32, "space");
        SPECIAL_KEY_MAP.put(33, "pageUp");
        SPECIAL_KEY_MAP.put(34, "pageDown");
        SPECIAL_KEY_MAP.put(35, "end");
        SPECIAL_KEY_MAP.put(36, "home");
        //SPECIAL_MAP.put(37, "left");
        //SPECIAL_MAP.put(38, "up");
        //SPECIAL_MAP.put(39, "right");
        //SPECIAL_MAP.put(40, "down");
        SPECIAL_KEY_MAP.put(45, "insert");
        SPECIAL_KEY_MAP.put(46, "delete");
        SPECIAL_KEY_MAP.put(91, "leftSuper");
        SPECIAL_KEY_MAP.put(92, "rightSuper");
        SPECIAL_KEY_MAP.put(93, "select");
        SPECIAL_KEY_MAP.put(144, "numberLock");
        SPECIAL_KEY_MAP.put(145, "scrollLock");
        SPECIAL_KEY_MAP.put(224, "meta");
    }
}
