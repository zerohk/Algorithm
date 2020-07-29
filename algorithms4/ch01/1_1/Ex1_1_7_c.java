import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_7_c {
    public static void main(String[] args) {
        //1.1.7 c
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        StdOut.println(sum);//10000
     }
}
