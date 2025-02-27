

package Atividades3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Promoção {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Digite o seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.println("Qual o seu gênero?");
        String genero = teclado.nextLine();
        
        System.out.println("Qual o valor da compra?");
        double valor = teclado.nextDouble();
        
        System.out.print("Digite o percentual de desconto: "); 
        double percentual = teclado.nextDouble(); 
   
        
        double desconto = valor*(percentual/100);
        
        double valorFinal = valor - desconto;
        
        
        System.out.println("O valor final ficou: "+valorFinal);
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
}
