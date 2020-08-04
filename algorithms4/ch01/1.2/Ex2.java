import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_2_2 {
    public static void main(String[] args) {
        /**
         * 1.2.2 编写一个 Interval1D 的用例，从命令行接受一个整数 N。从标准输入中读取 N 个间隔（每个间隔
         * 由一对 double 值定义）并打印出所有相交的间隔对。
         * **/
        //从命令行接收一个整数N
        int N = Integer.parseInt(args[0]);
        //声明一个数组，接收生成的一维间隔
        Interval1D[] interval1DS = new Interval1D[N];
        //
        for (int i = 0; i < N; i++) {
            double lo = StdIn.readDouble();
            double hi = StdIn.readDouble();
            interval1DS[i] = new Interval1D(lo, hi);
        }
        //查找相交的间隔并打印输出
        if (N > 2) {
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (interval1DS[i].intersects(interval1DS[j]))
                        StdOut.println(interval1DS[i] + " intersects " + interval1DS[j]);
                }
            }
        }

    }
}
