package strategy.ejercicio;

import java.util.ArrayList;
import java.util.Collections;

public class SortCI implements IOrdenamiento{
    @Override
    public void execute(Database database) {


            ArrayList<Integer> cis = new ArrayList<>();
            for (Empleado empleado: database.getEmpleados()) {

                cis.add(empleado.getCi());

            }
            Collections.sort(cis);

        System.out.println("Ordenado por CI");
            for (Integer ci : cis) {
                System.out.println(ci);

            }

        }

    }

