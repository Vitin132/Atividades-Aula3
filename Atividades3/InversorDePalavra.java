

package Atividades3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class InversorDePalavra {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        
        
        System.out.println("Digite uma palavra");
        String palavra = teclado.nextLine();
        
        String inverso = new StringBuilder(palavra).reverse().toString();
        
        System.out.println(inverso);
        
    }

}
