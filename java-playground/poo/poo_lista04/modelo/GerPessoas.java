package br.com.fatec.modelo;

import java.util.List;

public class GerPessoas extends Inputs {

	public int descobreIndex(List<Pessoa> pessoas, String nome) {

		for (int k = 0; k < pessoas.size(); k++) {
			if (pessoas.get(k).getNome().equals(nome)) {
				return k;
			}
		}
		return -1;
	}

	public void atualizarCadastro(List<Pessoa> pessoas, String nome) {

		int index = descobreIndex(pessoas, nome);

		if (pessoas.get(index) instanceof Aluno) {

			int saida = 0;
			do {
				System.out.print("Digite 1: Corrigir o nome do Aluno\n"
						+ "Digite 2: Atualizar numero de telefone do Aluno\n" + "Digite 3: Atualizar e-mail do Aluno\n"
						+ "Digite 4: Atualizar RA\n" + "Digite 5: Confirmar e Sair\n" + "Digite a operacao desejada: ");

				switch ( pegaOpcao() ) {
				case "1": {
					System.out.println("Digite um novo Nome para " + ((Aluno) pessoas.get(index)).getNome());
					((Aluno) pessoas.get(index)).setNome(pegaNome());
					System.out.println("Contato modificado com sucesso!!!");
					break;
				}
				case "2": {
					System.out.println("Digite um novo Telefone para " + ((Aluno) pessoas.get(index)).getNome());
					((Aluno) pessoas.get(index)).setTelefone(pegaTelefone());
					System.out.println("Contato modificado com sucesso!!!");
					break;
				}
				case "3": {
					System.out.println("Digite o novo email para " + ((Aluno) pessoas.get(index)).getNome());
					((Aluno) pessoas.get(index)).setTelefone(pegaEmail());
					System.out.println("Contato modificado com sucesso!!!");
					break;
				}

				case "4": {
					System.out.println(
							"Digite Registro Academico para " + ((Aluno) pessoas.get(index)).getNumeroMatricula());
					((Aluno) pessoas.get(index)).setTelefone(pegaEmail());
					System.out.println("Contato modificado com sucesso!!!");
					break;
				}

				case "5": {
					saida = 1;
					break;
				}

				default: {
					System.out.println("Insira um valor valido!!!");
					break;
				}
				}
			} while (saida != 1);
		}

		else if (pessoas.get(index) instanceof Professor) {

			int saida = 0;

			do {
				System.out.print(
						"Digite 1: Corrigir o nome do Professor\n" + "Digite 2: Atualizar numero de telefone do Aluno\n"
								+ "Digite 3: Atualizar e-mail do Aluno\n" + "Digite 4: Atualizar Registro\n"
								+ "Digite 5: Confirmar e Sair\n" + "Digite a operacao desejada: ");

				switch (pegaOpcao()) {
					case "1": {
						System.out.println("Digite um novo Nome para " + ((Professor) pessoas.get(index)).getNome());
						((Professor) pessoas.get(index)).setNome(pegaNome());
						System.out.println("Contato modificado com sucesso!!!");
						break;
					}
					case "2": {
						System.out.println("Digite um novo Telefone para " + ((Professor) pessoas.get(index)).getNome());
						((Professor) pessoas.get(index)).setTelefone(pegaTelefone());
						System.out.println("Contato modificado com sucesso!!!");
						break;
					}
					case "3": {
						System.out.println("Digite o novo email para " + ((Professor) pessoas.get(index)).getNome());
						((Professor) pessoas.get(index)).setEmail(pegaEmail());
						System.out.println("Contato modificado com sucesso!!!");
						break;
					}
	
					case "4": {
						System.out.println("Digite Novo Registro para " + ((Professor) pessoas.get(index)).getNome());
						((Professor) pessoas.get(index)).setNumeroRegistro(pegaEmail());
						System.out.println("Contato modificado com sucesso!!!");
						break;
					}
	
					case "5": {
						saida = 1;
						break;
					}
	
					default: {
						System.out.println("Insira um valor valido!!!");
						break;
					}
				}
			} while (saida != 1);
		}
	}
}