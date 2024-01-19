
public class Employee {
    int empid;
    String empname;
    String role;

    public Employee(int empid,String empname,String role) {
        this.empid = empid;
        this.empname = empname;
        this.role = role;
    }
    public void display_info()
    {
        System.out.println("empid is : "+ empid +", with empname is : "+ empname +" and role :" + role );
    }
    public static void main(String args[]) {
        System.out.println("Employee details");
        //here when we create a object of a class, the constructor is defined.
        Employee emp = new Employee(335,"Max Payne","Developer");
        emp.display_info();
    }
}
