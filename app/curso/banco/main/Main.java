package app.curso.banco.main;

import app.curso.banco.entidad.Cliente;
import app.curso.banco.entidad.Gestor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente c1 = new Cliente (1,"Paco", "(+34) 77 66 222", 0.0f);
		
		//c1.mostrarInfo();
		
		System.out.println( );
		
		//c1.ingresarDinero(20);
		
		//c1.retirarDinero(20);
		
		//c1.mostrarInfo();
		
		// CREAR GESTOR CON IDOFICINA
		
		
		Gestor g1 = new Gestor(24,"Anna","(+34) 777 222 333", 3);
		//g1.mostrarInfo();
		
		Gestor g2 = new Gestor(29,"Paca","(+34) 787 232 383", 4);
		
		//Obtener todos los gestores
		
		getGestores;
		
		//Actualizar gestor g2
		
		
		do {
			System.out.println("1. Actualizar nombre");
			System.out.println("2. Insertar id");
			System.out.println("3. Actualizar teléfono");
			System.out.print("Opción: ");
			
			
			menuSeleccionado = sc.nextInt();

			switch (menuSeleccionado) {
			case 0:
				System.out.println("Saliendo...");
				break;
			case 1:
				System.out.println("Insertado un cliente");
				break;
			case 2:
				System.out.println("Insertado un gestor");
				break;
			}
			
		} while (menuSeleccionado != 0);
		
		g2.setNombre("Cansalmas");
		
		//Borrar gestor
		g2=null;
		
		g2.mostrarInfo();
		}
		
	}


