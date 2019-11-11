/**
    @version date (in_ISO_8601 format): 2019-09-15
    @author Carly Kehoe

*/

/**
    Class for a Candy object that inherits methods/behaviors from parent Dessert
*/

public class Sundae extends IceCream {

    /**
        creates a new sundae object, inherits all methods from ice cream and desert,
        takes two args, an ice cream flavor and a dessert topping
        @param flavor the name of the ice cream flavor
        @param topping the topping on the sundae
    */
    public Sundae(IceCream flavor, Dessert topping) {
        super(flavor.getName() + " topped with " + topping.getName(),
            flavor.getPrice() + topping.getPrice());
    }
}