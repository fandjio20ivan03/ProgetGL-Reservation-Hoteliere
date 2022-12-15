import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("665355f5-3aa8-4ef1-962a-91d716ade5a6")
public class Administrateur extends Personne {
    @objid ("84901e1b-b54a-4747-a730-fabf77ae5b20")
    private String PassAd;

    @objid ("d1e2d635-eea9-44f8-bee9-a5f692b4ddf3")
    private String LoginAd;

    @objid ("e36a1127-c42d-4191-963f-2aa8276ab433")
    public String getPassAd() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.PassAd;
    }

    @objid ("72defa2d-4ba7-4ec9-b24e-315ffc0cef8f")
    public void setPassAd(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.PassAd = value;
    }

    @objid ("ed82425c-b288-4612-99df-9035db9c1f10")
    public String getLoginAd() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.LoginAd;
    }

    @objid ("8d39dbc4-34ff-4226-887a-f80632ba805b")
    public void setLoginAd(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.LoginAd = value;
    }

    @objid ("d0bdb001-e363-483a-a0ac-4e8291169af9")
    public void AjouterReceptionniste() {
    }

    @objid ("44c2bdf2-b661-4a8c-b73d-d74b9c76b1b3")
    public void ModifierReceptionniste() {
    }

    @objid ("b023192e-3a5d-4828-a794-e5eaef0a809c")
    public void SupprimerReceptionniste() {
    }

    @objid ("e6e85c0e-ef51-43f5-a0a3-71eb492cee29")
    public void AjouterHotel() {
    }

    @objid ("b59d50b3-3017-46a0-a33b-85eee268ae51")
    public void ModifierHotel() {
    }

    @objid ("f3ac8a0c-59c1-4bea-888b-3f5f2c01011a")
    public void SupprimerHotel() {
    }

}
