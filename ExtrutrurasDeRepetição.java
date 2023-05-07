
package extrutruras.de.repetição;

import java.util.Scanner;


public class ExtrutrurasDeRepetição {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidade;
        double preco,valor;
        String produto;
        
        
        for(int i=0;i<5;i++){
        System.out.print("Digite seu produot:");
        produto = input.nextLine();
        System.out.print("Digite a qauntidade de vendas:");
        quantidade = Integer.valueOf(input.nextLine());
        System.out.print("Digite o preco:");
        preco = Double.valueOf(input.nextLine());
        
        
        valor = quantidade * preco;
        
        System.out.println("Valor arrecado com "+ produto+ " no mes e:"+valor);
        
        
        }   
    }
    
}
