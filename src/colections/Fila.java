package colections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        
        //INSERIR
        fila.offer("Eduardo"); //quando a lista está cheia retorna false
        fila.add("Bubbles"); //quando a lista está cheia retorna ERRO
        fila.add("Bob Robson"); 
        
        //ACESSAR O PRIMEIRO ITEM SEM REMOVER
        fila.peek(); //quando a lista está vazia retorna NULL
        fila.element(); //quando a lista está vazia retorna ERRO
        
        //REMOVER
        fila.poll(); //quando a lista está vazia retorna NULL
        fila.remove(); //quando a lista está vazia retorna ERRO


        //REMOVE TODOS OS ELEMENTOS DA FILA
        fila.clear();

        fila.isEmpty();
        
        fila.size();
    }
    
}
