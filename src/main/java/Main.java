import data.RawData;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List arrayList = new ArrayList ();
        // list of the sales and the number of the radio spots
        double [][] list = {{140, 20},{136, 10},{94,5},{190,22},{161,26},{112,12},{143,16},{151,7},{103,6},{181,34},{176,18},{128,4}};

        /*arrayList.add(list);
        System.out.println(list[0][1]);
        double[] [] v = (double[][]) arrayList.get(0);
        System.out.println(v[1][0]);*/
        RawData rawData = new RawData();
        System.out.println(rawData.calculatingOfVaibaleCoefficient());









    }
}
