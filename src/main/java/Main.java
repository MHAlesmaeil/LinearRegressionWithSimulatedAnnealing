import data.EstimatingTheValues;
import data.Implementation;
import data.RawData;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        RawData rawData = new RawData();
        Implementation implementation = new Implementation();
        EstimatingTheValues estimatingTheValue = new EstimatingTheValues();
        int y = 0;
        while (y < 20) {
            System.out.println(estimatingTheValue.giveMeARandom(2));
            y++;
        }

    }









}
