import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShowDialog extends Frame implements ActionListener {
    public static void main(String arg[]) {
        new ShowDialog();
    }
    ShowDialog() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        add(makePanel());
        pack();
        show();
    }
    private Panel makePanel() {
        Button button;
        Panel panel = new Panel();
        button = new Button("Non Modal");
        button.addActionListener(this);
        panel.add(button);
        button = new Button("Modal");
        button.addActionListener(this);
        panel.add(button);
        button = new Button("Exit");
        button.addActionListener(this);
        panel.add(button);
        return(panel);
    }
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        if(command.equals("Non Modal")) {
            new NonModalDialog(this);
        } else if(command.equals("Modal")) {
            ModalDialog dialog = new ModalDialog(this);
            String response = dialog.getResponse();
            System.out.println(response);
        } else if(command.equals("Exit")) {
            System.exit(0);
        }
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}
