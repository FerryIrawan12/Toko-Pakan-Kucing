package view;

import controller.customer_controller;
import entity.*;
public class view_riwayatTransaksi {
    
    customer_controller objCustomer_controller=new customer_controller();
    
    public void view_RiwayatTransaksi()
    {
        for (customer_entity ce : objCustomer_controller.read()){
            System.out.println("=================================================================");
            System.out.println("pembeli ke : "+ ce.getPembeli());
            System.out.println("tanggal    : "+ce.getTanggal());
            System.out.println("=================================================================");
            System.out.println("Type \t \t Qty");
            System.out.println("");
            for (pakanKucing_entity pe : ce.getData_pakan()){
                System.out.println(""+pe.getTypePakan()+"\t \t  "+pe.getJumlah());
            }
            System.out.println("=================================================================");
            for (detail_transaksi_entity dt : ce.getData_detail_transaksi())
            {
                System.out.println("sub total : "+dt.getSubtotal());
            }
            for (transaksi_entity te : ce.getData_transaski())
            {
                System.out.println("bayar     : "+te.getBayar());
                System.out.println("kembalian : "+te.getKembalian());
                System.out.println("=================================================================");
            }
         }
         System.out.println("");
    }
}
