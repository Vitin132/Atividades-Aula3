

package Atividades3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class calculoMedia {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Qual o nome do aluno?");
        String nome = teclado.nextLine();
        
        System.out.println("Qual a 1ª nota?");
        double nota1 = teclado.nextDouble();
        
        System.out.println("Qual a 2ª nota?");
        double nota2 = teclado.nextDouble();
        
        
        double media = (nota1 + nota2)/2;
        
        if (media <= 4.9) {
            
            System.out.println("Você foi reprovado!");
            
        }else if(media >= 5 && media <= 6.9) {
            
            System.out.println("Você ficou de recuperação!");
            
            
            
        }else if(media >= 7){
            
            System.out.println("Você foi aprovado!");
            
        }
        
        
    }
    
    
}
