abstract class Empleado {
    private int id;
    private String name;
    private String departamento;
    protected double salario;

    public Empleado(int id, String name, String departamento, double salario) {
        this.id = id;
        this.name = name;
        this.departamento = departamento;
        this.salario = salario;
    }

    public void mostrarDetalles(){
        System.out.println("ID: "+id);
        System.out.println("Nombre: "+name);
        System.out.println("Departamento: "+departamento);
        System.out.println("Salario: S/"+salario);
    }

    public abstract double calcularBono();

    public String evaluarDesempeno() {
        return null;
    }
}
