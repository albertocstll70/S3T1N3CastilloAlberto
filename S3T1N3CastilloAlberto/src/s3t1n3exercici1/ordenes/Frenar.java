package s3t1n3exercici1.ordenes;

import s3t1n3exercici1.parking.Veiculo;

public class Frenar implements IOrden {
	private Veiculo veiculo;

	public Frenar(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	@Override
	public void ejecutar() {
		this.veiculo.frenar();
		
	}

	@Override
	public String nombre() {
		
		return "Frenar";
	}

}
