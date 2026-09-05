import java.util.Scanner;
public class Punto8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la nota (0,0 a 5,0): ");
        double nota = sc.nextDouble();
        char letra;
        String equivalente;

        if (nota >= 4.6) {
            letra = 'A';
            equivalente = "Excelente";
        } else if (nota >= 4.0) {
            letra = 'B';
            equivalente = "Sobresaliente";
        } else if (nota >= 3.5) {
            letra = 'C';
            equivalente = "Aceptable";
        } else if (nota >= 3.0) {
            letra = 'D';
            equivalente = "Aprobado mínimo";
        } else {
            letra = 'F';
            equivalente = "Reprobado";
        }
        System.out.println("Nota: " + nota);
        System.out.println("Letra: " + letra);
        System.out.println("Equivalente: " + equivalente);
    sc.close();    
    }
    
}