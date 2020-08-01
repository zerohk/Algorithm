import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BruteForceSearch {
    public static void main(String[] args) {
        /**
         *1.1.38 根据 1.1.10.4 节给出的暴力查找法编写一个程序 BruteForceSearch，在你
         * 的计算机上比较它和 BinarySearch 处理 largeW.txt 和 largeT.txt 所需的时间。
         * **/
        //获取运行前系统时间
        long before = System.currentTimeMillis();
        //从标准输入读取数据
        int[] whitelist = In.readInts(args[0]);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            //打印白名单中数值
            if (rank(key, whitelist) != -1) {
                StdOut.print(key + " ");
            }
        }
        //获取运行后系统时间
        long after = System.currentTimeMillis();
        StdOut.printf("总共运行了%d分", (after - before) / 60000);
    }
    /**
    *   总共运行了38分
    **/
