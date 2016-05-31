package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Matricula_0300152")
@SequenceGenerator(name = "SEQ_MATRICULA_0300152", sequenceName = "SEQ_MATRICULA_0300152", initialValue = 1, allocationSize=1)

public class Matricula {
	
	private long idMatricula;
	private Aluno aluno;
	private Turma turma;
	private LocalDate dataMatricula;
	
	public Matricula(){}
	
	public Matricula(Aluno estudante, Turma turma, LocalDate data_matricula) {
		this.aluno = estudante;
		this.turma = turma;
		this.dataMatricula = data_matricula;			
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_MATRICULA_0300152")
	@Column(name="id_matricula")	
	public long getId() {
		return idMatricula;
	}

	public void setId(long id) {
		this.idMatricula = id;
	}
	@OneToOne
    @JoinColumn(name="id_aluno")
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	@OneToOne
    @JoinColumn(name="id_turma")
	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	@Column(name="data_matricula")
	public LocalDate getData_matricula() {
		return dataMatricula;
	}

	public void setData_matricula(LocalDate data_matricula) {
		this.dataMatricula = data_matricula;
	}

			
}