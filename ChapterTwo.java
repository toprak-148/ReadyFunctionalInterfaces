package Lambdas.ReadyFuntionalinterfaces;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
//Source: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/package-summary.html
public class ChapterTwo {
    /*
    *   İnterface Name            Argument       Returns                 Example
    *       Predicate<T>            T              boolean          Has this album been raleased yet
    *       Consumet<T>             T               void            Printing out a value
    *       Function<T,R>           T                R              Get the name from an Artist object
    *       Supplier<T>             None             T              A factory Method
    *       UnaryOperator<T>        T                T              Logical Not (!)
    *       BinaryOperator<T>       (T,T)            T              Multiplying two numbers
    *
    * */




    public static void main(String[] args) {

       /* BiFunction<Integer, Integer, Double> doubleConstructor = (num1, num2) -> new Double(Integer.toString(num1) + "." + Integer.toString(num2));
        System.out.println("Constructting a double using 3 and 1415" + doubleConstructor.apply(3,1415));
        System.out.println("Constructing a double using 0 and 26" + doubleConstructor.apply(0,26));
*/

        /*BiFuntion performs string type addition of num1 and num2 values. 15+29 = 1529 */
        BiFunction<Integer,Integer,String> concat = ( num1,num2) -> Integer.toString(num1) + Integer.toString(num2);
        System.out.println("215 and 89 are  concat'd:" + concat.apply(215,89));
        //BiPridicate Function takes 2 values. Process in is validation. 6 > 5 == true
        BiPredicate<Integer,Integer> isGraterThanPredicate= ( num1, num2) -> num1 > num2;
        System.out.println(isGraterThanPredicate.test(6,5));




    }

}