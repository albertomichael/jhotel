
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
    
        return biaya;
    }
    
    public Customer getPelanggan(){
        return pelanggan;
    }
    public boolean getStatusDiproses(){
        return isDiproses;
    }
    
    public boolean getStatusSelesai(){
        return isSelesai;
    }
    
    public void setBiaya(double biaya){
        this.biaya=biaya;
    }
    
    public void setPelanggan(Customer baru){
        baru=pelanggan;
    }
    
    public void setStatusDiproses(boolean diproses){
        diproses=isDiproses;
    }
    
    public void setStatusSelesai(boolean diproses){
        diproses=isSelesai;
    }
    
    public void printData(){
        
    }
    
    
 }
    

