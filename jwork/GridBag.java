import java.awt.Frame;
import java.awt.Panel;
import java.awt.Checkbox;
import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class GridBag extends Frame {
    public static void main(String arg[]) {
        new GridBag();
    }
    GridBag() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        add(makePanel());
        pack();
        show();
    }
    private Panel makePanel() {
        Button button;
        GridBagConstraints con = new GridBagConstraints();
        Panel panel = new Panel();
        GridBagLayout gridbag = new GridBagLayout();
        panel.setLayout(gridbag);

        button = new Button("(0,0)");
        con.gridx = 0;
        con.gridy = 0;
        panel.add(button,con);

        button = new Button("(1,0)");
        con.gridx = 1;
        con.gridy = 0;
        panel.add(button,con);

        button = new Button("(2,0)");
        con.gridx = 2;
        con.gridy = 0;
        panel.add(button,con);

        button = new Button("(3,0)");
        con.gridx = 3;
        con.gridy = 0;
        panel.add(button,con);

        button = new Button("(0,1)");
        con.gridx = 0;
        con.gridy = 1;
        panel.add(button,con);

        button = new Button("(0,2)");
        con.gridx = 0;
        con.gridy = 2;
        panel.add(button,con);

        return(panel);
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}
