package entities;

public class Camioneta extends Caminhao{
	
	public Camioneta() {
		super(); 
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Camioneta:\n");
		sb.append(super.toString());
		return sb.toString();
	}
	
}
