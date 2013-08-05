import java.awt.Frame;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class ShowTextOne extends Frame {
    public static void main(String arg[]) {
        new ShowTextOne();
    }
    ShowTextOne() {
        TextOne to;
        to = new TextOne();
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        add(to);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}
