import java.util.Scanner;
public class Punto15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese a: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese b: ");
        double b = sc.nextDouble();

        int cantidad = 0;
        int suma = 0;
        String ListaPrimos = "";
        for (int i = 1; i <= b; i++) {
            if (i < 2) {
                continue;
            }
                boolean esPrimo = true;
                int divisor = 2;
                while (divisor <= Math.sqrt(i) && esPrimo) {
                    if (i % divisor == 0) {
                        esPrimo = false;
                    }
                    divisor = divisor + 1;
                }
                if (esPrimo) {
                    ListaPrimos = ListaPrimos + i + " ";
                    cantidad = cantidad + 1;
                    suma = suma + i;
                }
            }
        System.out.println("Los números primos entre " + a + " y " + b + " son: " + ListaPrimos);
        System.out.println("Cantidad de números primos: " + cantidad);
        System.out.println("Suma de los números primos: " + suma);
        sc.close();
        }
        
    }
