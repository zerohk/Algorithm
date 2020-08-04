import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class EX38BinarySearch {
    public static int rank(int key, int[] a) {
        //数组必须是有序的
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            //被查找的键要么不存在，要么必然存在于a[lo..hi]之间
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        //获取运行前系统时间
        long before = System.currentTimeMillis();
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);//调用自带的排序方法将数组排好序
        while (!StdIn.isEmpty()) {
            //读取键值，如果不存在白名单中就打印
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0) {
                StdOut.println(key);
            }
        }
        StdOut.println();
        //获取运行后系统时间
        long after = System.currentTimeMillis();
        StdOut.printf("总共运行了%d秒", (after - before) / 1000);
    }
}
/**
 *  总共运行了20秒
 **/
