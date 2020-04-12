package MLDN.chapter_6.E_6_33;

/*
* 在fun()方法中因为要调用各个子类自己的方法，所以必须进行对象的向下转型，
* 但是为了保证程序在运行时不出现类转换异常，所以在发生向下转型前要使用instanceof关键字判断是哪个子类的实例，
* 以保证程序的正确运行*/

class A{
    public void fun1(){
        System.out.println("A --> public void fun1()");
    }
    public void fun2(){
        this.fun1();
    }
}

class B extends A{
    public void fun1(){
        System.out.println("B --> public void fun1()");
    }
    public void fun3(){
        System.out.println("B --> public void fun3()");
    }
}

class C extends A{
    public void fun1(){
        System.out.println("C --> public void fun1()");
    }
    public void fun5(){
        System.out.println("C --> public void fun5()");
    }
}

public class E_6_33 {
    public static void main(String args[]){
        fun(new B());
        fun(new C());
    }
    public static void fun(A a){ //此处已发生对象向上转型
        a.fun1();
        if (a instanceof B){
            B b = (B)a;
            b.fun3();
        }
        if (a instanceof C){
            C c = (C)a;
            c.fun5();
        }
    }
}
