import java.awt.Frame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class FillRectangles extends Frame {
    public static void main(String arg[]) {
        new FillRectangles();
    }
    FillRectangles() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        FRectangles rectangles = new FRectangles();
        add(rectangles);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}

class FRectangles extends Canvas {
    FRectangles() {
        setSize(200,300);
        setBackground(Color.magenta);
    }
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillRect(20,20,160,260);
        g.setColor(Color.red);
        g.fillRect(40,40,120,220);
        g.setColor(Color.black);
        g.fillRect(60,60,80,180);
    }
}
