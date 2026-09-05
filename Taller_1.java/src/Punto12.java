import java.util.Scanner;
public class Punto12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secreto = (int) (Math.random() * 100) + 1;
        int intentos = 0;
        int numero;

        do {
            System.out.print("Ingrese un número entre 1 y 100: ");
            numero = sc.nextInt();
            intentos++;

            if (numero > secreto) {
                System.out.println("El número es menor.");
            } else if (numero < secreto) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("¡Correcto! " + intentos + " intentos.");
            }
        } while (numero != secreto);
        sc.close();
    }
}

    