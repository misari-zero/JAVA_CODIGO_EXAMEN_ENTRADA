import Interfaces.IEvaluacionDesempeno;

import java.util.List;

public class Desarrollador extends Empleado implements IEvaluacionDesempeno {
    private List<String> listaLenguajes;

    //String lenguajes;
    public Desarrollador(int id, String name, String departamento, double salario, List<String> listaLenguajes) {
        super(id, name, departamento, salario);
        //this.lenguajes = lenguajes;
        this.listaLenguajes = listaLenguajes;
    }

    public void mostrarDetalles(){
        super.mostrarDetalles();
    }
    @Override
    public double calcularBono() {
        String evaluacion = evaluarDesempeno();

        if (evaluacion.equals("BUENO")) {
            return salario; // 100% del salario como bono
        } else if (evaluacion.equals("REGULAR")) {
            return salario * 0.5; // 50% del salario como bono
        } else {
            return 0; // Sin bono
        }
        //return listaLenguajes.size()*100;
    }

    @Override
    public String evaluarDesempeno() {
        if (listaLenguajes.size() >= 3) {
            return "BUENO";
        } else if (listaLenguajes.size() >= 2) {
            return "REGULAR";
        } else {
            return "NO HAY BONO SI SU DESEMPEÑO ES MALO";
        }
    }
}
