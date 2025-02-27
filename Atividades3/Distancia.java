

package Atividades3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Distancia {
    
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Quantos Km você quer percorrer? ");
        double Km = teclado.nextDouble();
        
        
        if (Km <= 200) {
            
            double valor1 = Km * 0.20;
            System.out.println("O preço da passagem ficou: "+valor1);
            
        }else if (Km > 200) {
            
            double valor1 = Km * 0.45;
            System.out.println("O preço da passagem ficou: "+valor1);
        }
        
        
        
        
        
    }

}
