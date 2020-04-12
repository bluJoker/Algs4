package TiJ.p_337;

import edu.princeton.cs.algs4.In;

interface Interface{
    void doSomething();
    void somethingElse(String arg);
}

class RealObject implements Interface{
    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("somethingElse" + arg);
    }
}

class SimpleProxy implements Interface{
    private Interface iface;

    public SimpleProxy(Interface iface) {
        this.iface = iface;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        iface.doSomething();
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("SimpleProxy somethingElse" + arg);
        iface.somethingElse(arg);
    }
}

public class SimpleProxyDemo {

}
