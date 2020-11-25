package model;

public class Player extends Employee implements SoccerWord {
    private int shirtNumber;
    private int scoredGoals;
    private double averageMark;
    private String role;
    

    public Player(String employeeName, int id, double salary, int shirtNumber, int scoredGoals, double averageMark, int roleNum) {
        super(employeeName, id, salary);
        this.shirtNumber = shirtNumber;
        this.scoredGoals = scoredGoals;
        this.averageMark = averageMark;
        role = Role.values()[roleNum].name();
    }



    @Override
    public String showInfo() {

        String message = "";    

        message = "********** Jugador **********" + "\n";
        message += "** Nombre: " + getEmployeeName()  + "\n";
        message += "** ID: " + getId()  + "\n";
        message += "** Salario: " + getSalary() + "\n";
        message += "** Número: " + shirtNumber  + "\n";
        message += "** Goles: " + getScoredGoals()  + "\n";
        message += "** Promedio: " + averageMark  + "\n";
        message += "** Posición: " + getRole()  + "\n";
        message += "*****************************" + "\n";


        return message;
    }

    @Override
    public double calculateMarketPrice() {
        double price = 0;

        if(getRole().equals("FOWARD")){
            price = getSalary()*15 + getAverageMark()*145 + getScoredGoals()*150;
        } 

        if(getRole().equals("MIDFIELDER")){
            price = getSalary()*14 + getAverageMark()*135 + getScoredGoals()*125;
        }

        if(getRole().equals("DEFENDER")){
            price = getSalary()*13 + getAverageMark()*125 + getScoredGoals()*100;
        }

        if(getRole().equals("GOAL_KEEPER")){
            price = getSalary()*12 + getAverageMark()*150;
        }

        return price;
    }

    @Override
    public double calculateStars() {
        double stars = 0;

        if(getRole().equals("FOWARD")){
            stars = getAverageMark() * 0.9 + (getScoredGoals()/80) ;
        } 

        if(getRole().equals("MIDFIELDER")){
            stars = getAverageMark() * 0.9 + (getScoredGoals()/90);
        }

        if(getRole().equals("DEFENDER")){
            stars = getAverageMark() * 0.9 + (getScoredGoals()/100);
        }

        if(getRole().equals("GOAL_KEEPER")){
            stars = getAverageMark() * 0.9;
        }

        return stars;
    }



    public int getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(int shirtNumbe) {
        this.shirtNumber = shirtNumbe;
    }

    public int getScoredGoals() {
        return scoredGoals;
    }

    public void setScoredGoals(int scoredGoals) {
        this.scoredGoals = scoredGoals;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMar) {
        this.averageMark = averageMar;
    }

    public String getRole() {
        return role;
    }

    public void setRole(int roleNum) {
        this.role = Role.values()[roleNum].name();
    }
    
}
