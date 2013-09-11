import java.awt.Frame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class DrawPolygon extends Frame {
    public static void main(String arg[]) {
        new DrawPolygon();
    }
    DrawPolygon() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        Polygon poly = new Polygon();
        add(poly);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}

class Polygon extends Canvas {
    private int x[] = { 20, 80,160,320,240,380 };
    private int y[] = { 20,180, 20, 30,180,100 };
    Polygon() {
        setSize(400,200);
    }
    public void paint(Graphics g) {
        g.drawPolygon(x,y,6);
    }
}
