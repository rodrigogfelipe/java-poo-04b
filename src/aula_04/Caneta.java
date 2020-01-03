package aula_04;

public class Caneta {

	private String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	/*Este metado e cosntrutor*/
	public Caneta(String m, String c, float p ) {
		this.modelo= m;
		this.cor= c;
		this.setPonta(p);
		this.tampar();
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String m) {
		this.modelo = m;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void tampar() {
		this.tampada= true;
	}
	
	public void tampada() {
		this.tampada= false;
	}
	
	/*Declarando metado status*/
	public void status() {
		System.out.println("Sobre a caneta");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta " + this.getPonta());
		System.out.println("Cor: " + this.cor);
		System.out.println("Tampada: " + this.tampada);
	}

}
