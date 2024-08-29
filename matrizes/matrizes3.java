// Implemente um programa que solicite ao usuario uma matriz de inteiros A3x4 e exiba a sua respectiva matriz transposta

public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 0, 5},
            {4, 0, 3, 5},
            {0, 8, 6, 4}
        };

        int[][] matrizTransposta = transporMatriz(matriz);

        System.out.println("Matriz Transposta:");
        for (int i = 0; i < matrizTransposta.length; i++) {
            for (int j = 0; j < matrizTransposta[i].length; j++) {
                System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println();
        }
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
