package MLDN.chapter_9.E_9_7;

/**
 * 使用同一个Runnable接口实例化不同的Thread对象，从而进行资源共享
 * */

class MyThread implements Runnable{
    private int ticket = 5;
    private String name;
    public MyThread(String name){
        this.name = name;
    }
    public void run(){
        for (int i = 0; i < 10; ++i){
            if(ticket > 0){
                System.out.println("name= " + name + ", ticket= " + ticket--);
            }
        }
    }
}

public class RunnableDemo02 {
    public static void main(String[] args) {
        MyThread my1 = new MyThread("线程A");
        //MyThread my2 = new MyThread("线程B");
        Thread t1 = new Thread(my1);   // 使用同一个Runnable接口实例化不同的Thread对象，从而进行资源共享
        //Thread t2 = new Thread(my2);
        Thread t2 = new Thread(my1);
        Thread t3 = new Thread(my1);
        t1.start();
        t2.start();
        t3.start();
    }
}
