
package exemplo.aula.pkgif.pkgelse;

import java.util.Scanner;


public class ExemploAulaIfElse {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite seu nome:");
        String nome = input.nextLine();
        System.out.print("Digite sua idade:");
        int idade = Integer.valueOf(input.nextLine());
        
        if (idade>=18) {
                System.out.println(nome + " voce e de maior:");
        }
        else {
            System.out.println(nome +" voce não e maior de idade");
        }
        
        
    }
    
}
