import java.awt.Frame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.AWTEvent;
import java.awt.Image;
import java.awt.event.WindowEvent;

public class PictureCheckerboard extends Frame {
    public static void main(String arg[]) {
        String filename;
        if(arg.length == 1)
            filename = arg[0];
        else
            filename = "bluemarble.png";
        new PictureCheckerboard(filename);
    }
    PictureCheckerboard(String filename) {
        setTitle("PictureCheckerboard with " + filename);
        setResizable(false);
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        PicCheckCanvas pcanvas = new PicCheckCanvas(filename);
        add(pcanvas);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}

class PicCheckCanvas extends Canvas {
    Image scaledpic;
    PicCheckCanvas(String filename) {
        setSize(512,512);
        ImageLoader il = new ImageLoader();
        Image bluemarble = il.loadImageFromFile(filename);
        scaledpic = bluemarble.getScaledInstance(64,64,
                Image.SCALE_DEFAULT);
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
