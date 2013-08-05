import java.awt.Frame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class DrawRounded extends Frame {
    public static void main(String arg[]) {
        new DrawRounded();
    }
    DrawRounded() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        Rounded rounded = new Rounded();
        add(rounded);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}

class Rounded extends Canvas {
    Rounded() {
        setSize(200,200);
    }
    public void paint(Graphics g) {
        g.drawRoundRect(20,20,160,160,10,10);
        g.drawRoundRect(40,40,120,120,10,10);
        g.drawRoundRect(60,60,80,80,10,10);
    }
}
