
package q01;

import java.util.Scanner;


public class SomaDeVetores {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A[] = new int[10];
        int B[] = new int[10];
        
        int C[] = new int[10];
        int soma = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("digite um valor inteiro para a posição " + i + " do vetor A");
            A[i] = s.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("digite um valor inteiro para a posição " + i + " do vetor B");
            B[i] = s.nextInt();
        }
        System.out.println("---------------------"); 
        for (int i = 0; i < 10; i++) {
            System.out.println(A[i]);
            soma = soma + A[i];
        }
        
        System.out.println("soma do vetor A " + soma);
        
        for (int i = 0; i < 10; i++) {
            C[i] = A[i] + B[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("soma de A + B " + C[i]);
        }
        
    }
}
