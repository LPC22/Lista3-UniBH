
public class Lista {
	int primeiro = 0;

	int ultimo = 0;

	int matricula;

	private Produto[] Lista_Produtos;


	public Lista(int max) {
		Lista_Produtos = new Produto[max];
	}


	public boolean vazio() {
		return (this.primeiro == this.ultimo);
	}


	public void Inserir(Produto a1) {
		if (!vazio() && this.ultimo == this.Lista_Produtos.length) {
			System.out.println("Lista Cheia....Nao e permitido adicionar outro produto”");
		} 
		else {
			this.Lista_Produtos[this.ultimo] = a1;
			this.ultimo = this.ultimo + 1;
			System.out.println("Produto inserido com sucesso");
		}
	}
	
	public void Imprimir() {
		System.out.println("##### IMPRIMINDO LISTA #####");
		for(Produto item : Lista_Produtos) {
			System.out.println("Produto: " + item.getNome() + ", Descricao: " + item.getDescricao() + ", quantidade: " + item.getQuantidade() + ", Valor total: R$ "
					+ item.getValorTotal() + ";"); 
		}
	}
}
