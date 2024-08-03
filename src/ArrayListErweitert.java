import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ArrayListErweitert {
    public static void main(String[] args) {

        //A1
        List<String>wochentage= new ArrayList<>();
        wochentage.addAll(List.of("mo", "di", "mi", "do", "fr"));
        Iterator<String>itWochentage =wochentage.iterator();
        //bis es gibts wochentage
        // iterator: steht vor die element has next liefert ein true
        //next method liefert die element und get weiter, wandert zu dienstag
        while(itWochentage.hasNext()){
            System.out.println(itWochentage.next());
        }

        //A2
        Random random= new Random();
        List<Integer>list =new ArrayList<>();
        for(int i=0; i<10; i++){
            list.add(random.nextInt(51));
        }
        Predicate<Integer>predUngerade=n->n%2==1;
        list.removeIf(predUngerade);
        System.out.println(list);

        //A3

        list =new ArrayList<>();
        for(int i=0; i<10; i++){
            list.add(random.nextInt(51));
        }

        UnaryOperator<Integer> uop=i->i%2==0 ?i:0;
                list.replaceAll(uop);
                System.out.println(list);

       //A4
        list =new ArrayList<>();
        for(int i=0; i<10; i++){
            list.add(random.nextInt(51));
        }
        System.out.println(list);
        //new Integer[0] als argument übergeben
        Integer[] intArr = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(intArr));

        //A5
        //anonymous Array
       // intArr={1,2,3,4,5};
        intArr= new Integer[] {1, 2, 3, 4, 5};
        //das kann man nicht verändern
        list= Arrays.asList(intArr); //1. Variante connected by the hip, Liste kann nicht in der Größe verändert werden(kein hinzufügen oder löschen
        list = new ArrayList<>(Arrays.asList(intArr)); // 2. Variante, copy-Konstruktor, ArrayList kann in der Größe verändeert werden

        //A6
        wochentage= Arrays.asList(new String[] {"montag", "di", "mittw", "freitagabend"});
        System.out.println(wochentage);
        wochentage.sort(null);
        System.out.println(wochentage);
        //nach länge des String sortiert
        Comparator<String>complaenge=(s1,s2)->s1.length()==s2.length() ? s1.compareTo(s2): s1.length()-s2.length();
        wochentage.sort(complaenge);
        System.out.println(wochentage);
    }
}
