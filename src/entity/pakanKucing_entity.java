package entity;

public class pakanKucing_entity extends barang_entity{
    
    private String TypePakan;
    private int jumlah;

    public pakanKucing_entity(int jumlah, String nama, int harga,String TypePakan) {
        super( nama, harga);
        this.TypePakan=TypePakan;
        this.jumlah=jumlah;
    }

    public String getTypePakan() {
        return TypePakan;
    }

    public int getJumlah() {
        return jumlah;
    }

    
}
