package centralTelefonica;

public class Provinciales extends Llamadas {

	private int hora;
	private double coste;
	
	Provinciales (){}
	
	Provinciales (String origen, String destino, int duracion, double coste){
		super(origen, destino, duracion);
		this.coste = coste;
		this.hora = hora;
	}
	
	public double calcularCoste () {
		double importe = 0;
		
		
		return importe;
	}
}
