package model;

import java.util.ArrayList;

import entity.pakanKucing_entity;

public class pakanKucing_model {
    
    private static ArrayList<pakanKucing_entity> DB_pakanKucing=new ArrayList<>();

    public static void create(pakanKucing_entity data)
    {
        DB_pakanKucing.add(data);
    }

    public static ArrayList<pakanKucing_entity> read()
    {
        return DB_pakanKucing;
    }
}
