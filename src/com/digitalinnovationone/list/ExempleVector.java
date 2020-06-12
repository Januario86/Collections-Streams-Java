package com.digitalinnovationone.list;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ExempleVector {
    public static void main(String[] args) {


        List<String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de Mesa");
        esportes.add("Handebol");

        esportes.set(2,"Ping Pong");

        System.out.println(esportes.get(0));

        for (String esporte: esportes){
            System.out.println(esporte);
        }


    }





}
