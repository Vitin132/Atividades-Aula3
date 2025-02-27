

package Atividades3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class MaiorMenor {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o 1° número");
        int numero1 = teclado.nextInt();
        
        System.out.println("Digite o 2° número ");
        int numero2  = teclado.nextInt();
        
        
        if (numero1 > numero2) {
            
            System.out.println("O 1° número é maior!");
            
            
            
        }else if (numero2 > numero1) {
            
            System.out.println("O 2° número é maior!");
            
            
        }else {
            
            System.out.println("Os números são iguais!");
            
        }
         
        
    }
    
}
