public class Calculator {
    private final float firstNumber;
    private final float secondNumber;
    private final double  pi;
    private final float radius;
    private float Nnumber;

    Calculator(int firstNumber,int secondNumber,int radius){
    this.firstNumber=firstNumber;
    this.secondNumber=secondNumber;
    this.radius=radius;
    this.pi=Math.PI;
    }

    public float addingTwoNumbers(){
    return this.firstNumber+this.secondNumber;
    }

    public float addingNNumbers(int nnumber){
       return  this.Nnumber=nnumber;
    }

    public  float subtractingTwoNumbers(){
        return this.firstNumber-this.secondNumber;
    }

    public float multiplyNumbers(){
     return this.firstNumber*this.secondNumber;
    }

    public float divideNumbers(){
      return this.firstNumber/this.secondNumber;
    }

    public double circleArea(){
        return radius*radius*pi;
    }
}
