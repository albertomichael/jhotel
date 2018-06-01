
/**
 * Enumeration class TipeKamar 
 *
 * @author Alberto Michael
 * @version 08/03/2018
 */
public enum TipeKamar
{
    SINGLE("Single"), DOUBLE("Double"), PREMIUM("Premium");
    
    private final String tipeKamar;
    
    /**
     * Method untuk mengatur tipe kamar
     * @param tipeKamar
     */
    private TipeKamar (String tipeKamar)
    {
        this.tipeKamar = tipeKamar;
    }
    /**
     * method untuk mengambil tipe kamar
     * @return tipeKamar
     */
    public String toString()
    {
        return tipeKamar;
    }
}
