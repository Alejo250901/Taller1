import java.util.Scanner;
public class Punto16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        double suma = 0;
        double masAlta = notas[0], posAlta = 0;
        double masBaja = notas[0], posBaja = 0;
        int aprobados = 0, reprobados = 0;

        for (int i = 0; i < 10; i++) {
            suma += notas[i];

            if (notas[i] > masAlta) {
                masAlta = notas[i];
                posAlta = i;
            }

            if (notas[i] < masBaja) {
                masBaja = notas[i];
                posBaja = i;
            }

            if (notas[i] >= 3.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        double promedio = suma / 10;

        System.out.println("Promedio: " + promedio);
        System.out.println("Nota más alta: " + masAlta + " en la posición " + posAlta);
        System.out.println("Nota más baja: " + masBaja + " en la posición " + posBaja);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);
        sc.close();
    }
}
