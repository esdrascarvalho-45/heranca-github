package program;

public class bonificacao extends salario{

	public bonificacao(String nome, double salario) {
		super(nome, salario);
		
	}
       
	
	public void somar(double salario) {
		
		double s= salario +100.0;
		System.out.println("Nome:"+nome+ ","+ " salario + bónus:"+s);
	}


	
	   


	
}
