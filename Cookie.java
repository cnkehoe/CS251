/**
    @version date (in_ISO_8601 format): 2019-09-15
    @author Carly Kehoe

*/

/**
    Class for a Cookie object that inherits methods/behaviors from parent Dessert
*/
public class Cookie extends Dessert {
    private int numCookies;
    private double pricePerDozen;


    /**
        Creates a new Cookie, takes 3 args, name of the cookie, number of cookies,
        and the price per dozen cookies
        @param name name of the cookie
        @param numCookies number of cookies
        @param pricePerDozen the price per dozen cookies
    */
    public Cookie(String name, int numCookies, double pricePerDozen) {
        super(name);
        this.numCookies = numCookies;
        this.pricePerDozen = pricePerDozen;
    }

    /**
        getter method for number of cookies
        @return the number of cookies
    */
    public int getItemCount() {
        return numCookies;
    }

    /**
        getter method for price pre dozen cookies
        @return pricePerDozen the price per dozen cookies
    */
    public double getPricePerDozen(){
        return pricePerDozen;    
    }

    /**
        getter method for the total price of the cookies
        @return the price per dozen / a dozen times the number of cookies
    */
    public double getPrice() {
        return pricePerDozen / 12 * numCookies;
    }

}
