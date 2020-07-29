import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_13 {
    public static void main(String[] args) {
        /**
         *1.1.13 编写一段代码，打印出一个 M 行 N 列的二维数组的转置（交换行和列）。
         * **/
        //定义一个五行，四列的二维整形数组，并初始化
        int[][] arr = {
                { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 },
                { 5, 5, 5, 5 }
        };
        //打印原始数组
        StdOut.println("原始数组：");
        printArray(arr);
        //转置数组
        int[][] transArr = transpose(arr);
        //打印转置后的数组
        StdOut.println("转置后的数组：");
        printArray(transArr);
    }

    //打印数组
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                StdOut.print(arr[i][j] + " ");
            }
            StdOut.println();
        }
    }

    //数组转置
    public static int[][] transpose(int[][] arr) {
        //传入一个M行N列的数组，转置后是一个N行M列的数组
        int M = arr.length;
        int N = arr[0].length;
        //定义一个新的数组，用来表示转置后的数组
        int[][] result = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                result[i][j] = arr[j][i];
            }
        }
        return result;
    }
}
/**
 * 原始数组：
 * 1 1 1 1 
 * 2 2 2 2 
 * 3 3 3 3 
 * 4 4 4 4 
 * 5 5 5 5 
 * 转置后的数组：
 * 1 2 3 4 5 
 * 1 2 3 4 5 
 * 1 2 3 4 5 
 * 1 2 3 4 5 
 * **/
