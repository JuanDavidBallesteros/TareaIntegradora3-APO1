package model;

public class HeadCoach extends Coach implements SoccerWord {

    private int achivedChampionships;
    private int teamsInCharge;

    /**
     * Cosntructor Coach <br>
     * <b>pre:</b> Create an coach object. <br>
     * <b>post:</b> Coach created
     * 
     * @param employeeName Creation date. lineUpDate !=null
     * @param id  The identification number. id !=null
     * @param salary    The wage. salary !=null
     * @param experienceYears    Years of experience. experienceYears !=null
     * @param achivedChampionships    Championsships won. achivedChampionships !=null
     * @param teamsInCharge    Number of teams in charge. teamsInCharge !=null
     */
    public HeadCoach(String employeeName, int id, double salary, int experienceYears, int achivedChampionships,
            int teamsInCharge) {
        super(employeeName, id, salary, experienceYears);
        this.achivedChampionships = achivedChampionships;
        this.teamsInCharge = teamsInCharge;
    }

    /**
     * Show information <br>
     * <b>pre:</b> Show Assitan coach information. Assitan object must be created <br>
     * <b>post:</b> Description of the assitan Coach
     */
    @Override
    public String showInfo() {

        String message = "";

        message = "********** Entrenador **********" + "\n";
        message += "** Nombre: " + getEmployeeName() + "\n";
        message += "** ID: " + getId() + "\n";
        message += "** Salario: " + getSalary() + "\n";
        message += "** Años de experiencia: " + getExperienceYears() + "\n";
        message += "** Premios: " + getAchivedChampionships() + "\n";
        message += "** Equipos a cargo: " + getTeamsInCharge() + "\n";
        message += "**** Valor en el mercado: " + calculateMarketPrice() + "\n";
        message += "**** Estrellas: " + calculateStars() + "\n";
        message += "****** Estado: " + status() + "\n";
        message += "*****************************" + "\n";

        return message;
    }


    /**
     *Calculate price <br>
     * <b>pre:</b> Return the price int the soccer word. Head Coach object must be created <br>
     * <b>post:</b> price
     */
    @Override
    public double calculateMarketPrice() {
        double price = 0;

        price = getSalary() * 10 + getExperienceYears() * 100 + getAchivedChampionships() * 50;

        return price;
    }

    /**
     *Calculate Stars <br>
     * <b>pre:</b> Return the stars int the soccer word. Head Coach object must be created <br>
     * <b>post:</b> stars
     */
    @Override
    public double calculateStars() {
        double stars = 0;

         stars = 5 + getAchivedChampionships()/10; 

        return stars;
    }

    /**
     * Get achivedChampionships <br>
     * <b>pre:</b> Return the achivedChampionships string. Head Coach object must be created <br>
     * <b>post:</b> achivedChampionships attribute
     */
    public int getAchivedChampionships() {
        return achivedChampionships;
    }

    /**
     * set achivedChampionships <br>
     * <b>pre:</b> Recibe the number. Coach object must be created <br>
     * <b>post:</b> achivedChampionships changed
     * @param achivedChampionships    Experiene years of the coach. Head coach !=null
     */
    public void setAchivedChampionships(int achivedChampionships) {
        this.achivedChampionships = achivedChampionships;
    }

    /**
     * Get teamsInCharge <br>
     * <b>pre:</b> Return the teamsInCharge string. Head Coach object must be created <br>
     * <b>post:</b> teamsInCharge attribute
     */
    public int getTeamsInCharge() {
        return teamsInCharge;
    }

    /**
     * set teamsInCharge <br>
     * <b>pre:</b> Recibe the number. Coach object must be created <br>
     * <b>post:</b> teamsInCharge changed
     * @param teamsInCharge    Experiene years of the coach. Head coach !=null
     */
    public void setTeamsInCharge(int teamsInCharge) {
        this.teamsInCharge = teamsInCharge;
    }

}
