package mesClasses;

import java.io.Serializable;

public class Ville implements Serializable{
    
    private String nom;
    private PointPlan point;
    private String zip;

    public Ville() {
    }

    public Ville(String nom, PointPlan point, String zip) {
        this.nom = nom;
        this.point = point;
        this.zip = zip;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public PointPlan getPoint() {
        return point;
    }

    public void setPoint(PointPlan point) {
        this.point = point;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return  nom +  point + "- zip=" + zip + "-";
    }
    
    
    
}
