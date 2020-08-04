import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Ex29 {
    public static void main(String[] args) {
        /**
         *1.1.29为 BinarySearch 类添加一个静态方法 rank()，它接受一个键和一个整型有序数组（可
         * 能存在重复键）作为参数并返回数组中小于该键的元素数量，以及一个类似的方法 count() 来
         * 返回数组中等于该键的元素的数量。
         * **/
        //从标准输入读取数据，在命令行输入文件名
        //int[] whitelist = In.readInts(args[0]);
        int[] whitelist = { 23, 0, 34, 56, 1, 34, 24, 23, 0, 8, 9, 4, 6, 123 };
        //对白名单数据排序
        Arrays.sort(whitelist);
        //数组中元素都比key小的情况
        int key = 124;
        int low = rank(key, whitelist);
        int high = count(key, whitelist);
        StdOut.printf("比%d小的有%d个\n", key, low);
        StdOut.printf("比%d大的有%d个\n", key, high);
        //数组中元素都比key大的情况
        key = -1;
        low = rank(key, whitelist);
        high = count(key, whitelist);
        StdOut.printf("比%d小的有%d个\n", key, low);
        StdOut.printf("比%d大的有%d个\n", key, high);
        //
        key = 23;
        low = rank(key, whitelist);
        high = count(key, whitelist);
        StdOut.printf("比%d小的有%d个\n", key, low);
        StdOut.printf("比%d大的有%d个\n", key, high);
    }


    //统计小于key的元素的个数
    public static int rank(int key, int[] a) {
        //数组必须是有序的
        int i = 0;
        for (; i < a.length; i++) {
            if (a[i] >= key)
                break;
        }
        return i;
    }

    //统计大于key的元素的个数
    public static int count(int key, int[] a) {
        //数组必须有序
        int count = 0;
        int s = rank(key, a);
        for (; s < a.length; s++) {
            if (a[s] > key)
                count++;
        }
        return count;
    }

}
