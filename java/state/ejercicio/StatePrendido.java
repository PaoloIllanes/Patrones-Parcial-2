package state.ejercicio;

public class StatePrendido implements IStateComputadora {

    public int getRandom(int min,int max){
        return(int)((Math.random()*(max-min))+min);

    }

    @Override
    public void handler(Computadora computadora) {
        int nProgramas= getRandom(1,20);
        int cpuUsage;
        int ramUsage;
        String[] programas= computadora.getProgramasAbiertos();
        for(int i=0;i<nProgramas;i++){
            programas[i]= "programa"+String.valueOf(i);
        }
        cpuUsage=nProgramas*5;
        ramUsage=nProgramas*5;
        computadora.getCpu().setUsage(cpuUsage);
        computadora.getRam().setUsage(ramUsage);
        System.out.println("Computadora prendida");
        System.out.println("Uso de cpu:"+computadora.getCpu().getUsage());
        System.out.println("Uso de ram:"+computadora.getRam().getUsage());
        System.out.println("Programas abiertos:"+nProgramas);
    }
}
