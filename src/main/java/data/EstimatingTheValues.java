package data;

import java.util.Random;

public class EstimatingTheValues {
    // values to be injected into the equations
    double x1=1,x2= 1, x3=1, b = 1;
    double x1New=1, x2New=1, x3New= 1, bNew = 1;

    // instance to call the equation
    Implementation implementation = new Implementation();
    //
    public void start (){
        int x =1;
        double result=implementation.estimatedResult(x1,b);
        // temp variable to save the total result

        // the start solution
        //System.out.println("The initial solution of the first variable: " + x1 +" and b value: "+ b + "and it results :" + implementation.estimatedResult(x1,b));

        // new random value to first variable
        x1New= giveMeARandom(x1);
        // first variable is temp fixed and the other will be checked to proof if they improve the solution after a certain number of randoms
        for (int counter=0; counter<10000;counter++){
            bNew= giveMeARandom(b);
            result= implementation.estimatedResult(x1New,b);
            double resultNew= implementation.estimatedResult(x1New,bNew);
            if (resultNew<result){
                b=bNew;
            }
        }
        // new random for the second variable
        bNew= giveMeARandom(b);
        // second variable is fixed and others will be changing to proof if an improvement is found
        for (int counter=0; counter<10000;counter++){
            x1New= giveMeARandom(x1);
            result= implementation.estimatedResult(x1,bNew);
            double resultNew= implementation.estimatedResult(x1New,bNew);
            if (resultNew<result){
                x1=x1New;
            }
        }

        System.out.println("the values of x1 and b are: "+ x1+" "+b);
    }
    /**
     *given the start number
     * the absolute value of the given number -+ the given number
     * in case if the given number is 1 the the given number need to be between 0 and 2
    */
    public double giveMeARandom (double numberToBeRandomed){
        double randomMe = numberToBeRandomed*2* (new Random().nextDouble());
        return randomMe;
    }
}
