package Collection.ListInterface;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<Integer> obj = new LinkedList<>();
        Integer obj1 = new Integer(101);
        Integer obj2 = new Integer(102);
        Integer obj3 = new Integer(103);
        Integer obj4 = new Integer(104);

        System.out.println("Size of the LinkedList is: " + obj.size());

        obj.add(obj1);
        obj.add(obj2);
        obj.add(obj3);
        obj.add(obj4);

        System.out.println("LinkedList after adding the objects: " + obj);
        System.out.println("Size of LinkedList after adding the objects: " + obj.size());

        obj.remove(2);
        obj.remove(obj2);

        System.out.println("LinkedList after removing the objects: " + obj );
        System.out.println("Size of LinkedList after removing the objects: " + obj.size());

        System.out.println("The Final LinkedList: ");
        ListIterator i = obj.listIterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}
