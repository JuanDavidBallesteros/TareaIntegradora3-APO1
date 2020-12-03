package model;

public class LineUp {

    public static final int ROWS = 10;
    public static final int COLS = 7;

    private String type;
    private String lineUpDate;
    private String lineUpNum;
    private int typeNum;
    private int[][] lineUp;

    // -------------------- constructor -------------------------
    /**
     * Cosntructor LineUp Object <br>
     * <b>pre:</b> Create a LineUp object. <br>
     * <b>post:</b> LineUp created
     * 
     * @param lineUpDate Creation date. lineUpDate !=null
     * @param lineUpNum  The secuence of numbers. lineUpNum !=null
     * @param typeNum    The enum position. typeNum !=null
     */
    public LineUp(String lineUpDate, String lineUpNum, int typeNum) {

        this.lineUpDate = lineUpDate;
        this.lineUpNum = lineUpNum;
        this.typeNum = typeNum;
        lineUp = new int[ROWS][COLS];
        type = Tactics.values()[typeNum].name();
    }

    // -------------------- Auxiliar Operations -------------------------

    /**
     * Text to image <br>
     * <b>pre:</b> Create a image from the lineUpNum text image. LineUp object must be created <br>
     * <b>post:</b> Text
     */
    public int[][] createImage() {

        int[][] matrix = new int[ROWS][COLS];
        int[] rows = new int[ROWS];

        int[] pair = { 3, 5, 2, 6, 1, 7, 4 };
        int[] odd = { 4, 3, 5, 2, 6, 1, 7 };

        String[] parts = lineUpNum.split("-");

        for (int i = 0; i < parts.length; i++) {
            rows[i] = Integer.valueOf(parts[i]);
        }

        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < rows[i]; j++) {
                if (rows[i] % 2 == 0) {
                    int k = pair[j] - 1;
                    matrix[i][k] = 1;
                }
                if (rows[i] % 2 != 0) {
                    int k = odd[j] - 1;
                    matrix[i][k] = 1;
                }
            }
        }

        return matrix;
    }

    /**
     * MatrixImg <br>
     * <b>pre:</b> Create the string image from matrix. LineUp object must be created <br>
     * <b>post:</b> String
     */
    private String matrixImg() {

        lineUp = createImage();

        String message = "";

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                message += lineUp[i][j];
            }
            message += "\n";
        }
        return message;
    }

    /**
     * Image to text <br>
     * <b>pre:</b> Create a text from the lineup image. LineUp object must be created <br>
     * <b>post:</b> Text
     */
    private String imgToText() {
        String message = "";
        lineUp = createImage();

        int count = 0;

        for (int i = 0; i < ROWS; i++) {
            count = 0;
            for (int j = 0; j < COLS; j++) {
                if (lineUp[i][j] != 0) {
                    count++;
                }
            }

            if (count != 0) {
                message += count + "-";
            }
        }
        if (message.length() > 1) {
            message = message.substring(0, message.length() - 1);
        }
        return message;
    }

    /**
     * Show information <br>
     * <b>pre:</b> Show LineUp information. LineUp object must be created <br>
     * <b>post:</b> Description of the LineUp
     */
    public String showInfo() {
        String message = "";

        message = "********** Formación **********" + "\n";
        message += "** Tipo: " + getType() + "\n";
        message += "** Fecha: " + getLineUpDate() + "\n";
        message += "** Formación: " + getLineUpNum() + "\n";

        message += "** Imagen: " + imgToText() + "\n" + matrixImg() + "\n"; /// Imagen creada matriz
        message += "*****************************" + "\n";

        return message;
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
     * Set type <br>
     * <b>pre:</b> Set the lineup type. LineUp must be created. <br>
     * <b>post:</b> Atribute updated
     * 
     * @param typeNum An atribute of the object. typeNum != null
     */
    public void setType(int typeNum) {
        this.type = Tactics.values()[typeNum].name();
        this.typeNum = typeNum;
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
     * Set lineUpDate <br>
     * <b>pre:</b> Set the lineUp date. LineUp must be created. <br>
     * <b>post:</b> Atribute updated
     * 
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
     * Set lineUpNum <br>
     * <b>pre:</b> Set the lineUpNum. LineUp must be created. <br>
     * <b>post:</b> Atribute updated
     * 
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

    /**
     * Get typeNum <br>
     * <b>pre:</b> Get typeNum to pass as parameter. LineUp must be created. <br>
     * <b>post:</b> typeNum
     */
    public int getTypeNum() {
        return typeNum;
    }

}
