package br.ucsal.poo20202;

import java.util.Scanner;

import br.ucsal.poo20202.domain.Enfermeiras;
import br.ucsal.poo20202.domain.Medico;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Instanciando Enfermeiras:");
		System.out.println("Insira os dados do funionário: ");
		System.out.println(
				"Digite na ordem: \nMatricula: \nNome: \nAno de entrada: \nSalario: \nNumero do COREN: \nEspecialização \nCargaHoraria:");
		String matricula = sc.next();
		System.out.println();

		String nome = sc.next();
		System.out.println();

		Integer anoDeEntrada = sc.nextInt();

		Double salario = sc.nextDouble();

		int numeroCOREM = sc.nextInt();

		String atuacao = sc.next();

		int cargaHoraria = sc.nextInt();

		Enfermeiras enf = new Enfermeiras(matricula, nome, anoDeEntrada, salario, numeroCOREM, atuacao, cargaHoraria);
		System.out.println(enf);

		System.out.println("Instanciando Medico");
		System.out.println("Insira os dados do funionário: ");
		System.out.println(
				"Digite na ordem: \nMatricula: \nNome: \nAno de entrada: \nSalario: \nNumero do CRM: \nEspecialidades");

		matricula = sc.next();

		nome = sc.next();

		anoDeEntrada = sc.nextInt();

		salario = sc.nextDouble();

		int numeroCRM = sc.nextInt();

		String especialidades = sc.next();

		Medico med = new Medico(matricula, nome, anoDeEntrada, salario, numeroCRM, especialidades);
		System.out.println(med);
	}
}
