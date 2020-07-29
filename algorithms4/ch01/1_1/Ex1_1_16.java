public class Ex1_1 {
    public static void main(String[] args) {
        /**
         *1.1.16 给出 exR1(6) 的返回值：
         * **/
        String s = exR1(6);
        System.out.println(s);
    }

    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }
}
/**
 *      311361142246
 * **/
