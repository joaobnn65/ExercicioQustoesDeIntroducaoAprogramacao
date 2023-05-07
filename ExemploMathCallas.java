
package exemplo.math.callas;

import java.util.Scanner;


public class ExemploMathCallas {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valora,valorb,valorc,calculo1,calculo2,delta;
        
        
        System.out.print("Digite o valor de a:");
        valora = Double.valueOf(input.nextLine());
        System.out.print("Digite o valor de b:");
        valorb = Double.valueOf(input.nextLine());
        System.out.print("Digite o valor c:");
        valorc = Double.valueOf(input.nextLine());
        
        delta = Math.pow(valorb,2) - 4 * valora * valorc;
        calculo1 = (-valorb + Math.sqrt(delta)) / (2*valora);
        calculo2 = (-valorb - Math.sqrt(delta)) / (2*valora);
        
        System.out.println("Raiz 1: "+calculo1);
        System.out.println("Raiz 2: "+calculo2);
        
        
        
        
        
        
        
        
        
    }
    
}
