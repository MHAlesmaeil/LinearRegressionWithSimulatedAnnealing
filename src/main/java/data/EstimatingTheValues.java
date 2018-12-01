package data;

import java.util.Random;

public class EstimatingTheValues {
    // values to be injected into the equations
    double x1, x2, x3, b = 1;

    // instance to call the equation
    Implementation implementation = new Implementation();
    //
    public void start (){
        int x =1;
        while (x<10){

            //System.out.println("the x value is:"+x+" and the result of it: "+implementation.estimatedResult(x1, b));
            // give a value

            double random = new Random().nextDouble();
            System.out.println(random);

            // if the given value results a better estimation then keep it


            // otherwise keep next
            x++;
        }
    }
    /**
     *given the start number
     * the absolute value of the given number -+ the given number
     * in case if the given number is 1 the the given number need to be between 0 and 2
    */
    public double giveMeARandom (double numberToBeRandomed){
        double randomMe=numberToBeRandomed*2;
        randomMe = randomMe* (new Random().nextDouble());
        return randomMe;

    }
}
