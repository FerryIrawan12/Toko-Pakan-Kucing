package controller;
import java.util.ArrayList;

import entity.customer_entity;
import entity.detail_transaksi_entity;
import entity.pakanKucing_entity;
import model.detail_transaksi_model;

public class detail_transaksi_controller {
    
    public void create_transaksi(int index)
    {
        int total=0;
        int subtotal=0;

        for (customer_entity list : new customer_controller().read()){
            if (list.getPembeli() == index){
                for (pakanKucing_entity pe : list.getData_pakan()){
                    total=pe.getHarga()*pe.getJumlah();
                    subtotal+=total;
                }
            }
        }
            new customer_controller().create(index,new detail_transaksi_entity(total, subtotal));
    }




    public ArrayList<detail_transaksi_entity> read()
    {
        return detail_transaksi_model.read();
    }
}
