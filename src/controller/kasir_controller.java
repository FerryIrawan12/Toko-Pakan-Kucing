package controller;

import abstraction.kasir_abstract;
import entity.kasir_entity;
import model.kasir_model;
import view.view_afterLogin;
import view.view_login;

public class kasir_controller extends kasir_abstract {

    @Override
    public boolean cekLogin(String username, String password) {
        kasir_entity find=findUsername(username);

        if (find!=null){
            if (username.equals(find.getUsername())){
                if (password.equals(find.getPassword())){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public kasir_entity findUsername(String username) {
        for (kasir_entity list : kasir_model.read()){
            if (username.equals(list.getUsername())){
                return list;
            }
        }
        return null;
    }

    public void  toViewLogin()
    {
        new view_afterLogin().menu_utama();
    }

    public void toLogin()
    {
        new view_login().menu_login();
    }
    
}
