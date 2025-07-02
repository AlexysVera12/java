package com.krakedev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.servicio.AdminPersonas;

public class conexionBDD {
	private static final String DRIVER = "org.postgresql.Driver";
	private static final String URL = "jdbc:postgresql://localhost:5432/ejercicios";
	private static final String USUARIO = "postgres";
	private static final String CLAVE = "HarveyS1279";
	private static final Logger LOGGER = LogManager.getLogger(conexionBDD.class);


	public static Connection conectar() throws Exception {
		Connection connection = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USUARIO, CLAVE);
			LOGGER.debug("conexion exitosa");
		} catch (ClassNotFoundException e) {
			LOGGER.error("Error en la infraestructura",e);
			throw new Exception("Error en la infraestructura");
		} catch (SQLException e) {
			LOGGER.error("Error al conectarse, revise usuario y clave",e);			
			throw new Exception("Error al conectarse, revise usuario y clave");

		}
		return connection;
	}
}
