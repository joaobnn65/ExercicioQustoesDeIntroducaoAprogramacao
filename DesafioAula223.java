
package desafio.aula.pkg22.pkg3;

import java.util.Scanner;


public class DesafioAula223 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Digite seu ano:");
        int ano = Integer.valueOf(input.nextLine());
        
        boolean divisivel;
        divisivel = ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0); //true;
        System.out.println("Seu ano e bissexto:" + divisivel);
        
        
        
        
        
        
        
        
    }
    
}
