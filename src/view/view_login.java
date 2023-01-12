package view;

import java.util.Scanner;

import controller.kasir_controller;

public class view_login {
    
    private Scanner in=new Scanner(System.in);
    kasir_controller _Ckasir=new kasir_controller();

    public void menu_login()
    {
        String username;
        String password;

        while(true)
        {
        System.out.println("-------------LOGIN-------------");
        System.out.print("Username : ");
        username=in.nextLine();
        System.out.print("password : ");
        password=in.nextLine();

        boolean cek=_Ckasir.cekLogin(username, password);

        if (cek){
            new kasir_controller().toViewLogin();
        }else{
            System.out.println("data tidak ada !");
        }
        }
    }
}
