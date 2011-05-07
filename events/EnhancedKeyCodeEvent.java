
import com.google.gwt.event.dom.client.KeyCodeEvent;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyEvent;

public abstract class EnhancedKeyCodeEvent {
    protected int keyCode;
    protected KeyEvent<?> keyEvent;
	
    //---{ Standard KeyEvent methods }-------------------------------------------
    public void stopPropagation() { keyEvent.stopPropagation(); }
    public void preventDefault() { keyEvent.preventDefault(); }
    public Object getSource() { return keyEvent.getSource(); }
    public String toDebugString() { return keyEvent.toDebugString(); }
    public String toString() { return keyEvent.toString(); }
	
	
    //---{ General Input Checks }----------------------------------------------------
    public boolean isNumber() {
        return KeyCodeMaps.INT_MAP.containsKey(keyCode);
    }
	
    public boolean isChar() {
        return KeyCodeMaps.CHAR_MAP.containsKey(keyCode);
    }
	
    public boolean isSymbol() {
        return KeyCodeMaps.SYMBOL_MAP.containsKey(keyCode);
    }
	
    public boolean isArrow() {
        return KeyCodeEvent.isArrow(keyCode);
    }
	
    public boolean isModifierDown() {
        return keyEvent.isAnyModifierKeyDown();
    }
	
    public boolean isFKey() {
        return KeyCodeMaps.F_KEY_MAP.containsKey(keyCode);
    }
	
    public boolean isSpecialKey() {
        return KeyCodeMaps.SPECIAL_KEY_MAP.containsKey(keyCode);
    }
	
    //---{ Specific Modifier Key Press Checks }----------------------------------------
    public boolean isAltDown() { return keyEvent.isAltKeyDown(); }
    public boolean isCtrlDown() { return keyEvent.isControlKeyDown(); }
    public boolean isMetaDown() { return keyEvent.isMetaKeyDown(); }
    public boolean isShiftDown() { return keyEvent.isShiftKeyDown(); }
	
    //---{ Specific 'Special Key' Input Checks }---------------------------------------
    public boolean isBackspace() { return keyCode == KeyCodes.KEY_BACKSPACE; }
    public boolean isDelete() { return keyCode == KeyCodes.KEY_DELETE; }
    public boolean isEnd() { return keyCode == KeyCodes.KEY_END; }
    public boolean isEnter() { return keyCode == KeyCodes.KEY_ENTER; }
    public boolean isEscape() { return keyCode == KeyCodes.KEY_ESCAPE; }
    public boolean isHome() { return keyCode == KeyCodes.KEY_HOME; }
    public boolean isPageDown() { return keyCode == KeyCodes.KEY_PAGEDOWN; }
    public boolean isPageUp() { return keyCode == KeyCodes.KEY_PAGEUP; }
    public boolean isTab() { return keyCode == KeyCodes.KEY_TAB; }
    public boolean isSpaceBar() { return keyCode == 32; }
    public boolean isLeftSuper() { return keyCode == 91; }
    public boolean isRightSuper() { return keyCode == 92; }
    public boolean isDown() { return keyCode == KeyCodes.KEY_DOWN; }
    public boolean isLeft() { return keyCode == KeyCodes.KEY_LEFT; }
    public boolean isRight() { return keyCode == KeyCodes.KEY_RIGHT; }
    public boolean isUp() { return keyCode == KeyCodes.KEY_UP; }
	
    //---{ Input Value Getters }-----------------------------------------------------
    public int getNumberInput() {
        return KeyCodeMaps.INT_MAP.get(keyCode);
    }
	
    public String getCharInput() {
        return KeyCodeMaps.CHAR_MAP.get(keyCode);
    }
	
    public String getSymbolInput() {
        if (keyEvent.isShiftKeyDown() && KeyCodeMaps.SHIFT_SYMBOL_MAP.containsKey(keyCode)) 
            return KeyCodeMaps.SHIFT_SYMBOL_MAP.get(keyCode);
        else
            return KeyCodeMaps.SYMBOL_MAP.get(keyCode);
    }
	
    /**
     * @return String of the F-key; e.g. "f1","f2","f3", etc.
     */
    public String getFKey() { 
        return KeyCodeMaps.F_KEY_MAP.get(keyCode);
    }
	
    public String getSpecialKey() {
        return KeyCodeMaps.SPECIAL_KEY_MAP.get(keyCode);
    }

    //----{ Equals }-----------------------------------------------------------------
    public boolean equals(int number) {
        return number == this.getNumberInput();
    }
	
    public boolean equals(String str) {
        if (this.isChar())
            return this.getCharInput().equalsIgnoreCase(str);
        if (this.isSymbol())
            return this.getSymbolInput().equals(str);
        if (this.isSpecialKey())
            return this.getSpecialKey().equalsIgnoreCase(str);
        if (this.isFKey())
            return this.getFKey().equalsIgnoreCase(str);
        if (this.isNumber())
            try {
                return this.getNumberInput() == Integer.parseInt(str);
            } catch (Exception e) {}
	
        return false;
    }
	
    public boolean isFKey(int fNumber) {
        return this.getFKey().equalsIgnoreCase("f" + String.valueOf(fNumber));
    }
}
