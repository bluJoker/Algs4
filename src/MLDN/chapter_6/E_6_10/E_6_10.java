package MLDN.chapter_6.E_6_10;

//要在子类的方法中访问父类的方法，则使用super关键字

class Person{
    public void print(){
        System.out.println("Person-->void print()");
    }
}

class Student extends Person{
    public void print(){
        super.print();  // 去掉super则会优先从子类中查找到print方法，会递归调用，且无结束条件，故为死循环
        System.out.println("Student-->void print()");
    }
}

public class E_6_10 {
    public static void main(String args[]){
        Student stu = new Student();
        stu.print();
    }
}
