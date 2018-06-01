
/**
 * class JHotel - berisi method main yang akan dijalankan pertama kali
 *
 * @author Alberto Michael
 * @version 01/03/2018
 */

import javax.xml.crypto.Data;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.GregorianCalendar;
public class JHotel
{
    /**
     * Constructor untuk kelas JHotel
     */
    public JHotel()
    {
        // initialise instance variables
        
    }
    /**
     * method main
     *
     */
    public static void main(String args[])
    {
        System.out.println("Welcome to JHotel");

        /*for (Customer pelanggan : DatabaseCustomer.getCustomerDatabase()) {
            System.out.println(pelanggan);
        }*/
        System.out.println("===============TES EXCEPTION===============\n");
        try {
            DatabaseCustomer.addCustomer(new Customer("Michael", 17, 10, 1993, "micky@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("Albert", 18, 4, 1985, "albert@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("berto", 24, 9, 1998, "berto@gmail.com"));
        }
        catch(PelangganSudahAdaException e){
            System.out.println("\n-Exception Pelanggan Sudah Ada-");
            System.out.println(e.getPesan());
        }

        try {
            DatabaseHotel.addHotel(new Hotel("Margo", new Lokasi(30, 30, "Depok1"), 5));
            DatabaseHotel.addHotel(new Hotel("Mars", new Lokasi(20, 10, "Srengseng"), 3));
            DatabaseHotel.addHotel(new Hotel("Jupiter", new Lokasi(10, 10, "Beji"), 4));
            DatabaseHotel.addHotel(new Hotel("Pluto", new Lokasi(10, 10, "Sawangan"), 4));
        } catch(HotelSudahAdaException e){
            System.out.println("\n-Exception Hotel Sudah Ada-");
            System.out.println(e.getPesan());
        }

        try {
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "101"));
            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(2), "102"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(3), "103"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(3), "103"));

        } catch(RoomSudahAdaException e){
            System.out.println("\n-Exception Room Sudah Ada-");
            System.out.println(e.getPesan());
        }

        try {
            DatabasePesanan.addPesanan(new Pesanan(5, DatabaseCustomer.getCustomer(1)));
            DatabasePesanan.addPesanan(new Pesanan(7, DatabaseCustomer.getCustomer(2)));
            DatabasePesanan.addPesanan(new Pesanan(7, DatabaseCustomer.getCustomer(2)));
        } catch(PesananSudahAdaException e){
            System.out.println("\n-Exception Pesanan Sudah Ada-");
            System.out.println(e.getPesan());
        }

        try{
            DatabaseCustomer.removeCustomer(10);
        } catch(PelangganTidakDitemukanException e){
            System.out.println("\n-Exception Pelanggan Tidak Ditemukan-");
            System.out.println(e.getPesan());
        }
        Customer cust = new Customer("Johan",12,3,1986,"jojo@gmail.com");
        Pesanan pesan = new Pesanan(12,cust);
        try{
            DatabasePesanan.removePesanan(pesan);
        } catch(PesananTidakDitemukanException e){
            System.out.println("\n-Exception Pesanan Tidak Ditemukan-");
            System.out.println(e.getPesan());
        }

        try{
            DatabaseHotel.removeHotel(99);
        } catch(HotelTidakDitemukanException e){
            System.out.println("\n-Exception Hotel Tidak Ditemukan-");
            System.out.println(e.getPesan());
        }

        try{
            DatabaseRoom.removeRoom(DatabaseHotel.getHotel(2),"s601");
        } catch(RoomTidakDitemukanException e){
            System.out.println("\n-Exception Room Tidak Ditemukan-");
            System.out.println(e.getPesan());
        }


        System.out.println("===========HASIL==========");

        System.out.println(DatabaseCustomer.getCustomerDatabase());
        System.out.println(DatabaseHotel.getHotelDatabase());
        System.out.println(DatabaseRoom.getRoomDatabase());
        System.out.println(DatabasePesanan.getPesananDatabase());
        
    }
}
