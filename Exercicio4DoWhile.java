
package exercicio.pkg4.pkgdo.pkgwhile;

import java.util.Scanner;


public class Exercicio4DoWhile {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int titulo,voto,cont1=0,cont2=0,cont3=0,cont4=0;
        char confirma;
        
        System.out.print("Digite o numero do seu titulo de Eleitor: ");
        titulo = Integer.valueOf(input.nextLine());
        while(titulo!=0){
            do{
            System.out.print("Digite o numero do seu candito: ");
            voto = Integer.valueOf(input.nextLine());
            switch(voto){
                case 1: System.out.println("Voce votou no Joao!");
                break;
                case 2:System.out.println("Voce votou na Maria!");
                break;
                case 3: System.out.println("Voce votou no Jose!");
                break;
                default : System.out.println("Voto nulo!");
            }
            System.out.print("Confirma seu voto(S/N)");
            confirma = input.nextLine().charAt(0);
            }while (confirma=='N');
            
            switch(voto){
                case 1: cont1 = cont1 + 1;
                break;
                case 2: cont2 = cont2 + 1;
                break;
                case 3: cont3 = cont3 + 1;
                break;
                default : cont4 = cont4 + 1;
            }
            
        System.out.print("Digite o numero do seu titulo de Eleitor: ");
        titulo = Integer.valueOf(input.nextLine());
        }
        System.out.println("Resultado da eleicao.");
        System.out.println("Joao recebeu: "+cont1+ " votos");
        System.out.println("Maria recebeu: "+cont2+ " votos");
        System.out.println("Jose recebeu: "+cont3+ " votos");
        System.out.println("Votos nulos: "+cont4);
    }
}
