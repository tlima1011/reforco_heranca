package entities;

public class Caminhonete extends Caminhao{
	
	public Caminhonete() {
		super();
	}
	
	@Override
	public String tipoDeslocamento() {
		return "Andando e correndo";
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
		sb.append("Caminhonete:\n");
		sb.append(super.toString()); 
		return sb.toString(); 
		
	}
}
