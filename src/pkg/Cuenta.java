package pkg;

public class Cuenta {
	
	String numero, titular;
	Double saldo;
	

	public Cuenta(int i) {
		// TODO Auto-generated constructor stub
	}


	public void ingresar(Double i) {
		setSaldo(i);
		
	}


	public void retirar(Double i) {
		setSaldo(saldo - i);
	}

	


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public Double getSaldo() {
		return saldo;
	}


	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}


}
