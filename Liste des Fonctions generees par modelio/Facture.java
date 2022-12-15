import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ec7d2157-e0fe-474d-b130-bc6915b29264")
public class Facture {
    @objid ("b87df394-0481-4a85-9e75-d039055046b1")
    private float PrixTotalHT;

    @objid ("fcd085a7-1392-413e-ac8a-0597e9c9a936")
    private float PrixTotalTTC;

    @objid ("9f3fefa3-7a98-4a70-ab43-efa1183508e8")
    private Date DateFacture;

    @objid ("61d74963-4920-4d8d-8d50-4cd63b161304")
    private int Qte;

    @objid ("4128a2ab-ebfb-497b-a492-532884bf4ada")
    private long NumeroFacture;

    @objid ("1e5d577a-6cf0-4393-a1be-57056965a920")
    public List<ModePaiement> Utiliser = new ArrayList<ModePaiement> ();

    @objid ("2f19112a-bbad-425d-90f4-dbabc688e70c")
    public float getPrixTotalHT() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.PrixTotalHT;
    }

    @objid ("cce7a0e6-df2b-44d2-8ddf-386a5f51fbdd")
    public void setPrixTotalHT(float value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.PrixTotalHT = value;
    }

    @objid ("c5dd52ca-2521-4aef-a1e8-6775a50350ea")
    public float getPrixTotalTTC() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.PrixTotalTTC;
    }

    @objid ("2673f3be-5098-41e3-8ead-e5b45374e911")
    public void setPrixTotalTTC(float value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.PrixTotalTTC = value;
    }

    @objid ("1f34d1a3-ee7e-4d37-bcb5-666eeb970ec1")
    public Date getDateFacture() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.DateFacture;
    }

    @objid ("024822dd-3596-422f-9af2-d322add74f34")
    public void setDateFacture(Date value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.DateFacture = value;
    }

    @objid ("8e8145ee-8a58-4ca6-a524-40b3d4835f72")
    public int getQte() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Qte;
    }

    @objid ("273e7724-0b44-4992-a50b-f288e19587dd")
    public void setQte(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Qte = value;
    }

    @objid ("ffc5d61f-0d52-41f4-bbee-9b283e48fd5a")
    public long getNumeroFacture() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.NumeroFacture;
    }

    @objid ("cbb836b6-7da5-44cd-9e2c-1539166cdd0f")
    public void setNumeroFacture(long value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.NumeroFacture = value;
    }

    @objid ("6c30572a-a031-48d9-b16d-e1d5906eb6c4")
    public Facture() {
    }

    @objid ("c3286e7b-a1cc-440b-9273-0062822a1adb")
    protected void finalize() {
    }

}
