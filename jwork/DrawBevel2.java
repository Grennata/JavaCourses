import java.awt.Frame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class DrawBevel2 extends Frame {
    public static void main(String arg[]) {
        new DrawBevel2();
    }
    DrawBevel2() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        Bevel2 bevel = new Bevel2();
        add(bevel);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}

class Bevel2 extends Canvas {
    Bevel2() {
        setSize(300,200);
        setBackground(Color.cyan);
    }
    public void paint(Graphics g) {
        g.setColor(Color.magenta);
        drawBevel(30,30,240,40,true,g);
        drawBevel(30,130,240,40,false,g);
    }
    private void drawBevel(int x,int y,int width,int height,
            boolean inout,Graphics g) {
        g.fillRect(x,y,width,height);
        for(int i=0; i<5; i++) {
            g.draw3DRect(x,y,width,height,inout);
            x--;
            y--;
            width += 2;
            height += 2;
        }
                
    }
}
