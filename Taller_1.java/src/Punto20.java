import java.util.Scanner;

public class Punto20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] tablero = new char[4][4];

        
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                tablero[i][j] = ' ';
            }
        }

        int turno = 1; 
        boolean hayGanador = false;
        boolean tableroLleno = false;
        char simbolo = ' ';
        int fila = -1;
        int columna = -1;

        while (!hayGanador && !tableroLleno) {
            simbolo = (turno == 1) ? 'X' : 'O';

            
            for (int i = 1; i < 4; i++) {
                for (int j = 1; j < 4; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Turno del jugador " + simbolo);

            boolean celdaValida = false;
            while (!celdaValida) {
                System.out.print("Ingrese la fila (1-3): ");
                fila = sc.nextInt();
                System.out.print("Ingrese la columna (1-3): ");
                columna = sc.nextInt();

                if (fila >= 1 && fila <= 3 && columna >= 1 && columna <= 3 && tablero[fila][columna] == ' ') {
                    celdaValida = true;
                } else {
                    System.out.println("Celda inválida, intenta de nuevo");
                }
            }

            tablero[fila][columna] = simbolo;
            hayGanador = verificarGanador(tablero, simbolo);

            tableroLleno = true;
            for (int i = 1; i < 4; i++) {
                for (int j = 1; j < 4; j++) {
                    if (tablero[i][j] == ' ') {
                        tableroLleno = false;
                        break;
                    }
                }
                if (!tableroLleno) {
                    break;
                }
            }

            if (!hayGanador) {
                turno = (turno == 1) ? 2 : 1; 
            }
        }

        // Mostrar tablero final
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }

        if (hayGanador) {
            System.out.println("Ganó el jugador " + simbolo);
        } else {
            System.out.println("Empate");
        }

        sc.close();
    }

    public static boolean verificarGanador(char[][] tablero, char simbolo) {
        
        for (int i = 1; i < 4; i++) {
            if (tablero[i][1] == simbolo && tablero[i][2] == simbolo && tablero[i][3] == simbolo) {
                return true;
            }
        }

    
        for (int j = 1; j < 4; j++) {
            if (tablero[1][j] == simbolo && tablero[2][j] == simbolo && tablero[3][j] == simbolo) {
                return true;
            }
        }

    
        if (tablero[1][1] == simbolo && tablero[2][2] == simbolo && tablero[3][3] == simbolo) {
            return true;
        }
        if (tablero[1][3] == simbolo && tablero[2][2] == simbolo && tablero[3][1] == simbolo) {
            return true;
        }

        return false;
        
    }
    
}