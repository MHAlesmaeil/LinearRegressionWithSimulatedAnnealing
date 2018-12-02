package data;
/**
 *This class deals with the the method to calculate the value of a solution
*/
public class CalculateTheValueOfSolution {

    // initialing the variables with a value of 1
    double a1=1;
    double a2=1;
    double a3=1;
    double bVariable=1;

    RawData rawData = new RawData();
    // equation to prove the estimated value of the single elements
    // the closer the result to zero the best it will be
    // the result is the sum = (y1-(a1x1+a2x2+a3x3+...anxn+b))^2+(y2-(a1x1+a2x2+a3x3+...anxn+b))^2+ (y3-(a1x1+a2x2+a3x3+...anxn+b))^2 + ... +(yn-(a1x1+a2x2+a3x3+...anxn+b))^2

   public double estimatedResult (double a1, double bVariable){
        double result =0;
        for (int rawCount=0; rawCount<rawData.numberOfRaws();rawCount++){
         result+= Math.pow((rawData.list[rawCount][0])-((rawData.list[rawCount][1])*a1+bVariable),2);
        }
        return result;
    }
    public double estimatedResult (double a1, double a2, double bVariable){
        double result =0;
        for (int rawCount=0; rawCount<rawData.numberOfRaws();rawCount++){
            result+= Math.pow((rawData.list[rawCount][0])-((rawData.list[rawCount][1])*a1+(rawData.list[rawCount][2])*a2+bVariable),2);
        }
        return result;
    }
    public double estimatedResult (double a1, double a2,double a3, double bVariable){
        double result =0;
        for (int rawCount=0; rawCount<rawData.numberOfRaws();rawCount++){
            result+= Math.pow((rawData.list[rawCount][0])-((rawData.list[rawCount][1])*a1+(rawData.list[rawCount][2])*a2+ (rawData.list[rawCount][3])*a3+bVariable),2);
        }
        return result;
    }
    public double estimatedResult (){
        double result =0;
        for (int rawCount=0; rawCount<rawData.numberOfRaws();rawCount++){
            result+= Math.pow((rawData.list[rawCount][0])-((rawData.list[rawCount][1])*a1+(rawData.list[rawCount][2])*a2+ (rawData.list[rawCount][3])*a3+bVariable),2);
        }
        return result;
    }

    /**
     *as the getter and setter hard coded with the next function we would automate the getting and setting each variables
     */
    public void setOfThesetter (int x, double theNewValue){
       if (x==0)
           setA1(theNewValue);
       else if (x==1)
           setA2(theNewValue);
       else if (x==2)
           setA3(theNewValue);
       else if (x==3)
           setbVariable(theNewValue);
    }
    public double getOfTheGetter (int x){
        double value=0;
        if (x==0)
            value= a1;
        else if (x==1)
            value= a2;
        else if (x==2)
            value= a3;
        else if (x==3)
            value= bVariable;
        return value;
    }


    /**
     *getter and setter
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

    public double getbVariable() {
        return bVariable;
    }

    public void setbVariable(double bVariable) {
        this.bVariable = bVariable;
    }
}
