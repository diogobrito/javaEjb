package br.com.fiap;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface Carrinho {

	void cadastrarItem(Item item);

	List<Item> obterItens();

	int obterQuantidadeItens();

	void adicionarEmail(int matricula, String email);
}
