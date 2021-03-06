package com.digitalinnovationone.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

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

        int posicao = nomes.indexOf("Carlos");
        System.out.println("Posição" + posicao);
        System.out.println(nomes);

        String nome = nomes.get(1);

        int tamanho = nomes.size();

        System.out.println(nome);
        System.out.println(tamanho);

        boolean temCarlos = nome.contains("Carlos");

        System.out.println(temCarlos);;

        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println("isEmpty" + listaEstaVazia);

        for (String nomeDoItem: nomes){
            System.out.println("-->"+ nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println("--->"+ iterator.next());
        }

        nomes.clear();
        listaEstaVazia = nomes.isEmpty();
        System.out.println("Clear" + listaEstaVazia);

        for (String nomeDoItem: nomes){
            System.out.println(nomes);
        }


    }
}
