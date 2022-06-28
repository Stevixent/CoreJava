package Collection.ListInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListClass {
    public static void main(String[] args) {
        //Creating an object of List Interface
        //Implemented by ArrayList Class
        ArrayList<String> obj = new ArrayList<>();

        // adding elements to object of List Interface
        String obj1 = new String("Element 1");
        String obj2 = new String("Element 2");
        String obj3 = new String("Element 3");
        String obj4 = new String("Element 4");


        System.out.println("Size of ArrayList is " + obj.size());

        obj.add(obj1);
        obj.add(obj2);
        obj.add(obj3);
        obj.add(obj4);

        System.out.println("ArrayList after adding the objects: " + obj);
        System.out.println("Size of ArrayList after adding objects: " + obj.size());

        obj.remove(2);
        obj.remove(obj4);

        System.out.println("ArrayList after removing the objects: " + obj);
        System.out.println("Size of ArrayList after removing objects: " + obj.size());

        System.out.println("The Final ArrayList: ");
        ListIterator i = obj.listIterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
