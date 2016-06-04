package br.com.projetosifrs.controlematricula;

import java.time.LocalDate;

import org.apache.log4j.Logger;

import dao.CursoDao;
import dao.InstrutorDao;
import dao.TurmaDao;
import model.Curso;
import model.Instrutor;
import model.Turma;

public class Teste {

	public static void main(String[] args) throws Exception {
		
		Logger logger = Logger.getLogger(Teste.class);
		
		InstrutorDao instrutorDao = new InstrutorDao();
		Instrutor instrutor = new Instrutor();
		instrutor.setNome("teste locasso");
		instrutorDao.save(instrutor);		
		
		CursoDao cursoDao = new CursoDao();
		Curso curso = new Curso("turma1","",255,12);
		cursoDao.save(curso);
		
		LocalDate hoje = LocalDate.now();
		TurmaDao turmaDao = new TurmaDao();
		Turma turma = new Turma();
		turma.setCarga_horaria(255);
		turma.setCurso(curso);
		turma.setData_fim(hoje);
		turma.setData_inicio(hoje);
		turma.setInstrutor(instrutor);
		turmaDao.save(turma);
		
		

	}

}
