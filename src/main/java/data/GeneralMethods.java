package data;

import impl.DataManager;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Random;

// data methods presents the way and how to change a data
public class GeneralMethods {
    RawData rawData = new RawData();
    CalculateTheValueOfSolution calculateTheValueOfSolution= new CalculateTheValueOfSolution();

    // a random number to a given (a) or (b) value which can be up to 100% of the origin
    public double giveMeARandom (double numberToBeRandomed, double factorToMultiplyWithOriginalOne){
        double randomMe = numberToBeRandomed*factorToMultiplyWithOriginalOne* (new Random().nextDouble());
        return randomMe;
    }
    /**
     * If a new value which is randomly generated a a better estimation
     * of the total result we need to check if a bad solution can be accepted
     * z= a new random number which is between (0-1)
     * p= (1/e^(|f(Xnew)-f(X)|)/T
    */
    public double possiblityToAcceptASolution (double newResultOfAVariable,
                                               double oldResultOfAVariable,
                                               double timeOfCooling){
        double p;
        double fDiffernce = newResultOfAVariable-oldResultOfAVariable;
        double valueOfEexpo= 1/Math.exp((Math.abs(fDiffernce)/timeOfCooling));
        p= (valueOfEexpo);
        return p;
    }
    /**
     * The mean fo the population M=(1/N)SUM(Xi) ..
    */
    public double meanOfAVeriable (int variablePostion){
        try {
            double sum=0;
            for (int x=0;x<rawData.numberOfRaws();x++){
                // looping through each row and summing the values of a certain position
                sum+= rawData.list[x][variablePostion];
            }
            return sum/rawData.numberOfRaws();
        }catch (Exception e){
            System.out.println("please check your imput");
            return 0;
        }
    }
    /**
     *calculating the variance to be able to estimate z
     *Variance = (1/N)SUM(Xi-Means)² .. for a simple (1/(N-1))SUM(Xi-MeansX)
    */
    public double varianceOfDataset (int variablePostion){
        try {
            double sum1=0;
            // get the mean of the variable
            double getTheMeanOfThisVariable = meanOfAVeriable(variablePostion);
            for (int x=0;x<rawData.numberOfRaws();x++){
                // looping through each row and summing the values of a certain position
                sum1+= Math.pow(((rawData.list[x][variablePostion])-getTheMeanOfThisVariable),2);
            }
            // after summing the results we divide through the number of the rows
            return sum1/rawData.numberOfRaws();
        }catch (Exception e){
            return 0;
        }
    }
    /**
     *calling the checking function
     * if a variable did not show an improvement for a certain times of loops then it will be escaped
     * and so the time of computing will be shorten
     * @whenToEscapeit: after how many loop with no improvement this variable will be escaped automatically
     */

    public void checkMe(int variablePostion, boolean improvementTricker,int whenToEscapeit){
    }
    public void checkMe(int VaribalePosition){
    }
}
