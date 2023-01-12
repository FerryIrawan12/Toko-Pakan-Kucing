package controller;

import entity.customer_entity;
import entity.detail_transaksi_entity;
import entity.transaksi_entity;
import view.view_pembayaran;

public class transaksi_controller {
    
    public void cek_bayar(int index,int bayar)
    {
        int kembalian=0;
        for (customer_entity list : new customer_controller().read()){
            if (list.getPembeli()==index){
                for (detail_transaksi_entity te : list.getData_detail_transaksi()){
                        kembalian=bayar-te.getSubtotal();
                }
            }
         
        }
        new customer_controller().create(index,new transaksi_entity(kembalian, bayar));
    }    

    public void toPembayaran(int index)
    {
        new view_pembayaran().cetak_struk(index);
    }
}
