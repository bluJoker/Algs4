package MLDN.chapter_15.E_15_20_1;

interface Subject{
    public String say(String name, int age);
}
class RealSubject implements Subject{
    public String say(String name, int age){
        return "姓名：" + name + "，年龄：" + age;
    }
}
class ProxySubject implements Subject{
    private Subject subj;
    public ProxySubject(Subject subj){
        this.subj = subj;
    }
    public String say(String name, int age){
        return this.subj.say(name, age);
    }
}

public class Proxy {
    public static void main(String[] args) {
        Subject subj = new ProxySubject(new RealSubject());
        System.out.println(subj.say("汪伟", 29));
    }
}
