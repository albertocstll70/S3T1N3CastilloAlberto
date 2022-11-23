package s3t1n3exercici1.ordenes;

import s3t1n3exercici1.parking.Veiculo;

public class Arrancar implements IOrden {
	
	private Veiculo veiculo;

	public Arrancar(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	@Override
	public void ejecutar() {
		this.veiculo.arrancar();
		
	}

	@Override
	public String nombre() {
		
		return "Arrancando";
	}

}
