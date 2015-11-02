package essai;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import mesClasses.PointPlan;
import mesClasses.Ville;

public class Sauvegarde {

    public static void main(String[] args) {

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        System.out.println("----------DEBUT-----------------");

        try {
            fos = new FileOutputStream("villes.towns");
            oos = new ObjectOutputStream(fos);
            
            PointPlan p01 = new PointPlan(0,0);
            Ville v01 = new Ville("origine",p01,"00000");
            
            List<Ville> lv = new ArrayList<>();
            lv.add(v01);
            lv.add(new Ville("Paris",new PointPlan(1,1),"75000"));
            lv.add(new Ville("Barcelone",new PointPlan(2,2),"08000"));
            
            oos.writeObject(lv);
            oos.flush();//vider la memoire tampon

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(); //affiche le msg complet de l'erreur dans la sortie err. (2 sorties out et err)
        } catch (IOException ex) {
            ex.printStackTrace();

        }finally{
            try{
                oos.close();
                fos.close();
            }catch(IOException Ex){
                
            }
        }
        System.out.println("--------------DONE ------------------------------");
    }
}