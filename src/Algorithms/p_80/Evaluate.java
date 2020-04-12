package Algorithms.p_80;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

public class Evaluate {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();

        Scanner scan = new Scanner(System.in);
        //boolean has = scan.hasNext();
        while (!scan.hasNext("e")){
        //while (!StdIn.isEmpty()){
            String s = scan.next();
            //String s= StdIn.readString();
            if (s.equals("("));
            else if (s.equals("+")){
                ops.push(s);
            }else if (s.equals("-")){
                ops.push(s);
            }else if (s.equals("*")){
                ops.push(s);
            }else if (s.equals("/")){
                ops.push(s);
            }else if (s.equals("sqrt")){
                ops.push(s);
            }else if (s.equals(")")){
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")){
                    v = vals.pop() + v;
                }else if (op.equals("-")){
                    v = vals.pop() - v;
                }else if (op.equals("*")){
                    v = vals.pop() * v;
                }else if (op.equals("/")){
                    v = vals.pop() / v;
                }else if (op.equals("sqrt")){
                    v = Math.sqrt(v);
                }
                vals.push(v);
            }else {
                vals.push(Double.parseDouble(s));
            }
        }
        //System.out.println(vals.pop());
        StdOut.println(vals.pop());
    }
}
