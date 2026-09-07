import java.util.Scanner;
public class Punto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius;
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("La temperatura en grados Fahrenheit es: %.2f%n", fahrenheit);
        double kelvin = celsius + 273.15;
        System.out.printf("La temperatura en grados Kelvin es: %.2f%n", kelvin);



    sc.close();
    }
    
}
