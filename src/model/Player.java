package model;

public class Player extends Employee implements SoccerWord {
    private int shirtNumber;
    private int scoredGoals;
    private double averageMark;
    private String role;
    

    /**
     * Cosntructor Coach <br>
     * <b>pre:</b> Create an coach object. <br>
     * <b>post:</b> Coach created
     * 
     * @param employeeName Creation date. lineUpDate !=null
     * @param id  The identification number. id !=null
     * @param salary    The wage. salary !=null
     * @param shirtNumber    T-shirt number. shirtNumber !=null
     * @param scoredGoals    Player's scored goals. scoredGoals !=null
     * @param averageMark    Avergae mark. averageMark !=null
     * @param roleNum    Number of the role enmun. roleNum !=null
     */
    public Player(String employeeName, int id, double salary, int shirtNumber, int scoredGoals, double averageMark, int roleNum) {
        super(employeeName, id, salary);
        this.shirtNumber = shirtNumber;
        this.scoredGoals = scoredGoals;
        this.averageMark = averageMark;
        role = Role.values()[roleNum].name();
    }


    /**
     * Show information <br>
     * <b>pre:</b> Show Assitan coach information. Assitan object must be created <br>
     * <b>post:</b> Description of the assitan Coach
     */
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
        message += "**** Valor en el mercado: " + calculateMarketPrice() + "\n";
        message += "**** Estrellas: " + calculateStars() + "\n";
        message += "****** Estado: " + status() + "\n";
        message += "*****************************" + "\n";


        return message;
    }

    /**
     *Calculate price <br>
     * <b>pre:</b> Return the price int the soccer word. Head Coach object must be created <br>
     * <b>post:</b> price
     */
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

    /**
     *Calculate Stars <br>
     * <b>pre:</b> Return the stars int the soccer word. Head Coach object must be created <br>
     * <b>post:</b> stars
     */
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


    /**
     * Get shirtNumber <br>
     * <b>pre:</b> Return the shirtNumber string. Player object must be created <br>
     * <b>post:</b> shirtNumber attribute
     */
    public int getShirtNumber() {
        return shirtNumber;
    }

    /**
     * set shirtNumbe <br>
     * <b>pre:</b> Recibe the number. Player object must be created <br>
     * <b>post:</b> shirtNumbe changed
     * @param shirtNumbe    shirt numbers. shirtNumbe !=null
     */
    public void setShirtNumber(int shirtNumbe) {
        this.shirtNumber = shirtNumbe;
    }

    /**
     * Get scoredGoals <br>
     * <b>pre:</b> Return the scoredGoals string. Player object must be created <br>
     * <b>post:</b> scoredGoals attribute
     */
    public int getScoredGoals() {
        return scoredGoals;
    }

    /**
     * set scoredGoals <br>
     * <b>pre:</b> Recibe the number. Player object must be created <br>
     * <b>post:</b> scoredGoals changed
     * @param scoredGoals    Scored goals. scoredGoals !=null
     */
    public void setScoredGoals(int scoredGoals) {
        this.scoredGoals = scoredGoals;
    }

    /**
     * Get averageMark <br>
     * <b>pre:</b> Return the averageMark string. Player object must be created <br>
     * <b>post:</b> averageMark attribute
     */
    public double getAverageMark() {
        return averageMark;
    }

    /**
     * set averageMark <br>
     * <b>pre:</b> Recibe the number. Player object must be created <br>
     * <b>post:</b> averageMark changed
     * @param averageMark    Average calification.  averageMark !=null
     */
    public void setAverageMark(double averageMar) {
        this.averageMark = averageMar;
    }

    /**
     * Get role <br>
     * <b>pre:</b> Return the role string. Player object must be created <br>
     * <b>post:</b> role attribute
     */
    public String getRole() {
        return role;
    }

    /**
     * set role <br>
     * <b>pre:</b> Recibe the number. Player object must be created <br>
     * <b>post:</b> role changed
     * @param roleNum    Role enum position. roleNum !=null
     */
    public void setRole(int roleNum) {
        this.role = Role.values()[roleNum].name();
    }
    
}
