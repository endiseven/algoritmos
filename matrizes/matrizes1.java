// Implemente um programa que leia da entrada uma matriz m ×n de inteiros e exiba na sa´ıda a soma de todos os seus elementos.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linha = 0;
        int coluna = 0;
        int soma = 0;
        
        System.out.println("Digite as dimensões da matriz:");
        
        linha = scanner.nextInt();
        coluna = scanner.nextInt();
        
        int[][] matriz = new int[linha][coluna];

        System.out.println("Insira os elementos da matriz:");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Soma:");
        for (int i = 0; i < linha; i++ ) { 
            for (int j = 0; j < coluna; j++) {
                    soma += matriz[i][j];
            }
            
        }
        System.out.println(soma);

    }
}
