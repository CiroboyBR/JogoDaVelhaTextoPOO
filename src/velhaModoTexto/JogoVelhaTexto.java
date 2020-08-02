//Jogo da Velha modo texto feito em Java utilizado os conceitos de Programação Orientada a Objetos
//Feito por: Ciro Martins Meneses
//RU: 2732171
//Descrição: O jogo possui 3 dificuldades. 
//Dificuldade 01: O Computador procura um espaço vazio e simplesmente joga.
//Dificuldade 02: O Computador procura por jogadas quase prontas nas colunas, se achar alguma ele completa a coluna e ganha o jogo. Se não achar, ele procura um espaço vazio e simplesmente joga.
//Dificuldade 03: O Computador procura por jogadas quase prontas nas colunas e diagonais, se achar alguma ele completa a coluna/diagonal e ganha o jogo. Se não achar, ele procura um espaço vazio e simplesmente joga.

package velhaModoTexto;

import java.util.Scanner;

public class JogoVelhaTexto {

	public static void main(String[] args) {

		Tabuleiro tabuleiro = new Tabuleiro();
		Jogador jogador = new Jogador();

		Scanner teclado = new Scanner(System.in);
		System.out.println("Jogo da velha por Ciro Meneses - RU: 2732171");
		System.out.println("Escolha a Dificuldade entre 1-3: ");
		int dificuldade = teclado.nextInt();

		// Cria os computadores
		Computador computador = null;
		ComputadorFacil compFacil = new ComputadorFacil();
		ComputadorMedio compMedio = new ComputadorMedio();
		ComputadorDificil compDificil = new ComputadorDificil();

		// Define qual computador irá jogar de acordo com a dificuldade escolhida
		if (dificuldade == 1)
			computador = compFacil;
		else if (dificuldade == 2)
			computador = compMedio;
		else if (dificuldade == 3)
			computador = compDificil;

		// Loop principal do jogo
		while (tabuleiro.situacao() == 0) {
			// Desenha Tabuleiro
			tabuleiro.imprime();

			// Jogador joga
			jogador.joga(tabuleiro);

			// Só joga após verificar se não houve ganhadores
			if (tabuleiro.checaSituacao() == 0)
				computador.joga(tabuleiro);
		}
	}

}