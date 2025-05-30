package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Modelo.Alumno;
import Modelo.AlumnoCurso;
import Modelo.AnioEscolar;
import Modelo.Asignatura;
import Modelo.AsignaturaAnio;
import Modelo.Curso;
import Modelo.CursoAnio;
import Util.Conexion;

public class AlumnoCursoDAO {
	public static List<AlumnoCurso> lista(String curso)
	{
		List<AlumnoCurso> lista = new ArrayList<AlumnoCurso>();
		try {
			//abro bd
			Connection con = Conexion.abreConexion();
			//creo el statement
			PreparedStatement pst = con.prepareStatement("select c.nombre,c.apellidos, a.notamedia\r\n"
					+ "from alumnocurso a\r\n"
					+ "inner join cursoanio b on b.idcursoanio = a.idcursoanio\r\n"
					+ "inner join curso e on e.idcurso = b.idcurso\r\n"
					+ "inner join anioescolar f on f.idanio=b.idanio\r\n"
					+ "inner join alumno c on c.idalumno = a.idalumno\r\n"
					+ "where f.activo=1 and e.curso=?");
			pst.setString(1,curso);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				//creo objeto asignaturaanio y lo a�ado a la lista
				lista.add(new AlumnoCurso(new Alumno(rs.getString("nombre"),rs.getString("apellidos")),rs.getDouble("notamedia")));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			Conexion.cierraConexion();
		}
		return lista;
	}
}
