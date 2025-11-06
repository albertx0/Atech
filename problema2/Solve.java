import java.util.Stack;

public class Solve {
	Stack<Integer> pilha = new Stack<>();
	
	// funcao para verificar se eh balanceado
	// retorna 1 caso seja 
	// retorna 0 caso nao seja

	public int ehBalanceado(String expressao){
		boolean res = true;
		for(int i = 0; i < expressao.length(); i++){
			Character ch = expressao.charAt(i);
			if(ch.equals('('))
				pilha.push(1);
			else if(ch.equals(')')){
				if(pilha.isEmpty())
					res = false;
				else
					pilha.pop();
			}
		}

		res = (res && pilha.isEmpty());
		
		if(res) return 1;
		return 0;
	}
}
