import java.awt.Frame;
import java.awt.Label;
public class QWin extends Frame {
    String quick;
    public static void main(String arg[]) {
        QWin qw;
        qw = new QWin();
    }
    QWin() {
        quick = "Quick!";
        Label label;
        label = new Label(quick);
        add(label);
        pack();
        show();
    }
}
