package xUnitEpam;

public class Calculator {
    public double Sum(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public double Subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public double Multiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public double Dividing(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public double GetSin(double number) {
        return Math.sin(Math.toRadians(number));
    }

    public double GetCos(double number) {
        return Math.cos(Math.toRadians(number));
    }

    public double CarryToTheDegree(double number, double degree) {
        return Math.pow(number, degree);
    }

    public double GettingPercent(double firstNumber, double secondNumber) {
        return (secondNumber * 100) / firstNumber;
    }

    public double GetTan(double number) {
            return Math.round(Math.tan(Math.toRadians(number)));
    }

    public double GetCTan(double number){
        return 1 / GetTan(number);
    }

    public double GetRoot(double number) {
        return Math.sqrt(number);
    }

}
