package abstraction;
import entity.kasir_entity;
public abstract class kasir_abstract {
    
    public abstract boolean cekLogin(String username,String password);
    public abstract kasir_entity findUsername(String username);
}
