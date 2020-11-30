
package model;



import java.util.ArrayList;

public class SoccerClub {

    private static final int TEAMS_SIZE = 2;
    private String clubName;
    private int nit;
    private String foundationDate;
    
    private ClubTeam[] clubTeams;
    private ArrayList <Employee> employees;

    private String exist = "Empleado existe";

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

        clubTeams = new ClubTeam[TEAMS_SIZE];

        clubTeams[0] = new ClubTeam ("Team A");
        clubTeams[1] = new ClubTeam ("Team B");

        employees =  new ArrayList<>();
    }

    //test method
    public SoccerClub() {
        clubName = "Fosfotos";
        nit = 1234;
        foundationDate = "12/08/1967";

        clubTeams = new ClubTeam[TEAMS_SIZE];
        clubTeams[0] = new ClubTeam ("Zucaritas");
        clubTeams[1] = new ClubTeam ("Chocapics");

        employees =  new ArrayList<>();
    }

    // -------------------- Menu Operations -------------------------

    //Player
    public String addEmployee(String employeeName, int id, double salary, int shirtNumber, int scoredGoals, double averageMark, int roleNum){

        String message = "No se pudo añadir el jugador";
        boolean add = true;

        Employee newEmployee = new Player(employeeName, id, salary, shirtNumber, scoredGoals, averageMark, roleNum);

        for(int i = 0; i < employees.size() ; i++ ){
            if(id == employees.get(i).getId()){
                add = false;
                message = exist;
            }
        }
        if (add){
            employees.add(newEmployee);
            message = "Jugador añadido";
        }
        return message;
    }

    public String addEmployee(String employeeName, int id, double salary, int experienceYears, int achivedChampionships,
    int teamsInCharge){

        String message = "No se pudo añadir el entrenador";
        boolean add = true;

        Employee newEmployee = new HeadCoach(employeeName, id, salary, experienceYears, achivedChampionships, teamsInCharge);

        for(int i = 0; i < employees.size() ; i++ ){
            if(id == employees.get(i).getId()){
                add = false;
                message = exist;
            }
        }

        if (add){
            employees.add(newEmployee);
            message = "Entrenador añadido";
        }
        return message;
    }

    public String addEmployee(String employeeName, int id, double salary, int experienceYears, String isProfessional, int expertiseNum){

        String message = "No se pudo añadir el asistente";
        boolean add = true;

        Employee newEmployee = new AssitanCoach(employeeName, id, salary, experienceYears, isProfessional, expertiseNum);

        for(int i = 0; i < employees.size() ; i++ ){
            if(id == employees.get(i).getId()){
                add = false;
                message = exist;
            }
        }

        if (add){
            employees.add(newEmployee);
            message = "Asistente añadido";
        }
        return message;
    }
    
    public String fireEmployeeInfo(int id){

        String message = "Empleado no encontrado";
      
            for(int i = 0 ; i < employees.size() ; i++ ){
                if (  employees.get(i) != null   &&   employees.get(i).getId() == id ){
                    message = "Eliminado";
                    employees.remove(i);
                }
            }
          
        return message;
    }

    public String showClubInfo (){
        String message = "*********** Información Club ***********" + "\n";

        message += "** Club nombre" + getClubName() + "\n";
        message += "** Club fecha de dundación" + getFoundationDate() + "\n";
        message += "** Club NIT" + getNit() + "\n";


        message += "----------- Club Teams" + "\n";
        message +=  clubTeams[0].showTeamInfo() + "\n";
        message +=  clubTeams[1].showTeamInfo() + "\n";

        message += "----------- Club Employees: " + employees.size() + "\n";
        message += employeesInfo();



        return message;
    }

    private String employeesInfo (){
        String message = "";

        for(int i = 0 ; i < employees.size() ; i++ ){
            if(employees.get(i) instanceof HeadCoach){
                message  = message + employees.get(i).showInfo() + "\n";
            }
        }

       for(int i = 0 ; i < employees.size() ; i++ ){
            if(employees.get(i) instanceof AssitanCoach){
                message  = message + employees.get(i).showInfo() + "\n";
                }
        }

        for(int i = 0 ; i < employees.size() ; i++ ){
            if(employees.get(i) instanceof Player){
                message  = message + employees.get(i).showInfo() + "\n";
            }
        }

       return message;
    }

    public String showTeamInfo (String letter){
        String message = "No encontrado";

        if(letter.equals("A") || letter.equals("a")){
           message = clubTeams[0].showTeamInfo();
        }
        
        if(letter.equals("B") || letter.equals("b") ){
          message = clubTeams[1].showTeamInfo();
        }

        return message;
    }

    public String showEmployeeInfo(int id){

        String message = "Empleado no encontrado";

        
            for(int i = 0 ; i < employees.size() ; i++ ){
                if (  employees.get(i) != null   &&   employees.get(i).getId() == id ){
                    message = employees.get(i).showInfo();
                }
            }
          
        return message;
    }

    // -------------------- Auxiliar Operations -------------------------

    public String addTeam(String teamName) {
        String message = "No añadido";
        boolean add = false;

        ClubTeam newteam = new ClubTeam(teamName);

        for(int i = 0; i < TEAMS_SIZE ; i++){
            if( !add && clubTeams[i] != null ){
                clubTeams[i] = newteam;
                add = true;
                message = "Añadido"; 
            }
        }
        return message;
    }


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
