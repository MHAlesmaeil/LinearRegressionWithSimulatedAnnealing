package data;

public class RawData {
    double[][] list = {{140, 20}, {136, 10}, {94, 5}, {190, 22}, {161, 26}, {112, 12}, {143, 16}, {151, 7}, {103, 6}, {181, 34}, {176, 18}, {128, 4}};

    // returning the number of the raw
    public int numberOfRaws() {
        if (list != null) {
            return list.length;
        } else {
            return 0;
        }

    }

    public int numberOfItemsOfSingleRaw() {
        if (list != null) {
            double[] temp = list[0];
            return temp.length;
        } else {
            return 0;
        }
    }

    public double averageOfTheElement(int elementNumber) {
        double averageOfFirstElment = 0;
        for (int x = 0; x < list.length; x++) {
            double sum = 0;
            // summing the numbers
            averageOfFirstElment += list[x][elementNumber - 1];
            if (x == list.length - 1) {
                averageOfFirstElment = averageOfFirstElment / (x + 1);
            }
        }
        return averageOfFirstElment;
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

    public double giveMeTheSqueerRoot(double number) {
        return Math.sqrt(number);
    }

    public double giveMeTheSqueerRoot(int number) {
        return Math.sqrt(number);
    }

    public double calculatingOfVaibaleCoefficient() {
        double varibaleCoefficient = 0;
        double resultToBeMultiplyedInTheFunction=1;
        for (int x = 0; x < numberOfRaws() - 1; x++) {
            varibaleCoefficient=0+resultToBeMultiplyedInTheFunction;
            double resultTobeSquerred = giveMeTheSqueerRoot(resultToBeMultiplyedInTheFunction);

            for (int y = 0; y < numberOfItemsOfSingleRaw(); y++) {
                double yVar = deviationOfElementRawFromAverage(x, y);
                System.out.println(yVar);
            }
        }
        return varibaleCoefficient;
    }


}


