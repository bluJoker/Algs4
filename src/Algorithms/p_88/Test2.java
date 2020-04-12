package Algorithms.p_88;

import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        ResizingArrayStack<String> s = new ResizingArrayStack<String>();
        Scanner scan = new Scanner(System.in);

        while (!scan.hasNext("0")){
            String item = scan.next();
            if (!item.equals("-")){
                s.push(item);
            }else if (!s.isEmpty()){
                System.out.print(s.pop() + " ");
            }
        }
        System.out.println("(" + s.size() + " left on stack)");
        System.out.println("capacity: " + s.capacity());
        for (String str:s){
            System.out.print(str + "  ");
        }
        System.out.println();
        s.print();
    }
}
