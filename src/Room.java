
/**
 * Write a description of class Room here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public abstract class Room
{
    private Hotel hotel;
    private String nomor_kamar;
    //private boolean isAvailable;
    protected double dailyTariff;
    private StatusKamar status_kamar;
    private Pesanan pesan;
    //private TipeKamar tipe_kamar;
    
    
    
    
    
    public Room(Hotel hotel,String nomor_kamar,
    StatusKamar status_kamar){
        this.hotel=hotel;
        this.nomor_kamar=nomor_kamar;
        
        this.status_kamar=status_kamar;
    }
    
    public Hotel getHotel(){
       return hotel;
     }
    
        
    public String getNomorKamar(){
        return nomor_kamar;
    }
    
    
    
    
    
    public double getDailyTarif(){
        return dailyTariff;
    }
    
    public StatusKamar getStatusKamar(){
        return status_kamar;
    }
    
    public Pesanan getPesanan(){
        return pesan;
    }
    
    public abstract TipeKamar getTipeKamar();
        
    
    
    
   
    public void setHotel(Hotel hotel){
        this.hotel=hotel;
    }
    
    
    
    public void setNomorKamar(String nomor_kamar){
        this.nomor_kamar=nomor_kamar;
    }
    
    
    
    
    
    public void setDailyTarif(double dailyTariff){
        this.dailyTariff=dailyTariff;
    }
    public void setStatusKamar(StatusKamar status_kamar){
        this.status_kamar=status_kamar;
    }
    
    public void setPesanan(Pesanan pesan){
        this.pesan=pesan;
    }
    
    public String toString(){
        return null;
    }
    
    public void printData(Hotel hotel){
     System.out.println("Room");
        System.out.println("Nama Hotel\t: " + hotel.getNama());
        System.out.println("Nomor Kamar\t: " + nomor_kamar);
        
        System.out.println("Harga\t\t: " + dailyTariff);
        System.out.println("Status Kamar\t: " + status_kamar.toString());
        System.out.println("Tipe Kamar\t: " + getTipeKamar().toString());
    }
    
    
    
}
