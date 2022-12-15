import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("63deabd3-6a71-44cb-bcc6-eb006e4ba0eb")
public class Receptionniste extends Personne {
    @objid ("46a64fe0-e9db-4440-9ef5-9aa7d4394b55")
    private String Login;

    @objid ("09e60774-1d29-4cd4-934e-379ae5a761ee")
    private String Pass;

    @objid ("22f88d1f-134b-4202-b665-8ff05edaccf7")
    public List<Hotels> Recruter = new ArrayList<Hotels> ();

    @objid ("71c2c0e6-294b-4356-ae3f-3b22599ca4a4")
    public String getLogin() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Login;
    }

    @objid ("d74dc9df-1d9f-45fd-98cf-c696e110f530")
    public void setLogin(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Login = value;
    }

    @objid ("90010527-18d0-400b-9b4d-e6a4b80cc8f8")
    public String getPass() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Pass;
    }

    @objid ("a6b06cf6-0d52-4275-9b23-701de3ec287d")
    public void setPass(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Pass = value;
    }

    @objid ("98c63680-9646-4237-8a3c-53a1a0aafc5d")
    public void AccepterReservation() {
    }

    @objid ("6b396359-bd5e-4368-84ad-91258be6dcc7")
    public void SupprimerReservation() {
    }

    @objid ("d850abaf-4377-4588-97ff-74397738fa6f")
    public void BilanReservation() {
    }

    @objid ("10feff9e-accc-49d1-957b-3c97feb85c7c")
    public void VerifierReservation() {
    }

}
