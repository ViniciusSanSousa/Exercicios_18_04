package aula_18_04;

public class Calc_Cine_notas {
 
    double idade, nota = 0, soma=0, media, qtdpessoas, count;
    String opcao;
    
    public void getValues(double idade,double nota,String opcao, double count){
    
        this.idade =idade;
        this.nota = nota;
        this.opcao = opcao;
        this.count = count;
    }
    
    
    
    public double SetIdadeOtima(){        
        if(nota == 3){
            soma = soma +idade;
            
        }
        
        media = soma /count;
        
        return media;
    }
    
    public double QtdPessoasRegular(){
        if(nota ==1){
            
            qtdpessoas++;
        }
        return qtdpessoas;
    }
    
    
      
    
}
