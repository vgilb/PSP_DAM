package repaso;

public class Asignatura {

	private int ident;
	private double calificacion;
	
	Asignatura (){}
	Asignatura (int ident){
		this.ident = ident;
	}
	
	public int getIdent() {
		return this.ident;
	}

	public double getCalificacion() {
		return this.calificacion;
	}
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	
	
}
