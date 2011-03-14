
import com.google.gwt.event.dom.client.KeyCodeEvent;
import com.google.gwt.event.dom.client.KeyCodes;

public class EnhancedKeyCodeEvent {
	private int keyCode;
	public EnhancedKeyCodeEvent(int keyCode) { this.keyCode = keyCode; }
	
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
	
	public boolean isModifier() {
		switch (keyCode) {
			case KeyCodes.KEY_ALT:
			case KeyCodes.KEY_CTRL:
			case KeyCodes.KEY_SHIFT:
			case 91: // Left Super Key
			case 92: // Right Super Key
				return true;
			default:
				return false;
		}
	}
	
	//---{ Specific Input Checks }----------------------------------------------------
	public boolean isAlt() { return keyCode == KeyCodes.KEY_ALT; }
	public boolean isBackspace() { return keyCode == KeyCodes.KEY_BACKSPACE; }
	public boolean isCtrl() { return keyCode == KeyCodes.KEY_CTRL; }
	public boolean isDelete() { return keyCode == KeyCodes.KEY_DELETE; }
	public boolean isEnd() { return keyCode == KeyCodes.KEY_END; }
	public boolean isEnter() { return keyCode == KeyCodes.KEY_ENTER; }
	public boolean isEscape() { return keyCode == KeyCodes.KEY_ESCAPE; }
	public boolean isHome() { return keyCode == KeyCodes.KEY_HOME; }
	public boolean isPageDown() { return keyCode == KeyCodes.KEY_PAGEDOWN; }
	public boolean isPageUp() { return keyCode == KeyCodes.KEY_PAGEUP; }
	public boolean isShift() { return keyCode == KeyCodes.KEY_SHIFT; }
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
	
	public String getSymbolInput(boolean holdingShift) {
		if (holdingShift) 
			return KeyCodeMaps.SHIFT_SYMBOL_MAP.get(keyCode);
		else
			return KeyCodeMaps.SYMBOL_MAP.get(keyCode);
	}
}
