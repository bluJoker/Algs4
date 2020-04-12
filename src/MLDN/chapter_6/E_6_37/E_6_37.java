package MLDN.chapter_6.E_6_37;

/*
* 接口的实际应用--制定标准
* 例：对于计算机来说，只要是符合了USB接口标准的设备都能连上计算机
* 接口就是规定出了一个标准，计算机认的只是接口，而对于具体的设备计算机本身并不关心
* */

interface USB{  //定义USB接口--即标准
    public void start();
    public void stop();
}

class Computer{
    public static void plugin(USB usb){   //符合USB接口即标准的设备可以插入计算机，也就是作为计算机插入plugin方法的参数
        usb.start();
        System.out.println("======USB设备开始工作======");
        usb.stop();
    }
}

class Flash implements USB{
    public void start(){
        System.out.println("U盘开始工作");
    }
    public void stop(){
        System.out.println("U盘停止工作");
    }
}

class Printer implements USB{
    public void start(){
        System.out.println("打印机开始工作");
    }
    public void stop(){
        System.out.println("打印机停止工作");
    }
}

public class E_6_37 {
    public static void main(String args[]){
        Computer.plugin(new Flash());
        Computer.plugin(new Printer());
    }
}
