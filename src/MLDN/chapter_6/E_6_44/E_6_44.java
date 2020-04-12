package MLDN.chapter_6.E_6_44;

class Demo{
}

public class E_6_44 {
    public static void main(String args[]){
        Demo d = new Demo();
        System.out.println("不加toString()输出：" + d);
        System.out.println("加toString()输出：" + d.toString());
    }
}
