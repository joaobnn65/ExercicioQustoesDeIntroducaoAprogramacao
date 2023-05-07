
package exercio.pkg2.pkgdo.e.pkgwhile;

import java.util.Scanner;


public class Exercio2DoEWhile {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String NomeCliente;
        int diarias;
        double conta,contatotal=0;
        
        System.out.print("Digite o nome do Hospede: ");
        NomeCliente = input.nextLine();
        while (NomeCliente.equalsIgnoreCase ("Fim")==false){
        System.out.print("Digite a quantidade  de diarias: ");
        diarias = Integer.valueOf(input.nextLine());
        
        if(diarias<=5){
            conta = diarias * 95;}
        else {
            if(diarias<=10){
                conta = diarias * 90.50;
            }
            else {
                conta = diarias * 82;
            }            
        } 
        contatotal = contatotal + conta;
        System.out.println("Nome do cliente: "+NomeCliente);  
        System.out.println("Valor da conta: "+conta);
        System.out.print("Digite o nome do Hospede: ");
        NomeCliente = input.nextLine();
    }
        System.out.println("Conta Total:"+contatotal);
    }
}
