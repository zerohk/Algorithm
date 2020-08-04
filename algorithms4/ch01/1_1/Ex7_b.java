import edu.princeton.cs.algs4.StdOut;

public class Ex7_b {
    public static void main(String[] args) {
        // 1.1.7 b
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.println(sum);//499500
     }
}
