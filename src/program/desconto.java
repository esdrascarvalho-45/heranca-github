package program;

public class desconto extends bonificacao {

	public desconto(String nome, double salario) {
		super(nome, salario);

	}

	@Override
	public void somar(double salario) {

		double s = salario - 50.0;
		System.out.println("Nome:" + nome + "," + " salario + desconto:" + s);
	}

}
