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
        message += "** Goles: " + scoredGoals  + "\n";
        message += "** Promedio: " + averageMark  + "\n";
        message += "** Posición: " + getRole()  + "\n";
        message += "*****************************" + "\n";


        return message;
    }

    @Override
    public double calculateMarketPrice() {
        double price = 0;
        
        return 0;
    }

    @Override
    public double calculateStars() {
        double stars = 0;
        
        return 0;
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
