import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;

public class Company {
    private List<Employee> list = new ArrayList<Employee>();
    private int income;
    public void hire(Employee newEmployee) {
        list.add(newEmployee);
        newEmployee.addSalary(getIncome());
    }

    public void hireAll(List<Employee> newEmployees) {
        for (int i = 0; i < newEmployees.size(); i++) {
            hire(newEmployees.get(i));
        }
    }

    public void fire(int n) {
        list.remove(list.get(n));
    }

    public int getIncome() {
        for (int i = 0; i < list.size(); i++) {
            income += list.get(i).getIncomeCompany();
        }
        return income;
    }
    public void SortSalary() {
        Collections.sort(list, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                if (e1.getMonthSalary() == e2.getMonthSalary())
                    return 0;
                else if (e1.getMonthSalary() > e2.getMonthSalary())
                    return 1;
                else
                    return -1;
            }
        });
    }
    public List<Employee> getTopSalaryStaff(int count) {
        SortSalary();
        List<Employee> ans = new ArrayList<Employee>();
        for (int i = list.size() - 1; i >= list.size() - count; i--) {
            ans.add(list.get(i));
        }
        return ans;
    }
    public List<Employee> getLowerSalaryStaff(int count) {
        SortSalary();
        List<Employee> ans = new ArrayList<Employee>();
        for (int i = 0; i < count; i++) {
            ans.add(list.get(i));
        }
        return ans;
    }
    public void printEmpoloyees() {
        for (int i = 0;i < list.size(); i++) {
            System.out.println(list.get(i).getName() + " " + list.get(i).getMonthSalary());
        }
    }

}
