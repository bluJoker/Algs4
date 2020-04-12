package Design_Patterns.Strategy_Pattern;

interface FlyBehavior {
    public void fly();
}
class FlyNoWay implements FlyBehavior{
    public void fly(){
        System.out.println("I can't fly");
    }
}
class FlyWithWings implements FlyBehavior{
    public void fly(){
        System.out.println("I'm flying!");
    }
}

interface QuackBehavior {
    public void quack();
}
class Quack implements QuackBehavior{
    public void quack(){
        System.out.println("Quack");
    }
}
class MuteQuack implements QuackBehavior{
    public void quack(){
        System.out.println("<< Silence >>");
    }
}

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior; //默认访问修饰符：对本包可见。此处也可为protected，但最好不用

    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){ //设置public方法供外部调用
        quackBehavior.quack();  //鸭子对象不亲自处理呱呱叫行为，而是委托给quackBehavior引用的对象
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
