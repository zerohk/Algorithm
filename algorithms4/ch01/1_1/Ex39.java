import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class Ex39 {
    public static void main(String[] args) {
        /**
         *1.1.39 编写一个使用 BinarySearch 的程序，它从命令行接受一个整型参数 T，并会分别针
         * 对 N=10^3、 10^4、 10^5 和 10^6 将以下实验运行 T 遍：生成两个大小为 N 的随机 6 位正整数数组并找
         * 出同时存在于两个数组中的整数的数量。打印一个表格，对于每个 N，给出 T 次实验中该数量
         * 的平均值。
         * **/
        //定义一个数组，分别存放N = 1E2,1E3,1E4,1E5
        int[] arrN = { 1000, 10000, 100000, 1000000 };
        //从命令行接收参数T
        int T = Integer.parseInt(args[0]);
        //打印表头
        StdOut.printf("     N             Avg \n");
        //依次对给定的N执行下列操作
        for (int i = 0; i < arrN.length; i++) {
            //定义一个大小为T的数组，来接收T次实验中每次两个数组中相同整数的数量
            int[] count = new int[T];
            int num = 0;
            //执行T次
            for (int j = 0; j < T; j++) {
                //生成两个大小为arrN[i]的随机6位正整数数组
                int[] arrA = productArr(arrN[i]);
                int[] arrB = productArr(arrN[i]);
                //对两个数组进行排序
                Arrays.sort(arrA);
                Arrays.sort(arrB);
                //找出同时存在两数组中的整数数量,存入count数组中
                num += commonCount(arrA, arrB);
            }
            count[i] = num;
            //对于每个 N，求出 T 次实验中该数量（两个数组相同整数数量）的平均值。
            double avg = calAvg(count);
            //打印N和avg
            StdOut.printf("%7d     %12.5f\n", arrN[i], avg);
        }
    }

    //生成大小为N的随机六位正整数数组
    public static int[] productArr(int N) {
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = StdRandom.uniform(100000, 1000000);
        }
        return arr;
    }

    //找出同时存在两数组中的整数的的数量
    public static int commonCount(int[] arrA, int[] arrB) {
        int commonNum = 0;
        for (int i = 0; i < arrA.length; i++) {
            if (rank(arrA[i], arrB) != -1)
                commonNum++;
        }
        return commonNum;
    }

    //求数组平均值
    public static double calAvg(int[] arr) {
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    //
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

/**
 *      N             Avg 
 *    1000          1.60000
 *   10000        115.60000
 *  100000      10510.60000
 * 1000000     670750.20000
 **/
