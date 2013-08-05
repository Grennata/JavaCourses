import java.awt.Frame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class FillPolygon extends Frame {
    public static void main(String arg[]) {
        new FillPolygon();
    }
    FillPolygon() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        FPolygon fpoly = new FPolygon();
        add(fpoly);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}

class FPolygon extends Canvas {
    private int x[] = { 20, 80,160,320,240,380 };
    private int y[] = { 20,180, 20, 30,180,100 };
    FPolygon() {
        setSize(400,200);
    }
    public void paint(Graphics g) {
        g.fillPolygon(x,y,6);
    }
}
