public class Unary {
    public static void main(String arg[]) {
        int a;

        System.out.println("Post Increment");
        a = 5;
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);

        System.out.println("Pre Increment");
        a = 5;
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);

        System.out.println("Post Decrement");
        a = 5;
        System.out.println(a);
        System.out.println(a--);
        System.out.println(a);

        System.out.println("Pre Decrement");
        a = 5;
        System.out.println(a);
        System.out.println(--a);
        System.out.println(a);
    }
}
