
package pkgwhile.exercicio1;

import java.util.Scanner;


public class WhileExercicio1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero,calculo;
        
        do {
        System.out.println("Digite seu numero");
        numero = Integer.valueOf(input.nextLine());
        calculo = numero * numero;
        System.out.println("Seu numero ao quadrado e :" +calculo); 
        }while (numero !=0);    
    
    }
        }




