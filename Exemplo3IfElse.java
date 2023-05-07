
package exemplo.pkg3.pkgif.pkgelse;

import java.util.Scanner;


public class Exemplo3IfElse {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float conta, contaJuros;
        
        System.out.print("Digite o valor da sua conta:");
        conta = Float.valueOf(input.nextLine());
        
        if (conta <= 50){
            contaJuros = conta + 20;
        }
        else contaJuros = conta + 40;
        System.out.println("valor da sua conta e de :" + contaJuros);
    }
    
        
}
