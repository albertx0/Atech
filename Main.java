import java.util.Stack;
import java.util.Scanner;  

public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Solve solve = new Solve();		

		System.out.println("Informe a expressao:");
		String expressao = input.nextLine();

		System.out.println("Retorno: " + solve.ehBalanceado(expressao));
	}
}
