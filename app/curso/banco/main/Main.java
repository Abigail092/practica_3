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
		
		// CREAR GESTOR CON idOFICINA
		
		
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
				
			case 18:
				System.out.println("Login clientes");
				System.out.println("Id del clientes");
				int idCliente = keyboard.nextInt();
				Cliente clienteParaLogin = clientes.get (idCliente);
				
				System.out.println("Usuario ");
				String usarname = keyboard.nextInt();
				
				System.out.println(" Contraseña ");
				Strign pass = keyboard.next();
				
				String passCliente = clienteParaLogin.getPassword();
				
				boolean tienePass = passCliente ! = null;
				
				boolean loginCorrecto = passCliente.equals(pass) && tienePass;
				
				if (loginCorrecto) {
					
					System.out.println ("Correcto");
				} else { 
					System.out.println ("Incorrecto");
				
				
			}
				
				break;
			
		  case 19:
			
			System.out.println("Id del cliente a registrar : ");
			int idARegistrar = keyboard.nextInt();
			Cliente Cliente ParaRegistro = clientes.get(idARegistrar);
			
			break;
				
			default:
				System.out.println("Opción desconocida");
				
				
			}
			
		} while (menuSeleccionado != 0);
		
		g2.setNombre("Cansalmas");
		
		//Borrar gestor
		g2=null;
		
		g2.mostrarInfo();
		}

}
