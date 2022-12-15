import java.util.Date;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("36469ff6-085f-4afe-97b4-4421d6ae49df")
public class Services {
    @objid ("22a8b48e-4d7b-4573-a22b-84019d6eb14f")
    private String Nom;

    @objid ("1f3d7163-1991-44b3-8b00-2fad986344c3")
    private Date Date;

    @objid ("45712239-9394-431e-ad67-f811f4f9e37d")
    private double PrixUnitaire;

    @objid ("c56476c6-8b85-4463-88c7-f1ed6a9a9752")
    public String getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Nom;
    }

    @objid ("284d030f-db1f-4cee-84a7-ae4bfb29a884")
    public void setNom(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Nom = value;
    }

    @objid ("19b0f4c9-e8c9-489d-93db-4af55f6d137f")
    public Date getDate() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Date;
    }

    @objid ("cdcaa385-584b-46e7-96f7-86683fb80be0")
    public void setDate(Date value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Date = value;
    }

    @objid ("6f5bc017-1850-4702-9ce1-a37ff57dcdbb")
    public double getPrixUnitaire() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.PrixUnitaire;
    }

    @objid ("e5df34f7-0652-42ee-8e83-c8e68ff906b2")
    public void setPrixUnitaire(double value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.PrixUnitaire = value;
    }

    @objid ("826bf773-5088-4447-996a-8940136d5eb8")
    public Services() {
    }

    @objid ("c36c727c-7583-4948-8725-c7a560d3837c")
    protected void finalize() {
    }

}
