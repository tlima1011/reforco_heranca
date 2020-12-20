package entities;

public class Aviao extends Veiculo{

	public Aviao() {
		super(); 
	}
	public Aviao(Integer capacidade, Double velocidadeMaxima, Double largura, Double comprimento, Integer passageiros, Character combustivel, Double peso, boolean parado) {
		super(capacidade, velocidadeMaxima, largura, comprimento, passageiros, combustivel, peso, parado);
	}

	@Override
	public Integer aumentarVelocidade(int velocidade) {
		// TODO Auto-generated method stub
		return super.aumentarVelocidade(velocidade);
	}

	@Override
	public Integer diminuirVelocidade(int velocidade) {
		// TODO Auto-generated method stub
		return super.diminuirVelocidade(velocidade);
	}

	@Override
	public String tipoDeslocamento() {
		return "Voando"; 
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append("Avião\n"); 
		sb.append(super.toString());
		return sb.toString(); 
	}
}
