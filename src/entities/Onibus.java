package entities;

public class Onibus extends Terrestre{
	
	public Onibus() {
		super();
	}
	public Onibus(Integer capacidade, Double velocidadeMaxima, Double largura, Double comprimento,
			Integer passageiros, Character combustivel, Double peso, boolean parado) {
		super(capacidade, velocidadeMaxima, largura, comprimento, passageiros, combustivel, peso, parado);
		this.setCapacidade(44);
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
		sb.append("Onibus:\n");
		sb.append(super.toString());
		return sb.toString();
	}
}
