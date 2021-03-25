package br.ucsal.poo20202.domain;

public class Enfermeiras extends Funcionarios {

	private int numeroCOREM;
	private String Atuacao;
	private int cargaHoraria;

	public Enfermeiras(String matricula, String nome, Integer anoDeEntrada, Double salario, int numeroCOREM,
			String atuacao, int cargaHoraria) {
		super(matricula, nome, anoDeEntrada, salario);
		this.numeroCOREM = numeroCOREM;
		Atuacao = atuacao;
		this.cargaHoraria = cargaHoraria;
	}

	public int getNumeroInscricaoCOREM() {
		return numeroCOREM;
	}

	public void setNumeroInscricaoCOREM(int numeroInscricaoCOREM) {
		this.numeroCOREM = numeroInscricaoCOREM;
	}

	public String getTipoAtuacao() {
		return Atuacao;
	}

	public void setTipoAtuacao(String tipoAtuacao) {
		this.Atuacao = tipoAtuacao;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Numero Inscrio COREM: " + numeroCOREM + ", tipo de atuao: " + Atuacao + ", Carga horaria: "
				+ cargaHoraria + ", Matricula : " + getMatricula() + ", Nome: " + getNome() + ", Ano de admisso: "
				+ getAnoDeAdmissao() + ", Salario R$ " + getSalario() ;
	}
}
