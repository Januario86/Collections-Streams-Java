package com.digitalinnovationone.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExempleList {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("João");

        System.out.println(nomes);

        //Altera o índice dois substituindo o valor elemento
        nomes.set(2,"Larissa");

        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println(nomes);

        nomes.remove( 3);

        System.out.println(nomes);

        String nome = nomes.get(1);

        int tamanho = nomes.size();

        System.out.println(nome);
        System.out.println(tamanho);


    }
}
