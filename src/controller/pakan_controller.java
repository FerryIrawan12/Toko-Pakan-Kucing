package controller;

import java.util.ArrayList;

import entity.pakanKucing_entity;
import model.*;

public class pakan_controller {
    
   public void create_pakan(int pilih,int jumlah, int index)
   {
            switch(pilih)
            {
                case 1 : new customer_controller().create(index, new pakanKucing_entity(jumlah, "pakan kucing", 10000, "low"));;
                break;
                case 2 : new customer_controller().create(index, new pakanKucing_entity(jumlah, "pakan kucing", 20000, "mid"));;
                break;
                case 3 : new customer_controller().create(index,new pakanKucing_entity(jumlah, "pakan kucing", 30000, "prem"));
                break;
            }
   }

   public ArrayList<pakanKucing_entity> read()
   {
       return pakanKucing_model.read();
   }
}
