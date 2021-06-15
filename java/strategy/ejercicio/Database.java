package strategy.ejercicio;

import java.util.ArrayList;

public class Database {
    private ArrayList<Empleado> empleados;
    private IOrdenamiento strategy;

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public IOrdenamiento getStrategy() {
        return strategy;
    }

    public void setStrategy(IOrdenamiento strategy) {
        this.strategy = strategy;
    }

    public void execute(){
        this.strategy.execute(this);
    }

}
