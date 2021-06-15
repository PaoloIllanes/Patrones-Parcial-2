package strategy.ejercicio;

import java.util.ArrayList;

public class Client {
    public static void main (String[] args){

        Database database= new Database();
        Empleado juan =  new Empleado(1955,123,"abogado","juan");
        Empleado jose =  new Empleado(1966,456,"doctor","jose");
        Empleado diego =  new Empleado(1998,567,"programador","diego");
        Empleado alvaro =  new Empleado(1978,789,"cirujano","alvaro");

        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(juan);
        empleados.add(jose);
        empleados.add(diego);
        empleados.add(alvaro);


        database.setStrategy(new SortCI());
        database.execute();

        database.setStrategy(new SortFechaNac());
        database.execute();

        database.setStrategy(new SortProfesion());
        database.execute();

        database.setStrategy(new SortNombre());
        database.execute();
    }
}
