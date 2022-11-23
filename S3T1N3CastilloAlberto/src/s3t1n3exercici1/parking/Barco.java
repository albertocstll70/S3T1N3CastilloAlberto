package s3t1n3exercici1.parking;

public class Barco extends Veiculo {

	public Barco(String tipo) {
		super(tipo);
		}
	@Override
	public void frenar() {
	System.out.println(super.getTipo()+" -> Frenando");
		
	}

	@Override
	public void arrancar() {
		System.out.println(super.getTipo()+" -> Arrancando");
		
	}

	@Override
	public void acelerar() {
		System.out.println(super.getTipo()+" -> Acelerando");
		
	}
}
