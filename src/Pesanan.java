import java.util.Date;
/**
 * Write a description of class Pesanan here.
 * 
 * @author Alberto Michael 
 * @version (a version number or a date)
 */
public class Pesanan
{
    // instance variables
    private int id;
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isAktif;
    //private String nama_pelanggan;
    //private String jenis_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private Date tanggalPesan;
    
    /**
     * @param biaya ,pelanggan
     * 
     * @return biaya,pelanggan
     */
    public Pesanan(double jumlahHari,Customer pelanggan){
        this.jumlahHari=jumlahHari;
        this.pelanggan=pelanggan;
        isAktif=true;
        tanggalPesan=new Date();
    }
    
    
    public int getID(){
        return id;
    }
    
    public double getBiaya(){
    
        return biaya;
    }
    
    public double getJumlahHari(){
        return jumlahHari;
    }
    
    public Room getRoom(){
        return kamar;
    }
    
    public Customer getPelanggan(){
        return pelanggan;
    }
    
    public boolean getStatusAktif(){
        return isAktif;
    }
    public boolean getStatusDiproses(){
        return isDiproses;
    }
    
    public boolean getStatusSelesai(){
        return isSelesai;
    }
    
    public Date getTanggalPesan(){
        return tanggalPesan;
    }
    
    
    public void setID(int id){
        this.id=id;
    }
    
    
    public void setBiaya(double biaya){
        this.biaya=biaya;
        biaya=kamar.getDailyTarif()*jumlahHari;
        
        
    }
    
    public void setRoom(Room kamar){
        this.kamar=kamar;
    }
    
    public void setJumlahHari(double jumlahHari){
        this.jumlahHari=jumlahHari;
    }
    
    public void setPelanggan(Customer pelanggan){
        this.pelanggan=pelanggan;
    }
    
    public void setStatusAktif(boolean aktif){
        isAktif=aktif;
    }
    public void setStatusDiproses(boolean diproses){
       //diproses=isDiproses;
    }
    
    public void setStatusSelesai(boolean selesai){
       // diproses=isSelesai;
    }
    
    public void setTanggalPesan(Date tanggalPesan){
        this.tanggalPesan=tanggalPesan;
       
    }
    
    public String toString(){
        return null;
    }
    
    public void printData(){
        System.out.println("biaya "+biaya);
        System.out.println("pelanggan "+pelanggan.nama);
        //System.out.println("Tipe Kamar "+);
        System.out.println("Status Selesai "+isSelesai);
        System.out.println("Status Diproses "+isDiproses);
        System.out.println("Jumlah Hari "+jumlahHari);
        
        
    }
    
    
 }
    

