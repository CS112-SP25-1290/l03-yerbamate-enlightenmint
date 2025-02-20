public class Tea extends CaffeinatedBeverage {
    /*************CONSTANTS*************/
    public static final int DEFAULT_BREW_TEMP = 90;

    /*************INSTANCE VARIABLES*************/
    private int brewTemp;

    /*************CONSTRUCTORS*************/
    /*
     * Full constructor
     */
    public Tea(String name, int ounces, double price, int brewTemp) {
        super(name, ounces, price);
        if (!this.setBrewTemp(brewTemp)) {
            System.out.println("ERROR: Bad data givent to full Tea constructor.");
            System.exit(0);
        }
    }

    //default constructor
    public Tea() {
         super();
         this.setBrewTemp(DEFAULT_BREW_TEMP);
      }

    //copy constructor
    public Tea(Tea original) {
        if(original!=null)
        this.setAll(original.getName(), original.getOunces(),
                    original.getPrice(), original.brewTemp());
    }

    /*************GETTERS*************/


     public int getBrewTemp() {
         return this.brewTemp;
     }

    /*************SETTERS*************/
     public boolean setBrewTemp(int brewTemp) {
      if(brewTemp > 0) {
         this.brewTemp = brewTemp;
         return true;
      } else {
         return false;
      }
     }

    public boolean setAll(String name, int ounces, double price, int brewTemp) {
         if(!super.setAll())
        
        
        //return super.setAll(name, ounces, price) && this.setBrewTemp(brewTemp);
     }

    /*************OTHER METHODS*************/


     @Override
     public String toString() {
        String caffeineString = super.toString();
        int colonLocation = caffeineString.indexOf(":");
        caffeineString = caffeineString.substring(colonLocation + 2);


        return String.format("Tea: %s, brewed @ %d°C", caffeineString, this.brewTemp);
     }

    public boolean equals(Object other) {
         if(other == null || other instanceof Tea) {
         return false;
      }
         Tea otherTea = (Tea) other;
         return super.equals(otherTea) && this.brewTemp == otherTea.brewTemp;
     }

}
}
