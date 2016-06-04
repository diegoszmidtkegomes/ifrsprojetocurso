package dao;

import java.util.ArrayList;
import java.util.List;

import models.*;

public class Dao {
	static private List<Disciplina> disciplinas = new ArrayList<>();
	static private List<Estudante> estudantes = new ArrayList<>();
	static private List<Matricula> matriculas = new ArrayList<>();
	static private List<Professor> professores = new ArrayList<>();
	static private List<Turma> turmas = new ArrayList<>();
	
	static {
		Estudante estudante1 = new Estudante(1234, "1234", "Rhuan");
		Estudante estudante2 = new Estudante(4321, "4321", "Diego");
		estudantes.add(estudante1);
		estudantes.add(estudante2);
	}
	
	public static List<Professor> getProfessores() {
		return professores;
	}
	
	public static List<Estudante> getEstudantes() {
		return estudantes;
	}
	

//teste dao
}
