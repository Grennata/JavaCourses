import java.awt.Frame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class DrawCircles extends Frame {
    public static void main(String arg[]) {
        new DrawCircles();
    }
    DrawCircles() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        Circles circles = new Circles();
        add(circles);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}

class Circles extends Canvas {
    Circles() {
        setSize(200,200);
    }
    public void paint(Graphics g) {
        g.drawOval(20,20,160,160);
        g.drawOval(40,40,120,120);
        g.drawOval(60,60,80,80);
    }
}
