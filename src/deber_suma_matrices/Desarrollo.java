
package deber_suma_matrices;

import java.util.Scanner;

public class Desarrollo {
    static Scanner entrada = new Scanner(System.in);
        private int numero_uno[][];
        private int numero_dos[][];
        private int numero_resultante[][];
        
        public Desarrollo(int i, int j){
                numero_uno = new int [i][j];
                numero_dos = new int [i][j];
                numero_resultante = new int [i][j];
                
        }
        public void llenarUno(){
            for (int i = 0; i < numero_uno.length; i++) {
                for (int j = 0; j < numero_uno[i].length; j++) {
                    System.out.print("Digite un numero: ");
                    numero_uno[i][j] = entrada.nextInt();
                    
                }  
            }

        }
        public void llenarDos(){
             for (int i = 0; i < numero_dos.length; i++) {
                for (int j = 0; j < numero_dos[i].length; j++) {
                    System.out.print("Digite un numero: ");
                    numero_dos[i][j] = entrada.nextInt();
                    
                }  
            }
        }
        public void resultante(){
             for (int i = 0; i < numero_resultante.length; i++) {
                for (int j = 0; j < numero_resultante[i].length; j++) {
                    numero_resultante[i][j] = numero_uno[i][j] + numero_dos[i][j]; 
                }  
            }
        }
        public void mostrarMatrizUno(){
            System.out.println("La Matriz Uno es:");
            for (int i = 0; i < numero_uno.length; i++) {
                for (int j = 0; j < numero_uno[i].length; j++) {
                    System.out.print(" "+numero_uno[i][j]);
                    
                }
                System.out.println("");
            }
        }
        public void mostraMatrizDos(){
            System.out.println("La Matriz Dos es: ");
             for (int i = 0; i < numero_dos.length; i++) {
                for (int j = 0; j < numero_dos[i].length; j++) {
                    System.out.print(" "+numero_dos[i][j]);
                    
                }
                System.out.println("");
            }
        
        }
        public void mostrarMatrizTotal(){
            System.out.println("La Suma De La Matrices Es: ");
            for (int i = 0; i < numero_resultante.length; i++) {
                for (int j = 0; j < numero_resultante[i].length; j++) {
                    System.out.print(" "+numero_resultante[i][j]);
                    
                }
                System.out.println(" ");
            }
        }
    
}
