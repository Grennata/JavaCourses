import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.FontMetrics;
import java.awt.Rectangle;


public class TextThree extends Canvas {
    TextThree() {
        setSize(300,100);
    }
    public void paint(Graphics g) {
        Rectangle rect = getBounds();
        FontMetrics fm = g.getFontMetrics();
        String str;
	int strwidth;
        int x;
        int y;

        /* Top Left */
        str = "Top left corner";
        y = fm.getAscent();
        x = 0;
        g.drawString(str,x,y);

        /* Top Right */
        str = "Top right corner";
        strwidth = fm.stringWidth(str);
        y = fm.getAscent();
        x = rect.width - strwidth;
        g.drawString(str,x,y);


        /* Bottom Left */
        str = "Bottom left corner";
        y = rect.height - fm.getDescent();
        x = 0;
        g.drawString(str,x,y);

        /* Bottom Right */
        str = "Bottom right corner";
        strwidth = fm.stringWidth(str);
        y = rect.height - fm.getDescent();
        x = rect.width - strwidth;
        g.drawString(str,x,y);
    }
}
