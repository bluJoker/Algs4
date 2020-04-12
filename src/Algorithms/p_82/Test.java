package Algorithms.p_82;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        FixedCapacityStackOfStrings s = new FixedCapacityStackOfStrings(100);
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
    }
}
