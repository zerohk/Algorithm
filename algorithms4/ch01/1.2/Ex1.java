import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex1_2_1 {
    public static void main(String[] args) {
        /**
         *1.2.1 编写一个 Point2D 的用例，从命令行接受一个整数 N。在单位正方形中生成 N 个随机点，然后计
         * 算两点之间的最近距离。
         * **/
        //从命令行接收一个整数N
        int N = Integer.parseInt(args[0]);
        //设置x，y轴范围
        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1);
        //设置画笔大小
        StdDraw.setPenRadius(.005);
        //声明一个Point2D数组接收生成的点
        Point2D[] points = new Point2D[N];
        //随机生成N个点
        for (int i = 0; i < N; i++) {
            double x = StdRandom.random();
            double y = StdRandom.random();
            points[i] = new Point2D(x, y);
            points[i].draw();
        }
        //计算距离最小的两个点，并打印出这个距离
        if (N > 1) {
            double min = points[0].distanceTo(points[1]);
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (points[i].distanceTo(points[j]) < min)
                        min = points[i].distanceTo(points[j]);
                }
            }
            StdOut.printf("Min distance :%.5f", min);
        }
    }
}
