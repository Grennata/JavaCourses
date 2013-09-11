import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;


public class ColorText extends Canvas {
    ColorText() {
        setSize(400,80);
        setBackground(Color.pink);
    }
    public void paint(Graphics g) {
        Font font;

        g.setColor(Color.red);
        font = new Font("Arial",Font.ITALIC | Font.BOLD,18);
        g.setFont(font);
        g.drawString("Arial 18 point bold italic red",10,20);

        Color mycolor = new Color(0,255,0);
        g.setColor(mycolor);
        font = new Font("Times New Roman",Font.BOLD,22);
        g.setFont(font);
        g.drawString("Times New Roman 22 point plain green",10,40);

        g.setColor(new Color(0,0,255));
        font = new Font("Monospaced",Font.BOLD,20);
        g.setFont(font);
        g.drawString("Monospaced 20 point plain blue",10,60);
    }
}
