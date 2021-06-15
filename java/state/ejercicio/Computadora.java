package state.ejercicio;

public class Computadora {

    private IStateComputadora state;
    private CPU cpu;
    private MemoriaRam ram;
    private String[] programasAbiertos;

    public void request(){
        this.state.handler(this);

    }

    public IStateComputadora getState() {
        return state;
    }

    public void setState(IStateComputadora state) {
        this.state = state;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public MemoriaRam getRam() {
        return ram;
    }

    public void setRam(MemoriaRam ram) {
        this.ram = ram;
    }

    public String[] getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(String[] programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }
}
