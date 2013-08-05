import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.FontMetrics;
import java.awt.Rectangle;

public class TextTwo extends Canvas {
    TextTwo() {
        setSize(200,200);
    }
    public void paint(Graphics g) {
        Rectangle rect;
        rect = getBounds();
        String str;
        str = "I'm in the center!";
        FontMetrics fm = g.getFontMetrics();
        int strwidth = fm.stringWidth(str);
        int y = rect.height / 2;
        int x = (rect.width / 2) - (strwidth / 2);
        g.drawString(str,x,y);
    }
}
