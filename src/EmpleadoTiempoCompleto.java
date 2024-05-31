public class EmpleadoTiempoCompleto extends Empleado {
    private double salarioanual;

    public EmpleadoTiempoCompleto(String Nombre, String numeroidentificación, double salarioanual) {
        super(Nombre, numeroidentificación);
        this.salarioanual = salarioanual;
    }

    @Override
    public double calcularsalario() {
       return salarioanual / 12; //salario mensual.
    }
}
