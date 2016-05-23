package models;

public class Estudante extends Usuario {
	private int id_estudante;
	private int matricula;
	private String senha;
	private String nome;
	
	public Estudante(int matricula, String senha, String nome) {
		this.id_estudante = getIdProximo();
		this.matricula = matricula;
		this.senha = senha;
		this.nome = nome;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSenha() {
		return senha;
	}	
	
	private static int idProximo=0;
    private static int getIdProximo() {
        return idProximo++;
    }
}