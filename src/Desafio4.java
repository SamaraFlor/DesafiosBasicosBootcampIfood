import java.util.Scanner;

/*
Desafio
Neste desafio, você terá que criar uma função que faça um número como argumento e retorne "Fizz", 
"Buzz" ou "FizzBuzz". 
 */
public class Desafio4 {
	

    public static void main(String[] args) {
	 Scanner number = new Scanner(System.in);

	 System.out.println("Digite um numero");
     int num = number.nextInt();
     
     if (num % 3 == 0 && num % 5 == 0) {
         System.out.println("FizzBuzz");
     } else if (num % 3 == 0 || num % 5 == 0) {
         if (num % 3 == 0){
             System.out.println("Fizz");
         } else {
             System.out.println("Buzz");
         }
     } else {
         System.out.println(num);
     }
     
     number.close();

    }
	
   
}
