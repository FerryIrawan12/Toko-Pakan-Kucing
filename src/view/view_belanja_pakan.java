package view;

import java.util.Scanner;

import controller.pakan_controller;

public class view_belanja_pakan {
     pakan_controller _Cpakan=new pakan_controller();
     Scanner in=new Scanner(System.in);
     
    public void beli_pakan(int index)
    {
        int pilih;
        int jumlah;
        char ulang; 
        do{

        System.out.println("------------------------------------");
        System.out.println("------------PAKAN KUCING------------");
        System.out.println("------------------------------------");
        System.out.println("""
                1. Type Low     Rp 10.000/kg
                2. Type Mid     Rp 20.000/kg
                3. Type Premium Rp 30.000/kg
                """);
        System.out.print("pilih : ");
        pilih=in.nextInt();

        System.out.print("masukkan jumlah barang : ");
        jumlah=in.nextInt();

        _Cpakan.create_pakan(pilih, jumlah, index);
      
        System.out.print("apakah anda ingin belanja lagi(y/t) : ");
        ulang=in.next().charAt(0);

        }while(ulang=='y'||ulang=='Y');

    }
    
}
