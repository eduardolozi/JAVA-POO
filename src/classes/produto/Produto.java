package classes.produto;

public class Produto {
    String nome;
    float preco;
    static float desconto = 0.25F;

    Produto() {
       //construtor padrao, podem ser colocadas coisas aqui dentro se quiser 
    }

    Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    float precoDesconto() {
        return this.preco - (this.preco * desconto); //desconto nao tem this pois é static
    }

    static float precoDesconto(float pr) {
        return pr - (pr * desconto); //esse método é static, entao nao usamos this
    }
}

/*
    ============== CLASSES POSSUEM MEMBROS INTERNOS QUE SÃO SEUS ATRIBUTOS E SEUS MÉTODOS ================
    
    -> OS MÉTODOS AS VEZES NAO PRECISAM RECEBER PARAMETROS, ISSO PQ OS ATRIBUTOS JA ESTAO DENTRO DA CLASSE.

    -> PODEM TER MÉTODOS DE MESMO NOME NA CLASSE, ISSO PQ PODEM RECEBER QTD DE PARÂMETROS DIFERENTES (RETORNO SMP IGUAL).

    -> OS OBJETOS SÃO CRIADOS A PARTIR DE CLASSES, ATRAVES DOS CONSTRUTORES.

    -> O CONSTRUTOR TEM O MESMO NOME DA CLASSE.

    -> OS CONSTRUTORES PODEM RECEBER PARÂMETROS DIFERENTES, ELES NAO TEM RETORNO.

    -> QUANDO UM ATRIBUTO OU UM METODO SAO 'STATIC', ELES SAO CHAMADOS DA SEGUINTE FORMA:
        >> NomeDaClasse.atributo ou NomeDaClasse.metodo()
        ex: Math.PI, Math.pow(), Produto.precoDesconto(), Produto.desconto
        >> Um atributo ou método ser STATIC quer dizer que eles nao sao de instancia, e sim de classe.

    -> THIS É USADO EM METODOS DE INSTANCIA, NUNCA EM METODOS EM STATIC. 
        >> THIS SE REFERE À INSTANCIA QUE ESTA SENDO TRATADA NO MÉTODO.
    -> O THIS() É USADO EM CONSTRUTORES, NÃO EM METODOS.
 */
