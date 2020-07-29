import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_9 {
    public static void main(String[] args) {
        /**
         *1.1.9 编写一段代码，将一个正整数 N 用二进制表示并转换为一个 String 类型的值 s
         * **/
        //从命令行获取一个整数
        int i = Integer.parseInt(args[0]);
        String s = toBinaryString(i);
        StdOut.printf("%d转换为二进制为：", i);
        StdOut.println(s);
    }

    public static String toBinaryString(int N) {
        String s = "";
        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
        return s;
    }
}
