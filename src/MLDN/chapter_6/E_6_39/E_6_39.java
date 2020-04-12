package MLDN.chapter_6.E_6_39;

/*
* 和不使用工厂类的区别在于取得实例的过程不太一样，因为接口对象的实例是通过工厂取得的，
* 这样以后如果再有子类扩充，直接修改工厂类即可根据标记得到相应的实例，灵活性较高，不需要修改主方法客户端*/

interface Fruit{
    public abstract void eat();
}

class Apple implements Fruit{
    public void eat(){
        System.out.println("eat apple");
    }
}
class Orange implements Fruit{
    public void eat(){
        System.out.println("eat orange");
    }
}

class Factory{
    public static Fruit getInstance(String classname){
        Fruit f = null;
        if ("apple".equals(classname)){
            f = new Apple();
        }
        if ("orange".equals(classname)){
            f = new Orange();
        }
        return f;
    }
}

public class E_6_39 {
    public static void main(String args[]){
        Fruit f = Factory.getInstance(args[0]);
        f.eat();
    }
}
