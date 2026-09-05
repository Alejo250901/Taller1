import java.util.Scanner;
public class Punto18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] pacientes = new String[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese el nombre del paciente " + (i + 1) + ": ");
            pacientes[i] = sc.nextLine();
        }

        System.out.print("Ingrese el nombre del paciente a buscar: ");
        String nombreBuscado = sc.nextLine();

        int posicion = -1;   

        for (int i = 0; i < 8; i++) {
            if (pacientes[i].equalsIgnoreCase(nombreBuscado)) {
                posicion = i;
                break;      
            }
        }

        if (posicion != -1) {
            System.out.println("Encontrado en posición " + posicion);
        } else {
            System.out.println("No encontrado");
            sc.close();
        }
    }
}
