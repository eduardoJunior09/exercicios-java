package aula5;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	
	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	// funções de ações da conta
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "cc") {
			this.setSaldo(50);
		} else if (t == "cp") {
			this.setSaldo(150);
		}

		System.out.println("Conta criada com sucesso!");

	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro!");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta em debito!");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!"); 
			
		}
	}

	public void depositar(float v) {
		if (this.isStatus()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Deposito realizado com sucesso!"); 
			
		}else {
			System.out.println("Impossivel depositar em uma conta fechada!"); 
		}
	}

	public void sacar(float v) {
		if (this.isStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado!");
			} else {
				System.out.println("Saldo insuficiente!");
			}
		}else {
			System.out.println("Impossivel realizar saque em uma conta fechada!"); 
		}
	}

	public void pagarMensal() {
		int v = 0; 
		if (this.getTipo() == "cc") {
			v = 12; 
		}else if(this.getTipo() == "cp") {
			v = 20;
		}
		
		if(this.isStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono()); 
		}else {
			System.out.println("Impossivel pagar uma conta fechada!");
		}
	}
	
	public void statusAtual() {
		System.out.println("Dados da conta: ");		
		System.out.println("- Conta: " + this.getNumConta());
		System.out.println("- Dono: " + this.getDono());
		System.out.println("- Tipo: " + this.getTipo());
		System.out.println("- Saldo: " + this.getSaldo());
	}
}
