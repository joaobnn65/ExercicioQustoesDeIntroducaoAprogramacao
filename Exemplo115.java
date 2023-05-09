
package exemplo11.pkg5;

import java.util.Scanner;


public class Exemplo115 {

public static double Calculoarit (double nota1,double nota2,double nota3){  
    return ((nota1 + nota2+ nota3)/3);
}  
public static double CalculoPond (double nota1,double nota2, double nota3){
    return ((nota1 * 1 + nota2 * 2 + nota3 * 2) /(1+2+2));
}    
public static double CalculoGeome (double nota1, double nota2, double nota3){
    return Math.cbrt(nota1 * nota2 * nota3);
}   

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1,nota2,nota3,calculodaarit,calculodapond,calculodageome,tiponotaa,calculogeral,calculo = 0;
        char tiponota,Arit,Ponde,Geome;
        
        
        
        System.out.print("Digite sua nota1:");
        nota1 = Double.valueOf(input.nextLine());
        System.out.print("Digite sua nota2:");
        nota2 = Double.valueOf(input.nextLine());
        System.out.print("Digite sua nota3:");
        nota3 = Double.valueOf(input.nextLine());
        System.out.println("Escolha qual o tipo de media desejada(A-aritmetica,P-ponderada,G-geometrica");
        tiponota = input.nextLine().charAt(0);
        
        calculodaarit = Calculoarit(nota1,nota2,nota3);
        calculodapond = CalculoPond(nota1,nota2,nota3);
        calculodageome = CalculoGeome(nota1,nota2,nota3);
        
        switch(tiponota){
            case 'A': calculo = calculodaarit;
            System.out.println("Media e:"+calculo);
            break;
            case 'P': calculo = calculodapond;
            System.out.println("Media e:"+calculo);
            break;
            default : calculo = calculodageome;
            System.out.println("Media e:"+calculo);
        }
    }
    
}
