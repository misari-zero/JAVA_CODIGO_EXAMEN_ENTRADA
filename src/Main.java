import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Empleado> empleados = new ArrayList<>();
        // Desarrollador
        empleados.add(new Desarrollador(1, "Juan", "Tecnologia", 3000, List.of("Java", "Python")));
        empleados.add(new Desarrollador(2, "Gian", "Tecnología-Negocios", 4000, List.of("Java", "Python", "Javascript")));
        empleados.add(new Desarrollador(3, "Mario", "Tecnologia-Prestamos", 3000, List.of("Java")));

        // Gerente
        empleados.add(new Gerente(4, "Maria", "Recursos Humanos", 6000, List.of(
                new Empleado(5, "Ana", "Recursos Humanos", 1500) {
                    @Override
                    public double calcularBono() {
                        return 0;
                    }
                },
                new Empleado(6, "Carlos", "Recursos Humanos", 1800){
                    @Override
                    public double calcularBono() {
                        return 0;
                    }
                },
                new Empleado(7, "Carolay", "Recursos Humanos", 1700){
                    @Override
                    public double calcularBono() {
                        return 0;
                    }
                },
                new Empleado(8, "Diego", "Recursos Humanos", 1800){
                    @Override
                    public double calcularBono() {
                        return 0;
                    }
                },
                new Empleado(9, "Pedro", "Recursos Humanos", 1600){
                    @Override
                    public double calcularBono() {
                        return 0;
                    }
                })));


        empleados.add(new Gerente(10, "Eduardo", "MARKETING", 6500, List.of(
                new Empleado(11, "Jose", "MARKETING", 2000) {
                    @Override
                    public double calcularBono() {
                        return 0;
                    }
                },
                new Empleado(12, "Karla", "MARKETING", 2200){
                    @Override
                    public double calcularBono() {
                        return 0;
                    }
                })));

        empleados.add(new Gerente(13, "Natalia", "VENTAS", 7000, List.of(
                new Empleado(14, "Aaron", "VENTAS", 2100) {
                    @Override
                    public double calcularBono() {
                        return 0;
                    }
                })));
        for (Empleado empleado: empleados) {
            empleado.mostrarDetalles();
            System.out.println("Bono anual: S/"+empleado.calcularBono());
            System.out.println("Evaluación de desempeño: "+empleado.evaluarDesempeno());
            System.out.println();
        }
    }
}