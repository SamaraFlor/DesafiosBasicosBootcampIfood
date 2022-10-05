/*
Descri��o
Neste desafio, receba um n�mero inteiro N, 
calcule e imprima o somat�rio de todos os n�meros de N at� 0.
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
     * M�todo �til que calcula o somat�rio de um n�mero usando recursividade.
     */
    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}