import java.awt.Frame;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class FillWidePies extends Frame {
    public static void main(String arg[]) {
        new FillWidePies();
    }
    FillWidePies() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        FWPies fwpies = new FWPies();
        add(fwpies);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}

class FWPies extends Canvas {
    FWPies() {
        setSize(400,200);
        setBackground(Color.green);
    }
    public void paint(Graphics g) {
        g.setColor(Color.pink);
        g.fillArc(20,20,360,160,0,90);
        g.setColor(Color.red);
        g.fillArc(40,40,320,120,45,180);
        g.setColor(Color.black);
        g.fillArc(60,60,280,80,90,270);
    }
}
