package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Aluno_0300152")
@SequenceGenerator(name = "SEQ_ALUNO_0300152", sequenceName = "SEQ_ALUNO_0300152", initialValue = 1, allocationSize=1)

public class Aluno {

	private long idAluno;
	private String cpf;
	private String nome;
	private String email;
	private String fone;
	private LocalDate dataNascimento;

	public Aluno() {}

	public Aluno(String cpf, String nome, String email, String fone, LocalDate data_nascimento) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.dataNascimento = data_nascimento;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ALUNO_0300152")
	@Column(name="id_aluno")
	public long getId() {
		return idAluno;
	}

	public void setId(long id) {
		this.idAluno = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public LocalDate getData_nascimento() {
		return dataNascimento;
	}

	public void setData_nascimento(LocalDate data_nascimento) {
		this.dataNascimento = data_nascimento;
	}

}