import java.awt.Frame;
import java.awt.Label;
public class QWind extends Frame {
    String quick;
    public static void main(String arg[]) {
        QWind qw1;
        QWind qw2;
        qw1 = new QWind();
        qw2 = new QWind("Quicker!");
    }
    QWind() {
        quick = "Quick!";
        showWindow();
    }
    QWind(String str) {
        quick = str;
        showWindow();
    }
    void showWindow() {
        Label label;
        label = new Label(quick);
        add(label);
        pack();
        show();
    }
}
