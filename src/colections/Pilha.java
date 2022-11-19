package colections;

import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();

        // ADICIONAR
        pilha.add("O hobbit"); //Se a pilha estiver cheia retorna ERRO
        pilha.push("Jogos vozes"); //Se a pilha estiver cheia retorna NULL

        // ACESSAR O PRIMEIRO ELEMENTO
        pilha.elementAt(0); //Se a pilha estiver vazia retorna ERRO
        pilha.peek(); //Se a pilha estiver vazia retorna ERRO

        // REMOVER
        pilha.pop(); //Se a pilha estiver vazia retorna ERRO
        pilha.remove(0); //Se a pilha estiver vazia retorna ERRO

    }
}
