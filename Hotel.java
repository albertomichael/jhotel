
/**
 * class Hotel - menunjukkan nama hotel, lokasi hotel, dan bintang hotel
 *
 * @author Alberto Michael
 * @version 01/03/2018
 */
public class Hotel
{
    // instance variables
    private String nama;
    private Lokasi lokasi;
    private int bintang;
    private int id;

    /**
     * Constructor untuk objek pada kelas Hotel
     */
    public Hotel(String nama, Lokasi lokasi, int bintang)
    {
        // assign instance variables
        //menggunakan this., karena nama variable sama dengan parameter
        this.nama = nama; 
        this.lokasi = lokasi;
        this.bintang = bintang;
        this.id = DatabaseHotel.getLastHotelID()+1;
    }

    public int getID()
    {
        return id;
    }
    /**
     * method untuk mengambil nilai bintang pada hotel
     * @return bintang
     */
    public int getBintang()
    {
        return bintang;
    }
    /**
     * mehod untuk mengambil nama hotel
     * @return nama 
     */
    public String getNama()
    {
        return nama;
    }
    /**
     * method untuk mengambil nilai lokasi hotel
     * @return lokasi
     */
    public Lokasi getLokasi()
    {
        return lokasi;
    }

    public void setID(int id)
    {
        this.id = id;
    }
    /**
     * method untuk dapat mengatur nama hotel
     * @param nama
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    /**
     * method untuk dapat mengatur lokasi hotel
     * @param lokasi
     */
    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi = lokasi;
    }
    /**
     * method untuk dapat mengatur nilai bintang pada hotel
     * @param bintang
     */
    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }
    /**
     * method untuk mencetak data hotel berupa nama, lokasi, dan bintang
     * 
     */
    public String toString()
    {
        return "\nHotel\n"
                + "Nama Hotel\t: " + getNama()
                + "\nLokasi\t\t: " + getLokasi().getDeskripsi()
                + "\nBintang\t\t: " + getBintang();
        
    }
}
