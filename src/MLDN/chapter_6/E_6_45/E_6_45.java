package MLDN.chapter_6.E_6_45;

class Person{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "姓名：" + this.name + "，年龄：" + this.age;
    }
}

public class E_6_45 {
    public static void main(String args[]){
        Person per = new Person("zhangsan", 30);
        System.out.println(per);
    }
}
