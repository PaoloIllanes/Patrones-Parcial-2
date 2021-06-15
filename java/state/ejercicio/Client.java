package state.ejercicio;

public class Client {
    public static void main (String [] args){
        MemoriaRam ram=new MemoriaRam();
        CPU cpu = new CPU();
        String[] programas =  new String[20];
        IStateComputadora reiniciar = new StateReiniciar();
        IStateComputadora apagado =  new StateApagado();
        IStateComputadora prendido =  new StatePrendido();
        Computadora computadora= new Computadora();
        computadora.setCpu(cpu);
        computadora.setProgramasAbiertos(programas);
        computadora.setRam(ram);

        computadora.setState(reiniciar);
        computadora.request();
        computadora.setState(apagado);
        computadora.request();
        computadora.setState(prendido);
        computadora.request();
    }
}
