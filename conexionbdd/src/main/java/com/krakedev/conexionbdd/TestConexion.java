package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		PreparedStatement ps2 = null;
		PreparedStatement ps3 = null;

		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ejercicios","postgres","HarveyS1279");
			System.out.println("conexion exitosa");
			ps = connection.prepareStatement("insert into persona(cedula,nombre,apellido,estatura,fecha_nacimiento,hora_nacimiento,cantidad_ahorrada,numero_hijos)"
					+ "values(?,?,?,?,?,?,?,?)");
			ps.setString(1, "1010101010");
			ps.setString(2, "Sean");
			ps.setString(3, "Mendoza");
			ps.setDouble(4, 1.78);
			ps.setBigDecimal(7, new BigDecimal(2500.00));
			ps.setInt(8, 1);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyy/MM/dd hh:mm:ss");
			String fechaStr = "2020/03/22 10:05:04";
			try {
				Date fecha = sdf.parse(fechaStr);
				System.out.println(fecha);
				long fechaMilis = fecha.getTime();
				System.out.println(fechaMilis);
				java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);
				
				Time timeSQL = new Time(fechaMilis);
				System.out.println(timeSQL);
				
				ps.setDate(5, fechaSQL);
				ps.setTime(6, timeSQL);
				
				ps.executeUpdate();
				System.out.println("insert exitoso");
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			// SEGUNDO INSERT

			ps2 = connection.prepareStatement("  insert into compras (id_compra,cedula,fecha_compra,monto)"
					+ "values(?,?,?,?)");
			ps2.setInt(1, 7);
			ps2.setString(2, "15324");
			ps2.setBigDecimal(4, new BigDecimal(320.45));
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
			String fechaStr2 = "2023/04/19";
			
			try {
				Date fecha = sdf2.parse(fechaStr2);
				System.out.println("fecha para el segundo insert: "+fecha);
				long fechaMilis = fecha.getTime();
				java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
				System.out.println("Fecha de tipo sql para le segundo insert: "+fechaSQL);
				ps2.setDate(3, fechaSQL);
				ps2.executeUpdate();
				System.out.println("Segundo insert exitoso");
				} catch (ParseException e) {
				e.printStackTrace();
			}
			
			//TERCER INSERT
			 
			ps3 = connection.prepareStatement("insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)"
					+ "values(?,?,?,?)");
			ps3.setString(1, "00017");
			ps3.setString(2, "12012");
			ps3.setBigDecimal(4, new BigDecimal(2500));
			SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd");
			String fechaStr3 = "2024/02/12";

			try {
				Date fecha = sdf3.parse(fechaStr3);
				System.out.println("Fecha para el tercer insert: "+fechaStr3);
				long fechaMilis = fecha.getTime();
				java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
				System.out.println("Fecha de tipo sql para el tercer insert: "+fechaSQL);
				ps3.setDate(3, fechaSQL);
				ps3.executeUpdate();
				System.out.println("Tercer insert exitoso");
			} catch (ParseException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException | SQLException e) {	
			e.printStackTrace();
		} 
	}

}
