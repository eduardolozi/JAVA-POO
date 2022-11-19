package arrays;

public class Equals {
    public static void main(String[] args) {
        //COMPARAR OBJETOS COM == É ERRADO, POIS COMPARA OS ENDEREÇOS DE MEMORIA
        //O EQUALS É UM MÉTODO QUE TODO OBJETO TEM POR PADRAO
        //NO ENTANTO, SE USAR O EQUALS PARA COMPARAR OBJETOS p1.equals(p2), VAI CONTINUAR COMPARANDO ENDEREÇO
        //O EQUALS PODE SER ESPECIFICADO NUMA CLASSE
        //O HASHCODE É UMA FERRAMENTA QUE PODE SER USADA COM O EQUALS PARA DIMINUIR O ESCOPO DE BUSCA
        //O HASHCODE PROCURA OS ITENS DO CONJUNTO QUE POSSUEM SIMILARIDADE COM A INFORMAÇAO PASSADA

        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario();

        u1.nome = "Eduardo Lozano";
        u1.email = "eduardo@gmail.com";
        
        u2.nome = "Eduardo Lozano";
        u2.email = "eduardo@gmail.com";

        System.out.println(u1.equals(u2));
    }
}
