import java.util.*;
/**
 * Write a description of class DatabasePesanan here.
 * 
 * @author Alberto Michael 
 * @version (a version number or a date)
 */
public class DatabasePesanan
{
   // private String[] list_pesanan;
    private ArrayList<Pesanan> PESANAN_DATABASE=new ArrayList<Pesanan>(); 
    private int LAST_PESANAN_ID=0;
    
    
    public ArrayList<Pesanan> getPesananDatabase(){
        return PESANAN_DATABASE;
    }
    
    public int getLastPesananID(){
        return LAST_PESANAN_ID;
    }
    
    public boolean addPesanan(Pesanan baru){
        return false;
    }
    
    public boolean removePesanan(Pesanan pesan){
        return false;
    }
    
    public Pesanan getPesanan(int id)
    {
        return null;
    }
    
    
    
    public void pesananDibatalkan(){
        
    }
}
