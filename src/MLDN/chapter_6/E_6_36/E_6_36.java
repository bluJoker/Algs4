package MLDN.chapter_6.E_6_36;

/*
* 抽象类的实际应用--模板设计
* 例：说话功能是人所具有的功能，即模板，具体内容由学生或工人决定
* 日常生活中的表单要填写即为模板
* */

abstract class Person{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public abstract void getContent();
}

class Student extends Person{
    private float score;
    public Student(String name, int age, float score){
        super(name, age);
        this.score = score;
    }
    public void getContent(){
        System.out.println("Student --> name: " + super.getName() + ", 年龄：" + super.getAge() +
                "， 分数：" + this.score);
    }
}

class Worker extends Person{
    private float salary;
    public Worker(String name, int age, float salary){
        super(name, age);
        this.salary = salary;
    }
    public void getContent(){
        System.out.println("Worker --> name: " + super.getName() + ", 年龄：" + super.getAge() +
                "， 薪水：" + this.salary);
    }
}

public class E_6_36 {
    public static void main(String args[]){
        Person per1 = new Student("张三", 20, 99.0f);
        Person per2 = new Worker("李四", 30, 3000.0f);
        per1.getContent();
        per2.getContent();
    }
}
