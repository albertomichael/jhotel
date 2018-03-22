import java.util.Date;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
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
    protected String email;
    protected Date dob;
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
    
    public String getEmail(){  
        return email;
    }
    
    public void setID(int id){
       this.id=id;//mengeset id
    }
    
    public void setNama(String nama){
       this.nama=nama; 
    }
    
    public boolean setEmail(String emailAddress){
        String email_regex="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[^-][a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        Pattern pattern = Pattern.compile(email_regex);
        Matcher matcher = pattern.matcher(emailAddress);
        
        
        if(matcher.matches()){
        email=emailAddress;
        return true;
        }
        else{
            return false;
        }
    }
    
    public void setDOB(Date dob){
        this.dob=dob;
    }
    
    public String toString(){
        return null;
    }
    public void printData(){
         System.out.println("Data Pelanggan");
        System.out.println("ID Pelanggan  : "+id); 
        System.out.println("Nama Pelanggan: "+ nama);
    }
}
