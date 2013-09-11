import java.awt.Frame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class DrawSquares extends Frame {
    public static void main(String arg[]) {
        new DrawSquares();
    }
    DrawSquares() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        Squares squares = new Squares();
        add(squares);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}

class Squares extends Canvas {
    Squares() {
        setSize(200,200);
    }
    public void paint(Graphics g) {
        g.drawRect(20,20,160,160);
        g.drawRect(40,40,120,120);
        g.drawRect(60,60,80,80);
    }
}
