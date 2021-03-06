package Algorithms.p_156;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;

import java.io.File;

public class Selection {
    public static void sort(Comparable[] a){
        int N = a.length;
        for (int i = 0; i < N; ++i){
            int min = i;
            for (int j = i + 1; j < N; ++j){
                if (less(a[j], a[min])){
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }
    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }
    public static void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static void show(Comparable[] a){
        for (int i = 0; i < a.length; i++){
            StdOut.print(a[i] + "  ");
        }
        StdOut.println();
    }
    public static boolean isSorted(Comparable[] a){
        for (int i = 1; i < a.length; i++){
            if (less(a[i], a[i-1])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws Exception{
        String path = File.separator + "Users" + File.separator + "matteo" + File.separator
                + "Algorithms" + File.separator + "algs4-data" + File.separator + "words3.txt";
        //InputStream input = new FileInputStream(path);
        //System.setIn(input);

        String[] a = new In(path).readAllStrings();
        //Integer[] a = {8, 4, 5, 6, 3, 9};
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
