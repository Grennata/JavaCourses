import java.awt.Frame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class DrawBevel extends Frame {
    public static void main(String arg[]) {
        new DrawBevel();
    }
    DrawBevel() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        Bevel bevel = new Bevel();
        add(bevel);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}

class Bevel extends Canvas {
    Bevel() {
        setSize(300,200);
    }
    public void paint(Graphics g) {
        g.setColor(new Color(128,128,128));

        int x = 30;
        int y = 30;
        int width = 240;
        int height = 40;
        g.fillRect(x,y,width,height);
        for(int i=0; i<5; i++) {
            g.draw3DRect(x,y,width,height,true);
            x--;
            y--;
            width += 2;
            height += 2;
        }

        x = 30;
        y = 130;
        width = 240;
        height = 40;
        g.fillRect(x,y,width,height);
        for(int i=0; i<5; i++) {
            g.draw3DRect(x,y,width,height,false);
            x--;
            y--;
            width += 2;
            height += 2;
        }
                
    }
}
