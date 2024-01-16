package aula6;

public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;

	public ControleRemoto() {
		this.volume = 25;
		this.ligado = false;
		this.tocando = false;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean getTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {

		if (this.getLigado()) {
			System.out.println("\n\n------ MENU ------");
			System.out.println("A TV esta ligada: " + this.getLigado());
			System.out.println("A TV esta tocando: " + this.getTocando());
			System.out.print("Volume: " + this.getVolume());
			for (int i = 0; i <= this.getVolume(); i += 10) {
				System.out.print(" |");
			}
		} else {
			System.out.println("A TV esta desligada");
		}
	}

	@Override
	public void fecharMenu() {
		if (this.getLigado()) {
			System.out.println("Fechando menu!");
		}else {
			System.out.println("A TV esta desligada");
		}
	}

	@Override
	public void maisVolume() {
		if (this.getLigado()) {
			this.setVolume(getVolume() + 1);
		} else {
			System.out.println("Impossivel a TV está desligada!");
		}
	}

	public void menosVolume() {
		if (this.getLigado()) {
			this.setVolume(getVolume() - 1);
		} else {
			System.out.println("Impossivel a TV está desligada!");
		}
	}

	@Override
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		} else {
			System.out.println("Impossivel a TV está desligada!");
		}
	}

	@Override
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(25);
		} else {
			System.out.println("Impossivel a TV está desligada!");
		}
	}

	@Override
	public void play() {
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		} else {
			System.out.println("Impossivel a TV está desligada!");
		}

	}

	@Override
	public void pause() {
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		} else {
			System.out.println("Impossivel a TV está desligada!");
		}
	}

}
