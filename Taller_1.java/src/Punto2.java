import java.util.Scanner;
public class Punto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Horas trabajadas: ");
        double horas = sc.nextDouble();
        System.out.print("Valor de la hora: ");
        double valorHora = sc.nextDouble();

        double salarioBruto = horas * valorHora;
        double descuentoSS = salarioBruto * 0.08;
        double retencion = salarioBruto * 0.05;
        double salarioNeto = salarioBruto - descuentoSS - retencion;

        System.out.println("Nombre: " + nombre);
        System.out.println("Salario Bruto: $" + salarioBruto);
        System.out.println("Descuento SS: $" + descuentoSS);
        System.out.println("Retención: $" + retencion);
        System.out.println("Salario Neto: " + salarioNeto);
    sc.close();
    }
    
}