package impl;

import exampleOfTSP.City;
import exampleOfTSP.TourManager;

import java.util.ArrayList;

public class DataProcessing {
    DataManager dataManager = new DataManager();

    // those values are the estimated solution of each varibale of Data Set class
    double a1=1,a2=1,a3=1,a4=1,a5=1,a6=1, a7=1, a8=1, a9=1, b1=1;
    DataSet dataSet = new DataSet();

    private ArrayList optimization = new ArrayList<DataSet>();

/*

    public double estamtedResult() {
            double result =0;
            for (int dataSetindex =0; dataSetindex< dataManager.numberOfDataSet();dataSetindex++){
                // // the result is the sum = (y1-(a1x1+a2x2+a3x3+...anxn+b))^2+(y2-(a1x1+a2x2+a3x3+...anxn+b))^2+ (y3-(a1x1+a2x2+a3x3+...anxn+b))^2 + ... +(yn-(a1x1+a2x2+a3x3+...anxn+b))^2
               result+= Math.pow(dataManager.getDataSet(dataSetindex).getGenratedSales()-(
                                 dataManager.getDataSet(dataSetindex).getVariable1()*getA1()+
                                 dataManager.getDataSet(dataSetindex).getVariable2()*getA2()+
                                 dataManager.getDataSet(dataSetindex).getVariable3()*getA3()+
                                 dataManager.getDataSet(dataSetindex).getVariable4()*getA4()+
                                 dataManager.getDataSet(dataSetindex).getVariable5()*getA5()+
                                 dataManager.getDataSet(dataSetindex).getVariable6()*getA6()+
                                 dataManager.getDataSet(dataSetindex).getVariable7()*getA7()+
                                 dataManager.getDataSet(dataSetindex).getVariable8()*getA8()+
                                 dataManager.getDataSet(dataSetindex).getVariable9()*getA9()+getB1()),2);
            }
            return result;
        }
*/

    /**
     * Constructors
    *//*
    public DataProcessing(double a1, double b1) {
        this.a1 = a1;
        this.b1 = b1;
    }

    public DataProcessing(double a1, double a2, double b1) {
        this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
    }

    public DataProcessing(double a1, double a2, double a3, double b1) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.b1 = b1;
    }

    public DataProcessing(double a1, double a2, double a3, double a4, double b1) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.b1 = b1;
    }

    public DataProcessing(double a1, double a2, double a3, double a4, double a5, double b1) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
        this.b1 = b1;
    }

    public DataProcessing(double a1, double a2, double a3, double a4, double a5, double a6, double b1) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
        this.a6 = a6;
        this.b1 = b1;
    }

    public DataProcessing(double a1, double a2, double a3, double a4, double a5, double a6, double a7, double b1) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
        this.a6 = a6;
        this.a7 = a7;
        this.b1 = b1;
    }

    public DataProcessing(double a1, double a2, double a3, double a4, double a5, double a6, double a7, double a8, double b1) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
        this.a6 = a6;
        this.a7 = a7;
        this.a8 = a8;
        this.b1 = b1;
    }

    public DataProcessing(double a1, double a2, double a3, double a4, double a5, double a6, double a7, double a8, double a9, double b1) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
        this.a6 = a6;
        this.a7 = a7;
        this.a8 = a8;
        this.a9 = a9;
        this.b1 = b1;
    }*/
    /**
     * Getters and setters
    */
    public double getA1() {
        return a1;
    }

    public void setA1(double a1) {
        this.a1 = a1;
    }

    public double getA2() {
        return a2;
    }

    public void setA2(double a2) {
        this.a2 = a2;
    }

    public double getA3() {
        return a3;
    }

    public void setA3(double a3) {
        this.a3 = a3;
    }

    public double getA4() {
        return a4;
    }

    public void setA4(double a4) {
        this.a4 = a4;
    }

    public double getA5() {
        return a5;
    }

    public void setA5(double a5) {
        this.a5 = a5;
    }

    public double getA6() {
        return a6;
    }

    public void setA6(double a6) {
        this.a6 = a6;
    }

    public double getA7() {
        return a7;
    }

    public void setA7(double a7) {
        this.a7 = a7;
    }

    public double getA8() {
        return a8;
    }

    public void setA8(double a8) {
        this.a8 = a8;
    }

    public double getA9() {
        return a9;
    }

    public void setA9(double a9) {
        this.a9 = a9;
    }

    public double getB1() {
        return b1;
    }

    public void setB1(double b1) {
        this.b1 = b1;
    }

    @Override
    public String toString() {
        return "DataProcessing{" +
                "a1=" + a1 +
                ", a2=" + a2 +
                ", a3=" + a3 +
                ", a4=" + a4 +
                ", a5=" + a5 +
                ", a6=" + a6 +
                ", a7=" + a7 +
                ", a8=" + a8 +
                ", a9=" + a9 +
                ", b1=" + b1 +
                ", optimization=" + optimization +
                '}';
    }
}
