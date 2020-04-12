package Algorithms.p_182;

import edu.princeton.cs.algs4.StdOut;

import java.io.File;

public class Quick {
    public static int recur_num = 0;
    public static void sort(Comparable[] a){
        //StdRandom.shuffle(a);
        sort(a, 0, a.length-1);
    }

    private static void sort(Comparable[] a, int lo, int hi){
        System.out.println("digui" + ++recur_num);
        if (lo < hi){
            int j = partition(a, lo, hi);
            sort(a, lo, j-1);
            sort(a, j+1, hi);
            //lo = j + 1;
        }
    }
    private static int partition(Comparable[] a, int lo, int hi){
        int i = lo, j = hi+1;
        Comparable v = a[lo];
        while (true){
            while (less(a[++i], v)){
                if (i == hi){
                    break;
                }
            }
            while (less(v, a[--j])){
                if (j == lo){
                    break;
                }
            }
            if (i >= j){
                break;
            }
            exch(a, i, j);
        }
        exch(a, lo, j); //此时j是比v小的数中的最大下标值
        return j;
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
    public static void main(String[] args) {
        String path = File.separator + "Users" + File.separator + "matteo" + File.separator
                + "Algorithms" + File.separator + "algs4-data" + File.separator + "words3.txt";
        //InputStream input = new FileInputStream(path);
        //System.setIn(input);

        //String[] a = new In(path).readAllStrings();
        Integer[] a = {50, 10, 90, 30, 70, 40, 80, 60, 20};
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
