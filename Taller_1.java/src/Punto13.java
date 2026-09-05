import java.util.Scanner;
public class Punto13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int n = sc.nextInt();

        int sumaNaturales = 0;
        for (int i = 1; i <= n; i++) {
            sumaNaturales += i;
        }
        int formulaNaturales = n * (n + 1) / 2;

        
        int sumaPares = 0;
        for (int i = 1; i <= n; i++) {
            sumaPares += 2 * i;
        }
        int formulaPares = n * (n + 1);

  
        int sumaCuadrados = 0;
        for (int i = 1; i <= n; i++) {
            sumaCuadrados += i * i;
  }
        int formulaCuadrados = n * (n + 1) * (2 * n + 1) / 6;

        System.out.println("Suma de los " + n + " primeros números naturales: " + sumaNaturales);
        System.out.println("Fórmula: " + formulaNaturales);
        System.out.println("Suma de los " + n + " primeros números pares: " + sumaPares);
        System.out.println("Fórmula: " + formulaPares);
        System.out.println("Suma de los " + n + " primeros cuadrados: " + sumaCuadrados);
        System.out.println("Fórmula: " + formulaCuadrados);
        sc.close();
    }
}
