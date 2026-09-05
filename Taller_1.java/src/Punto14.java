import java.util.Scanner;
public class Punto14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad = 0;   

        while (edad < 1 || edad > 120) {
            System.out.print("Ingrese su edad (1-120): ");
            edad = sc.nextInt();
            if (edad < 1 || edad > 120) {
                System.out.println("Edad inválida, intenta de nuevo");
            }
        }

        String etapa;
        if (edad <= 12) {
            etapa = "Niñez";
        } else if (edad <= 17) {
            etapa = "Adolescencia";
        } else if (edad <= 25) {
            etapa = "Juventud";
        } else if (edad <= 59) {
            etapa = "Adultez";
        } else {
            etapa = "Tercera edad";
        }

        System.out.println("Edad: " + edad + ", Etapa: " + etapa);
        sc.close();
    }
}
