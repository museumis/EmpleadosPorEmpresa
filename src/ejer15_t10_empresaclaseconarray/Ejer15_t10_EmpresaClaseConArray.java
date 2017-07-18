package ejer15_t10_empresaclaseconarray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Ismael Martín Ramírez
 * [imartinr01@informatica.iesvalledeljerteplasencia.es]
 */
public class Ejer15_t10_EmpresaClaseConArray {

    public static int menuOpcion() {

        int opcion = 0;
        Scanner entrada = new Scanner(System.in);

        try {

            do {
                System.out.println("-------------------------------");
                System.out.println("¿Qué desea hacer?");
                System.out.println("1 - Registrar una empresa");
                System.out.println("2 - Mostrar empresa y empleados");
                System.out.println("3 - Ver los empleados cuyo nombre contenga la \"A\"");
                System.out.println("4 - Ver empleados ordenados por el sueldo que ganan");
                System.out.println("5 - Salir del programa");
                System.out.print("Opción: ");

                opcion = entrada.nextInt();
                System.out.println("-------------------------------");

                if ((opcion > 5) || (opcion < 1)) {

                    System.out.println("-------------------------------");
                    System.out.println("Los números deben estar comprendidos entre 1 y 5.");

                }

            } while ((opcion > 5) || (opcion < 1));

        } catch (Exception e) {

            System.out.println("-------------------------------");
            System.out.println("Debes Introducir números entre 1 y 5.");

        }

        return opcion;
    }

    public static void rellenarEmpresa(ArrayList<Empresa> empresa) {

        String nomEmpresa;
        ArrayList<Empleado> empleados = new ArrayList();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Empresa " + (empresa.size() + 1));

        nomEmpresa = pedirNombreEmpresa();

        do {
            System.out.println("Empleado " + (empleados.size() + 1));
            empleados.add(new Empleado(pedirNombreEmpleado(), pedirSueldo()));

            System.out.print("¿Desea guardar nuevos empleados?");
        } while (entrada.nextLine().equalsIgnoreCase("Si"));

        empresa.add(new Empresa(nomEmpresa, empleados));
    }

    public static String pedirNombreEmpleado() {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del empleado:");

        return entrada.nextLine();
    }

    public static String pedirNombreEmpresa() {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre de la emplesa:");

        return entrada.nextLine();
    }

    public static int pedirSueldo() {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Sueldo: ");

        return entrada.nextInt();

    }

    public static void mostarEmplesa(ArrayList<Empresa> empresa) {

        int i, j;

        for (i = 0; i < empresa.size(); i++) {
            System.out.println("La empresa " + (i + 1) + " llamada " + empresa.get(i).getNombreEmpresa() + " tiene los siguienes empleados.");
            for (j = 0; j < empresa.get(i).getListaEmp().size(); j++) {
                System.out.println(empresa.get(i).getListaEmp().get(j).getNombreEmpleado() + " el cual cobra " + empresa.get(i).getListaEmp().get(j).getSueldo() + " €");
            }
        }

    }

    public static void mostarEmpledosA(ArrayList<Empresa> empresa) {

        int i, j, k;

        for (i = 0; i < empresa.size(); i++) {
            for (j = 0; j < empresa.get(i).getListaEmp().size(); j++) {

                for (k = 0; k < empresa.get(i).getListaEmp().get(j).getNombreEmpleado().length(); k++) {
                    if (empresa.get(i).getListaEmp().get(j).getNombreEmpleado().charAt(k) == 'a') {

                        System.out.println(empresa.get(i).getListaEmp().get(j).getNombreEmpleado() + " el cual cobra " + empresa.get(i).getListaEmp().get(j).getSueldo() + " €");

                    }

                    if (empresa.get(i).getListaEmp().get(j).getNombreEmpleado().charAt(k) == 'A') {

                        System.out.println(empresa.get(i).getListaEmp().get(j).getNombreEmpleado() + " de " + empresa.get(i).getNombreEmpresa() + " cobra " + empresa.get(i).getListaEmp().get(j).getSueldo() + " €");

                    }
                }

            }
        }

    }

    public static void ordenarSueldo(ArrayList<Empresa> empresa) {

        int i, j;

        ArrayList<Integer> sueldo = new ArrayList();
        ArrayList<Integer> numEmpresa = new ArrayList();
        ArrayList<Integer> numEmpleado = new ArrayList();
        

        for (i = 0; i < empresa.size(); i++) {
            for (j = 0; j < empresa.get(i).getListaEmp().size(); j++) {

                sueldo.add(empresa.get(i).getListaEmp().get(j).getSueldo());
                numEmpresa.add(i);
                numEmpleado.add(j);

            }
        }

        Collections.sort(sueldo);
       
        
        System.out.println("Los sueldos ordenados quedarian; ");
        
        for (int m = sueldo.size()-1; m >= 0; m--) {
            
            System.out.println(empresa.get(numEmpresa.get(m)).getListaEmp().get(numEmpleado.get(m)).getNombreEmpleado()+" con "+sueldo.get(m)+" €");
        }

    }

    public static void main(String[] args) {

        int opcion;

        ArrayList<Empresa> empresa = new ArrayList();

        System.out.println("Programa para registrar notas de alumnos");

        do {

            opcion = menuOpcion();

            switch (opcion) {

                case 1: {
                    rellenarEmpresa(empresa);
                    System.out.println("Empresa rellenada.");
                    break;
                }

                case 2: {
                    mostarEmplesa(empresa);
                    break;
                }
                case 3: {
                    mostarEmpledosA(empresa);
                    break;
                }
                case 4: {

                    ordenarSueldo(empresa);
                    break;
                }
                case 5: {
                    System.out.println("!Saludos!");
                    break;
                }

            }
        } while (opcion != 5);
    }

}
