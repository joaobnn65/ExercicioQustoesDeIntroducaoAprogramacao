
package exemplo11.pkg3;

import java.util.Scanner;


public class Exemplo113 {
    public static double Calculovalor1(double v1){
       return (v1 * 2); 
    }
    public static double Calculovalor2(double v2){
       return (v2 * 2); 
    }
    public static double Calculovalor3(double v3){
        return (v3 *2);
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor1,valor2,valor3,calculo1,calculo2,calculo3;
        System.out.println("Digite seu primeiro valor:");
        valor1 = Double.valueOf(input.nextLine());
        System.out.println("Digite seu segundo valor:");
        valor2 = Double.valueOf(input.nextLine());
        System.out.println("Digite seu terceiro valor:");
        valor3 = Double.valueOf(input.nextLine());
        
        calculo1 = Calculovalor1(valor1);
        calculo2 = Calculovalor2(valor2);
        calculo3 = Calculovalor3(valor3);
        
        
        System.out.println("Dobro do valor 1 e:"+calculo1);
        System.out.println("Dobro do valor 2 e:"+calculo2);
        System.out.println("Dobro do valor 3 e:"+calculo3);
        
        
        
    }

    }


