import java.awt.Frame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class DrawShades extends Frame {
    public static void main(String arg[]) {
        new DrawShades();
    }
    DrawShades() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        Shades shades = new Shades();
        add(shades);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}

class Shades extends Canvas {
    Shades() {
        setSize(300,200);
    }
    public void paint(Graphics g) {
        int x = 0;
        int y = 0;
        int height = 100;
        int width = 50;

        Color color = Color.yellow;
        while(x < 300) {
            g.setColor(color);
            g.fillRect(x,y,width,height);
            x += width;
            color = color.darker();
        }

        x = 0;
        y = 100;
        color = Color.darkGray;
        while(x < 300) {
            g.setColor(color);
            g.fillRect(x,y,width,height);
            x += width;
            color = color.brighter();
        }
    }
}
