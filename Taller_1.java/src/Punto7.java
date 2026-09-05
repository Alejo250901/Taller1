import java.util.Scanner;
public class Punto7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su peso por favor: ");
        double peso = sc.nextDouble();
        System.out.println("Ingrese su altura por favor: ");
        double altura = sc.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("Su IMC es: " + imc);
        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }
    sc.close();    
    }
    
}

