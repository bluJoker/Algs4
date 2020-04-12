package MLDN.chapter_15.E_15_20_2;

import java.lang.reflect.InvocationHandler;

interface Subject{
    public String say(String name, int age);
}
class RealSubject implements Subject{
    public String say(String name, int age){
        return "姓名：" + name + "，年龄：" + age;
    }
}

public class MyInvocationHandle {
    public static void main(String[] args) {
    }
}
