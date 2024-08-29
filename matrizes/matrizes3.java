// Implemente um programa que solicite ao usuario uma matriz de inteiros A3x4 e exiba a sua respectiva matriz transposta

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][4];

        System.out.println("Insira os elementos da matriz 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int[][] matrizTransposta = transporMatriz(matriz);

        System.out.println("Matriz Transposta:");
        for (int i = 0; i < matrizTransposta.length; i++) {
            for (int j = 0; j < matrizTransposta[i].length; j++) {
                System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static int[][] transporMatriz(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int[][] matrizTransposta = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        return matrizTransposta;
    }
}
