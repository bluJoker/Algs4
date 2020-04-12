package MLDN.chapter_9.E_9_6;

class MyThread extends Thread{
    private int ticket = 5;
    private String name;
    public MyThread(String name){
        this.name = name;
    }
    public void run(){
        for (int i = 0; i < 100; ++i){
            if(ticket > 0){
                System.out.println("name= " + name + ", ticket= " + ticket--);
            }
        }
    }
}

public class ThreadDemo04 {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("线程A");
        MyThread mt2 = new MyThread("线程B");   // 使用同一个Runnable接口实例化不同的Thread对象，从而进行资源共享
        MyThread mt3 = new MyThread("线程C");
        mt1.start();
        mt2.start();
        mt3.start();
    }
}
