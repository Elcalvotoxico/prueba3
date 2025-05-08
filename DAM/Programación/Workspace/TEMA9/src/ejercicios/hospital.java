package ejercicios;

import java.util.Date;
import java.util.Random;

import clases.Enfermero;
import clases.Medico;
import clases.Paciente;

public class hospital {

	public static void main(String[] args) {
		Date fecha = new Date(2025,05,20);//preguntar porque usar Date y no Localdate
		Medico me = new Medico(754854, "nombre","apellidos",40, 10, "nif", 5);
		Enfermero en = new Enfermero(45684, "nombre", "apellidos", 35, 15, "especialidad", 8);
		Paciente pa = new Paciente(54684, "nombre","apellidos", 42, 15, fecha, "causa del infarto", me, en);
		
		
		Random aleatorio = new Random();
		double resulMedico = me.donarSangre(aleatorio.nextInt(1, 6));
		
		double resulEnfermero = en.donarSangre(aleatorio.nextInt(1, 6));
		
		double resulPaciente = pa.donarSangre(aleatorio.nextInt(1, 6));
		
		if(resulMedico == 0) {
			System.out.println("El medico ha podido donar sangre");
		}
		
		if(resulEnfermero == 0) {
			System.out.println("El enfermero ha podido donar ssnagre");
		}
		
		if(resulPaciente == 0) {
			System.out.println("El paciente ha podido donar sangre");
		}
		
		System.out.println(resulMedico + resulEnfermero + resulEnfermero + ":" + "Total de sangre donado");
	}

}
