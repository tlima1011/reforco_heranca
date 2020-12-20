package entities;

public abstract class Veiculo {
    
    //Atributos 
    private Integer capacidade; 
    private Double velocidadeMaxima;
    private Double largura; 
    private Double comprimento;
    private Integer passageiros;
    private Character combustivel;
    private Double peso;
    private boolean parado;
    private Integer velocidade; 
    //Construtores 
    public Veiculo(){ 
        
    }

    public Veiculo(Integer capacidade, Double velocidadeMaxima, Double largura, Double comprimento, Integer passageiros, Character combustivel, Double peso, boolean parado) {
        this.capacidade = capacidade;
        this.velocidadeMaxima = velocidadeMaxima;
        this.largura = largura;
        this.comprimento = comprimento;
        this.passageiros = passageiros;
        this.combustivel = combustivel;
        this.peso = peso;
        this.parado = parado;
        this.velocidade = 0;
    }
    //Getters and Setters 
    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Integer getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(Integer passageiros) {
        this.passageiros = passageiros;
    }

    public Character getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Character combustivel) {
        this.combustivel = combustivel;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public boolean getParado() {
        return parado;
    }

    public void setParado(boolean parado) {
        this.parado = parado;
    }
    public Integer aumentarVelocidade(int velocidade){
        return this.velocidade += velocidade;
    }
    public Integer diminuirVelocidade(int velocidade){
        return this.velocidade -= velocidade;
    }
    public String tipoDeslocamento(){
        return "Faz um deslocamento";
    }

	@Override
	public String toString() {
		return "Veiculo [Capacidade = " + capacidade 
				+ "\nVelocidade Maxima = " + velocidadeMaxima + "km/h" 
				+ "\nLargura = " + largura
				+ "\nComprimento = " + comprimento 
				+ "\nPassageiros = " + passageiros 
				+ "\nCombustivel = " + combustivel
				+ "\nPeso = " + peso 
				+ "\nParado = " + parado 
				+ "\nVelocidade = " + velocidade 
				+ "\nDeslocamento: " +this.tipoDeslocamento() +"]";
	}
}
