
/**
 * Write a description of class Customer here.
 * 
 * @author Alberto Michael Tambunan 
 * @version 6 Maret
 */
public class Customer  //membuat kelas Customer
{
    protected int id;
    protected String nama;
    
    public Customer(int id, String nama){
        this.id=id;
        this.nama=nama;
        
    }
    
    public int getID(){
        return id;// mengembalikian id
    }
    
    public String getNama(){
        return nama;//mengembalikan nama
    }
    
    public void setID(int id){
       this.id=id;//mengeset id
    }
    
    public void setNama(String nama){
       this.nama=nama; 
    }
    
    public void printData(){
        System.out.println(id + nama);
    }
}
