package Algorithms.p_94;

import java.util.Scanner;

public class TestStack {
    public static void main(String[] args) {
        Stack<String> s = new Stack<String>();
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
        s.print();
    }
}
