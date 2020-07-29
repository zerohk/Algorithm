import edu.princeton.cs.algs4.StdOut;

public class Ex1_1 {
    public static void main(String[] args) {
        /**
         *1.1.15 编编写一个静态方法 histogram()，接受一个整型数组 a[] 和一个整数 M 为参数
         * 并返回一个大小为M的数组，其中第i个元素的值为整数i在参数数组中出现的次数。
         * 如果a[]中的值均在0到M-1之间，返回数组中所有元素之和应该和 a.length 相等。
         * histogram:直方图; 矩形图
         * **/
        int[] arr = { 3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 1, 3, 5, 6, 7, 8 };
        //打印原始数组
        StdOut.println("原始数组：");
        printArray(arr);
        //调用histogram()方法，其中M = 17
        int[] result = histogram(arr, 17);
        //打印执行histogram()方法后的数组
        StdOut.println("执行histogram()方法后的数组：");
        printArray(result);

    }

    //打印数组
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    // public static int[] histogram(int[] a, int M) {
    //     int[] result = new int[M];
    //     Arrays.sort(a);
    //     //打印排序后的数组
    //     StdOut.println("排序后的数组：");
    //     printArray(a);
    //     for (int i = 0; i < M; i++) {
    //         int count = 0;
    //         for (int j = 0; j < M; j++) {
    //             if (i == a[j])
    //                 count++;
    //         }
    //         result[i] = count;
    //     }
    //     return result;
    // }

    //改进
    public static int[] histogram(int[] a, int M) {
        int[] result = new int[M];
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0 && a[i] < M)
                result[a[i]]++;//java数组默认赋初值为0
        }
        return result;
    }
}
