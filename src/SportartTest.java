import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SportartTest {
    public static void main(String[] args) {
        ArrayList<Sportarten> sportarten = new ArrayList<>();
        sportarten.add(new Sportarten("Ringen", true));
        sportarten.add(new Sportarten("Handball", true));
        sportarten.add(new Sportarten("Tennis", true));
        sportarten.add(new Sportarten("Schach", false));

        Sportarten such = new Sportarten("Ringen", true);

        boolean equals= sportarten.get(0).equals(such);
        System.out.println("equals= "+ equals);
        boolean contains = sportarten.contains(such); //indexOf ->equals
        System.out.println("contains= "+ contains); // false while es ist nicht der selber objekt ist
       //A4
        // sportarten.removeIf(s->!s.isOlympisch());


        //A5
        sportarten.sort(Comparator.naturalOrder());
        int index= Collections.binarySearch(sportarten, such);
        System.out.println("index: "+index);
    }
}
