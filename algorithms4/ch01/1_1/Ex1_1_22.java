import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_22 {
    public static void main(String[] args) {
        /**
         *1.1.22 使用 1.1.6.4 节中的 rank() 递归方法重新实现 BinarySearch 并跟踪该方法的调用。每当该方法
         * 被调用时，打印出它的参数 lo 和 hi 并按照递归的深度缩进。
         * **/
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        rank(15, a);
    }

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }

    public static int rank(int key, int[] a, int lo, int hi, int deep) {
        //如果key存在于a[]中，它的索引不会小于lo且不会大于hi
        if (lo > hi) return -1;
        for (int i = 0; i < deep; i++) {
            StdOut.printf("  ");
        }
        StdOut.printf("lo:%d,hi:%d", lo, hi);
        StdOut.println();
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1, ++deep);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi, ++deep);
        else return mid;
    }
}
/**
 * lo:0,hi:15
 * lo:8,hi:15
 * lo:12,hi:15
 * lo:14,hi:15
 **/
