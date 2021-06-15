package strategy.ejercicio;

import strategy.basic.IStrategy;

import java.util.ArrayList;

public class Database {
    private ArrayList<Empleado> empleados;
    private IStrategy strategy;

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute(){
        this.strategy.execute();
    }

}
