package colections;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> listaUsers = new ArrayList<>();
        Usuario u1 = new Usuario("Eduardo");

        listaUsers.add(u1);
        listaUsers.add(new Usuario("Anacleto"));
        listaUsers.add(new Usuario("Bundassauro"));
        listaUsers.add(new Usuario("Eduardo"));

        // ACESSAR ITEM POR INDEX -> listaUsers.get(index)
        System.out.println(listaUsers.get(2)); 
        
        // VERIFICA SE A LISTA CONTEM O ITEM -> listaUsers.contains
        System.out.println(listaUsers.contains(new Usuario("Anacleto")));
    
        System.out.println(listaUsers.remove(new Usuario("Poronga"))); 
        System.out.println(listaUsers.remove(new Usuario("Anacleto"))); 
        
        for (Usuario usuario : listaUsers) {
            System.out.println(usuario.nome);
        }
            
    }
}
