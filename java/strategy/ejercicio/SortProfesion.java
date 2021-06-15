package strategy.ejercicio;

import java.util.ArrayList;
import java.util.Collections;

public class SortProfesion implements IOrdenamiento {

    @Override
    public void execute(Database database) {
        ArrayList<String> profesiones = new ArrayList<>();
        for (Empleado empleado: database.getEmpleados()) {

            profesiones.add(empleado.getProfesion());

        }

        Collections.sort(profesiones);
        System.out.println("Ordenado por profesion");
        for (String profesion : profesiones) {
            System.out.println(profesion);

        }

    }

}
