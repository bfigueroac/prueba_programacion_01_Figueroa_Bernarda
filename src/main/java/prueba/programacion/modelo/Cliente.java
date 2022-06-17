
package prueba.programacion.modelo;

public class Cliente {
    private int codigo;
    private String nombre;
    private String apeliido;
    private String telefono;
    private String cedula;

    public Cliente(int codigo, String nombre, String apeliido, String telefono, String cedula) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apeliido = apeliido;
        this.telefono = telefono;
        this.cedula = cedula;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apeliido
     */
    public String getApeliido() {
        return apeliido;
    }

    /**
     * @param apeliido the apeliido to set
     */
    public void setApeliido(String apeliido) {
        this.apeliido = apeliido;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
}
