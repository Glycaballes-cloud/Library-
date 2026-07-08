public class Employee extends Person {
    private String employeeId;

    public Employee(String name, int age, String employeeId) {
        super( name, age);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }
    
    public void manageLibrary() {
        System.out.println("Managing the library by employee: " + getName() + " (ID: " + employeeId + ")");
    }
}
