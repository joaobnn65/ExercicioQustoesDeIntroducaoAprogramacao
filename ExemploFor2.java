
package exemplo.pkgfor.pkg2;

import java.util.Scanner;


public class ExemploFor2 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero,quadrado,n,contpositivo=0,contnegativo=0,soma = 0;
        
        System.out.print("Quantos numero voce quer elevar ao quadrado:");
        n = Integer.valueOf(input.nextLine());
        for(int i=0;i<n;i++){
        System.out.print("Digite seu numnero:");
        numero = Integer.valueOf(input.nextLine());
        
        quadrado = numero * numero;
        
        System.out.println("Resultado e :" + quadrado);
        if(numero>=0){
            contpositivo= contpositivo + 1;
        }
        else{
            contnegativo = contnegativo + 1;
        }
        soma = soma + numero;
    }
        System.out.println("Numero de valores positivos:"+contpositivo);
        System.out.println("Numero de valores negativos:"+contnegativo);
        System.out.println("Soma dos numero e:"+soma);
    }
}
