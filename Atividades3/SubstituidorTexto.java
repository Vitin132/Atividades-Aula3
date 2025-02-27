


package Atividades3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class SubstituidorTexto {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Digite uma frase em que a palavra Java esteja presente: ");
        String frase = teclado.nextLine();
        
        
        String novaFrase = frase.replace("Java", "programação");
        
        System.out.println(novaFrase);
        
        
    }
    
}
