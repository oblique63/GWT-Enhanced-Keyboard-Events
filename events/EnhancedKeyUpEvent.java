
import com.google.gwt.event.dom.client.KeyUpEvent;

public class EnhancedKeyUpEvent extends EnhancedKeyCodeEvent {
	public final KeyUpEvent NATIVE_KEY_EVENT;
	public EnhancedKeyUpEvent(KeyUpEvent event) {
		super(event.getNativeKeyCode());
		NATIVE_KEY_EVENT = event;
	}
}
