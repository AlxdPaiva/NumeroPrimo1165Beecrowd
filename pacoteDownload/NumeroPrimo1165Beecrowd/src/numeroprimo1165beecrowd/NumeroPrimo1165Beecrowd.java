/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroprimo1165beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class NumeroPrimo1165Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int N = teclado.nextInt();        
        
        for (int i = 1; i <= N; i++) {
            int X = teclado.nextInt();
            int somaDiv = 0;
            for (int c = 1; c <= X; c++)
                if (X % c == 0) {
                    somaDiv++;
                }
            if (somaDiv != 2) {
                System.out.println(X + " nao eh primo");
            } else {
                System.out.println(X + " eh primo");
            }
        }
    }
    
}
