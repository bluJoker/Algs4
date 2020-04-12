package MLDN.chapter_9.E_9_1;

/**
 * 哪个线程对象抢到了CPU资源，哪个线程就运行
 * */

class MyThread extends Thread{
    private String name;
    public MyThread(String name){
        this.name = name;
    }
    public void run(){
        for (int i = 0; i < 10; ++i){
            System.out.println(name + "运行，i = " + i);
        }
    }
}

public class ThreadDemo01 {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("线程A ");
        MyThread mt2 = new MyThread("线程B ");
        mt1.start(); //线程启动时虽然调用的是start()方法，但实际上调用的却是run()方法定义的主体
        mt2.start();
    }
}
