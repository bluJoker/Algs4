package coreJava.chapter_8.E_8_1;

public class Pair<T> {
    private T first;
    private T second;

    public Pair(){
        first = null;
        second = null;
    }
    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    }
    public T getFirst(){
        return this.first;
    }
    public T getSecond(){
        return this.second;
    }
    public void setFirst(T newValue){
        first = newValue;
    }
    public void setSecond(T newValue){
        second = newValue;
    }
}
