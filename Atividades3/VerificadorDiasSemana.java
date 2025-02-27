

package Atividades3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class VerificadorDiasSemana {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um dia da semana: ");
        String dia = teclado.nextLine();
        
        if (dia.equals("sabado")){
            
            System.out.println("Fim de semana!");
            
        }else if (dia.equals("domingo")){
            
            System.out.println("Fim de semana!");
            
        }else {
            
            System.out.println("Dia útil");
            
        }
        
        
    }
    
}
