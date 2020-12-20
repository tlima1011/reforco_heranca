package entities;

public class Furgao extends Onibus{

	public Furgao() {
		super(); 
	}
	public Furgao(Integer capacidade, Double velocidadeMaxima, Double largura, Double comprimento,
			Integer passageiros, Character combustivel, Double peso, boolean parado) {
		super(capacidade, velocidadeMaxima, largura, comprimento, passageiros, combustivel, peso, parado);
		this.setCapacidade(20);
	}
	@Override
	public String tipoDeslocamento() {
		return super.tipoDeslocamento();
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
		sb.append("Furgao:\n");
		sb.append(super.toString());
		return sb.toString();
	}
}
