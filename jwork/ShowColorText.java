import java.awt.Frame;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class ShowColorText extends Frame {
    public static void main(String arg[]) {
        new ShowColorText();
    }
    ShowColorText() {
        ColorText ct;
        ct = new ColorText();
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        add(ct);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}
