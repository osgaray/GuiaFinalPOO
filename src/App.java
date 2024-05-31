import java.util.Scanner;
public class App {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        Empleado[] Empleados = new Empleado[3];
        Empleados[0] = new EmpleadoTiempoCompleto("Juan", "3240", 98659.34);
        Empleados[1] = new EmpleadoMedioTiempo("María", "8435", 35 , 3);
        Empleados[2] = new EmpleadoTiempoCompleto("Oscar", "2560", 98659.34);

        // for-each
        for (Empleado Empleado: Empleados){
            System.out.println("Nombre: " + Empleado.getNombre() + "\nSalario mensual: $" + Empleado.calcularsalario());
            System.out.println("Deseas realizar un aumento de salario? (s/n):");
            char opcion = input.nextLine().charAt(0);
            if (opcion == 's') {
                System.out.println("Ingrese el porcentaje de aumento: ");
                double porcentaje = input.nextDouble();
                input.nextLine();
                System.out.println("El salario total de "+Empleado.getNombre()+" es de "+Empleado.aumentarSalario(porcentaje)+"\n");
            }
        }
        
        // for-i
        // for (int i = 0; i < Empleados.length; i++) {
        //     System.out.println("Nombre: " + Empleados[i].getNombre() + "\nSalariomensual: $" + Empleados[i].calcularsalario());
        // }

    }
}
