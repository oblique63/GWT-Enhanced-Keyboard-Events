
import com.google.gwt.event.dom.client.KeyDownEvent;

public class EnhancedKeyDownEvent extends EnhancedKeyCodeEvent {
    public final KeyDownEvent NATIVE_KEY_EVENT;
    public EnhancedKeyDownEvent(KeyDownEvent event) {
        this.keyCode = event.getNativeKeyCode();
        this.keyEvent = event;
	
        NATIVE_KEY_EVENT = event;
    }
}
