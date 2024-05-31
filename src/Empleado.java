public abstract class Empleado {
    private String Nombre;
    private String nueroidentificación;

    public Empleado(String Nombre, String numeroidentificación){
        this.Nombre = Nombre;
        this.nueroidentificación = numeroidentificación;
        
    }
    public String getNombre(){
    return Nombre;
    }
  
    public String getnumeroidentificación(){
    return nueroidentificación;
    }  
    public  abstract double calcularsalario();

   
    public double aumentarSalario(double porcentaje){
        return calcularsalario() * (porcentaje/100)+ calcularsalario();
    }
}
