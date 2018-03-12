
/**
 * Write a description of class Administrasi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Administrasi
{
   public void pesananDitugaskan(Pesanan pesan,Room kamar)
   {
       pesan.setStatusSelesai(false);
       pesan.setStatusDiproses(true);
       kamar.setPesanan(null);
   
   
    
    
   }

    public void roomAmbilPesanan(Pesanan pesan,Room kamar){
       kamar.setStatusKamar(StatusKamar.Booked);
       kamar.setPesanan(null);
     }
     
     public void roomLepasPesanan(Room kamar){
       kamar.setStatusKamar(StatusKamar.Vacant); 
       kamar.setPesanan(null);
     }
     
     public void pesananDibatalkan(Room kamar){
        // Pesanan.pesan.setStatusSelesai(false);;
         //kamar.setStatusDiproses(false);
     }
     
     public void pesananSelesai(Pesanan pesan,Room kamar){
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        kamar.setPesanan(null);
     }
     
    
     
     

}
