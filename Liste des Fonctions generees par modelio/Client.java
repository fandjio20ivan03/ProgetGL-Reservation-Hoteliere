import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d432951c-b269-441e-9a24-de2349fc7555")
public class Client extends Personne {
    @objid ("6fb2da8a-db76-4aab-a799-1a3aa248264c")
    private int NumClient;

    @objid ("61fffe2b-b867-4b91-9426-de4373e28430")
    public List<Services> demander = new ArrayList<Services> ();

    @objid ("9de57c63-6f65-441c-8bb2-862060356d35")
    public Reservation effectuer;

    @objid ("b32a9899-3723-4955-88f8-eb14d2d723a5")
    public Facture Payer;

    @objid ("3cd9e6a3-c8c9-40df-8218-3fe5735413f3")
    public int getNumClient() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.NumClient;
    }

    @objid ("3354047a-f3a2-4eab-993e-5afebb241aff")
    public void setNumClient(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.NumClient = value;
    }

    @objid ("a8862348-35e8-4b92-8e18-ff028ce3c283")
    public void DemandeReservation() {
    }

    @objid ("f4de9af3-9ef6-4a93-909b-121503570a05")
    public void ModifierDemande() {
    }

    @objid ("8fb641f2-5fc1-4d39-8faf-09be891d143b")
    public void AnnulerDemande() {
    }

}
