import java.awt.Frame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class DrawFade extends Frame {
    public static void main(String arg[]) {
        new DrawFade();
    }
    DrawFade() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        Fade fade = new Fade();
        add(fade);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}

class Fade extends Canvas {
    Fade() {
        setSize(400,300);
    }
    public void paint(Graphics g) {
        int x = 0;
        int y = 0;
        int width = 2;
        int height = 400;
        Color color = new Color(100,50,150);
        while(x < 400) {
            g.setColor(color);
            g.fillRect(x,y,width,height);
            x += width;
            int red = color.getRed();
            int green = color.getGreen();
            int blue = color.getBlue();
            if(++red > 255)
                red = 255;
            if(++green > 255)
                green = 255;
            if(++blue > 255)
                blue = 255;
            color = new Color(red,green,blue);
        }
    }
}
