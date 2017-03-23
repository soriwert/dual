package interfaz;

public class ClaseB implements Interfaz1 {
	private String nombre;
	
	public ClaseB(){
		nombre="Juan";
	}
	
	public String imprimeNombre(){
		return nombre;
	}
}
