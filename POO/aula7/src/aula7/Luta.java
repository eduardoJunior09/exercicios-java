package aula7;

import java.util.Random;

public class Luta {

	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	Random random = new Random();

	// Métodos
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && l1.getNome() != l2.getNome()) {
			this.aprovada = true;
			this.desafiante = l1;
			this.desafiado = l2;
			System.out.println("Luta Confirmada!\n" + l1.getNome() + " vs " + l2.getNome());
		} else {
			this.aprovada = false;
			this.desafiante = null;
			this.desafiado = null;
			System.out.println(
					"A luta não pode ser marcada, as condições informadas não satisfaz as regras da competição!");

		}
	}

	public void lutar() {
		if (this.aprovada) {
			this.desafiado.apresentar();
			this.desafiante.apresentar();
			int vencedor = random.nextInt(3);

			switch (vencedor) {
			case 0:
				System.out.println("Empatou");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1:
				System.out.println("Vencedor é: " + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2:
				System.out.println();
				System.out.println("Vencedor é: " + this.desafiante.getNome());
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();

				break;
			}
		} else {
			System.out.println("Luta não pode acontecer");
		}

	}
}
