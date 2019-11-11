/**
    @version date (in_ISO_8601 format): 2019-09-15
    @author Carly Kehoe

*/

/**
    Class for a Candy object that inherits methods/behaviors from parent Dessert
*/


public class Candy extends Dessert {
    //Candy has two member variables, weight and price per lb
    private double weight;
    private double pricePerPound;





    /**
        Candy constructor takes 3 args, weight name, and price per lb,
        creates new candy

        @param name name of the candy
        @param weight the weight of the candy
        @param pricePerPound the price per pound of candy
    */
    public Candy(String name, double weight, double pricePerPound) {
        super(name);
        this.weight = weight;
        this.pricePerPound = pricePerPound;
    }


    /**
        getter method for weight of the candy in lbs
        @return the weight of the candy in lbs
    */
    public double getWeightInPounds() {
        return weight;
    }

    /**
        getter method for price of the candy in lbs
        @return price per lb
    */
    public double getPricePerPound() {
        return pricePerPound;
    }

    /**
        getter method for price, hides method in parent class
        @return the final price of the candy
    */
    public double getPrice() {
        return weight / pricePerPound;

    }

}