package program;

import java.util.Scanner;

public class entidades {

	public static void main(String[] args) {
        
		//Salario atual.
		Scanner scan = new Scanner(System.in);
		System.out.println("Nome:");
		String nome = scan.nextLine();
		System.out.println("Salario:");
		double salario = scan.nextDouble();
		salario sa = new salario(nome, salario);
		System.out.println(sa);

		System.out.println();
        //Salario com bonificação.
		scan.nextLine();
		System.out.println("Nome:");
		nome = scan.nextLine();
		System.out.println("Salario:");
		salario = scan.nextDouble();
		bonificacao bo = new bonificacao(nome, salario);
		bo.somar(salario);
		
		System.out.println();
		//salario com desconto.
		scan.nextLine();
		System.out.println("Nome:");
		nome = scan.nextLine();
		System.out.println("Salario:");
		salario = scan.nextDouble();
		desconto des = new desconto(nome, salario);
		des.somar(salario);

		

		scan.close();

	}

}
