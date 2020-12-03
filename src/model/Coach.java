package model;

public abstract class Coach extends Employee {

    private int experienceYears;

    /**
     * Cosntructor Coach <br>
     * <b>pre:</b> Create an coach object. <br>
     * <b>post:</b> Coach created
     * 
     * @param employeeName Creation date. lineUpDate !=null
     * @param id  The identification number. id !=null
     * @param salary    The wage. salary !=null
     * @param experienceYears    Years of experience. experienceYears !=null
     */
    public Coach(String employeeName, int id, double salary, int experienceYears) {
        super(employeeName, id, salary);
        this.experienceYears = experienceYears;
    }

    /**
     * Get experienceYears <br>
     * <b>pre:</b> Return the experienceYears number. Assitan object must be created <br>
     * <b>post:</b> experienceYears attribute
     */
    public int getExperienceYears() {
        return experienceYears;
    }

    /**
     * set experienceYears <br>
     * <b>pre:</b> Recibe the number. Coach object must be created <br>
     * <b>post:</b> experienceYears changed
     * @param experienceYears    Experiene years of the coach. experienceYears !=null
     */
    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

}
