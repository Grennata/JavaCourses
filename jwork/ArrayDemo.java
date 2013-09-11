import java.awt.Rectangle;
public class ArrayDemo {
    public static void main(String[] arg) {
        /* An array of integers */
        int fred[];
        fred = new int[10];

        /* An array of objects */
        Rectangle rect[];
        rect = new Rectangle[3];
        rect[0] = new Rectangle(10,20);
        rect[1] = new Rectangle(100,100);
        rect[2] = new Rectangle(308,427);

        /* An array with initial values */
        double[] harv = { 3.5, 897.02, 4.1, 0.0 };
        int lengthOfArray = harv.length;
        System.out.println(lengthOfArray);

        /* A multidimensional array */
        int lance[][];
        lance = new int[5][10];
    }
}
