package aula5;

public class Main {

	public static void main(String[] args) {
		ContaBanco conta1 = new ContaBanco(); 
		
		conta1.setNumConta(1111); 
		conta1.setDono("Ronaldinho Gaucho");
		conta1.abrirConta("cc");
		conta1.depositar(150000);
		conta1.sacar(100000);
		conta1.pagarMensal();
		
		conta1.statusAtual();
	}

}
