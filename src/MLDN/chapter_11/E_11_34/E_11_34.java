package MLDN.chapter_11.E_11_34;

//Cloneable接口是标识接口，表示一种能力
class Person implements Cloneable{
    private String name;
    public Person(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        return super.toString() + "  姓名：" + this.name;
    }

    //Object类中clone()方法是protected的，故继承后要扩大权限为public
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class E_11_34 {
    public static void main(String[] args) throws Exception{
        Person p1 = new Person("张三");
        Person p2 = (Person) p1.clone();
        Person p3 = p1;
        p2.setName("李四");
        System.out.println("p1|- " + p1);
        System.out.println("p2|- " + p2);
        System.out.println("p3|- " + p3);
        System.out.println(p1==p2 ? "==" : "!=");
        System.out.println(p1==p3 ? "==" : "!=");
    }
}
