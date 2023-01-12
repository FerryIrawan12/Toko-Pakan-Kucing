package model;

import java.util.ArrayList;

import entity.transaksi_entity;

public class transaksi_model {
    
    private static ArrayList<transaksi_entity> DB_transaksi=new ArrayList<>();

    public static void create(transaksi_entity data_transaksi)
    {
        DB_transaksi.add(data_transaksi);
    }

    public static ArrayList<transaksi_entity> read()
    {
        return DB_transaksi;
    }
}
