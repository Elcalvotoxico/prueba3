package Modelo;

public class Asignatura {
	private int idAsignatura;
	private String asignatura;
	private Curso curso;
	public Asignatura()
	{
		
	}
	public Asignatura(int idAsignatura, String asignatura, Curso curso) {
		super();
		this.idAsignatura = idAsignatura;
		this.asignatura = asignatura;
		this.curso = curso;
	}
	public int getIdAsignatura() {
		return idAsignatura;
	}
	public void setIdAsignatura(int idAsignatura) {
		this.idAsignatura = idAsignatura;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	@Override
	public String toString() {
		return asignatura + " (" + curso.getCurso() + ")";
	}
}
