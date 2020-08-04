import edu.princeton.cs.algs4.StdOut;

public class Ex11 {
    public static void main(String[] args) {
        /**
         *1.1.11 编写一段代码，打印出一个二维布尔数组的内容。其中，使用 * 表示真，空格表示假。
         * 打印出行号和列号
         * **/
        //定义一个四行五列的二维布尔数组
        Boolean[][] arr = {
                { true, false, false, false, true },
                { false, true, false, false, false },
                { true, true, false, true, true },
                { false, true, true, true, true }
        };
        printArray(arr);
    }

    public static void printArray(Boolean[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                StdOut.printf("第%d行，第%d列:", i + 1, j + 1);
                if (arr[i][j])
                    StdOut.print("*     ");
                if (!arr[i][j])
                    StdOut.print("      ");
            }
            StdOut.println();
        }
    }
}
/***
    第1行，第1列:*     第1行，第2列:      第1行，第3列:      第1行，第4列:      第1行，第5列:*     
    第2行，第1列:      第2行，第2列:*     第2行，第3列:      第2行，第4列:      第2行，第5列:      
    第3行，第1列:*     第3行，第2列:*     第3行，第3列:      第3行，第4列:*     第3行，第5列:*     
    第4行，第1列:      第4行，第2列:*     第4行，第3列:*     第4行，第4列:*     第4行，第5列:*     
**/
