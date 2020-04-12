package MLDN.chapter_6.E_6_34;

abstract class A{
    public abstract void print();
}

class B extends A{
    public void print(){
        System.out.println("hello world");
    }
}

public class E_6_34 {
    public static void main(String args[]){
        A a = new B();
        a.print();
    }
}
