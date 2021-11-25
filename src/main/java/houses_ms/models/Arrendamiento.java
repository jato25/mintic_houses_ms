package houses_ms.models;

import org.springframework.data.annotation.Id;

import javax.swing.*;

public class Arrendamiento {

    @Id
    private String id;
    private String id_inmueble;
    private String arrendatario;

    public Arrendamiento(String id, String id_inmueble, String arrendatario) {
        this.id = id;
        this.id_inmueble = id_inmueble;
        this.arrendatario = arrendatario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_inmueble() {
        return id_inmueble;
    }

    public void setId_inmueble(String id_inmueble) {
        this.id_inmueble = id_inmueble;
    }

    public String getArrendatario() {
        return arrendatario;
    }

    public void setArrendatario(String arrendatario) {
        this.arrendatario = arrendatario;
    }
}
