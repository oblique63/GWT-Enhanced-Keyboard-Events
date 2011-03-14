GWT Enhanced Keyboard Events
============================
This library provides simple wrappers around the native GWT 'KeyEvent' classes, for the sheer sake of eliminating the need to look up various key codes all the time. This may be a potentially useless, horribly unoptimized abstraction, but I found it makes client-side GWT code mildly easier to write+read, so I figured I'd release it.

Licensing
---------
This code is released under the [Mozilla Public License](http://www.mozilla.org/MPL/MPL-1.1.html). <br />
Copyright &copy; 2011, Enrique Gavidia

Usage
-----
Basically just include the 'events' package along with your client-side GWT code, and replace any instances where you may have used any KeyEvents/KeyHandlers, with their 'Enhanced' counterparts:

<p>
KeyDownHandler -> EnhancedKeyDownHandler <br />
KeyDownEvent -> EnhancedKeyDownEvent <br />
etc...
</p>

So while you might have normally written:
    someWidget.addKeyDownHandler(new KeyDownHandler() {
        public void onKeyDown(KeyDownEvent event) {
            if (event.getNativeKeyCode() == 65)
                Window.alert("a");
            if (event.getNativeKeyCode() == 66)
                Window.alert("b");
            if (event.getNativeKeyCode() == 67)
                Window.alert("c");
            // etc...
        }
    });

You can now write:
    someWidget.addKeyDownHandler(new EnhancedKeyDownHandler() {
        public void onKeyDown(EnhancedKeyDownEvent event) {
            if (event.isChar())
                Window.alert(event.getCharInput());
        }
    });




Please note that these event classes don't extend their native counterparts however, so if you find yourself needing to call something from the original native KeyEvent they wrap, simply use:
    enhancedEvent.NATIVE_KEY_EVENT
to access the event, and call methods from it directly.


<p>
Dive into EnhancedKeyCodeEvent.java for more info.
</p>