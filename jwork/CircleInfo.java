public class CircleInfo {
    public static void main(String arg[]) {
        Circle ci = new Circle();
        ci.setRadius(100);
        System.out.println("Radius of circle: " + ci.getRadius());
        System.out.println("Diameter of circle: " + ci.getDiameter());
        System.out.println("Area of circle: " + ci.getArea());
    }
}
