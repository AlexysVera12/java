package com.krakedev.persistencia.servicio;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Compras;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.conexionBDD;

public class AdminCompras {
	private static final Logger LOGGER = LogManager.getLogger(AdminCompras.class);
	public static void insertar(Compras compra) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("compra a insertar: " + compra);
		try {
			// abrir conexion
			con = conexionBDD.conectar();
			ps = con.prepareStatement(
					"insert into compras(id_compra,cedula,fecha_compra,monto)"
							+ "values(?,?,?,?)");
			ps.setInt(1, compra.getIdCompra());
			ps.setString(2, compra.getCedula());
			ps.setDate(3, new java.sql.Date(compra.getFechaCompra().getTime()));
			ps.setBigDecimal(4, compra.getMonto());
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
	public static void actualizar(Compras compra) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("compra a actualizar: " + compra);

		try {
			con = conexionBDD.conectar();
			ps = con.prepareStatement("UPDATE compras set monto = ? where id_compra = ?");
			ps.setBigDecimal(1, compra.getMonto());
			ps.setInt(2, compra.getIdCompra());
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
	public static void eliminar(int idCompra) throws Exception{
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("compra a eliminar: "+idCompra);
		
		try {
			con = conexionBDD.conectar();
			ps = con.prepareStatement("Delete from compras where id_compra = ?");
			ps.setInt(1, idCompra);
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
	public static Compras buscarPorPK(int id_compra) {
		Compras compra = new Compras();
		Connection con = null;
		PreparedStatement ps;
		ResultSet rs = null;
		try {
			con = conexionBDD.conectar();
			ps = con.prepareStatement("Select * from compras where id_compra = ?");
			ps.setInt(1, id_compra);
			rs = ps.executeQuery();
			if (rs.next()) {
				int idCompra = rs.getInt("id_compra");
				String cedula = rs.getString("cedula");
				Date fechaCompra = rs.getDate("fecha_compra");
				BigDecimal monto = rs.getBigDecimal("monto");
				compra.setIdCompra(idCompra);
				compra.setCedula(cedula);
				compra.setFechaCompra(fechaCompra);
				compra.setMonto(monto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return compra;
	}
}
