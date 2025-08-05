public class Employee extends Person{
    private int EmpCode;
    private String designation;
    private float salary;

    public Employee(){
        System.out.println("\nNon-Parameterized Constructor in Employee Class");
    }

    public Employee(int code){
        this.EmpCode =code;
    }

    public int getEmpCode() {
        return EmpCode;
    }

    public String getDesignation() {
        return designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setEmpCode(int empCode) {
        EmpCode = empCode;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void applyForLeave(){
        System.out.println("\nApplying for leave...");
    }

    @Override
    public void displayInfo() {
        System.out.println("\nName:"+getName()+"\nEmpCode:"+getEmpCode()+"\nAge:"+getAge()+"\nDesignation:"+getDesignation()+"\nSalary:"+getSalary()+"\nAddress:"+getAddress());

    }
}
