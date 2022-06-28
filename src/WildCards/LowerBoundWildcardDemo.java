package WildCards;

import java.util.Arrays;
import java.util.List;

public class LowerBoundWildcardDemo {
    public static void main(String[] args) {
        //Lower Bounded Integer List
        List<Integer> intList = Arrays.asList(10, 20, 30, 40);
        //Passing Integer List Object
        printOnlyIntegerClassorSuperClass(intList);

        // Number List
        List<Number> numberList = Arrays.asList(10, 20, 30, 40);
        //passing Integer list object
        printOnlyIntegerClassorSuperClass(numberList);

    }
    public static void printOnlyIntegerClassorSuperClass(List< ?super Integer > list) {
        System.out.println(list);
    }
}
