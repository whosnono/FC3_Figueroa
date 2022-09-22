//Figueroa Hernández Sofia Belem
package Recursividad;

import java.util.Scanner;


public class Fibonacci {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        System.out.println("Teclee el número hasta el que quiere llegar: ");
        int n = en.nextInt();
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + ", ");
        }
        System.out.println(" ");
        System.out.println(" ");
    }
    
    public static int fibonacci(int n){ //n = numero de iteraciones
        
        if(n == 0 || n == 1){
            return n;
        } else
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
