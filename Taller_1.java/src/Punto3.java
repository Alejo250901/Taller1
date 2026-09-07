import java.util.Scanner;
public class Punto3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

System.out.println("Ingrese la base del rectángulo: "); 
double base = sc.nextDouble();

System.out.println("Ingrese la altura del rectángulo: "); 
double altura = sc.nextDouble();

System.out.println("Ingrese el radio: "); 
double radio = sc.nextDouble();
double AreaRectangulo = base * altura;
double perimetroRectangulo = 2 * (base + altura);
double areaCirculo = (Math.PI * radio * radio); 
double perimetroCirculo = 2 * Math.PI * radio;
System.out.printf("El área del rectángulo es: %.2f%n", AreaRectangulo); 
System.out.printf("El perímetro del rectángulo es: %.2f%n", perimetroRectangulo); 
System.out.printf("El área del círculo es: %.2f%n", areaCirculo); 
System.out.printf("El perímetro del círculo es: %.2f%n", perimetroCirculo);
sc.close();
    
    }
}
