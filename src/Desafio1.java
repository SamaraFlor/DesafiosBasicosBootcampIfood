import java.util.*;
/*
 * Desafio
Nesse desafio, dados dois números, verifique se eles são iguais. 
Caso sejam, retorne "Sao iguais!”. Caso contrário, retorne "Nao sao iguais!” sem as aspas. 
 */
import java.util.*;

public class Desafio1 {

    public static void main(String[] args) {

        int numero1, numero2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        numero1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = entrada.nextInt();
        
        if (numero1 == numero2) {
            System.out.println("Sao iguais!");
        } else {
            System.out.println("Nao sao iguais!");   
        }       

    }
}
