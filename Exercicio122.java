
package exercicio.pkg12.pkg2;

import java.util.Scanner;


public class Exercicio122 {

    public static void Meses(int numero){
             switch(numero){
                case 1 : 
                        System.out.println("Janeiro");
                        break;
                case 2 : 
                        System.out.println("Fevereiro");
                        break;
                case 3 : 
                        System.out.println("Marco");
                        break;
                case 4 :
                    System.out.println("Abril");
                        break;
                case 5 :
                    System.out.println("Maio");
                        break;
                case 6 : 
                    System.out.println("Junho");
                        break;
    
                default :
                        System.out.println("Mes invalido");
            }
            
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  numero,mes;
        
        System.out.println("Digite seu numero de 1 a 6:");
        numero = Integer.valueOf(input.nextLine());
        
        Meses(numero);
        
    }
    
}
