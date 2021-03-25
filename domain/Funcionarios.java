package br.ucsal.poo20202.domain;

public class Funcionarios {
	
		private String matricula;
		private String nome;
		private Integer anoDeEntrada;
		private Double salario;

		public Funcionarios(String matricula, String nome, Integer anoDeEntrada, Double salario) {
			this.matricula = matricula;
			this.nome = nome;
			this.anoDeEntrada = anoDeEntrada;
			this.salario = salario;
		}

		public String getMatricula() {
			return matricula;
		}

		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Integer getAnoDeAdmissao() {
			return anoDeEntrada;
		}

		public void setAnoDeAdmissao(Integer anoDeAdmissao) {
			this.anoDeEntrada = anoDeAdmissao;
		}

		public Double getSalario() {
			return salario;
		}

		public void setSalario(Double salario) {
			this.salario = salario;
		}
		
	}


