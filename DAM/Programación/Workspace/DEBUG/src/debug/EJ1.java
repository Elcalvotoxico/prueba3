package debug;


public class EJ1 {
	public static void main(String[] args) {
        int[][] matriz = new int[5][3];
        llenarMatriz(matriz);
        imprimirMatriz(matriz);
        multiplicarColumnas(matriz);
    }

    public static void llenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i + 1) * (j + 1); // Llenamos con valores simples
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz original:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.printf("%4d", valor);
            }
            System.out.println();
        }
    }

    public static void multiplicarColumnas(int[][] matriz) {
        System.out.println("\nProducto de cada columna:");
        for (int j = 0; j < matriz[0].length; j++) {
            int producto = 1;
            for (int i = 0; i < matriz.length; i++) {
                producto *= matriz[i][j];
            }
            // Mostrar el resultado directamente sin usar un array
            System.out.println("Columna " + j + ": " + producto);
        }


}
}