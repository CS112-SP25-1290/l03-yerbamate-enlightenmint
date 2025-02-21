public class YerbaMate extends Tea {
    /*************CONSTANTS*************/
    public static final int DEFAULT_NUM_PASSES = 0;




    /*************INSTANCE VARIABLES*************/
    private int numPasses;




    /*************CONSTRUCTORS*************/
    /*
     * Full constructor
     */
    public YerbaMate(String name, int ounces, double price, int brewTemp, int numPasses) {
        super(name, ounces, price, brewTemp);
        if(!this.setNumPasses(numPasses)) {
            System.out.println("ERROR: Bad data given to full YerbaMate constructor.");
            System.exit(0);
        }
    }


    /*
     * Overloaded Constructor
     */
    public YerbaMate(String name, int ounces, double price, int brewTemp) {
        this(name, ounces, price, brewTemp, DEFAULT_NUM_PASSES);
    }


    /*
     * Default Constructor
     */
    public YerbaMate() {
        super();
        this.setNumPasses(DEFAULT_NUM_PASSES);
    }


    /*
     * Copy Constructor
     */
    public YerbaMate(YerbaMate original) {
        if(original != null) {
            this.setAll(original.getName(), original.getOunces(), original.getPrice(), original.getBrewTemp(), original.numPasses);
        } else {
            System.out.println("ERROR: null data given to copy YerbaMate constructor.");
            System.exit(0);
        }
    }




     /*************GETTERS*************/


     public int getNumPasses() {
        return this.numPasses;
     }




     /*************SETTERS*************/


     private boolean setNumPasses(int numPasses) {
        if(numPasses >= 0) {
            this.numPasses = numPasses;
            return true;
        } else {
            return false;
        }
     }


     private boolean setAll(String name, int ounces, double price, int brewTemp, int numPasses) {
        return super.setAll(name, ounces, price, brewTemp) && this.setNumPasses(numPasses);
     }




     /*************OTHER METHODS*************/


     @Override
     public String toString() {
        String teaString = super.toString();
        int colonLocation = teaString.indexOf(":");
        teaString = teaString.substring(colonLocation + 2);


        return String.format("YerbaMate: %s, %d passes so far",
            teaString, this.numPasses);
     }

     @Override
     public boolean equals(Object other) {
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        YerbaMate otherMate = (YerbaMate) other;
        return super.equals(otherMate) && this.numPasses == otherMate.numPasses;
     }


     /*
      * Increments numPasses and prints a notification to the console that the mate
      * was passed, along with the current count.
      */


     public void passMate() {
        this.numPasses++;
        System.out.println("Passed the mate, current # of passes: " + this.numPasses);
     }


     /*
      * When given a number of ounces of water that were added,
      * will add to the ounces from CaffeinatedBeverage
      */
     public void refill(int ounces) {
        if(ounces > 0) {
            this.setOunces(this.getOunces() + ounces);
        }
     }


}
