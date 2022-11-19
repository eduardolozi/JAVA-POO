package classes.produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caneta Azul", 1.5F);
        Produto p2 = new Produto("Cadero sem pauta", 6F);
        Produto p3 = new Produto("Mochila Ben 10", 27.5F);
        
        System.out.println("O preco final da caneta azul eh R$" + p1.precoDesconto());
        System.out.println("O preco final do Cadero sem pauta eh R$" + Produto.precoDesconto(p2.preco));
        System.out.println("O preco final da Mochila Ben 10 eh R$" + Produto.precoDesconto(p3.preco));
    }

}
