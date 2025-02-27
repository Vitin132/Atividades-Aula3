

package Atividades3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class VerificadorEmail {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Digite o seu email");
        String email = teclado.nextLine();
        
        if (email.contains("@") && email.endsWith(".com")){
            
            System.out.println("O email é válido!");
        }else{
            
            System.out.println("O email é inválido!");
        }
        
        
    }
    
    
}
