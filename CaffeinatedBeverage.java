public class CaffeinatedBeverage {

    /*************CONSTANTS*************/

    public static final String defaultName = "Yerba";
    public static final int defaultOunces = 0;
    public static final double defaultPrice = 0.0;

    /*************INSTANCE VARIABLES*************/

    private String name;
    private int ounces;
    private double price;

    /*************CONSTRUCTORS*************/
    /**
     * Default Constructor 
     */

    public CaffeinatedBeverage() {
        this(CaffeinatedBeverage.defaultName, CaffeinatedBeverage.defaultOunces, CaffeinatedBeverage.defaultPrice);
    }

    /**
     * Full Constructor
     * @param name
     * @param ounces
     * @param price
     */

    public CaffeinatedBeverage(String name, int ounces, double price) {
        this.name = name;
        this.ounces = ounces;
        this.price = price;
    }

    /* 
    public CaffeinatedBeverage(CaffeinatedBeverage original) {
        if (original != null) {
            
        }
    }
    */
    
    /*************GETTERS*************/

    public String getName() {
        return this.name;
    }

    public int getOunces() {
        return this.ounces;
    }

    public double getPrice() {
        return this.price;
    }

    /*************SETTERS*************/

    public void setName(String name) {
        this.name = name;
    }

    public boolean setOunces(int ounces) {
        if (ounces >= 0) {
            this.ounces = ounces;
            return true;

        } else {
            return false;
        }
    }

    public  boolean setPrice(double price) {
        

        if (price >= 0) {
            this.price = price;
            return true;
        } else {
            return false;
        }

    }

    /*************OTHER METHODS*************/

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass())
            return false;
        CaffeinatedBeverage that = (CaffeinatedBeverage) o;
        return this.ounces == that.ounces &&
                Double.compare(this.price, that.price) == 0 &&
                this.name.equals(that.name);
    }

    public boolean sip(int ounces) {
        
    }
}