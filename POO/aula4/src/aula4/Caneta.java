package aula4;

public class Caneta {
	private String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;

	public Caneta(String modelo, float ponta, String cor, boolean tampada) {
		this.modelo = modelo;
		this.ponta = ponta;
		this.cor = cor;
		this.tampada = tampada;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}

	public void status() {
		System.out.println("Sobre a caneta");
		System.out.println("Modelo: " + getModelo());
		System.out.println("Ponta: " + getPonta());
		System.out.println("Cor: " + getCor());
		System.out.println("Tampada: " + isTampada());
	}

}
