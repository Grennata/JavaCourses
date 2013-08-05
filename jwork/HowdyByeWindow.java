import java.awt.Frame;
import java.awt.Label;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class HowdyByeWindow extends Frame {
    public static void main(String arg[]) {
        new HowdyByeWindow();
    }
    HowdyByeWindow() {
        Label label;
        label = new Label("HowdyBye!");
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        add(label);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}
