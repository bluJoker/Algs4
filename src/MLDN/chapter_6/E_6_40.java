package MLDN.chapter_6;

/*
* 设计模式--代理设计
* 真实主题完成的只是上网的最基本功能，而代理主题要做比真实主题更多的业务相关的操作
* */
interface Network{
    public abstract void browse();
}

class Real implements Network{
    public void browse(){
        System.out.println("上网浏览信息");
    }
}

class Proxy implements Network{
    private Network network;
    public Proxy(Network network){
        this.network = network;
    }
    public void check(){
        System.out.println("检查用户是否合法");
    }
    public void browse(){
        this.check();  //代理完成的额外的一些操作
        this.network.browse();   //代理操作真实主题
    }
}

public class E_6_40 {
    public static void main(String args[]){
        Network net = new Proxy(new Real());
        net.browse();
    }
}
