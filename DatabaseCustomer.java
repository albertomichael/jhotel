import java.util.ArrayList;

/**
 * class DatabaseCustomer.
 *
 * @author Alberto Michael
 * @version 01/03/2018
 */
public class DatabaseCustomer
{
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
    private static int LAST_CUSTOMER_ID = 0;
    
    /**
     * Constructor untuk objek pada kelas DatabaseCustomer
     */
    public DatabaseCustomer()
    {
        // initialise instance variables
        
    }

    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }

    public static int getLastCustomerID()
    {
        return LAST_CUSTOMER_ID;
    }
    /**
     * method kelas DatabaseCostumer
     *
     *
     */
    public static boolean addCustomer(Customer baru) throws PelangganSudahAdaException
    {
        // put your code here
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if(cust.getID() == baru.getID()||cust.getEmail()==baru.getEmail())
                throw new PelangganSudahAdaException(baru);

        }
        CUSTOMER_DATABASE.add(baru);
        LAST_CUSTOMER_ID = baru.getID();
        return true;
    }

    public static Customer getCustomer(int id){
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if (cust.getID() == id) return cust;
        }
        return null;
    }

    public static boolean removeCustomer(int id) throws PelangganTidakDitemukanException
    {
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if(cust.getID()==id){
                for (Pesanan pesan :
                        DatabasePesanan.getPesananDatabase()) {
                    if(pesan.getPelanggan().equals(cust)) {
                        try {
                            DatabasePesanan.removePesanan(pesan);
                        } catch (PesananTidakDitemukanException e) {
                            e.getPesan();
                        }
                    }
                }
                CUSTOMER_DATABASE.remove(cust);
                return true;
            }
        }
        throw new PelangganTidakDitemukanException(id);
    }
}
