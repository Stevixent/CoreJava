package Collection.Classwork;


import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;

public class NINDatabase {
    public static void main(String[] args) {

        NIN john = new NIN(123456);
        NIN james = new NIN(37647);
        NIN joy = new NIN(25340);

        HashSet<NIN> nin = new HashSet<>();
        nin.add(john);
        nin.add(james);
        nin.add(joy);

        System.out.println("The total number of NIN available now is: " + nin.size());

        Iterator iterator = nin.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
