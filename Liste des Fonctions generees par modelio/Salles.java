import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("90e1e401-f292-4098-9a92-1fcf8a17b4cb")
public class Salles extends Services {
    @objid ("194c2c0e-9a43-4036-9146-0ac885f4ee3e")
    private String Type;

    @objid ("77c8b5b6-54ed-45d7-95d1-b5d367bd52b3")
    private boolean EtatSalle;

    @objid ("781a08ff-1345-49dc-aca2-21e99c42fc56")
    private int Numero;

    @objid ("db6de54f-e3ee-4315-95c8-64d2bc85d08c")
    public String getType() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Type;
    }

    @objid ("7f801916-37ad-49a1-abee-b0d3f52d6768")
    public void setType(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Type = value;
    }

    @objid ("35b5ea4f-7721-4940-9857-3810846b5b01")
    public boolean isEtatSalle() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.EtatSalle;
    }

    @objid ("dcd85e5b-b8a6-43a1-bb3e-509f6175aed5")
    public void setEtatSalle(boolean value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.EtatSalle = value;
    }

    @objid ("f500390d-1a6e-4886-993e-7083587736e6")
    public int getNumero() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Numero;
    }

    @objid ("f436a93e-dfd6-472c-b0b3-ba1198f3a184")
    public void setNumero(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Numero = value;
    }

    @objid ("17fb4757-6cef-4f03-ae7e-35a3a3488e9f")
    public Salles() {
    }

    @objid ("f1f69144-e7b9-4537-b637-086b9675efa0")
    protected void finalize() {
    }

}
