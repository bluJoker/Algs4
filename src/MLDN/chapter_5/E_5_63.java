package MLDN.chapter_5;

/* 单例设计模式
 * Singleton类只有一个实例化对象
 * 只要将构造方法私有化，就可以控制实例化对象的产生
*/

class Singleton{
    private static Singleton instance = new Singleton();
    public static Singleton getInstance() {
        return instance; //此处不能使用this.instance，
                              // 会返错：Error:(6, 16) java: 无法从静态上下文中引用非静态变量this
    }

    private Singleton(){
    }
    public void print(){
        System.out.println("Hello World!");
    }
}

public class E_5_63 {
    public static void main(String args[]){
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();
        instance1.print();
        instance2.print();
        instance3.print();
    }
}
