package Algorithms;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class sort_training {
    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }
    public static void exch(Comparable[] a, int i, int j){ // 传递数组的引用，可交换其中的元素
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void show(Comparable[] a){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void sort(Comparable[] a){
        // selection
        /*for (int i = 0; i < a.length; i++){
            int min = i;
            for (int j = i+1; j < a.length; j++){
                if (less(a[j], a[min])){
                    min = j;
                }
            }
            exch(a, i, min);
        }*/
        // insertion
        for (int i = 1; i < a.length; i++){
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--){
                exch(a, j, j-1);
            }
        }
    }
    public static void main(String[] args) {
        Integer[] a = {5, 2, 4, 6, 1, 3};
        sort(a);
        show(a);
    }
}
