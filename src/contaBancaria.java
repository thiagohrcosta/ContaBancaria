
public class contaBancaria {
	
	private int conta;
	private double valorDeposito;
	public String nomeTitular;
	
	
	public contaBancaria(int conta, double valorDeposito, String nomeTitular) {
		super();
		this.conta = conta;
		this.valorDeposito = valorDeposito;
		this.nomeTitular = nomeTitular;
	}


	public int getConta() {
		return conta;
	}


	public void setConta(int conta) {
		this.conta = conta;
	}


	public double getValorDeposito() {
		return valorDeposito;
	}


	public void setValorDeposito(double valorDeposito) {
		this.valorDeposito = valorDeposito;
	}
	
	

}
