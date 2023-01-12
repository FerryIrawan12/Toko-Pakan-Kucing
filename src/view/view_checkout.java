package view;
import controller.transaksi_controller;
import controller.customer_controller;
import controller.detail_transaksi_controller;
import java.util.Scanner;

public class view_checkout {
    static view_pembayaran objPembayaran=new view_pembayaran();
    transaksi_controller obj_Transaksi_controller=new transaksi_controller();
    detail_transaksi_controller obj_detail_Transaksi_controller=new detail_transaksi_controller();
    Scanner in=new Scanner(System.in);
    public void checkout(int index)
    {
        int bayar=0;
 
    obj_detail_Transaksi_controller.create_transaksi(index);
    
    new customer_controller().toCetakStuk(index);

    try{
    System.out.print("bayar : ");
    bayar=in.nextInt();
    }catch(Exception e){
        System.out.println(e);
    }finally{
        System.out.println("input ulang lagi !");
    }
    
    obj_Transaksi_controller.cek_bayar(index, bayar);

    }
    
}
