import edu.princeton.cs.algs4.StdOut;

public class Ex26 {
    public static void main(String[] args) {
        /**
         *1.1.26 假设 a、 b、 c 和 t 都是同一种原始数字类型的变量。
         * 证明以下代码能够将 a、b、 c 按照升序排列
         * **/
        int a = 100;
        int b = 2020;
        int c = 1997;
        int t;
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        if (a > c) {
            t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }
        StdOut.println(a);
        StdOut.println(b);
        StdOut.println(c);
    }
}
/**
 * 100
 * 1997
 * 2020
 **/
