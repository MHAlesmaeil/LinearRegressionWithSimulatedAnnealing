package data;

public class Implementation {

    RawData rawData = new RawData();
    // equation to prove the estimated value of the single elements
    // the closer the result to zero the best it will be
    // the result is the sum = (y1-(a1x1+a2x2+a3x3+...anxn+b))^2+(y2-(a1x1+a2x2+a3x3+...anxn+b))^2+ (y3-(a1x1+a2x2+a3x3+...anxn+b))^2 + ... +(yn-(a1x1+a2x2+a3x3+...anxn+b))^2

    public double estimatedResult (double a1, double b){
        double result =0;
        for (int rawCount=0; rawCount<rawData.numberOfRaws();rawCount++){
         result+= Math.pow((rawData.list[rawCount][0])-((rawData.list[rawCount][1])*a1+b),2);
        }
        return result;
    }
    public double estimatedResult (double a1, double a2, double b){
        double result =0;
        for (int rawCount=0; rawCount<rawData.numberOfRaws();rawCount++){
            result+= Math.pow((rawData.list[rawCount][0])-((rawData.list[rawCount][1])*a1+(rawData.list[rawCount][2])*a2+b),2);
        }
        return result;
    }
    public double estimatedResult (double a1, double a2,double a3, double b){
        double result =0;
        for (int rawCount=0; rawCount<rawData.numberOfRaws();rawCount++){
            result+= Math.pow((rawData.list[rawCount][0])-((rawData.list[rawCount][1])*a1+(rawData.list[rawCount][2])*a2+ (rawData.list[rawCount][3])*a3+b),2);
        }
        return result;
    }
}
