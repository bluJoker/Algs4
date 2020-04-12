package MLDN.chapter_6.E_6_54;

/*
 * 匿名内部类
 * */

interface A{
    public abstract void printInfo();
}

class X{
    public void fun1(){
        this.fun2(new A() {  //接口本身是不能直接进行实例化的，所以在接口实例化后面要有大括号，用于实现接口中的抽象方法
            @Override
            public void printInfo() {
                System.out.println("Hello world!");
            }
        });
    }
    public void fun2(A a){
        a.printInfo();
    }
}

public class E_6_54 {
    public static void main(String args[]){
        new X().fun1();
    }
}
