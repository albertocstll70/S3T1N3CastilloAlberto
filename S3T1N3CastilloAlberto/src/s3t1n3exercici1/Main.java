package s3t1n3exercici1;

import s3t1n3exercici1.ordenes.Acelerar;
import s3t1n3exercici1.ordenes.Arrancar;
import s3t1n3exercici1.ordenes.Frenar;
import s3t1n3exercici1.parking.Avion;
import s3t1n3exercici1.parking.Barco;
import s3t1n3exercici1.parking.Bicicleta;
import s3t1n3exercici1.parking.Coche;
import s3t1n3exercici1.parking.Veiculo;

public class Main {

	public static void main(String[] args) {

		Veiculo v1 = new Avion("Avion");
		Veiculo v2 = new Barco("Barco");
		Veiculo v3 = new Coche("Coche");
		Veiculo v4 = new Bicicleta("Bicicleta");

		Frenar frenarAvion = new Frenar(v1);
		Acelerar acelerarAvion = new Acelerar(v1);
		Arrancar arrancarAvion = new Arrancar(v1);

		Frenar frenarBarco = new Frenar(v2);
		Acelerar acelerarBarco = new Acelerar(v2);
		Arrancar arrancarBarco = new Arrancar(v2);

		Frenar frenarCoche = new Frenar(v3);
		Acelerar acelerarCoche = new Acelerar(v3);
		Arrancar arrancarCoche = new Arrancar(v3);

		Frenar frenarBicicleta = new Frenar(v4);
		Acelerar acelerarBicicleta = new Acelerar(v4);
		Arrancar arrancarBicicleta = new Arrancar(v4);
		Invoker invocador = new Invoker();
		
		// avion
		invocador.add(frenarAvion);
		invocador.add(acelerarAvion);
		invocador.add(arrancarAvion);

		invocador.ejecutar(arrancarAvion.nombre());
		invocador.ejecutar(acelerarAvion.nombre());
		invocador.ejecutar(frenarAvion.nombre());

		// Barco
		invocador.add(frenarBarco);
		invocador.add(acelerarBarco);
		invocador.add(arrancarBarco);

		invocador.ejecutar(arrancarBarco.nombre());
		invocador.ejecutar(acelerarAvion.nombre());
		invocador.ejecutar(frenarAvion.nombre());

		// Coche
		invocador.add(frenarCoche);
		invocador.add(acelerarCoche);
		invocador.add(arrancarCoche);

		invocador.ejecutar(arrancarCoche.nombre());
		invocador.ejecutar(acelerarAvion.nombre());
		invocador.ejecutar(frenarAvion.nombre());

		// Bicicleta
		invocador.add(frenarBicicleta);
		invocador.add(acelerarBicicleta);
		invocador.add(arrancarBicicleta);

		invocador.ejecutar(arrancarBicicleta.nombre());
		invocador.ejecutar(acelerarBicicleta.nombre());
		invocador.ejecutar(frenarBicicleta.nombre());

	}

}
