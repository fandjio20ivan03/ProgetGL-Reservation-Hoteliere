import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("72eef8d1-477a-45c7-ac2f-4dcc897d01f6")
public class Telephone extends Services {
    @objid ("c9dc7dbf-0eb3-4bcb-9c79-77bbec52e2d3")
    private String NomClient;

    @objid ("8bce0054-a8ee-4df5-b5f5-c9d2f5401518")
    private int NumeroChambre;

    @objid ("5eae4f8a-682e-4516-8e71-0f6afc020f00")
    private String ObjetAppel;

    @objid ("bbf7ee02-cf8e-42d2-acb1-fb1eb8118239")
    public String getNomClient() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.NomClient;
    }

    @objid ("fb6abb2f-d14b-4315-9e58-787e23cbf089")
    public void setNomClient(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.NomClient = value;
    }

    @objid ("9b3ebe20-f49f-4acd-81aa-79852319a0c4")
    public int getNumeroChambre() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.NumeroChambre;
    }

    @objid ("3718a57d-cf6a-4727-ba9b-be5a3ea2faaa")
    public void setNumeroChambre(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.NumeroChambre = value;
    }

    @objid ("737f0eec-2977-4316-b66b-4e0c76969922")
    public String getObjetAppel() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.ObjetAppel;
    }

    @objid ("3baa60d6-ed32-4288-a0ee-edb8cb05a351")
    public void setObjetAppel(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.ObjetAppel = value;
    }

    @objid ("f3c8e57b-e9ca-49b8-a9a3-a9324129c198")
    public Telephone() {
    }

    @objid ("e9046bde-d706-478f-a00d-df7a665df44e")
    protected void finalize() {
    }

}
