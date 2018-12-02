package impl;

import exampleOfTSP.City;

import java.util.ArrayList;

public class DataManager {
    // Holds our cities
    private ArrayList dataSetArrayList = new ArrayList<DataSet>();



    // to be added later on{94, 5}, {190, 22}, {161, 26}, {112, 12}, {143, 16}, {151, 7}, {103, 6}, {181, 34}, {176, 18}, {128, 4}};

    // Adds a destination city
    public void addDataSet(double[] dataset) {
        dataSetArrayList.add(dataset);
    }

    // Get a city
    public double getDataSet(int index){
        return (double)dataSetArrayList.get(index);
    }
    // Get the number of destination cities
    public  int numberOfDataSet(){
        return dataSetArrayList.size();
    }
}
