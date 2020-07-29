import edu.princeton.cs.algs4.StdOut;

public class Ex1_1 {
    /**
     * 1.1.5 编写一段程序，如果 double 类型的变量 x 和 y
     * 都严格位于 0 和 1 之间则打印 true，否则打印false。
     **/
    public static void isIn(String[] args) {
        //从命令行获取两个double变量
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        //判断x，y是否都位于[0.0,1.0]
        if (x >= 0.0 && x <= 1.0 && y >= 0.0 && y <= 1.0) {
            StdOut.println(true);
        }
        else {
            StdOut.println(false);
        }
    }
    
    public static void main(String[] args) {
            isIn(args); 
   }
}
