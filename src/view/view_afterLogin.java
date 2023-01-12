package view;

import java.util.Scanner;

import controller.*;

public class view_afterLogin {
    private Scanner in=new Scanner(System.in);
    customer_controller objCustomer_controller=new customer_controller();
  
    public void menu_utama()
    {
        int pilih;
        int index=0;
        do{
        System.out.println("");
        System.out.println("-----MENU UTAMA-----");
        System.out.println("""
                1. Transaksi
                2. Daftar Transaksi
                3. checkout 
                4. logout akun
                """);
        System.out.print("pilih : ");
        pilih=in.nextInt();

        if (pilih==1)
        {
            index++;
            objCustomer_controller.toBelanjaPakan(index);
        }
        if (pilih==2)
        {
            new customer_controller().toRiwayatTransaksi();
        }
        if (pilih==3)
        {
            new customer_controller().toCheckout(index);
        }
        if (pilih==4)
        {
            new kasir_controller().toLogin();   
        }
    }while(pilih!=5);

}
}
