package Algorithms.p_62;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Whitelist {
    public static void main(String[] args) throws Exception{
        int[] w = new In(args[0]).readAllInts();
        String path = File.separator + "Users" + File.separator + "matteo"
                + File.separator + "Algorithms" + File.separator + "algs4-data"
                + File.separator + "tinyT.txt";
        InputStream input = new FileInputStream(path);

        //将标准输入流重定向到tinyT.txt文件
        System.setIn(input);

        StaticSETofInts set = new StaticSETofInts(w);

        while (!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if (!set.contains(key)){
                StdOut.println(key);
            }
        }
    }
}
