public class Circle2 extends Figure2 {
    int radius;
    Circle2(int rad) {
        radius = rad;
        area = (int)(3.14159 * rad * rad);
    }
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
