package impl;

import data.GeneralMethods;

import java.util.ArrayList;
import java.util.List;

public class SimulatedAnnealing {


   /* public static double acceptanceProbability(int energy, int newEnergy, double temperature) {
        // If the new solution is better, accept it
        if (newEnergy < energy) {
            return 1.0;
        }
        // If the new solution is worse, calculate an acceptance probability
        return Math.exp((energy - newEnergy) / temperature);
    }

    public static void main(String[] args) {
        DataProcessing dataProcessing = new DataProcessing();
        DataManager dataManager= new DataManager();
        GeneralMethods dataMethods = new GeneralMethods();

        double [] dataSet1 ={140, 20};
        double [] dataSet2 ={136, 10};
        dataManager.addDataSet(dataSet1);
        dataManager.addDataSet(dataSet2);

        List<double[]> listOfData = new ArrayList<double[]>();






        System.out.println("The start solution as all variables are equal to 1 is:" +dataProcessing.estamtedResult());
        dataProcessing.setA1(2);
        System.out.println("The start solution as all variables are equal to 1 is:" +dataProcessing.estamtedResult());*/

        // change a value randomly
        // change one value at a time systematically
        // we have here up to 11 case of changing




        // if an improvement have been seen, keep the chenges


        // else



        /*// Set initial temp
        double temp = 10000;
        // Cooling rate
        double coolingRate = 0.003;
        // Initialize intial solution in which all values are starting with 1
        DataProcessing currentSolution = new DataProcessing();
        while (temp > 1) {
            for (int x=0;x<dataManager.numberOfDataSet();x++){
                System.out.println("the X value is: "+x);
                try {
                    if (x==0){
                        // call the first a
                        double oldValueOfTheVariable= dataManager.getDataSet(x).getVariable1();
                        // the total estimation before the change
                        double resultBefor= dataProcessing.estamtedResult();
                        // call random method
                        double newValueOfTheVariable=dataMethods.giveMeARandomUpTo100Percent(oldValueOfTheVariable);
                        // check if an improvement is detected by injecting the random in the setter of the (a1)
                        dataProcessing.setA1(newValueOfTheVariable);
                        // compare the two results resultBefore and resultAfter
                        double resultAfter= dataProcessing.estamtedResult();
                        // if resultBefore greater than result after then keep the change of the random value
                        // else keep the old value of the variable
                        if (resultBefor>resultAfter){
                            System.out.println("a new Value accepted");
                        }else{
                            System.out.println("No improvement was detected");
                            dataProcessing.setA1(oldValueOfTheVariable);
                            */
                             /*if there is no improvement detected
                             * we can check if changing in the other values brings a better result

                        }
                    }
                }catch (Exception e){
                }
            }
            temp *= 1-coolingRate;
        }
    }  */

}
