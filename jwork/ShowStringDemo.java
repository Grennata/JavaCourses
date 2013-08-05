import java.awt.Frame;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class ShowStringDemo extends Frame {
    public static void main(String arg[]) {
        new ShowStringDemo();
    }
    ShowStringDemo() {
        StringDemo demo;
        demo = new StringDemo();
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        add(demo);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}
