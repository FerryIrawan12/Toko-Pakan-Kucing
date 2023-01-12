package entity;

import java.util.ArrayList;

public class customer_entity {
    
    private int pembeli;
    private String tanggal=utils.DateString.now();
    private ArrayList<pakanKucing_entity> data_pakan =new ArrayList<>();
    private ArrayList<transaksi_entity> data_transaski=new ArrayList<>();
    private ArrayList<detail_transaksi_entity> data_detail_transaksi = new ArrayList<>();

    public customer_entity(int pembeli)
    {
        this.pembeli=pembeli;
    }

    public int getPembeli() {
        return pembeli;
    }

    public void setPembeli(int pembeli) {
        this.pembeli = pembeli;
    }

    public ArrayList<pakanKucing_entity> getData_pakan() {
        return data_pakan;
    }

    public ArrayList<detail_transaksi_entity> getData_detail_transaksi() {
        return data_detail_transaksi;
    }

    public String getTanggal()
    {
        return tanggal;
    }

    public ArrayList<transaksi_entity> getData_transaski() {
        return data_transaski;
    }
}
