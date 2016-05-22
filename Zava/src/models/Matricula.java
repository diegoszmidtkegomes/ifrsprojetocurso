package models;

public class Matricula {
	private int id_matricula;
	private Estudante estudante;
	private Turma turma;
	private boolean liberada = false;
	
	public Matricula(Estudante estudante, Turma turma, boolean liberada) {
		this.estudante = estudante;
		this.turma = turma;
		this.liberada = liberada;
		this.id_matricula = getIdProximo();		
	}
	
	private static int idProximo=0;
    private static int getIdProximo() {
        return idProximo++;
    }
}
