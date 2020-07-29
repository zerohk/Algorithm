
import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_11 {
    public static void main(String[] args) {
        /**
         *1.1.11 编写一段代码，打印出一个二维布尔数组的内容。其中，使用 * 表示真，空格表示假。
         * 打印出行号和列号
         * **/
        //定义一个四行五列的二维字符串数组，其中的元素分别用"*"," "表示
        String[][] arr = {
                { "*", " ", " ", " ", "*" },
                { "*", "*", " ", "*", " " },
                { " ", " ", "*", "*", " " },
                { "*", " ", " ", "*", "*" }
        };
        printArray(arr);
    }

    public static void printArray(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                StdOut.printf("第%d行，第%d列:", i + 1, j + 1);
                if (arr[i][j].equals("*"))
                    StdOut.print("其值为真     ");
                if (arr[i][j].equals(" "))
                    StdOut.print("其值为假     ");
            }
            StdOut.println();
        }
    }
}
