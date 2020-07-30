import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Ex1_1_23 {
    public static void main(String[] args) {
        /**
         *1.1.23 为 BinarySearch 的测试用例添加一个参数： 
         * + 打印出标准输入中不在白名单上的值； 
         * -，则打印出标准输入中在白名单上的值
         * **/
        int[] whitelist = In.readInts(args[0]);
        //调用自带的排序方法将数组排好序
        Arrays.sort(whitelist);
        printData(whitelist, "-");
    }

    //测试用例，打印数据
    //如果参数flag为: + 打印出标准输入中不在白名单上的值； 
    //              -，则打印出标准输入中在白名单上的值.
    public static void printData(int[] whitelist, String flag) {
        if (flag.equals("+")) {
            while (!StdIn.isEmpty()) {
                int key = StdIn.readInt();
                if (rank(key, whitelist) < 0) {
                    StdOut.println(key);
                }
            }
        }
        if (flag.equals("-")) {
            while (!StdIn.isEmpty()) {
                int key = StdIn.readInt();
                if (rank(key, whitelist) >= 0) {
                    StdOut.println(key);
                }
            }
        }
    }

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
}
