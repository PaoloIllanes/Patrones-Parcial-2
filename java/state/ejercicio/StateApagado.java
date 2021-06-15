package state.ejercicio;

public class StateApagado implements IStateComputadora {
    @Override
    public void handler(Computadora computadora) {
        String[] programas =  computadora.getProgramasAbiertos();
        for(int i =0;i< programas.length;i++){
            programas[i]= null;
        }
        computadora.getCpu().setUsage(5);
        computadora.getRam().setUsage(5);
        System.out.println("Iniciando computadora" );
        System.out.println("Programas abiertos : 0");
        System.out.println("Uso deCPU: "+computadora.getCpu().getUsage());
        System.out.println("Uso de RAM: "+computadora.getRam().getUsage());
    }
}
