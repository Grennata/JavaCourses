import java.awt.Frame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class DrawPies extends Frame {
    public static void main(String arg[]) {
        new DrawPies();
    }
    DrawPies() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        Pies pies = new Pies();
        add(pies);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}

class Pies extends Canvas {
    Pies() {
        setSize(200,200);
    }
    public void paint(Graphics g) {
        g.drawArc(20,20,160,160,0,90);
        g.drawArc(40,40,120,120,0,180);
        g.drawArc(60,60,80,80,90,270);
    }
}
