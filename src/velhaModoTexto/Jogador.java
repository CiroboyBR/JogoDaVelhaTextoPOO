package velhaModoTexto;

import java.util.Scanner;

public class Jogador {
	protected Scanner teclado;
	protected MarcaPosicao marca;

	Jogador() {// O Construtor inicia o scaner no teclado e define o X como sendo a marca do
				// jogador humano
		teclado = new Scanner(System.in);
		marca = new MarcaPosicao(0, 0, 1);

	}

	// L� as posi��es e efetua a jogada no tabuleiro
	public void joga(Tabuleiro t) {
		Boolean jogou = false;

		do {
			System.out.println("Digite uma coordenada vazia para realizar a proxima jogada (EX: 1 1): ");
			marca.setX(teclado.nextInt() - 1);
			marca.setY(teclado.nextInt() - 1);

			if (t.getPosicao(marca.getX(), marca.getY()) == 0) {// Verifica se � um local vazio
				t.preenchePosicao(marca); // realiza a marca��o
				jogou = true; // Sinaliza que jogou para poder sair do loop
			}
		} while (jogou == false); // Repete se a posi��o indicada n�o for uma posi��o vazia

	}

	public MarcaPosicao getMarca() {
		return marca;
	}

	public void setMarca(MarcaPosicao marca) {
		this.marca = marca;
	}

}
