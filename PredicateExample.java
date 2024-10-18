package Lambdas.ReadyFuntionalinterfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {


    public static void main(String[] args) {
        predicateExample();
        biPredicateExample();
    }


    public static void predicateExample(){
        Predicate<String> stringLen = s1 -> s1.length() < 10;
        System.out.println(stringLen.test("Apples") + " - apples is less than 10");


        Predicate<Integer> isEven1 = t -> {
            if(t % 2 == 0)
                return true;
            else
                return false;

        };
        System.out.println("is 6 even ? : " + isEven1.test(10));


    }

    public static void biPredicateExample(){
        BiPredicate<String,String> isLonger = (s1,s2) -> s1.length() >= s2.length();

        System.out.println("Is \"I love Java a lot!\" longer than \"Keep It Simple Stupid\" ?  : "
                + isLonger.test("I love Java a lot!", "Keep It Simple Stupid"));

        BiPredicate<String ,Integer> longerThanPredicate = (s,i) -> s.length() > i;
        System.out.println(longerThanPredicate.test("muvaffakiyetsizleştiricileştiriveremeyebileceklerimizdenmişsinizcesine",36));


        BiPredicate<String, Integer> shorterThanPredicate = (s, i) -> s.length() < i;
        System.out.println(shorterThanPredicate.test("Çekoslovakyalılaştırdıklarımızdan mısınız", 50));
    }

}
