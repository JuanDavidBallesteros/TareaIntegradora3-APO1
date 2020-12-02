package model;

import java.util.ArrayList;

public class ClubTeam {

    private static final int PLAYERS_SIZE = 25;
    private static final int ASSITANTS_SIZE = 3;

    private String teamName;

    private ArrayList<LineUp> lineUps;

    private ArrayList<Player> players;
    private ArrayList<AssitanCoach> assitants;
    private HeadCoach coach;

    // -------------------- constructor -------------------------
    /**
     * Cosntructor Team Object <br>
     * <b>pre:</b> Create a Team object. <br>
     * <b>post:</b> Team created
     * 
     * @param teamName The team name in the app. teamName !=null
     */
    public ClubTeam(String teamName) {
        this.teamName = teamName;
        lineUps = new ArrayList<>();

        players = new ArrayList<>();
        assitants = new ArrayList<>();
    }

    // -------------------- Auxiliar Operations -------------------------

    //Show lineUp
    public String showLineUp(String lineUpDate, int typeNum){
        String message = "Aliniación no encontrda";

        for(int i = 0 ; i < lineUps.size() ; i++ ){
            if(lineUps.get(i).getLineUpDate().equals(lineUpDate) && lineUps.get(i).getTypeNum() == typeNum){
                message = lineUps.get(i).showInfo();
            }
        }

        return message;
    }

    // Add lineUp
    public String addLienUp(String lineUpDate, String lineUpNum, int typeNum) {
        String message = "";
        boolean add = true;

        LineUp lineUp = new LineUp(lineUpDate, lineUpNum, typeNum);

        for (int i = 0; i < lineUps.size(); i++) {
            if (lineUps.get(i).getLineUpNum().equals(lineUpNum) && lineUps.get(i).getTypeNum() == typeNum) {
                add = false;
                message = "No se pudo asisgnar la aliniación";
            }
        }
        if (add) {
            lineUps.add(lineUp);
            message = "Alineacion creada";
        }

        return message;
    }

    // Add player
    public String addPlayerToTeam(Player player) {
        String message = "";
        boolean add = true;

        for (int i = 0; i < players.size(); i++) {
            if (player.getId() == players.get(i).getId() || players.size() > PLAYERS_SIZE) {
                add = false;
                message = "No se pudo asisgnar el jugador";
            }
        }
        if (add) {
            players.add(player);
            message = "Jugador asignado";
        }

        return message;
    }

    // Add Assistant
    public String addAssitantToTeam(AssitanCoach assitanCoach) {
        String message = "";
        boolean add = true;

        for (int i = 0; i < assitants.size(); i++) {
            if (assitanCoach.equals(assitants.get(i)) || assitants.size() > ASSITANTS_SIZE) {
                add = false;
                message = "No se pudo asisgnar el asistente";
            }
        }
        if (add) {
            assitants.add(assitanCoach);
            message = "Jugador asignado";
        }

        return message;
    }

    // Show Info
    public String showTeamInfo() {
        String message = "******** Información Equipo ********" + "\n";

        message += "** Nombre del equipo: " + getTeamName() + "\n" + "\n";
        // message += "** Número de aliniaciones: " + lineUps.size() + "\n";

        message += "----------- Team Coach " + "\n" + "\n";
        if (coach != null) {
            message += coach.showInfo() + "\n";
        } else {
            message += "**** Sin entrenador " + "\n";
        }

        message += "----------- Team Asistants: " + assitants.size() + "\n" + "\n";
        for (int i = 0; i < assitants.size(); i++) {
            message = message + assitants.get(i).showInfo() + "\n";
        }

        message += "----------- Team Players: " + players.size() + "\n" + "\n";
        for (int i = 0; i < players.size(); i++) {
            message = message + players.get(i).showInfo() + "\n";
        }

        message += "----------- Team Alineaciones: " + lineUps.size() + "\n";
        for (int i = 0; i < lineUps.size(); i++) {
            message = message + lineUps.get(i).showInfo() + "\n";
        }

        return message;
    }

    public String showLineUps() {
        String message = "No hay aliniaciones para mostrar";

        if (lineUps.size() != 0) {

            message += "----------- Team Alineaciones: " + lineUps.size() + "\n";
            for (int i = 0; i < lineUps.size(); i++) {
                message = message + lineUps.get(i).showInfo() + "\n";
            }
        }

        return message;
    }

    // -------------------- getters / settes -------------------------

    /**
     * Get teamName <br>
     * <b>pre:</b> Get teamName to pass as parameter. Team must be created. <br>
     * <b>post:</b> teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Set teamName <br>
     * <b>pre:</b> Set the teamName. Team must be created. <br>
     * <b>post:</b> Atribute updated
     * 
     * @param teamName An atribute of the object. teamName != null
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * Get lineUps <br>
     * <b>pre:</b> Get lineUps to pass as parameter. Team must be created. <br>
     * <b>post:</b> lineUps
     */
    public ArrayList<LineUp> getLineUps() {
        return lineUps;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public ArrayList<AssitanCoach> getAssitants() {
        return assitants;
    }

    public HeadCoach getCoach() {
        return coach;
    }

    public String setCoach(HeadCoach coach) {
        String message = "Entrenador cambiado";
        this.coach = coach;
        return message;
    }

}
