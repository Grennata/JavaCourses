import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.FontMetrics;
import java.awt.Rectangle;
import java.awt.Color;

public class StringDemo extends Canvas {
    StringDemo() {
        setSize(650,145);
    }
    public void paint(Graphics g) {
        Rectangle rect = getBounds();
        FontMetrics fm = g.getFontMetrics();
        int x = 15;
        int y = 15;

        String str1;
        str1 = "stringOne";
        String str2 = new String("stringTwo");
        String str3 = "stringThree";

        g.drawString(str1,x,y);
        String combo = str1 + str2;
        y += fm.getHeight();
        g.drawString(combo,x,y);
        combo += str3;
        y += fm.getHeight();
        g.drawString(combo,x,y);

        int ivalue = 84;
        y += fm.getHeight();
        g.drawString("ivalue is set to " + ivalue,x,y);
        double dvalue = 99.002;
        y += fm.getHeight();
        g.drawString("ivalue=" + ivalue + " dvalue=" + dvalue,x,y);
        
        y += fm.getHeight();
        g.drawString("Magenta is " + Color.magenta,x,y);
        y += fm.getHeight();
        g.drawString("Rectangle is " + rect,x,y);
        y += fm.getHeight();
        g.drawString("Fontmetrics is " + fm,x,y);
    }
}
