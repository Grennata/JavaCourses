public class Looping {
    public static void main(String[] arg) {
        int index;

        index = 0;
        while(index < arg.length) {
            System.out.println(arg[index]);
            index++;
        }

        index = 0;
        do {
            System.out.println(arg[index]);
        } while(++index < arg.length);

        for(index = 0; index < arg.length; index++) {
            System.out.println(arg[index]);
        }
    }
}
