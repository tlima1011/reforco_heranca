package entities;

public class Van extends Onibus{
	
	public Van() {
		super(); 
	}
	public Van(Integer capacidade, Double velocidadeMaxima, Double largura, Double comprimento,
			Integer passageiros, Character combustivel, Double peso, boolean parado) {
		super(capacidade, velocidadeMaxima, largura, comprimento, passageiros, combustivel, peso, parado);
		this.setCapacidade(10);
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
		sb.append("Van:\n");
		sb.append(super.toString());
		return sb.toString();
	}
}
