package interfaz;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interfaz1 []lista = new Interfaz1[2];
		Interfaz1 miClaseA = new ClaseA();
		Interfaz1 miClaseB = new ClaseB();
		
		lista[0]=miClaseA;
		lista[1]=miClaseB;
		
		for (int i=0; i<2; i++){
			System.out.println(lista[i].imprimeNombre());
		}
		
		
	}

}
