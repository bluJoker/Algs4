package Algorithms.p_82;

public class FixedCapacityStackOfStrings {
    private String[] a;
    private int N;

    public FixedCapacityStackOfStrings(int cap){
        a = new String[cap];
    }
    public void push(String item){
        a[N++] = item;
    }
    public String pop(){
        return a[--N];
    }
    public boolean isEmpty(){
        return N == 0;
    }
    public int size(){
        return N;
    }
}
