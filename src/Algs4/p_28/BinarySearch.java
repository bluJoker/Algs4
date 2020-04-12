package Algs4.p_28;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinarySearch {
    public static int rank(int key, int[] a){
        int lo = 0;
        int hi = a.length - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            }else if (key > a[mid]) {
                lo = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) throws Exception{
        String path = File.separator + "Users" + File.separator + "matteo" + File.separator + "Algorithms" +
                File.separator + "algs4-data" + File.separator + "tinyW.txt";
        InputStream input = new FileInputStream(path);
        System.setIn(input);
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        str = buf.readLine();
        System.out.println(str);
    }
}
