import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_7_a {
    public static void main(String[] args) {
        /**
         * 1.1.7分别给出以下代码段打印出的值
         * **/
         
        //1.1.7 a
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001)
             t = (9.0 / t + t) / 2.0;
        StdOut.printf("%.5f\n", t);//3.00009
    }
}
