package Dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import Modelo.Curso;
import Util.Conexion;

public class CursoDAO {
	public static List<Curso> lista()
	{
		List<Curso> lista = new ArrayList<Curso>();
		try {
			//abro conexion
			Connection con = Conexion.abreConexion();
			//creo select
			PreparedStatement pst = con.prepareStatement("select idcurso, curso from curso order by curso asc");
			ResultSet rs = pst.executeQuery();
			//recorrer el ResultSet
			while(rs.next())
			{
				lista.add(new Curso(rs.getInt("idcurso"), rs.getString("curso")));
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
	public static void inserta(Curso curso) {
		try {
		//abro conexion
		Connection con = Conexion.abreConexion();
		//creo el insert
		PreparedStatement pst = con.prepareStatement("INSERT INTO Curso (curso) VALUES (?)",Statement.RETURN_GENERATED_KEYS);
		//asigno parametros
		pst.setString(1,curso.getCurso());
		//ejecuto
		pst.executeUpdate();
		//obtengo la clave generada
		ResultSet rs = pst.getGeneratedKeys();
		if (rs.next()) {
			curso.setIdCurso(rs.getInt(1)); // Actualizamos el ID en el objeto
		}
		rs.close();
	
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		Conexion.cierraConexion();
	}
		
		
	}
	public static int procedimiento(Curso curso) {
		Connection con = Conexion.abreConexion();
		try {
			CallableStatement cs = con.prepareCall("CALL InsertarCursoConAnios(?,?)");
			cs.setString(1, curso.getCurso());
			cs.registerOutParameter(2, java.sql.Types.INTEGER); 
			cs.execute();
			int numcursos = cs.getInt(2);
			return numcursos;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			Conexion.cierraConexion();
		}
		return 0;
	}
}
