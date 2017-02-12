package swop;

/**
 * 交换两个变量数值的方式.
 *
 * @author Yohann.
 */
public class Number {
    /**
     * 使用临时变量
     *
     * @param a
     * @param b
     */
    public static void swopWithTPV(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    /**
     * 使用加减减运算
     *
     * @param a
     * @param b
     */
    public static void swopWithAAS(int a, int b) {
        a = a + b;
        b = a - b; // a + b - b == a
        a = a - b; // a + b - a == b
    }

    /**
     * 使用异或运算
     *
     * @param a
     * @param b
     */
    public static void swopWithXOR(int a, int b) {
        a = a ^ b;
        b = a ^ b; // a ^ b ^ b == a ^ (b ^ b) == a ^ 0 == a
        a = a ^ b; // a ^ b ^ a == b
    }
}
