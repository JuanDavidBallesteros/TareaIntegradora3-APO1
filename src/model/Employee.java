package model;

public abstract class Employee {

    private String employeeName;
    private int id;
    private double salary;
    private boolean isActive;

    // show info abstrac
    /**
     * Abtract show information <br>
     * <b>pre:</b>  <br>
     * <b>post:</b> 
     */
    public abstract String showInfo();


    /**
     * Cosntructor Coach <br>
     * <b>pre:</b> Create an coach object. <br>
     * <b>post:</b> Coach created
     * 
     * @param employeeName Creation date. lineUpDate !=null
     * @param id  The identification number. id !=null
     * @param salary    The wage. salary !=null
     */
    public Employee(String employeeName, int id, double salary) {
        this.employeeName = employeeName;
        this.id = id;
        this.salary = salary;
        isActive = false;
    }

    public String status(){
        String status ="";

        if(isActive){
            status = "Activo ";
        } else {
            status = "Inactivo";
        }

        return status;
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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    
    
    
    
}
