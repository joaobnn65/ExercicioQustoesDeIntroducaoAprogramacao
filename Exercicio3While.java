
package exercicio.pkg3.pkgwhile;

import java.util.Scanner;


public class Exercicio3While {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String NomeCliente,continua;
        int diarias;
        double conta,contatotal=0;
        
        
        do{
        System.out.print("Digite o nome do Hospede: ");
        NomeCliente = input.nextLine();
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
        System.out.print("Deseja cadastrar a saide de mais um Hospede(SIM/NAO): ");
        continua = input.nextLine();
    }while (continua.equalsIgnoreCase ("Sim")==true);
        System.out.println("Conta Total:"+contatotal);
    }
    
}
