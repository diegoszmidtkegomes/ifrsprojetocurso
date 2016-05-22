package models;

public class Estudante {
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
	private static int idProximo=0;
    private static int getIdProximo() {
        return idProximo++;
    }
}