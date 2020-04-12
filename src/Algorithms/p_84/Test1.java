package Algorithms.p_84;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        FixedCapacityStack<String> s = new FixedCapacityStack<String>(100);
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
        s.print();
    }
}

// 输入：to be or not to - be - - that - - - is 0