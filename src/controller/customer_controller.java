package controller;

import java.util.ArrayList;

import entity.customer_entity;
import entity.pakanKucing_entity;
import entity.transaksi_entity;
import entity.detail_transaksi_entity;
import model.customer_model;
import view.*;
public class customer_controller {
    
    public void toBelanjaPakan(int index)
    {
        customer_model.create(new customer_entity(index));
        
        new view_belanja_pakan().beli_pakan(index);
    }

    public ArrayList<customer_entity> read()
    {
        return customer_model.read();
    }

    public void create(int pembeli,pakanKucing_entity pe){
        int index=indexData(pembeli);
        customer_model.create(index, pe);
    }

    public void create(int pembeli,detail_transaksi_entity dt){
        int index=indexData(pembeli);
        customer_model.create(index, dt);
    }

    public void create(int pembeli,transaksi_entity te){
        int index=indexData(pembeli);
        customer_model.create(index, te);
    }

    public customer_entity find(int pembeli){
        for (customer_entity list : customer_model.read()){
            if (pembeli==list.getPembeli()){
                return list;
            }
        }
        return null;
    }

    public int indexData(int pembeli){
         customer_entity ce=find(pembeli);
         return customer_model.read().indexOf(ce);
    }

    public void toRiwayatTransaksi()
    {
        new view_riwayatTransaksi().view_RiwayatTransaksi();
    }

    public void toCetakStuk(int index)
    {
        new view_pembayaran().cetak_struk(index);
    }

    public void toCheckout(int index)
    {
        new view_checkout().checkout(index);
    }

 


    
}
