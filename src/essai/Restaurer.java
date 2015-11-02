package essai;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mesClasses.Ville;


public class Restaurer {
    
    public static void main(String []args){
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        
        try{
            fis=new FileInputStream("ville.towns");
            ois=new ObjectInputStream(fis);
            
            List<Ville> lv=(List<Ville>) ois.readObject();
            for (Ville v :lv) {
                System.out.println(v);
                
            }
            
        }catch(FileNotFoundException Ex){
            
        } catch (IOException ex) {
            Logger.getLogger(Restaurer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Restaurer.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
                ois.close();
                fis.close();
            }catch(IOException ex){
                
            }
        }
    }
    
}
