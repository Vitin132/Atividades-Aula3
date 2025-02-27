

package Atividades3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class SaudaçãoPersonalizada {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o seu nome? ");
        String nome = teclado.nextLine();
        
        System.out.println("Em qual turno você estuda?");
        String turno = teclado.nextLine();
        
        if(turno.equalsIgnoreCase("noite")){
            
            System.out.println(nome+" você estuda de noite!");
            
        }else if (turno.equalsIgnoreCase("manha")){
            
            System.out.println(nome+ " Você estuda de manhã!");
            
        }else{
            
            System.out.println(nome+" Você estuda de tarde!");
        }
        
    }

}
