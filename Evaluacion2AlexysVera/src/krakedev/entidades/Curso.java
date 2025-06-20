package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes = new ArrayList<>();

	public String buscarEstudiantePorCedula(Estudiante estudiante) {
		for (int i = 0; i < estudiantes.size(); i++) {
			Estudiante estudianteEncontrado = estudiantes.get(i);
			if (estudiante.getCedula() == estudianteEncontrado.getCedula()) {
				return "Estudiante encontrado";
			}
		}
		return null;
	}

	public void matricularEstudiantes(Estudiante estudiante) {
		if (buscarEstudiantePorCedula(estudiante) == null) {
			estudiantes.add(estudiante);
		}
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public double calcularPromedioCurso() {
		double promedioCurso = 0;
		Estudiante estudianteEncontrado = null;
		if (estudiantes.size() == 0) {
			return 0;
		}
		for (int i = 0; i < estudiantes.size(); i++) {
			estudianteEncontrado = estudiantes.get(i);
			promedioCurso += estudianteEncontrado.calcularPromedioNotasEstudiante();
		}
		return promedioCurso /= estudianteEncontrado.getNotas().size();
	}

	public void mostrar() {
		for (int i = 0; i < estudiantes.size(); i++) {
			Estudiante estudianteEncontrado = estudiantes.get(i);
			System.out.println("Estudiante[Nombre= " + estudianteEncontrado.getNombre() + ", Apellido= "
					+ estudianteEncontrado.getApellido() + ", Cedula= " + estudianteEncontrado.getCedula()
					+ ", Promedio= " + estudianteEncontrado.calcularPromedioNotasEstudiante() + "]");
		}
	}
}
