package model;

import java.util.ArrayList;

import entity.detail_transaksi_entity;

public class detail_transaksi_model {
    
    private static ArrayList<detail_transaksi_entity> DB_trans=new ArrayList<>();

    public static void create(detail_transaksi_entity data_Transaksi)
    {
        DB_trans.add(data_Transaksi);
    }
    
    public static ArrayList<detail_transaksi_entity> read()
    {
        return DB_trans;
    }
}
