
package aula1.exercicio2switchcase;

import java.util.Scanner;


public class Aula1Exercicio2SwitchCase {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double numero1, numero2, resultado;
       char operaçao;
       
       
        System.out.print("Digite seu numero 1:");
        numero1 = Double.valueOf(input.nextLine());
        System.out.print("Digite seu numero 2:");
        numero2 = Double.valueOf(input.nextLine());
        System.out.print("Digite qual operção desaja realizar +,-,*,/:");
        operaçao = input.nextLine(). charAt (0);
        
        switch (operaçao){
            case '+' : resultado = numero1 + numero2;
                break;
            case '-' : resultado = numero1 - numero2; 
                break;
            case '*' : resultado = numero1 * numero2;
                break;
            case '/' : resultado = numero1 / numero2;
                break;
            default : System.out.println("Operador invalido");
                resultado = 0;
        }
        System.out.println("Resutlado da su operaçao e:" + resultado);
       
        
        
        
        
    }
    
}
