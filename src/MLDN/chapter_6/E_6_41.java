package MLDN.chapter_6;

/*设计模式--适配器设计
* 场景：当接口中定义的抽象方法过多，但是在子类中又用不到这么多抽象方法。
* 思路：一个接口首先被一个抽象类(适配器类)先实现，并在此抽象类中实现接口的全部抽象方法(方法体为空)，
*      而以后的子类直接继承此抽象类，就可以有选择地覆写所需要的方法*/

interface Window{
    public abstract void open();
    public abstract void close();
    public abstract void activated();
    public abstract void iconified();
    public abstract void deiconified();
}

/* 因为WindowImpl子类要覆写Window接口的全部抽象方法，而现在WindowImpl子类继承WindowAdapter抽象类，
 * 故WindowAdapter抽象类要覆写Window接口的全部抽象方法
 *
 * 缺少则报错：
 * Error:(26, 1) java: MLDN.chapter_6.WindowImpl不是抽象的,
 * 并且未覆盖MLDN.chapter_6.Window中的抽象方法deiconified()
 * */
abstract class WindowAdapter implements Window{
    public void open(){};
    public void close(){};
    public void activated(){};
    public void iconified(){};
    public void deiconified(){};
}

class WindowImpl extends WindowAdapter{
    public void open(){
        System.out.println("窗口打开");
    }
    public void close(){
        System.out.println("窗口关闭");
    }
}

public class E_6_41 {
    public static void main(String args[]){
        Window win = new WindowImpl();
        win.open();
        win.close();
    }
}
