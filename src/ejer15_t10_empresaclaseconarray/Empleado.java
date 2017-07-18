
package ejer15_t10_empresaclaseconarray;

/**
 *
 * @author Ismael Martín Ramírez
 * [imartinr01@informatica.iesvalledeljerteplasencia.es]
 */
public class Empleado {
    
    private String nombreEmpleado;
    private int sueldo;

    public Empleado() {
    }

    public Empleado(String nombreEmpleado, int sueldo) {
        this.nombreEmpleado = nombreEmpleado;
        this.sueldo = sueldo;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
