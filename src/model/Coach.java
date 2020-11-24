package model;

public abstract class Coach extends Employee {

    private int experienceYears;

    public Coach(String employeeName, int id, double salary, int experienceYears) {
        super(employeeName, id, salary);
        this.experienceYears = experienceYears;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

}
