package br.com.dio;

import br.com.dio.Model.Gato;
import br.com.dio.Model.Livro;
import br.com.dio.pilha.No1;
import br.com.dio.pilha.Pilha;
import br.com.dio.projetono.No;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato("felino","branco",10);
        Gato gato1 = gato;
        gato1.setCor("Preto");
        Livro livro1 = new Livro("Matrix",1000);
        System.out.println(livro1);
        System.out.println(gato);
        System.out.println(gato1);
        No<String> no1 = new No("Conteudo no1");
        No<String> no2 = new No("Conteudo no2");

        no1.setProximoNo(no2);

        No<String> no3 = new No("Conteudo no3");
        no2.setProximoNo(no3);

        No<String> no4 = new No("Conteudo no4");
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

        Pilha minhaPilha = new Pilha();
        minhaPilha.push(new No1(1));
        minhaPilha.push(new No1(2));
        minhaPilha.push(new No1(3));
        minhaPilha.push(new No1(4));
        minhaPilha.push(new No1(5));
        minhaPilha.push(new No1(6));
        minhaPilha.push(new No1(7));
        minhaPilha.push(new No1(8));
        System.out.println(minhaPilha);
        minhaPilha.pop();
        System.out.println(minhaPilha);
        minhaPilha.push(new No1(10));
        System.out.println(minhaPilha);

    }
}
