package coreJava.chapter_6.E_6_7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

class TalkingClock{
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep){
        this.interval = interval;
        this.beep = beep;
    }

    public class TimePrinter implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("At the tone, the time is " + new Date());

            //TimePrinter类没有实例域或者名为beep的变量，取而代之的是beep引用了创建TimePrinter的TalkingClock对象的域。
            //即内部类既可以访问自身的数据域，也可以访问创建它的外围类对象的数据域。
            if (TalkingClock.this.beep){
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }

    public void start(){
        ActionListener listener = this.new TimePrinter();
        Timer t = new Timer(interval, listener);
        t.start();
    }
}


public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();

        TalkingClock.TimePrinter listener1 = clock.new TimePrinter();

        JOptionPane.showMessageDialog(null, "Quit Program?");
        System.exit(0);
    }
}
