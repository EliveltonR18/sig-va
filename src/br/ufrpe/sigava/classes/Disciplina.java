package br_ufrpe_sigava;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class Disciplina {

	private String nome;
	private Pessoa professor;
	private ArrayList alunos = new ArrayList();
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private DayOfWeek diaAula;
	private int cargaHoraria;

	public Disciplina(String nome, LocalDate dataInicio, LocalDate dataFim, DayOfWeek diaAula, int cargaHoraria) {
		this.setNome(nome);
		this.setDataInicio(dataInicio);
		this.setDataFim(dataFim);
		this.setDiaAula(diaAula);
		this.setCargaHoraria(cargaHoraria);
	}

	public String getNome() {
		return nome;
	}

	public Pessoa getProfessor() {
		return professor;
	}

	public ArrayList getAlunos() {
		return alunos;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public DayOfWeek getDiaAula() {
		return diaAula;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setProfessor(Pessoa professor) {
		this.professor = professor;
	}

	public void setAlunos(ArrayList alunos) {
		this.alunos = alunos;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

	public void setDiaAula(DayOfWeek diaAula) {
		this.diaAula = diaAula;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public boolean adicionarAluno(Pessoa aluno) {
		boolean retorno = false;
		if (aluno != null) {
			this.alunos.add(aluno);
			retorno = true;
		}
		return retorno;
	}

	public boolean adicionarProfessor(Pessoa professor) {
		boolean retorno = false;
		if (professor != null) {
			this.professor = professor;
			retorno = true;
		}
		return retorno;
	}

	@Override
	public String toString() {
		return "Nome da Disciplina: " + nome + "" + "\nProfessor:" + professor + "Início da disciplina: " + dataInicio
				+ "\nData termino da disciplina: " + dataFim + "\nDia que ocorre a aula:" + diaAula
				+ "\nCarga Horária: " + cargaHoraria + "\nAlunos: " + alunos;
	}

	public boolean equals(Disciplina obj) {
		boolean retorno = false;
		if (obj.getAlunos() != null && obj.getDataFim() != null && obj.getDataInicio() != null
				&& obj.getDiaAula() != null && obj.getNome() != null && obj.getProfessor() != null) {
			if (this.getAlunos() != null && this.getDataFim() != null && this.getDataInicio() != null
					&& this.getDiaAula() != null && this.getNome() != null && this.getProfessor() != null) {

				if (this.getNome().equals(obj.getNome()) && this.getAlunos().equals(obj.getAlunos())
						&& this.getCargaHoraria() == obj.getCargaHoraria() && this.getDataFim().equals(obj.getDataFim())
						&& this.getDataInicio().equals(obj.getDataInicio())
						&& this.getProfessor().equals(obj.getProfessor())
						&& this.getDiaAula().equals(obj.getDiaAula())) {
					retorno = true;

				}

			}

		}

		return retorno;
	}

}
