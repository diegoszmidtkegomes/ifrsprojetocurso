package models;

public class Turma {
	private int id_turma;
	private String codigo;
	private String sala;
	private String horario;
	private Disciplina disciplina;
	private Professor professor;
	
	public Turma(String codigo, String sala, String horario, Disciplina disciplina, Professor professor) {
		this.codigo = codigo;
		this.sala = sala;
		this.horario = horario;
		this.disciplina = disciplina;
		this.professor = professor;
		this.id_turma = getIdProximo();
	}
	
	private static int idProximo=0;
    private static int getIdProximo() {
        return idProximo++;
    }
}
