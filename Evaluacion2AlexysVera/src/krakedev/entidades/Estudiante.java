package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas = new ArrayList<>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	public Estudiante(String cedula, String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
	}

	public void agregarNota(Nota nuevaNota) {
		boolean existe = false;
		for (int i = 0; i < notas.size(); i++) {
			Nota nota = notas.get(i);
			if (nuevaNota.getMateria().getCodigo() == nota.getMateria().getCodigo()) {
				existe = true;
			}
		}
		if (!existe) {
			if (nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <= 10) {
				notas.add(nuevaNota);
			}
		}
	}

	public void modificarNota(String codigo, double nuevaNota) {
		boolean encontrada = false;

		for (int i = 0; i < notas.size(); i++) {
			Nota nota = notas.get(i);
			if (codigo == nota.getMateria().getCodigo()) {
				encontrada = true;
				if (nuevaNota >= 0 && nuevaNota <= 10) {
					nota.setCalificacion(nuevaNota);
				}
			}
		}

		if (!encontrada) {
			System.out.println("El codigo " + codigo + " ingresado no corresponde a ninguna materia");
		}
	}

	public double calcularPromedioNotasEstudiante() {
		double promedioEstudiante = 0;
		Nota nota;
		for (int i = 0; i < notas.size(); i++) {
			nota = notas.get(i);
			promedioEstudiante += nota.getCalificacion();
		}
		return promedioEstudiante /= notas.size();
	}

	public void mostrar() {
		for (int i = 0; i < notas.size(); i++) {
			Nota nota = notas.get(i);
			System.out.println(
					"Estudiante[Nombre= " + nombre + ", Apellido= " + apellido + ", Cedula= " + cedula + ", Materia= "
							+ nota.getMateria().getNombre() + ", Calificacion= " + nota.getCalificacion() + "]");
		}
	}
}
