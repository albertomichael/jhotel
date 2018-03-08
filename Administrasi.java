
/**
 * Write a description of class Administrasi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Administrasi
{
   public void pesananDitugaskan(Pesanan pesan,Room kamar){
   pesan.setStatusSelesai(true);
   pesan.setStatusDiproses(false);
   kamar.setPesanan(null);
   
   
    
    
}

 public void roomAmbilPesanan(Pesanan pesan,Room kamar){
       kamar.setStatusKamar(StatusKamar.Booked);
    }

}
