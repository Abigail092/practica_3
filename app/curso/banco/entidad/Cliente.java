package app.curso.banco.entidad;

import java.util.HashMap;

public class Cliente extends Persona {

	private float totalDinero;
	// cada cuenta tiene una clave de tipo String
	// y una cantidad de dinero Float
    private HashMap<String, Float> cuentas;
    
	public Cliente() {

	}

	public Cliente(int id, String nombre, String telefono, float totalDinero) {
		super(id, nombre, telefono);
		this.totalDinero = totalDinero;

	}

	public float getTotalDinero() {
		return this.totalDinero;
	}

	public void setTotalDinero(float totalDinero) {
		this.totalDinero = totalDinero;
	}

	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Total dinero: " + this.totalDinero + " €");
	}

	// ingresar dinero

	public float ingresarDinero(float dinero) {
		// el return es lo que queda en la cuenta
		this.totalDinero += dinero;
		return this.totalDinero;
	}

	// retirar dinero

	public float retirarDinero(float dinero) {
		if (this.totalDinero - dinero >= 0) {
			this.totalDinero -= dinero;
		}
		return this.totalDinero;
	}
	
	public void abrirCuenta(String idCuenta, Float dinero){
		this.cuentas.put(idCuenta, dinero);
		ingresarDinero(dinero);
	}
	
	// Cerrar Cuenta
	
	public void cerrarCuenta(String idCuenta){
		Float dineroEnCuenta = this.cuentas.get(idCuenta);
		if (dineroEnCuenta != 0) {
		retirarDinero(dineroEnCuenta);
		this.cuentas.remove(idCuenta);
		}else {
			System.out.println("La cuenta no se puede borrar porque aún hay dinero");
		}
	}
	
	public float ingresarDinero(String idCuenta, Float dinero) {
		if (this.cuentas.get(idCuenta) != null) {
			this.cuentas.put(idCuenta, dinero);
			ingresarDinero(dinero);
		}else{
			System.out.println("La cuenta no existe");
		}
		return this.totalDinero;
	}
	
	// Retirar Dinero 
	public float retirarDinero(String idCuenta, Float dinero) {
		if ((this.cuentas.get(idCuenta) != null) || (this.cuentas.get(idCuenta) <= dinero))  {
			this.cuentas.put(idCuenta, this.cuentas.get(idCuenta) - dinero);
			retirarDinero(dinero);
		}else{
			System.out.println("La cuenta no existe");
		}
		return this.totalDinero;
		
		// se crea vacio
		
		Cliente cliente2 = new cliente (1,"Anna Martinez ", " 623 789 123 ");
		cliente2.setId(3);
		
		cliente.abrirCuenta ("ES123" , 789);
		
		cliente.abrirCuenta ("ES678", 30f);
		
	    cliente.mostrarInfo();
	    
	    cliente.retirarDinero("ES123, 20f");
	    
	    cliente.mostrarInfo();
	    
	    cliente.ingresarDinero("ES678", 200f);
	    
	    cliente.mostrarInfo();
	    
	    cliente.cerrarCuenta("ES123");
	    
	    
		HashMap<>
		
	}
	
	
	
}
