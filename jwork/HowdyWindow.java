import java.awt.Frame;
import java.awt.Label;
public class HowdyWindow extends Frame {
    public static void main(String arg[]) {
        new HowdyWindow();
    }
    HowdyWindow() {
        Label label;
        label = new Label("Howdy!");
        add(label);
        pack();
        show();
    }
}
