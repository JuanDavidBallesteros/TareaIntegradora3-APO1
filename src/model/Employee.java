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

    /**
     * Get status <br>
     * <b>pre:</b> Return the status number. Employee object must be created <br>
     * <b>post:</b> status attribute
     */
    public String status(){
        String status ="";

        if(isActive){
            status = "Activo ";
        } else {
            status = "Inactivo";
        }

        return status;
    }

    /**
     * Get employeeName <br>
     * <b>pre:</b> Return the employeeName number. Employee object must be created <br>
     * <b>post:</b> employeeName attribute
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * set employeeName <br>
     * <b>pre:</b> Recibe the name. Coach object must be created <br>
     * <b>post:</b> employeeName changed
     * @param employeeName    Experiene years of the coach. employeeName !=null
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * Get id <br>
     * <b>pre:</b> Return the id number. Employee object must be created <br>
     * <b>post:</b> id attribute
     */
    public int getId() {
        return id;
    }

    /**
     * set id <br>
     * <b>pre:</b> Recibe the id number. Coach object must be created <br>
     * <b>post:</b> id changed
     * @param id    Experiene years of the coach. id !=null
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get salary <br>
     * <b>pre:</b> Return the salary number. Employee object must be created <br>
     * <b>post:</b> salary attribute
     */
    public double getSalary() {
        return salary;
    }

    /**
     * set salary <br>
     * <b>pre:</b> Recibe the number. Coach object must be created <br>
     * <b>post:</b> salary changed
     * @param salary    Experiene years of the coach. salary !=null
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Get isActive <br>
     * <b>pre:</b> Return the isActive number. Employee object must be created <br>
     * <b>post:</b> isActive attribute
     */
    public boolean isActive() {
        return isActive;
    }

    /**
     * set isActive <br>
     * <b>pre:</b> Recibe the number. Coach object must be created <br>
     * <b>post:</b> isActive changed
     * @param isActive    Experiene years of the coach. isActive !=null
     */
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    
}
