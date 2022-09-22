package repaso;

public class Alumno {

	private Asignatura asig1;
	private Asignatura asig2;
	private Asignatura asig3;
	
	Alumno(){}
	
	Alumno(Asignatura a1, Asignatura a2, Asignatura a3){
		this.asig1 = a1;
		this.asig2 = a2;
		this.asig3 = a3;
	}

	Alumno(int num1, int num2, int num3){
		Asignatura a1 = new Asignatura(num1);
		Asignatura a2 = new Asignatura(num2);
		Asignatura a3 = new Asignatura(num3);
	}
	
	public Asignatura getAsig1() {
		return this.asig1;
	}

	public Asignatura getAsig2() {
		return this.asig2;
	}

	public Asignatura getAsig3() {
		return this.asig3;
	}
	
}
