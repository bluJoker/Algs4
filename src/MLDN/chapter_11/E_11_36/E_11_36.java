package MLDN.chapter_11.E_11_36;

import java.util.Arrays;

class Student implements Comparable<Student>{
    private String name;
    private int age;
    private float score;
    public Student(String name, int age, float score){
        this.name = name;
        this.age = age;
        this.score = score;
    }
    public String toString(){
        return this.name + "\t\t" + this.age + "\t\t" + this.score;
    }

    //覆写compareTo()方法，实现排序规则
    public int compareTo(Student stu){
        if (this.score > stu.score){
            return 1;
        }else if (this.score < stu.score){
            return -1;
        }else {
            if (this.age > stu.age){
                return 1;
            }
            else if (this.age < stu.age){
                return -1;
            }else {
                return 0;
            }
        }
    }
}

public class E_11_36 {
    public static void main(String[] args){
        Student[] stu = {new Student("张三", 20, 90.0f),
                         new Student("李四", 22, 90.0f),
                         new Student("王五", 20, 99.0f),
                         new Student("赵六", 20, 70.0f),
                         new Student("孙七", 22, 100.0f)};
        Arrays.sort(stu);
        for (Student student:stu){
            System.out.println(student);
        }
    }
}
