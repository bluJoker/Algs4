package Algorithms.p_95;

import java.util.Iterator;

public class Queue<T> implements Iterable<T>{
    private class Node{
        T item;
        Node next;
    }
    private Node first;
    private Node last;
    private int N;
    public boolean isEmpty(){
        return first == null;
    }
    public int size(){
        return N;
    }
    public void enqueue(T item){
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()){
            first = last;
        }else {
            oldlast.next = last;
        }
        N++;
    }
    public T dequeue(){
        T item = first.item;
        first = first.next;
        if (isEmpty()){
            last = null;
        }
        N--;
        return item;
    }
    public void print(){
        for (Node node = first; node != null; node = node.next){
            System.out.print(node.item + "  ");
        }
    }

    public Iterator<T> iterator(){
        return new ListIterator();
    }
    private class ListIterator implements Iterator<T>{
        private Node current = first;
        public boolean hasNext(){
            return current != null;
        }
        public T next(){
            T item = current.item;
            current = current.next;
            return item;
        }
        public void remove(){}
    }
}
