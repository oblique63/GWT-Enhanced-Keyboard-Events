
import com.google.gwt.event.dom.client.KeyPressEvent;

public class EnhancedKeyPressEvent extends EnhancedKeyCodeEvent {
	public final KeyPressEvent NATIVE_KEY_EVENT;
	public EnhancedKeyPressEvent(KeyPressEvent event) {
		this.keyCode = event.getCharCode();
		this.keyEvent = event;
		
		NATIVE_KEY_EVENT = event;
	}
}
