import java.util.Scanner; 
public class Punto9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tipo de vehículo(1,2,3): ");
        int TipoVehiculo = sc.nextInt();

        System.out.println("Ingrese las horas de parqueadero: ");
        int horasAdicionales = sc.nextInt();

        int PrimeraHora;
        int HorasAdicionales;

        switch (TipoVehiculo) {
            case 1:
                // Lógica para vehículo tipo 1
                PrimeraHora = 2000;
                HorasAdicionales = 1500;
                break;
            case 2:
                // Lógica para vehículo tipo 2
                PrimeraHora = 4000;
                HorasAdicionales = 3000;
                break;
            case 3:
                // Lógica para vehículo tipo 3
                PrimeraHora = 5000;
                HorasAdicionales = 4000;
                break;
            default:
                System.out.println("Tipo de vehículo inválido");
                sc.close();
                return;
        }
        int total = PrimeraHora + (HorasAdicionales * (horasAdicionales - 1));
        System.out.println("El total a pagar es: " + total);
        sc.close();
        
        
    
}

}
