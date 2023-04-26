import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Stack;

public class Pessoa {
    public void geraAluno() {
        Stack<Aluno> a1 = new Stack<>(); //cria pilha e add alunos
        a1.push(new Aluno("wellington Machado",
                "222.222.222.22", "2222222222",
                "222222", new Date("2/2/1228")));


        a1.push(new Aluno("wellington reis Machado",
                "222.222.222.22", "2222222222",
                "222222", new Date("2/2/1228")));


        a1.push(new Aluno("wellington  dos Machado",
                "222.222.222.22", "2222222222",
                "222222", new Date("2/2/1228")));


        System.out.println("----------TESTES ALUNO----------");
        for (String s : Arrays.asList("Alunos Cadastrados:\n" + a1, "Mostra 1° Elemento/Não Remove:\n"
                + a1.peek(), "Remove o Ultimo Elemento:\n"
                + a1.pop(), "Verica o Topo da Pilha:\n" + a1.peek(), "Pilha Vazia?\n" + a1.empty(), "Remove o Ultimo Elemento:\n"
                + a1.pop(), "Pilha Vazia?\n" + a1.empty(), "Mostra 1° Elemento/Não Remove:\n" + a1.peek())) {
            System.out.println(s); // imprime minha pilha de alunos
        }
    }

    public void geraFuncionario() {
        Stack<Funcionario> f1 = new Stack<>();


        f1.push(new Funcionario("Wellington Machado", "111.111.111.11",
                1111111111, "wdrm", 111111,
                "wdosreismachado@gmail.com"));


        System.out.println("----------TESTES FUNCIONÁRIO----------");
        for (String s : Arrays.asList("Funcionários Cadastrados:\n" + f1,
                "Pilha Está Vazia?:\n" + f1.empty())) {
            System.out.println(s);//imprime funcionários cadastrados
        }


    }

    public void geraFiliacao() {
        Stack<FiliacaoAluno> filiacao = new Stack<>();
        filiacao.push(new FiliacaoAluno("Valdir Machado","Clarice Aparecida", "053.997.11.61.71",
                "053.997.11.61.71","111111111.11","111111111.11",
                "888888888","4444444444"));

        filiacao.push(new FiliacaoAluno("Fulano Machado","Ciclano Aparecida", "053.997.11.61.71",
                "053.997.11.61.71","111111111.11","111111111.11",
                "888888888","4444444444"));
        System.out.println("----------TESTES FILIAÇÃO----------");

        for (String s : Arrays.asList("Filiação Cadastrada:\n "+ filiacao,
                "Pilha Esta Vazia?\n "+ filiacao.empty(), "Remove Primeiro Cadastro: \n"+ filiacao.peek())){
            System.out.println(s);
        }

    }

    public void media() {
        Notas situacao = new Notas();
        System.out.println("----------TESTES NOTAS----------");
        situacao.primeiroTrimeste();
        situacao.segundoTrimeste();
        situacao.terceiroTrimeste();
    }


}




