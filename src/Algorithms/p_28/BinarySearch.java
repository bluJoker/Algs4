package Algorithms.p_28;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BinarySearch {
    public static int rank(int key, int[] a){
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]){
                hi = mid - 1;
            }else if (key > a[mid]){
                lo = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) throws Exception{
        // readInts()方法的注释：
        // @deprecated Replaced by {@code new In(filename)}.{@link #readAllInts()}.
        //int[] whitelist = In.readInts(args[0]);

        int[] whitelist = new In(args[0]).readAllInts();
        Arrays.sort(whitelist); // 二分查找只能对已有序数据进行查找

        String path = File.separator + "Users" + File.separator + "matteo"
                + File.separator + "Algorithms" + File.separator + "algs4-data"
                + File.separator + "largeT.txt";
        InputStream input = new FileInputStream(path);

        //将标准输入流重定向到tinyT.txt文件
        //API: static void setIn(InputStream in)
        //     //Reassigns the "standard" input stream.
        System.setIn(input);

        // 标准输入流最重要的特点是这些值会在你的程序读取它们之后消失p_23
        while (!StdIn.isEmpty()){
            int key = StdIn.readInt(); // 从标准输入流中获取数据
            if (rank(key, whitelist) < 0){ // 在whitelist中查找是否有key，没有返回-1
                StdOut.println(key);
            }
        }
        input.close();
    }
}


//有输入参数：args[0]
//需要在Run/Edit Configurations/Program arguments中写入参数(此处为路径名称)。如有多个参数，用分号(;)分隔
