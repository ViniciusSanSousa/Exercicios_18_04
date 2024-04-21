package aula_18_04;
import java.util.Scanner;
import java.util.Random;

public class Exec_jogo {
    public static void main(String[] args) {
        
        int numero=0, random=0,cont=1;
        
        Scanner objscan =new Scanner(System.in);
        
        Random objran = new Random();
        random = objran.nextInt(10);
        
        System.out.println("random"+random);
        
        System.out.println("Informe um numero para jogar: ");
        numero = objscan.nextInt();
        
        while (cont < 9){
            cont++;
            if(numero == random){
                System.out.println("Voce acertou o numero:");
                break;
            }
            else if(numero < random){
                System.out.println("o numero que voce digitou e menor: ");
            }
            else {
                
                System.out.println("O numero que voce digitou e maior: ");
            }
            
            random = objran.nextInt(10);
            System.out.println("random "+random);
            
            System.out.println("Informe um numero para jogar: ");
            numero = objscan.nextInt();
            
        }
        
        
    }
}
