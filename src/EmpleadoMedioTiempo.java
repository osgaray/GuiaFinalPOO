public class EmpleadoMedioTiempo extends Empleado {
    private double salarioPorhora;
    private int horasTrabajadasPorSemana;

    public EmpleadoMedioTiempo(String Nombre, String nueroidentificación, double salarioPorhora, int horasTrabajadasPorSemana){
        super(Nombre, nueroidentificación);
        this.salarioPorhora = salarioPorhora;
        this.horasTrabajadasPorSemana = horasTrabajadasPorSemana;
    }

    @Override
    public double calcularsalario(){
        return salarioPorhora * horasTrabajadasPorSemana * 4; // salario mensual
    }
}
