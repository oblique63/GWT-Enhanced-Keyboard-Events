
import com.google.gwt.event.dom.client.KeyDownEvent;

public class EnhancedKeyDownEvent extends EnhancedKeyCodeEvent {
	public final KeyDownEvent NATIVE_KEY_EVENT;
	public EnhancedKeyDownEvent(KeyDownEvent event) {
		super(event.getNativeKeyCode());
		NATIVE_KEY_EVENT = event;
	}
}
