package houses_ms.models;

import org.springframework.data.annotation.Id;


public class Inmueble {
    @Id
    private String id;
    private String propietario;
    private Integer area;
    private Integer precio;
    private String  categoria;
    private String descripcion;
    private Boolean disponible;

    public Inmueble(String id, String propietario, Integer area, Integer precio, String categoria, String descripcion, Boolean disponible) {
        this.id = id;
        this.propietario = propietario;
        this.area = area;
        this.precio = precio;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.disponible = disponible;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
}
