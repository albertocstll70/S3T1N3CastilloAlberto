package s3t1n3exercici1.parking;

public class Avion extends Veiculo {

	public Avion(String tipo) {
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
