package data;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 *this class will deal with the value of (a) and (b) which are going to be initiated with a value of 1
*/
public class OptimizationOfAandB{
    RawData rawData= new RawData();
    GeneralMethods generalMethods= new GeneralMethods();
    CalculateTheValueOfSolution calculateTheValueOfSolution = new CalculateTheValueOfSolution();

    // Set initial temp need to be greater than 1 (last was set to = 20)
    double temp;
    double coolingRate;
    double factorToMultiply;

    // when to escape a variable that does not show an improvement
    // todo int escapeMeAfter=100;
    // the best found record
    String bestRecord="";
    // list to keep the records in certain loop
    List<String> tableOfFigures = new ArrayList<String>();
    // Initialize intial solution in which all values are starting with 1


    public OptimizationOfAandB() {
    }

    public OptimizationOfAandB(double temp, double coolingRate, double factorToMultiply) {
        this.temp = temp;
        this.coolingRate = coolingRate;
        this.factorToMultiply = factorToMultiply;
        /**
         * the next variables are local variables
        */
        //a table to show the development of variables on 10,50,100, 200,500, 1000,2000
        int counterTOShowDevelopement=0;
        // local variable to be compare with the new result if the new estimation of the result is smaller than this value the best record will be saved
        double bestResult= calculateTheValueOfSolution.estimatedResult();

        while (temp > 1) {
            // set temperature, cooling rate and the factor to multiply
            if (counterTOShowDevelopement==0){
                String verticalSpace="";
                String start="###########################################################";
                tableOfFigures.add(verticalSpace);
                tableOfFigures.add(verticalSpace);
                tableOfFigures.add(start);
                tableOfFigures.add(start);
                /**
                 *the form of "|" is used to be able to work filter the data on excel
                */
                String conditionsOfExperiment="The_original_temperature| "+temp+" | the_cooling_rate| "+ coolingRate+"| the_factor_to_multiply_with| "+ factorToMultiply;
                conditionsOfExperiment=conditionsOfExperiment.replace(".",",");
                tableOfFigures.add(conditionsOfExperiment);
            }
            for (int x=0;x<rawData.numberOfItemsOfSingleRaw();x++){
                // is there an improvement variable
                // todo boolean improvementTricker = false;
                // System.out.println("the X value is: "+x);
                /**
                 *calling the checking function
                 * if a variable did not show an improvement for a certain times of loops then it will be escaped
                 * and so the time of computing will be shorten
                 */
                generalMethods.checkMe(x);
                try {
                    if (true){
                        // call the a variable x
                        double oldValueOfTheVariable= calculateTheValueOfSolution.getOfTheGetter(x);
                        // the total estimation before the change
                        double resultBefor= calculateTheValueOfSolution.estimatedResult();
                        // call random method
                        double newValueOfTheVariable=generalMethods.giveMeARandom(oldValueOfTheVariable,2);
                        // check if an improvement is detected by injecting the random in the setter of the (x)
                        calculateTheValueOfSolution.setOfThesetter(x, newValueOfTheVariable);
                        // compare the two results resultBefore and resultAfter
                        double resultAfter= calculateTheValueOfSolution.estimatedResult();
                        // call improvementTricker to see if there is an improvement
                        // todo improvementTricker=newValueOfTheVariable<oldValueOfTheVariable;
                        //System.out.println("The current value: "+oldValueOfTheVariable+" and the new random one is: "+newValueOfTheVariable+" The Old Value: "+resultBefor +" New value: "+resultAfter);
                        // if resultBefore greater than result after then keep the change of the random value
                        // else keep the old value of the variable
                        if (resultAfter<resultBefor){
                            //System.out.println("a new Value accepted");
                        }else{
                            //System.out.println("No improvement was detected");
                            // if a random<P then keep the changes
                            // z is random number < p which is an equation
                            double zValue= Math.random();
                            /**
                             *first I have try to plugin the function values, however the absolute value can be huge and that might lead to p= infinity
                             * As a result I have taken the values of the variables to be the
                            */
                            double pValue= generalMethods.possiblityToAcceptASolution(resultAfter, resultBefor,temp);
                            //double pValue= generalMethods.possiblityToAcceptASolution(newValueOfTheVariable, oldValueOfTheVariable,temp);
                            //System.out.println("the value of the random Number is: "+ zValue +" and the value of the p: "+ pValue);
                            if (zValue<pValue){
                                //System.out.println("A limited bad result is accepted");

                            }else {
                                // the old value is set again --> no changes is taking place
                                calculateTheValueOfSolution.setOfThesetter(x,oldValueOfTheVariable);
                            }
                        }
                    }
                }catch (Exception e){
                    // System.out.println("there is an error");
                }
                // record the improvement todo
                //generalMethods.checkMe(x,improvementTricker,escapeMeAfter);
            }
            // getting the best result

            if (calculateTheValueOfSolution.estimatedResult()<bestResult){
                bestResult= calculateTheValueOfSolution.estimatedResult();
                bestRecord="Best_Loop#| "+counterTOShowDevelopement+
                        "|A1|"+ calculateTheValueOfSolution.getOfTheGetter(0)+
                        "|A2|"+calculateTheValueOfSolution.getOfTheGetter(1)+
                        "|A3|"+calculateTheValueOfSolution.getOfTheGetter(2)+
                        /*"|A4|"+calculateTheValueOfSolution.getOfTheGetter(3)+
                        "|A5|"+calculateTheValueOfSolution.getOfTheGetter(4)+*/
                        "|B|"+calculateTheValueOfSolution.getbVariable()+
                        "|FunctionValue| "+calculateTheValueOfSolution.estimatedResult();

            }
            // inceasing the counter to know the number of loops
            counterTOShowDevelopement++;
            // in a certain loop number keep the variables values
            if (counterTOShowDevelopement==10||
                counterTOShowDevelopement==20||
                counterTOShowDevelopement==50||
                counterTOShowDevelopement==100||
                counterTOShowDevelopement==200||
                counterTOShowDevelopement==500||
                counterTOShowDevelopement==1000||
                counterTOShowDevelopement==1500||
                counterTOShowDevelopement==2000||
                counterTOShowDevelopement==3000||
                counterTOShowDevelopement==5000||
                counterTOShowDevelopement==10000){
                String s="Loop#|"+counterTOShowDevelopement+
                        "|A1|"+ calculateTheValueOfSolution.getOfTheGetter(0)+
                        "|A2|"+calculateTheValueOfSolution.getOfTheGetter(1)+
                        "|A3|"+calculateTheValueOfSolution.getOfTheGetter(2)+
                        /*"|A4|"+calculateTheValueOfSolution.getOfTheGetter(3)+
                        "|A5|"+calculateTheValueOfSolution.getOfTheGetter(4)+*/
                        "|B|"+calculateTheValueOfSolution.getbVariable()+
                        "|FunctionValue| "+calculateTheValueOfSolution.estimatedResult();
                s=s.replace(".",",");
                tableOfFigures.add(s);
            }
            temp *= 1-coolingRate;
        }
        // showing the result that was gathered through the loop
        for (String singleString: tableOfFigures){
            System.out.println(singleString);
        }
        // show the final loop result
        String finalLoop= "Loop#|"+counterTOShowDevelopement+
                "| A1|"+ calculateTheValueOfSolution.getOfTheGetter(0)+
                "| A2|"+ calculateTheValueOfSolution.getOfTheGetter(1)+
                "| A3|"+calculateTheValueOfSolution.getOfTheGetter(2)+
                /*"| A4|"+calculateTheValueOfSolution.getOfTheGetter(3)+
                "| A5|"+calculateTheValueOfSolution.getOfTheGetter(4)+*/
                "| B|"+calculateTheValueOfSolution.getbVariable()+
                "| FunctionValue| "+calculateTheValueOfSolution.estimatedResult();
        finalLoop= finalLoop.replace(".",",");
        System.out.println(finalLoop);
        // Print out the best record that was noticed
        System.out.println("###############");
        System.out.println("The_Best_Record, Data_and_Time: "+ new Date());
        System.out.println("###############");
        System.out.println(bestRecord.replace(".",","));
    }
}
