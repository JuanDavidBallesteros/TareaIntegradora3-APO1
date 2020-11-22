package model;

public class SoccerClub {

    private static final int TEAMS_SIZE = 2;

    private String clubName;
    private int nit;
    private String foundationDate;
    
    private ClubTeam[] teams;

    // -------------------- constructor -------------------------
    /**
     * Cosntructor SoccerClub Object <br>
     * <b>pre:</b> Create and SoccerClub object, this is the place where players, coachs and teams exist. Atributes not null <br>
     * <b>post:</b> SoccerClub created
     * @param clubName The club name in the app. clubName !=null
     * @param nit The club ID. nit !=null
     * @param foundationDate The date of club foundation. foundationDate !=null
     */
    public SoccerClub(String clubName, int nit, String foundationDate) {
        this.clubName = clubName;
        this.nit = nit;
        this.foundationDate = foundationDate;

        teams = new ClubTeam[TEAMS_SIZE];
    }

    //tess method
    public SoccerClub() {
        clubName = "Fosfotos";
        nit = 1234;
        foundationDate = "12/08/1967";

        teams = new ClubTeam[TEAMS_SIZE];

       
    }

    // -------------------- Auxiliar Operations -------------------------

    // -------------------- getters / settes -------------------------

    /**
     * Get clubName <br>
     * <b>pre:</b> Get clubName to pass as parameter. Soccer club must be created. <br>
     * <b>post:</b> clubName
     */
    public String getClubName() {
        return clubName;
    }

    /**
	 * Set clubName  <br>
	 * <b>pre:</b> Set the club name. Soccer club must be created. <br>
	 * <b>post:</b> Atribute updated
     * @param clubName An atribute of the object. clubName != null
	 */
    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    /**
     * Get nit <br>
     * <b>pre:</b> Get nit to pass as parameter. Soccer club must be created.<br>
     * <b>post:</b> nit
     */
    public int getNit() {
        return nit;
    }

    /**
	 * Set nit  <br>
	 * <b>pre:</b> Set the nit. Soccer club must be created. <br>
	 * <b>post:</b> Atribute updated
     * @param nit An atribute of the object. nit != null
	 */
    public void setNit(int nit) {
        this.nit = nit;
    }

    /**
     * Get foundationDate <br>
     * <b>pre:</b> Get foundationDate to pass as parameter. Soccer club must be created. <br>
     * <b>post:</b> foundationDate
     */
    public String getFoundationDate() {
        return foundationDate;
    }

    /**
	 * Set foundationDate  <br>
	 * <b>pre:</b> Set the foundation date. Soccer club must be created. <br>
	 * <b>post:</b> Atribute updated
     * @param foundationDate An atribute of the object. foundationDate != null
	 */
    public void setFoundationDate(String foundationDate) {
        this.foundationDate = foundationDate;
    }

    
    
}
