public class SquareInfo {
    public static void main(String arg[]) {
        Square sq = new Square();
        sq.setSide(250);
        System.out.println("Side of square: " + sq.getSide());
        System.out.println("Area of square: " + sq.getArea());
        Square sq2 = new Square();
        sq2.setSide(17);
        System.out.println("Side of square: " + sq2.getSide());
        System.out.println("Area of square: " + sq2.getArea());
    }
}
