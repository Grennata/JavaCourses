import java.awt.Frame;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class ShowTextThree extends Frame {
    public static void main(String arg[]) {
        new ShowTextThree();
    }
    ShowTextThree() {
        TextThree tt;
        tt = new TextThree();
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
