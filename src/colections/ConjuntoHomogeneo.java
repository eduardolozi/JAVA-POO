package colections;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoHomogeneo {
    public static void main(String[] args) {
        //Set<String> aprovados = new HashSet<>();
        SortedSet<Integer> aprovados2 = new TreeSet<>(); //-> ESSE SET É ORDENADO

        aprovados2.add(1);
        aprovados2.add(14);
        aprovados2.add(10);

        for (int candidato : aprovados2) {
            System.out.println(candidato);
        }
    }
}
