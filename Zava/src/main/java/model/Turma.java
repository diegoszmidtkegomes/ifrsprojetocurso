package model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Turma_0300152")
@SequenceGenerator(name = "SEQ_TURMA_0300152", sequenceName = "SEQ_TURMA_0300152", initialValue = 1, allocationSize=1)
public class Turma implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id_turma;
	
	
	@OneToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "curso", unique = false)	
	private Curso curso;
	private Instrutor instrutor;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private int cargaHoraria;

	public Turma() {}

	public Turma(Curso curso, Instrutor instrutor, LocalDate data_inicio, LocalDate data_fim, int carga_horaria) {
		this.curso = curso;
		this.instrutor = instrutor;
		this.dataInicio = data_inicio;
		this.dataFim = data_fim;
		this.cargaHoraria = carga_horaria;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TURMA_0300152")
	@Column(insertable =false, updatable =false, name="id_turma")	
	public long getId() {
		return id_turma;
	}

	public void setId(long id) {
		this.id_turma = id;
	}

	@ManyToOne
	@JoinColumn(name="id_curso", referencedColumnName="id_curso")
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	@ManyToOne
	@JoinColumn(name="id_instrutor", referencedColumnName="id_instrutor")
	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}
	
	public LocalDate getData_inicio() {
		return dataInicio;
	}

	public void setData_inicio(LocalDate data_inicio) {
		this.dataInicio = data_inicio;
	}
	public LocalDate getData_fim() {
		return dataFim;
	}

	public void setData_fim(LocalDate data_fim) {
		this.dataFim = data_fim;
	}

	public int getCarga_horaria() {
		return cargaHoraria;
	}

	public void setCarga_horaria(int carga_horaria) {
		this.cargaHoraria = carga_horaria;
	}

}