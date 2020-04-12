package MLDN.chapter_6;

class Person{
    private String name;
    private int age;
    public Person(){
        System.out.println("父类无参构造方法");
    }
}

class Student extends Person {
    public Student(){
        super(); // 默认隐藏
        System.out.println("子类无参构造方法");
    }
}


public class E_6_7 {
    public static void main(String args[]){
        Student stu = new Student();
    }
}
