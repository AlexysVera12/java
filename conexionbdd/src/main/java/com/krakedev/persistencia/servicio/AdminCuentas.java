package com.krakedev.persistencia.servicio;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Cuentas;
import com.krakedev.persistencia.utils.conexionBDD;

public class AdminCuentas {
	private static final Logger LOGGER = LogManager.getLogger(AdminCuentas.class);

	public static void insertar(Cuentas cuenta) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Cuenta a insertar: " + cuenta);
		try {
			// abrir conexion
			con = conexionBDD.conectar();
			ps = con.prepareStatement(
					"insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)" + "values(?,?,?,?)");
			ps.setString(1, cuenta.getNumeroCuenta());
			ps.setString(2, cuenta.getCedulaPropietario());
			ps.setDate(3, new java.sql.Date(cuenta.getFechaCreacion().getTime()));
			ps.setBigDecimal(4, cuenta.getSaldo());
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

	public static void actualizar(Cuentas cuenta) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Cuenta a actualizar: " + cuenta);

		try {
			con = conexionBDD.conectar();
			ps = con.prepareStatement("UPDATE cuentas set fecha_creacion = ? where numero_cuenta = ?");
			ps.setDate(1, new java.sql.Date(cuenta.getFechaCreacion().getTime()));
			ps.setString(2, cuenta.getNumeroCuenta());
			ps.executeUpdate();
		} catch (Exception e) {
			LOGGER.error("Error al actualizar", e);
			throw new Exception("Error al actualizar");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos");
				throw new Exception("Error con la base de datos");
			}

		}
	}

	public static void eliminar(String numero_cuenta) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("cuenta a eliminar: " + numero_cuenta);

		try {
			con = conexionBDD.conectar();
			ps = con.prepareStatement("Delete from cuentas where numero_cuenta = ?");
			ps.setString(1, numero_cuenta);
			ps.executeUpdate();
		} catch (Exception e) {
			LOGGER.error("Error al eliminar", e);
			throw new Exception("Error al eliminar");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos");
				throw new Exception("Error con la base de datos");
			}

		}
	}

	public static ArrayList<Cuentas> buscarPorIndiceCedula(String indiceCedula) throws Exception {
		ArrayList<Cuentas> cuenta = new ArrayList<Cuentas>();
		Connection con = null;
		PreparedStatement ps;
		ResultSet rs = null;
		try {
			con = conexionBDD.conectar();
			ps = con.prepareStatement("select * from cuentas where cedula_propietario like ?");
			ps.setString(1, "%" + indiceCedula + "%");
			rs = ps.executeQuery();
			while (rs.next()) {
				String numeroCuenta = rs.getString("numero_cuenta");
				String cedulaPropietario = rs.getString("cedula_propietario");
				Date fechaCreacion = rs.getDate("fecha_creacion");
				BigDecimal saldo = rs.getBigDecimal("saldo");
				Cuentas c = new Cuentas();
				c.setNumeroCuenta(numeroCuenta);
				c.setCedulaPropietario(cedulaPropietario);
				c.setFechaCreacion(fechaCreacion);
				c.setSaldo(saldo);
				cuenta.add(c);
			}
		} catch (Exception e) {
			LOGGER.error("Error al consultar por nombre", e);
			throw new Exception("Error al consultar por nombre");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos");
				throw new Exception("Error con la base de datos");
			}

		}

		return cuenta;
	}
}
