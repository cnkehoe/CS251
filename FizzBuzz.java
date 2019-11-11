/**
    @version date (in_ISO_8601 format): 2019-08-20
    @author Carly Kehoe
*/
public class FizzBuzz {

   /**
    An implementation of a FizzBuzz program in which the program prints out
    numbers 1-n, however, for multiples of a given number x, the program 
    prints "Fizz", and for multiples of a given number y, the program prints
    "Buzz". For any number that is a multiple of both x and y, "FizzBuzz" is
    printed.
    */ 

    /* assigning default values for command line arguments in case the user
       doesn't provide any
    */ 
    public static final int DEFAULT_FIZZ = 3;
    public static final int DEFAULT_BUZZ = 5;
    public static final int DEFAULT_UPPERLIMIT = 100;

    /**
        Program takes three numberic arguments and prints "Fizz" 
        for multiples of args[0], "Buzz" for multiples of args[1],
        and "FizzBuzz" for multiples of args[0] AND args[1]. The
        third argument is the upper limit of numbers to print.
    */
    public static void main(String[] args) {
        //if the correct number of arguments are entered
        if (args.length == 3) {
            int fizz = Integer.parseInt(args[0]);
            int buzz = Integer.parseInt(args[1]);
            int upperLimit = Integer.parseInt(args[2]);
            for (int i = 1; i <= upperLimit; i++) {
                if (((i % fizz) == 0) && (i % buzz) == 0) {
                    System.out.println("FizzBuzz");
                }
                else if ((i % fizz) == 0) {
                    System.out.println("Fizz");
                }
                else if ((i % buzz) == 0) {
                    System.out.println("Buzz");
                }
                else {
                    System.out.println(i);
                }
            }
        }
        //the program runs a regular ol' fizzbuzz program if no args
        //are entered
        else if (args.length == 0) {
            for (int i = 1; i < DEFAULT_UPPERLIMIT; i++) {
                if (((i % DEFAULT_FIZZ) == 0) && (i % DEFAULT_BUZZ) == 0) {
                    System.out.println("FizzBuzz");
                }
                else if ((i % DEFAULT_FIZZ) == 0) {
                    System.out.println("Fizz");
                }
                else if ((i % DEFAULT_BUZZ) == 0) {
                    System.out.println("Buzz");
                }
                else {
                    System.out.println(i);
                }
            }
        }
        //if any other number of args are entered, complain about it
        else {
            System.err.println("Please enter a valid number of arguments.");
        }


    }
}
        



