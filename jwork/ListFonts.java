import java.awt.GraphicsEnvironment;

public class ListFonts {
    public static void main(String arg[]) {
        String list[];
        GraphicsEnvironment ge;

        ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        list = ge.getAvailableFontFamilyNames();

        for(int i=0; i<list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
