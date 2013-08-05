import java.awt.Frame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class FillSquares extends Frame {
    public static void main(String arg[]) {
        new FillSquares();
    }
    FillSquares() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        FSquares squares = new FSquares();
        add(squares);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}

class FSquares extends Canvas {
    FSquares() {
        setSize(200,200);
        setBackground(Color.magenta);
    }
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillRect(20,20,160,160);
        g.setColor(Color.red);
        g.fillRect(40,40,120,120);
        g.setColor(Color.black);
        g.fillRect(60,60,80,80);
    }
}
