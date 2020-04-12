package Algorithms.p_84;

public class FixedCapacityStack<Item> {
    private Item[] a;
    private int N;

    public FixedCapacityStack(int cap){
        // a = new Item[cap]; Java中不允许创建泛型数组，但可声明-第4行
        a = (Item[]) new Object[cap];
    }
    public void push(Item item){
        if (N == a.length){
            resize(2 * a.length);
        }
        a[N++] = item;
    }
    public Item pop(){
        Item item = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length / 4){
            resize(a.length / 2);
        }
        return item;
    }
    public boolean isEmpty(){
        return N == 0;
    }
    public int size(){
        return N;
    }
    private void resize(int max){
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; ++i){
            temp[i] = a[i];
        }
        a = temp;
    }
    public int capacity(){
        return a.length;
    }
    public void print(){
        for (Item e:a){
            System.out.print(e + " ");
        }
    }
}
