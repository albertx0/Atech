import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int numLinhas, numColunas;
		
		System.out.println("Informe o numero de linhas:");
		numLinhas = input.nextInt();

		System.out.println("Informe o numero de colunas:");
		numColunas = input.nextInt();
		
		int[][] matriz = new int[numLinhas][numColunas];
		
		Solve res = new Solve(matriz, numLinhas, numColunas);
		System.out.println("Informe os elementos da matriz:");
		for(int i = 0; i < numLinhas; i++){
			for(int j = 0; j < numColunas; j++){
				matriz[i][j] = input.nextInt();
			}
		}
		System.out.println("Maior retangulo: " + res.resolver());
	}
}
