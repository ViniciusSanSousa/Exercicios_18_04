package aula_18_04;
import java.util.Scanner;

public class Exec_Cine_notas {
    public static void main(String[] args) {
        
        Scanner objscan = new Scanner(System.in);
        
        double idade, nota = 0, count=0;
        String opcao="";
        
        Calc_Cine_notas objcalc = new Calc_Cine_notas();    
        
        System.out.println("Deseja fazer uma avaliacao? ");
        opcao = objscan.next();
        
        while(opcao.equalsIgnoreCase("S")){
            
            System.out.println("Informe sua idade: ");
            idade = objscan.nextDouble();
            
            System.out.println("Informe a nota: ");
            nota = objscan.nextDouble();
            
            System.out.println("Deseja inserir outra avaliação? ");
            opcao = objscan.next();
            
            if(nota==3){
                count++;
            }
            objcalc.QtdPessoasRegular();
            objcalc.SetIdadeOtima();
            objcalc.getValues(idade, nota, opcao,count);
            
            
        }
        System.out.println("Media da idade das pessoas que tem a opiniao otimo " +objcalc.SetIdadeOtima());
        System.out.println("Quantidade de pessoa que acharam regular "+objcalc.QtdPessoasRegular());
    }
    
    
}
