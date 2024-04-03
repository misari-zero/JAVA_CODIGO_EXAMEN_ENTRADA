import Interfaces.IEvaluacionDesempeno;

import java.util.List;

public class Gerente extends Empleado implements IEvaluacionDesempeno {
    private List<Empleado> listaEquipo;
    public Gerente(int id, String name, String departamento, double salario, List<Empleado> listaEquipo) {
        super(id, name, departamento, salario);
        this.listaEquipo = listaEquipo;
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
            return salario*0.5; // 50% del salario como bono
        } else {
            return 0; // Sin bono
        }
        //return listaEquipo.size() * 500;
    }

    @Override
    public String evaluarDesempeno() {
        if (listaEquipo.size() >= 5) {
            return "BUENO";
        } else if (listaEquipo.size() >= 2) {
            return "REGULAR";
        } else {
            return "NO HAY BONO SI SU DESEMPEÑO ES MALO";
        }
    }
}
