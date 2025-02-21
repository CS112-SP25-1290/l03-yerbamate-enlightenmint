public class CaffeinatedBeverage {

    /*************CONSTANTS*************/

    public static final String DEFAULT_NAME = "Yerba";
    public static final int DEFAULT_OUNCES = 0;
    public static final double DEFAULT_PRICE = 0.0;

    /*************INSTANCE VARIABLES*************/

    private String name;
    private int ounces;
    private double price;

    /*************CONSTRUCTORS*************/
    /**
     * Default Constructor 
     */

    public CaffeinatedBeverage() {
        this(CaffeinatedBeverage.DEFAULT_NAME, CaffeinatedBeverage.DEFAULT_OUNCES, CaffeinatedBeverage.DEFAULT_PRICE);
    }

    /**
     * Full Constructor
     * @param name
     * @param ounces
     * @param price
     */

    public CaffeinatedBeverage(String name, int ounces, double price) {
        if (!this.setAll(name, ounces, price)) {
            System.out.println("ERROR: Bad data given to full CaffinatedBeverage constructor");
            System.exit(0); 
       }
    }

     
    public CaffeinatedBeverage(CaffeinatedBeverage original) {
        if (original != null) {
            this.setAll(original.name, original.ounces, original.price);
        } else{ 
            System.out.println("ERROR: null data given to copy CaffinatedBeverage constructor");
            System.exit(0);
        }
    }
    
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

    public boolean setName(String name) {
        if (name != null && name.length() > 0) {
            this.name = name;
            return true;
        } else {
            return false;
        }
        
    }

    public boolean setOunces(int ounces) {
        if (ounces >= 0) {
            this.ounces = ounces;
            return true;

        } else {
            return false;
        }
    }

    public boolean setPrice(double price) {

        if (price >= 0) {
            this.price = price;
            return true;
        } else {
            return false;
        }

    }
    
    public boolean setAll(String name, int ounces, double price) {
        return this.setName(name) && this.setOunces(ounces) && this.setPrice(price);
    }

    /*************OTHER METHODS*************/

    public String toString() {
        return String.format("CaffeinatedBeverage: name = %s, %d fl. oz., $%.2f", this.name, this.ounces, this.price);
    }

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
        if (this.ounces >= ounces) {
            this.ounces -= ounces;
        } else {
            this.ounces = 0;
        }
        return this.ounces > 0;
        
    }

    public boolean isEmpty() {
        return this.ounces == 0;
    }
}