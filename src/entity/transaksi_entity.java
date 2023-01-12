package entity;

public class transaksi_entity {
    
    private int bayar;
    private int kembalian;

    public transaksi_entity(int kembalian,int bayar) {
        this.bayar = bayar;
        this.kembalian=kembalian;
    }

    public int getBayar() {
        return bayar;
    }

    public int getKembalian() {
        return kembalian;
    }
}
