
/**
 * Write a description of class PremiumRoom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PremiumRoom extends Room
{
    private double DISCOUNT=0.3;
    private TipeKamar TIPE_KAMAR=TipeKamar.Premium;
    Room dailytarif;
    
    public PremiumRoom(Hotel hotel,String nomor_kamar,boolean isAvailable,
    StatusKamar status_kamar){
        super(hotel,nomor_kamar,isAvailable,status_kamar);
        
    }
    
    public TipeKamar getTipeKamar(){
        return TIPE_KAMAR;
    }
    
    public double getDiscount(){
        return DISCOUNT;
    }
    
    public void setDailyTarif(double dailytarif){
        dailytarif=dailytarif*DISCOUNT;
    }
}
