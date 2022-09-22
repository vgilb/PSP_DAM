package repaso;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Asignatura asig1 = new Asignatura(1);
		Asignatura asig2 = new Asignatura(2);
		Asignatura asig3 = new Asignatura(3);
		
		Alumno al1 = new Alumno(asig1,asig2,asig3);
		
		Profesor p1 = new Profesor();
		p1.ponerNotas(al1);
		p1.calcularMedia(al1);
	}

}
