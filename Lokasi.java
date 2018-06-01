
/**
 * class Lokasi - yang berisi koordinat beserta nama lokasi 
 *
 * @author Alberto Michael
 * @version 01/03/2018
 */
public class Lokasi
{
    // instance variables - replace the example below with your own
    private float x_coord;
    private float y_coord;
    private String deskripsiLokasi;

    /**
     * Constructor untuk objek pada kelas Lokasi
     */
    public Lokasi(float x_coord, float y_coord, String deskripsiLokasi)
    {
        // assign instance variables
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsiLokasi = deskripsiLokasi;
    }
    /**
     * method untuk mengambil nilai pada koordinat sumbu x
     * @return x_coord
     */
    public float getX()
    {
        return x_coord;
    }
    /**
     * method untuk mengambil nilai pada koordinat sumbu y
     * @return y_coord
     */
    public float getY()
    {
        return y_coord;
    }
    /**
     * method untuk mengambil data deskripsi lokasi
     * @return deskripsilokasi
     */
    public String getDeskripsi()
    {
        return deskripsiLokasi;
    }
    /**
     * method untuk dapat mengatur nilai koordinat sumbu x
     * @param x_coord
     */
    public void setX(float x_coord)
    {
        this.x_coord = x_coord;
    }
    /**
     * method untuk dapat mengatur nilai koordinat sumbu y
     * @param y_coord
     */
    public void setY(float y_coord)
    {
        this.y_coord = y_coord;
    }
    /**
     * method untuk dapat mengatur data deskripsi lokasi
     * @param deskripsi
     */
    public void setDeskripsi(String deskripsi)
    {
        deskripsiLokasi = deskripsi;
    }
    /**
     * mencetak data lokasi berupa korrdinat sumbu x dan y juga deskripsi lokasi
     */
    public String toString()
    {
        return ("\nLokasi\nKoordinat X\t: " + getX() +
        "\nKoordinat Y\t: " + getY() +
        "\nDeskripsi\t: " + getDeskripsi());
    }
}
