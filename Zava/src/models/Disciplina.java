package models;

public class Disciplina {
	private int id_disciplina;
	private String nome;
	private int numCreditos;
	
	public Disciplina(String nome, int numCreditos) {
		this.nome = nome;
		this.numCreditos = numCreditos;
		this.id_disciplina =getIdProximo();
	}
	
	private static int idProximo=0;
    private static int getIdProximo() {
        return idProximo++;
    }
}
