package MLDN.chapter_6.E_6_46.equals;

class Person{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Person)){ //这样写是否是最好的写法见coreJava_p168
            return false;
        }
        Person person = (Person)obj;
        if (this.name.equals(person.name) && (this.age == person.age)){
            return true;
        }else {
            return false;
        }
    }
}

public class E_6_46 {
    public static void main(String args[]){
        Person per1 = new Person("张三",30);
        Person per2 = new Person("张三", 30);
        System.out.println(per1.equals(per2) ? "per1 == per2" : "per1 != per2");
        System.out.println(per1.equals("hello") ? "per1 == hello" : "per1 != hello");
    }
}
