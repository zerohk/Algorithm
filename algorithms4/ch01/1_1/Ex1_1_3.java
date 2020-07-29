import edu.princeton.cs.algs4.StdOut;

public class Ex1_1 {
    /**
     * 1.1.3
     * 编写一个程序，从命令行得到三个整数参数。
     * 如果它们都相等则打印 equal，否则打印
     * not equal。
     **/
    public static void isEqual(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a == b && a == c && b == c) {
            StdOut.println("equal");
        }
        else {
            StdOut.println("not equal");
        }
    }
    
    public static void main(String[] args) {
            isEqual(args); 
   }
}
