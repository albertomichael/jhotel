
import java.util.ArrayList;

/**
 * class DatabasePesanan.
 *
 * @author Alberto Michael
 * @version 01/03/2018
 */

public class DatabasePesanan
{
    //private String[] list_pesanan;
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<>();
    private static int LAST_PESANAN_ID = 0;

    /**
     * Constructor untuk objek pada kelas DatabasePesanan
     */
    public DatabasePesanan()
    {
        // initialise instance variables

    }

    /**
     * method kelas DatabasePesanan
     */
    public static ArrayList<Pesanan> getPesananDatabase()
    {
        return PESANAN_DATABASE;
    }
    public static int getLastPesananID()
    {
        return LAST_PESANAN_ID;
    }
    public static boolean addPesanan(Pesanan baru) throws PesananSudahAdaException
    {
        if(getPesananAktif(baru.getPelanggan()) == null){
            PESANAN_DATABASE.add(baru);
            LAST_PESANAN_ID = baru.getID();
            return true;
        }
        else {
            throw new PesananSudahAdaException(baru);
        }

    }
    public static Pesanan getPesanan(int id)
    {
        for(Pesanan pesan : PESANAN_DATABASE){
            if (pesan.getID()==id){
                return pesan;
            }
        }
        return null;
    }

    public static Pesanan getPesanan(Room kamar)
    {
        for (Pesanan pesan : PESANAN_DATABASE) {
            if(pesan.getRoom()==kamar){
                return pesan;
            }
        }
        return null;
    }

    public static Pesanan getPesananAktif(Customer pelanggan)
    {
        for (Pesanan pesan : PESANAN_DATABASE) {
            if (pesan.getStatusAktif() == true && pesan.getPelanggan().equals(pelanggan) == true){
                return pesan;
            }
        }
        return null;
    }

    public static boolean removePesanan(Pesanan pesan) throws PesananTidakDitemukanException {
        for (Pesanan pesandb : PESANAN_DATABASE) {
            if (pesandb == pesan) {
                if (pesan.getRoom() != null) {
                    Administrasi.pesananDibatalkan(pesan);
                    PESANAN_DATABASE.remove(pesandb);
                    return true;
                } else if (pesan.getRoom() == null) {
                    if (pesan.getStatusAktif() == true) {
                        pesan.setStatusAktif(false);
                        PESANAN_DATABASE.remove(pesandb);
                        return true;
                    }
                }
            }
        }
        throw new PesananTidakDitemukanException(pesan.getPelanggan());
    }
}
