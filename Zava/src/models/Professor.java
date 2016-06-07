package models;

public class Professor {
	private int id_professor;
	private int matricula;
	private String senha;
	private String nome;
	private String titulacao;
	private boolean coordenador = false;
	
	public Professor(int matricula, String senha, String nome, String titulacao, boolean coordenador) {
		this.matricula = matricula;
		this.senha = senha;
		this.nome = nome;
		this.titulacao = titulacao;
		this.coordenador = coordenador;
		this.id_professor=getIdProximo();		
	}
	
	private static int idProximo=0;
    private static int getIdProximo() {
        return idProximo++;
    }
}
