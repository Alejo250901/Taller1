import java.util.Scanner;
public class Punto6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer lado: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese el segundo lado: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese el tercer lado: ");
        double c = sc.nextDouble();

        boolean Valido = (a + b > c) && (a + c > b) && (b + c > a);

        if (!Valido) {
            System.out.println("No es un triángulo válido");
        } 
        else {
            if (a == b && b == c) {
                System.out.println("Equilátero");
            } 
            else if (a == b || b == c || a == c) {
                System.out.println("Isósceles");
            } 
            else {
                System.out.println("Escaleno");
            }
        }
        sc.close();
    }
    
}
   