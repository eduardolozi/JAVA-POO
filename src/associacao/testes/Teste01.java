package associacao.testes;

import associacao.dominio.Aluno;
import associacao.dominio.Local;
import associacao.dominio.Professor;
import associacao.dominio.Seminario;

public class Teste01 {
    public static void main(String[] args) {
        Seminario sem1 = new Seminario();
        Seminario sem2 = new Seminario();
        sem1.setTitulo("Lassale");
        sem2.setTitulo("Dinamico");

        Aluno a1 = new Aluno("Eduardo", 14, sem1);
        Aluno a2 = new Aluno("Alejandro", 16, sem1);
        Aluno[] alunos = {a1, a2};
        Aluno a3 = new Aluno("Fernando", 16, sem2);
        Aluno a4 = new Aluno("Daniel", 16, sem2);
        Aluno[] alunos2 = {a3, a4};
        sem1.setAlunos(alunos);
        sem2.setAlunos(alunos2);

        Local l1 = new Local();
        l1.setEndereco("Setor Bela Vista, rua S-3, T-64");
        Local l2 = new Local();
        l2.setEndereco("Setor Bueno, rua t-37");
        sem1.setLocal(l1);
        sem2.setLocal(l2);

        Professor p1 = new Professor("Andre", "Geografia");
        Seminario[] seminarios = {sem1, sem2};
        p1.setSeminarios(seminarios);
        Professor p2 = new Professor("Nelson", "Biologia");
        Seminario[] seminarios2 = {sem2};
        p2.setSeminarios(seminarios2);
        
        sem1.imprime();
        p1.imprime();

        sem2.imprime();
        p2.imprime();


    }
}
 