package WildCards;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildcardDemo {
    public static void main(String[] args) {
        //integer List
        List<Integer> integerList = Arrays.asList(10, 20, 30, 40);

        //Double list (try float)
        List<Double> doubleList = Arrays.asList(11.5, 13.6, 67.8, 43.7);

        printList(integerList);
        printList(doubleList);
    }
    private static void printList(List < ?>list){
        System.out.println(list);
    }
}
