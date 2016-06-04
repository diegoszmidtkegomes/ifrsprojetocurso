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
@Table(name = "Instrutor_0300152")
@SequenceGenerator(name = "SEQ_INSTRUTOR_0300152", sequenceName = "SEQ_INSTRUTOR_0300152", initialValue = 1, allocationSize=1)

public class Instrutor implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private long idInstrutor;
	private String nome;
	private String email;
	private double valorHora;
	private String certificado;
	
	@OneToMany(mappedBy="turma")
	private List<Turma> listaTurma;

	public Instrutor() {}

	public Instrutor(String nome, String email, double valor_hora, String certificado) {
		this.nome = nome;
		this.email = email;
		this.valorHora = valor_hora;
		this.certificado = certificado;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_INSTRUTOR_0300152")
	@Column(name="id_instrutor")	
	public long getId() {
		return idInstrutor;
	}

	public void setId(long id) {
		this.idInstrutor = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getValor_hora() {
		return valorHora;
	}

	public void setValor_hora(double valor_hora) {
		this.valorHora = valor_hora;
	}

	public String getCertificado() {
		return certificado;
	}

	public void setCertificado(String certificado) {
		this.certificado = certificado;
	}

}