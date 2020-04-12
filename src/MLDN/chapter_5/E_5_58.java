package MLDN.chapter_5;

/*
 * 构造代码块优先于构造方法执行，而且每次实例化对象时都会执行构造块中的代码，会执行多次
 */

class Demo1{
    {
        System.out.println("构造代码块");
    }
    public Demo1(){
        System.out.println("构造方法");
    }
}

public class E_5_58 {
    public static void main(String args[]){
        Demo1 demo1 = new Demo1();
        Demo1 demo2 = new Demo1();
        Demo1 demo3 = new Demo1();
    }
}
