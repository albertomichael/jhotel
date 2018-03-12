
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
    
    public Pesanan(double biaya,Customer pelanggan){
        this.biaya=biaya;
        this.pelanggan=pelanggan;
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
        this.pelanggan=baru;
    }
    
    public void setStatusDiproses(boolean isDiproses){
       //diproses=isDiproses;
    }
    
    public void setStatusSelesai(boolean isSelesai){
       // diproses=isSelesai;
    }
    
    public void printData(){
        System.out.println("biaya "+biaya);
        System.out.println("pelanggan "+pelanggan.nama);
        //System.out.println("Tipe Kamar "+);
        System.out.println("Status Selesai "+isSelesai);
        System.out.println("Status Diproses "+isDiproses);
        
        
    }
    
    
 }
    

