package Collection.ListInterface;

import java.util.ListIterator;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        Vector<Double> obj = new Vector<>();
        Double obj1 = new Double(77.5);
        Double obj2 = new Double(68.1);
        Double obj3 = new Double(52.8);
        Double obj4 = new Double(40.2);

        System.out.println("Size of Vector is: " + obj.size());

        obj.add(obj1);
        obj.add(obj2);
        obj.add(obj3);
        obj.add(obj4);

        System.out.println("Vector after adding objects: " + obj);
        System.out.println("Size of Vector after adding objects: " + obj.size());

        obj.remove(obj1);
        obj.remove(obj3);

        System.out.println("Vector after removing objects: " + obj);
        System.out.println("Size of Vector removing objects: " + obj.size());

        System.out.println("The Final Vector: ");
        ListIterator i = obj.listIterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
