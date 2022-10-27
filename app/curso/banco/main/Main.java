package app.curso.banco.main;

import app.curso.banco.entidad.Cliente;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente c1 = new Cliente (1,"Paco", "(+34) 77 66 222", 0.0f);
		
		c1.mostrarInfo();
		
		System.out.println( );
		
		c1.ingresarDinero(20);
		
		c1.retirarDinero(20);
		
		c1.mostrarInfo();
		
		// CREAR GESTOR CON IDOFICINA
		
		
		Gestor g1 =new Gestor (24,"Anna","(+34) 777 222 333", 3);
		g1.mostarInfo();
		
		
	}

}
