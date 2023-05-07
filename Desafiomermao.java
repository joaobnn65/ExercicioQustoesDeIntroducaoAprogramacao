
package desafiomermao;

import java.util.Scanner;


public class Desafiomermao {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite seu numero inteiro em segundos:");
        int numerointeiro =Integer.valueOf(input.nextLine());
        
        int segundoshoras = numerointeiro / 3600;
        int restohoras = numerointeiro % 3600;
        int restominutos = restohoras / 60;
        int restosegundo = restohoras % 60;
        
        System.out.println("A medida convertida h" + segundoshoras + "m" + restominutos + "s" + restosegundo);
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
