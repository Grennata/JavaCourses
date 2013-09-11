public class Circle extends Figure {
    int radius = 0;
    public int getRadius() {
        return(radius);
    }
    public int getDiameter() {
        return(2 * radius);
    }
    public void setRadius(int value) {
        radius = value;
        area = (int)(3.14159 * radius * radius);
    }
}
