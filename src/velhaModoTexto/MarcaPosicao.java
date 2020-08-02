package velhaModoTexto;

//Como a matriz é controlada por marcações, decidi criar uma classe para abstrair isso.
public class MarcaPosicao {
	int x; // Representa a posicao da linha
	int y; // Representa a posicao da coluna
	int marca; // Representa a marca que vai ser utilizada no tabuleiro
	
	//realiza a marcação na posição indicada
	public MarcaPosicao(int x, int y, int marca) {
		super();
		this.x = x;
		this.y = y;
		this.marca = marca;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getMarca() {
		return marca;
	}

	public void setMarca(int marca) {
		this.marca = marca;
	}

}
