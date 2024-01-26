package Tasks.src.Assignment6;

public class Employee
{
    String empName;
    String empJobTitle;
    double empSalary;

    public Employee(String name, String jobtitle, double salary)
    {
        this.empName = name;
        this.empJobTitle = jobtitle;
        this.empSalary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpJobTitle() {
        return empJobTitle;
    }

    public void setEmpJobTitle(String empJobTitle) {
        this.empJobTitle = empJobTitle;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public void raiseSalary(double percentage)
    {
        double raisedSalary = empSalary * (percentage/100);
        empSalary = empSalary + raisedSalary;
        System.out.println("Employee salary raised by " +percentage+"%. Updated Salary:" +empSalary);
    }

    public void employeeInfo()
    {
        System.out.println("Employee Information: ");
        System.out.println("Name: " +empName);
        System.out.println("Job Title: " +empJobTitle);
        System.out.println("Salary: " +empSalary);
    }

    public static void main(String args[])
    {
        Employee emp = new Employee("Jay","Dev",250000);
        emp.employeeInfo();
        emp.raiseSalary(30);
        emp.employeeInfo();
    }
}
