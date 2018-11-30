package data;

import java.util.ArrayList;

public class RawData {
    double [][] list = {{140, 20},{136, 10},{94,5},{190,22},{161,26},{112,12},{143,16},{151,7},{103,6},{181,34},{176,18},{128,4}};
    // returning the number of the raw
    public int numberOfRaws (){
        if (list != null){
            return list.length;
        }else{
            return 0;
        }

    }
    public int numberOfItemsOfSingleRaw (){
        if (list != null){
            double [] temp = list [0];
            return temp.length;
        }else{
            return 0;
        }
    }
    public double averageOfTheElement (int elementNumber){
        double averageOfFirstElment = 0;
        for (int x= 0; x<list.length;x++){
            double sum =0;
            // summing the numbers
            averageOfFirstElment += list[x][elementNumber-1];
            if (x==list.length-1){
                averageOfFirstElment= averageOfFirstElment/(x+1);
            }
        }
        return averageOfFirstElment;
    }
    public double deviationOfElementRawFromAverage (int rawNumber, int elemetPosition){
        try {
            double deviation;
            return deviation= list[rawNumber][elemetPosition];

        }catch (Exception e){
            System.out.println(e);
            return 0;
        }
    }
}
