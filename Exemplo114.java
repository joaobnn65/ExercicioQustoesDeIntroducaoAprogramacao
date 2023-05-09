
package exemplo11.pkg4;

import java.util.Scanner;


public class Exemplo114 {

    public static double Calculovalor(double valor){
        return  Math.sqrt(valor);
    }
    
    
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor,raizvalor;
        
        System.out.print("Digite seu numero:");
        valor = Double.valueOf(input.nextLine());
        
        
        raizvalor = Calculovalor(valor);
        
        if(valor<0){
            System.out.println("Inimaginário");
        }
        else{
            System.out.println("Sua raiz e:"+raizvalor);
        }
        
        
    }
    
}
