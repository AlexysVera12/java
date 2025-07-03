package com.krakedev.persistencia.servicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.conexionBDD;

public class AdminPersonas {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	public static void insertar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a insertar: " + persona);
		try {
			// abrir conexion
			con = conexionBDD.conectar();
			ps = con.prepareStatement(
					"insert into personas(cedula,nombre,apellido,estado_civil,estatura,fecha_nacimiento,hora_nacimiento,cantidad_ahorrada,numero_hijos)"
							+ "values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setString(4, persona.getEstadoCivil().getCodigo());
			ps.setDouble(5, persona.getEstatura());
			ps.setBigDecimal(8, persona.getCantidadAhorrada());
			ps.setInt(9, persona.getNumeroHijos());
			ps.setDate(6, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(7, new java.sql.Time(persona.getHoraNacimiento().getTime()));
			ps.executeUpdate();
		} catch (Exception e) {
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static void actualizar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a actualizar: " + persona);

		try {
			con = conexionBDD.conectar();
			ps = con.prepareStatement("UPDATE personas set estado_civil = ? where cedula = ?");
			ps.setString(1, persona.getEstadoCivil().getCodigo());
			ps.setString(2, persona.getCedula());
			ps.executeUpdate();
		} catch (Exception e) {
			LOGGER.error("Error al actualizar", e);
			throw new Exception("Error al actualizar");
		} finally {
			try {
				con.close();
			}catch(SQLException e) {
				LOGGER.error("Error con la base de datos");
				throw new Exception("Error con la base de datos");
			}
			
		}
	}
	public static void eliminar(String cedula) throws Exception{
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a eliminar: "+cedula);
		
		try {
			con = conexionBDD.conectar();
			ps = con.prepareStatement("Delete from personas where cedula = ?");
			ps.setString(1, cedula);
			ps.executeUpdate();
		} catch (Exception e) {
			LOGGER.error("Error al eliminar",e);
			throw new Exception("Error al eliminar");
		} finally {
			try {
				con.close();
			}catch(SQLException e) {
				LOGGER.error("Error con la base de datos");
				throw new Exception("Error con la base de datos");
			}
			
		}
	}
	public static ArrayList<Persona> buscarPorNombre(String nombreBusqueda) throws Exception{
		ArrayList<Persona> personas = new ArrayList<Persona>();
		Connection con = null;
		PreparedStatement ps;
		ResultSet rs = null;
		try {
			con = conexionBDD.conectar();
			ps = con.prepareStatement("select * from personas where nombre like ?");
			ps.setString(1, "%"+nombreBusqueda+"%");
			rs = ps.executeQuery();
			while(rs.next()) {
				String nombre = rs.getString("nombre");
				String cedula = rs.getString("cedula");
				Persona p = new Persona();
				p.setNombre(nombre);
				p.setCedula(cedula);
				personas.add(p);
			}
		} catch (Exception e) {
			LOGGER.error("Error al consultar por nombre",e);
			throw new Exception("Error al consultar por nombre");		}finally {
			try {
				con.close();
			}catch(SQLException e) {
				LOGGER.error("Error con la base de datos");
				throw new Exception("Error con la base de datos");
			}
			
		}
		return personas;
	}
}
