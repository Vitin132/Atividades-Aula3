

package Atividades3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ComparadorPalavras {

    
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String palavra1 = teclado.nextLine();
        
        
        System.out.println("Digite outra palavra");
        String palavra2 = teclado.nextLine();
        
        if(palavra1.equalsIgnoreCase(palavra2)) {
            
            System.out.println("A primeira palavra é igual à segunda!");
            
        }
                
        
    }
}
