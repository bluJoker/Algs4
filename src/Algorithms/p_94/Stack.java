package Algorithms.p_94;

public class Stack<T> {
    private class Node{
        T item;
        Node next;
    }
    private Node first;
    private int N;

    public boolean isEmpty(){
        return first == null;
    }
    public int size(){
        return N;
    }
    public void push(T item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }
    public T pop(){
        T item = first.item;
        first = first.next;
        N--;
        return item;
    }
    public void print(){
        for (Node node = first; node != null; node = node.next){
            System.out.print(node.item + "  ");
        }
    }
}
