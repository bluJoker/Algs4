package MLDN.chapter_5.E_5_67;

import edu.princeton.cs.algs4.Out;

class Outer{
    private String info = "Hello world";
    public void fun(){
        new Inner(this).print();
    }
    public String getInfo(){   //增加一个getter方法取得info内容
        return this.info;
    }
}

class Inner{
    private Outer out = null;
    public Inner(Outer out){
        this.out = out;
    }
    public void print(){
        System.out.println(new Outer().getInfo());  //此处实例化了一个外部类对象
    }
}

public class InnerClassDemo02 {
    public static void main(String[] args) {
        new Outer().fun();
    }
}
