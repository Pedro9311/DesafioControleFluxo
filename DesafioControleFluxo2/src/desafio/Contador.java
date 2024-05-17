package desafio;

import java.util.Scanner;

public class Contador {
	
	static void contar(int primeiroNum, int segundoNum) throws ParametrosInvalidosException{
		if (primeiroNum > segundoNum){
			throw new ParametrosInvalidosException();
		}else {
			int contagem = segundoNum - primeiroNum;
			for (int i = 1; i <= contagem; i++) {
				System.out.println("Imprimindo o número " + i);
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int primeiroNum, segundoNum;
		System.out.println("Digite o primeiro número: ");
		primeiroNum = input.nextInt();
		System.out.println("Digite o segundo número: ");
		segundoNum = input.nextInt();
		
		try {
			contar(primeiroNum, segundoNum);
		}catch(ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
	}
}
