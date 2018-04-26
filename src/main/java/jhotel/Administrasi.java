
/**
 * class Administrasi - mengatur jalannya pesanan
 *
 * @author Alberto Michael Tambunan
 * @version 08/03/2018
 */
public class Administrasi
{
    /**
     * Constructor untuk objek pada kelas Administrasi
     */
    public Administrasi()
    {
        // initialise instance variables
        
    }
    /**
     * method untuk memproses kamar yang akan di-assign
     * @param pesan, kamar
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);
        DatabaseRoom.getRoom(kamar.getHotel(),kamar.getNomorKamar()).setStatusKamar(StatusKamar.BOOKED);
   
    
    }
   

    /**
     * mehod untuk mengubah status kamar karena pesanan dibatalkan
     * @param kamar
     */
    public static void pesananDibatalkan(Room kamar)
    {
        Pesanan pesan = DatabasePesanan.getPesanan(kamar);
        if(pesan != null) {
            pesan.setStatusSelesai(false);
            pesan.setStatusDiproses(false);
            //pesan.setRoom(null);
        }
        DatabaseRoom.getRoom(kamar.getHotel(), kamar.getNomorKamar()).setStatusKamar(StatusKamar.VACANT);
    }
    /**
     * method untuk mengubah status kamar karena pesanan telah selesai
     * @param kamar
     */
    public static void pesananSelesai(Room kamar)
    {
        Pesanan pesan = DatabasePesanan.getPesanan(kamar);
        if(pesan != null) {
            pesan.setStatusSelesai(true);
            pesan.setStatusDiproses(false);
            //pesan.setRoom(null);
        }
        DatabaseRoom.getRoom(kamar.getHotel(), kamar.getNomorKamar()).setStatusKamar(StatusKamar.VACANT);
    }
    /**
     * method untuk mengubah status pesanan karena pesanan dibatalkan
     * @param pesan
     */
    public static void pesananDibatalkan(Pesanan pesan)
    {
        pesan.setStatusAktif(false);
        DatabaseRoom.getRoom(pesan.getRoom().getHotel(),pesan.getRoom().getNomorKamar()).setStatusKamar(StatusKamar.VACANT);
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        //pesan.setRoom(null);
    }
    /**
     * method untuk mengubah status pesanan karena pesanan telah selesai
     * @param pesan
     */
    public static void pesananSelesai(Pesanan pesan)
    {
        pesan.setStatusAktif(false);
        DatabaseRoom.getRoom(pesan.getRoom().getHotel(),pesan.getRoom().getNomorKamar()).setStatusKamar(StatusKamar.VACANT);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        //pesan.setRoom(null);
    }
}
