package entities;

public class Maritmo extends Veiculo{
	
	public Maritmo() {
		super(); 
	}
	public Maritmo(Integer capacidade, Double velocidadeMaxima, Double largura, Double comprimento,
			Integer passageiros, Character combustivel, Double peso, boolean parado) {
		super(capacidade, velocidadeMaxima, largura, comprimento, passageiros, combustivel, peso, parado);
	}

	@Override
	public Integer aumentarVelocidade(int velocidade) {
		return super.aumentarVelocidade(velocidade);
	}

	@Override
	public Integer diminuirVelocidade(int velocidade) {
		return super.diminuirVelocidade(velocidade);
	}

	@Override
	public String tipoDeslocamento() {
		return "Navegando...";
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(super.toString());
		return sb.toString();
	}
}
