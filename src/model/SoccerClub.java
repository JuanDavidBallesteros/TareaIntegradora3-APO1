
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

        HeadCoach testCoach = new HeadCoach("Carter", 123, 3452, 6, 5, 1);
        AssitanCoach testAssitan = new AssitanCoach("Pedro", 456, 2432, 4, "si", 2);
        Player testPlayer = new Player("Messi", 789, 3341, 10, 100, 4, 3);

        employees.add(testCoach);
        employees.add(testAssitan);
        employees.add(testPlayer);
    }

    // -------------------- Menu Operations -------------------------
    // option 6

    //Employee object
    public String setEmployeeName (int id, String name){
        String message = "No cambiado";

        for(int i = 0; i < employees.size() ; i++ ){
            if(id == employees.get(i).getId()) {
                message = "Cambiando";  
                employees.get(i).setEmployeeName(name);
            }
        }

        return message;

    }

    public String setEmployeeId (int id, int numb){
        String message = "No cambiado";

        for(int i = 0; i < employees.size() ; i++ ){
            if(id == employees.get(i).getId()) {
                message = "Cambiando";  
                employees.get(i).setId(numb);
            }
        }

        return message;
    }

    public String setEmployeeSalary (int id, float numb){
        String message = "No cambiado";

        for(int i = 0; i < employees.size() ; i++ ){
            if(id == employees.get(i).getId()) {
                message = "Cambiando";  
                employees.get(i).setSalary(numb);
            }
        }
        return message;
    }

    //Coach object
    public String setCoachExperience (int id, int numb){
        String message = "No cambiado";

        for(int i = 0; i < employees.size() ; i++ ){
            if(id == employees.get(i).getId() && employees.get(i) instanceof Coach) {
                Coach coach = (Coach) employees.get(i);
                message = "Cambiado";
                coach.setExperienceYears(numb);
            }
        }
        return message;
    }

    //Head coach object
    public String setCoachChampionships (int id, int numb){
        String message = "No cambiado";

        for(int i = 0; i < employees.size() ; i++ ){
            if(id == employees.get(i).getId() && employees.get(i) instanceof HeadCoach) {
                HeadCoach coach = (HeadCoach) employees.get(i);
                message = "Cambiado";
                coach.setAchivedChampionships(numb);
            }
        }
        return message;
    }

    public String setCoachTeamsInCharge (int id, int numb){
        String message = "No cambiado";

        for(int i = 0; i < employees.size() ; i++ ){
            if(id == employees.get(i).getId() && employees.get(i) instanceof HeadCoach) {
                HeadCoach coach = (HeadCoach) employees.get(i);
                message = "Cambiado";
                coach.setTeamsInCharge(numb);
            }
        }
        return message;
    }

    //Assistan coach object
    public String setAssistanProfssional (int id, String text){
        String message = "No cambiado";

        for(int i = 0; i < employees.size() ; i++ ){
            if(id == employees.get(i).getId() && employees.get(i) instanceof AssitanCoach) {
                AssitanCoach coach = (AssitanCoach) employees.get(i);
                message = "Cambiado";
                coach.setSoccerProfessional(text);
            }
        }
        return message;
    }

    public String setAssistanExpertise (int id, int numb){
        String message = "No cambiado";

        for(int i = 0; i < employees.size() ; i++ ){
            if(id == employees.get(i).getId() && employees.get(i) instanceof AssitanCoach) {
                AssitanCoach coach = (AssitanCoach) employees.get(i);
                message = "Cambiado";
                coach.setExpertise(numb);
            }
        }
        return message;
    }

    //Player Object
    public String setPlayerShirtNumber (int id, int numb){
        String message = "No cambiado";

        for(int i = 0; i < employees.size() ; i++ ){
            if(id == employees.get(i).getId() && employees.get(i) instanceof Player) {
                Player player = (Player) employees.get(i);
                message = "Cambiado";
                player.setShirtNumber(numb);
            }
        }
        return message;
    }

    public String setPalyerScoreGoals (int id, int numb){
        String message = "No cambiado";

        for(int i = 0; i < employees.size() ; i++ ){
            if(id == employees.get(i).getId() && employees.get(i) instanceof Player) {
                Player player = (Player) employees.get(i);
                message = "Cambiado";
                player.setScoredGoals(numb);
            }
        }
        return message;
    }

    public String setPlayerAverageMark (int id, double numb){
        String message = "No cambiado";

        for(int i = 0; i < employees.size() ; i++ ){
            if(id == employees.get(i).getId() && employees.get(i) instanceof Player) {
                Player player = (Player) employees.get(i);
                message = "Cambiado";
                player.setAverageMark(numb);;
            }
        }
        return message;
    }

    public String setPlayerRole (int id, int numb){
        String message = "No cambiado";

        for(int i = 0; i < employees.size() ; i++ ){
            if(id == employees.get(i).getId() && employees.get(i) instanceof Player) {
                Player player = (Player) employees.get(i);
                message = "Cambiado";
                player.setRole(numb);
            }
        }
        return message;
    }

    // Options 1 to 5
    public String takeOutFromTeam(String letter, int id){
        String message = "No encontrado";
        String answer = "Empleado elimido del equipo";
        
        if(letter.equals("A") || letter.equals("a")){
            for(int i = 0 ; i < employees.size() ; i++ ){
                if (  employees.get(i) instanceof Player && employees.get(i).getId() == id ){
                    message = answer;
                    Player player = (Player) employees.get(i);
                    clubTeams[0].getPlayers().remove(player);
                }
                if (  employees.get(i) instanceof AssitanCoach && employees.get(i).getId() == id ){
                    message = answer;
                    AssitanCoach assitant = (AssitanCoach) employees.get(i);
                    clubTeams[0].getAssitants().remove(assitant);
                }
                if (  employees.get(i) instanceof Coach && employees.get(i).getId() == id ){
                    message = answer;
                    clubTeams[0].setCoach(null);
                }     
            }
        }


        if(letter.equals("B") || letter.equals("b")){
            for(int i = 0 ; i < employees.size() ; i++ ){
                if (  employees.get(i) instanceof Player && employees.get(i).getId() == id ){
                    message = answer;
                    Player player = (Player) employees.get(i);
                    clubTeams[1].getPlayers().remove(player);
                }
                if (  employees.get(i) instanceof AssitanCoach && employees.get(i).getId() == id ){
                    message = answer;
                    AssitanCoach assitant = (AssitanCoach) employees.get(i);
                    clubTeams[1].getAssitants().remove(assitant);
                }
                if (  employees.get(i) instanceof Coach && employees.get(i).getId() == id ){
                    message = answer;
                    clubTeams[1].setCoach(null);
                }     
            }
        }
          
        return message;
    }

    //Add coach to team
    public String addCoachToTeam(String letter, int id){
        String message = " No se pudo ajustar el entrenador";
        HeadCoach coach = null;

        if(letter.equals("A") || letter.equals("a")){
            for(int i = 0; i < employees.size() ; i++ ){
                if(id == employees.get(i).getId() && employees.get(i) instanceof HeadCoach) {
                    coach = (HeadCoach) employees.get(i);
                    message = clubTeams[0].setCoach(coach);  
                }
            }
         }
         
         if(letter.equals("B") || letter.equals("b") ){
            for(int i = 0; i < employees.size() ; i++ ){
                if(id == employees.get(i).getId() && employees.get(i) instanceof HeadCoach) {
                    coach = (HeadCoach) employees.get(i);
                    message = clubTeams[1].setCoach(coach);  
                }
            }
         }

        return message;
    }
    //Add assitant to team

    public String addAssitantToTeam(String letter, int id){
        String message = " No se pudo añadir el asistente";
        AssitanCoach assistan = null;

        if(letter.equals("A") || letter.equals("a")){
            for(int i = 0; i < employees.size() ; i++ ){
                if(id == employees.get(i).getId() && employees.get(i) instanceof AssitanCoach) {
                    assistan = (AssitanCoach) employees.get(i);
                    message = clubTeams[0].addAssitantToTeam(assistan);  
                }
            }
         }
         
         if(letter.equals("B") || letter.equals("b") ){
            for(int i = 0; i < employees.size() ; i++ ){
                if(id == employees.get(i).getId() && employees.get(i) instanceof AssitanCoach) {
                    assistan = (AssitanCoach) employees.get(i);
                    message = clubTeams[1].addAssitantToTeam(assistan);  
                }
            }
         }

        return message;
    }

    //Add player to team

    public String addPlayertToTeam(String letter, int id){
        String message = " No se pudo añadir el jugador";
        Player player = null;

        if(letter.equals("A") || letter.equals("a")){
            for(int i = 0; i < employees.size() ; i++ ){
                if(id == employees.get(i).getId() && employees.get(i) instanceof Player) {
                    player = (Player) employees.get(i);
                    message = clubTeams[0].addPlayerToTeam(player);  
                }
            }
         }
         
         if(letter.equals("B") || letter.equals("b") ){
            for(int i = 0; i < employees.size() ; i++ ){
                if(id == employees.get(i).getId() && employees.get(i) instanceof Player) {
                    player = (Player) employees.get(i);
                    message = clubTeams[1].addPlayerToTeam(player);  
                }
            }
         }

        return message;
    }

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
