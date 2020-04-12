package Algorithms.p_37;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class BruteForceSearch {
    public static int rank(int key, int[] a){
        for (int i = 0; i < a.length; ++i){
            if (key == a[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception{
        int[] whitelist = new In(args[0]).readAllInts();
        Arrays.sort(whitelist); // 二分查找只能对已有序数据进行查找

        String path = File.separator + "Users" + File.separator + "matteo"
                + File.separator + "Algorithms" + File.separator + "algs4-data"
                + File.separator + "largeT.txt";
        InputStream input = new FileInputStream(path);

        //将标准输入流重定向到tinyT.txt文件
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
