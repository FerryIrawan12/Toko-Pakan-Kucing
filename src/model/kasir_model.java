package model;

import java.util.ArrayList;

import entity.kasir_entity;

public class kasir_model {
    
    private static ArrayList<kasir_entity> DB_kasir=new ArrayList<>();

    public static void dataDummy()
    {
        DB_kasir.add(new kasir_entity("ferry", "ferry","123"));
        DB_kasir.add(new kasir_entity("dandy", "dandy", "123"));
        DB_kasir.add(new kasir_entity("naasa","naasa", "123"));
    }

    public static ArrayList<kasir_entity> read()
    {
        return DB_kasir;
    }
}
