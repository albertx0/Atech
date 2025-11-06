import java.util.ArrayDeque;
public class Solve{
	int[][] matriz;
    int numLinhas, numColunas;

    public Solve(int[][] matriz, int numLinhas, int numColunas) {
        this.matriz = matriz;
        this.numLinhas = numLinhas;
        this.numColunas = numColunas;
    }

    public int resolver() {
        int[] altura = new int[numColunas];
        int maxArea = 0;

        for (int i = 0; i < numLinhas; i++) {
            // atualizando o histograma para a linha atual
            for (int j = 0; j < numColunas; j++) {
                if (matriz[i][j] == 1)
                    altura[j] += 1;
                else
                    altura[j] = 0;
            }

            // calcula a maior area no histograma atual
            maxArea = Math.max(maxArea, maiorAreaNoHistograma(altura));
        }

        return maxArea;
    }

    private int maiorAreaNoHistograma(int[] H) {
        int n = H.length;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            int h = (i == n) ? 0 : H[i];
            while (!stack.isEmpty() && h < H[stack.peek()]) {
                int altura = H[stack.pop()];
                int largura = stack.isEmpty() ? i : (i - stack.peek() - 1);
                maxArea = Math.max(maxArea, altura * largura);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
