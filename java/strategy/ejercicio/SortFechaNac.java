package strategy.ejercicio;

import java.util.ArrayList;
import java.util.Collections;

public class SortFechaNac implements IOrdenamiento{
    @Override
    public void execute(Database database) {


        ArrayList<Integer> dates = new ArrayList<>();
        for (Empleado empleado: database.getEmpleados()) {

            dates.add(empleado.getDate());

        }
        Collections.sort(dates);
        System.out.println("Ordenado por fecha de nacimiento");
        for (Integer date : dates) {

            System.out.println(date);

        }

    }

}
