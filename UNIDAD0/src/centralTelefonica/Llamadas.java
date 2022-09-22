package centralTelefonica;

public abstract class Llamadas {
	
	
	protected String origen;
	protected String destino;
	protected int duracion;
	
	
	Llamadas (){}
	
	Llamadas (String origen, String destino, int duracion){
		this.origen = origen;
		this.destino = destino;
		this.duracion = duracion;
	}
	
	public abstract double calcularCoste();
	
	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	
}
