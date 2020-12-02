package model;

public class AssitanCoach extends Coach {

    private boolean soccerProfessional;
    private String expertise;

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

    @Override
    public String showInfo() {

        String message = "";
        
        message = "********** Asistente **********" + "\n";
        message += "** Nombre: " + getEmployeeName()  + "\n";
        message += "** ID: " + getId()  + "\n";
        message += "** Salario: " + getSalary() + "\n";
        message += "** Años de experiecia: " + getExperienceYears() + "\n";
        message += "** Especialidad: " + getExpertise()  + "\n";
        message += "** Profesional del futbol: " + soccerProfessionalText()  + "\n";
        message += "****** Estado: " + status() + "\n";
        message += "*****************************" + "\n";
        
        return message;
    }

    private String soccerProfessionalText(){
        String message = "";

        if(soccerProfessional){
            message = "Si";
        } else{
            message = "No";
        }

        return message;
    }

    public boolean isSoccerProfessional() {
        return soccerProfessional;
    }

    public void setSoccerProfessional(String isProfessional) {
        if(isProfessional.equals("si") || isProfessional.equals("Si") || isProfessional.equals("SI")){
            soccerProfessional = true;
        }
        if(isProfessional.equals("no") || isProfessional.equals("No") || isProfessional.equals("NO")){
            soccerProfessional = false;
        }
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(int expertiseNum) {
        this.expertise = Expertise.values()[expertiseNum].name(); 
    }  
    
}
