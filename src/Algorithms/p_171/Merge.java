package Algorithms.p_171;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.io.File;

public class Merge {
    private static Comparable[] aux; //归并所需的辅助数组
    public static void sort(Comparable[] a){
        aux = new Comparable[a.length];
        sort(a, 0, a.length-1);
    }

    private static void sort(Comparable[] a, int lo, int hi){
        if (hi <= lo){
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid+1, hi);
        merge(a, lo, mid, hi);
    }
    private static void merge(Comparable[] a, int lo, int mid, int hi){
        int i = lo, j = mid+1;
        // 将a[lo...hi]复制到aux[lo...hi]
        for (int k = lo; k <= hi; k++){
            aux[k] = a[k];
        }
        // 方法在归并时进行了4个条件判断：左半边用尽(取右半边的元素)、右半边用尽(取左半边的元素)、
        // 右半边的当前元素小于左半边的当前元素(取右半边的元素)以及右半边的当前元素大于左半边的当前元素(取左半边的元素)
        for (int k = lo; k <= hi; k++){
            if (i > mid){
                a[k] = aux[j++];
            }else if (j > hi){
                a[k] = aux[i++];
            }else if (less(aux[j], aux[i])){
                a[k] = aux[j++];
            }else {
                a[k] = aux[i++];
            }
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
    public static void main(String[] args) {
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
