package aula_18_04;


public class Calc_Random {
    
    int numero, cont = 0,random;
    String message;
    
    public void getValues(int numero, int random){
        this.numero = numero;
        this.random = random;
    }
    
    public String Messagem(){

            if(numero > random){
                        message = "O nemero que voce digitou e maior";
                    }

            else if(numero < random){
                         message = "O nemero que voce digitou e menor";
                    }   
             else  {
                 
                message="Voce acertou o numero";
            }
            
                
            
        return message;
        
    
    }
    
    
}
