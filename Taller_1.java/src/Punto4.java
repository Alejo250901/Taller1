import java.util.Scanner;
public class Punto4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Minutos del viaje: ");
        int minutos = sc.nextInt();

        int segundosTotales = minutos * 60;

        int horas = minutos / 60;           
        int minutosRestantes = minutos % 60;           
        int segundosRestantes = segundosTotales % 60; 

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutosRestantes);
        System.out.println("Segundos: " + segundosRestantes);
        System.out.println("Total de segundos: " + segundosTotales);
    sc.close();
    }
}