import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
    public static void main(String[] args){
       Company company = new Company();
       for (int i = 0; i < 180; ++i) {
           company.hire(new Employee("Tom", rnd(20000, 50000), Type.Operator));
       }
        for (int i = 0; i < 80; ++i) {
            company.hire(new Employee("Boba", rnd(60000, 90000), Type.Manager));
        }
        for (int i = 0; i < 10; ++i) {
            company.hire(new Employee("Biba", rnd(100000, 130000), Type.TopManager));
        }
       //company.printEmpoloyees();
        for (int i = 10; i <= 15; i++) {
            System.out.println("Список " + i + " зарплат по убыванию:");
            List<Employee> list = new ArrayList<Employee>();
            list = company.getTopSalaryStaff(i);
            for (int j = 0; j < i; j++) {
                System.out.println(list.get(j).getMonthSalary() + " руб.");
            }
            System.out.println();
        }
        System.out.println("Список " + 30 + " зарплат по возрастанию:");
        List<Employee> list = new ArrayList<Employee>();
        list = company.getLowerSalaryStaff(30);
        for (int j = 0; j < 30; j++) {
            System.out.println(list.get(j).getMonthSalary() + " руб.");
        }
        System.out.println();
        for(int i = 0; i < 135; i++){
            company.fire(rnd(0, 270 - i - 1));
        }
        for (int i = 10; i <= 15; i++) {
            System.out.println("Список " + i + " зарплат по убыванию:");
            List<Employee> list2 = new ArrayList<Employee>();
            list2 = company.getTopSalaryStaff(i);
            for (int j = 0; j < i; j++) {
                System.out.println(list2.get(j).getMonthSalary() + " руб.");
            }
            System.out.println();
        }
        System.out.println("Список " + 30 + " зарплат по возрастанию:");
        List<Employee> list2 = new ArrayList<Employee>();
        list2 = company.getLowerSalaryStaff(30);
        for (int j = 0; j < 30; j++) {
            System.out.println(list2.get(j).getMonthSalary() + " руб.");
        }
        System.out.println();
    }
}
