package model;

public class AssitanCoach extends Coach {

    private boolean soccerProfessional;
    private String expertise;

    // -------------------- constructor -------------------------
    /**
     * Cosntructor Assitan Coach <br>
     * <b>pre:</b> Create an assitan coach object. <br>
     * <b>post:</b> Assitan Coach created
     * 
     * @param employeeName Creation date. lineUpDate !=null
     * @param id  The identification number. id !=null
     * @param salary    The wage. salary !=null
     * @param experienceYears    Years of experience. experienceYears !=null
     * @param isProfessional    Yes or not it's sport professional. isProfessional !=null
     * @param expertiseNum    Expertice. expertiseNum !=null
     */
    public AssitanCoach(String employeeName, int id, double salary, int experienceYears, String isProfessional, int expertiseNum) {
        super(employeeName, id, salary, experienceYears);
        if(isProfessional.equals("si") || isProfessional.equals("Si") || isProfessional.equals("SI")){
            soccerProfessional = true;
        }
        if(isProfessional.equals("no") || isProfessional.equals("No") || isProfessional.equals("NO")){
            soccerProfessional = false;
        }

        expertise =  Expertise.values()[expertiseNum].name();
    }

    /**
     * Show information <br>
     * <b>pre:</b> Show Assitan coach information. Assitan object must be created <br>
     * <b>post:</b> Description of the assitan Coach
     */
    @Override
    public String showInfo() {

        String message = "";
        
        message = "********** Asistente **********" + "\n";
        message += "** Nombre: " + getEmployeeName()  + "\n";
        message += "** ID: " + getId()  + "\n";
        message += "** Salario: " + getSalary() + "\n";
        message += "** Años de experiecia: " + getExperienceYears() + "\n";
        message += "** Especialidad: " + getExpertise()  + "\n";
        message += "** Profesional del futbol: " + isProfessionalText()  + "\n";
        message += "****** Estado: " + status() + "\n";
        message += "*****************************" + "\n";
        
        return message;
    }

    /**
     * IsProfesionalText <br>
     * <b>pre:</b> Transform the boolean to string. Assitan object must be created <br>
     * <b>post:</b> Yes or no
     */
    private String isProfessionalText(){
        String message = "";

        if(soccerProfessional){
            message = "Si";
        } else{
            message = "No";
        }

        return message;
    }


    /**
     * isSoccerProfessional <br>
     * <b>pre:</b> Return the boolean value. Assitan object must be created <br>
     * <b>post:</b> boolean value
     */
    public boolean isSoccerProfessional() {
        return soccerProfessional;
    }


    /**
     * Set Soccer professional <br>
     * <b>pre:</b> Tranform the string to boolean and change the soccerProfessional value. Assitan object must be created <br>
     * <b>post:</b> soccer professional changed
     * @param isProfessional    Yes or not it's sport professional. isProfessional !=null
     */
    public void setSoccerProfessional(String isProfessional) {
        if(isProfessional.equals("si") || isProfessional.equals("Si") || isProfessional.equals("SI")){
            soccerProfessional = true;
        }
        if(isProfessional.equals("no") || isProfessional.equals("No") || isProfessional.equals("NO")){
            soccerProfessional = false;
        }
    }


    /**
     * Get expertice <br>
     * <b>pre:</b> Return the expertice string. Assitan object must be created <br>
     * <b>post:</b> expertise attribute
     */
    public String getExpertise() {
        return expertise;
    }


    /**
     * set expertise <br>
     * <b>pre:</b> Recibe the number of the enum and asing the text. Assitan object must be created <br>
     * <b>post:</b> Expertice changed
     * @param expertiseNum    Expertice. expertiseNum !=null
     */
    public void setExpertise(int expertiseNum) {
        this.expertise = Expertise.values()[expertiseNum].name(); 
    }  
    
}
