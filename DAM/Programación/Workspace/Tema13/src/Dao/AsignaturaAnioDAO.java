package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Modelo.AnioEscolar;
import Modelo.Asignatura;
import Modelo.AsignaturaAnio;
import Modelo.Curso;
import Modelo.CursoAnio;
import Util.Conexion;

public class AsignaturaAnioDAO {
	public static List<AsignaturaAnio> lista(String profesor)
	{
		List<AsignaturaAnio> lista = new ArrayList<AsignaturaAnio>();
		try {
			//abro bd
			Connection con = Conexion.abreConexion();
			//creo el statement
			PreparedStatement pst = con.prepareStatement("select c.Asignatura, e.idcurso, e.Curso, f.Anio\r\n"
					+ "from asignaturaanio a\r\n"
					+ "inner join profesor b on b.idprofesor = a.idprofesor\r\n"
					+ "inner join asignatura c on c.idasignatura = a.idasignatura\r\n"
					+ "inner join cursoanio d on d.idcursoanio = a.idcursoanio\r\n"
					+ "inner join curso e on e.idcurso = d.idcurso\r\n"
					+ "inner join anioescolar f on f.idanio=d.idanio\r\n"
					+ "where b.nombre=?");
			pst.setString(1,profesor);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				//creo objeto asignaturaanio y lo añado a la lista
				lista.add(new AsignaturaAnio(new Asignatura(0, rs.getString("asignatura"),null),new CursoAnio(0,new Curso(rs.getInt("Idcurso"),rs.getString("curso")),new AnioEscolar(rs.getString("anio")),null),null));
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