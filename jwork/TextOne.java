import java.awt.Canvas;
import java.awt.Graphics;

public class TextOne extends Canvas {
    TextOne() {
        setSize(200,200);
    }
    public void paint(Graphics g) {
        g.drawString("Hi! I'm text one!",50,100);
    }
}
