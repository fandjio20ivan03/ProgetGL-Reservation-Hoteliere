import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a9f517c5-d4f0-4728-9a82-d51de00d7827")
public class Hotels {
    @objid ("cb66227c-40fc-4bbe-bc06-ba4666f37f72")
    private String Nom;

    @objid ("5f0e708f-a90d-473b-bee4-61f91a4a7bce")
    private int Classe;

    @objid ("93b9c3c0-c28c-4a13-96fa-056cc6706f09")
    private String Adresse;

    @objid ("f1d77522-0296-4b4a-b960-9ebfef397b67")
    private String Telephone;

    @objid ("dc5ca3d3-2f41-4ef6-8abf-989ef4ad8cd5")
    private String Emails;

    @objid ("7ad4663f-84c4-47ff-8a3c-545395a5a8f4")
    private String Fax;

    @objid ("c4cdaf53-8230-486e-a720-601086ee0d66")
    public List<Services> Proposer = new ArrayList<Services> ();

    @objid ("41b264d5-1780-4df3-8d62-5d1bff408959")
    public String getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Nom;
    }

    @objid ("aa09b663-5878-473a-ac58-2f017e10ca03")
    public void setNom(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Nom = value;
    }

    @objid ("af87802a-f557-46c7-bb70-a608ec74c40a")
    public int getClasse() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Classe;
    }

    @objid ("ade845d2-9bc9-40d7-824f-8adbbaebba89")
    public void setClasse(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Classe = value;
    }

    @objid ("b1810bd9-beb4-4474-adf1-e3fdae69db3c")
    public String getAdresse() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Adresse;
    }

    @objid ("139ff89a-8b71-4b7d-b0c7-34f56d5d82ec")
    public void setAdresse(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Adresse = value;
    }

    @objid ("5b7aaea0-dd31-4f6e-8012-adcfdfb96d4a")
    public String getTelephone() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Telephone;
    }

    @objid ("cbd0ef71-efaa-4419-be9b-674872618074")
    public void setTelephone(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Telephone = value;
    }

    @objid ("4b480368-6946-4f75-a2ea-5342c85daac0")
    public String getEmails() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Emails;
    }

    @objid ("19f6771d-a615-4899-9f7a-86aee647321c")
    public void setEmails(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Emails = value;
    }

    @objid ("58e9e0b8-c8ac-49eb-9b44-2ac9ca6e6c5e")
    public String getFax() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Fax;
    }

    @objid ("fa41cb0f-d9f5-4bce-8e74-b832ce7ee2d6")
    public void setFax(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Fax = value;
    }

    @objid ("d072697d-7258-4cb7-8ff3-7864e1e7e508")
    public Hotels() {
    }

    @objid ("f97cde17-e6ed-4693-81fa-8fe82971a4db")
    protected void finalize() {
    }

    @objid ("e96e4a8a-0e03-4a4e-9e3a-cc7d0dc874a6")
    public void ListeHotel() {
    }

    @objid ("68dcab4b-3e87-4412-adea-5ac7492bf65f")
    public void RetourListeHotel() {
    }

    @objid ("3637ffaa-ae07-463d-89b9-f3c48943fcbc")
    public void AfficherInformation() {
    }

    @objid ("dfec6106-2274-47e2-953d-dbef7afbb752")
    public void RechercheDonneeSurUnHotel() {
    }

    @objid ("e9bdf3da-0dd5-416c-af0b-34bc60fc994d")
    public void InformationSurUnHotel() {
    }

    @objid ("7babd631-a9e7-4586-b426-78f75ef0adb2")
    public void FaireModification() {
    }

    @objid ("bd0181dc-9dac-460a-8efa-4df6e0eb6061")
    public void EnregistrementModification() {
    }

    @objid ("fda31832-96c0-4a0f-b4ad-1c98427bb164")
    public void AnnulerModification() {
    }

    @objid ("80ae8a1c-fba5-4338-8109-426b7c7ccc2e")
    public void MessageConfirmation() {
    }

    @objid ("80505715-d176-4baf-aac6-7ba2986bdc2b")
    public void AfficheMessage() {
    }

    @objid ("1278324c-585e-4063-884f-2b8771e71316")
    public void DemandeSuppressionHotel() {
    }

    @objid ("ba80aa43-4d01-4de1-a737-89eb817f7e7f")
    public void DemandeAuthenfication() {
    }

    @objid ("5d7ae14f-cbf3-493e-a4c5-09df371eba34")
    public void AfficherMessageConfirmation() {
    }

    @objid ("534bb174-81c6-467a-80b7-a9dcd9d447fa")
    public void ValidationSuppression() {
    }

    @objid ("238cbecc-15e3-44cc-9d4a-a2607968ab56")
    public void DemandeInscription() {
    }

    @objid ("37c352ec-5620-4cf2-a157-cd043cdf71d7")
    public void ValidationInscription() {
    }

    @objid ("b7617bef-d269-41cd-b359-527192123174")
    public void TraitementRequette() {
    }

    @objid ("9d91c309-a2e0-45cb-930c-31a28f7b58bc")
    public void MessageErreur() {
    }

}
