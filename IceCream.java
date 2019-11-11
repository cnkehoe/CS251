/**
    @version date (in_ISO_8601 format): 2019-09-15
    @author Carly Kehoe

*/

/**
    Class for an Ice Cream object that inherits methods/behaviors from parent Dessert
*/

public class IceCream extends Dessert {
    private double price;

    /**
        creates a new ice cream object, has two args: price and name 
        @param name the name of the ice cream
        @param price the price of the ice cream
    */
    public IceCream(String name, double price) {
        super(name);
        this.price = price;
    }

    /**
        getter method for the price of the ice cream
        @return the price
    */
    public double getPrice() {
        return price;
    }
}