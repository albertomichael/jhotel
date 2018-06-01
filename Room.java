
/**
 * class Room - menunjukkan data kamar yang dapat dipesan
 *
 * @author Alberto Michael
 * @version 08/03/2018
 */
public abstract class Room
{
    // instance variables 
    private Hotel hotel;
    private String nomor_kamar;
    private StatusKamar status_kamar;
    protected double dailyTariff;

    /**
     * Constructor for objects of class Room
     */
    public Room(Hotel hotel, String nomor_kamar)
    {
        // initialise instance variables
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.status_kamar = StatusKamar.VACANT;
        
    }
    /**
     * method untuk mengambil data hotel pada kamar
     * @return hotel
     */
    public Hotel getHotel()
    {
        return hotel;
    }
    /**
     * method untuk mengambil nomor kamar
     * @return nomor_kamar
     */
    public String getNomorKamar()
    {
        return nomor_kamar;
    }
    /**
     * method untuk mengambil harga kamar
     * @return dailyTariff
     */
    public double getDailyTariff()
    {
        return dailyTariff;
    }
    /**
     * method untuk mengambil status kamar
     * @return status_kamar
     */
    public StatusKamar getStatusKamar()
    {
        return status_kamar;
    }
    /**
     * method untuk tipe kamar
     */
    public abstract TipeKamar getTipeKamar();

    /**
     * method untuk mengatur data hotel pada kamar
     * @param hotel
     */
    public void setHotel (Hotel hotel)
    {
        this.hotel = hotel;
    }
    /**
     * method untuk mengatur nomor kamar
     * @param nomor_kamar
     */
    public void setNomorKamar(String nomor_kamar)
    {
        this.nomor_kamar = nomor_kamar;
    }
    /**
     * method untuk mengatur harga kamar
     * @param dailytariff
     */
    public void setDailyTariff(double dailytariff)
    {
        dailyTariff = dailytariff;
    }
    /**
     * method untuk mengatur status kamar
     * @param status_kamar
     */
    public void setStatusKamar(StatusKamar status_kamar)
    {
        this.status_kamar = status_kamar;
    }

    public String toString()
    {
        if(DatabasePesanan.getPesanan(this) == null)
        {
            return "\nNama Hotel \t\t:" + getHotel().getNama()
                    + "\nTipe Kamar \t\t:" + getTipeKamar()
                    + "\nHarga \t\t\t:" + getDailyTariff()
                    + "\nStatus Kamar \t:" + getStatusKamar().toString();
        }
        else {
            return "\nNama Hotel \t\t:" + getHotel().getNama()
                    + "\nTipe Kamar \t\t:" + getTipeKamar()
                    + "\nHarga \t\t\t:" + getDailyTariff()
                    + "\nStatus Kamar \t:" + getStatusKamar().toString()
                    + "Pelanggan \t\t:" + DatabasePesanan.getPesanan(this).getPelanggan().getNama();
        }
    }
}
