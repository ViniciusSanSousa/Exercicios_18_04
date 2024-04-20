package aula_18_04;
import java.util.Scanner;
import java.util.Random;

public class Exec_jogo {
    public static void main(String[] args) {
        
        int numero=0, random=0,cont=0;
        
        Scanner objscan =new Scanner(System.in);
        
        Random objran = new Random();
        random = objran.nextInt(10);
        
        System.out.println("Insira um numero para jogar:");
        numero = objscan.nextInt();
        
        Calc_Random objrandom = new Calc_Random();
        
        objrandom.getValues(numero, random);
        
        System.out.println(random);
        
        while(cont <= 10){
            
            objrandom.getValues(numero, random);
            System.out.println(objrandom.Messagem());
            cont++;
            
            
            System.out.println("Insira outro numero para jogar:");
            numero = objscan.nextInt();
            
            if(numero == random){
                     cont =11;
                }
            
        }
       
        System.out.println(objrandom.Messagem());
    }
    
}
