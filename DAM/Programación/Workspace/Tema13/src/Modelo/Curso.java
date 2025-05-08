package Modelo;

public class Curso {
	private int idCurso;
	private static String curso;
	public Curso()
	{
		
	}
	public Curso(int idCurso, String curso) {
		super();
		this.idCurso = idCurso;
		this.curso = curso;
	}
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	public  String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	@Override
	public String toString() {
		return idCurso + " - " + curso;
	}
}
