// Implemente um programa que solicite ao usuario uma matriz quadrada de inteiros A nxn,
//com 1 <= n <= 150 e exiba os elementos da diagonal principal e secundaria de A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da matriz (n): ");
        int n = scanner.nextInt();

        if (n < 1 || n > 150) {
            System.out.println("O tamanho da matriz deve ser entre 1 e 150.");
            return;
        }

        int[][] matriz = new int[n][n];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Diagonal Principal:");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println("\nDiagonal Secundária:");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][n - 1 - i] + " ");
        }
    }
}
