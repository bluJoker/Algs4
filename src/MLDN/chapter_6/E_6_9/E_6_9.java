package MLDN.chapter_6.E_6_9;

/*
* 子类覆写的方法不能拥有比父类方法更加严格的访问权限
* */
class Person{
    public void print(){
        System.out.println("Person-->void print()");
    }
}

class Student extends Person{
    //void print(){
        //System.out.println("Student-->void print()");
    //}
}

public class E_6_9 {
    public static void main(String args[]){
        Student stu = new Student();
    }
}
