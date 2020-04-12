package Algorithms.p_95;

import java.util.Scanner;

public class TestQueue {
    public static void main(String[] args) {
        Queue<String> q = new Queue<String>();
        Scanner scan = new Scanner(System.in);

        while (!scan.hasNext("0")){
            String item = scan.next();
            if (!item.equals("-")){
                q.enqueue(item);
            }else if (!q.isEmpty()){
                System.out.print(q.dequeue() + " ");
            }
        }
        System.out.println("(" + q.size() + " left on stack)");
        q.print();
        System.out.println("\n-----Iterator-----");
        for (String str:q){
            System.out.print(str + "  ");
        }
    }
}
