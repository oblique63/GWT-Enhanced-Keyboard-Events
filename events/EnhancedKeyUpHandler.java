
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;

public abstract class EnhancedKeyUpHandler implements KeyUpHandler {
	public void onKeyUp(KeyUpEvent event) {
		onKeyUp(new EnhancedKeyUpEvent(event));
	}
	public abstract void onKeyUp(EnhancedKeyUpEvent event);
}
