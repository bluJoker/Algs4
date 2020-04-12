package MLDN.chapter_10.E_10_38;

interface Info{ //标识接口
}

class Contact implements Info{
    private String address;
    private String telephone;
    private String zipcode;

    public Contact(String address, String telephone, String zipcode){
        this.setAddress(address);
        this.setTelephone(telephone);
        this.setZipcode(zipcode);
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getTelephone(){
        return this.telephone;
    }
    public void setTelephone(String telephone){
        this.telephone = telephone;
    }
    public String getZipcode(){
        return this.zipcode;
    }
    public void setZipcode(String zipcode){
        this.zipcode = zipcode;
    }
    public String toString(){
        return "联系方式：\n" +
                "\t|- 联系电话：" + this.telephone + "\n" +
                "\t|- 联系地址：" + this.address + "\n" +
                "\t|- 联系编码：" + this.zipcode;
    }
}

class Introduction implements Info{
    private String name;
    private String sex;
    private int age;

    public Introduction(String name, String sex, int age){
        this.setName(name);
        this.setSex(sex);
        this.setAge(age);
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSex(){
        return this.sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String toString(){
        return "基本信息：\n" +
                "\t|- 姓名：" + this.name + "\n" +
                "\t|- 性别：" + this.sex + "\n" +
                "\t|- 年龄：" + this.age;
    }
}

//Person类中info属性可能是基本信息Introduction类，也可能是联系方式Contact类，故info属性使用泛型
class Person<T extends Info>{ //指定上限，必须是Info接口的子类
    private T info;
    public Person(T info){
        this.setInfo(info);
    }
    public T getInfo(){
        return this.info;
    }
    public void setInfo(T info){
        this.info = info;
    }
    public String toString(){
        return this.info.toString();
    }
}

public class E_10_38 {
    public static void main(String[] args){
        Person<Contact> per1 = new Person<Contact>(new Contact("北京市","01051283346", "10008"));
        Person<Introduction> per2 = new Person<Introduction>(new Introduction("汪伟", "男", 29));
        System.out.println(per1);
        System.out.println(per2);
    }
}
