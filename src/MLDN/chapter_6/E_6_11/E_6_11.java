package MLDN.chapter_6.E_6_11;

//子类要访问父类的属性(非private)，则使用super关键字
class Person{
    public String info = "MLDN";
}

class Student extends Person{
    public String info = "LXH";
    public void print(){
        System.out.println("父类中的属性：" + super.info);
        System.out.println("子类中的属性：" + info);
    }
}

public class E_6_11 {
    public static void main(String args[]){
        Student stu = new Student();
        stu.print();
    }
}
