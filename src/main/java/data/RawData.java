package data;

/**
 * this class deals with the raw data and gives some basic methods to get more information about it
*/
public class RawData {
    public double[][] list = {{140, 20,18,0}, {136, 10,0,1},{94, 5,24,0},{190, 22,0,1},{161, 26,18,0},{112, 12,12,0},{143, 16,12,0},{151, 7,18,1},{103, 6,0,0},{181, 34,18,1},{176, 18,0,1},{128, 4,24,0}};


    // returning the number of the raw or how many set of data are entered
    public int numberOfRaws() {
        if (list != null) {
            return list.length;
        } else {
            return 0;
        }
    }
    // return how many elements in the first row
    public int numberOfItemsOfSingleRaw() {
        if (list != null) {
            double[] temp = list[0];
            return temp.length;
        } else {
            return 0;
        }
    }
    public double averageOfTheElement(int elementNumber) {
        double averageOfItem = 0;
        for (int x = 0; x < list.length; x++) {
            double sum = 0;
            // summing the numbers
            averageOfItem += list[x][elementNumber - 1];
            if (x == list.length - 1) {
                averageOfItem = averageOfItem / (x + 1);
            }
        }
        return averageOfItem;
    }
    public double deviationOfElementRawFromAverage(int rawNumber, int elemetPosition) {
        if (rawNumber < numberOfRaws() && rawNumber >= 0 && elemetPosition < numberOfItemsOfSingleRaw() && elemetPosition >= 0) {
            try {
                double deviation;
                return deviation = list[rawNumber][elemetPosition]-averageOfTheElement(elemetPosition+1);

            } catch (Exception e) {
                System.out.println(e);
                return 0;
            }
        } else return 0;
    }
    // a function to get a square root
    public double giveMeTheSqueerRoot(double number) {
        return Math.sqrt(number);
    }
    // function to get a power 2
    public double giveMeThePower2(int number) {
        return Math.pow(number,2);
    }


    public double multiplicationOfDeviationOfVariableFromTheirMains(int rawNumber) {
        double varibaleCoefficient = 0;
        double resultToBeMultiplyedInTheFunction=1;
            for (int y = 0; y < numberOfItemsOfSingleRaw(); y++) {
                double yVar = deviationOfElementRawFromAverage(rawNumber, y);
                //System.out.println(yVar);
                if (true)
                    resultToBeMultiplyedInTheFunction = resultToBeMultiplyedInTheFunction*yVar;
        }
        varibaleCoefficient= resultToBeMultiplyedInTheFunction;
        return varibaleCoefficient;
    }
    public double summingTheMulipilyedDeviation (){
        double sum=0;
        for (int x =0; x<numberOfRaws();x++){
            sum+=multiplicationOfDeviationOfVariableFromTheirMains(x);
        }
        return sum;
    }
    public double squareDeviationOfAnEtlemFromTheMains (int rawNumber,int elementNumber){
        double result =0;
        // called the average of the item from the function
        averageOfTheElement(elementNumber);
        // squared of the called item - average
        result = Math.pow(list[rawNumber][elementNumber]-averageOfTheElement(elementNumber+1),2);
        return result ;
    }
    public double sumOfSquaredVariable (int elementNumber){
        double sum=0;
        try {
            for (int x =0; x<numberOfRaws();x++){
                sum+=squareDeviationOfAnEtlemFromTheMains(x,elementNumber);
            }
            return sum;
        } catch (Exception e){
            System.out.println(e);
        }
        return sum;
    }
    public double coefficientValeOfAnElemet (int elementNumber){
        double value=0;
        value= summingTheMulipilyedDeviation()/sumOfSquaredVariable(elementNumber);

        return value;
    }
}


