package s3t1n3exercici1;

import java.util.HashMap;
import java.util.Map;

import s3t1n3exercici1.ordenes.IOrden;

public class Invoker {
	private Map<String, IOrden> ordenes;
	
	public Invoker() {
		this.ordenes = new HashMap<>();
	}
	
	public void add(IOrden orden) {
		this.ordenes.put(orden.nombre(),orden);
		
	}
	
	
	public void ejecutar (String clave) {
		this.ordenes.get(clave).ejecutar();	
		
	}
	
	

}
