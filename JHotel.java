
/**
 * Write a description of class JHotel here.
 * 
 * @author Alberto Michael Tambunan 
 * @version (06 Maret 2018)
 */
public class JHotel
{
    public static void main(String[] args){
        Customer obj1=new Customer(12,"Michael");
        Lokasi lok1=new Lokasi(2,3,"Depok");
        Hotel hotel1=new Hotel("DEHOTEL",lok1,5);
        Pesanan psn1=new Pesanan(200,obj1);
        
        obj1.printData();
        hotel1.printData();
        obj1.setNama("Albert");
        obj1.printData();
        
        
    }

    public JHotel(){

    }

    public void printData(){
    
    }

}
