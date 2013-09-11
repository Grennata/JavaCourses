import java.awt.Component;
import java.awt.Toolkit;
import java.awt.Image;
import java.awt.MediaTracker;
import java.net.URL;

public class ImageLoader extends Component {
    public Image loadImageFromFile(String filename) {
        Image image = null;
        Toolkit tk = Toolkit.getDefaultToolkit();
        image = tk.getImage(filename);
        waitForImage(image);
        return(image);
    }
    public void waitForImage(Image image) {
        MediaTracker mt = new MediaTracker(this);
        mt.addImage(image,1);
        try {
            mt.waitForAll();
        } catch(Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
    public Image loadImageFromInternet(String urlString) {
        Image image = null;
        URL url = null;
        try {
            url = new URL(urlString);
        } catch(Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        Toolkit tk = Toolkit.getDefaultToolkit();
        image = tk.getImage(url);
        waitForImage(image);
        return(image);
    }
}
