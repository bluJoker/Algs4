package MLDN.chapter_5;

import java.util.PrimitiveIterator;

class Person{
    private String name;
    private int age;
    private Book book;
    public Person(String name, int age){
        this.setName(name);
        this.setAge(age);
    }
    public String getName(){
        return this.name;
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
    public Book getBook(){
        return this.book;
    }
    public void setBook(Book book){
        this.book = book;
    }
}

class Book{
    private String title;
    private float price;
    private Person person;
    public Book(String title, float price){
        this.setTitle(title);
        this.setPrice(price);
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public float getPrice(){
        return this.price;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public Person getPerson(){
        return this.person;
    }
    public void setPerson(Person person){
        this.person = person;
    }
}

public class E_5_40 {
    public static void main(String args[]){
        Person per = new Person("张三", 30);
        Book bk = new Book("JAVA SE核心开发", 90.0f);
        per.setBook(bk);   //设置两个对象间的关系：一个人有一本书
        bk.setPerson(per); //设置两个对象间的关系：一本书属于一个人

        System.out.println("从人找到书 --> 姓名：" + per.getName() +
                ", 年龄：" + per.getAge() + ", 书名：" + per.getBook().getTitle() +
                ", 价格：" + per.getBook().getPrice());
        System.out.println("从书找到人 --> 书名：" + bk.getTitle() +
                ", 价格：" + bk.getPrice() + ", 所属人名：" + bk.getPerson().getName() +
                ", 所属人年龄：" + bk.getPerson().getAge());
    }
}
