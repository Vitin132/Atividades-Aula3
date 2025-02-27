

package Atividades3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class VerificadorVogais {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite uma palavra ou frase");
        String vogais = teclado.nextLine();
        
        if (vogais.contains("a") || vogais.contains("e") || vogais.contains("i") || vogais.contains("o") || vogais.contains("u")){
            
            System.out.println("Contém vogal!");
        }else{
            
            System.out.println("Não contém vogal!");
            
        }
        
        
    }

}
