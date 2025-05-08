package clases1;

public class Alumno1 extends Persona1{
private int curso;

public int getCurso() {
	return curso;
}

public void setCurso(int curso) {
	this.curso = curso;
}

public void pasaDeCurso() {
	curso = curso + 1;
}

public void pasaDeCurso(int curso1) {
	curso = curso1;
}

@Override
public String toString() {
	return super.toString() + "Alumno1 [curso=" + curso + "]";
}
}
