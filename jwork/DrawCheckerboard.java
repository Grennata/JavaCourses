import java.awt.Frame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class DrawCheckerboard extends Frame {
    public static void main(String arg[]) {
        new DrawCheckerboard();
    }
    DrawCheckerboard() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        Checkerboard checkerboard = new Checkerboard();
        add(checkerboard);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}

class Checkerboard extends Canvas {
    Checkerboard() {
        setSize(256,256);
    }
    public void paint(Graphics g) {
        for(int i=0; i<4; i++) {
	    for(int j=0; j<4; j++) {
                if(((i+j) & 1) == 0) {
                    int x = i * 64;
                    int y = j * 64;
                    g.fillRect(x,y,64,64);
                }
            }
        }
    }
}
