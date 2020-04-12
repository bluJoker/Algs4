package Algorithms.p_157;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.io.File;

public class Insertion {
    public static void sort(Comparable[] a){
        /*for (int i = 1; i < a.length; ++i){
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--){
                exch(a, j, j-1);
            }
        }*/

        //用移动代替交换操作，，这样访问数组的次数就能减半。因为移动操作1个元素，而交换操作2个元素
        for (int i = 1; i < a.length; ++i){
            Comparable key = a[i];
            int j = i - 1;
            while (j >= 0 && less(key, a[j])){ //必须为>=
                a[j+1] = a[j];
                j = j - 1;
            }
            a[j+1] = key;
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

        //IDEA要打开断言需要设置：Run/Edit Configurations/VM options/输入：-enableassertions或-ea(缩写)
        assert isSorted(a);
        show(a);
    }
}
