import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex28 {
    public static void main(String[] args) {
        /**
         *1.1.28修改 BinarySearch 类中的 测试用例 来删去排序之后白名单中的所有重复元素。
         * **/
        //从标准输入读取数据，在命令行输入文件名
        int[] whitelist = In.readInts(args[0]);
        //int[] whitelist = { 23, 0, 34, 56, 1, 34, 24, 23, 0, 8, 9, 4, 6, 123 };
        printArray(whitelist);
        //对白名单数据排序
        Arrays.sort(whitelist);
        printArray(whitelist);
        //调用方法删除白名单中重复元素
        whitelist = deleteDuplicate(whitelist);
        printArray(whitelist);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0)
                StdOut.print(key + " ");
        }
        StdOut.println();
    }

    public static int[] deleteDuplicate(int[] arr) {
        //定义一个ArrayList来接收去重后的数据
        ArrayList<Integer> copyOfWhite = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            //如果当前位和下一位不重复就添加到列表中去
            if (arr[i] != arr[i + 1])
                copyOfWhite.add(arr[i]);
        }
        //最后一位添加到列表中去
        copyOfWhite.add(arr[arr.length - 1]);
        //创建新的整型数组，来接收去重后的数据
        int[] whitelist = new int[copyOfWhite.size()];
        for (int i = 0; i < copyOfWhite.size(); i++) {
            whitelist[i] = copyOfWhite.get(i);
        }
        return whitelist;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            StdOut.print(arr[i] + " ");
        }
        StdOut.println();
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
