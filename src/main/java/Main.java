import data.CalculateTheValueOfSolution;
import data.GeneralMethods;
import data.OptimizationOfAandB;
import data.RawData;

public class Main {
    public static void main(String[] args) {

        /*RawData rawData = new RawData();
        CalculateTheValueOfSolution implementation = new CalculateTheValueOfSolution();
        OptimizationOfAandB estimatingTheValue = new OptimizationOfAandB();
        for (int x=0; x<30;x++){
            estimatingTheValue.start();
        }*/
        RawData rawData= new RawData();
        GeneralMethods generalMethods= new GeneralMethods();
        OptimizationOfAandB optimizationOfAandB = new OptimizationOfAandB();
        CalculateTheValueOfSolution calculateTheValueOfSolution = new CalculateTheValueOfSolution();
        System.out.println("the initial solution is:");
        calculateTheValueOfSolution.setOfThesetter(1,100);
        System.out.println(calculateTheValueOfSolution.estimatedResult());
        System.out.println("here we go 19: "+calculateTheValueOfSolution.estatingResult());

        System.out.println("here we go 21: "+calculateTheValueOfSolution.estatingResult());
        calculateTheValueOfSolution.setOfThesetter(0,100);
        System.out.println("here we go 25: "+calculateTheValueOfSolution.estatingResult());
        calculateTheValueOfSolution.setOfThesetter(3,100);

        System.out.println("################");
        System.out.println("Now, the optimization starts");

        // Set initial temp
        double temp = 10000;
        // Cooling rate
        double coolingRate = 0.01;
        // Initialize intial solution in which all values are starting with 1
        while (temp > 1) {
            for (int x=0;x<rawData.numberOfItemsOfSingleRaw();x++){
                System.out.println("the X value is: "+x);
                try {
                    if (true){
                        // call the a variable
                        double oldValueOfTheVariable= calculateTheValueOfSolution.getOfTheGetter(x);
                        // the total estimation before the change
                        double resultBefor= calculateTheValueOfSolution.estimatedResult();
                        // call random method
                        double newValueOfTheVariable=generalMethods.giveMeARandomUpTo100Percent(oldValueOfTheVariable);
                        // check if an improvement is detected by injecting the random in the setter of the (a1)
                        calculateTheValueOfSolution.setOfThesetter(x, newValueOfTheVariable);
                        // compare the two results resultBefore and resultAfter
                        double resultAfter= calculateTheValueOfSolution.estimatedResult();
                        System.out.println("Old Value: "+resultBefor +" New value: "+resultAfter);
                        // if resultBefore greater than result after then keep the change of the random value
                        // else keep the old value of the variable
                        if (resultAfter<resultBefor){
                            System.out.println("a new Value accepted");
                        }else{
                            System.out.println("No improvement was detected");
                            calculateTheValueOfSolution.setOfThesetter(x,oldValueOfTheVariable);
                            // if there is no improvement detected
                            // we can check if changing in the other values brings a better result
                        }
                    }
                }catch (Exception e){
                    System.out.println("there is an error");
                }
            }
            temp *= 1-coolingRate;

        }
        System.out.println("The solution for first variable is:"+ calculateTheValueOfSolution.getOfTheGetter(0)+" the value of the second variable is: "+ calculateTheValueOfSolution.getOfTheGetter(1)+" the 3 variable= is:"+calculateTheValueOfSolution.getOfTheGetter(2)+" the value of b is:"+calculateTheValueOfSolution.getOfTheGetter(3)+" the value of the fuction is: "+calculateTheValueOfSolution.getA4()+" the value of the fuction is: "+calculateTheValueOfSolution.estatingResult()+" the value of the fuction is: "+calculateTheValueOfSolution.estimatedResult());

    }

}
