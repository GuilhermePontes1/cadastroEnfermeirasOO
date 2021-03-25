package br.ucsal.poo20202.domain;

public class Medico extends Funcionarios {

	private Integer numeroCRM;
	private String especialidades;

	

	public Medico(String matricula, String nome, Integer anoDeEntrada, Double salario, Integer numeroCRM,
			String especialidades) {
		super(matricula, nome, anoDeEntrada, salario);
		this.numeroCRM = numeroCRM;
		this.especialidades = especialidades;
	}

	public Integer getNumeroInscricaoCRM() {
		return numeroCRM;
	}

	public void setNumeroInscricaoCRM(Integer numeroInscricaoCRM) {
		this.numeroCRM = numeroInscricaoCRM;
	}

	public String getNomeEspecialidades() {
		return especialidades;
	}

	public void setNomeEspecialidades(String nomeEspecialidades) {
		this.especialidades = nomeEspecialidades;
	}

	@Override
	public String toString() {
		return "Medico numeroCRM " + numeroCRM + ", Especialidades: " + especialidades + ", Matricula:"
				+ getMatricula() + ", Nome:" + getNome() + ", AnoDeAdmissao: " + getAnoDeAdmissao()
				+ ", Salario:" + getSalario();
	}

}
