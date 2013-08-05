import java.awt.Frame;
import java.awt.Panel;
import java.awt.Checkbox;
import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class Border extends Frame {
    public static void main(String arg[]) {
        new Border();
    }
    Border() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        add(makePanel());
        pack();
        show();
    }
    private Panel makePanel() {
        Button button;
        Panel panel = new Panel();
        BorderLayout border = new BorderLayout();
        panel.setLayout(border);
        button = new Button("NORTH");
        panel.add(button,BorderLayout.NORTH);
        button = new Button("SOUTH");
        panel.add(button,BorderLayout.SOUTH);
        button = new Button("EAST");
        panel.add(button,BorderLayout.EAST);
        button = new Button("WEST");
        panel.add(button,BorderLayout.WEST);
        button = new Button("CENTER");
        panel.add(button,BorderLayout.CENTER);
        return(panel);
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}
