import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Font;


public class FontText extends Canvas {
    FontText() {
        setSize(400,180);
    }
    public void paint(Graphics g) {
        Font font;

        font = new Font("Arial",Font.PLAIN,12);
        g.setFont(font);
        g.drawString("Arial 12 point plain",10,20);

        font = new Font("Arial",Font.BOLD,16);
        g.setFont(font);
        g.drawString("Arial 16 point bold",10,40);

        font = new Font("Arial",Font.ITALIC,14);
        g.setFont(font);
        g.drawString("Arial 14 point italic",10,60);

        font = new Font("Arial",Font.ITALIC | Font.BOLD,18);
        g.setFont(font);
        g.drawString("Arial 18 point bold italic",10,80);

        font = new Font("Times New Roman",Font.PLAIN,12);
        g.setFont(font);
        g.drawString("Times New Roman 12 point plain",10,100);

        font = new Font("Monospaced",Font.PLAIN,20);
        g.setFont(font);
        g.drawString("Monospaced 20 point plain",10,120);

        font = new Font("Dialog",Font.PLAIN,12);
        g.setFont(font);
        g.drawString("Dialog 12 point plain",10,140);

        font = new Font("Nosuchfont",Font.PLAIN,12);
        g.setFont(font);
        g.drawString("Nosuchfont 12 point plain",10,160);
    }
}
