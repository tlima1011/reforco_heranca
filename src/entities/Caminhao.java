package entities;

public class Caminhao extends Terrestre{
	
	//Atributos 
	private Double tamanhoCarroceria; 
	private boolean possuiBau; 
	//Construtores 
	public Caminhao() {
		
	}
	public Caminhao(Integer capacidade, Double velocidadeMaxima, Double largura, Double comprimento,
			Integer passageiros, Character combustivel, Double peso, boolean parado,
			Double tamanhoCarroceria, boolean possuiBau) {
		super(capacidade, velocidadeMaxima, largura, comprimento, passageiros, combustivel, peso, parado);
		this.tamanhoCarroceria = tamanhoCarroceria;
		this.possuiBau = possuiBau;
	}
	//Getters and Setters 
	public Double getTamanhoCarroceria() {
		return tamanhoCarroceria;
	}
	public void setTamanhoCarroceria(Double tamanhoCarroceria) {
		this.tamanhoCarroceria = tamanhoCarroceria;
	}
	public boolean getPossuiBau() {
		return possuiBau;
	}
	public void setPossuiBau(boolean possuiBau) {
		this.possuiBau = possuiBau;
	}
	//Métodos 
	@Override
	public String tipoDeslocamento() {
		return "Está no chão andando ou correndo";
	}
	@Override
	public Integer diminuirVelocidade(int velocidade) {
		return super.diminuirVelocidade(velocidade);
	}
	@Override
	public Integer aumentarVelocidade(int velocidade) {
		return super.aumentarVelocidade(velocidade);
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append("Caminhao:\n");
		sb.append(super.toString()); 
		sb.append("Tamanho carroceria: " +this.tamanhoCarroceria + "\n"); 
		sb.append("Tem bau: " +this.possuiBau);
		return sb.toString(); 
	}
}
