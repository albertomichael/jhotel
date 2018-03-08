
/**
 * Write a description of class Hotel here.
 * 
 * @author (Alberto Michael Tambunan) 
 * @version (a version number or a date)
 */
public class Hotel
{
    // instance variables - replace the example below with your own
    private String nama;
    private Lokasi lokasi;
    private int bintang;
    
    public Hotel(String nama, Lokasi lokasi, int bintang){
        this.nama=nama;
        this.lokasi=lokasi;
        this.bintang=bintang;
    }
    
    public int getBintang(){
        return bintang;
    }
    
    public String getNama(){
        return nama;
    }
    
    public Lokasi getLokasi(){
        return lokasi;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public void setLokasi(Lokasi lokasi){
        this.lokasi=lokasi;
    }
    
    public void setBintang(int bintang){
        this.bintang=bintang;
    }
    
    public void printData(){
        System.out.println(nama);
    }
}
