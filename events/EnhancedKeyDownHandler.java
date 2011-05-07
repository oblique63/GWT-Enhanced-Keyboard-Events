
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;

public abstract class EnhancedKeyDownHandler implements KeyDownHandler {
    public void onKeyDown(KeyDownEvent event) {
        onKeyDown(new EnhancedKeyDownEvent(event));
    }
    public abstract void onKeyDown(EnhancedKeyDownEvent event);
}
