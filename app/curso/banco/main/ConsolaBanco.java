package app.curso.banco.main;

import java.util.HashMap;
import java.util.Scanner;

import app.curso.banco.entidad.Cliente;
import app.curso.banco.entidad.Gestor;


public class ConsolaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, Cliente > listaCliente = new HashMap <> ();
		HashMap<Integer, Gestor> listaGestor = new HashMap <> ();	
		int menuSeleccionado = -1;
		Scanner menuSeleccionado = new Scanner(System.in);
		
		do {
			System.out.println("1. Insertar Cliente");
			System.out.println("2. Insertar Gestor");
			
			System.out.print("Opción: ");
			
			

			menuSeleccionado = keyboard.nextInt();

			switch (menuSeleccionado) {
			case 0:
				System.out.println("Saliendo...");
				break;
			case 1:
				System.out.println("1. Insertar Cliente");
				
				break;
			case 2:
				System.out.println("2. Insertar Gestor");
				break;
			}
			
		} while (menuSeleccionado != 0);
	}

}
