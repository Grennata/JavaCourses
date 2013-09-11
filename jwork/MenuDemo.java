import java.awt.*;
import java.awt.event.*;
public class MenuDemo extends Frame
            implements ActionListener {
    FileHandler fileHandler;
    MenuItem shazam;
    MenuItem xyzzy;
    public static void main(String[] arg) {
        new MenuDemo();
    }
    MenuDemo() {
        setLocation(250,150);
        fileHandler = new FileHandler();
        MenuBar menubar = new MenuBar();
        menubar.add(makeFileMenu());
        menubar.add(makeMagicMenu());
        setMenuBar(menubar);
        setSize(150,300);
        show();
    }
    private Menu makeFileMenu() {
        MenuItem item;
        Menu fileMenu = new Menu("File");

        item = new MenuItem("Open");
        item.addActionListener(fileHandler);
        fileMenu.add(item);

        item = new MenuItem("Save");
        item.setShortcut(new MenuShortcut(KeyEvent.VK_S));
        item.addActionListener(fileHandler);
        fileMenu.add(item);

        item = new MenuItem("Save As...");
        item.setShortcut(new MenuShortcut(KeyEvent.VK_S,true));
        item.setActionCommand("Saveas");
        item.addActionListener(fileHandler);
        fileMenu.add(item);

        fileMenu.addSeparator();

        item = new MenuItem("Exit");
        item.addActionListener(this);
        fileMenu.add(item);

        return(fileMenu);
    }
    private Menu makeMagicMenu() {
        MenuItem item;
        Menu magicMenu = new Menu("Magic");

        item = new MenuItem("Disable");
        item.addActionListener(this);
        magicMenu.add(item);

        item = new MenuItem("Enable");
        item.addActionListener(this);
        magicMenu.add(item);

        shazam = new MenuItem("Shazam");
        shazam.addActionListener(this);
        magicMenu.add(shazam);

        xyzzy = new MenuItem("Xyzzy");
        xyzzy.addActionListener(this);
        magicMenu.add(xyzzy);

        return(magicMenu);
    }
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        System.out.println(command);
        if(command.equals("Exit")) {
            System.exit(0);
        } else if(command.equals("Enable")) {
            xyzzy.setEnabled(true);
            shazam.setEnabled(true);
        } else if(command.equals("Disable")) {
            xyzzy.setEnabled(false);
            shazam.setEnabled(false);
        }
    }
}

class FileHandler implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        System.out.println("FileHandler: " +
            event.getActionCommand());
    }
}
