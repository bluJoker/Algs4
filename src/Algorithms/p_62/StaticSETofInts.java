package Algorithms.p_62;

import java.util.Arrays;

public class StaticSETofInts {
    private int[] a;
    public StaticSETofInts(int[] keys){
        a = new int[keys.length];
        for (int i = 0; i < keys.length; ++i){
            a[i] = keys[i];
        }
        Arrays.sort(a);
    }

    public boolean contains(int key){
        return rank(key) != -1;
    }

    //rank方法被封装(private)。因为rank算法的实现可能后期会更改，但作用不变，故向外提供contains接口(不变)
    private int rank(int key){
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
