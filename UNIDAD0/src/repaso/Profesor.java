package repaso;

public class Profesor {
	
	public void ponerNotas (Alumno a) {
		
	}
	
	public double calcularMedia (Alumno a) {
		double media = (a.getAsig1().getCalificacion()
						+a.getAsig2().getCalificacion()
						+a.getAsig3().getCalificacion())/3;
		return media;
		// En vez de dividir por tres es mejor hacer un 
		// array y dividirlo por el nº de elementos
	}
	
}
