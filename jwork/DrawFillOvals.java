import java.awt.Frame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class DrawFillOvals extends Frame {
    public static void main(String arg[]) {
        new DrawFillOvals();
    }
    DrawFillOvals() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        DFOvals ovals = new DFOvals();
        add(ovals);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}

class DFOvals extends Canvas {
    DFOvals() {
        setSize(200,300);
        setBackground(Color.magenta);
    }
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(20,0,160,300);
        g.setColor(Color.black);
        g.drawOval(20,0,160,300);
        g.setColor(Color.red);
        g.fillOval(20,40,160,220);
        g.setColor(Color.black);
        g.drawOval(20,40,160,220);
        g.setColor(Color.black);
        g.fillOval(20,100,160,100);
        g.setColor(Color.white);
        g.drawOval(20,100,160,100);
    }
}
