

package Atividades3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class VerificadorNome {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        String nome = teclado.nextLine();
        
        if (nome.length()>5){
            System.out.println("Seu nome possui 5 ou mais caracteres!");
            
        }
        
    }

}
