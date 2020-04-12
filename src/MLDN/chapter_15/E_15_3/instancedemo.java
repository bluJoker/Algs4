package MLDN.chapter_15.E_15_3;

import java.lang.reflect.Constructor;

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.setName(name);
        this.setAge(age);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String toString(){
        return "姓名：" + this.name + "，年龄：" + this.age;
    }
}

public class instancedemo {
    public static void main(String[] args) {
        Class<?> c = null;
        try {
            c = Class.forName("MLDN.chapter_15.E_15_3.Person");
        }catch (Exception e){
            e.printStackTrace();
        }
        Person per = null;
        Constructor<?> cons[] = null;
        cons = c.getConstructors();
        try {
            per = (Person) cons[0].newInstance("wangw5920", 28);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(per);
    }
}
