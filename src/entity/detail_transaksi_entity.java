package entity;

public class detail_transaksi_entity {

    private int total;
    private int subtotal;
    
    public detail_transaksi_entity(int total,int subtotal) {
        this.total = total;
        this.subtotal=subtotal;
    }
 
    public int getTotal() {
        return total;
    }

    public int getSubtotal()
    {
        return subtotal;
    }

}
