
package Modelo;

/**
 *
 * @author USRVI-LC2
 */
public class Alumno {
    
    private int rut,idCarrera;
    private String nombre,direccion;
    
    public Alumno() {
    }

    public Alumno(int rut, String nombre, String direccion, int idCarrera) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.idCarrera = idCarrera;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Alumno{" + "rut=" + rut + ", idCarrera=" + idCarrera + ", nombre=" + nombre + ", direccion=" + direccion + '}';
    }
    
    
    
}
