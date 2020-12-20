package entities;

public class Terrestre extends Veiculo{
    
    //Atributos
    private final Integer QTDE_RODAS = 4; 
    
    //Construtores
    public Terrestre(){
        super();
    }
    public Terrestre(Integer capacidade, Double velocidadeMaxima, Double largura, Double comprimento,
			Integer passageiros, Character combustivel, Double peso, boolean parado) {
		super(capacidade, velocidadeMaxima, largura, comprimento, passageiros, combustivel, peso, parado);
	}
	//Getters and setters
    public Integer getQtde_Rodas() {
        return QTDE_RODAS;
    }
    /*public void setQtdeRodas(Integer qtdeRodas) {
        this.qtdeRodas = qtdeRodas;
    }*/

    @Override
    public String tipoDeslocamento() {
        return "Andando pelo chão";
    }

    @Override
    public Integer diminuirVelocidade(int velocidade) {
        return super.diminuirVelocidade(velocidade); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer aumentarVelocidade(int velocidade) {
        return super.aumentarVelocidade(velocidade); //To change body of generated methods, choose Tools | Templates.
    }
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(super.toString());
		sb.append("\nQTDE_RODAS = " + QTDE_RODAS);
		return sb.toString();
	}
}
