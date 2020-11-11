package com.digitalinnovationone.queue;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        //pega o primeiro elemento da fila e remove
        String clienteASerAtendido= filaBanco.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

        //filaBanco.clear();

        //pega o primeiro elemento da fila sem remover, retorna null caso não tenha elemento
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        //filaBanco.clear();

        //Retorna o primeiro elemento, ou erro NoSuchElementException caso não tenha elemento na fila
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        for(String client: filaBanco){
            System.out.println(client);
        }
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while(iteratorFilaBanco.hasNext()){
            System.out.println("------->" + iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.size());
        System.out.println(filaBanco.isEmpty());

        filaBanco.add("Wesley");
        System.out.println(filaBanco);
    }



}
