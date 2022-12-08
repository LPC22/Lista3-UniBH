public class Programa {
	public static void main(String args[]) {
		
		Lista lista_produtos = new Lista(10);
		
		Produto produto1 = new Produto("Limao", "Limao Taiti", 10, 15);
		Produto produto2 = new Produto("Iphone", "Iphone 5s", 1, 3000);
		Produto produto3 = new Produto("Cd", "Cd Manonas assinas", 1, 30);
		Produto produto4 = new Produto("Brocolis", "Brocolis Premium", 2, 3);
		Produto produto5 = new Produto("Cerveja", "Cerveja Choop", 5, 50);
		Produto produto6 = new Produto("Sorvete", "Sorvete pote", 3, 75);
		Produto produto7 = new Produto("Caderno", "Caderno 300 folhas", 2, 60);
		Produto produto8 = new Produto("Lápis", "Lápis Premium", 2, 7);
		Produto produto9 = new Produto("Caneta", "Caneta Azul", 10, 3);
		Produto produto10 = new Produto("Estojo", "Estojo de lápis", 1, 33);
		
		lista_produtos.Inserir(produto1);
		lista_produtos.Inserir(produto2);
		lista_produtos.Inserir(produto3);
		lista_produtos.Inserir(produto4);
		lista_produtos.Inserir(produto5);
		lista_produtos.Inserir(produto6);
		lista_produtos.Inserir(produto7);
		lista_produtos.Inserir(produto8);
		lista_produtos.Inserir(produto9);
		lista_produtos.Inserir(produto10);
		
		lista_produtos.Imprimir();
	}
}