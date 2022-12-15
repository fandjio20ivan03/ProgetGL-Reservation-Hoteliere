import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c95ef8d0-41c1-4565-b1c0-545cc3b70a0a")
public class Chambres extends Services {
    @objid ("ae0fae98-957c-483f-b376-e838359be332")
    private int Numero;

    @objid ("e3dc02ae-f4b7-416c-82d6-1048b88976d1")
    private String Type;

    @objid ("96998e52-94c9-4071-949a-3cfb0b8d85ec")
    private boolean EtatChambres;

    @objid ("307b1131-5351-4f72-a2ad-94c46c466f2a")
    public int getNumero() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Numero;
    }

    @objid ("a5ae4c55-dbc8-4e56-979d-7d70a16a1268")
    public void setNumero(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Numero = value;
    }

    @objid ("5ff18db8-3f1e-4251-9056-ef5d0bc23558")
    public String getType() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Type;
    }

    @objid ("113f4ee8-c9b1-4220-84ea-8d543d706869")
    public void setType(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Type = value;
    }

    @objid ("1d026852-9866-46c9-a66a-e86cd1443cd4")
    public boolean isEtatChambres() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.EtatChambres;
    }

    @objid ("7cb51366-0808-4b3a-be0c-7f269564b505")
    public void setEtatChambres(boolean value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.EtatChambres = value;
    }

    @objid ("4c9f4f6f-274d-47c5-9f2d-936b7f6d934e")
    public Chambres() {
    }

    @objid ("a9fc9079-810d-4de1-a9c8-dffa9345fe90")
    protected void finalize() {
    }

}
