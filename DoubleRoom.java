
/**
 * Write a description of class DoubleRoom here.
 *
 * @author Alberto Michael
 * @version 15/03/2018
 */
public class DoubleRoom extends Room
{
    // instance variables - replace the example below with your own
    private Customer customer2;
    private static TipeKamar TIPE_KAMAR = TipeKamar.DOUBLE;

    /**
     * Constructor for objects of class DoubleRoom
     */
    public DoubleRoom(Hotel hotel, String nomor_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar);
    }

    /**
     * An example of a method
     * @return    customer
     */
    public Customer getCustomer2(Customer customer2)
    {
        return customer2;
    }
    /**
     * method tipekamar
     * @return    TIPE_KAMAR
     */
    @Override
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }
    /**
     * method
     * @param customer2
     */
    public void setCustomer2(Customer customer2)
    {
        this.customer2 = customer2;
    }
}
