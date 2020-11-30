package model;

import java.util.ArrayList;

public class ClubTeam {

    private String teamName;
    private ArrayList<LineUp> lineUps;

    // -------------------- constructor -------------------------
    /**
     * Cosntructor Team Object <br>
     * <b>pre:</b> Create a Team object. <br>
     * <b>post:</b> Team created
     * @param teamName The team name in the app. teamName !=null
     */
    public ClubTeam(String teamName) {
        this.teamName = teamName;
        lineUps = new ArrayList<>();
    }
    

    // -------------------- Auxiliar Operations -------------------------

    public String showTeamInfo (){
        String message = "******** Información Equipo ********" + "\n";


        message += "** Nombre del equipo: " + getTeamName() + "\n";
        message += "** Número de liniaciones: " + lineUps.size() + "\n";


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
	 * Set teamName  <br>
	 * <b>pre:</b> Set the teamName. Team must be created. <br>
	 * <b>post:</b> Atribute updated
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
    
}
