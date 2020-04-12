package coreJava.chapter_6.E_6_4;

public class CloneTest {
    public static void main(String[] args) {
        try {
            Employee original = new Employee("John Q. public", 50000);
            original.setHireDay(2000, 1, 1);
            Employee copy = original.clone();
            copy.raiseSalary(10);
            copy.setHireDay(2002, 12, 31);
            System.out.println("original=" + original);
            System.out.println("copy=" + copy);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}

/*
* 如果Employee不实现Cloneable接口，返错如下：
* java.lang.CloneNotSupportedException: coreJava.chapter_6.E_6_4.Employee
	at java.lang.Object.clone(Native Method)
	at coreJava.chapter_6.E_6_4.Employee.clone(Employee.java:32)
	at coreJava.chapter_6.E_6_4.CloneTest.main(CloneTest.java:8)
*/