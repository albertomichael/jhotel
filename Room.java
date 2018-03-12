
/**
 * Write a description of class Room here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Room
{
    private Hotel hotel;
    private int id;
    private String nomor_kamar;
    private boolean isAvailable;
    private Customer customer;
    private double dailyTarif;
    private StatusKamar status_kamar;
    private Pesanan pesan;
    
    public void setStatusKamar(StatusKamar status_kamar){
        this.status_kamar=status_kamar;
    }
    
    public void setPesanan(Pesanan pesan){
        this.pesan=pesan;
    }
    
    public void printData(Hotel hotel){
     // System.out.println(nomor_kamar,isAvailable);
    }
    
    
    
}
