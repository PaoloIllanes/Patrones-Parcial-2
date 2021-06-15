package strategy.ejercicio;

import java.util.ArrayList;
import java.util.Collections;

public class SortNombre implements IOrdenamiento{
    @Override
    public void execute(Database database) {
        ArrayList<String> nombres = new ArrayList<>();
        for (Empleado empleado: database.getEmpleados()) {

            nombres.add(empleado.getNombre());

        }

        Collections.sort(nombres);
        System.out.println("Ordenado por nombre");
        for (String nombre : nombres) {
            System.out.println(nombre);

        }

    }
}
