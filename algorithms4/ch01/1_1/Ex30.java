import edu.princeton.cs.algs4.StdOut;

public class Ex30 {
    public static void main(String[] args) {
        /**
         *1.1.29 编写一段程序，创建一个 N× N 的布尔数组 a[][]。其中当 i 和 j 互质时（没有相同
         * 因子）， a[i][j] 为 true，否则为 false。
         * **/
        //公因数只有1的两个非零自然数，叫做互质数。
        boolean[][] a = new boolean[5][5];
        productArr(a);
        printArray(a);
    }

    public static void productArr(boolean[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (isPrime(i, j))
                    a[i][j] = true;
                else a[i][j] = false;
            }
        }
    }

    //判断是否互为质数
    public static boolean isPrime(int i, int j) {
        // //0和任何数都不互质
        // if (i == 0 || j == 0)
        //     return false;
        // //1和任何数都互质
        // if (i == 1 || j == 1)
        //     return true;
        //调用欧几里得算法，如果最大公因数为1，则两数互质
        if (gcd(i, j) == 1)
            return true;
        else return false;

    }

    //欧几里得算法，计算两数最大公约数
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    //打印数组
    public static void printArray(boolean[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //为了让输出左对齐，做个判断
                if (arr[i][j])
                    StdOut.print(arr[i][j] + "  ");
                else
                    StdOut.print(arr[i][j] + " ");
            }
            StdOut.println();
        }
    }

}
/**
 * false true  false false false 
 * true  true  true  true  true  
 * false true  false true  false 
 * false true  true  false true  
 * false true  false true  false 
 **/
