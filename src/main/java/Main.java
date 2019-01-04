import data.CalculateTheValueOfSolution;
import data.GeneralMethods;
import data.OptimizationOfAandB;
import data.RawData;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CalculateTheValueOfSolution calculateTheValueOfSolution = new CalculateTheValueOfSolution();
        GeneralMethods generalMethods = new GeneralMethods();
        // the value of excel calculation
        System.out.println("Excel calculation is: "+calculateTheValueOfSolution.estimatedResult(2, 0.007, 30.026, 100.329));




        /**
         *Test number 1 to select the best temp,cooling rate and factor
        */
        // set of data that we want to get and analyse
        // temprature value needs to be more than one
        double [] tempratueValues= {1.1,1.2,2};
        // cooling rate e.g. 0.001
        double [] coolingRate= {0.00001};
        // factorToMultiply must be greater than one
        double [] factorToMultiply= {1.1,1.2,2,5,10};
        for (int x=0;x<tempratueValues.length;x++){
            for (int y=0; y<coolingRate.length;y++){
                for (int z =0; z<factorToMultiply.length;z++){
                    OptimizationOfAandB optimization =
                    new OptimizationOfAandB(tempratueValues[x],
                                            coolingRate[y],
                                            factorToMultiply[z]);
                }
            }
        }

        /**
         *After selecting couple of number to be test
        */

        /*// temprature value needs to be more than one
        double [] tempratueValues= {10};
        // cooling rate e.g. 0.001
        double [] coolingRate= {0.0000001};
        // factorToMultiply must be greater than one
        double [] factorToMultiply= {1.1};
        for (int x=0;x<tempratueValues.length;x++){
            for (int y=0; y<coolingRate.length;y++){
                for (int z =0; z<factorToMultiply.length;z++){
                    OptimizationOfAandB optimization = new OptimizationOfAandB(tempratueValues[x],coolingRate[y],factorToMultiply[z]);
                }
            }
        }*/
    }
}
