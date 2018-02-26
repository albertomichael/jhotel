
/**
 * Write a description of class Pesanan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pesanan
{
    // instance variables
    private double biaya;
    private Customer pelanggan;
    private String nama_pelanggan;
    private String jenis_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    
    public Pesanan(){
    }
    
    public double getBiaya(){
    
        return 0;
    }
    
    public Customer getPelanggan(){
        return null;
    }
    public boolean getStatusDiproses(){
        return false;
    }
    
    public boolean getStatusSelesai(){
        return false;
    }
    
    public double setBiaya(){
        return 0;
    }
    
    public Customer setPelanggan(Customer baru){
        return null;
    }
    
    public boolean setStatusDiproses(boolean diproses){
        return false;
    }
    
    public boolean setStatusSelesai(boolean diproses){
        return false;
    }
    
}
