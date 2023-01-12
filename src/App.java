import model.kasir_model;

import view.view_login;


public class App { 
    public  static void main(String[] args) {
     kasir_model.dataDummy();
     view_login objLogin=new view_login();
     objLogin.menu_login();
 }
}