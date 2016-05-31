package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Curso_0300152")
@SequenceGenerator(name = "SEQ_CURSO_0300152", sequenceName = "SEQ_CURSO_0300152", initialValue = 1, allocationSize=1)
public class Curso implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idCurso;
	private String nome;
	private String requisito;
	private int cargaHoraria;
	private double preco;
	
	@OneToMany(mappedBy="turma")
	private List<Turma> listaTurma;
	
	public Curso() {}

	public Curso(String nome, String requisito, int carga_horaria, double preco) {
		this.nome = nome;
		this.requisito = requisito;
		this.cargaHoraria = carga_horaria;
		this.preco = preco;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CURSO_0300152")	
	@Column(name="id_curso")
	
	public long getId() {
		return idCurso;
	}

	public void setId(long id) {
		this.idCurso = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRequisito() {
		return requisito;
	}

	public void setRequisito(String requisito) {
		this.requisito = requisito;
	}
	@Column(name="carga_horaria")
	public int getCarga_horaria() {
		return cargaHoraria;
	}

	public void setCarga_horaria(int carga_horaria) {
		this.cargaHoraria = carga_horaria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	

}
