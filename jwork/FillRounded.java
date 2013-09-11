import java.awt.*;
import java.awt.event.WindowEvent;

public class FillRounded extends Frame {
    public static void main(String arg[]) {
        new FillRounded();
    }
    FillRounded() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        FRounded frounded = new FRounded();
        add(frounded);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}

class FRounded extends Canvas {
    FRounded() {
        setSize(200,200);
        setBackground(Color.lightGray);
    }
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.fillRoundRect(20,20,160,160,30,50);
    }
}
