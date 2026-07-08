
public class Employee extends Person {
    private String employeeId;

    public Employee(String name, int age, String employeeId, String department) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void manageEmployee() {
        System.out.println("Managing employee: " + getName());
    }
    
}
