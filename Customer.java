
/**
 * class Customer - berisi data pelanggan berupa id dan nama
 *
 * @author Alberto Michael
 * @version 01/03/2018
 */
import java.text.SimpleDateFormat;
import java.util.*;

public class Customer
{
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;

    SimpleDateFormat dobformat = new SimpleDateFormat("dd MMMMMMMMM yyyy");
    
    /**
     * Constructor untuk objek pada kelas Customer
     */
    public Customer(String nama, Date dob, String email)
    {
        // assign instance variables
        this.id = DatabaseCustomer.getLastCustomerID()+1;
        this.nama = nama;
        this.dob = dob;
        this.email=email;
    }
    public Customer(String nama, int tanggal, int bulan,
    int tahun, String email)
    {
        // initialise instance variables 
        this.id = DatabaseCustomer.getLastCustomerID()+1;
        this.nama = nama;
        this.email=email;
        this.dob = new GregorianCalendar(tahun,bulan-1,tanggal).getTime();
    }
    /**
     * method untuk mengambil nomor id pelanggan
     * @return id
     */
    public int getID()
    {
        return id;
    }
    /**
     * method untuk mengambil nama pelanggan
     * @return nama
     */
    public String getNama()
    {
        return nama;
    }
    /**
     * method untuk mengambil nama pelanggan
     * @return nama
     */
    public String getEmail()
    {
        return email;
    }
    /**
     * method untuk mengambil nama pelanggan
     * @return nama
     */
    public Date getDOB()
    {
        //System.out.printf("%1$s %2$td %2$tB %2$tY", "DOB: ", dob);
        //System.out.println(dob.toString());
        return dob;
    }
    /**
     * method untuk dapat mengatur nomor id pelanggan
     * @param id
     */
    public void setID(int id)
    {
        this.id = id;
    }
    /**
     * method untuk dapat mengatur nama pelanggan
     * @param nama
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public void setEmail(String email)
    {
        if (email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
            System.out.println("Email valid");
            this.email = email;
        }
        else {
            System.out.println("Email tidak valid");
        }
    }

    public void setDOB(Date dob)
    {
        this.dob = dob;
    }
    /**
     * method untuk dapat mencetak id dan nama pelanggan
     * 
     */
    public String toString()
    {
        if(DatabasePesanan.getPesananAktif(this)==null)
        {
            return "\nCustomer"
                    + "\nCustomer ID\t\t:" + getID()
                    +"\nNama\t\t\t:"+ getNama()
                    +"\nE-mail\t\t\t:"+ getEmail()
                    +"\nDate of birth\t:"+ dobformat.format(getDOB());
        }
        else 
        {
            return "\nCustomer"
                    + "\nCustomer ID\t\t:" + getID()
                    +"\nNama\t\t\t:"+ getNama()
                    +"\nE-mail\t\t\t:"+ getEmail()
                    +"\nDate of birth\t:"+ dobformat.format(getDOB())
                    + "\nBooking order is on process";
        }
    }
}
