package exercicio01;

import java.util.List;

public class GerProdutos {

	public static int descobreIndex(List<Produto> produtos, String nome) {

		for (int k = 0; k < produtos.size(); k++) {
			if (produtos.get(k).getNome().equals(nome)) {
				return k;
			}
		}
		return -1;
	}

	public static void atualizaProduto(List<Produto> produtos, String nome) {

		int index = descobreIndex(produtos, nome);

		int saida = 0;
		do {
			System.out.print("Digite 1: Corrigir o nome do Produto\n" + "Digite 2: Atualizar quantidade\n"
					+ "Digite 3: Confirmar e Sair\n");

			switch (new Inputs().pegaOpcao()) {
			case "1": {
				System.out.println("Digite um novo Nome para " + produtos.get(index).getNome());
				produtos.get(index).setNome(new Inputs().pegaNome());
				System.out.println("Produto modificado com sucesso!!!");
				break;
			}
			case "2": {
				System.out.println("Digite a quantidade certa para " + produtos.get(index).getQuantidade());
				produtos.get(index).setQuantidade(new Inputs().pegaQuantidade());
				System.out.println("Quantidade modificada com sucesso!!!");
				break;
			}
			case "3": {
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
