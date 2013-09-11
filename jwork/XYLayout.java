import java.awt.LayoutManager;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;

public class XYLayout implements LayoutManager {
    public void addLayoutComponent(String name,Component component) {}
    public void removeLayoutComponent(Component component) {}
    public Dimension minimumLayoutSize(Container container) {
        int height = 0;
        int width = 0;
        int count = container.getComponentCount();
        for(int i=0; i<count; i++) {
            Component component = container.getComponent(i);
            Dimension dim = component.getPreferredSize();
            Point pt = component.getLocation();
            if(width < (pt.x + dim.width))
                width = pt.x + dim.width;
            if(height < (pt.y + dim.height))
                height = pt.y + dim.height;
        }
        return(new Dimension(width,height));
    }
    public Dimension preferredLayoutSize(Container container) {
        return minimumLayoutSize(container);
    }
    public void layoutContainer(Container container) {
        int count = container.getComponentCount();
        for(int i=0; i<count; i++) {
            Component component = container.getComponent(i);
            Dimension dim = component.getPreferredSize();
            component.setSize(dim.width,dim.height);
        }
    }
}
