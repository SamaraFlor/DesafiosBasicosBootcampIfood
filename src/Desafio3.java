/*
Descrição
Neste desafio, receba um número inteiro N, 
calcule e imprima o somatório de todos os números de N até 0.
 */
import java.util.*;

public class Desafio3 {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        
        int num;
        
        System.out.println("Digite um valor para numero: ");
        num = numero.nextInt();
        
        System.out.println(somatorio(num));

       
    }

    /**
     * Método útil que calcula o somatório de um número usando recursividade.
     */
    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}