import java.awt.*;
import java.awt.event.WindowEvent;

public class DrawBillboard extends Frame {
    public static void main(String arg[]) {
        new DrawBillboard();
    }
    DrawBillboard() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        Billboard billboard = new Billboard();
        add(billboard);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}

class Billboard extends Canvas {
    Billboard() {
        setSize(400,200);
        setBackground(Color.lightGray);
    }
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(190,20,20,180);
        g.setColor(Color.yellow);
        g.fillRoundRect(40,40,320,120,20,20);

        Font font = new Font("Times New Roman",Font.BOLD,64);
        g.setFont(font);
        FontMetrics fm = g.getFontMetrics();
        String str = "THIMK!";
        int x = (400 - fm.stringWidth(str)) / 2;
        int y = (200 + fm.getAscent()) / 2;
        g.setColor(Color.black);
        g.drawString(str,x,y);
    }
}
