package state.ejercicio;

public class StateReiniciar implements IStateComputadora {
    @Override
    public void handler(Computadora computadora) {

        System.out.println("Reiniciando");

        System.out.println("Cerrando programas");
        for(int i =0;i<computadora.getProgramasAbiertos().length;i++){
            computadora.getProgramasAbiertos()[i]=null;

        }
        computadora.getRam().setUsage(0);
        computadora.getCpu().setUsage(0);
        System.out.println("Uso de CPU: "+computadora.getCpu().getUsage());
        System.out.println("Uso de RAM: "+computadora.getRam().getUsage());
        System.out.println("Programas abiertos: 0");



    }
}
