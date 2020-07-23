package program;

public class salario {

	protected String nome;
	protected double salario;
	
	public salario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	@Override
	public String toString() {
		return "Nome:"
				+nome
				+","
				+"Salario:"
				+salario;
	}

	
	
}
