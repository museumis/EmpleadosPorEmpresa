
package ejer15_t10_empresaclaseconarray;

import java.util.ArrayList;

/**
 *
 * @author Ismael Martín Ramírez
 * [imartinr01@informatica.iesvalledeljerteplasencia.es]
 */
public class Empresa {
    
    private String nombreEmpresa;
    private ArrayList <Empleado> listaEmp;

    public Empresa() {
    }

    public Empresa(String nombreEmpresa, ArrayList<Empleado> listaEmp) {
        this.nombreEmpresa = nombreEmpresa;
        this.listaEmp = listaEmp;
    }

    public ArrayList<Empleado> getListaEmp() {
        return listaEmp;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setListaEmp(ArrayList<Empleado> listaEmp) {
        this.listaEmp = listaEmp;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    
    
}
