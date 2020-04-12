package coreJava.chapter_4.E_4_2;

//import java.time.LocalDate;
import java.time.*;

class Employee{
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
    public LocalDate getHireDay(){
        return this.hireDay;
    }
    public void raiseSalary(double byPercent){
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }

    // 方法可以访问所属类的所有对象的私有数据(other)
    public boolean equals(Employee other){
        return this.name.equals(other.name);
    }
}

public class E_4_2 {
    public static void main(String args[]){
        Employee[] staff = new Employee[4];

        staff[0] = new Employee("Carl Craker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
        staff[3] = new Employee("Carl Craker", 50001, 1989, 1, 17);

        for (Employee e:staff){
            e.raiseSalary(5);
        }

        for (Employee e:staff){
            System.out.println("name= " + e.getName() + ", salary= " + e.getSalary()
               + ",hireDay= " + e.getHireDay());
        }

        System.out.println("equals?: " + staff[0].equals(staff[3]));
    }
}
