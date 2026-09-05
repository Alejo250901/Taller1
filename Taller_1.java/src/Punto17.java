import java.util.Scanner;
public class Punto17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();

        int cantidad = 0;
        int suma = 0;
        String listaPrimos = "";

        for (int numero = a; numero <= b; numero++) {
            if (numero < 2) {
                continue; // 0 y 1 no son primos, salta al siguiente número
            }

            boolean esPrimo = true;
            int divisor = 2;

            while (divisor <= Math.sqrt(numero) && esPrimo) {
                if (numero % divisor == 0) {
                    esPrimo = false; // encontró un divisor exacto, no es primo
                }
                divisor++;
            }

            if (esPrimo) {
                listaPrimos += numero + " ";
                cantidad++;
                suma += numero;
            }
        }

        System.out.println("Números primos en el rango [" + a + ", " + b + "]: " + listaPrimos);
        System.out.println("Cantidad de números primos: " + cantidad);
        System.out.println("Suma de los números primos: " + suma);
        sc.close();
    }
}
