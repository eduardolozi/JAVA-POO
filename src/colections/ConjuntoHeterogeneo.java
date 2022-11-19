package colections;

import java.util.HashSet;

public class ConjuntoHeterogeneo {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        //O SET NÃO PERMITE ITENS REPETIDOS
        //NAO TEM INDEX PARA CADA ITEM


        HashSet conjunto1 = new HashSet();
        HashSet conjunto2 = new HashSet();
        
        conjunto1.add(1); //int -> Integer
        conjunto1.add("Juan Alberto");
        conjunto1.add(true);

        System.out.println("Conjunto 1: " + conjunto1);
 
        conjunto2.add(1);
        conjunto2.add(3.43);
        conjunto2.add(false);

        System.out.println("Conjunto 2: " + conjunto2);

        //conjunto1.addAll(conjunto2); //UNIÃO
        //System.out.println("Uniao: " + conjunto1);
        
        conjunto1.retainAll(conjunto2); //INTERSEÇÃO
        System.out.println("Intersecao: " + conjunto1);

        conjunto1.clear();
        conjunto2.clear();

    }
}
