package data;
/**
 *This class deals with the the method to calculate the value of a solution
*/
public class CalculateTheValueOfSolution {

    // initialing the variables with a value of 1
    double a1=1;
    double a2=1;
    double a3=1;
    double a4=1;
    double a5=1;
    double a6=1;
    double a7=1;
    double a8=1;
    double a9=1;
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
               result+= Math.pow((rawData.list[rawCount][0])-
                                ((rawData.list[rawCount][1])*a1+
                                 (rawData.list[rawCount][2])*a2+
                                 (rawData.list[rawCount][3])*a3+
                                 (bVariable)),2);
        }
        return result;
    }
    /**
     *this method can calculate the values of 10 variables 9*Ai+B
    */
    public double estatingResult (){
       double result = 0;
        double temp = 0;
        double negavitive =0;
        for (int x =0; x<rawData.numberOfRaws();x++){
            if (true)temp+=((rawData.list[x][0]-bVariable));
                        if(true)try {negavitive+=(rawData.list[x][1]*a1);}catch (Exception e){}
                        else if(true)try {negavitive+=(rawData.list[x][2]*a2);}catch (Exception e){}
                        else if(true)try {negavitive+=(rawData.list[x][3]*a3);}catch (Exception e){}
                        /*else if(true&&rawData.numberOfItemsOfSingleRaw()<=4)try {negavitive+=(rawData.list[x][4]*a4);}catch (Exception e){}
                        else if(true&&rawData.numberOfItemsOfSingleRaw()<=5)try {negavitive+=(rawData.list[x][5]*a5);}catch (Exception e){}
                        else if(true&&rawData.numberOfItemsOfSingleRaw()<=6)try {negavitive+=(rawData.list[x][6]*a6);}catch (Exception e){}
                        else if(true&&rawData.numberOfItemsOfSingleRaw()<=7)try {negavitive+=(rawData.list[x][7]*a7);}catch (Exception e){}
                        else if(true&&rawData.numberOfItemsOfSingleRaw()<=8)try {negavitive+=(rawData.list[x][8]*a8);}catch (Exception e){}
                        else if(true&&rawData.numberOfItemsOfSingleRaw()<=9)try {negavitive+=(rawData.list[x][9]*a9);}catch (Exception e){}*/
           result+= Math.pow((temp-negavitive),2);
           // rest the values of the temporary variables
           temp=0;
           negavitive=0;
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
       else if (x==4)
           setA4(theNewValue);
       else if (x==5)
           setA5(theNewValue);
       else if (x==6)
           setA6(theNewValue);
       else if (x==7)
           setA7(theNewValue);
       else if (x==8)
           setA8(theNewValue);
       else if (x==9)
           setA9(theNewValue);
    }
    public double getOfTheGetter (int x){
        double value=0;
        if (x==0)
            value= getA1();
        else if (x==1)
            value= getA2();
        else if (x==2)
            value= getA3();
        else if (x==3)
            value= getbVariable();
        else if (x==4)
            value= getA4();
        else if (x==5)
            value= getA5();
        else if (x==6)
            value= getA6();
        else if (x==7)
            value= getA7();
        else if (x==8)
            value= getA8();
        else if (x==9)
            value= getA9();
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
}
