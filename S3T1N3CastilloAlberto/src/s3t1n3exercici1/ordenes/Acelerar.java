package s3t1n3exercici1.ordenes;

import s3t1n3exercici1.parking.Veiculo;

public class Acelerar  implements IOrden{
	private Veiculo veiculo;

	public Acelerar(Veiculo veiculo) {
		
		this.veiculo = veiculo;
	}

	@Override
	public void ejecutar() {
		this.veiculo.acelerar();
		
	}

	@Override
	public String nombre() {
		
		return "Acelerar";
	}
}
