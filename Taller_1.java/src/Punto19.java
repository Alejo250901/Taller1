import java.util.Scanner;
public class Punto19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] ventas = new int[4][3];   

    
        for (int sucursal = 1; sucursal < 5; sucursal++) {
            for (int producto = 1; producto < 4; producto++) {
                System.out.print("Ingrese las ventas para la sucursal " + sucursal + " y el producto " + producto + ": ");
                ventas[sucursal - 1][producto - 1] = sc.nextInt();
            }
        }

    
        for (int sucursal = 1; sucursal < 5; sucursal++) {
            int totalSucursal = 0;
            for (int producto = 1; producto < 4; producto++) {
                totalSucursal += ventas[sucursal - 1][producto - 1];
            }
            System.out.println("Sucursal " + sucursal + ": " + totalSucursal);
        }

        
        for (int producto = 1; producto < 4; producto++) {
            int totalProducto = 0;
            for (int sucursal = 1; sucursal < 5; sucursal++) {
                totalProducto += ventas[sucursal - 1][producto - 1];
            }
            System.out.println("Producto " + producto + ": " + totalProducto);
        }

        
        int maxVenta = ventas[0][0];
        int sucMax = 0, prodMax = 0;

        for (int sucursal = 1; sucursal < 5; sucursal++) {
            for (int producto = 1; producto < 4; producto++) {
                if (ventas[sucursal - 1][producto - 1] > maxVenta) {
                    maxVenta = ventas[sucursal - 1][producto - 1];
                    sucMax = sucursal;
                    prodMax = producto;
                }
            }
        }

        System.out.println("Venta más alta: " + maxVenta);
        System.out.println("Sucursal: " + sucMax);
        System.out.println("Producto: " + prodMax);
        sc.close();
    }
}