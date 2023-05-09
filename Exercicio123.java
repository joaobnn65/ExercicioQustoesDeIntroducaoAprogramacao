
package exercicio.pkg12.pkg3;

import java.util.Scanner;


public class Exercicio123 {

    public static void Vogail(char vogal){
      if(vogal== 'a' || vogal== 'e' || vogal=='i'|| vogal=='o'||vogal=='u'){
          System.out.println("1");
          System.out.println("E uma vogal");
    }
      else{
          System.out.println("0");
          System.out.println("nao e uma vogal");
    }
    }
    
    
    
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char vogal;
        
        
        System.out.print("Digite seu caracter:");
        vogal = input.nextLine().toLowerCase().charAt(0);
        
        
        Vogail(vogal);
    }
    
}
