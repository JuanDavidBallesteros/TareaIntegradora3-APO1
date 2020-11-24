package model;

public class HeadCoach extends Coach implements SoccerWord {

    private int achivedChampionships;
    private int teamsInCharge;



    public HeadCoach(String employeeName, int id, double salary, int experienceYears, int achivedChampionships,
            int teamsInCharge) {
        super(employeeName, id, salary, experienceYears);
        this.achivedChampionships = achivedChampionships;
        this.teamsInCharge = teamsInCharge;
    }



    @Override
    public String showInfo() {

        String message = "";
        
        message = "********** Jugador **********" + "\n";
        message += "** Nombre: " + getEmployeeName()  + "\n";
        message += "** ID: " + getId()  + "\n";
        message += "** Salario: " + getSalary() + "\n";
        message += "** Años de experiencia: " + getExperienceYears()  + "\n";
        message += "** Premios: " + getAchivedChampionships()  + "\n";
        message += "** Equipos a cargo: " + getTeamsInCharge()  + "\n";
        message += "*****************************" + "\n";
        
        return message;
    }

    @Override
    public double calculateMarketPrice() {
        double price = 0;
        
        return 0;
    }

    @Override
    public double calculateStars() {
        double stars = 0;
       
        return 0;
    }



    public int getAchivedChampionships() {
        return achivedChampionships;
    }

    public void setAchivedChampionships(int achivedChampionships) {
        this.achivedChampionships = achivedChampionships;
    }

    public int getTeamsInCharge() {
        return teamsInCharge;
    }

    public void setTeamsInCharge(int teamsInCharge) {
        this.teamsInCharge = teamsInCharge;
    }

    

    

    
    
}
