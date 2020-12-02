package ui;

import model.*;
import java.util.Scanner;

public class Menu {

    private final static int ADD_EMPLOYEE = 1;
    private final static int FIRE_EMPLOYEE = 2;
    private final static int ALLOCATE_EMPLOYEE_TEAM = 3;
    private final static int TAKEOUT_EMPLOYEE_TEAM = 4;
    private final static int SHOW_PARTICULAR_INFO = 5;
    private final static int EDIT_PARTICULAR_INFO = 6;
    private final static int ADD_LINEUP_TO_TEAM = 7;
    private final static int SHOW_LINEUP_TO_TEAM = 8;
    private final static int ADD_PLAYER_DRESSROOM = 9;
    private final static int ADD_COACH_OFFICE = 10;
    private final static int UBICATION_PLAYER = 11;
    private final static int UBICATION_COAHC = 12;
    private final static int SHOW_CLUB_INFO = 13;
    private final static int EXIT = 14;

    private static Scanner sc = new Scanner(System.in);

    private SoccerClub soccerClub;

    /**
     * Call Main Object <br>
     * <b>pre:</b> Call to create a SoccerClub object. ReadInitialdata must be
     * created <br>
     * <b>post:</b> Soccer Club
     */
    public Menu() {
        // this.soccerClub = readInitialData();
        soccerClub = new SoccerClub();
    }

    /**
     * Call soccer club constructor <br>
     * <b>pre:</b> Call the funtion to create a SoccerClub object. Soccer club
     * consturctor must be created <br>
     * <b>post:</b> Soccer Club
     */
    public SoccerClub readInitialData() {
        System.out.println("Escribe el nombre del club");
        String clubName = (sc.nextLine());

        System.out.println("Escribe el nit del club");
        int nit = Integer.parseInt(sc.nextLine());

        System.out.println("Escribe la fecha de fundación (dd/mm/aaaa)");
        String foundationDate = (sc.nextLine());

        soccerClub = new SoccerClub(clubName, nit, foundationDate);
        return soccerClub;
    }

    // Main menu
    /**
     * Start menu options <br>
     * <b>pre:</b> Print the main menu options<br>
     * <b>post:</b> menu values
     */
    public void showMenu() {
        System.out.println("");
        System.out.println("(1) Para ingresar un nuevo empleado "); // Done
        System.out.println("(2) Para eliminar un empleado "); // Done
        System.out.println("(3) Para asignar un empleado a un equipo "); // Done
        System.out.println("(4) Para quitar a un empleado a un equipo "); // Done
        System.out.println("(5) Para mostrar la información de un empleado o equipo "); // Done
        System.out.println("(6) Para editar la información de un empleado o equipo "); // Done
        System.out.println("(7) Para añadir una alineación de equipo "); // Done
        System.out.println("(8) Para mostrar las alineaciniaciones de un equipo "); // Done
        System.out.println("(9) Para añadir un jugador a camerino "); 
        System.out.println("(10) Para añadir a un entrenador a las oficinas "); // Done
        System.out.println("(11) Para mostrar la ubicación del jugador ");
        System.out.println("(12) Para mostrar la ubicación del entrenador "); // Done
        System.out.println("(13) Para mostrar la información general del club "); // Done
        System.out.println("(14) Para salir "); // Done

        System.out.println("");
    }

    /// -----------------------------------------------------

    public String playerPlace(){
        
        System.out.println("Ingresa el id");
        int id = Integer.parseInt(sc.nextLine());

        return soccerClub.playerDressRoom(id);

    }

    public String addPlayerToDressroom(){
        
        System.out.println("Ingresa el id");
        int id = Integer.parseInt(sc.nextLine());

        return soccerClub.addPlayerToDressRoom(id);

    }

    public String addCoachToOffice(){
        
        System.out.println("Ingresa el id");
        int id = Integer.parseInt(sc.nextLine());

        return soccerClub.addCoachToOffice(id);

    }

    public String coachOffice(){
        
        System.out.println("Ingresa el id");
        int id = Integer.parseInt(sc.nextLine());

        return soccerClub.coachOffice(id);

    }

    public String showLineUpsTeam(){
        
        System.out.println("Selecciona el club club (A - B) ");
        String letter = (sc.nextLine());

        return soccerClub.showLineUps(letter);

    }

    public String addLineUp(){
        String message = "";

        System.out.println("Selecciona el club club (A - B) ");
        String letter = (sc.nextLine());

        System.out.println("Ingresa la formación (4-4-3) ");
        String lineUpNum = (sc.nextLine());

        System.out.println("Ingresa la fecha ");
        String lineUpDate = (sc.nextLine());

        System.out.println("Ingresa el tipo ");

        int typeNum = 0;

        do {
            System.out.println("");

            System.out.println("(1) Pocesión ");
            System.out.println("(2) Contrataque ");
            System.out.println("(3) Presión ");
            System.out.println("(4) Defecto ");

            typeNum = Integer.parseInt(sc.nextLine());

        } while (typeNum > 4 || typeNum < 1);

        typeNum = typeNum - 1;
        

        message = soccerClub.addLineUpToTeam(letter, lineUpDate, lineUpNum, typeNum);
        System.out.println("");

        return message;
    }

    public String editEmployee() {
        String message = "";

        String askId = "Ingrese el id del empleado ";
        String askValue = "ingrese el nuevo valor ";

        System.out.println("(1) Para editar un entrenador ");
        System.out.println("(2) Para editar un asistente ");
        System.out.println("(3) Para editar un jugador ");
        System.out.println("");

        int selection = Integer.parseInt(sc.nextLine());

        if (selection == 1) {
            System.out.println("(1) Para editar nombre ");
            System.out.println("(2) Para editar id ");
            System.out.println("(3) Para editar salario ");
            System.out.println("(4) Para editar años de experiencia ");
            System.out.println("(5) Para editar Campeonatos ganados ");
            System.out.println("(6) Para editar número de equipos acargo ");
            System.out.println("");

            int choice = Integer.parseInt(sc.nextLine());

            System.out.println(askId);
            int id = Integer.parseInt(sc.nextLine());
            int numb = 0;

            System.out.println(askValue);

            switch (choice) {
                case 1:
                    String value = (sc.nextLine());
                    message = soccerClub.setEmployeeName(id, value);
                    break;
                case 2:
                    numb = Integer.parseInt(sc.nextLine());
                    message = soccerClub.setEmployeeId(id, numb);
                    break;

                case 3:
                    float num = Float.parseFloat(sc.nextLine());
                    message = soccerClub.setEmployeeSalary(id, num);
                    break;

                case 4:
                    numb = Integer.parseInt(sc.nextLine());
                    message = soccerClub.setCoachExperience(id, numb);
                    break;

                case 5:
                    numb = Integer.parseInt(sc.nextLine());
                    message = soccerClub.setCoachChampionships(id, numb);
                    break;

                case 6:
                    numb = Integer.parseInt(sc.nextLine());
                    message = soccerClub.setCoachTeamsInCharge(id, numb);
                    break;

                default:
                    message = "Número erroneo ";
                    break;
            }

        }

        if (selection == 2) {
            System.out.println("(1) Para editar nombre ");
            System.out.println("(2) Para editar id ");
            System.out.println("(3) Para editar salario ");
            System.out.println("(4) Para editar años de experiencia ");
            System.out.println("(5) Para editar profesión en el deporte (si-no) ");
            System.out.println("(6) Para editar la especialidad ");
            System.out.println("");

            int choice = Integer.parseInt(sc.nextLine());

            System.out.println(askId);
            int id = Integer.parseInt(sc.nextLine());
            int numb = 0;

            System.out.println(askValue);

            switch (choice) {
                case 1:
                    String value = (sc.nextLine());
                    message = soccerClub.setEmployeeName(id, value);
                    break;
                case 2:
                    numb = Integer.parseInt(sc.nextLine());
                    message = soccerClub.setEmployeeId(id, numb);
                    break;

                case 3:
                    float num = Float.parseFloat(sc.nextLine());
                    message = soccerClub.setEmployeeSalary(id, num);
                    break;

                case 4:
                    numb = Integer.parseInt(sc.nextLine());
                    message = soccerClub.setCoachExperience(id, numb);
                    break;

                case 5:
                    value = (sc.nextLine());
                    message = soccerClub.setAssistanProfssional(id, value);
                    break;

                case 6:

                    do {
                        System.out.println("");
        
                        System.out.println("(1) Ofensiva ");
                        System.out.println("(2) Defensiva ");
                        System.out.println("(3) Pocesión ");
                        System.out.println("(4) Laboratorio ");
        
                        numb = Integer.parseInt(sc.nextLine());
        
                    } while (numb > 4 || numb < 1);
        
                    numb = numb - 1;

                    message = soccerClub.setAssistanExpertise(id, numb);
                    break;

                default:
                    message = "Número erroneo ";
                    break;
            }

        }

        if (selection == 3) {
            System.out.println("(1) Para editar nombre ");
            System.out.println("(2) Para editar id ");
            System.out.println("(3) Para editar salario ");
            System.out.println("(4) Para editar número de la camisa ");
            System.out.println("(5) Para editar goles anotados ");
            System.out.println("(6) Para editar marca promedio ");
            System.out.println("(7) Para editar posición ");
            System.out.println("");

            int choice = Integer.parseInt(sc.nextLine());

            System.out.println(askId);
            int id = Integer.parseInt(sc.nextLine());
            int numb = 0;

            System.out.println(askValue);

            switch (choice) {
                case 1:
                    String value = (sc.nextLine());
                    message = soccerClub.setEmployeeName(id, value);
                    break;
                case 2:
                    numb = Integer.parseInt(sc.nextLine());
                    message = soccerClub.setEmployeeId(id, numb);
                    break;

                case 3:
                    float num = Float.parseFloat(sc.nextLine());
                    message = soccerClub.setEmployeeSalary(id, num);
                    break;

                case 4:
                    numb = Integer.parseInt(sc.nextLine());
                    message = soccerClub.setPlayerShirtNumber(id, numb);
                    break;

                case 5:
                    numb = Integer.parseInt(sc.nextLine());
                    message = soccerClub.setPalyerScoreGoals(id, numb);
                    break;
                
                case 6:
                    double mark = Double.parseDouble(sc.nextLine());
                    message = soccerClub.setPlayerAverageMark(id, mark);
                    break;

                case 7:

                    do {
                        System.out.println("");
        
                        System.out.println("(1) Arquero ");
                        System.out.println("(2) Defensa ");
                        System.out.println("(3) Medio campista ");
                        System.out.println("(4) Delantero ");
        
                        numb = Integer.parseInt(sc.nextLine());
        
                    } while (numb > 4 || numb < 1);
        
                    numb = numb - 1;

                    message = soccerClub.setPlayerRole(id, numb);
                    break;

                default:
                    message = "Número erroneo ";
                    break;
            }

        }

        if (selection < 1 || selection > 3) {
            message = "Número no valido ";
        }

        return message;
    }

    public String takeOutEmployeeFromTeam() {

        String message = "";

        System.out.println("Categoria del club (A - B) ");
        String letter = (sc.nextLine());

        System.out.println("Id del entrenador ");
        int id = Integer.parseInt(sc.nextLine());

        message = soccerClub.takeOutFromTeam(letter, id);
        System.out.println("");

        return message;
    }

    public String assingEmployeeToTeam() {
        String message = "No se pudo assignar";
        String categoryAsk = "Categoria del club (A - B) ";

        System.out.println("(1) Para asignar un entrenador ");
        System.out.println("(2) Para asignar un asistente ");
        System.out.println("(3) Para asignar un jugador ");

        int selection = Integer.parseInt(sc.nextLine());
        System.out.println("");

        // ---------------- Player

        if (selection == 1) {

            System.out.println(categoryAsk);
            String letter = (sc.nextLine());

            System.out.println("Id del entrenador ");
            int id = Integer.parseInt(sc.nextLine());

            message = soccerClub.addCoachToTeam(letter, id);

        }

        // ---------------- Head Coach

        if (selection == 2) {

            System.out.println(categoryAsk);
            String letter = (sc.nextLine());

            System.out.println("Id  del asistente ");
            int id = Integer.parseInt(sc.nextLine());

            message = soccerClub.addAssitantToTeam(letter, id);

        }

        // ---------------- Assitan Coach

        if (selection == 3) {

            System.out.println(categoryAsk);
            String letter = (sc.nextLine());

            System.out.println("Id del jugador ");
            int id = Integer.parseInt(sc.nextLine());

            message = soccerClub.addPlayertToTeam(letter, id);

        }

        // ---------------- Error

        if (selection < 1 || selection > 3) {
            message = "Número no valido ";
        }

        return message;

    }

    public String addEmployee() {

        String message = "";

        System.out.println("(1) Para ingresar un nuevo jugador ");
        System.out.println("(2) Para ingresar un nuevo entrenador ");
        System.out.println("(3) Para ingresar un nuevo asistente ");

        int selection = Integer.parseInt(sc.nextLine());
        System.out.println("");

        // ---------------- Player

        if (selection == 1) {

            System.out.println("Nombre del jugador y apellido ");
            String employeeName = (sc.nextLine());

            System.out.println("Identificación del jugador ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println("Salario del jugador (entero) ");
            int salary = Integer.parseInt(sc.nextLine());

            System.out.println("Número de la camisa ");
            int shirtNumber = Integer.parseInt(sc.nextLine());

            System.out.println("Goles anotados ");
            int scoredGoals = Integer.parseInt(sc.nextLine());

            int averageMark = 0;

            do {
                System.out.println("Calificación promedio 0 a 10 ");
                averageMark = Integer.parseInt(sc.nextLine());
            } while (averageMark > 10 || averageMark < 0);

            int roleNum = 0;

            do {
                System.out.println("Número del rol");
                System.out.println("");

                System.out.println("(1) Arquero ");
                System.out.println("(2) Defensa ");
                System.out.println("(3) Medio campista ");
                System.out.println("(4) Delantero ");
                roleNum = Integer.parseInt(sc.nextLine());

            } while (roleNum > 4 || roleNum < 1);

            roleNum = roleNum - 1;

            message = soccerClub.addEmployee(employeeName, id, salary, shirtNumber, scoredGoals, averageMark, roleNum);
        }

        // ---------------- Head Coach

        if (selection == 2) {

            System.out.println("Nombre del entrenador y apellido ");
            String employeeName = (sc.nextLine());

            System.out.println("Identificación del entrenador ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println("Salario del entrenador (entero) ");
            int salary = Integer.parseInt(sc.nextLine());

            System.out.println("Número de años de experiencia  ");
            int experienceYears = Integer.parseInt(sc.nextLine());

            System.out.println("Campeonatos ganados ");
            int achivedChampionships = Integer.parseInt(sc.nextLine());

            System.out.println("Equipos acargo ");
            int teamsInCharge = Integer.parseInt(sc.nextLine());

            message = soccerClub.addEmployee(employeeName, id, salary, experienceYears, achivedChampionships,
                    teamsInCharge);
        }

        // ---------------- Assitan Coach

        if (selection == 3) {

            System.out.println("Nombre del asistente y apellido ");
            String employeeName = (sc.nextLine());

            System.out.println("Identificación del asistente ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println("Salario del asistente (entero) ");
            int salary = Integer.parseInt(sc.nextLine());

            System.out.println("Número de años de experiencia ");
            int experienceYears = Integer.parseInt(sc.nextLine());

            System.out.println("Profesional del deporte (si - no) ");
            String isProfessional = (sc.nextLine());

            int expertiseNum = 0;

            do {
                System.out.println("Número la especialdiad ");
                System.out.println("");

                System.out.println("(1) Ofensiva ");
                System.out.println("(2) Defensiva ");
                System.out.println("(3) Pocesión ");
                System.out.println("(4) Laboratorio ");

                expertiseNum = Integer.parseInt(sc.nextLine());

            } while (expertiseNum > 4 || expertiseNum < 1);

            expertiseNum = expertiseNum - 1;

            message = soccerClub.addEmployee(employeeName, id, salary, experienceYears, isProfessional, expertiseNum);
        }

        // ---------------- Error

        if (selection < 1 || selection > 3) {
            message = "Numero no valido ";
        }

        return message;
    }

    public String fireEmployee() {

        String message = "";

        System.out.println("Ingresa el numero de identificación ");
        int id = Integer.parseInt(sc.nextLine());

        message = soccerClub.fireEmployeeInfo(id);

        return message;
    }

    public String showPlayerTeamInfo() {

        String message = "No encontrado ";

        System.out.println("(1) Para ver la información de un empleado ");
        System.out.println("(2) Para ver la información de equipo ");
        int selection = Integer.parseInt(sc.nextLine());

        if (selection == 1) {
            System.out.println("Ingresa el numero de identificación ");
            int id = Integer.parseInt(sc.nextLine());
            message = soccerClub.showEmployeeInfo(id);
        }

        if (selection == 2) {
            System.out.println("Elije la catedoria del equipo (A o B) ");
            String letter = (sc.nextLine());
            message = soccerClub.showTeamInfo(letter);
        }

        if (selection < 1 || selection > 2) {
            message = "Numero no valido";
        }

        return message;
    }

    /// -----------------------------------------------------

    /**
     * Read options <br>
     * <b>pre:</b> Read and store the user selection. Playlists array must be
     * initialized <br>
     * <b>post:</b> Users information list
     */
    public int readOption() {

        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    // Menu Selections
    /**
     * Cases main menu <br>
     * <b>pre:</b> Cases to be done according to the user selection. Main object
     * must be initialized and all methos must be created<br>
     * <b>post:</b> message
     * 
     * @param choice Value selected by the user. choice != null
     */
    public void doOperation(int choice) {
        switch (choice) {
            case ADD_EMPLOYEE:
                System.out.println(addEmployee());
                break;

            case FIRE_EMPLOYEE:
                System.out.println(fireEmployee());
                break;

            case ALLOCATE_EMPLOYEE_TEAM:
                System.out.println(assingEmployeeToTeam());
                break;

            case TAKEOUT_EMPLOYEE_TEAM:
                System.out.println(takeOutEmployeeFromTeam());
                break;

            case SHOW_PARTICULAR_INFO:
                System.out.println(showPlayerTeamInfo());
                break;

            case EDIT_PARTICULAR_INFO:
                System.out.println(editEmployee());
                break;

            case ADD_LINEUP_TO_TEAM:
                System.out.println(addLineUp());
                break;

            case SHOW_LINEUP_TO_TEAM:
                System.out.println(showLineUpsTeam());
                break;

            case ADD_PLAYER_DRESSROOM:
                System.out.println(addPlayerToDressroom());
                break;

            case ADD_COACH_OFFICE:
                System.out.println(addCoachToOffice());
                break;

            case UBICATION_PLAYER:
                System.out.println(playerPlace());
                break;

            case UBICATION_COAHC:
                System.out.println(coachOffice());
                break;

            case SHOW_CLUB_INFO:
                System.out.println(soccerClub.showClubInfo());
                break;

            case EXIT:
                System.out.println("Gracias por usar nuestros servicios");
                break;

            default:
                System.out.println("Ingrese una opción valida");
                break;
        }
    }

    /**
     * Start program <br>
     * <b>pre:</b> Start the main menu cycle. All methos must be created<br>
     * <b>post:</b> message
     */
    public void startProgram() {
        int option;
        do {
            showMenu();
            option = readOption();
            doOperation(option);
        } while (option != 14);
    }
}
