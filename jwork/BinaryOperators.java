public class BinaryOperators {
    public static void main(String arg[]) {
        int a = 1;
        int b = 2;
        int c = 3;

        a = b;

        a = b + c;
        a = b - c;
        a = b * c;
        a = b / c;

        a = a + b;
        a += b;

        a -= b;
        a *= b;
        a /= b;

        a = b % c;

        a = a % b;
        a %= b;

        a = a >> 3;
        a = a << 3;
        a = a >>> 3;

        a >>= 3;
        a <<= 3;
        a >>>= 3;

        a = b & c;
        a = b | c;
        a = b ^ c;

        a &= b;
        a |= b;
        a ^= b;
    }
}
