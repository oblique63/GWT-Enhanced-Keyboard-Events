
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;

public abstract class EnhancedKeyPressHandler implements KeyPressHandler {
	public void onKeyPress(KeyPressEvent event) {
		onKeyPress(new EnhancedKeyPressEvent(event));
	}
	public abstract void onKeyPress(EnhancedKeyPressEvent event);
}
