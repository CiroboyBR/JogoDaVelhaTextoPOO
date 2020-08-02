package velhaModoTexto;

//Dificuldade 03: O Computador procura por jogadas quase prontas nas colunas e diagonais, se achar alguma ele completa a coluna/diagonal e ganha o jogo. Se não achar, ele procura um espaço vazio e simplesmente joga.
public class ComputadorDificil implements Computador {
	protected MarcaPosicao marca;

	public ComputadorDificil() {
		super();
		marca = new MarcaPosicao(0, 0, 2);
		// TODO Auto-generated constructor stub
	}

	// Verifica as colunas e diagonais e se houver 02 marcações já feitas, o
	// computadorDificil joga para ganhar o jogo completando as três.
	// Se não houver ele joga semelhante a um computadorFacil
	public void joga(Tabuleiro t) {
		Boolean jogou = false; //Inicializa a flag para garantir apenas 1 jogada

		// Verifica as colunas e se houver 02 marcações joga para ganhar o jogo
		// completando as três
		if ((t.getPosicao(0, 0) == 2 && t.getPosicao(1, 0) == 2) && t.getPosicao(2, 0) == 0) { // coluna 0
			marca.x = 2;
			marca.y = 0;
			t.preenchePosicao(marca);
			jogou = true;
		} else if ((t.getPosicao(0, 0) == 2 && t.getPosicao(2, 0) == 2) && t.getPosicao(1, 0) == 0) {// coluna 0
			marca.x = 1;
			marca.y = 0;
			t.preenchePosicao(marca);
			jogou = true;
		} else if ((t.getPosicao(1, 1) == 2 && t.getPosicao(2, 1) == 2) && t.getPosicao(0, 1) == 0) {// coluna 0
			marca.x = 0;
			marca.y = 1;
			t.preenchePosicao(marca);
			jogou = true;
		}
		if ((t.getPosicao(0, 1) == 2 && t.getPosicao(1, 1) == 2) && t.getPosicao(2, 1) == 0) { // coluna 1
			marca.x = 2;
			marca.y = 1;
			t.preenchePosicao(marca);
			jogou = true;
		} else if ((t.getPosicao(0, 1) == 2 && t.getPosicao(2, 1) == 2) && t.getPosicao(1, 1) == 0) {// coluna 1
			marca.x = 1;
			marca.y = 1;
			t.preenchePosicao(marca);
			jogou = true;
		} else if ((t.getPosicao(1, 0) == 2 && t.getPosicao(2, 0) == 2) && t.getPosicao(0, 1) == 0) {// coluna 1
			marca.x = 0;
			marca.y = 1;
			t.preenchePosicao(marca);
			jogou = true;
		}
		if ((t.getPosicao(0, 2) == 2 && t.getPosicao(1, 2) == 2) && t.getPosicao(2, 2) == 0) { // coluna 2
			marca.x = 2;
			marca.y = 2;
			t.preenchePosicao(marca);
			jogou = true;
		} else if ((t.getPosicao(0, 2) == 2 && t.getPosicao(2, 2) == 2) && t.getPosicao(1, 2) == 0) {// coluna 2
			marca.x = 1;
			marca.y = 2;
			t.preenchePosicao(marca);
			jogou = true;
		} else if ((t.getPosicao(1, 2) == 2 && t.getPosicao(2, 2) == 2) && t.getPosicao(0, 2) == 0) {// coluna 2
			marca.x = 0;
			marca.y = 2;
			t.preenchePosicao(marca);
			jogou = true;
		}
		if ((t.getPosicao(0, 0) == 2 && t.getPosicao(1, 1) == 2) && t.getPosicao(2, 2) == 0) { // Diagonal principal
			marca.x = 2;
			marca.y = 2;
			t.preenchePosicao(marca);
			jogou = true;
		} else if ((t.getPosicao(0, 0) == 2 && t.getPosicao(2, 2) == 2) && t.getPosicao(1, 1) == 0) {// Diagonal principal
			marca.x = 1;
			marca.y = 1;
			t.preenchePosicao(marca);
			jogou = true;
		} else if ((t.getPosicao(1, 1) == 2 && t.getPosicao(2, 2) == 2) && t.getPosicao(0, 0) == 0) {// Diagonal principal
			marca.x = 0;
			marca.y = 0;
			t.preenchePosicao(marca);
			jogou = true;
		}
		if ((t.getPosicao(0, 2) == 2 && t.getPosicao(1, 1) == 2) && t.getPosicao(2, 0) == 0) { // Diagonal paralela
			marca.x = 2;
			marca.y = 0;
			t.preenchePosicao(marca);
			jogou = true;
		} else if ((t.getPosicao(0, 2) == 2 && t.getPosicao(2, 0) == 2) && t.getPosicao(1, 1) == 0) {// Diagonal paralela
			marca.x = 1;
			marca.y = 1;
			t.preenchePosicao(marca);
			jogou = true;
		} else if ((t.getPosicao(1, 1) == 2 && t.getPosicao(2, 0) == 2) && t.getPosicao(0, 2) == 0) {// Diagonal paralela
			marca.x = 0;
			marca.y = 2;
			t.preenchePosicao(marca);
			jogou = true;
		} else {// Se não tem jogo pra vencer, joga utilizando a estrategia facil que consiste
				// em escolher o primeiro espaço em branco disponível
			for (int i = 0; i < 3; i++)
				if (jogou == false)// Se não efetuou uma jogada entra no loop e realiza a mesma
					for (int j = 0; j < 3; j++)
						if (t.getPosicao(i, j) == 0) {
							marca.x = i;
							marca.y = j;
							t.preenchePosicao(marca);
							jogou = true;
							break;
						}
		}

	}

}
