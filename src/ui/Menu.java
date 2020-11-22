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
     * <b>pre:</b> Call to create a SoccerClub object. ReadInitialdata must be created <br>
     * <b>post:</b> Soccer Club
     */
    public Menu() {
        //this.soccerClub = readInitialData();
        soccerClub = new SoccerClub();
    }

    /**
     * Call soccer club constructor <br>
     * <b>pre:</b> Call the funtion to create a SoccerClub object. Soccer club consturctor must be created <br>
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
        System.out.println("(1) Para ingresar un nuevo empleado");
        System.out.println("(2) Para eliminar un empeado");
        System.out.println("(3) Para asignar un empleado a un equipo");
        System.out.println("(4) Para quitar a un empleado a un equipo");
        System.out.println("(5) Para mostrar la información de un empleado o equipo");
        System.out.println("(6) Para editar la información de un empleado o equipo");
        System.out.println("(7) Para añadir una alineación de equipo");
        System.out.println("(8) Para mostrar la alineación de un equipo");
        System.out.println("(9) Para añadir un jugador al camerino");
        System.out.println("(10) Para añadir a un entrenador a las oficinas");
        System.out.println("(11) Para mostrar la ubicación del jugador");
        System.out.println("(12) Para mostrar la ubicación del entrenador");
        System.out.println("(13) Para mostrar la información general del club");
        System.out.println("(14) Para salir");

        System.out.println("");
    }

    /**
     * Read options <br>
     * <b>pre:</b> Read and store the user selection. Playlists array must be initialized <br>
     * <b>post:</b> Users information list
     */
    public int readOption() {

        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    // Menu Selections
    /**
     * Cases main menu <br>
     * <b>pre:</b> Cases to be done according to the user selection. Main object must be initialized and all methos must be created<br>
     * <b>post:</b> message
     * @param choice Value selected by the user. choice != null
     */
    public void doOperation(int choice) {
        switch (choice) {
            case ADD_EMPLOYEE:
                System.out.println("Pendiente 1");
                break;

            case FIRE_EMPLOYEE:
                System.out.println("Pendiente 2");
                break;

            case ALLOCATE_EMPLOYEE_TEAM:
                System.out.println("Pendiente 3");
                break;

            case TAKEOUT_EMPLOYEE_TEAM:
                System.out.println("Pendiente 4");
                break;

            case SHOW_PARTICULAR_INFO:
                System.out.println("Pendiente 5");
                break;

            case EDIT_PARTICULAR_INFO:
                System.out.println("Pendiente 6");
                break;

            case ADD_LINEUP_TO_TEAM:
                System.out.println("Pendiente 7");
                break;

            case SHOW_LINEUP_TO_TEAM:
                System.out.println("Pendiente 8");
                break;

            case ADD_PLAYER_DRESSROOM:
                System.out.println("Pendiente 9");
                break;

            case ADD_COACH_OFFICE:
                System.out.println("Pendiente 10");
                break;

            case UBICATION_PLAYER:
                System.out.println("Pendiente 11");
                break;

            case UBICATION_COAHC:
                System.out.println("Pendiente 12");
                break;

            case SHOW_CLUB_INFO:
                System.out.println("Pendiente 14");
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
