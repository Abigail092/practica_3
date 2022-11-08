package app.curso.banco.main;
import java.util.Scanner;
import java.util.HashMap;

import app.curso.banco.entidad.Cliente;
import app.curso.banco.entidad.Gestor;


public class ConsolaBanco {

	public static void main(String[] args) {
	

		HashMap<Integer, Cliente > listaCliente = new HashMap <> ();
		HashMap<Integer, Gestor> listaGestor = new HashMap <> ();	
		
		Scanner sc = new Scanner(System.in);
		int menuSeleccionado = -1;

		
		do {
			System.out.println("1. Insertar Cliente");
			System.out.println("2. Insertar Gestor");
			System.out.println("3. Salir");
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
	}

}
