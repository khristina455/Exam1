
public class Employee {
    private String Name;
    private double Salary;
    private Type Position;
    private int InclomeCompany = Main.rnd(115000, 140000);
    public Employee(String Name, double Salary, Type Position) {
        this.Name = Name;
        this.Salary = Salary;
        this.Position = Position;
    }
    public double getMonthSalary() {
        return Salary;
    }
    public String getName() {
        return Name;
    }
    public int getIncomeCompany() {
        return InclomeCompany;
    }
    public void addSalary(int n) {
        if (n > 10000000 && Position == Type.TopManager) {
            Salary += 1.5 * Salary;
        }
        if (Position == Type.Manager) {
            Salary += 0.005 * InclomeCompany;
        }
    }

}
