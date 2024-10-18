package Lambdas.ReadyFuntionalinterfaces;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Calculator {


    protected BinaryOperator<Double> adder = (arg1,arg2) -> arg1+arg2;
    protected BinaryOperator<Double> subtracter = (arg1,arg2) -> arg1 + - arg2;
    protected BinaryOperator<Double> multiplier = ( arg1 , arg2 ) -> arg1*arg2;
    protected BinaryOperator<Double> divider = (arg1,arg2) -> arg1 / arg2;
    protected BinaryOperator<Double> power = (arg1,arg2) -> Math.pow(arg1,arg2);

    public double add(double arg1,double arg2){
        return adder.apply(arg1,arg2);
    }

    public double substract(double arg1,double arg2){
        return subtracter.apply(arg1,arg2);
    }

    public double multiply(double arg1,double arg2){
        return multiplier.apply(arg1,arg2);
    }
    public double divide(double arg1,double arg2){
        return divider.apply(arg1,arg2);
    }
    public double pow(double arg1,double arg2){
        return power.apply(arg1,arg2);
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5,2));
        System.out.println(calculator.pow(2,2));
        System.out.println(calculator.divide(7,3));
        System.out.println(calculator.multiply(9,3));

        Predicate<Integer> isEvenPridicate = (num)-> num % 2 == 0;



    }



}
