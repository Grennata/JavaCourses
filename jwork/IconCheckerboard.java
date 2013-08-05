import java.awt.Frame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.AWTEvent;
import java.awt.Image;
import java.awt.event.WindowEvent;

public class IconCheckerboard extends Frame {
    public static void main(String arg[]) {
        String filename;
        if(arg.length == 1)
            filename = arg[0];
        else
            filename = "bluemarble.png";
        new IconCheckerboard(filename);
    }
    IconCheckerboard(String filename) {
        setTitle("IconCheckerboard with " + filename);
        setResizable(false);
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        ImageLoader il = new ImageLoader();
        Image image = il.loadImageFromFile(filename);
        setIconImage(image);
        IconCheckCanvas icanvas = new IconCheckCanvas(image);
        add(icanvas);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}

class IconCheckCanvas extends Canvas {
    Image scaledpic;
    IconCheckCanvas(Image image) {
        setSize(512,512);
        scaledpic = image.getScaledInstance(64,64,
                Image.SCALE_DEFAULT);
        ImageLoader il = new ImageLoader();
        il.waitForImage(scaledpic);
    }
    public void paint(Graphics g) {
        for(int i=0; i<8; i++) {
            for(int j=0; j<8; j++) {
	        int x = i * 64;
	        int y = j * 64;
                if(((i+j) & 1) == 0)
                    g.drawImage(scaledpic,x,y,this);
            }
        }
    }
}
