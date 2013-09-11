import java.awt.Frame;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class ShowTextTwo extends Frame {
    public static void main(String arg[]) {
        new ShowTextTwo();
    }
    ShowTextTwo() {
        TextTwo tt;
        tt = new TextTwo();
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        add(tt);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}
