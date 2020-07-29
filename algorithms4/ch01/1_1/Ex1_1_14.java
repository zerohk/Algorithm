import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_14 {
    public static void main(String[] args) {
        /**
         *1.1.14 编写一个静态方法 lg()，接受一个整型参数 N，返回不大于 log2N 的最大整数。 
         * 不要使用 Math 库。
         * **/
        StdOut.println(lg(2));
        StdOut.println(lg(3));
        StdOut.println(lg(4));
        StdOut.println(lg(5));
        StdOut.println(lg(16));
        StdOut.println(lg(1024));
        StdOut.println(lg(8888));
    }

    public static int lg(int N) {
        if (N == 0) return -1;
        if (N == 1) return 0;
        int i = 2;
        int cnt = 1;
        while (i * 2 <= N) {
            cnt++;
            i = i * 2;
        }
        return cnt;
    }
    
    private static int lg(int n) {
        int shiftRightCount = 0;
        do {
            n >>= 1;//n右移一位，相当于除以2
            shiftRightCount++;
        } while (n != 0);
        return shiftRightCount - 1;
    }
    
}
/**
 * 1
 * 1
 * 2
 * 2
 * 4
 * 10
 * 13
 * **/
