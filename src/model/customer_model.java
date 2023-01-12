package model;

import java.util.ArrayList;

import entity.customer_entity;
import entity.detail_transaksi_entity;
import entity.pakanKucing_entity;
import entity.transaksi_entity;

public class customer_model {
    
    private static ArrayList<customer_entity> DB_customer=new ArrayList<>();

    public static void create(customer_entity dataCustomer){
        DB_customer.add(dataCustomer);
    }

    public static void create(int pembeli, pakanKucing_entity pm){
        DB_customer.get(pembeli).getData_pakan().add(pm);
    }

    public static void create(int pembeli, detail_transaksi_entity dt){
        DB_customer.get(pembeli).getData_detail_transaksi().add(dt);
    }

    public static void create(int pembeli,transaksi_entity te){
        DB_customer.get(pembeli).getData_transaski().add(te);;
    }

    public static ArrayList<customer_entity> read(){
        return DB_customer;
    }
    }

