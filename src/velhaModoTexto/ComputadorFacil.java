package velhaModoTexto;

//Dificuldade 01: O Computador procura um espaço vazio e simplesmente joga.
public class ComputadorFacil implements Computador {
	protected MarcaPosicao marca;

	public ComputadorFacil() {
		super();
		marca = new MarcaPosicao(0, 0, 2);
		// TODO Auto-generated constructor stub
	}

	public void joga(Tabuleiro t) {

		Boolean jogou = false; //Inicializa a flag para garantir apenas 1 jogada
		
		// Estrategia facil que consiste em escolher o primeiro espaço em branco
		// disponível
		for (int i = 0; i < 3; i++)
			if (jogou == false)
				for (int j = 0; j < 3; j++)
					if (t.getPosicao(i, j) == 0) {
						// print para fins de debug
						// System.out.println("Joga Facil: " + i + " " + j);
						marca.x = i;
						marca.y = j;
						t.preenchePosicao(marca);
						jogou = true;
						break;
					}

	}
}
