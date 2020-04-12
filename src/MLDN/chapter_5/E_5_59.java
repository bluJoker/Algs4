package MLDN.chapter_5;

/*
 * 静态代码块优先于主方法执行，而在类中定义的静态代码块会优先于构造块执行，
 * 而且不管有多少个对象产生，静态代码块只执行一次
 */

class Demo2{
    static {
        System.out.println("2_类中的静态代码块");
    }
    {
        System.out.println("3_构造代码块");
    }
    public Demo2(){
        System.out.println("4_构造方法");
    }
}

public class E_5_59 {
    static {
        System.out.println("1_main方法外的静态代码块");
    }
    public static void main(String args[]){
         new Demo2();
         new Demo2();
         new Demo2();
    }
}