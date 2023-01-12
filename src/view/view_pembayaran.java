package view;

import controller.customer_controller;
import entity.customer_entity;
import entity.detail_transaksi_entity;
import entity.pakanKucing_entity;
public class view_pembayaran {
    
    customer_controller objCustomer_controller=new customer_controller();
    
    public void cetak_struk(int index)
    {
        for (customer_entity ce: objCustomer_controller.read())
        {
            if (index==ce.getPembeli())
            {
                for (pakanKucing_entity pe : ce.getData_pakan()){
                    System.out.println("type : "+pe.getTypePakan()+"   "+pe.getJumlah()+"    "+pe.getHarga());
                }
                for (detail_transaksi_entity dt : ce.getData_detail_transaksi()){
                    System.out.println("sub total : "+dt.getSubtotal());
                }
            }
        }
    }
}
