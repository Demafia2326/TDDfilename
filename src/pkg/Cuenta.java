package pkg;

import java.util.List;

public class Cuenta {

	String numero;
	String titular;
	Double saldo;
	List<Movimiento> mMovimientos;
	private static final double LIMITE = -500;

	public Cuenta(String numero, Double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public Cuenta(String string, String string2, int i) {
		// TODO Auto-generated constructor stub
	}

	public Cuenta(int i) {
		// TODO Auto-generated constructor stub
	}

	public void ingresar(double cantidad) {
		saldo += cantidad;
	}

	public void retirar(double cantidad) {

		if (saldo - cantidad >= LIMITE) {
			saldo -= cantidad;
		} else {
		}
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
