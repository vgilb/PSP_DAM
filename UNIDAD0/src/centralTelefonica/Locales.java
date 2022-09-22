package centralTelefonica;

public class Locales extends Llamadas{

	private static final double COSTE = 0.15; // 15 cent/s
	
	public double calcularCoste(){ 
		return this.COSTE * super.duracion;
		
	}
	
}
