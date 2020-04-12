package Algorithms.p_138;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class TestUF {
    public static void main(String[] args) throws Exception{
        String path = File.separator + "Users" + File.separator + "matteo" + File.separator
                + "Algorithms" + File.separator + "algs4-data" + File.separator + "largeUF.txt";
        InputStream input = new FileInputStream(path);
        System.setIn(input);
        int N = StdIn.readInt();
        UF uf = new UF(N);
        while (!StdIn.isEmpty()){
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)){
                continue;
            }
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + " components");
    }
}
