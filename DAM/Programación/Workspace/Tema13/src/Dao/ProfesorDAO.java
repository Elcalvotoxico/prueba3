package Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import Modelo.Curso;
import Modelo.Profesor;
import Util.Conexion;

public class ProfesorDAO {
	public static void inserta(Profesor profe)
	{
		try {
			//abro conexion
			Connection con = Conexion.abreConexion();
			//creo select
			PreparedStatement pst = con.prepareStatement("insert into profesor(nombre, email, esdirector, esjefeestudios) values (?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
			pst.setString(1, profe.getNombre());
			pst.setString(2, profe.getEmail());
			pst.setBoolean(3, profe.isEsdirector());
			pst.setBoolean(4, profe.isEsjefeestudios());
			pst.execute();
			//recupero clave
			ResultSet rs = pst.getGeneratedKeys();
			if(rs.next())
				profe.setIdProfesor(rs.getInt(1));
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			Conexion.cierraConexion();
		}
	}
	public static boolean delete(Profesor profe) {
		try {
			//abro conexion
			Connection con = Conexion.abreConexion();
			//creo select
			PreparedStatement pst = con.prepareStatement("delete from profesor where nombre = (?)");
			pst.setString(1, profe.getNombre());
			pst.execute();
		
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		finally {
			Conexion.cierraConexion();
		}
		return true;
	}
	public static boolean delete2(Profesor profe) {
		try {
			//abro conexion
			Connection con = Conexion.abreConexion();
			//creo select
			PreparedStatement pst = con.prepareStatement("select * from profesor\r\n"
					+ "INNER JOIN asignaturaanio ON asignaturaanio.idprofesor = profesor.idprofesor; ");
			ResultSet rs = pst.executeQuery();
			//recorrer el ResultSet
			if(rs.next())
			{
				return false;
			}else {
				PreparedStatement pst1 = con.prepareStatement("DELETE From profesor WHERE nombre=?\r\n"
						+ "and not exists (SELECT 1 from asignaturaanio WHERE idprofesor = profesor.idprofesor)");
				pst1.setString(1, profe.getNombre());
				pst1.execute();
			}
			
			rs.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			Conexion.cierraConexion();
		}
		return true;
	}
}

