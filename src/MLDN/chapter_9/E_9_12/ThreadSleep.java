package MLDN.chapter_9.E_9_12;

class MyThread implements Runnable{
    public void run(){
        for (int i=0; i<5; i++){
            try {
                Thread.sleep(1000);
            }catch (Exception e){}
            System.out.println(Thread.currentThread().getName() + "运行, i= " + i);
        }
    }
}

public class ThreadSleep {
    public static void main(String[] args) {
        MyThread my = new MyThread();
        new Thread(my, "thread").start();
    }
}
