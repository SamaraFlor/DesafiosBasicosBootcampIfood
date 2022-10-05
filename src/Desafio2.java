
import java.util.Scanner;

/*
 * Desafio
Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.
 */

public class Desafio2 {
    public static void main(String[] args) {
        int A, N;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero");
        A = input.nextInt();
        
        System.out.println("Digite o segundo numero");
        N = input.nextInt();
        int soma = 0;

        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
        //A saída deverá retornar o valor da soma de todos os múltiplos A até o seu limite N.
        
        for(int i = 1; i <= N; i++){
            if(i % A == 0) {
                soma += i; 
            }
        }

        System.out.println(soma);
    }
    }
