
/**
 * Write a description of class Lokasi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lokasi
{
    // instance variables - replace the example below with your own
   private float x_coord;
   private float y_coord;
   public String deskripsiLokasi;
   
    public Lokasi(float x_coord,float y_coord,String deskripsiLokasi){
        this.x_coord=x_coord;
        this.y_coord=y_coord;
        this.deskripsiLokasi=deskripsiLokasi;
    }
    
    
    
    public float getX(){
    return x_coord;
    }
    
    public float getY(){
        return y_coord;
    }
    
    public String getDeskripsi(){
        return deskripsiLokasi;
    }
    
    public void setX(float x_coord){
        this.x_coord=x_coord;
    }
    
    public void setY(float y_coord){
        this.y_coord=y_coord;
    }
    
    public void setDeskripsi(String deskripsiLokasi){
        this.deskripsiLokasi=deskripsiLokasi;
    }
    
    public void printData(){
        System.out.printf("%.2f ,%.2f",x_coord,y_coord);
    }
}

