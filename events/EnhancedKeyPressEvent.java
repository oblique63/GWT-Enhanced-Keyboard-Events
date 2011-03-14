
import com.google.gwt.event.dom.client.KeyPressEvent;

public class EnhancedKeyPressEvent extends EnhancedKeyCodeEvent {
	public final KeyPressEvent NATIVE_KEY_EVENT;
	public EnhancedKeyPressEvent(KeyPressEvent event) {
		super(event.getCharCode());
		NATIVE_KEY_EVENT = event;
	}
}
