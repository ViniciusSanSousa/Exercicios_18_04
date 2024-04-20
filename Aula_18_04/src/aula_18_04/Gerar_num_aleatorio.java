package aula_18_04;
import java.util.Random;

public class Gerar_num_aleatorio {
    public static void main(String[] args) {
        Random rd = new Random();
        
        int NRandomizado = rd.nextInt(10);
        
        System.out.println("O número aleatório é " + NRandomizado);
    }
}
