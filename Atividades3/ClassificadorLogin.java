

package Atividades3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ClassificadorLogin {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Qual o seu nome de usuário?");
        String user = teclado.nextLine();
        
        if(user.length() >= 6 && !user.contains(" ")){
            
            System.out.println("O login é válido!");
            
        }else{
            
            System.out.println("O login é inválido!");
        }
        
    }
    
}
