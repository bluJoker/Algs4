package coreJava.chapter_5.E_5_1;

public class ManagerTest {
    public static void main(String args[]){
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];
        staff[0] = boss; //此处已进行了向上类型转化，故14行才能进行向下类型转换
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);

        if (staff[1] instanceof Manager){
            Manager boss1 = (Manager)staff[1];
            System.out.println("staff[1] is Manager_class");
        }

        for (Employee e:staff){
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary());
        }
    }
}
