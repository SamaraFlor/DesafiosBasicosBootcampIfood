import java.util.*;
/*
 * Desafio
Nesse desafio, dados dois n�meros, verifique se eles s�o iguais. 
Caso sejam, retorne "Sao iguais!�. Caso contr�rio, retorne "Nao sao iguais!� sem as aspas. 
 */
import java.util.*;

public class Desafio1 {

    public static void main(String[] args) {

        int numero1, numero2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro n�mero: ");
        numero1 = entrada.nextInt();
        System.out.println("Digite o segundo n�mero: ");
        numero2 = entrada.nextInt();
        
        if (numero1 == numero2) {
            System.out.println("Sao iguais!");
        } else {
            System.out.println("Nao sao iguais!");   
        }       

    }
}
