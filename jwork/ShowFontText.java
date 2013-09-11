import java.awt.Frame;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class ShowFontText extends Frame {
    public static void main(String arg[]) {
        new ShowFontText();
    }
    ShowFontText() {
        FontText ft;
        ft = new FontText();
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        add(ft);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}
