package entity;

public class barang_entity {

    protected String nama;
    protected int harga;

    public barang_entity( String nama,int harga) {
        this.nama = nama;
        this.harga=harga;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga()
    {
        return harga;
    }
}
