package br.com.dio;

import br.com.dio.Model.Gato;
import br.com.dio.Model.Livro;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Livro livro1 = new Livro("Matrix",1000);
        System.out.println(livro1);
        System.out.println(gato);

    }
}
