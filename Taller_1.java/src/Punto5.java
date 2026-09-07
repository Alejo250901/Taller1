import java.util.Scanner;
public class Punto5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre por favor: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese la primera nota: ");
        double nota1 = sc.nextDouble(); 
        System.out.print("Ingrese la segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Ingrese la nota del parcial final: ");
        double pf = sc.nextDouble();

        double promedio = (nota1 * 0.30) + (nota2 * 0.30) + (pf * 0.40);
        if(promedio <= 3.0){
            System.out.println("Usted ha Aprobado, Felicitaciones: " + nombre);
        } else {
            System.out.println("Usted ha Reprobado");
        }
        System.out.printf("El promedio final es: %.2f%n", promedio);
        sc.close();

    }
}