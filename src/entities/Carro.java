package entities;

public class Carro extends Terrestre{
    
	//Atributos 
    private Float motor; 
    
    public Carro(){
        super();
    }
	public Carro(Integer capacidade, Double velocidadeMaxima, Double largura, Double comprimento, Integer passageiros,
			Character combustivel, Double peso, boolean parado) {
		super(capacidade, velocidadeMaxima, largura, comprimento, passageiros, combustivel, peso, parado);
		this.motor = 2.4f;
	}
	public Float getMotor() {
		return motor;
	}
	//Métodoss
	@Override
	public String tipoDeslocamento() {
		// TODO Auto-generated method stub
		return "Está no chão andando ou correndo";
	}
	@Override
	public Integer diminuirVelocidade(int velocidade) {
		// TODO Auto-generated method stub
		return super.diminuirVelocidade(velocidade);
	}
	@Override
	public Integer aumentarVelocidade(int velocidade) {
		// TODO Auto-generated method stub
		return super.aumentarVelocidade(velocidade);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append("Carro:\n");
		sb.append(super.toString());
		return sb.toString();
	}
	
}
