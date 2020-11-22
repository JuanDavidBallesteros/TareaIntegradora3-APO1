package model;

public abstract class Employee {

    private String employeeName;
    private int id;
    private double salary;

    // show info abstrac
    /**
     * Abtract show information <br>
     * <b>pre:</b>  <br>
     * <b>post:</b> 
     */
    public abstract String showInfo();

    public Employee(String employeeName, int id, double salary) {
        this.employeeName = employeeName;
        this.id = id;
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    
    
    
}
