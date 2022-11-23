package s3t1n3exercici1.parking;

public abstract class   Veiculo {

	private String tipo;

	public Veiculo(String tipo) {
		this.setTipo(tipo);
	}
	
	public abstract void frenar();
	public abstract void arrancar();
	public abstract void acelerar();

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
