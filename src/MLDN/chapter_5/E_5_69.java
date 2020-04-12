package MLDN.chapter_5;

/*
* 在外部访问内部类
* 1、外部类.内部类 内部类对象 = 外部类实例.new 内部类();
* 2、内部类定义之后，生成的class文件是以Outer$Inner.class的形式存在的，
*    在Java中只要在文件中存在$，则在程序中应将其替换为"."
*/

class Outer{
    private String info = "Hello_World!!!";
    class Inner{
        public void print(){
            System.out.println(info);
        }
    }
}

public class E_5_69 {
    public static void main(String args[]){
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
        in.print();
    }
}
