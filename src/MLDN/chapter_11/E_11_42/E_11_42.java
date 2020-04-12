package MLDN.chapter_11.E_11_42;

import java.util.Observable;
import java.util.Observer;

class House extends Observable{
    private float price;
    public House(float price){
        this.price = price;
    }
    public float getPrice(){
        return this.price;
    }
    public void setPrice(float price){
        //每一次修改的时候都应该引起观察者的注意
        super.setChanged(); //设置变化点
        super.notifyObservers(price); //价格改变，通知观察者
        this.price = price;
    }
    public String toString(){
        return "价格：" + this.price;
    }
}

class HousePriceObserver implements Observer{
    private String name;
    public HousePriceObserver(String name){
        this.name = name;
    }
    public void update(Observable o, Object arg){
        //System.out.println("1. " + o);
        //System.out.println("2. " + arg);
        if (arg instanceof Float){
            System.out.print(this.name + "观察到价格更改为：");
            System.out.println(((Float) arg).floatValue());
        }
    }
}


public class E_11_42 {
    public static void main(String[] args){
        House h = new House(1000000);
        HousePriceObserver hpo1 = new HousePriceObserver("购房者A");
        HousePriceObserver hpo2 = new HousePriceObserver("购房者B");
        HousePriceObserver hpo3 = new HousePriceObserver("购房者C");
        h.addObserver(hpo1);
        h.addObserver(hpo2);
        h.addObserver(hpo3);
        System.out.println("房子价格改变前：" + h);
        h.setPrice(6666666);
        System.out.println("房子价格改变后：" + h);
    }
}
