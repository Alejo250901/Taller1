import java.util.Scanner;
public class Punto10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el año: ");
        int anio = sc.nextInt();

        boolean bisiesto = (anio % 4 == 0) && (anio % 100 != 0 || anio % 400 == 0);

        if (bisiesto) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
        System.out.print("Ingrese el día (1 a 7): ");
        int dia = sc.nextInt();
        String nombreDia = "";

        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                System.out.println("Número fuera de rango");
        }
        System.out.println("El día de la semana es: " + nombreDia);
        sc.close();
    }
}
