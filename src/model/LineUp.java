package model;

public class LineUp {

    public static final  int ROWS = 7;
    public static final  int COLS =10;

    private String type;
    private String lineUpDate;
    private String lineUpNum;
    private int typeNum;
    private int [][] lineUp;
    

    // -------------------- constructor -------------------------
    /**
     * Cosntructor LineUp Object <br>
     * <b>pre:</b> Create a LineUp object. <br>
     * <b>post:</b> LineUp created
     * @param type The lineup type. type !=null
     * @param lineUpDate Creation date. lineUpDate !=null
     * @param lineUpNum The secuence of numbers. lineUpNum !=null
     * @param typeNum The enum position. typeNum !=null
     */
    public LineUp(String type, String lineUpDate, String lineUpNum, int typeNum) {
        this.type = type;
        this.lineUpDate = lineUpDate;
        this.lineUpNum = lineUpNum;
        this.typeNum = typeNum;
        lineUp = new int[ROWS][COLS];
        type = Tactics.values()[typeNum].name();
    }

    // -------------------- Auxiliar Operations -------------------------

    public int[][] createImage (){

        int[][] matrix = new int[ROWS][COLS];

        String[] parts = lineUpNum.split("-");
        int part1 = Integer.parseInt(parts[0]);
        int part2 = Integer.parseInt(parts[1]); 
        int part3 = Integer.parseInt(parts[2]);


        return matrix;
    }

    // -------------------- getters / settes -------------------------

    /**
     * Get type <br>
     * <b>pre:</b> Get type to pass as parameter. LineUp must be created. <br>
     * <b>post:</b> type
     */
    public String getType() {
        return type;
    }

    /**
	 * Set type  <br>
	 * <b>pre:</b> Set the lineup type. LineUp must be created. <br>
	 * <b>post:</b> Atribute updated
     * @param typeNum An atribute of the object. typeNum != null
	 */
    public void setType(int typeNum) {
        this.type = Tactics.values()[typeNum].name();
    }

    /**
     * Get lineUpDate <br>
     * <b>pre:</b> Get lineUpDate to pass as parameter. LineUp must be created. <br>
     * <b>post:</b> lineUpDate
     */
    public String getLineUpDate() {
        return lineUpDate;
    }

    /**
	 * Set lineUpDate  <br>
	 * <b>pre:</b> Set the lineUp date. LineUp must be created. <br>
	 * <b>post:</b> Atribute updated
     * @param lineUpDate An atribute of the object. lineUpDate != null
	 */
    public void setLineUpDate(String lineUpDate) {
        this.lineUpDate = lineUpDate;
    }

    /**
     * Get lineUpNum <br>
     * <b>pre:</b> Get lineUpNum to pass as parameter. LineUp must be created. <br>
     * <b>post:</b> lineUpNum
     */
    public String getLineUpNum() {
        return lineUpNum;
    }

    /**
	 * Set lineUpNum  <br>
	 * <b>pre:</b> Set the lineUpNum. LineUp must be created. <br>
	 * <b>post:</b> Atribute updated
     * @param lineUpNum An atribute of the object. lineUpNum != null
	 */
    public void setLineUpNum(String lineUpNum) {
        this.lineUpNum = lineUpNum;
    }

    /**
     * Get lineUp <br>
     * <b>pre:</b> Get lineUp to pass as parameter. LineUp must be created. <br>
     * <b>post:</b> lineUp
     */
    public int[][] getLineUp() {
        return lineUp;
    }    
    
}
